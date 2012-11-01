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
import org.eclipse.scout.saml.saml.CustomFieldElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.sdk.operation.form.field.FormFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link CustomFieldElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class CustomFieldElementImportOperation extends AbstractFormFieldElementOperation {

  private CustomFieldElement m_customElement;

  @Override
  public String getOperationName() {
    return "Create custom field";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getCustomFieldElement() == null) {
      throw new IllegalArgumentException("custom field element cannot be null");
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    String superClass = getCustomFieldElement().getTemplate().getDefinition().getQualifiedName();

    FormFieldNewOperation o = new FormFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getCustomFieldElement().getName() + getFieldSuffix());
    o.setSuperTypeSignature(Signature.createTypeSignature(superClass, true));
    o.setSiblingField(getDefaultSibling());
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType createdField = o.getCreatedFormField();

    ITypeHierarchy h = createdField.newSupertypeHierarchy(getSamlContext().getMonitor());

    applyFormFieldProperties(createdField, h);
    fillLogic(createdField);
  }

  public CustomFieldElement getCustomFieldElement() {
    return m_customElement;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_customElement = (CustomFieldElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_customElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_FORM_FIELD;
  }
}
