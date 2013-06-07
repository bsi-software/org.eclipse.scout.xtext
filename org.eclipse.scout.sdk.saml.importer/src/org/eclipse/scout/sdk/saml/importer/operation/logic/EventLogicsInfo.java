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
package org.eclipse.scout.sdk.saml.importer.operation.logic;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.saml.saml.LogicElement;

/**
 * <h3>{@link EventLogicsInfo}</h3>
 * 
 * @author mvi
 * @since 3.9.0 03.02.2013
 */
public class EventLogicsInfo {
  private final String m_event;
  private final List<LogicElement> m_eventLogics;

  public EventLogicsInfo(String event) {
    m_event = event;
    m_eventLogics = new ArrayList<LogicElement>();
  }

  public String getEvent() {
    return m_event;
  }

  public void add(LogicElement element) {
    getEventLogics().add(element);
  }

  public boolean isClassLevel() {
    return !StringUtility.hasText(getEvent());
  }

  public List<LogicElement> getEventLogics() {
    return m_eventLogics;
  }
}
