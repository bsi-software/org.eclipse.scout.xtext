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
import org.eclipse.scout.saml.saml.DateElement;
import org.eclipse.scout.sdk.operation.form.field.DateFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link SamlDateElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlDateElementImportOperation extends AbstractSamlFormFieldElementOperation {

  private DateElement m_dateElement;
  public static final String SUFFIX = SdkProperties.SUFFIX_FORM_FIELD;

  @Override
  public String getOperationName() {
    return "Create date field";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getDateElement() == null) {
      throw new IllegalArgumentException("date element cannot be null");
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    DateFieldNewOperation o = new DateFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getDateElement().getName() + SUFFIX);
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType createdField = o.getCreatedField();
    ITypeHierarchy h = createdField.newSupertypeHierarchy(getSamlContext().getMonitor());

    applyMandatoryAttribute(getDateElement().getMandatory(), createdField, h);
    applyFormFieldProperties(createdField, h);
    fillFormFieldLogic(createdField);
  }

  public DateElement getDateElement() {
    return m_dateElement;
  }

  public void setDateElement(DateElement dateElement) {
    m_dateElement = dateElement;
  }
}
