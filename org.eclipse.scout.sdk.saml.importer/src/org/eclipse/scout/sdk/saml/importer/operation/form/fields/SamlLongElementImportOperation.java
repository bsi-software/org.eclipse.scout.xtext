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
import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlLongElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlLongElementImportOperation extends AbstractSamlFormFieldElementOperation {

  private LongElement m_longElement;

  @Override
  public String getOperationName() {
    return "Create long field";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getLongElement() == null) {
      throw new IllegalArgumentException("long element cannot be null");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
  }

  public LongElement getLongElement() {
    return m_longElement;
  }

  public void setLongElement(LongElement longElement) {
    m_longElement = longElement;
  }

}
