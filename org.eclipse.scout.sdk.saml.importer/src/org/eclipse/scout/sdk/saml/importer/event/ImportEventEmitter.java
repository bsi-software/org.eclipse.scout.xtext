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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.commons.EventListenerList;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;

/**
 * <h3>{@link ImportEventEmitter}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 03.02.2013
 */
public class ImportEventEmitter {

  private final static ImportEventEmitter INSTANCE = new ImportEventEmitter();

  private final EventListenerList m_eventListeners;

  public static ImportEventEmitter get() {
    return INSTANCE;
  }

  private ImportEventEmitter() {
    m_eventListeners = new EventListenerList();
  }

  public void addListener(ISamlImportEventListener listener) {
    m_eventListeners.add(ISamlImportEventListener.class, listener);
  }

  public void removeListener(ISamlImportEventListener listener) {
    m_eventListeners.remove(ISamlImportEventListener.class, listener);
  }

  public void fireEventSync(SamlImportEvent event) throws IllegalArgumentException, CoreException {
    for (ISamlImportEventListener listener : m_eventListeners.getListeners(ISamlImportEventListener.class)) {
      try {
        listener.handleEvent(event);
      }
      catch (CoreException e) {
        throw e;
      }
      catch (IllegalArgumentException e) {
        throw e;
      }
      catch (Exception e) {
        SamlImporterActivator.logError("Error in SAML EventListener.", e);
      }
    }
  }
}
