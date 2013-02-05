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
package org.eclipse.scout.sdk.saml.importer.operation.logic;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;

/**
 * <h3>{@link NamedTopLevelLogicImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 04.02.2013
 */
public class NamedTopLevelLogicImportOperation extends AbstractSamlElementImportOperation {

  @Override
  public void validate() throws IllegalArgumentException {
    if (getElement() == null) {
      throw new IllegalArgumentException("logic element cannot be null");
    }
    if (!StringUtility.hasText(getElement().getName())) {
      throw new IllegalArgumentException("only a named logic element is allowed on top level.");
    }
  }

  @Override
  protected void run() throws CoreException, IllegalArgumentException {
    // nothing to do at the moment.
  }

  @Override
  protected LogicElement getElement() {
    return (LogicElement) super.getElement();
  }
}
