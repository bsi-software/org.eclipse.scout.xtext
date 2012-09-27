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
import org.eclipse.scout.saml.saml.ZregBoxElement;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlZregBoxElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlZregBoxElementImportOperation extends AbstractSamlFormFieldElementOperation {

  private ZregBoxElement m_zregBoxElement;

  @Override
  public String getOperationName() {
    return "Create ZregBox";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getZregBoxElement() == null) {
      throw new IllegalArgumentException("zregbox element cannot be null");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
  }

  public ZregBoxElement getZregBoxElement() {
    return m_zregBoxElement;
  }

  public void setZregBoxElement(ZregBoxElement zregBoxElement) {
    m_zregBoxElement = zregBoxElement;
  }

}
