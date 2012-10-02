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
package org.eclipse.scout.sdk.saml.importer.operation;

import java.util.HashSet;

import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.scout.sdk.workspace.IScoutProject;

/**
 * <h3>{@link SamlContext}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlContext {
  private IScoutProject m_currentScoutModule;
  private HashSet<String> m_modifiedTypes;
  private HashSet<String> m_modifiedMethods;

  public SamlContext() {
    m_modifiedTypes = new HashSet<String>();
    m_modifiedMethods = new HashSet<String>();
  }

  public void rememberModifiedType(IType t) {
    while (t.getDeclaringType() != null) {
      t = t.getDeclaringType();
    }
    m_modifiedTypes.add(t.getFullyQualifiedName());
  }

  public void markMethodChanged(IMethod m) throws JavaModelException {
    String methodId = getMethodId(m);
    m_modifiedMethods.add(methodId);
  }

  public boolean isMethodChanged(IMethod m) throws JavaModelException {
    String methodId = getMethodId(m);
    return m_modifiedMethods.contains(methodId);
  }

  private String getMethodId(IMethod m) throws JavaModelException {
    return m.getDeclaringType().getFullyQualifiedName() + "#" + m.getElementName() + m.getSignature();
  }

  public String[] getModifiedTypes() {
    return m_modifiedTypes.toArray(new String[m_modifiedTypes.size()]);
  }

  public IScoutProject getCurrentScoutModule() {
    return m_currentScoutModule;
  }

  public void setCurrentScoutModule(IScoutProject currentScoutModule) {
    m_currentScoutModule = currentScoutModule;
  }
}
