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
package org.eclipse.scout.saml.validation;

/**
 * <h3>{@link ISamlValidatorConstants}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 18.10.2012
 */
public interface ISamlValidatorConstants {

  static final String PLACEMENT_SERVER_ONLY_FOR_LOOKUP = "OnlyServerPlacementForLookups";
  static final String MSG_PLACEMENT_SERVER_ONLY_FOR_LOOKUP = "lookups only support server placements";

  static final String DUPLICATE = "DuplicateElement";
  static final String MSG_DUPLICATE = "duplicate element name";
  static final String MSG_DUPLICATE_FIELD = "form contains duplicate fields";

  static final String PLACEMENT_MANDATORY = "PlacementMandatory";
  static final String MSG_PLACEMENT_MANDATORY = "source placement is missing";

  static final String INVALID_LOGIC_ELEMENT = "InvalidLogicElement";
  static final String MSG_NAMED_LOGIC_ELEMENTS_NEEDS_SOURCE = "a named logic element must contain source code";
  static final String MSG_NAMED_LOGIC_ELEMENTS_NO_EVENT = "a named logic element must not define an event";
  static final String MSG_NAMED_LOGIC_NO_EXEC = "a named logic element must not define an exec";
  static final String MSG_SOURCE_LINKED_OR_GIVEN = "a logic element must either contain source or link to source code of a named logic element";
}
