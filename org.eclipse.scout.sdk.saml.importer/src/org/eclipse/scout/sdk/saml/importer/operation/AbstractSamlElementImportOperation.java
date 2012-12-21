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
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.operation.method.MethodOverrideOperation;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;
import org.eclipse.scout.sdk.workspace.IScoutProject;

/**
 * <h3>{@link AbstractSamlElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 25.09.2012
 */
public abstract class AbstractSamlElementImportOperation implements ISamlElementImportOperation {
  private SamlContext m_samlContext;

  @Override
  public final void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    run();
  }

  protected IScoutProject getCurrentScoutModule() {
    return getSamlContext().getCurrentScoutModule();
  }

  protected INlsEntry getNlsEntry(String key) {
    return getCurrentScoutModule().getNlsProject().getEntry(key);
  }

  protected String getNlsReturnClause(TranslationElement translation) {
    return "return TEXTS.get(\"" + translation.getName() + "\");";
  }

  protected void overrideMethod(IType declaringType, ITypeHierarchy h, String methodName, String body) throws CoreException, IllegalArgumentException {
    overrideMethod(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager(), declaringType, h, methodName, body);
  }

  protected static Double parseDouble(String v) {
    if (v == null) {
      return null;
    }
    try {
      return new Double(Double.parseDouble(v));
    }
    catch (NumberFormatException e) {
      SamlImporterActivator.logWarning("Cannot parse '" + v + "' as double. ", e);
      return null;
    }
  }

  public static void overrideMethod(IProgressMonitor monitor, IWorkingCopyManager workingcopyManager, IType declaringType, ITypeHierarchy h, String methodName, String body) throws CoreException, IllegalArgumentException {
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

  protected void postProcessType(IType t) throws CoreException, IllegalArgumentException {
    new SamlImportPostProcessOperation(t).run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
  }

  @Override
  public SamlContext getSamlContext() {
    return m_samlContext;
  }

  @Override
  public void setSamlContext(SamlContext samlContext) {
    m_samlContext = samlContext;
  }
}
