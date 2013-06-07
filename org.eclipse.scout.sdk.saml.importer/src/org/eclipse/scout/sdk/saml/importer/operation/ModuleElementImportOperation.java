/*******************************************************************************
 * Copyright (c) 2012, 2013 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.sdk.saml.importer.operation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.scout.nls.sdk.internal.NlsCore;
import org.eclipse.scout.nls.sdk.model.workspace.project.INlsProject;
import org.eclipse.scout.nls.sdk.services.model.ws.NlsServiceType;
import org.eclipse.scout.nls.sdk.services.model.ws.project.ServiceNlsProjectProvider;
import org.eclipse.scout.nls.sdk.services.operation.CreateServiceNlsProjectOperation;
import org.eclipse.scout.saml.module.SamlModule;
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.sdk.extensions.runtime.classes.RuntimeClasses;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.type.ITypeFilter;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.type.ScoutTypeFilters;

/**
 * <h3>{@link ModuleElementImportOperation}</h3> Operation that can import a {@link ModuleElement}.
 * 
 * @author mvi
 * @since 3.9.0 03.02.2013
 */
public class ModuleElementImportOperation extends AbstractSamlElementImportOperation {

  public final static int EVENT_OBJECT_TYPE_TEXT_SERVICE = 17;

  @Override
  public void validate() throws IllegalArgumentException {
    if (getElement() == null) {
      throw new IllegalArgumentException("ModuleElement cannot be null.");
    }
  }

  @Override
  protected void run() throws CoreException, IllegalArgumentException {
    getSamlContext().setCurrentScoutModule(new SamlModule(getElement()));

    if (!getSamlContext().containsCurrentNlsProject()) {
      getSamlContext().setCurrentModuleNlsProject(getOrCreateNlsProject());
    }
  }

  private IType getCurrentTextService() throws JavaModelException {
    IType[] services = ServiceNlsProjectProvider.getRegisteredTextProviderTypes();
    ITypeFilter filter = ScoutTypeFilters.getInScoutBundles(getCurrentScoutModule().getShared());
    for (IType type : services) {
      if (filter.accept(type)) {
        return type;
      }
    }
    return null;
  }

  private static String getProjectSimpleName(String projectName) {
    if (projectName == null) {
      return null;
    }
    String sharedSuffix = ".shared";
    if (projectName.endsWith(sharedSuffix)) {
      projectName = projectName.substring(0, projectName.length() - sharedSuffix.length());
    }
    int pos = projectName.lastIndexOf('.') + 1;
    int simpleNameLen = projectName.length() - pos;
    if (pos > 0 && simpleNameLen > 0) {
      String moduleSimpleName = projectName.substring(pos);
      if (moduleSimpleName.length() > 1) {
        return Character.toUpperCase(moduleSimpleName.charAt(0)) + moduleSimpleName.substring(1).toLowerCase();
      }
      else {
        return moduleSimpleName.toUpperCase();
      }
    }
    return null;
  }

  private INlsProject getOrCreateNlsProject() throws IllegalArgumentException, CoreException {
    String projectName = getCurrentScoutModule().getShared().getSymbolicName();
    IType curTxtSvc = getCurrentTextService();
    if (!TypeUtility.exists(curTxtSvc)) {
      String moduleSimpleName = getProjectSimpleName(projectName);
      if (moduleSimpleName != null) {
        CreateServiceNlsProjectOperation newTextServiceOp = new CreateServiceNlsProjectOperation();
        newTextServiceOp.setBundle(getCurrentScoutModule().getShared());
        newTextServiceOp.setPackageName(getCurrentScoutModule().getShared().getDefaultPackage(NlsServiceType.TEXT_SERVICE_PACKAGE_ID));
        newTextServiceOp.setLanguages(new String[]{null /* default language */}); // other languages will be added as needed.
        newTextServiceOp.setServiceName(moduleSimpleName + SdkProperties.SUFFIX_TEXT_SERVICE);
        newTextServiceOp.setSuperType(TypeUtility.getType(RuntimeClasses.AbstractDynamicNlsTextProviderService));
        newTextServiceOp.setTranslationFilePrefix("Texts");
        newTextServiceOp.setTranslationFolder("resources/texts");
        newTextServiceOp.validate();
        newTextServiceOp.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
        curTxtSvc = newTextServiceOp.getCreatedServiceType();

        fireTypeCreated(curTxtSvc, EVENT_OBJECT_TYPE_TEXT_SERVICE);

        postProcessType(curTxtSvc);
      }
      else {
        throw new IllegalArgumentException("Invalid project name: '" + projectName + "'.");
      }
    }

    return NlsCore.getNlsWorkspace().getNlsProject(new Object[]{curTxtSvc});
  }

  @Override
  protected ModuleElement getElement() {
    return (ModuleElement) super.getElement();
  }
}
