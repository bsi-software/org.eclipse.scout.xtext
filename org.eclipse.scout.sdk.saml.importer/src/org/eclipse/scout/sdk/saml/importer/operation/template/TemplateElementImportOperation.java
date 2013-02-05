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
package org.eclipse.scout.sdk.saml.importer.operation.template;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.saml.saml.TemplateElement;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.util.type.TypeUtility;

/**
 * <h3>{@link TemplateElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 04.02.2013
 */
public class TemplateElementImportOperation extends AbstractSamlElementImportOperation {

  @Override
  public void validate() throws IllegalArgumentException {
    if (getElement() == null) {
      throw new IllegalArgumentException("template element cannot be null");
    }
    String fqn = getElement().getDefinition();
    if (!TypeUtility.existsType(fqn)) {
      throw new IllegalArgumentException("template definition '" + fqn + "' could not be found in the workspace.");
    }
  }

  @Override
  protected void run() throws CoreException, IllegalArgumentException {
    // nothing to do at the moment.
  }

  @Override
  protected TemplateElement getElement() {
    return (TemplateElement) super.getElement();
  }
}
