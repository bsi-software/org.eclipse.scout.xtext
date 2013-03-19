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
package org.eclipse.scout.sdk.saml.importer.operation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.saml.module.SamlModule;
import org.eclipse.scout.saml.saml.ModuleElement;

/**
 * <h3>{@link ModuleElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 03.02.2013
 */
public class ModuleElementImportOperation extends AbstractSamlElementImportOperation {

  @Override
  public void validate() throws IllegalArgumentException {
    if (getElement() == null) {
      throw new IllegalArgumentException("ModuleElement cannot be null.");
    }
  }

  @Override
  protected void run() throws CoreException, IllegalArgumentException {
    getSamlContext().setCurrentScoutModule(new SamlModule(getElement()));
  }

  @Override
  protected ModuleElement getElement() {
    return (ModuleElement) super.getElement();
  }
}
