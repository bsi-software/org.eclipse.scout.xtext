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
import org.eclipse.scout.saml.saml.DoubleElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.sdk.operation.form.field.DoubleFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link DoubleElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class DoubleElementImportOperation extends AbstractValueFieldElementImportOperation {

  private DoubleElement m_doubleElement;

  @Override
  public String getOperationName() {
    return "Create double field";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getDoubleElement() == null) {
      throw new IllegalArgumentException("double element cannot be null");
    }
  }

  @Override
  protected IType createField() throws CoreException, IllegalArgumentException {
    DoubleFieldNewOperation o = new DoubleFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getDoubleElement().getName() + getFieldSuffix());
    o.setSibling(getDefaultSibling());
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    return o.getCreatedField();
  }

  public DoubleElement getDoubleElement() {
    return m_doubleElement;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_doubleElement = (DoubleElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_doubleElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_FORM_FIELD;
  }

}
