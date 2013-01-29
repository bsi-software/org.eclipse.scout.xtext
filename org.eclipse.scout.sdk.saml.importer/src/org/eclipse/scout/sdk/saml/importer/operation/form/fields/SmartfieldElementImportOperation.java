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
import org.eclipse.scout.saml.saml.SmartfieldElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.form.field.FormFieldNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.menu.MenuElementImportOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link SmartfieldElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SmartfieldElementImportOperation extends AbstractValueFieldElementImportOperation {

  private SmartfieldElement m_smartfieldElement;

  @Override
  public String getOperationName() {
    return "Create smartfield";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getSmartfieldElement() == null) {
      throw new IllegalArgumentException("smartfield element cannot be null");
    }
  }

  @Override
  protected IType createField() throws CoreException, IllegalArgumentException {
    FormFieldNewOperation o = new FormFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getSmartfieldElement().getName() + getFieldSuffix());
    o.setSuperTypeSignature(getSuperTypeSignature(RuntimeClasses.ISmartField, getSmartfieldElement().getValueType()));
    o.setOrderNr(getOrder());
    o.setFormType(getSamlFormContext().getFormType());
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType createdField = o.getCreatedFormField();

    MenuElementImportOperation.processMenus(getSmartfieldElement().getMenus(), createdField, getSamlFormContext());

    return createdField;
  }

  @Override
  protected void applyFormFieldProperties(IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    super.applyFormFieldProperties(field, h);

    applyCodeAttribute(getSmartfieldElement().getCode(), field, h);
    applyLookupAttribute(getSmartfieldElement().getLookup(), field, h);
  }

  public SmartfieldElement getSmartfieldElement() {
    return m_smartfieldElement;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_smartfieldElement = (SmartfieldElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_smartfieldElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_FORM_FIELD;
  }
}
