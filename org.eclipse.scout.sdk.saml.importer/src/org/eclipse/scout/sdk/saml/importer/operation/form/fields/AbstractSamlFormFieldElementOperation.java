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
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.saml.importer.extension.FormFieldExtension;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.saml.importer.operation.logic.SamlLogicFillOperation;

/**
 * <h3>{@link AbstractSamlFormFieldElementOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public abstract class AbstractSamlFormFieldElementOperation extends AbstractSamlElementImportOperation implements ISamlFormFieldElementOperation {

  private SamlFormContext m_samlContext;

  protected void fillFormFieldLogic(IType createdField) throws CoreException, IllegalArgumentException {
    SamlLogicFillOperation slfo = new SamlLogicFillOperation();
    slfo.setLogicSourceType(createdField);
    slfo.setSamlContext(getSamlContext());
    slfo.setSamlFormContext(getSamlFormContext());
    slfo.setLogicElements(getFieldElement().getLogic());

    slfo.validate();
    slfo.run();
  }

  protected void applyMasterAttribute(FormFieldElement a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null && a.getName() != null) {
      String fieldNameSuffix = getFieldNameSuffix(a);
      if (fieldNameSuffix != null) {
        String masterFieldName = a.getName() + fieldNameSuffix;
        overrideMethod(field, h, "getConfiguredMasterField", "return " + masterFieldName + ".class;");
        overrideMethod(field, h, "getConfiguredMasterRequired", "return true;");
      }
    }
  }

  private String getFieldNameSuffix(FormFieldElement field) throws CoreException {
    ISamlFormFieldElementOperation op = FormFieldExtension.getOperationFor(field);
    if (op == null) {
      throw new IllegalArgumentException("Unknown EObject field type: " + field.getClass());
    }
    return op.getFieldSuffix();
  }

  protected void applyFormFieldProperties(IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    applyEnabledAttribute(getFieldElement().getEnabled(), field, h);
    applyMasterAttribute(getFieldElement().getMaster(), field, h);
    applyTextAttribute(getFieldElement().getText(), field, h);
    applyVisibleAttribute(getFieldElement().getVisible(), field, h);
  }

  protected void applyTextAttribute(TranslationElement a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null) {
      // field has a label
      overrideMethod(field, h, "getConfiguredLabel", "return TEXTS.get(\"" + a.getName() + "\");");
    }
    else {
      // field has no label: hide it
      overrideMethod(field, h, "getConfiguredLabelVisible", "return false;");
    }
  }

  protected void applyVisibleAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("false".equals(a)) {
      overrideMethod(field, h, "getConfiguredVisible", "return false;");
    }
  }

  protected void applyEnabledAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("false".equals(a)) {
      overrideMethod(field, h, "getConfiguredEnabled", "return false;");
    }
  }

  protected void applyMandatoryAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("true".equals(a)) {
      overrideMethod(field, h, "getConfiguredMandatory", "return true;");
    }
  }

  public static void dispatchFieldElements(FormFieldElement field, SamlContext context, SamlFormContext formContext) throws CoreException {
    ISamlFormFieldElementOperation op = FormFieldExtension.getOperationFor(field);
    op.setSamlContext(context);
    op.setSamlFormContext(formContext);
    op.setFieldElement(field);
    op.validate();
    op.run();
  }

  @Override
  public SamlFormContext getSamlFormContext() {
    return m_samlContext;
  }

  @Override
  public void setSamlFormContext(SamlFormContext samlContext) {
    m_samlContext = samlContext;
  }
}
