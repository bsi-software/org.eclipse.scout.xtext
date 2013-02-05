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
package org.eclipse.scout.sdk.saml.importer.tests.internal.complex;

import org.eclipse.jdt.core.IType;
import org.eclipse.scout.sdk.saml.importer.tests.AbstractSamlImporterTest;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 * <h3>{@link KeyElementImportTest}</h3> ...
 * 
 * @author mvi
 * @since 3.9.0 04.02.2013
 */
public class KeyElementImportTest extends AbstractSamlImporterTest {

  private final static String KEY_NAME = "Refresh";

  @Test
  public void testKeyCreated() throws Exception {
    getKeyType();
  }

  @Test
  public void testStrokeAttribute() throws Exception {
    IType keyType = getKeyType();

    testStringConfigMethod(keyType, "getConfiguredKeyStroke", "f5");
  }

  @Test
  public void testServerServicePlacement() throws Exception {
    IType serverService = FormElementImportTest.getServerServiceType();

    testMethod(serverService, "f5Pressed", "System.out.println(\"refresh on backend\");");
  }

  @Test
  public void testClientServicePlacement() throws Exception {
    IType clientService = FormElementImportTest.getClientServiceType();

    testMethod(clientService, "f5Pressed", "System.out.println(\"client service refresh 1\");",
        "System.out.println(\"client service refresh 2\");");
  }

  @Test
  public void testStrokeAction() throws Exception {
    IType keyType = getKeyType();

    testMethod(keyType, "execAction", FormElementImportTest.FORM_NAME + "FormData formData = new " + FormElementImportTest.FORM_NAME + "FormData();", "exportFormData",
        "IComplexLogicTestService.class).f5Pressed(", "System.out.println(\"inline refresh\");", ".f5Pressed(" + FormElementImportTest.FORM_NAME + "Form.this);");
  }

  private IType getKeyType() throws Exception {
    IType mainBox = FormElementImportTest.getMainBoxType();

    IType key = mainBox.getType(KEY_NAME + SdkProperties.SUFFIX_KEY_STROKE);
    Assert.assertTrue(TypeUtility.exists(key));
    return key;
  }
}
