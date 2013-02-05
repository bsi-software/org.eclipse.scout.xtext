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

import java.util.HashMap;

import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.scout.sdk.util.type.TypeUtility;

/**
 * <h3>{@link SuperTypeHierarchyCache}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 03.02.2013
 */
public final class SuperTypeHierarchyCache {

  private final HashMap<IType, ITypeHierarchy> m_cache;

  SuperTypeHierarchyCache() {
    m_cache = new HashMap<IType, ITypeHierarchy>();
  }

  public ITypeHierarchy getSuperTypeHierarchyFor(IType t) throws JavaModelException {
    if (!TypeUtility.exists(t)) {
      return null;
    }
    ITypeHierarchy ret = m_cache.get(t);
    if (ret == null) {
      ret = t.newSupertypeHierarchy(null);
      m_cache.put(t, ret);
    }
    return ret;
  }
}
