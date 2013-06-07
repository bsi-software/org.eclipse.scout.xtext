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
import org.eclipse.scout.sdk.saml.importer.operation.logic.LogicSnippetInfo;

/**
 * <h3>{@link ISourceProvider}</h3>
 * 
 * @author mvi
 * @since 3.9.0 28.11.2012
 */
public interface ISourceProvider {

  /**
   * Gets the source for a given event input.<br>
   * This method is called for each logic element found.
   * 
   * @param input
   *          The event information the returned source snippet should handle
   * @return The source that handles the given input event.
   * @throws CoreException
   */
  String getLogicSource(SourceProviderInput input) throws CoreException;

  /**
   * Gets the source for a specific event. One event (e.g. value-changed) may call multiple logics.
   * 
   * @param logicSnippets
   *          the logic snippets of all logic elements that should be executed for this event.
   * @param isForeignCallPresent
   *          specifies if at least one of the given logic snippets calls a different type than source type.
   * @return The complete source for this event handler method.
   * @throws CoreException
   */
  String getEventSource(StringBuilder[] logicSnippets, LogicSnippetInfo[] infos, boolean isForeignCallPresent) throws CoreException;
}
