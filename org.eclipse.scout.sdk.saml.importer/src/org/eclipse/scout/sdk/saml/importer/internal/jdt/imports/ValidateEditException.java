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
package org.eclipse.scout.sdk.saml.importer.internal.jdt.imports;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;

/**
 * <h3>{@link ValidateEditException}</h3>
 * 
 * @author mvi
 * @since 3.9.0 23.05.2013
 */
public class ValidateEditException extends CoreException {

  private static final long serialVersionUID = 1L;

  public ValidateEditException(IStatus status) {
    super(status);
  }
}
