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
package org.eclipse.scout.sdk.saml.importer.operation.util;

import java.util.HashSet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.scout.saml.saml.JavaRunAtAttributeList;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.LogicExecAttribute;
import org.eclipse.scout.saml.saml.LogicOptionalProperties;
import org.eclipse.scout.saml.saml.LogicTypeAttributeList;
import org.eclipse.scout.saml.saml.RunAtAttribute;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.operation.method.MethodOverrideOperation;
import org.eclipse.scout.sdk.operation.method.MethodUpdateContentOperation;
import org.eclipse.scout.sdk.operation.util.OrganizeImportOperation;
import org.eclipse.scout.sdk.util.log.ScoutStatus;
import org.eclipse.scout.sdk.util.resources.ResourceUtility;
import org.eclipse.scout.sdk.util.signature.IImportValidator;
import org.eclipse.scout.sdk.util.type.TypeComparators;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlLogicFillOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 25.09.2012
 */
public class SamlLogicFillOperation implements IOperation {

  private static final String FORM_HANDLER_MODIFY = "modify";
  private static final String FORM_HANDLER_NEW = "new";

  private EList<EObject> m_childElements;
  private IType m_serverType;
  private IType m_clientType;

  private static class MethodDefinition {
    private IType declaringType;
    private String name;
    private String[] parameterTypeSignatures;

    private MethodDefinition(IType declaringType, String name, String[] parameterTypeSignatures) {
      this.declaringType = declaringType;
      this.name = name;
      this.parameterTypeSignatures = parameterTypeSignatures;
    }
  }

  @Override
  public String getOperationName() {
    return "Fill business logic";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getChildElements() == null) {
      throw new IllegalArgumentException("Child elements cannot be null.");
    }
    if (getChildElements().size() < 1) {
      throw new IllegalArgumentException("No child elements could be found.");
    }
    if (!TypeUtility.exists(getServerType())) {
      throw new IllegalArgumentException("Server type cannot be null.");
    }
    if (!TypeUtility.exists(getClientType())) {
      throw new IllegalArgumentException("Client type cannot be null.");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    HashSet<ICompilationUnit> changedUnits = new HashSet<ICompilationUnit>();
    for (EObject o : getChildElements()) {
      if (o instanceof LogicElement) {
        LogicElement logicElement = (LogicElement) o;
        IType targetType = getTargetType(logicElement);
        String source = getSource(logicElement);
        changedUnits.add(targetType.getCompilationUnit());

        if (isClassLevelLogic(logicElement)) {
          fillClassLevelLogic(monitor, workingCopyManager, targetType, source);
        }
        else {
          MethodDefinition m = getMethodDefinition(targetType, logicElement);
          fillMethodLogic(monitor, workingCopyManager, m, source);
        }
      }
    }

    for (ICompilationUnit cu : changedUnits) {
      OrganizeImportOperation o = new OrganizeImportOperation(cu);
      o.validate();
      o.run(monitor, workingCopyManager);
    }
  }

  private void fillMethodLogic(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, MethodDefinition method, final String source) throws CoreException, IllegalArgumentException {
    IMethod m = TypeUtility.getMethod(method.declaringType, method.name);
    if (TypeUtility.exists(m)) {
      MethodUpdateContentOperation op = new MethodUpdateContentOperation(m, null, false) {
        @Override
        protected String createMethodBody(String originalBody, IImportValidator validator) throws JavaModelException {
          return source;
        }
      };
      op.validate();
      op.run(monitor, workingCopyManager);
    }
    else {
      MethodOverrideOperation op = new MethodOverrideOperation(method.declaringType, method.name, false);
      op.setFormatSource(false);
      op.setSimpleBody(source);
    }
  }

  private void fillClassLevelLogic(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, IType target, String addSource) throws CoreException, IllegalArgumentException {
    ICompilationUnit cu = target.getCompilationUnit();
    String source = cu.getSource();

    int end = source.lastIndexOf('}');
    if (end > 0) {
      StringBuilder newSource = new StringBuilder(source.length() * 2);
      newSource.append(source.subSequence(0, end - 1));
      newSource.append(addSource);
      newSource.append(ResourceUtility.getLineSeparator(cu));
      newSource.append(source.substring(end));
      cu.getBuffer().setContents(newSource.toString());
    }
    else {
      throw new CoreException(new ScoutStatus("Entry point for global business logic not found in class: " + target.getFullyQualifiedName()));
    }
  }

  private MethodDefinition getMethodDefinition(IType targetType, LogicElement logicElement) {
    switch (logicElement.getType().getValue()) {
      case ALL: {
        return new MethodDefinition(targetType, "getDataByAll", new String[]{Signature.createTypeSignature(RuntimeClasses.LookupCall, true)});
      }
      case MODIFY_LOAD: {
        IType modifyHandler = getHandler(targetType, FORM_HANDLER_MODIFY);
        if (!TypeUtility.exists(modifyHandler)) {
          throw new IllegalArgumentException("modify handler could not be found.");
        }
        return new MethodDefinition(modifyHandler, "execLoad", new String[]{});
      }
      case MODIFY_STORE: {
        IType modifyHandler = getHandler(targetType, FORM_HANDLER_MODIFY);
        if (!TypeUtility.exists(modifyHandler)) {
          throw new IllegalArgumentException("modify handler could not be found.");
        }
        return new MethodDefinition(modifyHandler, "execStore", new String[]{});
      }
      case NEW_LOAD: {
        IType newHandler = getHandler(targetType, FORM_HANDLER_NEW);
        if (!TypeUtility.exists(newHandler)) {
          throw new IllegalArgumentException("new handler could not be found.");
        }
        return new MethodDefinition(newHandler, "execLoad", new String[]{});
      }
      case NEW_STORE: {
        IType newHandler = getHandler(targetType, FORM_HANDLER_NEW);
        if (!TypeUtility.exists(newHandler)) {
          throw new IllegalArgumentException("new handler could not be found.");
        }
        return new MethodDefinition(newHandler, "execStore", new String[]{});
      }
      case CHANGED: {
        return new MethodDefinition(targetType, "execChangedValue", new String[]{});
      }
      case CLICK: {
        return new MethodDefinition(targetType, "execAction", new String[]{});
      }
      case MASTER_CHANGED: {
        return new MethodDefinition(targetType, "execChangedMasterValue", new String[]{Signature.createTypeSignature(Object.class.getName(), true)});
      }
      case INIT: {
        return new MethodDefinition(targetType, "execInitField", new String[]{});
      }
      default: {
        throw new IllegalArgumentException("Unknown logic type: " + logicElement.getType().getValue());
      }
    }
  }

  private IType getHandler(IType declaringType, String handlerType) {
    IType[] handlers = TypeUtility.getInnerTypesOrdered(declaringType, TypeUtility.getType(RuntimeClasses.IFormHandler), TypeComparators.getTypeNameComparator());
    for (IType handler : handlers) {
      if (handler.getElementName().toLowerCase().startsWith(handlerType.toLowerCase())) {
        return handler;
      }
    }
    return null;
  }

  private static boolean isClassLevelLogic(LogicElement logicElement) {
    return logicElement.getType().getValue().equals(LogicTypeAttributeList.GLOBAL);
  }

  private static RunAtAttribute getRunAtAttribute(LogicElement logicElement) {
    for (LogicOptionalProperties prop : logicElement.getProperties()) {
      if (prop.getRunat() != null) {
        return prop.getRunat();
      }
    }
    return null;
  }

  private static String getSource(LogicElement logicElement) throws IllegalArgumentException {
    if (logicElement.getSource() != null) {
      return logicElement.getSource();
    }
    else {
      // referenced logic
      LogicExecAttribute exec = getExecAttribute(logicElement);
      if (exec == null) {
        throw new IllegalArgumentException("Linked java element for source code could not be found. ");
      }
      return exec.getValue().getSource();
    }
  }

  private static LogicExecAttribute getExecAttribute(LogicElement logicElement) {
    for (LogicOptionalProperties prop : logicElement.getProperties()) {
      if (prop.getExec() != null) {
        return prop.getExec();
      }
    }
    return null;
  }

  private IType getTargetType(LogicElement logicElement) {
    RunAtAttribute runat = getRunAtAttribute(logicElement);
    if (runat == null) {
      // not defined on logic element. may also be defined on java element
      LogicExecAttribute exec = getExecAttribute(logicElement);
      if (exec == null) {
        throw new IllegalArgumentException("Linked java element for source code could not be found. ");
      }
      runat = exec.getValue().getRunat();
    }

    if (runat.getValue().equals(JavaRunAtAttributeList.CLIENT)) {
      return getClientType();
    }
    else {
      return getServerType();
    }
  }

  public EList<EObject> getChildElements() {
    return m_childElements;
  }

  public void setChildElements(EList<EObject> childElements) {
    m_childElements = childElements;
  }

  public IType getServerType() {
    return m_serverType;
  }

  public void setServerType(IType serverType) {
    m_serverType = serverType;
  }

  public IType getClientType() {
    return m_clientType;
  }

  public void setClientType(IType clientType) {
    m_clientType = clientType;
  }
}
