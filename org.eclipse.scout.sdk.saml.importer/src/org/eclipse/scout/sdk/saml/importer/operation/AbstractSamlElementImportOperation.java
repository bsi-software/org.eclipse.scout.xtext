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
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.nls.sdk.model.INlsEntry;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.operation.method.MethodOverrideOperation;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;
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

  @Override
  public final void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
  }

  public abstract void run() throws CoreException, IllegalArgumentException;

  public void setSamlContext(SamlContext samlContext) {
    m_samlContext = samlContext;
  }

  protected IScoutProject getCurrentScoutModule() {
    return getSamlContext().getCurrentScoutModule();
  }

  protected INlsEntry getNlsEntry(String key) {
    return getCurrentScoutModule().getNlsProject().getEntry(key);
  }

  protected void overrideMethod(IType declaringType, ITypeHierarchy h, String methodName, String body) throws CoreException, IllegalArgumentException {
    overrideMethod(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager(), declaringType, h, methodName, body);
  }

  protected static void overrideMethod(IProgressMonitor monitor, IWorkingCopyManager workingcopyManager, IType declaringType, ITypeHierarchy h, String methodName, String body) throws CoreException, IllegalArgumentException {
    /*IMethod method = TypeUtility.getMethod(declaringType, methodName);
    if (TypeUtility.exists(method)) {
      MethodUpdateContentOperation operation = new MethodUpdateContentOperation(method, null, true);
      operation.setSimpleBody(body);
      operation.validate();
      operation.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    }
    else {*/
    MethodOverrideOperation op = new MethodOverrideOperation(declaringType, methodName, false);
    op.setSimpleBody(body);
    op.setSuperTypeHierarchy(h);
    op.validate();
    op.run(monitor, workingcopyManager);
    //}
  }
}
