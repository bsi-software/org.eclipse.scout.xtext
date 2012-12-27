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
import org.eclipse.scout.sdk.operation.service.ServiceDeleteOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.saml.importer.operation.logic.SamlLogicFillOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.internal.sigcache.SignatureCache;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.IScoutBundle;

/**
 * <h3>{@link LookupElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 25.09.2012
 */
public class LookupElementImportOperation extends AbstractSamlElementImportOperation {

  private LookupElement m_lookupElement;

  @Override
  public String getOperationName() {
    return "Create Lookup Call & Lookup Service";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getLookupElement() == null) {
      throw new IllegalArgumentException("LookupElement cannot be null.");
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    String baseName = getLookupElement().getName();
    String lookupCallName = baseName + SdkProperties.SUFFIX_LOOKUP_CALL;

    deleteExisting(baseName);

    // create classes
    LookupCallNewOperation op = new LookupCallNewOperation();

    op.setLookupCallName(lookupCallName);
    op.setFormatSource(false);
    op.setBundle(getCurrentScoutModule().getSharedBundle());
    op.setLookupCallPackageName(getCurrentScoutModule().getSharedBundle().getDefaultPackage(IScoutBundle.SHARED_SERVICES_LOOKUP));

    op.setServiceInterfaceBundle(getCurrentScoutModule().getSharedBundle());
    op.setServiceInterfacePackageName(getCurrentScoutModule().getSharedBundle().getDefaultPackage(IScoutBundle.SHARED_SERVICES_LOOKUP));
    op.setInterfaceRegistrationBundle(getCurrentScoutModule().getClientBundle());

    op.setServiceImplementationPackage(getCurrentScoutModule().getServerBundle().getDefaultPackage(IScoutBundle.SERVER_SERVICES_LOOKUP));
    op.setImplementationRegistrationBundle(getCurrentScoutModule().getServerBundle());
    op.setServiceImplementationBundle(getCurrentScoutModule().getServerBundle());

    op.setServiceSuperTypeSignature(SignatureCache.createTypeSignature(RuntimeClasses.AbstractLookupService));
    op.validate();
    op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    // remember modified classes
    IType lookupService = op.getOutLookupService();
    IType lookukpServiceInterface = op.getOutLookupServiceInterface();
    IType lookupCall = op.getOutLookupCall();

    // fill logic
    SamlFormContext formContext = new SamlFormContext();
    formContext.setClientType(lookupCall);
    formContext.setServerInterface(lookukpServiceInterface);
    formContext.setServerType(lookupService);
    formContext.setSamlContext(getSamlContext());

    SamlLogicFillOperation.fillAllLogic(getLookupElement().getLogic(), formContext);

    postProcessType(lookupService);
    postProcessType(lookukpServiceInterface);
    postProcessType(lookupCall);
  }

  private void deleteExisting(String name) throws CoreException, IllegalArgumentException {
    IScoutBundle shared = getCurrentScoutModule().getSharedBundle();
    IScoutBundle server = getCurrentScoutModule().getServerBundle();

    IType oldService = TypeUtility.getType(server.getDefaultPackage(IScoutBundle.SERVER_SERVICES_LOOKUP) + "." + name + SdkProperties.SUFFIX_LOOKUP_SERVICE);
    IType oldCall = TypeUtility.getType(shared.getDefaultPackage(IScoutBundle.SHARED_SERVICES_LOOKUP) + "." + name + SdkProperties.SUFFIX_LOOKUP_CALL);
    IType oldServiceInterface = TypeUtility.getType(shared.getDefaultPackage(IScoutBundle.SHARED_SERVICES_LOOKUP) + ".I" + name + SdkProperties.SUFFIX_LOOKUP_SERVICE);

    if (TypeUtility.exists(oldService)) {
      ServiceDeleteOperation sdo = new ServiceDeleteOperation();
      sdo.setServiceImplementation(oldService);
      sdo.setServiceInterface(oldServiceInterface);
      sdo.setAdditionalTypesToBeDeleted(new IType[]{oldCall});
      sdo.validate();
      sdo.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    }
  }

  public LookupElement getLookupElement() {
    return m_lookupElement;
  }

  public void setLookupElement(LookupElement lookupElement) {
    m_lookupElement = lookupElement;
  }
}
