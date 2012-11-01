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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.operation.util.JavaElementFormatOperation;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlImportPostProcessOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlImportPostProcessOperation implements IOperation {

  private final IType m_type;

  public SamlImportPostProcessOperation(IType t) {
    m_type = t;
  }

  @Override
  public String getOperationName() {
    return "Post processing element";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (!TypeUtility.exists(getType())) {
      throw new IllegalArgumentException("type cannot be null.");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    JavaElementFormatOperation formatOp = new JavaElementFormatOperation(getType(), true);
    formatOp.validate();
    formatOp.run(monitor, workingCopyManager);
  }

  private IType getType() {
    return m_type;
  }
}
