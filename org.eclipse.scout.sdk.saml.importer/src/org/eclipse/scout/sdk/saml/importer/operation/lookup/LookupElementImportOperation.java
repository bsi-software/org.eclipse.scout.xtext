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
package org.eclipse.scout.sdk.saml.importer.operation.lookup;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.lookupcall.LookupCallNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.internal.sigcache.SignatureCache;
import org.eclipse.scout.sdk.workspace.IScoutBundle;

/**
 * <h3>{@link LookupElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 25.09.2012
 */
public class LookupElementImportOperation extends AbstractSamlElementImportOperation {

  public final static int EVENT_OBJECT_TYPE_LOOKUP_CALL = 13;
  public final static int EVENT_OBJECT_TYPE_LOOKUP_SERVICE = 14;
  public final static int EVENT_OBJECT_TYPE_LOOKUP_INTERFACE = 15;

  private IType m_lookupService;
  private IType m_lookukpServiceInterface;
  private IType m_lookupCall;

  @Override
  public void validate() throws IllegalArgumentException {
    if (getElement() == null) {
      throw new IllegalArgumentException("LookupElement cannot be null.");
    }
  }

  @Override
  protected void run() throws CoreException, IllegalArgumentException {
    createLookup();

    processChildren(null, createFormContext());

    fireTypeCreated(m_lookukpServiceInterface, EVENT_OBJECT_TYPE_LOOKUP_INTERFACE);
    fireTypeCreated(m_lookupService, EVENT_OBJECT_TYPE_LOOKUP_SERVICE);
    fireTypeCreated(m_lookupCall, EVENT_OBJECT_TYPE_LOOKUP_CALL);

    postProcess();
  }

  private SamlFormContext createFormContext() {
    SamlFormContext formContext = new SamlFormContext();
    formContext.setClientType(m_lookupCall);
    formContext.setServerInterface(m_lookukpServiceInterface);
    formContext.setServerType(m_lookupService);
    return formContext;
  }

  private void createLookup() throws IllegalArgumentException, CoreException {
    String lookupSvcPackageShared = getCurrentScoutModule().getSharedBundle().getDefaultPackage(IScoutBundle.SHARED_SERVICES_LOOKUP);
    String lookupSvcPackageServer = getCurrentScoutModule().getServerBundle().getDefaultPackage(IScoutBundle.SERVER_SERVICES_LOOKUP);

    // delete old
    deleteClass(getCurrentScoutModule().getSharedBundle(), lookupSvcPackageShared, "I" + getElement().getName() + SdkProperties.SUFFIX_LOOKUP_SERVICE);
    deleteClass(getCurrentScoutModule().getSharedBundle(), lookupSvcPackageShared, getElement().getName() + SdkProperties.SUFFIX_LOOKUP_CALL);
    deleteClass(getCurrentScoutModule().getServerBundle(), lookupSvcPackageServer, getElement().getName() + SdkProperties.SUFFIX_LOOKUP_SERVICE);

    LookupCallNewOperation op = new LookupCallNewOperation();
    op.setLookupCallName(getElement().getName() + SdkProperties.SUFFIX_LOOKUP_CALL);
    op.setFormatSource(false);
    op.setBundle(getCurrentScoutModule().getSharedBundle());
    op.setLookupCallPackageName(lookupSvcPackageShared);

    op.setServiceInterfaceBundle(getCurrentScoutModule().getSharedBundle());
    op.setServiceInterfacePackageName(lookupSvcPackageShared);
    op.setInterfaceRegistrationBundle(getCurrentScoutModule().getClientBundle());

    op.setServiceImplementationPackage(lookupSvcPackageServer);
    op.setImplementationRegistrationBundle(getCurrentScoutModule().getServerBundle());
    op.setServiceImplementationBundle(getCurrentScoutModule().getServerBundle());

    op.setServiceSuperTypeSignature(SignatureCache.createTypeSignature(RuntimeClasses.AbstractLookupService));
    op.validate();
    op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    m_lookupService = op.getOutLookupService();
    m_lookukpServiceInterface = op.getOutLookupServiceInterface();
    m_lookupCall = op.getOutLookupCall();
  }

  private void postProcess() throws IllegalArgumentException, CoreException {
    postProcessType(m_lookupService);
    postProcessType(m_lookukpServiceInterface);
    postProcessType(m_lookupCall);
  }

  @Override
  protected LookupElement getElement() {
    return (LookupElement) super.getElement();
  }
}
