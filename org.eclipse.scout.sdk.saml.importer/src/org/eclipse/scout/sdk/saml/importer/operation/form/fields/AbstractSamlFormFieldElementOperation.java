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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.saml.saml.AbstractFieldElement;
import org.eclipse.scout.saml.saml.AbstractFieldProperties;
import org.eclipse.scout.saml.saml.AbstractValueFieldElement;
import org.eclipse.scout.saml.saml.BooleanType;
import org.eclipse.scout.saml.saml.DateElement;
import org.eclipse.scout.saml.saml.DoubleElement;
import org.eclipse.scout.saml.saml.EnabledAttribue;
import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.saml.saml.MandatoryAttribue;
import org.eclipse.scout.saml.saml.MasterAttribute;
import org.eclipse.scout.saml.saml.SequenceBoxElement;
import org.eclipse.scout.saml.saml.SmartfieldElement;
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.saml.TextAttribute;
import org.eclipse.scout.saml.saml.VisibleAttribue;
import org.eclipse.scout.saml.saml.ZregBoxElement;
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
  private AbstractFieldElement m_fieldElement;

  protected void fillFormFieldLogic(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, EList<? extends EObject> children, IType createdField) throws CoreException, IllegalArgumentException {
    SamlLogicFillOperation slfo = new SamlLogicFillOperation();
    //TODO: should be part of abstractfield: remove children param and iterate over m_fieldelement
    slfo.setLogicSourceType(createdField);
    slfo.setSamlContext(getSamlContext());
    slfo.setChildElements(children);

    slfo.setClientType(getSamlFormContext().getClientType());
    slfo.setClientInterface(getSamlFormContext().getClientInterface());

    slfo.setServerType(getSamlFormContext().getServerType());
    slfo.setServerInterface(getSamlFormContext().getServerInterface());

    slfo.setFormDataType(getSamlFormContext().getFormDataType());
    slfo.setFormType(getSamlFormContext().getFormType());

    slfo.validate();
    slfo.run(monitor, workingCopyManager);
  }

  protected void applyMasterAttribute(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, MasterAttribute a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null && a.getValue() != null) {
      String masterFieldName = a.getValue().getName() + getFieldNameSuffix(a.getValue());
      overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredMasterField", "return " + masterFieldName + ".class;");
      overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredMasterRequired", "return true;");
    }
  }

  private String getFieldNameSuffix(AbstractValueFieldElement field) {
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
    else if (field instanceof ZregBoxElement) {
      return SamlZregBoxElementImportOperation.SUFFIX;
    }
    else {
      throw new IllegalArgumentException("Unknown EObject field type: " + field.getName());
    }
  }

  protected void applyAbstractFormFieldProperties(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, EList<? extends AbstractFieldProperties> properties, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    for (AbstractFieldProperties property : properties) {
      applyAbstractFormFieldProperties(monitor, workingCopyManager, property, field, h);
    }
  }

  protected void applyAbstractFormFieldProperties(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, AbstractFieldProperties property, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (property != null) {
      applyEnabledAttribute(monitor, workingCopyManager, property.getEnabled(), field, h);
      applyMasterAttribute(monitor, workingCopyManager, property.getMaster(), field, h);
      applyTextAttribute(monitor, workingCopyManager, property.getText(), field, h);
      applyVisibleAttribute(monitor, workingCopyManager, property.getVisible(), field, h);
    }
  }

  protected void applyTextAttribute(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, TextAttribute a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null && StringUtility.hasText(a.getValue().getName())) {
      // field has a label
      overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredLabel", "return TEXTS.get(\"" + a.getValue().getName() + "\");");
    }
    else {
      // field has no label: hide it
      //overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredLabelVisible", "return false;");
    }
  }

  protected void applyVisibleAttribute(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, VisibleAttribue a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null && a.getValue().equals(BooleanType.FALSE)) {
      overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredVisible", "return false;");
    }
  }

  protected void applyEnabledAttribute(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, EnabledAttribue a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null && a.getValue().equals(BooleanType.FALSE)) {
      overrideMethod(monitor, workingCopyManager, field, h, "getConfiguredEnabled", "return false;");
    }
  }

  protected void applyMandatoryAttribute(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, MandatoryAttribue a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null && a.getValue().equals(BooleanType.TRUE)) {
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
    MethodOverrideOperation op = new MethodOverrideOperation(declaringType, methodName, true);
    op.setSimpleBody(body);
    op.setSuperTypeHierarchy(h);
    op.validate();
    op.run(monitor, workingCopyManager);
    //}
  }

  public static void dispatchFieldElements(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, AbstractFieldElement field, SamlContext context, SamlFormContext formContext) throws CoreException {
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
    else if (field instanceof ZregBoxElement) {
      SamlZregBoxElementImportOperation fieldOp = new SamlZregBoxElementImportOperation();
      fieldOp.setZregBoxElement((ZregBoxElement) field);
      op = fieldOp;
    }
    else {
      throw new IllegalArgumentException("Unknown EObject field type: " + field);
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

  public AbstractFieldElement getFieldElement() {
    return m_fieldElement;
  }

  public void setFieldElement(AbstractFieldElement fieldElement) {
    m_fieldElement = fieldElement;
  }
}
