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
import org.eclipse.jdt.core.Signature;
import org.eclipse.scout.saml.saml.SmartFieldElementProperties;
import org.eclipse.scout.saml.saml.SmartfieldElement;
import org.eclipse.scout.saml.saml.SmartfieldElementCodeAttribute;
import org.eclipse.scout.saml.saml.SmartfieldElementLookupAttribute;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.form.field.SmartFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlSmartfieldElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlSmartfieldElementImportOperation extends AbstractSamlFormFieldElementOperation {

  private SmartfieldElement m_smartfieldElement;
  public static final String SUFFIX = SdkProperties.SUFFIX_FORM_FIELD;

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
    for (SmartFieldElementProperties p : getSmartfieldElement().getProperties()) {
      if (p.getValue_type() != null) {
        return p.getValue_type().getValue();//.getQualifiedName('.');
      }
    }
    return Object.class.getName();
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    SmartFieldNewOperation o = new SmartFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getSmartfieldElement().getName() + SUFFIX);
    //operation.setSuperTypeSignature(Signature.createTypeSignature("ch.raiffeisen.dialba.common.client.ui.forms.fields.AbstractDialbaSmartField<" + getValueType() + ">", true));
    o.setSuperTypeSignature(Signature.createTypeSignature(RuntimeClasses.AbstractSmartField + "<" + getValueType() + ">", true));
    o.validate();
    o.run(monitor, workingCopyManager);
    IType createdField = o.getCreatedField();

    for (SmartFieldElementProperties p : getSmartfieldElement().getProperties()) {
      applyCodeAttribute(monitor, workingCopyManager, p.getCode(), createdField);
      applyLookupAttribute(monitor, workingCopyManager, p.getLookup(), createdField);
      if (p.getValueFieldProperties() != null) {
        applyMandatoryAttribute(monitor, workingCopyManager, p.getValueFieldProperties().getMandatory(), createdField);
        applyAbstractFormFieldProperties(monitor, workingCopyManager, p.getValueFieldProperties().getFieldproperties(), createdField);
      }
    }

    fillFormFieldLogic(monitor, workingCopyManager, getSmartfieldElement().getLogic(), createdField);
  }

  public SmartfieldElement getSmartfieldElement() {
    return m_smartfieldElement;
  }

  public void setSmartfieldElement(SmartfieldElement smartfieldElement) {
    m_smartfieldElement = smartfieldElement;
  }

  protected void applyCodeAttribute(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, SmartfieldElementCodeAttribute a, IType field) throws CoreException, IllegalArgumentException {
    if (a != null) {
      overrideMethod(monitor, workingCopyManager, field, "getConfiguredCodeType", "return " + a.getValue().getName() + "CodeType.class;");
    }
  }

  protected void applyLookupAttribute(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, SmartfieldElementLookupAttribute a, IType field) throws CoreException, IllegalArgumentException {
    if (a != null) {
      overrideMethod(monitor, workingCopyManager, field, "getConfiguredLookupCall", "return " + a.getValue().getName() + "LookupCall.class;");
    }
  }
}
