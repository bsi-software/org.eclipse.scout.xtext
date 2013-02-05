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
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.form.FormStackNewOperation;
import org.eclipse.scout.sdk.operation.service.ServiceDeleteOperation;
import org.eclipse.scout.sdk.operation.service.ServiceNewOperation;
import org.eclipse.scout.sdk.operation.util.JavaElementDeleteOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
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
public class FormElementImportOperation extends AbstractSamlElementImportOperation {

  public final static int EVENT_OBJECT_TYPE_SERVER_SERVICE = 3;
  public final static int EVENT_OBJECT_TYPE_SERVER_INTERFACE = 4;
  public final static int EVENT_OBJECT_TYPE_CLIENT_SERVICE = 5;
  public final static int EVENT_OBJECT_TYPE_CLIENT_INTERFACE = 6;
  public final static int EVENT_OBJECT_TYPE_FORM = 7;
  public final static int EVENT_OBJECT_TYPE_FORM_DATA = 8;
  public final static int EVENT_OBJECT_TYPE_MAIN_BOX = 9;

  private final static String CLIENT_FORM_SERVICE_SUFFIX = "ClientService";
  private final static String SERVER_FORM_SERVICE_SUFFIX = SdkProperties.SUFFIX_SERVICE;

  private IType m_createdServerServiceImplementation;
  private IType m_createdServerServiceInterface;

  private IType m_createdClientServiceImplementation;
  private IType m_createdClientServiceInterface;

  private IType m_createdForm;
  private IType m_createdFormData;
  private IType m_createdMainBox;
  private IMethod m_createdMainBoxGetter;

  @Override
  public void validate() throws IllegalArgumentException {
    if (getElement() == null) {
      throw new IllegalArgumentException("FormElement cannot be null.");
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    deleteExistingForm();

    createFormStack();

    processChildren(m_createdMainBox, createFormContext());

    fireEvents();

    postProcessForm();
  }

  private void fireEvents() throws IllegalArgumentException, CoreException {
    fireTypeCreated(m_createdServerServiceImplementation, EVENT_OBJECT_TYPE_SERVER_SERVICE);
    fireTypeCreated(m_createdServerServiceInterface, EVENT_OBJECT_TYPE_SERVER_INTERFACE);
    fireTypeCreated(m_createdClientServiceImplementation, EVENT_OBJECT_TYPE_CLIENT_SERVICE);
    fireTypeCreated(m_createdClientServiceInterface, EVENT_OBJECT_TYPE_CLIENT_INTERFACE);
    fireTypeCreated(m_createdForm, EVENT_OBJECT_TYPE_FORM);
    fireTypeCreated(m_createdFormData, EVENT_OBJECT_TYPE_FORM_DATA);
    fireTypeCreated(m_createdMainBox, EVENT_OBJECT_TYPE_MAIN_BOX);
  }

  private void postProcessForm() throws CoreException, IllegalArgumentException {
    postProcessType(m_createdClientServiceInterface);
    postProcessType(m_createdClientServiceImplementation);

    postProcessType(m_createdServerServiceInterface);
    postProcessType(m_createdServerServiceImplementation);

    postProcessType(m_createdForm);
    postProcessType(m_createdFormData);
  }

  private SamlFormContext createFormContext() throws JavaModelException {
    SamlFormContext formContext = new SamlFormContext();
    formContext.setClientType(m_createdClientServiceImplementation);
    formContext.setClientInterface(m_createdClientServiceInterface);
    formContext.setServerType(m_createdServerServiceImplementation);
    formContext.setServerInterface(m_createdServerServiceInterface);
    formContext.setFormDataType(m_createdFormData);
    formContext.setFormType(m_createdForm);
    formContext.setMainBoxType(m_createdMainBox);
    formContext.addFieldGetterMethod(m_createdMainBoxGetter);
    return formContext;
  }

  private boolean hasOneOfLogicEvents(final String[] logicEvents) {
    LogicElement handler = SamlImportUtility.findFirst(getElement().getLogic(), new IItemVisitor<LogicElement>() {
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
    String formName = getElement().getName();

    FormStackNewOperation op = new FormStackNewOperation(false);
    op.setNlsEntry(null);
    op.setCreateButtonOk(false);
    op.setCreateButtonCancel(false);

    op.setCreateExecLoad(false);
    op.setCreateExecStore(false);

    op.setCreateCreateMethod(false);
    op.setCreateLoadMethod(false);
    op.setCreatePrepareCreateMethod(false);
    op.setCreateStoreMethod(false);

    boolean createModifyHandler = hasOneOfLogicEvents(new String[]{
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getModify_loadKeyword_1().getValue(),
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getModify_storeKeyword_2().getValue(),
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getModify_discardKeyword_3().getValue()
    });

    op.setCreateModifyHandler(createModifyHandler);
    op.setCreateNewHandler(!createModifyHandler || hasOneOfLogicEvents(new String[]{
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getNew_loadKeyword_4().getValue(),
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getNew_storeKeyword_5().getValue(),
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getNew_discardKeyword_6().getValue()
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
    if (getElement().getSuperType() != null) {
      superType = getElement().getSuperType().getDefinition();
    }
    op.setFormSuperTypeSignature(SignatureCache.createTypeSignature(superType));
    op.setFormName(formName + SdkProperties.SUFFIX_FORM);

    op.validate();
    op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    m_createdServerServiceImplementation = op.getOutProcessService();
    m_createdServerServiceInterface = op.getOutProcessServiceInterface();
    m_createdMainBox = op.getOutMainBox();
    m_createdForm = op.getOutForm();
    m_createdFormData = getFormDataType(getElement().getName());
    m_createdMainBoxGetter = op.getOutMainBoxGetterMethod();

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

    m_createdClientServiceImplementation = clientSvcOp.getCreatedServiceImplementation();
    m_createdClientServiceInterface = clientSvcOp.getCreatedServiceInterface();
  }

  private IType getFormDataType(String formName) {
    return TypeUtility.getType(getCurrentScoutModule().getSharedBundle().getDefaultPackage(IScoutBundle.SHARED_SERVICES) + "." + formName + SdkProperties.SUFFIX_FORM_DATA);
  }

  private void deleteExistingForm() throws CoreException {
    String formName = getElement().getName();

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

  @Override
  protected FormElement getElement() {
    return (FormElement) super.getElement();
  }
}
