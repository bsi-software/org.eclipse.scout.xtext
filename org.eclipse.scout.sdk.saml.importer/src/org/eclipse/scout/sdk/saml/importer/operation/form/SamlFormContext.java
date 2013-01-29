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

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.TreeMap;

import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.util.typecache.ITypeHierarchy;

/**
 * <h3>{@link SamlFormContext}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlFormContext {
  private IType m_clientType;
  private IType m_clientInterface;
  private IType m_serverType;
  private IType m_serverInterface;
  private IType m_formDataType;
  private IType m_formType;
  private SamlContext m_samlContext;

  private final Stack<IType> m_parentBoxStack;
  private final HashMap<IType, ITypeHierarchy> m_parentBoxLocalTypeHierarchies;
  private final TreeMap<String, IMethod> m_fieldGetterMethods;

  public SamlFormContext() {
    m_parentBoxStack = new Stack<IType>();
    m_parentBoxLocalTypeHierarchies = new HashMap<IType, ITypeHierarchy>();
    m_fieldGetterMethods = new TreeMap<String, IMethod>();
  }

  public void pushParentBox(IType container) {
    m_parentBoxStack.push(container);
  }

  public IType getCurrentParentBox() {
    return m_parentBoxStack.peek();
  }

  public void addFieldGetterMethod(IMethod method) throws JavaModelException {
    m_fieldGetterMethods.put(method.getElementName(), method);
  }

  public IMethod getSiblingFor(String elementName) {
    Entry<String, IMethod> siblingEntry = m_fieldGetterMethods.ceilingEntry(elementName);
    return siblingEntry.getValue();
  }

  public ITypeHierarchy getCurrentParentBoxLocalTypeHierarchy() {
    IType currentParentBox = getCurrentParentBox();
    if (currentParentBox == null) {
      return null;
    }
    ITypeHierarchy result = m_parentBoxLocalTypeHierarchies.get(currentParentBox);
    if (result == null) {
      result = TypeUtility.getLocalTypeHierarchy(currentParentBox);
      m_parentBoxLocalTypeHierarchies.put(currentParentBox, result);
    }
    return result;
  }

  public IType popParentBox() {
    return m_parentBoxStack.pop();
  }

  public IType getClientType() {
    return m_clientType;
  }

  public void setClientType(IType clientType) {
    m_clientType = clientType;
  }

  public IType getClientInterface() {
    return m_clientInterface;
  }

  public void setClientInterface(IType clientInterface) {
    m_clientInterface = clientInterface;
  }

  public IType getServerType() {
    return m_serverType;
  }

  public void setServerType(IType serverType) {
    m_serverType = serverType;
  }

  public IType getServerInterface() {
    return m_serverInterface;
  }

  public void setServerInterface(IType serverInterface) {
    m_serverInterface = serverInterface;
  }

  public IType getFormDataType() {
    return m_formDataType;
  }

  public void setFormDataType(IType formDataType) {
    m_formDataType = formDataType;
  }

  public IType getFormType() {
    return m_formType;
  }

  public void setFormType(IType formType) {
    m_formType = formType;
  }

  public SamlContext getSamlContext() {
    return m_samlContext;
  }

  public void setSamlContext(SamlContext samlContext) {
    m_samlContext = samlContext;
  }
}
