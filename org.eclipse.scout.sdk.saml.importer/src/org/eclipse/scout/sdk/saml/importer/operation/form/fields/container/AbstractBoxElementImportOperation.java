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
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.saml.saml.CompositeFieldElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.sdk.saml.importer.operation.form.fields.AbstractSamlFormFieldElementOperation;

/**
 * <h3>{@link AbstractBoxElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public abstract class AbstractBoxElementImportOperation extends AbstractSamlFormFieldElementOperation {
  @Override
  public final void run() throws CoreException, IllegalArgumentException {
    IType box = createBox();

    ITypeHierarchy h = box.newSupertypeHierarchy(getSamlContext().getMonitor());

    applyFormFieldProperties(box, h);
    fillFormFieldLogic(box);

    getSamlFormContext().pushParentBox(box);
    CompositeFieldElement container = (CompositeFieldElement) getFieldElement();
    for (FormFieldElement o : container.getFields()) {
      dispatchFieldElements(o, getSamlContext(), getSamlFormContext());
    }
    getSamlFormContext().popParentBox();
  }

  protected abstract IType createBox() throws CoreException, IllegalArgumentException;

}
