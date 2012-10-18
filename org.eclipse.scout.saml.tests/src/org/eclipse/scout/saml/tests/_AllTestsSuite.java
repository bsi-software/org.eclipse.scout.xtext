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
package org.eclipse.scout.saml.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <h3>{@link _AllTestsSuite}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 18.10.2012
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TranslationTests.class, LogicTests.class, FormTests.class, ComplexFormTests.class})
public class _AllTestsSuite {

}
