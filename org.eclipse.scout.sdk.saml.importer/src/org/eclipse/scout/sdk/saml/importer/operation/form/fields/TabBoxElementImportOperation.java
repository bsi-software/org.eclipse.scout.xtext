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
import org.eclipse.scout.saml.saml.TabBoxElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.form.field.FormFieldNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.fields.container.TabElementImportOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link TabBoxElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 27.12.2012
 */
public class TabBoxElementImportOperation extends AbstractFormFieldElementOperation {

  private TabBoxElement m_tabBoxElement;

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_tabBoxElement = (TabBoxElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_tabBoxElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_BOX;
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    FormFieldNewOperation o = new FormFieldNewOperation(getSamlFormContext().getCurrentParentBox());
    o.setFormatSource(false);
    o.setSuperTypeSignature(getSuperTypeSignature(RuntimeClasses.ITabBox));
    o.setTypeName(getTabBoxElement().getName() + getFieldSuffix());
    o.setOrderNr(getOrder());
    o.setFormType(getSamlFormContext().getFormType());
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType createdField = o.getCreatedFormField();

    ITypeHierarchy h = createdField.newSupertypeHierarchy(getSamlContext().getMonitor());
    applyFormFieldProperties(createdField, h);
    applyGridWidthAttribute(getTabBoxElement().getGridWidth(), createdField, h);
    applyWidthInPixelsAttribute(getTabBoxElement().getWidthInPixels(), createdField, h);

    fillLogic(createdField);

    TabElementImportOperation.processTabs(getTabBoxElement().getTabs(), createdField, getSamlFormContext());
  }

  @Override
  public String getOperationName() {
    return "Create tabbox";
  }

  public TabBoxElement getTabBoxElement() {
    return m_tabBoxElement;
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getTabBoxElement() == null) {
      throw new IllegalArgumentException("tabbox element cannot be null");
    }
  }
}
