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
import org.eclipse.scout.saml.saml.BigDecimalElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.sdk.operation.form.field.BigdecimalFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link BigDecimalElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class BigDecimalElementImportOperation extends AbstractValueFieldElementImportOperation {

  private BigDecimalElement m_bigDecimalElement;

  @Override
  public String getOperationName() {
    return "Create bigdecimal field";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getBigDecimalElement() == null) {
      throw new IllegalArgumentException("bigdecimal element cannot be null");
    }
  }

  protected void applyMaxAttribute(String max, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    Double maxVal = parseDouble(max);
    if (maxVal != null) {
      overrideMethod(field, h, "getConfiguredMaxValue", "return " + maxVal + ";");
    }
  }

  protected void applyMinAttribute(String min, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    Double minVal = parseDouble(min);
    if (minVal != null) {
      overrideMethod(field, h, "getConfiguredMinValue", "return " + minVal + ";");
    }
  }

  protected void applyPercentAttribute(String percent, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("true".equals(percent)) {
      overrideMethod(field, h, "getConfiguredPercent", "return true;");
    }
  }

  protected void applyFractionDigitsAttribute(int digits, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (digits > 0 && digits != 2) {
      overrideMethod(field, h, "getConfiguredFractionDigits", "return " + digits + ";");
      overrideMethod(field, h, "getConfiguredMaxFractionDigits", "return " + digits + ";");

      overrideMethod(field, h, "getConfiguredMinFractionDigits", "return 0;");
    }
  }

  protected void applyGroupingAttribute(String grouping, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("false".equals(grouping)) {
      overrideMethod(field, h, "getConfiguredGroupingUsed", "return false;");
    }
  }

  @Override
  protected IType createField() throws CoreException, IllegalArgumentException {
    BigdecimalFieldNewOperation o = new BigdecimalFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getBigDecimalElement().getName() + getFieldSuffix());
    o.setSibling(getDefaultSibling());
    String configuredSuperTypeSig = getSuperTypeSigValidated();
    if (configuredSuperTypeSig != null) {
      o.setSuperTypeSignature(configuredSuperTypeSig);
    }
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    return o.getCreatedField();
  }

  @Override
  protected void applyFormFieldProperties(IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    super.applyFormFieldProperties(field, h);

    applyMaxAttribute(getBigDecimalElement().getMax(), field, h);
    applyMinAttribute(getBigDecimalElement().getMin(), field, h);
    applyPercentAttribute(getBigDecimalElement().getPercent(), field, h);
    applyFractionDigitsAttribute(getBigDecimalElement().getFractionDigits(), field, h);
    applyGroupingAttribute(getBigDecimalElement().getGrouping(), field, h);
    applyHorizontalAlignAttribute(getBigDecimalElement().getHorizontalAlign(), HORIZONTAL_ALIGN_RIGHT, field, h);
  }

  public BigDecimalElement getBigDecimalElement() {
    return m_bigDecimalElement;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_bigDecimalElement = (BigDecimalElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_bigDecimalElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_FORM_FIELD;
  }

}
