/*******************************************************************************
 * Copyright (c) 2012, 2013 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.sdk.saml.importer.extension.attribute;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.operation.method.MethodOverrideOperation;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link AbstractAttributeHandlersProvider}</h3>
 * 
 * @author mvi
 * @since 3.9.0 01.02.2013
 */
public abstract class AbstractAttributeHandlersProvider implements IAttributeHandlersProvider {

  private SamlContext m_samlContext;

  protected AbstractAttributeHandlersProvider() {
  }

  protected void overrideMethod(String methodName, String body) throws CoreException, IllegalArgumentException {
    overrideMethod(methodName, body, getSamlContext().getCurrentParentType());
  }

  protected void overrideMethod(String methodName, String body, IType targetType) throws CoreException, IllegalArgumentException {
    overrideMethod(methodName, body, targetType, getSamlContext().getSuperTypeHierarchy(targetType));
  }

  private void overrideMethod(String methodName, String body, IType targetType, ITypeHierarchy hierarchy) throws CoreException, IllegalArgumentException {
    overrideMethod(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager(), methodName, body, targetType, hierarchy);
  }

  public static void overrideMethod(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager,
      String methodName, String body, IType targetType, ITypeHierarchy hierarchy) throws CoreException, IllegalArgumentException {
    MethodOverrideOperation op = new MethodOverrideOperation(targetType, methodName, false);
    op.setSimpleBody(body);
    op.setSuperTypeHierarchy(hierarchy);
    op.validate();
    op.run(monitor, workingCopyManager);
  }

  protected String getNlsReturnClause(TranslationElement translation) {
    return "return TEXTS.get(\"" + translation.getName() + "\");";
  }

  protected SamlContext getSamlContext() {
    return m_samlContext;
  }

  @Override
  public void setSamlContext(SamlContext samlContext) {
    m_samlContext = samlContext;
  }

  protected static Double parseDouble(String v) {
    if (v == null) {
      return null;
    }
    try {
      return Double.valueOf(v);
    }
    catch (NumberFormatException e) {
      SamlImporterActivator.logWarning("Cannot parse '" + v + "' as double. ", e);
      return null;
    }
  }
}
