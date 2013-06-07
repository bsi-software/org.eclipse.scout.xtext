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
package org.eclipse.scout.sdk.saml.importer.extension.configurator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;

/**
 * <h3>{@link IScoutProjectConfigurator}</h3>
 * 
 * @author mvi
 * @since 3.9.0 28.11.2012
 */
public interface IScoutProjectConfigurator {
  /**
   * Called before the SAML import starts. Gives the opportunity to apply some preparations or configurations in the
   * workspace (like e.g. setting some default configurations).
   * 
   * @param context
   *          The fresh SAML context.
   * @throws CoreException
   */
  void configure(SamlContext context) throws CoreException;
}
