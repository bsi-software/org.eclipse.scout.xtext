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
import org.eclipse.scout.sdk.operation.IOperation;

/**
 * <h3>{@link ISamlElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 11.10.2012
 */
public interface ISamlElementImportOperation extends IOperation {
  void run() throws CoreException, IllegalArgumentException;

  void setSamlContext(SamlContext samlContext);

  SamlContext getSamlContext();
}
