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
import org.eclipse.jdt.core.Signature;
import org.eclipse.scout.saml.saml.ZregBoxElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.form.field.FormFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlZregBoxElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlZregBoxElementImportOperation extends AbstractSamlFormFieldElementOperation {

  private ZregBoxElement m_zregBoxElement;
  public static final String SUFFIX = SdkProperties.SUFFIX_BOX;

  @Override
  public String getOperationName() {
    return "Create ZregBox";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getZregBoxElement() == null) {
      throw new IllegalArgumentException("zregbox element cannot be null");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    FormFieldNewOperation newOp = new FormFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    final String typeName = getZregBoxElement().getName();
    newOp.setTypeName(typeName + SUFFIX);
    //newOp.setSuperTypeSignature(Signature.createTypeSignature("ch.raiffeisen.dialba.common.client.ui.forms.fields.ZregSequenceBoxAbs", true));
    newOp.setSuperTypeSignature(Signature.createTypeSignature(RuntimeClasses.AbstractSmartField + "<java.lang.Long>", true));
    newOp.validate();
    newOp.run(monitor, workingCopyManager);
    IType createdField = newOp.getCreatedFormField();
    ITypeHierarchy h = createdField.newSupertypeHierarchy(monitor);

    /*MethodOverrideOperation operation = new MethodOverrideOperation(createdField, "getBoxData", false) {
      @Override
      protected String createMethodBody(IImportValidator validator) throws JavaModelException {
        String formData = validator.getTypeName(Signature.createTypeSignature(getSamlFormContext().getFormDataType().getFullyQualifiedName(), true));
        return "return new " + formData + "().get" + typeName + "Box();";
      }
    };
    operation.validate();
    operation.run(monitor, workingCopyManager);

    overrideMethod(monitor, workingCopyManager, createdField, "execInitField", "getZregNumberField().setMandatory(true);\ngetZregKurzBezField().setMandatory(true);");
     */
    applyAbstractFormFieldProperties(monitor, workingCopyManager, getZregBoxElement().getProperties(), createdField, h);

    fillFormFieldLogic(monitor, workingCopyManager, getZregBoxElement().getChildren(), createdField);
  }

  public ZregBoxElement getZregBoxElement() {
    return m_zregBoxElement;
  }

  public void setZregBoxElement(ZregBoxElement zregBoxElement) {
    m_zregBoxElement = zregBoxElement;
  }

}
