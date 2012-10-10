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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.sdk.operation.method.MethodOverrideOperation;
import org.eclipse.scout.sdk.operation.method.MethodUpdateContentOperation;
import org.eclipse.scout.sdk.operation.service.ServiceOperationNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
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

  private EList<LogicElement> m_logicElements;
  private IType m_logicSourceType;
  private SamlFormContext m_formContext;

  @Override
  public String getOperationName() {
    return "Fill business logic";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getLogicElements() == null) {
      throw new IllegalArgumentException("Child elements cannot be null.");
    }
    if (getSamlContext() == null || getSamlFormContext() == null) {
      throw new IllegalArgumentException("Context missing for logic wiring.");
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    for (LogicElement logicElement : getLogicElements()) {
      /* logic elements with name are just named snippets used at several places. nothing to do for them. they will be referred to from a non-named element later on */
      if (logicElement.getName() == null) {
        LogicInfo info = LogicInfoFactory.create(logicElement, getLogicSourceType(), getSamlFormContext());

        if (info.isClassLevel()) {
          fillClassLevelLogic(info.getTargetType(), info.getTargetLogic());
        }
        else {
          IMethod target = createTargetMethod(info);
          appendMethodLogic(target, info.getTargetLogic());

          if (TypeUtility.exists(info.getSourceType())) {
            IMethod source = createSourceMethod(info);
            appendMethodLogic(source, info.getSourceLogic());
          }
        }
      }
    }
  }

  private void appendMethodLogic(final IMethod method, final String logic) throws CoreException, IllegalArgumentException {
    final boolean visited = getSamlContext().isMethodChanged(method);
    MethodUpdateContentOperation op = new MethodUpdateContentOperation(method, null, false) {
      @Override
      protected String createMethodBody(String originalBody, IImportValidator validator) throws JavaModelException {
        if (visited) {
          // we already replaced the body: this time we must append
          String existing = method.getSource();
          int start = existing.indexOf('{');
          int end = existing.lastIndexOf('}');
          String body = existing.substring(start + 1, end);

          StringBuilder sb = new StringBuilder(existing.length() * 2);
          sb.append(body);
          sb.append(ResourceUtility.getLineSeparator(method.getCompilationUnit()));
          sb.append(ScoutUtility.cleanLineSeparator(logic, method.getCompilationUnit()));
          return sb.toString();
        }
        else {
          // first time: we must replace
          return ScoutUtility.cleanLineSeparator(logic, method.getCompilationUnit());
        }
      }
    };
    op.validate();
    op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    if (!visited) {
      // remember that we already replaced the content of this method
      getSamlContext().markMethodChanged(method);
    }
  }

  private void fillClassLevelLogic(IType target, String addSource) throws CoreException, IllegalArgumentException {
    ICompilationUnit cu = target.getCompilationUnit();
    String source = cu.getSource();

    int end = source.lastIndexOf('}');
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

  private IMethod createTargetMethod(LogicInfo info) throws CoreException, IllegalArgumentException {
    // always in a service class
    IMethod method = TypeUtility.getMethod(info.getTargetType(), info.getTargetMethodName());
    if (TypeUtility.exists(method)) {
      return method;
    }
    else {
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
  }

  private IMethod createSourceMethod(LogicInfo info) throws CoreException, IllegalArgumentException {
    IMethod method = TypeUtility.getMethod(info.getSourceType(), info.getSourceMethodName());
    if (TypeUtility.exists(method)) {
      return method;
    }
    else {
      MethodOverrideOperation op = new MethodOverrideOperation(info.getSourceType(), info.getSourceMethodName(), false);
      op.setSimpleBody("");
      op.validate();
      op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
      return op.getCreatedMethod();
    }
  }

  public IType getLogicSourceType() {
    return m_logicSourceType;
  }

  public void setLogicSourceType(IType formType) {
    m_logicSourceType = formType;
  }

  public EList<LogicElement> getLogicElements() {
    return m_logicElements;
  }

  public void setLogicElements(EList<LogicElement> logicElements) {
    m_logicElements = logicElements;
  }

  public SamlFormContext getSamlFormContext() {
    return m_formContext;
  }

  public void setSamlFormContext(SamlFormContext formContext) {
    m_formContext = formContext;
  }
}
