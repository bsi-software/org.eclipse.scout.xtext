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
 * <h3>{@link StringElementImportTest}</h3>
 * 
 * @author mvi
 * @since 3.9.0 05.02.2013
 */
public class StringElementImportTest extends AbstractSamlFieldImporterTest implements IComplexFieldTestConstants {

  private final static String[] LOCATION1 = new String[]{"SequenceTest", "StringAreaTest"};
  private final static String[] LOCATION2 = new String[]{"SequenceTest", "StringTest"};

  @Test
  public void testNumAttributes1() throws Exception {
    IType field = getField(FORM_NAME, LOCATION1);
    Assert.assertEquals(13, TypeUtility.getMethods(field).length);
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
  public void testMasterAttribute1() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredMasterRequired", true);
    testMethod(getField(FORM_NAME, LOCATION1), "getConfiguredMasterField", "return StringTest");
  }

  @Test
  public void testMaxLenAttribute1() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredMaxLength", 64);
  }

  @Test
  public void testHeightAttribute1() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredGridH", 4);
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredMultilineText", true);
  }

  @Test
  public void testWidthAttribute1() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredGridW", 2);
  }

  @Test
  public void testWidthPixelsAttribute1() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredWidthInPixel", 100);
  }

  @Test
  public void testHorizontalAlignAttribute1() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredHorizontalAlignment", 1);
  }

  @Test
  public void testNumAttributes2() throws Exception {
    IType field = getField(FORM_NAME, LOCATION2);
    Assert.assertEquals(9, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTextAttribute2() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredLabel", "trans.text2");
  }

  @Test
  public void testEnabledAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredEnabled", false);
  }

  @Test
  public void testVisibleAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredVisible", false);
  }

  @Test
  public void testLabelVisibleAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredLabelVisible", false);
  }

  @Test
  public void testMandatoryAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredMandatory", true);
  }

  @Test
  public void testMaxLenAttribute2() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredMaxLength", 128);
  }

  @Test
  public void testWidthAttribute2() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredGridW", 2);
  }

  @Test
  public void testWidthPixelsAttribute2() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredWidthInPixel", 200);
  }

  @Test
  public void testHorizontalAlignAttribute2() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredHorizontalAlignment", 0);
  }
}
