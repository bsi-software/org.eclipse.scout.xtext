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
import org.eclipse.scout.saml.saml.DateElement;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlDateElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlDateElementImportOperation extends AbstractSamlFormFieldElementOperation {

  private DateElement m_dateElement;

  @Override
  public String getOperationName() {
    return "Create date field";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getDateElement() == null) {
      throw new IllegalArgumentException("date element cannot be null");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
  }

  public DateElement getDateElement() {
    return m_dateElement;
  }

  public void setDateElement(DateElement dateElement) {
    m_dateElement = dateElement;
  }

}
