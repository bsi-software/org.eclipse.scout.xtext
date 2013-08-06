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
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 * <h3>{@link BigdecimalElementImportTest}</h3>
 * 
 * @author mvi
 * @since 3.9.0 05.02.2013
 */
public class BigdecimalElementImportTest extends AbstractSamlFieldImporterTest implements IComplexFieldTestConstants {

  private final static String[] LOCATION = new String[]{"GroupTest", "BigDecimalTest"};
  private final static String[] LOCATION2 = new String[]{"GroupTest", "BigDecimal2Test"};
  private final static String[] LOCATION3 = new String[]{"GroupTest", "BigDecimal3Test"};
  private final static String[] LOCATION4 = new String[]{"GroupTest", "BigDecimal4Test"};
  private final static String[] LOCATION5 = new String[]{"GroupTest", "BigDecimal5Test"};
  private final static String[] LOCATION6 = new String[]{"GroupTest", "BigDecimal6Test"};

  @Test
  public void testNumAttributes() throws Exception {
    IType field = getField(FORM_NAME, LOCATION);
    Assert.assertEquals(15, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTextAttribute() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredLabel", "trans.text1");
  }

  @Test
  public void testEnabledAttribute() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredEnabled", false);
  }

  @Test
  public void testVisibleAttribute() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredVisible", false);
  }

  @Test
  public void testLabelVisibleAttribute() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredLabelVisible", false);
  }

  @Test
  public void testMandatoryAttribute() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredMandatory", true);
  }

  @Test
  public void testWidthAttribute() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredGridW", 2);
  }

  @Test
  public void testWidthPixelsAttribute() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredWidthInPixel", 333);
  }

  @Test
  public void testPercentAttribute() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredPercent", true);
  }

  @Test
  public void testGroupingAttribute() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredGroupingUsed", false);
  }

  @Test
  public void testHorizontalAlignAttribute() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredHorizontalAlignment", -1);
  }

  @Test
  public void testFractionDigitsAttribute() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredFractionDigits", 4);
    testIntConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredMaxFractionDigits", 4);
    testIntConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredMinFractionDigits", 0);
  }

  @Test
  public void testMinAttribute() throws Exception {
    testDoubleConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredMinValue", 20.2);
  }

  @Test
  public void testMaxAttribute() throws Exception {
    testDoubleConfigMethod(getField(FORM_NAME, LOCATION), "getConfiguredMaxValue", 200.002);
  }

  @Test
  public void testNumAttributes2() throws Exception {
    IType field = getField(FORM_NAME, LOCATION2);
    Assert.assertEquals(1, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testFormatAttribute() throws Exception {
    testStringConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredFormat", "0000.00");
  }

  @Test
  public void testNumAttributes3() throws Exception {
    IType field = getField(FORM_NAME, LOCATION3);
    Assert.assertEquals(2, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testMinAttribute3() throws Exception {
    testDoubleConfigMethod(getField(FORM_NAME, LOCATION3), "getConfiguredMinValue", -100.011);
  }

  @Test
  public void testMaxAttribute3() throws Exception {
    testDoubleConfigMethod(getField(FORM_NAME, LOCATION3), "getConfiguredMaxValue", 300.855);
  }

  @Test
  public void testNumAttributes4() throws Exception {
    IType field = getField(FORM_NAME, LOCATION4);
    Assert.assertEquals(2, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testMinAttribute4() throws Exception {
    testDoubleConfigMethod(getField(FORM_NAME, LOCATION4), "getConfiguredMinValue", -200);
  }

  @Test
  public void testMaxAttribute4() throws Exception {
    testDoubleConfigMethod(getField(FORM_NAME, LOCATION4), "getConfiguredMaxValue", 400);
  }

  @Test
  public void testNumAttributes5() throws Exception {
    IType field = getField(FORM_NAME, LOCATION5);
    Assert.assertEquals(2, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testMinAttribute5() throws Exception {
    testDoubleConfigMethod(getField(FORM_NAME, LOCATION5), "getConfiguredMinValue", -400.0);
  }

  @Test
  public void testMaxAttribute5() throws Exception {
    testDoubleConfigMethod(getField(FORM_NAME, LOCATION5), "getConfiguredMaxValue", 1200.00);
  }

  @Test
  public void testNumAttributes6() throws Exception {
    IType field = getField(FORM_NAME, LOCATION6);
    Assert.assertEquals(2, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testMinAttribute6() throws Exception {
    testDoubleConfigMethod(getField(FORM_NAME, LOCATION6), "getConfiguredMinValue", -0.8794);
  }

  @Test
  public void testMaxAttribute6() throws Exception {
    testDoubleConfigMethod(getField(FORM_NAME, LOCATION6), "getConfiguredMaxValue", 0.9643);
  }
}
