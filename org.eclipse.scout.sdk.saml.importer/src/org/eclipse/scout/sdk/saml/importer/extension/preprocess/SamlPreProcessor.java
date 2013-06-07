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
package org.eclipse.scout.sdk.saml.importer.extension.preprocess;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <h3>{@link SamlPreProcessor}</h3> Methods annotated with {@link SamlPreProcessor} are called before the SAML import
 * starts (after the configurators).<br>
 * This gives the importer the opportunity to pre-process the loaded SAML EMF models where required.<br>
 * Classes that contain pre-processor methdos must be registered using the
 * org.eclipse.scout.sdk.saml.importer.elementPreProcessors extension point.
 * 
 * @author mvi
 * @since 3.9.0 09.01.2013
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface SamlPreProcessor {

}
