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
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.sdk.operation.form.field.StringFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link SamlStringElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlStringElementImportOperation extends AbstractValueFieldElementImportOperation {

  private StringElement m_stringElement;

  @Override
  public String getOperationName() {
    return "Create string field";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getStringElement() == null) {
      throw new IllegalArgumentException("string element cannot be null");
    }
  }

  protected void applyMaxLengthAttribute(int maxlen, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (maxlen != 0 && maxlen != 4000) {
      overrideMethod(field, h, "getConfiguredMaxLength", "return " + maxlen + ";");
    }
  }

  @Override
  protected IType createField() throws CoreException, IllegalArgumentException {
    StringFieldNewOperation o = new StringFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getStringElement().getName() + getFieldSuffix());
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType createdField = o.getCreatedField();
    applyMaxLengthAttribute(getStringElement().getMaxlen(), createdField, null);
    return createdField;
  }

  public StringElement getStringElement() {
    return m_stringElement;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_stringElement = (StringElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_stringElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_FORM_FIELD;
  }

}
