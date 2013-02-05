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
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.sdk.workspace.IScoutProject;

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
    String moduleName = getElement().getName();
    IScoutProject curModule = findScoutProjectRec(getSamlContext().getRootProject(), moduleName);
    if (curModule == null) {
      throw new IllegalArgumentException("module '" + moduleName + "' could not be found.");
    }
    else {
      if (curModule.getClientBundle() == null || curModule.getSharedBundle() == null || curModule.getServerBundle() == null) {
        throw new IllegalArgumentException("module '" + moduleName + "' is not complete. It must contain a client, server & shared bundle.");
      }
      else {
        getSamlContext().setCurrentScoutModule(curModule);
      }
    }
  }

  private IScoutProject findScoutProjectRec(IScoutProject parent, String searchName) {
    if (parent.getProjectName().equals(searchName)) {
      return parent;
    }
    for (IScoutProject child : parent.getSubProjects()) {
      IScoutProject result = findScoutProjectRec(child, searchName);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  @Override
  protected ModuleElement getElement() {
    return (ModuleElement) super.getElement();
  }
}
