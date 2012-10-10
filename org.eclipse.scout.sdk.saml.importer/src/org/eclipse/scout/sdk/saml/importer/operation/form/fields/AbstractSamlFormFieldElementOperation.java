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
import org.eclipse.scout.saml.saml.CustomFieldElement;
import org.eclipse.scout.saml.saml.DateElement;
import org.eclipse.scout.saml.saml.DoubleElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.GroupBoxElement;
import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.saml.saml.SequenceBoxElement;
import org.eclipse.scout.saml.saml.SmartfieldElement;
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.saml.saml.ValueFieldElement;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.saml.importer.operation.form.fields.container.SamlGroupBoxElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.fields.container.SamlSequenceBoxElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.logic.SamlLogicFillOperation;

/**
 * <h3>{@link AbstractSamlFormFieldElementOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public abstract class AbstractSamlFormFieldElementOperation extends AbstractSamlElementImportOperation {

  private SamlFormContext m_samlContext;
  private FormFieldElement m_fieldElement;

  protected void fillFormFieldLogic(IType createdField) throws CoreException, IllegalArgumentException {
    SamlLogicFillOperation slfo = new SamlLogicFillOperation();
    slfo.setLogicSourceType(createdField);
    slfo.setSamlContext(getSamlContext());
    slfo.setSamlFormContext(getSamlFormContext());
    slfo.setLogicElements(getFieldElement().getLogic());

    slfo.validate();
    slfo.run();
  }

  protected void applyMasterAttribute(ValueFieldElement a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null && a.getName() != null) {
      String fieldNameSuffix = getFieldNameSuffix(a);
      if (fieldNameSuffix != null) {
        String masterFieldName = a.getName() + fieldNameSuffix;
        overrideMethod(field, h, "getConfiguredMasterField", "return " + masterFieldName + ".class;");
        overrideMethod(field, h, "getConfiguredMasterRequired", "return true;");
      }
    }
  }

  private String getFieldNameSuffix(FormFieldElement field) {
    if (field instanceof SequenceBoxElement) {
      return SamlSequenceBoxElementImportOperation.SUFFIX;
    }
    else if (field instanceof StringElement) {
      return SamlStringElementImportOperation.SUFFIX;
    }
    else if (field instanceof DoubleElement) {
      return SamlDoubleElementImportOperation.SUFFIX;
    }
    else if (field instanceof LongElement) {
      return SamlLongElementImportOperation.SUFFIX;
    }
    else if (field instanceof DateElement) {
      return SamlDateElementImportOperation.SUFFIX;
    }
    else if (field instanceof SmartfieldElement) {
      return SamlSmartfieldElementImportOperation.SUFFIX;
    }
    else if (field instanceof GroupBoxElement) {
      return SamlGroupBoxElementImportOperation.SUFFIX;
    }
    else if (field instanceof CustomFieldElement) {
      return SamlCustomFieldElementImportOperation.SUFFIX;
    }
    else {
      throw new IllegalArgumentException("Unknown EObject field type: " + field.getClass());
    }
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
    AbstractSamlFormFieldElementOperation op = null;
    if (field instanceof SequenceBoxElement) {
      SamlSequenceBoxElementImportOperation ssbeio = new SamlSequenceBoxElementImportOperation();
      ssbeio.setSequenceBoxElement((SequenceBoxElement) field);
      op = ssbeio;
    }
    else if (field instanceof StringElement) {
      SamlStringElementImportOperation fieldOp = new SamlStringElementImportOperation();
      fieldOp.setStringElement((StringElement) field);
      op = fieldOp;
    }
    else if (field instanceof DoubleElement) {
      SamlDoubleElementImportOperation fieldOp = new SamlDoubleElementImportOperation();
      fieldOp.setDoubleElement((DoubleElement) field);
      op = fieldOp;
    }
    else if (field instanceof LongElement) {
      SamlLongElementImportOperation fieldOp = new SamlLongElementImportOperation();
      fieldOp.setLongElement((LongElement) field);
      op = fieldOp;
    }
    else if (field instanceof DateElement) {
      SamlDateElementImportOperation fieldOp = new SamlDateElementImportOperation();
      fieldOp.setDateElement((DateElement) field);
      op = fieldOp;
    }
    else if (field instanceof SmartfieldElement) {
      SamlSmartfieldElementImportOperation fieldOp = new SamlSmartfieldElementImportOperation();
      fieldOp.setSmartfieldElement((SmartfieldElement) field);
      op = fieldOp;
    }
    else if (field instanceof GroupBoxElement) {
      SamlGroupBoxElementImportOperation fieldOp = new SamlGroupBoxElementImportOperation();
      fieldOp.setGroupBoxElement((GroupBoxElement) field);
      op = fieldOp;
    }
    else if (field instanceof CustomFieldElement) {
      SamlCustomFieldElementImportOperation fieldOp = new SamlCustomFieldElementImportOperation();
      fieldOp.setCustomFieldElement((CustomFieldElement) field);
      op = fieldOp;
    }
    else {
      throw new IllegalArgumentException("Unknown EObject field type: " + field.getClass());
    }

    if (op != null) {
      op.setSamlContext(context);
      op.setSamlFormContext(formContext);
      op.setFieldElement(field);
      op.validate();
      op.run();
    }
  }

  public SamlFormContext getSamlFormContext() {
    return m_samlContext;
  }

  public void setSamlFormContext(SamlFormContext samlContext) {
    m_samlContext = samlContext;
  }

  public FormFieldElement getFieldElement() {
    return m_fieldElement;
  }

  public void setFieldElement(FormFieldElement fieldElement) {
    m_fieldElement = fieldElement;
  }
}
