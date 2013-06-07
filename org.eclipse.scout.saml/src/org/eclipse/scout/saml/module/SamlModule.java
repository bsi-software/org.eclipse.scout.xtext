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
package org.eclipse.scout.saml.module;

import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.sdk.ScoutSdkCore;
import org.eclipse.scout.sdk.operation.project.AbstractScoutProjectNewOperation;
import org.eclipse.scout.sdk.workspace.IScoutBundle;
import org.eclipse.scout.sdk.workspace.IScoutBundleGraph;

/**
 * <h3>{@link SamlModule}</h3>
 * 
 * @author mvi
 * @since 1.0.0 19.03.2013
 */
public class SamlModule {

  private IScoutBundle m_client, m_shared, m_server;
  private final String m_baseName;

  public SamlModule(ModuleElement module) {
    m_baseName = module.getName();

    String clientName = getBundleName(getBaseName(), "client", module.getClient());
    String sharedName = getBundleName(getBaseName(), "shared", module.getShared());
    String serverName = getBundleName(getBaseName(), "server", module.getServer());

    IScoutBundleGraph graph = ScoutSdkCore.getScoutWorkspace().getBundleGraph();
    m_client = graph.getBundle(clientName);
    if (m_client != null && m_client.isBinary()) {
      m_client = null;
    }

    m_shared = graph.getBundle(sharedName);
    if (m_shared != null && m_shared.isBinary()) {
      m_shared = null;
    }

    m_server = graph.getBundle(serverName);
    if (m_server != null && m_server.isBinary()) {
      m_server = null;
    }
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

  public String getBaseName() {
    return m_baseName;
  }
}
