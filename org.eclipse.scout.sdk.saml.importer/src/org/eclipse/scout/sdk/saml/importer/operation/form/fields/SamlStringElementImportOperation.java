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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.saml.StringElementMaxlenAttribute;
import org.eclipse.scout.saml.saml.StringElementProperties;
import org.eclipse.scout.sdk.operation.form.field.StringFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlStringElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlStringElementImportOperation extends AbstractSamlFormFieldElementOperation {

  private StringElement m_stringElement;
  public static final String SUFFIX = SdkProperties.SUFFIX_FORM_FIELD;

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

  protected void applyMaxLengthAttribute(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, StringElementMaxlenAttribute a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null) {
      overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredMaxLength", "return " + a.getValue() + ";");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    StringFieldNewOperation o = new StringFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getStringElement().getName() + SUFFIX);
    o.validate();
    o.run(monitor, workingCopyManager);
    IType createdField = o.getCreatedField();
    ITypeHierarchy h = createdField.newSupertypeHierarchy(monitor);

    for (StringElementProperties p : getStringElement().getProperties()) {
      applyMaxLengthAttribute(monitor, workingCopyManager, p.getMaxlen(), createdField, h);
      applyMandatoryAttribute(monitor, workingCopyManager, p.getValueFieldProperties().getMandatory(), createdField, h);
      applyAbstractFormFieldProperties(monitor, workingCopyManager, p.getValueFieldProperties().getFieldproperties(), createdField, h);
    }

    fillFormFieldLogic(monitor, workingCopyManager, getStringElement().getLogic(), createdField);
  }

  public StringElement getStringElement() {
    return m_stringElement;
  }

  public void setStringElement(StringElement stringElement) {
    m_stringElement = stringElement;
  }

}
