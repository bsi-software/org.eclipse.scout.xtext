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
package org.eclipse.scout.sdk.saml.importer.operation.form;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;

/**
 * <h3>{@link AbstractUiElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 12.10.2012
 */
public abstract class AbstractUiElementImportOperation extends AbstractSamlElementImportOperation {

  protected void applyVisibleAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("false".equals(a)) {
      overrideMethod(field, h, "getConfiguredVisible", "return false;");
    }
  }

  protected void applyEnabledAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("false".equals(a)) {
      overrideMethod(field, h, "getConfiguredEnabled", "return false;");
    }
  }
}
