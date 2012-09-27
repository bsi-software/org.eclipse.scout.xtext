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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.scout.saml.saml.SmartfieldElement;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlSmartfieldElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlSmartfieldElementImportOperation extends AbstractSamlFormFieldElementOperation {

  private SmartfieldElement m_smartfieldElement;

  @Override
  public String getOperationName() {
    return "Create smartfield";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getSmartfieldElement() == null) {
      throw new IllegalArgumentException("smartfield element cannot be null");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
  }

  public SmartfieldElement getSmartfieldElement() {
    return m_smartfieldElement;
  }

  public void setSmartfieldElement(SmartfieldElement smartfieldElement) {
    m_smartfieldElement = smartfieldElement;
  }

}
