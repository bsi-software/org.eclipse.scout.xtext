/*******************************************************************************
 * Copyright (c) 2010 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.sdk.saml.importer.operation.logic;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.scout.sdk.operation.method.MethodOverrideOperation;
import org.eclipse.scout.sdk.operation.method.MethodUpdateContentOperation;
import org.eclipse.scout.sdk.operation.service.ServiceOperationNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.util.ScoutUtility;
import org.eclipse.scout.sdk.util.log.ScoutStatus;
import org.eclipse.scout.sdk.util.resources.ResourceUtility;
import org.eclipse.scout.sdk.util.signature.IImportValidator;
import org.eclipse.scout.sdk.util.type.TypeUtility;

/**
 * <h3>{@link SamlLogicFillOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 25.09.2012
 */
public class SamlLogicFillOperation extends AbstractSamlElementImportOperation {

  private LogicSnippetInfo[] m_logicInfos;

  @Override
  public void validate() throws IllegalArgumentException {
    if (getLogicInfos() == null || getLogicInfos().length < 1) {
      throw new IllegalArgumentException("No logic infos found.");
    }
    if (getSamlContext() == null) {
      throw new IllegalArgumentException("Context missing for logic wiring.");
    }
  }

  private void collectTargetInfos(LogicSnippetInfo i, HashMap<IType, P_TargetLogicComposite> map) {
    if (TypeUtility.exists(i.getTargetType())) {
      P_TargetLogicComposite comp = map.get(i.getTargetType());
      if (comp == null) {
        comp = new P_TargetLogicComposite(i);
        map.put(i.getTargetType(), comp);
      }
      comp.sb.append(i.getTargetLogic());
    }
  }

  private void collectSourceInfos(LogicSnippetInfo i, HashMap<IType, StringBuilder> map) {
    if (TypeUtility.exists(i.getSourceType())) {
      StringBuilder sb = map.get(i.getTargetType());
      if (sb == null) {
        sb = new StringBuilder(i.getSourceLogic());
        map.put(i.getTargetType(), sb);
      }
      else if (i.getTargetType() == i.getSourceType()) {
        // inline: always add because there is no call to a service which has the logic collected
        sb.append(i.getSourceLogic());
      }
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    // at this place all logics have the same event and there exists at least one logic element!

    LinkedHashMap<IType /* target type */, P_TargetLogicComposite> classLevelSources = new LinkedHashMap<IType, P_TargetLogicComposite>();
    LinkedHashMap<IType /* target type */, P_TargetLogicComposite> targetMethodSources = new LinkedHashMap<IType, P_TargetLogicComposite>();
    LinkedHashMap<IType /* target type */, StringBuilder> sourceMethodSources = new LinkedHashMap<IType, StringBuilder>();
    LogicSnippetInfo sourceLogicInfo = null;

    for (LogicSnippetInfo i : getLogicInfos()) {
      if (i.isClassLevel()) {
        collectTargetInfos(i, classLevelSources);
      }
      else {
        collectTargetInfos(i, targetMethodSources);
        collectSourceInfos(i, sourceMethodSources);
        if (TypeUtility.exists(i.getSourceType())) {
          sourceLogicInfo = i;
        }
      }
    }

    // CLASS LEVEL: INSERT COLLECTED SOURCE
    for (P_TargetLogicComposite e : classLevelSources.values()) {
      fillClassLevelLogic(e.li.getTargetType(), e.sb.toString());
    }

    // TARGET METHODS: CREATE AND INSERT COLLECTED SOURCE
    for (P_TargetLogicComposite e : targetMethodSources.values()) {
      if (TypeUtility.exists(e.li.getTargetInterfaceType())) { // inline events have no interface and there is no need to create a target method
        IMethod targetMethod = createTargetMethod(e.li);
        String source = e.sb.toString();
        setMethodContent(targetMethod, source);
      }
    }

    // SOURCE METHOD: call to all target methods collected
    if (sourceLogicInfo != null) { /* class level logic has no source method */
      IMethod sourceMethod = createSourceMethod(sourceLogicInfo);
      StringBuilder sourceLogic = new StringBuilder();
      boolean isForeignCallPresent = isForeignCallPresent();
      if (isForeignCallPresent) {
        sourceLogic.append("new ClientSyncJob(\"execute event\", ClientSession.get(), true) { @Override protected void runVoid(IProgressMonitor monitor) throws Throwable {");
      }
      for (StringBuilder src : sourceMethodSources.values()) {
        sourceLogic.append(src);
      }
      if (isForeignCallPresent) {
        sourceLogic.append("} }.schedule();");
      }
      setMethodContent(sourceMethod, sourceLogic.toString());
    }
  }

  private boolean isForeignCallPresent() {
    for (LogicSnippetInfo i : getLogicInfos()) {
      if (i.getSourceType() != i.getTargetType()) {
        return true;
      }
    }
    return false;
  }

  private void setMethodContent(final IMethod method, final String logic) throws CoreException, IllegalArgumentException {
    MethodUpdateContentOperation op = new MethodUpdateContentOperation(method, null, false) {
      @Override
      protected String createMethodBody(String originalBody, IImportValidator validator) throws JavaModelException {
        return ScoutUtility.cleanLineSeparator(logic, method.getCompilationUnit());
      }
    };
    op.validate();
    op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
  }

  private void fillClassLevelLogic(IType target, String addSource) throws CoreException, IllegalArgumentException {
    ICompilationUnit cu = target.getCompilationUnit();

    // define import defaults for simple class names
    cu.createImport(List.class.getName(), null, getSamlContext().getMonitor());
    cu.createImport(Date.class.getName(), null, getSamlContext().getMonitor());

    ISourceRange sourceRange = target.getSourceRange();
    int typeEndPos = sourceRange.getOffset() + sourceRange.getLength();
    String source = cu.getSource();
    String sourceUpToType = source.substring(0, typeEndPos);

    int end = sourceUpToType.lastIndexOf('}');
    if (end > 0) {
      StringBuilder newSource = new StringBuilder(source.length() * 2);
      newSource.append(source.subSequence(0, end));
      newSource.append(ScoutUtility.cleanLineSeparator(addSource, cu));
      newSource.append(ResourceUtility.getLineSeparator(cu));
      newSource.append(source.substring(end));
      cu.getBuffer().setContents(newSource.toString());
    }
    else {
      throw new CoreException(new ScoutStatus("Entry point for global business logic not found in class: " + target.getFullyQualifiedName()));
    }
  }

  private IMethod createTargetMethod(LogicSnippetInfo info) throws CoreException, IllegalArgumentException {
    // always in a service class
    IMethod method = TypeUtility.getMethod(info.getTargetType(), info.getTargetMethodName());
    if (TypeUtility.exists(method)) {
      // method already exists: reuse
      return method;
    }
    else if (info.getReturnType() != null) {
      // new service operation: complete method must be known (e.g. the return type)
      ServiceOperationNewOperation sono = new ServiceOperationNewOperation();
      sono.setMethodName(info.getTargetMethodName());
      sono.setServiceImplementations(new IType[]{info.getTargetType()});
      sono.setReturnType(info.getReturnType());
      sono.setArguments(info.getParameters());
      sono.setServiceInterface(info.getTargetInterfaceType());
      sono.validate();
      sono.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
      return sono.getCreatedImplementationMethod();
    }
    else {
      // method must be overridden
      MethodOverrideOperation moo = new MethodOverrideOperation(info.getTargetType(), info.getTargetMethodName(), false);
      moo.setSimpleBody("");
      moo.setSuperTypeHierarchy(getSamlContext().getSuperTypeHierarchy(info.getTargetType()));
      moo.validate();
      moo.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
      return moo.getCreatedMethod();
    }
  }

  private IMethod createSourceMethod(LogicSnippetInfo info) throws CoreException, IllegalArgumentException {
    if (info.getSourceMethod() != null && info.getSourceMethod().isImplemented()) {
      return info.getSourceMethod().peekMethod();
    }
    else {
      MethodOverrideOperation op = new MethodOverrideOperation(info.getSourceType(), info.getSourceMethod().getMethodName(), false);
      op.setSimpleBody("");
      op.validate();
      op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
      return op.getCreatedMethod();
    }
  }

  protected LogicSnippetInfo[] getLogicInfos() {
    return m_logicInfos;
  }

  public void setEventLogics(EventLogicsInfo eventLogic) throws CoreException {
    m_logicInfos = LogicSnippetInfoFactory.create(eventLogic, getSamlContext());
  }

  private static class P_TargetLogicComposite {
    private final StringBuilder sb;
    private final LogicSnippetInfo li;

    private P_TargetLogicComposite(LogicSnippetInfo i) {
      sb = new StringBuilder();
      li = i;
    }
  }
}
