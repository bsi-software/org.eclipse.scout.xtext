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
package org.eclipse.scout.sdk.saml.importer.operation.logic;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.saml.saml.LogicElement;

/**
 * <h3>{@link EventLogicsInfoFactory}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 03.02.2013
 */
public class EventLogicsInfoFactory {
  public static Collection<EventLogicsInfo> create(List<LogicElement> logics) {
    // collect all logics of the same event
    HashMap<String /* event */, EventLogicsInfo> logicByEvent = new HashMap<String, EventLogicsInfo>(logics.size());
    for (LogicElement logic : logics) {
      /* logic elements with name are just named snippets used at several places. nothing to do for them.
         they will be referred to from a non-named element later on */
      if (!StringUtility.hasText(logic.getName())) {
        String ev = logic.getEvent();
        EventLogicsInfo eventLogics = logicByEvent.get(ev);
        if (eventLogics == null) {
          eventLogics = new EventLogicsInfo(ev);
          logicByEvent.put(ev, eventLogics);
        }
        eventLogics.add(logic);
      }
    }
    return logicByEvent.values();
  }
}
