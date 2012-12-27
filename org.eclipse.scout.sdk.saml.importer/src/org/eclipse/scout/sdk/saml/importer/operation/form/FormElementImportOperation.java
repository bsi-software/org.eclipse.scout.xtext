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
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.form.FormStackNewOperation;
import org.eclipse.scout.sdk.operation.service.ServiceDeleteOperation;
import org.eclipse.scout.sdk.operation.service.ServiceNewOperation;
import org.eclipse.scout.sdk.operation.util.JavaElementDeleteOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.fields.AbstractFormFieldElementOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.fields.container.AbstractBoxElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.key.KeyElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.logic.SamlLogicFillOperation;
import org.eclipse.scout.sdk.saml.importer.util.IItemVisitor;
import org.eclipse.scout.sdk.saml.importer.util.SamlImportUtility;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.internal.sigcache.SignatureCache;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.IScoutBundle;

/**
 * <h3>{@link FormElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class FormElementImportOperation extends AbstractUiElementImportOperation {

  private final static String CLIENT_FORM_SERVICE_SUFFIX = "ClientService";
  private final static String SERVER_FORM_SERVICE_SUFFIX = SdkProperties.SUFFIX_SERVICE;

  private FormElement m_formElement;

  private IType m_createdServerServiceImplementation;
  private IType m_createdServerServiceInterface;

  private IType m_createdClientServiceImplementation;
  private IType m_createdClientServiceInterface;

  private IType m_createdForm;
  private IType m_createdFormData;
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
  public void run() throws CoreException, IllegalArgumentException {
    deleteExistingForm();

    createFormStack();

    // apply form attributes
    applyModalAttribute(getFormElement().getModal(), getCreatedForm());
    applySubtitleAttribute(getFormElement().getSubtitle(), getCreatedForm());
    AbstractBoxElementImportOperation.applyColumnsAttribute(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager(), getFormElement().getColumns(), getCreatedMainBox(), null);

    createFormContext();

    // apply logic
    SamlLogicFillOperation.fillAllLogic(getFormElement().getLogic(), m_formContext, getCreatedForm());

    // apply key strokes
    KeyElementImportOperation.processKeyStrokes(getFormElement().getKeyStrokes(), getCreatedMainBox(), m_formContext);

    // create child form fields recursive
    AbstractFormFieldElementOperation.dispatchFieldElements(getFormElement().getFields(), getSamlContext(), m_formContext);

    // post processing
    postProcessForm();
  }

  private void postProcessForm() throws CoreException, IllegalArgumentException {
    postProcessType(getCreatedClientServiceImplementation());
    postProcessType(getCreatedClientServiceInterface());

    postProcessType(getCreatedServerServiceImplementation());
    postProcessType(getCreatedServerServiceInterface());

    postProcessType(getCreatedForm());
    postProcessType(getCreatedFormData());
  }

  private void createFormContext() {
    m_formContext = new SamlFormContext();
    m_formContext.setClientType(getCreatedClientServiceImplementation());
    m_formContext.setClientInterface(getCreatedClientServiceInterface());
    m_formContext.setServerType(getCreatedServerServiceImplementation());
    m_formContext.setServerInterface(getCreatedServerServiceInterface());
    m_formContext.setFormDataType(getCreatedFormData());
    m_formContext.setFormType(getCreatedForm());
    m_formContext.setSamlContext(getSamlContext());
    m_formContext.pushParentBox(getCreatedMainBox());
  }

  private boolean hasOneOfLogicEvents(final String[] logicEvents) {
    LogicElement handler = SamlImportUtility.findFirst(getFormElement().getLogic(), new IItemVisitor<LogicElement>() {
      @Override
      public boolean visit(LogicElement t) {
        for (String handlerType : logicEvents) {
          if (t.getEvent() != null && t.getEvent().equals(handlerType)) {
            return true;
          }
        }
        return false;
      }
    });
    return handler != null;
  }

  private void createFormStack() throws CoreException {
    String formName = getFormElement().getName();

    FormStackNewOperation op = new FormStackNewOperation(false);
    if (getFormElement().getTitle() != null) {
      String nlsKey = getFormElement().getTitle().getName();
      op.setNlsEntry(getNlsEntry(nlsKey));
    }
    op.setCreateButtonOk(true);
    op.setCreateButtonCancel(true);

    boolean createModifyHandler = hasOneOfLogicEvents(new String[]{
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getModify_loadKeyword_1().getValue(),
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getModify_storeKeyword_2().getValue()
    });

    op.setCreateModifyHandler(createModifyHandler);
    op.setCreateNewHandler(!createModifyHandler || hasOneOfLogicEvents(new String[]{
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getNew_loadKeyword_3().getValue(),
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getNew_storeKeyword_4().getValue()
    }));

    op.setFormBundle(getCurrentScoutModule().getClientBundle());
    op.setFormPackage(getCurrentScoutModule().getClientBundle().getDefaultPackage(IScoutBundle.CLIENT_FORMS));

    op.setFormDataBundle(getCurrentScoutModule().getSharedBundle());
    op.setFormDataPackage(getCurrentScoutModule().getSharedBundle().getDefaultPackage(IScoutBundle.SHARED_SERVICES));

    op.setClientServiceRegistryBundles(new IScoutBundle[]{getCurrentScoutModule().getClientBundle()});

    op.setPermissionCreateBundle(null);
    op.setPermissionCreateName(null);
    op.setPermissionReadBundle(null);
    op.setPermissionReadName(null);
    op.setPermissionUpdateBundle(null);
    op.setPermissionUpdateName(null);

    op.setServerServiceRegistryBundles(new IScoutBundle[]{getCurrentScoutModule().getServerBundle()});
    op.setServiceImplementationBundle(getCurrentScoutModule().getServerBundle());
    op.setServiceImplementationName(formName + SERVER_FORM_SERVICE_SUFFIX);
    op.setServiceImplementationPackage(getCurrentScoutModule().getServerBundle().getDefaultPackage(IScoutBundle.SERVER_SERVICES));

    op.setServiceInterfaceBundle(getCurrentScoutModule().getSharedBundle());
    op.setServiceInterfaceName("I" + formName + SERVER_FORM_SERVICE_SUFFIX);
    op.setServiceInterfacePackage(getCurrentScoutModule().getSharedBundle().getDefaultPackage(IScoutBundle.SHARED_SERVICES));

    String superType = RuntimeClasses.getSuperTypeName(RuntimeClasses.IForm, getSamlContext().getRootProject());
    if (getFormElement().getSuperType() != null) {
      superType = getFormElement().getSuperType().getDefinition();
    }
    op.setFormSuperTypeSignature(SignatureCache.createTypeSignature(superType));
    op.setFormName(formName + SdkProperties.SUFFIX_FORM);

    op.validate();
    op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    setCreatedServerServiceImplementation(op.getOutProcessService());
    setCreatedServerServiceInterface(op.getOutProcessServiceInterface());
    setCreatedMainBox(op.getOutMainBox());
    setCreatedForm(op.getOutForm());
    setCreatedFormData(getFormDataType(getFormElement().getName()));

    // client service
    ServiceNewOperation clientSvcOp = new ServiceNewOperation();
    clientSvcOp.setImplementationBundle(getCurrentScoutModule().getClientBundle());
    clientSvcOp.setServicePackageName(getCurrentScoutModule().getClientBundle().getDefaultPackage(IScoutBundle.CLIENT_SERVICES));
    clientSvcOp.setServiceName(formName + CLIENT_FORM_SERVICE_SUFFIX);
    clientSvcOp.setServiceSuperTypeSignature(RuntimeClasses.getSuperTypeSignature(RuntimeClasses.IService2, getSamlContext().getRootProject()));

    clientSvcOp.setInterfaceBundle(getCurrentScoutModule().getClientBundle());
    clientSvcOp.setServiceInterfacePackageName(getCurrentScoutModule().getClientBundle().getDefaultPackage(IScoutBundle.CLIENT_SERVICES));
    clientSvcOp.setServiceInterfaceName("I" + formName + CLIENT_FORM_SERVICE_SUFFIX);
    clientSvcOp.setServiceInterfaceSuperTypeSignature(SignatureCache.createTypeSignature(RuntimeClasses.IService2));
    clientSvcOp.addServiceRegistrationBundle(getCurrentScoutModule().getClientBundle());

    clientSvcOp.validate();
    clientSvcOp.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    setCreatedClientServiceImplementation(clientSvcOp.getCreatedServiceImplementation());
    setCreatedClientServiceInterface(clientSvcOp.getCreatedServiceInterface());
  }

  private IType getFormDataType(String formName) {
    return TypeUtility.getType(getCurrentScoutModule().getSharedBundle().getDefaultPackage(IScoutBundle.SHARED_SERVICES) + "." + formName + SdkProperties.SUFFIX_FORM_DATA);
  }

  private void deleteExistingForm() throws CoreException {
    String formName = getFormElement().getName();

    //IType formData = getFormDataType(formName);
    IType form = TypeUtility.getType(getCurrentScoutModule().getClientBundle().getDefaultPackage(IScoutBundle.CLIENT_FORMS) + "." + formName + SdkProperties.SUFFIX_FORM);

    IType serverService = TypeUtility.getType(getCurrentScoutModule().getServerBundle().getDefaultPackage(IScoutBundle.SERVER_SERVICES) + "." + formName + SERVER_FORM_SERVICE_SUFFIX);
    IType serverSvcInterface = TypeUtility.getType(getCurrentScoutModule().getSharedBundle().getDefaultPackage(IScoutBundle.SHARED_SERVICES) + ".I" + formName + SERVER_FORM_SERVICE_SUFFIX);

    IType clientService = TypeUtility.getType(getCurrentScoutModule().getClientBundle().getDefaultPackage(IScoutBundle.CLIENT_SERVICES) + "." + formName + CLIENT_FORM_SERVICE_SUFFIX);
    IType clientSvcInterface = TypeUtility.getType(getCurrentScoutModule().getClientBundle().getDefaultPackage(IScoutBundle.CLIENT_SERVICES) + ".I" + formName + CLIENT_FORM_SERVICE_SUFFIX);

    ArrayList<IType> formArtifacts = new ArrayList<IType>(2);
    if (TypeUtility.exists(form)) {
      formArtifacts.add(form);
    }
    //if (TypeUtility.exists(formData)) {
    //  formArtifacts.add(formData);
    //}
    if (formArtifacts.size() > 0) {
      JavaElementDeleteOperation jedo = new JavaElementDeleteOperation();
      jedo.setMembers(formArtifacts.toArray(new IType[formArtifacts.size()]));
      jedo.validate();
      jedo.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    }

    if (TypeUtility.exists(serverService) || TypeUtility.exists(serverSvcInterface)) {
      ServiceDeleteOperation sdo = new ServiceDeleteOperation();
      sdo.setServiceImplementation(serverService);
      sdo.setServiceInterface(serverSvcInterface);
      sdo.validate();
      sdo.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    }

    if (TypeUtility.exists(clientService) || TypeUtility.exists(clientSvcInterface)) {
      ServiceDeleteOperation sdo = new ServiceDeleteOperation();
      sdo.setServiceImplementation(clientService);
      sdo.setServiceInterface(clientSvcInterface);
      sdo.validate();
      sdo.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    }
  }

  private void applyModalAttribute(String a, IType form) throws CoreException, IllegalArgumentException {
    if ("false".equals(a)) {
      overrideMethod(form, null, "getConfiguredModal", "return false;");
    }
  }

  private void applySubtitleAttribute(TranslationElement a, IType field) throws CoreException, IllegalArgumentException {
    if (a != null) {
      overrideMethod(field, null, "getConfiguredSubTitle", getNlsReturnClause(a));
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

  public IType getCreatedFormData() {
    return m_createdFormData;
  }

  private void setCreatedFormData(IType createdFormData) {
    m_createdFormData = createdFormData;
  }
}
