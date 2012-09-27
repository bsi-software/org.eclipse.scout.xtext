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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.AbstractFieldElement;
import org.eclipse.scout.saml.saml.SequenceBoxElement;
import org.eclipse.scout.sdk.saml.importer.operation.form.fields.AbstractSamlFormFieldElementOperation;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link AbstractBoxElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public abstract class AbstractBoxElementImportOperation extends AbstractSamlFormFieldElementOperation {
  @Override
  public final void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    IType box = createBox(monitor, workingCopyManager);

    // TODO: change cast to container object (not sequence box)
    getSamlFormContext().pushParentBox(box);
    SequenceBoxElement container = (SequenceBoxElement) getFieldElement();
    for (EObject o : container.getChildren()) {
      if (o instanceof AbstractFieldElement) {
        dispatchFieldElements(monitor, workingCopyManager, (AbstractFieldElement) o, getSamlContext(), getSamlFormContext());
      }
    }
    getSamlFormContext().popParentBox();
  }

  protected abstract IType createBox(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException;

}
