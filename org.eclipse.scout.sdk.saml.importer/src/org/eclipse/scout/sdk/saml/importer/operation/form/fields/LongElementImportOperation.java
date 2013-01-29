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
import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.form.field.FormFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link LongElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class LongElementImportOperation extends AbstractValueFieldElementImportOperation {

  private LongElement m_longElement;

  @Override
  public String getOperationName() {
    return "Create long field";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getLongElement() == null) {
      throw new IllegalArgumentException("long element cannot be null");
    }
  }

  protected void applyMaxAttribute(int max, boolean isSet, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (isSet) {
      overrideMethod(field, h, "getConfiguredMaximumValue", "return " + max + "L;");
    }
  }

  protected void applyMinAttribute(int min, boolean isSet, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (isSet) {
      overrideMethod(field, h, "getConfiguredMinimumValue", "return " + min + "L;");
    }
  }

  @Override
  protected IType createField() throws CoreException, IllegalArgumentException {
    FormFieldNewOperation o = new FormFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setOrderNr(getOrder());
    o.setFormType(getSamlFormContext().getFormType());
    o.setTypeName(getLongElement().getName() + getFieldSuffix());
    o.setSuperTypeSignature(getSuperTypeSignature(RuntimeClasses.ILongField));
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    return o.getCreatedFormField();
  }

  @Override
  protected void applyFormFieldProperties(IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    super.applyFormFieldProperties(field, h);

    applyMaxAttribute(getLongElement().getMax(), getLongElement().eIsSet(SamlPackage.eINSTANCE.getLongElement_Max()), field, h);
    applyMinAttribute(getLongElement().getMin(), getLongElement().eIsSet(SamlPackage.eINSTANCE.getLongElement_Min()), field, h);
    applyHorizontalAlignAttribute(getLongElement().getHorizontalAlign(), HORIZONTAL_ALIGN_RIGHT, field, h);
  }

  public LongElement getLongElement() {
    return m_longElement;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_longElement = (LongElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_longElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_FORM_FIELD;
  }
}
