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
package org.eclipse.scout.sdk.saml.importer.operation.form.fields.container;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.GroupBoxElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.form.field.FormFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link GroupBoxElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class GroupBoxElementImportOperation extends AbstractBoxElementImportOperation {

  private GroupBoxElement m_groupBoxElement;

  @Override
  public String getOperationName() {
    return "Create group box";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getGroupBoxElement() == null) {
      throw new IllegalArgumentException("group box element cannot be null.");
    }
  }

  @Override
  public IType createBox() throws CoreException, IllegalArgumentException {
    FormFieldNewOperation o = new FormFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getGroupBoxElement().getName() + getFieldSuffix());
    o.setOrderNr(getOrder());
    o.setFormType(getSamlFormContext().getFormType());
    o.setSuperTypeSignature(getSuperTypeSignature(RuntimeClasses.IGroupBox));
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    return o.getCreatedFormField();
  }

  @Override
  protected void applyFormFieldProperties(IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    super.applyFormFieldProperties(field, h);

    applyLabelAttribute(getGroupBoxElement().getText(), field, h);
    applyGridHeightAttribute(getGroupBoxElement().getGridHeight(), field, h);
    applyColumnsAttribute(getGroupBoxElement().getColumns(), field, h);
    applyBorderVisibleAttribute(getGroupBoxElement().getBorderVisible(), field, h);
    applyBorderDecorationAttribute(getGroupBoxElement().getBorderDecoration(), field, h);
    applyLabelVisibleAttribute(getGroupBoxElement().getLabelVisible(), field, h);
    applyGridWidthAttribute(getGroupBoxElement().getGridWidth(), field, h);
    applyWidthInPixelsAttribute(getGroupBoxElement().getWidthInPixels(), field, h);
  }

  protected void applyBorderVisibleAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("false".equals(a)) {
      overrideMethod(field, h, "getConfiguredBorderVisible", "return false;");
    }
  }

  protected void applyBorderDecorationAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (StringUtility.hasText(a)) {
      String constant = getBorderConstant(a);
      if (constant != null) {
        overrideMethod(field, h, "getConfiguredBorderDecoration", "return " + constant + ";");
      }
    }
  }

  private String getBorderConstant(String val) throws IllegalArgumentException {
    if (val.equals(getSamlContext().getGrammarAccess().getGroupBoxElementAccess().getBorderDecorationEmptyKeyword_2_6_2_0_0().getValue())) {
      return "BORDER_DECORATION_EMPTY";
    }
    else if (val.equals(getSamlContext().getGrammarAccess().getGroupBoxElementAccess().getBorderDecorationAutoKeyword_2_6_2_0_3().getValue())) {
      return null;// default, meaning: "BORDER_DECORATION_AUTO"
    }
    else if (val.equals(getSamlContext().getGrammarAccess().getGroupBoxElementAccess().getBorderDecorationLineKeyword_2_6_2_0_1().getValue())) {
      return "BORDER_DECORATION_LINE";
    }
    else if (val.equals(getSamlContext().getGrammarAccess().getGroupBoxElementAccess().getBorderDecorationSectionKeyword_2_6_2_0_2().getValue())) {
      return "BORDER_DECORATION_SECTION";
    }
    else {
      throw new IllegalArgumentException("unknown border_decoration: " + val);
    }
  }

  public GroupBoxElement getGroupBoxElement() {
    return m_groupBoxElement;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_groupBoxElement = (GroupBoxElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_groupBoxElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_BOX;
  }
}
