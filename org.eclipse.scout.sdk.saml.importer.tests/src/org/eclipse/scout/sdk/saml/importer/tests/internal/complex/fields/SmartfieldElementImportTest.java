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
 * <h3>{@link SmartfieldElementImportTest}</h3>
 * 
 * @author mvi
 * @since 3.9.0 05.02.2013
 */
public class SmartfieldElementImportTest extends AbstractSamlFieldImporterTest implements IComplexFieldTestConstants {
  private final static String[] LOCATION1 = new String[]{"GroupTest", "SmartFieldTest1"};
  private final static String[] LOCATION2 = new String[]{"GroupTest", "TestTabBox", "TestTab1", "SmartFieldTest2"};

  @Test
  public void testNumAttributes1() throws Exception {
    IType field = getField(FORM_NAME, LOCATION1);
    Assert.assertEquals(7, TypeUtility.getMethods(field).length);
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
  public void testVisibleAttribute1() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredVisible", false);
  }

  @Test
  public void testLabelVisibleAttribute1() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredLabelVisible", false);
  }

  @Test
  public void testMandatoryAttribute1() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredMandatory", true);
  }

  @Test
  public void testWidthAttribute1() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredGridW", 2);
  }

  @Test
  public void testCodeAttribute1() throws Exception {
    super.testMethod(getField(FORM_NAME, LOCATION1), "getConfiguredCodeType", "Departments" + SdkProperties.SUFFIX_CODE_TYPE);
  }

  @Test
  public void testGenericType1() throws Exception {
    testHasGenericArgument(getField(FORM_NAME, LOCATION1), String.class.getSimpleName());
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
  public void testWidthPixelsAttribute() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredWidthInPixel", 77);
  }

  @Test
  public void testLookupAttribute2() throws Exception {
    super.testMethod(getField(FORM_NAME, LOCATION2), "getConfiguredLookupCall", "Levels" + SdkProperties.SUFFIX_LOOKUP_CALL);
  }

  @Test
  public void testGenericType2() throws Exception {
    testHasGenericArgument(getField(FORM_NAME, LOCATION2), Long.class.getSimpleName());
  }
}
