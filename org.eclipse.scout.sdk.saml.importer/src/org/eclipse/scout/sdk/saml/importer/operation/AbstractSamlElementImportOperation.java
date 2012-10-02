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

import org.eclipse.scout.nls.sdk.model.INlsEntry;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.workspace.IScoutProject;

/**
 * <h3>{@link AbstractSamlElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 25.09.2012
 */
public abstract class AbstractSamlElementImportOperation implements IOperation {
  private SamlContext m_samlContext;

  public SamlContext getSamlContext() {
    return m_samlContext;
  }

  public void setSamlContext(SamlContext samlContext) {
    m_samlContext = samlContext;
  }

  protected IScoutProject getCurrentScoutModule() {
    return getSamlContext().getCurrentScoutModule();
  }

  protected INlsEntry getNlsEntry(String key) {
    return getCurrentScoutModule().getNlsProject().getEntry(key);
  }
}
