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
package org.eclipse.scout.sdk.saml.importer.operation.form.field;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.GenericValueFieldElement;
import org.eclipse.scout.saml.saml.NamedTypeElement;
import org.eclipse.scout.sdk.operation.form.field.FormFieldNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;

/**
 * <h3>{@link FormFieldElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 01.02.2013
 */
public class FormFieldElementImportOperation extends AbstractSamlElementImportOperation {

  public final static int EVENT_OBJECT_TYPE_FORM_FIELD = 12;

  private String m_fieldSuffix;
  private String m_defaultSuperInterfaceFqn;
  private Double m_order;
  private IJavaElement m_getterMethodSibling;
  private IType m_createdFormField;

  @Override
  public void validate() throws IllegalArgumentException {
    if (getElement() == null) {
      throw new IllegalArgumentException("FormFieldElement cannot be null.");
    }
  }

  @Override
  protected void run() throws CoreException, IllegalArgumentException {

    m_createdFormField = createField();

    processChildren(m_createdFormField, getSamlContext().getCurrentFormContext());

    fireTypeCreated(m_createdFormField, EVENT_OBJECT_TYPE_FORM_FIELD);
  }

  protected IType createField() throws CoreException, IllegalArgumentException {
    FormFieldNewOperation o = new FormFieldNewOperation(getSamlContext().getCurrentParentType(), false);
    String typeName = getElement().getName() + getFieldSuffix();
    o.setTypeName(typeName);
    if (getOrder() != null) {
      o.setOrderNr(getOrder().doubleValue());
    }
    o.setFormType(getSamlContext().getCurrentFormContext().getFormType());
    o.setSuperTypeSignature(getSuperTypeSignature(getDefaultSuperInterfaceFqn(), getElement().getSuperType(),
        getCurrentScoutModule().getClient(), getGenericValueType()));
    o.setGetterMethodSibling(getSamlContext().getCurrentFormContext().getSiblingFor("get" + typeName));
    o.setSiblingField(null);
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    getSamlContext().getCurrentFormContext().addFieldGetterMethod(o.getCreatedFieldGetterMethod());

    return o.getCreatedFormField();
  }

  protected String getGenericValueType() {
    if (getElement() instanceof GenericValueFieldElement) {
      return ((GenericValueFieldElement) getElement()).getValueType();
    }
    return null;
  }

  @Override
  protected NamedTypeElement getElement() {
    return (NamedTypeElement) super.getElement();
  }

  public String getFieldSuffix() {
    return m_fieldSuffix;
  }

  public void setFieldSuffix(String fieldSuffix) {
    m_fieldSuffix = fieldSuffix;
  }

  public void setOrder(Double order) {
    m_order = order;
  }

  protected Double getOrder() {
    return m_order;
  }

  protected String getDefaultSuperInterfaceFqn() {
    return m_defaultSuperInterfaceFqn;
  }

  public void setDefaultSuperInterfaceFqn(String defaultSuperInterfaceFqn) {
    m_defaultSuperInterfaceFqn = defaultSuperInterfaceFqn;
  }

  protected IJavaElement getGetterMethodSibling() {
    return m_getterMethodSibling;
  }

  public void setGetterMethodSibling(IJavaElement getterMethodSibling) {
    m_getterMethodSibling = getterMethodSibling;
  }
}
