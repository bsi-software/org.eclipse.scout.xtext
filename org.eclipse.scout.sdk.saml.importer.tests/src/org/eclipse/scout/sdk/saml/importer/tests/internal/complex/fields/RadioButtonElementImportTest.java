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
package org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields;

import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.sdk.saml.importer.tests.AbstractSamlFieldImporterTest;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.type.config.PropertyMethodSourceUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 * <h3>{@link RadioButtonElementImportTest}</h3> ...
 * 
 * @author mvi
 * @since 3.9.0 13.02.2013
 */
public class RadioButtonElementImportTest extends AbstractSamlFieldImporterTest implements IComplexFieldTestConstants {

  private final static String[] LOCATION1 = new String[]{"GroupTest", "TestTabBox", "TestTab2", "TestRadioButtons", "Opt1"};
  private final static String[] LOCATION2 = new String[]{"GroupTest", "TestTabBox", "TestTab2", "TestRadioButtons", "Opt2"};
  private final static String[] LOCATION3 = new String[]{"GroupTest", "TestTabBox", "TestTab2", "TestRadioButtons", "Opt3"};

  @Test
  public void testNumAttributes1() throws Exception {
    IType field = getField(FORM_NAME, LOCATION1);
    Assert.assertEquals(3, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTextAttribute1() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredLabel", "trans.text1");
  }

  @Test
  public void testEnabledAttribute1() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredEnabled", false);
  }

  @Test
  public void testRadioValueAttribute1() throws Exception {
    IType owner = getField(FORM_NAME, LOCATION1);

    IMethod m = TypeUtility.getMethod(owner, "getConfiguredRadioValue");
    Assert.assertTrue(TypeUtility.exists(m));

    String returnValue = PropertyMethodSourceUtility.getMethodReturnValue(m);
    Assert.assertEquals("10", returnValue);
  }

  @Test
  public void testNumAttributes2() throws Exception {
    IType field = getField(FORM_NAME, LOCATION2);
    Assert.assertEquals(3, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTextAttribute2() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredLabel", "trans.text2");
  }

  @Test
  public void testVisibleAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredVisible", false);
  }

  @Test
  public void testRadioValueAttribute2() throws Exception {
    IType owner = getField(FORM_NAME, LOCATION2);

    IMethod m = TypeUtility.getMethod(owner, "getConfiguredRadioValue");
    Assert.assertTrue(TypeUtility.exists(m));

    String returnValue = PropertyMethodSourceUtility.getMethodReturnValue(m);
    Assert.assertEquals("20", returnValue);
  }

  @Test
  public void testNumAttributes3() throws Exception {
    IType field = getField(FORM_NAME, LOCATION3);
    Assert.assertEquals(2, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTextAttribute3() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION3), "getConfiguredLabel", "trans.text3");
  }

  @Test
  public void testRadioValueAttribute3() throws Exception {
    IType owner = getField(FORM_NAME, LOCATION3);

    IMethod m = TypeUtility.getMethod(owner, "getConfiguredRadioValue");
    Assert.assertTrue(TypeUtility.exists(m));

    String returnValue = PropertyMethodSourceUtility.getMethodReturnValue(m);
    Assert.assertEquals("30", returnValue);
  }
}
