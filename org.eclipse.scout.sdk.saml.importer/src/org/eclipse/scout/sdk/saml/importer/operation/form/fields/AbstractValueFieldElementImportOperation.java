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
import org.eclipse.scout.saml.saml.ValueFieldElement;

/**
 * <h3>{@link AbstractValueFieldElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 11.10.2012
 */
public abstract class AbstractValueFieldElementImportOperation extends AbstractFormFieldElementOperation {
  @Override
  public final void run() throws CoreException, IllegalArgumentException {
    IType createdField = createField();

    ITypeHierarchy h = createdField.newSupertypeHierarchy(getSamlContext().getMonitor());

    ValueFieldElement valueFieldElement = (ValueFieldElement) getFieldElement();
    applyMandatoryAttribute(valueFieldElement.getMandatory(), createdField, h);
    applyFormFieldProperties(createdField, h);

    fillLogic(createdField);
  }

  protected abstract IType createField() throws CoreException, IllegalArgumentException;
}
