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
package org.eclipse.scout.sdk.saml.importer.util;

import org.eclipse.jdt.core.IType;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.type.ScoutTypeUtility;

/**
 * <h3>{@link SamlImportUtility}</h3>
 * 
 * @author mvi
 * @since 3.9.0 10.10.2012
 */
public class SamlImportUtility {

  public static final String FORM_HANDLER_MODIFY = "modify";
  public static final String FORM_HANDLER_NEW = "new";

  /**
   * Gets the form handler with the given type.
   * 
   * @param container
   *          The form in which the handlers should be searched.
   * @param handlerType
   *          The handler type.
   * @return The handler or null.
   */
  public static IType getFormHandler(IType container, String handlerType) {
    if (!TypeUtility.exists(container)) {
      throw new IllegalArgumentException("form could not be found.");
    }
    handlerType = handlerType.toLowerCase();
    IType result = null;
    IType[] handlers = ScoutTypeUtility.getFormHandlers(container);
    for (IType handler : handlers) {
      if (handler.getElementName().toLowerCase().startsWith(handlerType)) {
        result = handler;
        break;
      }
    }
    return result;
  }

  /**
   * Returns the first element from the list that matches the given filter.
   * 
   * @param list
   *          The list to search in.
   * @param filter
   *          The visitor to apply. The first returning true will be accepted.
   * @return the first element from the list that matches the given filter.
   */
  public static <T> T findFirst(Iterable<T> list, IItemVisitor<T> filter) {
    if (list == null || filter == null) {
      return null;
    }
    for (T t : list) {
      if (filter.visit(t)) {
        return t;
      }
    }
    return null;
  }
}
