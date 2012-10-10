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
import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.sdk.operation.form.field.LongFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link SamlLongElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlLongElementImportOperation extends AbstractSamlFormFieldElementOperation {

  private LongElement m_longElement;
  public static final String SUFFIX = SdkProperties.SUFFIX_FORM_FIELD;

  @Override
  public String getOperationName() {
    return "Create long field";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getLongElement() == null) {
      throw new IllegalArgumentException("long element cannot be null");
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    LongFieldNewOperation o = new LongFieldNewOperation(getSamlFormContext().getCurrentParentBox());
    o.setFormatSource(false);
    o.setTypeName(getLongElement().getName() + SUFFIX);
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType createdField = o.getCreatedField();
    ITypeHierarchy h = createdField.newSupertypeHierarchy(getSamlContext().getMonitor());

    applyMandatoryAttribute(getLongElement().getMandatory(), createdField, h);
    applyFormFieldProperties(createdField, h);
    fillFormFieldLogic(createdField);
  }

  public LongElement getLongElement() {
    return m_longElement;
  }

  public void setLongElement(LongElement longElement) {
    m_longElement = longElement;
  }

}
