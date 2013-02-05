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
package org.eclipse.scout.sdk.saml.importer.event;

import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;

/**
 * <h3>{@link SamlImportEvent}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 03.02.2013
 */
public class SamlImportEvent {

  public static enum SamlImportEventType {
    ADDED, CHANGED, REMOVED
  }

  private AbstractSamlElementImportOperation m_source;
  private Object m_object;
  private int m_objectKind; // instance type (e.g. IType, IResource, etc.)
  private int m_objectType; // sub type of object instance (e.g. ServerService, Form, FormField, etc. for ITypes)
  private SamlImportEventType m_eventType;
  private SamlContext m_context;

  public SamlImportEvent(SamlImportEventType type, int objectKind, int objectType, Object object, AbstractSamlElementImportOperation source, SamlContext context) {
    m_source = source;
    m_objectKind = objectKind;
    m_objectType = objectType;
    m_object = object;
    m_eventType = type;
    m_context = context;
  }

  public AbstractSamlElementImportOperation getSource() {
    return m_source;
  }

  public void setSource(AbstractSamlElementImportOperation source) {
    m_source = source;
  }

  public Object getObject() {
    return m_object;
  }

  public void setObject(Object object) {
    m_object = object;
  }

  public int getObjectKind() {
    return m_objectKind;
  }

  public void setObjectKind(int objectKind) {
    m_objectKind = objectKind;
  }

  public SamlContext getSamlContext() {
    return m_context;
  }

  public void setSamlContext(SamlContext context) {
    m_context = context;
  }

  public int getObjectType() {
    return m_objectType;
  }

  public void setObjectType(int objectType) {
    m_objectType = objectType;
  }

  public SamlImportEventType getEventType() {
    return m_eventType;
  }

  public void setEventType(SamlImportEventType eventType) {
    m_eventType = eventType;
  }

  public SamlContext getContext() {
    return m_context;
  }

  public void setContext(SamlContext context) {
    m_context = context;
  }
}
