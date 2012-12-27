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
package org.eclipse.scout.sdk.saml.importer.extension.customization;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.util.log.ScoutStatus;
import org.eclipse.scout.sdk.workspace.DefaultTargetPackage;
import org.eclipse.scout.sdk.workspace.IScoutBundle;
import org.eclipse.scout.sdk.workspace.IScoutProject;
import org.osgi.service.prefs.BackingStoreException;

/**
 * <h3>{@link DefaultProjectConfigurator}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 27.12.2012
 */
public class DefaultProjectConfigurator implements IScoutProjectConfigurator {

  @Override
  public void configure(SamlContext context) throws CoreException {
    IScoutProject rootProject = context.getRootProject();
    IEclipsePreferences preferences = rootProject.getPreferences();

    String key = DefaultTargetPackage.getPreferenceKey(IScoutBundle.CLIENT_FORMS);
    preferences.put(key, "ui.forms");

    key = DefaultTargetPackage.getPreferenceKey(IScoutBundle.CLIENT_SEARCHFORMS);
    preferences.put(key, "ui.searchforms");

    try {
      preferences.flush();
    }
    catch (BackingStoreException e) {
      throw new CoreException(new ScoutStatus("Unable to save the dialba workspace settings.", e));
    }
  }
}
