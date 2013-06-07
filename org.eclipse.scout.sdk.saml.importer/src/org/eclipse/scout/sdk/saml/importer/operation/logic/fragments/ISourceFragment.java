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
package org.eclipse.scout.sdk.saml.importer.operation.logic.fragments;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.sdk.saml.importer.extension.configurator.SourceProviderInput;

/**
 * <h3>{@link ISourceFragment}</h3>
 * 
 * @author mvi
 * @since 3.9.0 28.11.2012
 */
public interface ISourceFragment {
  /**
   * Gets the source code for a specific event.
   * 
   * @param input
   *          The information about the event.
   * @param src
   *          The source to append to.
   * @throws CoreException
   */
  void createSource(SourceProviderInput input, StringBuilder src) throws CoreException;
}
