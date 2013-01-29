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
package org.eclipse.scout.sdk.saml.importer.operation.form.fields;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.ListBoxElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.form.field.FormFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link ListBoxElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 27.12.2012
 */
public class ListBoxElementImportOperation extends AbstractValueFieldElementImportOperation {

  private ListBoxElement m_listBoxElement;

  @Override
  public String getOperationName() {
    return "Create listbox";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getListBoxElement() == null) {
      throw new IllegalArgumentException("listbox element cannot be null");
    }
  }

  @Override
  protected IType createField() throws CoreException, IllegalArgumentException {
    FormFieldNewOperation o = new FormFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getListBoxElement().getName() + getFieldSuffix());
    o.setSuperTypeSignature(getSuperTypeSignature(RuntimeClasses.IListBox, getListBoxElement().getValueType()));
    o.setOrderNr(getOrder());
    o.setFormType(getSamlFormContext().getFormType());
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    return o.getCreatedFormField();
  }

  @Override
  protected void applyFormFieldProperties(IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    super.applyFormFieldProperties(field, h);

    applyCodeAttribute(getListBoxElement().getCode(), field, h);
    applyLookupAttribute(getListBoxElement().getLookup(), field, h);
    applyGridHeightAttribute(getListBoxElement().getGridHeight(), field, h);
  }

  public ListBoxElement getListBoxElement() {
    return m_listBoxElement;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_listBoxElement = (ListBoxElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_listBoxElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_FORM_FIELD;
  }
}
