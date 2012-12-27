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

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.TabElement;
import org.eclipse.scout.sdk.operation.form.field.GroupBoxNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link TabElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 27.12.2012
 */
public class TabElementImportOperation extends AbstractBoxElementImportOperation {

  private TabElement m_tabElement;
  private IType m_tabBox;

  @Override
  public String getOperationName() {
    return "create tab";
  }

  public static void processTabs(List<TabElement> tabs, IType tabbox, SamlFormContext context) throws CoreException, IllegalArgumentException {
    for (TabElement tab : tabs) {
      TabElementImportOperation op = new TabElementImportOperation();
      op.setTabElement(tab);
      op.setSamlContext(context.getSamlContext());
      op.setSamlFormContext(context);
      op.setTabBox(tabbox);
      op.validate();
      op.run();
    }
  }

  public TabElement getTabElement() {
    return m_tabElement;
  }

  public void setTabElement(TabElement tabElement) {
    m_tabElement = tabElement;
  }

  public IType getTabBox() {
    return m_tabBox;
  }

  public void setTabBox(IType tabBox) {
    m_tabBox = tabBox;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_tabElement = (TabElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_tabElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_BOX;
  }

  @Override
  protected IType createBox() throws CoreException, IllegalArgumentException {
    GroupBoxNewOperation o = new GroupBoxNewOperation(getTabBox(), false);
    o.setTypeName(getTabElement().getName() + getFieldSuffix());
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
    applyLabelAttribute(getTabElement().getText(), field, h);
    applyColumnsAttribute(getTabElement().getColumns(), field, h);
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getTabElement() == null) {
      throw new IllegalArgumentException("tab element cannot be null.");
    }
    if (getTabBox() == null) {
      throw new IllegalArgumentException("tabbox type cannot be null.");
    }
  }
}
