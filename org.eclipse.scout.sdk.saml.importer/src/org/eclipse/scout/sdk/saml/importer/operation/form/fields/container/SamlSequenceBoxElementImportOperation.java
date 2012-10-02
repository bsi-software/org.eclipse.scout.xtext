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
package org.eclipse.scout.sdk.saml.importer.operation.form.fields.container;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.saml.saml.SequenceBoxElement;
import org.eclipse.scout.sdk.operation.form.field.SequenceBoxNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlSequenceBoxElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlSequenceBoxElementImportOperation extends AbstractBoxElementImportOperation {

  private SequenceBoxElement m_sequenceBoxElement;
  public static final String SUFFIX = SdkProperties.SUFFIX_BOX;

  @Override
  public String getOperationName() {
    return "Create sequence box";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getSequenceBoxElement() == null) {
      throw new IllegalArgumentException("sequence box element cannot be null.");
    }
  }

  @Override
  public IType createBox(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    SequenceBoxNewOperation o = new SequenceBoxNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getSequenceBoxElement().getName() + SUFFIX);
    o.validate();
    o.run(monitor, workingCopyManager);
    IType createdField = o.getCreatedField();
    ITypeHierarchy h = createdField.newSupertypeHierarchy(monitor);

    overrideMethod(monitor, workingCopyManager, createdField, h, "getConfiguredAutoCheckFromTo", "return false;");

    applyAbstractFormFieldProperties(monitor, workingCopyManager, getSequenceBoxElement().getProperties(), createdField, h);

    fillFormFieldLogic(monitor, workingCopyManager, getSequenceBoxElement().getChildren(), createdField);

    return createdField;
  }

  public SequenceBoxElement getSequenceBoxElement() {
    return m_sequenceBoxElement;
  }

  public void setSequenceBoxElement(SequenceBoxElement sequenceBoxElement) {
    m_sequenceBoxElement = sequenceBoxElement;
  }
}
