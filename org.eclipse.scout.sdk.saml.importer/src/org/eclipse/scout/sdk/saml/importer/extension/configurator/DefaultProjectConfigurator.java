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
package org.eclipse.scout.sdk.saml.importer.extension.configurator;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.scout.sdk.ScoutSdkCore;
import org.eclipse.scout.sdk.extensions.targetpackage.DefaultTargetPackage;
import org.eclipse.scout.sdk.extensions.targetpackage.IDefaultTargetPackage;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.util.log.ScoutStatus;
import org.eclipse.scout.sdk.workspace.IScoutBundle;
import org.eclipse.scout.sdk.workspace.ScoutBundleFilters;
import org.osgi.service.prefs.BackingStoreException;

/**
 * <h3>{@link DefaultProjectConfigurator}</h3>
 * 
 * @author mvi
 * @since 3.9.0 27.12.2012
 */
public class DefaultProjectConfigurator implements IScoutProjectConfigurator {

  @Override
  public void configure(SamlContext context) throws CoreException {
    IScoutBundle[] roots = ScoutSdkCore.getScoutWorkspace().getBundleGraph().getBundles(ScoutBundleFilters.getRootBundlesFilter());

    try {
      // default client prefs for forms
      for (IEclipsePreferences preferences : getPrefsForChildBundlesOfType(roots, IScoutBundle.TYPE_CLIENT)) {
        String key = DefaultTargetPackage.getPreferenceKey(IDefaultTargetPackage.CLIENT_FORMS);
        preferences.put(key, "ui.forms");

        key = DefaultTargetPackage.getPreferenceKey(IDefaultTargetPackage.CLIENT_SEARCHFORMS);
        preferences.put(key, "ui.searchforms");

        preferences.flush();
      }
    }
    catch (BackingStoreException e) {
      throw new CoreException(new ScoutStatus("Unable to save the default saml workspace settings.", e));
    }
  }

  private IEclipsePreferences[] getPrefsForChildBundlesOfType(IScoutBundle[] roots, String type) {
    ArrayList<IEclipsePreferences> prefsForBundles = new ArrayList<IEclipsePreferences>();
    for (IScoutBundle root : roots) {
      for (IScoutBundle b : root.getChildBundles(ScoutBundleFilters.getBundlesOfTypeFilter(type), true)) {
        prefsForBundles.add(b.getPreferences());
      }
    }
    return prefsForBundles.toArray(new IEclipsePreferences[prefsForBundles.size()]);
  }
}
