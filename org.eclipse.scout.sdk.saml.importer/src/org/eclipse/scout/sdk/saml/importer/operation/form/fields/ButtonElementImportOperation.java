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
import org.eclipse.scout.saml.saml.ButtonElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.sdk.operation.form.field.ButtonFieldNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.menu.MenuElementImportOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link ButtonElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class ButtonElementImportOperation extends AbstractFormFieldElementOperation {

  private ButtonElement m_buttonElement;

  @Override
  public String getOperationName() {
    return "Create button field";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getButtonElement() == null) {
      throw new IllegalArgumentException("button element cannot be null");
    }
  }

  protected void applyProcessButtonAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("false".equals(a)) {
      overrideMethod(field, h, "getConfiguredProcessButton", "return false;");
    }
  }

  @Override
  public final void run() throws CoreException, IllegalArgumentException {
    ButtonFieldNewOperation o = new ButtonFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getButtonElement().getName() + getFieldSuffix());
    o.setSibling(getDefaultSibling());
    String configuredSuperTypeSig = getSuperTypeSigValidated();
    if (configuredSuperTypeSig != null) {
      o.setSuperTypeSignature(configuredSuperTypeSig);
    }
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType createdField = o.getCreatedButton();

    ITypeHierarchy h = createdField.newSupertypeHierarchy(getSamlContext().getMonitor());

    applyFormFieldProperties(createdField, h);
    applyLabelAttribute(getButtonElement().getText(), createdField, h);
    applyProcessButtonAttribute(getButtonElement().getProcessButton(), createdField, h);
    applyGridWidthAttribute(getButtonElement().getGridWidth(), createdField, h);
    applyWidthInPixelsAttribute(getButtonElement().getWidthInPixels(), createdField, h);

    fillLogic(createdField);

    MenuElementImportOperation.processMenus(getButtonElement().getMenus(), createdField, getSamlFormContext());
  }

  public ButtonElement getButtonElement() {
    return m_buttonElement;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_buttonElement = (ButtonElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_buttonElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_BUTTON;
  }

}
