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

  String DEFAULT_LANG_NAME = "default_lang";
  String DEFAULT_LANG_MISSING = "DefaultLangMissing";
  String MSG_DEFAULT_LANG_MISSING = "No default language is specified. Try to specify the '" + DEFAULT_LANG_NAME + "' language.";

  String PLACEMENT_SERVER_ONLY_FOR_LOOKUP = "OnlyServerPlacementForLookups";
  String MSG_PLACEMENT_SERVER_ONLY_FOR_LOOKUP = "lookups only support server placements";

  String DUPLICATE = "DuplicateElement";
  String MSG_DUPLICATE = "duplicate element name";
  String MSG_DUPLICATE_FIELD = "form contains duplicate fields";
  String MSG_DUPLICATE_LANG = "a language can only be defined once for each translation";

  String PLACEMENT_MANDATORY = "PlacementMandatory";
  String MSG_PLACEMENT_MANDATORY = "source placement is missing";

  String INVALID_LOGIC_ELEMENT = "InvalidLogicElement";
  String MSG_NAMED_LOGIC_ELEMENTS_NEEDS_SOURCE = "a named logic element must contain source code";
  String MSG_NAMED_LOGIC_ELEMENTS_NO_EVENT = "a named logic element must not define an event";
  String MSG_NAMED_LOGIC_NO_EXEC = "a named logic element must not define an exec";
  String MSG_SOURCE_LINKED_OR_GIVEN = "a logic element must either contain source or link to source code of a named logic element";
  String MSG_WRONG_LOGIC_EVENT = "this event is not allowed in this context";
  String MSG_ONLY_NAMED_LOGIC_ON_TOP_LEVEL = "top level logic elements must be named";

  String INVALID_MODULE = "InvalidModuleElement";
  String INVALID_MODULE_NOT_FOUND = "The given module could not be found in the current workspace.";
}
