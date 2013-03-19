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
package org.eclipse.scout.sdk.saml.importer.tests;

import org.eclipse.jdt.core.IType;
import org.eclipse.scout.sdk.extensions.targetpackage.IDefaultTargetPackage;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex._SuiteComplexImporterTests;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.IScoutBundle;
import org.junit.Assert;

/**
 * <h3>{@link AbstractSamlFieldImporterTest}</h3> ...
 * 
 * @author mvi
 * @since 3.9.0 05.02.2013
 */
public class AbstractSamlFieldImporterTest extends AbstractSamlImporterTest {

  protected IType getField(String formName, String... segments) throws Exception {
    IScoutBundle client = getScoutBundle(_SuiteComplexImporterTests.CLIENT_BUNDLE);
    String fqn = client.getDefaultPackage(IDefaultTargetPackage.CLIENT_FORMS) + "." + formName;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));

    IType mainBox = t.getType(SdkProperties.TYPE_NAME_MAIN_BOX);
    Assert.assertTrue(TypeUtility.exists(mainBox));

    IType ret = mainBox;
    for (String segment : segments) {
      ret = getTypeStartingWith(ret, segment);
      Assert.assertTrue(TypeUtility.exists(ret));
    }

    return ret;
  }

  private IType getTypeStartingWith(IType declaringType, String namePrefix) throws Exception {
    for (IType t : declaringType.getTypes()) {
      if (t.getElementName().startsWith(namePrefix)) {
        return t;
      }
    }
    return null;
  }
}
