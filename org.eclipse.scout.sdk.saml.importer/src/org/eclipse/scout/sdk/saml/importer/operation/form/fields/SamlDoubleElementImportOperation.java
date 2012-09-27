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
import org.eclipse.scout.saml.saml.AbstractValueFieldProperties;
import org.eclipse.scout.saml.saml.DoubleElement;
import org.eclipse.scout.sdk.operation.form.field.DoubleFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlDoubleElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlDoubleElementImportOperation extends AbstractSamlFormFieldElementOperation {

  private DoubleElement m_doubleElement;
  public static final String SUFFIX = SdkProperties.SUFFIX_FORM_FIELD;

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
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    DoubleFieldNewOperation o = new DoubleFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getDoubleElement().getName() + SUFFIX);
    o.validate();
    o.run(monitor, workingCopyManager);
    IType createdField = o.getCreatedField();
    ITypeHierarchy h = createdField.newSupertypeHierarchy(monitor);

    for (AbstractValueFieldProperties p : getDoubleElement().getProperties()) {
      applyMandatoryAttribute(monitor, workingCopyManager, p.getMandatory(), createdField, h);
      applyAbstractFormFieldProperties(monitor, workingCopyManager, p.getFieldproperties(), createdField, h);
    }

    fillFormFieldLogic(monitor, workingCopyManager, getDoubleElement().getChildren(), createdField);
  }

  public DoubleElement getDoubleElement() {
    return m_doubleElement;
  }

  public void setDoubleElement(DoubleElement doubleElement) {
    m_doubleElement = doubleElement;
  }

}
