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
import org.eclipse.scout.sdk.operation.util.OrganizeImportOperation;
import org.eclipse.scout.sdk.operation.util.SourceFormatOperation;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlImportPostProcessOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlImportPostProcessOperation implements IOperation {

  private SamlContext m_samlContext;

  @Override
  public String getOperationName() {
    return "Post processing";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getSamlContext() == null) {
      throw new IllegalArgumentException("Saml context cannot be null.");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    for (String fqn : getSamlContext().getModifiedTypes()) {
      IType t = TypeUtility.getType(fqn);

      SourceFormatOperation sfo = new SourceFormatOperation(t);
      sfo.validate();
      try {
        //TODO: check why some types cannot be formatted?
        sfo.run(monitor, workingCopyManager);
      }
      catch (Exception e) {

      }

      OrganizeImportOperation o = new OrganizeImportOperation(t.getCompilationUnit());
      o.validate();
      o.run(monitor, workingCopyManager);
    }
  }

  public SamlContext getSamlContext() {
    return m_samlContext;
  }

  public void setSamlContext(SamlContext samlContext) {
    m_samlContext = samlContext;
  }
}
