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
package org.eclipse.scout.sdk.saml.importer.extension.attribute;

import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;

/**
 * <h3>{@link IAttributeHandlersProvider}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 01.02.2013
 */
public interface IAttributeHandlersProvider {

  /**
   * @param samlContext
   */
  void setSamlContext(SamlContext samlContext);
}
