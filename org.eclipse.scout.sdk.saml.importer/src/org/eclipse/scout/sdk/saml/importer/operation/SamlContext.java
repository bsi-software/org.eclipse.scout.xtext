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

import java.util.Collection;
import java.util.HashMap;
import java.util.Stack;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.scout.nls.sdk.model.workspace.project.INlsProject;
import org.eclipse.scout.saml.module.SamlModule;
import org.eclipse.scout.saml.services.SamlGrammarAccess;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

import com.google.inject.Injector;

/**
 * <h3>{@link SamlContext}</h3> Context that lives during a single SAML import.
 * 
 * @author mvi
 * @since 3.9.0 26.09.2012
 */
public class SamlContext {
  private final IProgressMonitor m_monitor;
  private final IWorkingCopyManager m_workingCopyManager;
  private final Injector m_injector;
  private final SamlGrammarAccess m_grammarAccess;
  private final Stack<IType> m_parentTypeStack;
  private final SuperTypeHierarchyCache m_hierarchyCache;
  private final HashMap<String, INlsProject> m_nlsProjectsByModule;

  private SamlModule m_currentScoutModule;
  private SamlFormContext m_currentFormContext;

  public SamlContext(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, Injector injector) {
    m_monitor = monitor;
    m_workingCopyManager = workingCopyManager;
    m_injector = injector;
    m_nlsProjectsByModule = new HashMap<String, INlsProject>();
    m_hierarchyCache = new SuperTypeHierarchyCache();
    m_grammarAccess = m_injector.getInstance(SamlGrammarAccess.class);
    m_parentTypeStack = new Stack<IType>();
  }

  public void pushParentType(IType container) {
    m_parentTypeStack.push(container);
  }

  public IType getCurrentParentType() {
    return m_parentTypeStack.peek();
  }

  public boolean isParentTypeSet() {
    return !m_parentTypeStack.isEmpty();
  }

  public IType popParentType() {
    return m_parentTypeStack.pop();
  }

  public ITypeHierarchy getSuperTypeHierarchy(IType t) throws JavaModelException {
    return m_hierarchyCache.getSuperTypeHierarchyFor(t);
  }

  public SamlModule getCurrentScoutModule() {
    return m_currentScoutModule;
  }

  public void setCurrentScoutModule(SamlModule currentScoutModule) {
    m_currentScoutModule = currentScoutModule;
  }

  public INlsProject getCurrentModuleNlsProject() {
    return m_nlsProjectsByModule.get(getCurrentScoutModule().getBaseName());
  }

  public void setCurrentModuleNlsProject(INlsProject p) {
    m_nlsProjectsByModule.put(getCurrentScoutModule().getBaseName(), p);
  }

  public boolean containsCurrentNlsProject() {
    return m_nlsProjectsByModule.containsKey(getCurrentScoutModule().getBaseName());
  }

  public Collection<INlsProject> getNlsProjects() {
    return m_nlsProjectsByModule.values();
  }

  public Injector getInjector() {
    return m_injector;
  }

  public IProgressMonitor getMonitor() {
    return m_monitor;
  }

  public IWorkingCopyManager getWorkingCopyManager() {
    return m_workingCopyManager;
  }

  public SamlGrammarAccess getGrammarAccess() {
    return m_grammarAccess;
  }

  public SamlFormContext getCurrentFormContext() {
    return m_currentFormContext;
  }

  public void setCurrentFormContext(SamlFormContext currentFormContext) {
    m_currentFormContext = currentFormContext;
  }

  public void resetCurrentFormContext() {
    m_currentFormContext = null;
  }
}
