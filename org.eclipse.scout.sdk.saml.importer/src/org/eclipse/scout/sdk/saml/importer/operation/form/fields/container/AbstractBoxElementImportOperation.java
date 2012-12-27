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
import org.eclipse.scout.saml.saml.CompositeFieldElement;
import org.eclipse.scout.sdk.saml.importer.operation.form.fields.AbstractFormFieldElementOperation;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link AbstractBoxElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public abstract class AbstractBoxElementImportOperation extends AbstractFormFieldElementOperation {
  @Override
  public final void run() throws CoreException, IllegalArgumentException {
    CompositeFieldElement container = (CompositeFieldElement) getFieldElement();
    IType box = createBox();

    ITypeHierarchy h = box.newSupertypeHierarchy(getSamlContext().getMonitor());

    applyFormFieldProperties(box, h);
    fillLogic(box);

    getSamlFormContext().pushParentBox(box);
    dispatchFieldElements(container.getFields(), getSamlContext(), getSamlFormContext());
    getSamlFormContext().popParentBox();
  }

  protected abstract IType createBox() throws CoreException, IllegalArgumentException;

  protected void applyColumnsAttribute(int columns, IType mainBox, ITypeHierarchy h) throws IllegalArgumentException, CoreException {
    applyColumnsAttribute(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager(), columns, mainBox, h);
  }

  public static void applyColumnsAttribute(IProgressMonitor monitor, IWorkingCopyManager workingcopyManager, int columns, IType mainBox, ITypeHierarchy h) throws IllegalArgumentException, CoreException {
    if (columns > 0) {
      overrideMethod(monitor, workingcopyManager, mainBox, h, "getConfiguredGridColumnCount", "return " + columns + ";");
    }
  }
}
