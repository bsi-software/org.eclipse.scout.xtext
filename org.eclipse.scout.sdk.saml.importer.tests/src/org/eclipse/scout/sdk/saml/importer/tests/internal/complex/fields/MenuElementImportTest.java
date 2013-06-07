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
package org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields;

import org.eclipse.jdt.core.IType;
import org.eclipse.scout.sdk.saml.importer.tests.AbstractSamlFieldImporterTest;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 * <h3>{@link MenuElementImportTest}</h3>
 * 
 * @author mvi
 * @since 3.9.0 05.02.2013
 */
public class MenuElementImportTest extends AbstractSamlFieldImporterTest implements IComplexFieldTestConstants {

  private final static String[] LOCATION1 = new String[]{"GroupTest", "TestButton", "MenuTest1"};
  private final static String[] LOCATION2 = new String[]{"GroupTest", "TestTable", SdkProperties.TYPE_NAME_TABLEFIELD_TABLE, "MenuTest2"};
  private final static String[] LOCATION3 = new String[]{"GroupTest", "TestTabBox", "TestTab1", "SmartFieldTest2", "MenuTest3"};

  @Test
  public void testNumAttributes1() throws Exception {
    IType field = getField(FORM_NAME, LOCATION1);
    Assert.assertEquals(3, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTextAttribute1() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredText", "trans.text1");
  }

  @Test
  public void testEmptySpaceAttribute1() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredEmptySpaceAction", true);
  }

  @Test
  public void testCancelAttribute1() throws Exception {
    testMethod(getField(FORM_NAME, LOCATION1), "execAction", "doCancel();");
  }

  @Test
  public void testNumAttributes2() throws Exception {
    IType field = getField(FORM_NAME, LOCATION2);
    Assert.assertEquals(5, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testSeparatorAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredSeparator", true);
  }

  @Test
  public void testTextAttribute2() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredText", "trans.text1");
  }

  @Test
  public void testEmptySpaceAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredEmptySpaceAction", true);
  }

  @Test
  public void testMultiSelectAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredMultiSelectionAction", true);
  }

  @Test
  public void testSingleSelectAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredSingleSelectionAction", false);
  }

  @Test
  public void testNumAttributes3() throws Exception {
    IType field = getField(FORM_NAME, LOCATION3);
    Assert.assertEquals(5, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTextAttribute3() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION3), "getConfiguredText", "trans.text2");
  }

  @Test
  public void testEnabledAttribute3() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION3), "getConfiguredEnabled", false);
  }

  @Test
  public void testVisibleAttribute3() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION3), "getConfiguredVisible", false);
  }

  @Test
  public void testEmptySpaceAttribute3() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION3), "getConfiguredEmptySpaceAction", true);
  }

  @Test
  public void testMultiSelectAttribute3() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION3), "getConfiguredMultiSelectionAction", true);
  }
}
