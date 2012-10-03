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
import org.eclipse.scout.saml.saml.CustomFieldElement;
import org.eclipse.scout.saml.saml.DateElement;
import org.eclipse.scout.saml.saml.DoubleElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.saml.saml.SequenceBoxElement;
import org.eclipse.scout.saml.saml.SmartfieldElement;
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.saml.saml.ValueFieldElement;
import org.eclipse.scout.sdk.operation.method.MethodOverrideOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.saml.importer.operation.form.fields.container.SamlSequenceBoxElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.logic.SamlLogicFillOperation;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link AbstractSamlFormFieldElementOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public abstract class AbstractSamlFormFieldElementOperation extends AbstractSamlElementImportOperation {

  private SamlFormContext m_samlContext;
  private FormFieldElement m_fieldElement;

  protected void fillFormFieldLogic(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, IType createdField) throws CoreException, IllegalArgumentException {
    SamlLogicFillOperation slfo = new SamlLogicFillOperation();
    slfo.setLogicSourceType(createdField);
    slfo.setSamlContext(getSamlContext());
    slfo.setSamlFormContext(getSamlFormContext());
    slfo.setLogicElements(getFieldElement().getLogic());

    slfo.validate();
    slfo.run(monitor, workingCopyManager);
  }

  protected void applyMasterAttribute(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, ValueFieldElement a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null && a.getName() != null) {
      String fieldNameSuffix = getFieldNameSuffix(a);
      if (fieldNameSuffix != null) {
        String masterFieldName = a.getName() + fieldNameSuffix;
        overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredMasterField", "return " + masterFieldName + ".class;");
        overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredMasterRequired", "return true;");
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
    else if (field instanceof CustomFieldElement) {
      //TODO custom field
      return null;
    }
    else {
      throw new IllegalArgumentException("Unknown EObject field type: " + field.getClass());
    }
  }

  protected void applyFormFieldProperties(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    applyEnabledAttribute(monitor, workingCopyManager, getFieldElement().getEnabled(), field, h);
    applyMasterAttribute(monitor, workingCopyManager, getFieldElement().getMaster(), field, h);
    applyTextAttribute(monitor, workingCopyManager, getFieldElement().getText(), field, h);
    applyVisibleAttribute(monitor, workingCopyManager, getFieldElement().getVisible(), field, h);
  }

  protected void applyTextAttribute(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, TranslationElement a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null) {
      // field has a label
      overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredLabel", "return TEXTS.get(\"" + a.getName() + "\");");
    }
    else {
      // field has no label: hide it
      overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredLabelVisible", "return false;");
    }
  }

  protected void applyVisibleAttribute(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("false".equals(a)) {
      overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredVisible", "return false;");
    }
  }

  protected void applyEnabledAttribute(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("false".equals(a)) {
      overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredEnabled", "return false;");
    }
  }

  protected void applyMandatoryAttribute(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("true".equals(a)) {
      overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredMandatory", "return true;");
    }
  }

  protected void overrideMethod(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, IType declaringType, ITypeHierarchy h, String methodName, String body) throws CoreException, IllegalArgumentException {
    /*IMethod method = TypeUtility.getMethod(declaringType, methodName);
    if (TypeUtility.exists(method)) {
      MethodUpdateContentOperation operation = new MethodUpdateContentOperation(method, null, true);
      operation.setSimpleBody(body);
      operation.validate();
      operation.run(monitor, workingCopyManager);
    }
    else {*/
    MethodOverrideOperation op = new MethodOverrideOperation(declaringType, methodName, false);
    op.setSimpleBody(body);
    op.setSuperTypeHierarchy(h);
    op.validate();
    op.run(monitor, workingCopyManager);
    //}
  }

  public static void dispatchFieldElements(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, FormFieldElement field, SamlContext context, SamlFormContext formContext) throws CoreException {
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
    else if (field instanceof CustomFieldElement) {
      //TODO custom field
      /*SamlZregBoxElementImportOperation fieldOp = new SamlZregBoxElementImportOperation();
      fieldOp.setZregBoxElement((ZregBoxElement) field);
      op = fieldOp;*/
    }
    else {
      throw new IllegalArgumentException("Unknown EObject field type: " + field.getClass());
    }

    if (op != null) {
      op.setSamlContext(context);
      op.setSamlFormContext(formContext);
      op.setFieldElement(field);
      op.validate();
      op.run(monitor, workingCopyManager);
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
