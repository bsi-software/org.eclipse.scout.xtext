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
package org.eclipse.scout.sdk.saml.importer.operation.form;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.Signature;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.form.FormStackNewOperation;
import org.eclipse.scout.sdk.operation.service.ServiceDeleteOperation;
import org.eclipse.scout.sdk.operation.service.ServiceNewOperation;
import org.eclipse.scout.sdk.operation.util.JavaElementDeleteOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.fields.AbstractSamlFormFieldElementOperation;
import org.eclipse.scout.sdk.saml.importer.operation.logic.SamlLogicFillOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;
import org.eclipse.scout.sdk.workspace.IScoutBundle;

/**
 * <h3>{@link FormElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class FormElementImportOperation extends AbstractSamlElementImportOperation {

  private final static String CLIENT_FORM_SERVICE_SUFFIX = "ClientService";

  private FormElement m_formElement;

  private IType m_createdServerServiceImplementation;
  private IType m_createdServerServiceInterface;

  private IType m_createdClientServiceImplementation;
  private IType m_createdClientServiceInterface;

  private IType m_createdForm;
  private IType m_createdMainBox;

  private SamlFormContext m_formContext;

  @Override
  public String getOperationName() {
    return "Create Form & corresponding services";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getFormElement() == null) {
      throw new IllegalArgumentException("FormElement cannot be null.");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {

    deleteExistingForm(monitor, workingCopyManager);

    createFormStack(monitor, workingCopyManager);

    createFormContext();

    fillFormLogic(monitor, workingCopyManager);

    processChildren(monitor, workingCopyManager);
  }

  private void createFormContext() {
    m_formContext = new SamlFormContext();
    m_formContext.setClientType(getCreatedClientServiceImplementation());
    m_formContext.setClientInterface(getCreatedClientServiceInterface());
    m_formContext.setServerType(getCreatedServerServiceImplementation());
    m_formContext.setServerInterface(getCreatedServerServiceInterface());
    m_formContext.setFormDataType(getFormDataType(getFormElement().getName()));
    m_formContext.setFormType(getCreatedForm());
    m_formContext.setSamlContext(getSamlContext());
    m_formContext.pushParentBox(getCreatedMainBox());
  }

  private void processChildren(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException {
    for (FormFieldElement o : getFormElement().getFields()) {
      AbstractSamlFormFieldElementOperation.dispatchFieldElements(monitor, workingCopyManager, o, getSamlContext(), m_formContext);
    }
  }

  private void createFormStack(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException {
    String formName = getFormElement().getName();
    String nlsKey = getFormElement().getText().getName();

    FormStackNewOperation op = new FormStackNewOperation(false);
    op.setFormatSource(false);
    op.setNlsEntry(getNlsEntry(nlsKey));
    op.setCreateButtonOk(true);
    op.setCreateButtonCancel(true);

    // TODO: only the handlers that have logic
    // TODO: modal?
    // TODO: columns
    op.setCreateModifyHandler(true);
    op.setCreateNewHandler(true);

    op.setFormBundle(getCurrentScoutModule().getClientBundle());
    op.setFormDataBundle(getCurrentScoutModule().getSharedBundle());

    op.setClientServiceRegistryBundles(new IScoutBundle[]{getCurrentScoutModule().getClientBundle()});

    op.setPermissionCreateBundle(null);
    op.setPermissionCreateName(null);
    op.setPermissionReadBundle(null);
    op.setPermissionReadName(null);
    op.setPermissionUpdateBundle(null);
    op.setPermissionUpdateName(null);

    op.setServerServiceRegistryBundles(new IScoutBundle[]{getCurrentScoutModule().getServerBundle()});
    op.setServiceImplementationBundle(getCurrentScoutModule().getServerBundle());
    op.setServiceImplementationName(formName + SdkProperties.SUFFIX_PROCESS_SERVICE);

    op.setServiceInterfaceBundle(getCurrentScoutModule().getSharedBundle());
    op.setServiceInterfaceName("I" + formName + SdkProperties.SUFFIX_PROCESS_SERVICE);

    op.setFormSuperTypeSignature(Signature.createTypeSignature(RuntimeClasses.AbstractForm, true));
    op.setFormName(formName + SdkProperties.SUFFIX_FORM);

    op.validate();
    op.run(monitor, workingCopyManager);

    setCreatedServerServiceImplementation(op.getOutProcessService());
    getSamlContext().rememberModifiedType(op.getOutProcessService());
    setCreatedServerServiceInterface(op.getOutProcessServiceInterface());
    getSamlContext().rememberModifiedType(op.getOutProcessServiceInterface());
    setCreatedMainBox(op.getOutMainBox());
    setCreatedForm(op.getOutForm());
    getSamlContext().rememberModifiedType(op.getOutForm());
    getSamlContext().rememberModifiedType(getFormDataType(getFormElement().getName()));

    // client service
    ServiceNewOperation clientSvcOp = new ServiceNewOperation();
    clientSvcOp.setImplementationBundle(getCurrentScoutModule().getClientBundle());
    clientSvcOp.setServicePackageName(getCurrentScoutModule().getClientBundle().getPackageName(IScoutBundle.CLIENT_PACKAGE_APPENDIX_SERVICES));
    clientSvcOp.setServiceName(formName + CLIENT_FORM_SERVICE_SUFFIX);
    clientSvcOp.setServiceSuperTypeSignature(Signature.createTypeSignature(RuntimeClasses.AbstractService, true));

    clientSvcOp.setInterfaceBundle(getCurrentScoutModule().getClientBundle());
    clientSvcOp.setServiceInterfacePackageName(getCurrentScoutModule().getClientBundle().getPackageName(IScoutBundle.CLIENT_PACKAGE_APPENDIX_SERVICES));
    clientSvcOp.setServiceInterfaceName("I" + formName + CLIENT_FORM_SERVICE_SUFFIX);
    clientSvcOp.setServiceInterfaceSuperTypeSignature(Signature.createTypeSignature(RuntimeClasses.IService2, true));
    clientSvcOp.addServiceRegistrationBundle(getCurrentScoutModule().getClientBundle());

    clientSvcOp.validate();
    clientSvcOp.run(monitor, workingCopyManager);

    setCreatedClientServiceImplementation(clientSvcOp.getCreatedServiceImplementation());
    getSamlContext().rememberModifiedType(clientSvcOp.getCreatedServiceImplementation());
    setCreatedClientServiceInterface(clientSvcOp.getCreatedServiceInterface());
    getSamlContext().rememberModifiedType(clientSvcOp.getCreatedServiceInterface());
  }

  private void fillFormLogic(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException {
    SamlLogicFillOperation slfo = new SamlLogicFillOperation();

    slfo.setLogicSourceType(getCreatedForm());
    slfo.setSamlContext(getSamlContext());
    slfo.setSamlFormContext(m_formContext);
    slfo.setLogicElements(getFormElement().getLogic());

    slfo.validate();
    slfo.run(monitor, workingCopyManager);
  }

  private IType getFormDataType(String formName) {
    return TypeUtility.getType(getCurrentScoutModule().getSharedBundle().getPackageName(IScoutBundle.SHARED_PACKAGE_APPENDIX_SERVICES_PROCESS) + "." + formName + SdkProperties.SUFFIX_FORM_DATA);
  }

  private void deleteExistingForm(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException {
    String formName = getFormElement().getName();

    IType formData = getFormDataType(formName);
    IType form = TypeUtility.getType(getCurrentScoutModule().getClientBundle().getPackageName(IScoutBundle.CLIENT_PACKAGE_APPENDIX_UI_FORMS) + "." + formName + SdkProperties.SUFFIX_FORM);

    IType serverService = TypeUtility.getType(getCurrentScoutModule().getServerBundle().getPackageName(IScoutBundle.SERVER_PACKAGE_APPENDIX_SERVICES_PROCESS) + "." + formName + SdkProperties.SUFFIX_PROCESS_SERVICE);
    IType serverSvcInterface = TypeUtility.getType(getCurrentScoutModule().getSharedBundle().getPackageName(IScoutBundle.SHARED_PACKAGE_APPENDIX_SERVICES_PROCESS) + ".I" + formName + SdkProperties.SUFFIX_PROCESS_SERVICE);

    IType clientService = TypeUtility.getType(getCurrentScoutModule().getClientBundle().getPackageName(IScoutBundle.CLIENT_PACKAGE_APPENDIX_SERVICES) + "." + formName + CLIENT_FORM_SERVICE_SUFFIX);
    IType clientSvcInterface = TypeUtility.getType(getCurrentScoutModule().getClientBundle().getPackageName(IScoutBundle.CLIENT_PACKAGE_APPENDIX_SERVICES) + ".I" + formName + CLIENT_FORM_SERVICE_SUFFIX);

    ArrayList<IType> formArtifacts = new ArrayList<IType>(2);
    if (TypeUtility.exists(form)) {
      formArtifacts.add(form);
    }
    if (TypeUtility.exists(formData)) {
      formArtifacts.add(formData);
    }
    if (formArtifacts.size() > 0) {
      JavaElementDeleteOperation jedo = new JavaElementDeleteOperation();
      jedo.setMembers(formArtifacts.toArray(new IType[formArtifacts.size()]));
      jedo.validate();
      jedo.run(monitor, workingCopyManager);
    }

    if (TypeUtility.exists(serverService) || TypeUtility.exists(serverSvcInterface)) {
      ServiceDeleteOperation sdo = new ServiceDeleteOperation();
      sdo.setServiceImplementation(serverService);
      sdo.setServiceInterface(serverSvcInterface);
      sdo.validate();
      sdo.run(monitor, workingCopyManager);
    }

    if (TypeUtility.exists(clientService) || TypeUtility.exists(clientSvcInterface)) {
      ServiceDeleteOperation sdo = new ServiceDeleteOperation();
      sdo.setServiceImplementation(clientService);
      sdo.setServiceInterface(clientSvcInterface);
      sdo.validate();
      sdo.run(monitor, workingCopyManager);
    }
  }

  public FormElement getFormElement() {
    return m_formElement;
  }

  public void setFormElement(FormElement formElement) {
    m_formElement = formElement;
  }

  public IType getCreatedServerServiceImplementation() {
    return m_createdServerServiceImplementation;
  }

  private void setCreatedServerServiceImplementation(IType createdServerServiceImplementation) {
    m_createdServerServiceImplementation = createdServerServiceImplementation;
  }

  public IType getCreatedClientServiceImplementation() {
    return m_createdClientServiceImplementation;
  }

  private void setCreatedClientServiceImplementation(IType createdClientServiceImplementation) {
    m_createdClientServiceImplementation = createdClientServiceImplementation;
  }

  public IType getCreatedForm() {
    return m_createdForm;
  }

  private void setCreatedForm(IType createdForm) {
    m_createdForm = createdForm;
  }

  public IType getCreatedServerServiceInterface() {
    return m_createdServerServiceInterface;
  }

  private void setCreatedServerServiceInterface(IType createdServerServiceInterface) {
    m_createdServerServiceInterface = createdServerServiceInterface;
  }

  public IType getCreatedClientServiceInterface() {
    return m_createdClientServiceInterface;
  }

  private void setCreatedClientServiceInterface(IType createdClientServiceInterface) {
    m_createdClientServiceInterface = createdClientServiceInterface;
  }

  public IType getCreatedMainBox() {
    return m_createdMainBox;
  }

  private void setCreatedMainBox(IType createdMainBox) {
    m_createdMainBox = createdMainBox;
  }
}
