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
package org.eclipse.scout.sdk.saml.importer.event;

import java.util.EventListener;

import org.eclipse.core.runtime.CoreException;

/**
 * <h3>{@link ISamlImportEventListener}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 04.02.2013
 */
public interface ISamlImportEventListener extends EventListener {
  void handleEvent(SamlImportEvent event) throws IllegalArgumentException, CoreException;
}
