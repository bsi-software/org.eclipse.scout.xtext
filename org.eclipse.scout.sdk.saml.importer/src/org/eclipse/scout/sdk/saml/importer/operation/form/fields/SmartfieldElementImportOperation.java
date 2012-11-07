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
import org.eclipse.jdt.core.Signature;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.SmartfieldElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.form.field.SmartFieldNewOperation;
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

  private String getValueType() {
    if (getSmartfieldElement().getValueType() != null) {
      return getSmartfieldElement().getValueType();
    }
    return Object.class.getName();
  }

  @Override
  protected IType createField() throws CoreException, IllegalArgumentException {
    SmartFieldNewOperation o = new SmartFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getSmartfieldElement().getName() + getFieldSuffix());
    o.setSuperTypeSignature(Signature.createTypeSignature(RuntimeClasses.AbstractSmartField + "<" + getValueType() + ">", true));
    o.setSibling(getDefaultSibling());
    if (getSmartfieldElement().getSuperType() != null) {
      o.setSuperTypeSignature(Signature.createTypeSignature(getSmartfieldElement().getSuperType().getDefinition(), true));
    }
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType createdField = o.getCreatedField();
    ITypeHierarchy h = createdField.newSupertypeHierarchy(getSamlContext().getMonitor());

    overrideMethod(createdField, h, "getConfiguredTreat0AsNull", "return false;");
    applyCodeAttribute(getSmartfieldElement().getCode(), createdField, h);
    applyLookupAttribute(getSmartfieldElement().getLookup(), createdField, h);

    MenuElementImportOperation.processMenus(getSmartfieldElement().getMenus(), createdField, getSamlFormContext());

    return createdField;
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

  protected void applyCodeAttribute(CodeElement a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null && a.getName() != null) {
      overrideMethod(field, h, "getConfiguredCodeType", "return " + a.getName() + "CodeType.class;");
    }
  }

  protected void applyLookupAttribute(LookupElement a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null && a.getName() != null) {
      overrideMethod(field, h, "getConfiguredLookupCall", "return " + a.getName() + "LookupCall.class;");
    }
  }
}
