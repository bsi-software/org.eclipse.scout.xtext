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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.sdk.operation.method.MethodOverrideOperation;
import org.eclipse.scout.sdk.operation.method.MethodUpdateContentOperation;
import org.eclipse.scout.sdk.operation.service.ServiceOperationNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.util.ScoutUtility;
import org.eclipse.scout.sdk.util.log.ScoutStatus;
import org.eclipse.scout.sdk.util.resources.ResourceUtility;
import org.eclipse.scout.sdk.util.signature.IImportValidator;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlLogicFillOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 25.09.2012
 */
public class SamlLogicFillOperation extends AbstractSamlElementImportOperation {

  private EList<EObject> m_childElements;

  private IType m_serverType;
  private IType m_clientType;
  private IType m_serverInterface;
  private IType m_clientInterface;
  private IType m_logicSourceType;
  private IType m_formType;
  private IType m_formDataType;

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
    for (EObject o : getChildElements()) {
      if (o instanceof LogicElement) {
        LogicElement logicElement = (LogicElement) o;
        LogicInfo info = LogicInfoFactory.create(logicElement, getFormDataType(), getFormType(), getLogicSourceType(), getServerType(), getServerInterface(), getClientType(), getClientInterface());

        if (info.isClassLevel()) {
          fillClassLevelLogic(monitor, workingCopyManager, info.getTargetType(), info.getTargetLogic());
        }
        else {
          IMethod target = createTargetMethod(monitor, workingCopyManager, info);
          appendMethodLogic(monitor, workingCopyManager, target, info.getTargetLogic());

          if (TypeUtility.exists(info.getSourceType())) {
            IMethod source = createSourceMethod(monitor, workingCopyManager, info);
            appendMethodLogic(monitor, workingCopyManager, source, info.getSourceLogic());
          }
        }
      }
    }
  }

  private void appendMethodLogic(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, final IMethod method, final String logic) throws CoreException, IllegalArgumentException {
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
    op.run(monitor, workingCopyManager);
    getSamlContext().rememberModifiedType(method.getDeclaringType());

    if (!visited) {
      // remember that we already replaced the content of this method
      getSamlContext().markMethodChanged(method);
    }
  }

  private void fillClassLevelLogic(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, IType target, String addSource) throws CoreException, IllegalArgumentException {
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
      getSamlContext().rememberModifiedType(target);
    }
    else {
      throw new CoreException(new ScoutStatus("Entry point for global business logic not found in class: " + target.getFullyQualifiedName()));
    }
  }

  private IMethod createTargetMethod(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, LogicInfo info) throws CoreException, IllegalArgumentException {
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
      sono.run(monitor, workingCopyManager);
      getSamlContext().rememberModifiedType(info.getTargetInterfaceType());
      getSamlContext().rememberModifiedType(info.getTargetType());
      return sono.getCreatedImplementationMethod();
    }
  }

  private IMethod createSourceMethod(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, LogicInfo info) throws CoreException, IllegalArgumentException {
    IMethod method = TypeUtility.getMethod(info.getSourceType(), info.getSourceMethodName());
    if (TypeUtility.exists(method)) {
      return method;
    }
    else {
      MethodOverrideOperation op = new MethodOverrideOperation(info.getSourceType(), info.getSourceMethodName(), false);
      op.setSimpleBody("");
      op.validate();
      op.run(monitor, workingCopyManager);
      getSamlContext().rememberModifiedType(info.getSourceType());
      return op.getCreatedMethod();
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

  public IType getLogicSourceType() {
    return m_logicSourceType;
  }

  public void setLogicSourceType(IType formType) {
    m_logicSourceType = formType;
  }

  public IType getServerInterface() {
    return m_serverInterface;
  }

  public void setServerInterface(IType serverInterface) {
    m_serverInterface = serverInterface;
  }

  public IType getClientInterface() {
    return m_clientInterface;
  }

  public void setClientInterface(IType clientInterface) {
    m_clientInterface = clientInterface;
  }

  public IType getFormType() {
    return m_formType;
  }

  public void setFormType(IType formType) {
    m_formType = formType;
  }

  public IType getFormDataType() {
    return m_formDataType;
  }

  public void setFormDataType(IType formDataType) {
    m_formDataType = formDataType;
  }
}
