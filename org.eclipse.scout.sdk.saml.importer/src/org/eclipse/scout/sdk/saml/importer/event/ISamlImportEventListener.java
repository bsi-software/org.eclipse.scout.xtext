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
package org.eclipse.scout.sdk.saml.importer.event;

import java.util.EventListener;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.commons.WeakEventListener;

/**
 * <h3>{@link ISamlImportEventListener}</h3> Event listener.<br>
 * The listener may also implement the marker interface {@link WeakEventListener}. In that case ensure you hold a
 * reference until the listener is no longer required.
 * 
 * @author mvi
 * @since 3.9.0 04.02.2013
 */
public interface ISamlImportEventListener extends EventListener {
  /**
   * Invoked when a saml event occurs.
   * 
   * @param event
   *          The event that occured.
   * @throws IllegalArgumentException
   *           stops the processing of further listeners and breaks the SAML import.
   * @throws CoreException
   *           stops the processing of further listeners and breaks the SAML import.
   */
  void handleEvent(SamlImportEvent event) throws IllegalArgumentException, CoreException;
}
