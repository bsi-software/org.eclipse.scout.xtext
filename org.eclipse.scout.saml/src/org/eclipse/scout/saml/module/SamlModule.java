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
package org.eclipse.scout.saml.module;

import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.sdk.ScoutSdkCore;
import org.eclipse.scout.sdk.operation.project.AbstractScoutProjectNewOperation;
import org.eclipse.scout.sdk.workspace.IScoutBundle;
import org.eclipse.scout.sdk.workspace.IScoutBundleGraph;

/**
 * <h3>{@link SamlModule}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 19.03.2013
 */
public class SamlModule {

  private final IScoutBundle m_client, m_shared, m_server;

  public SamlModule(ModuleElement module) {
    String moduleBaseName = module.getName();

    String clientName = getBundleName(moduleBaseName, "client", module.getClient());
    String sharedName = getBundleName(moduleBaseName, "shared", module.getShared());
    String serverName = getBundleName(moduleBaseName, "server", module.getServer());

    IScoutBundleGraph graph = ScoutSdkCore.getScoutWorkspace().getBundleGraph();
    m_client = graph.getBundle(clientName);
    m_shared = graph.getBundle(sharedName);
    m_server = graph.getBundle(serverName);
  }

  private static String getBundleName(String moduleBaseName, String moduleSuffix, String specificModuleName) {
    if (StringUtility.hasText(specificModuleName)) {
      return specificModuleName.trim();
    }
    return AbstractScoutProjectNewOperation.getPluginName(moduleBaseName, null, moduleSuffix);
  }

  public IScoutBundle getClient() {
    return m_client;
  }

  public IScoutBundle getShared() {
    return m_shared;
  }

  public IScoutBundle getServer() {
    return m_server;
  }
}
