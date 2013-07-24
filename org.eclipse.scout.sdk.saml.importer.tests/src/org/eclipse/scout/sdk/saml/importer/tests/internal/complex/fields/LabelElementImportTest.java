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
 * <h3>{@link LabelElementImportTest}</h3>
 * 
 * @author kle
 * @since 3.10.0 24.07.2013
 */
public class LabelElementImportTest extends AbstractSamlFieldImporterTest implements IComplexFieldTestConstants {

  private final static String[] LOCATION_1 = new String[]{"SequenceTest", "LabelTest1"};
  private final static String[] LOCATION_2 = new String[]{"SequenceTest", "LabelTest2"};

  @Test
  public void testNumAttributes1() throws Exception {
    IType field = getField(FORM_NAME, LOCATION_1);
    Assert.assertEquals(1, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTextAttribute1() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION_1), "getConfiguredLabel", "trans.text1");
  }

  @Test
  public void testNumAttributes2() throws Exception {
    IType field = getField(FORM_NAME, LOCATION_2);
    Assert.assertEquals(11, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTextAttribute2() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION_2), "getConfiguredLabel", "trans.text2");
  }

  @Test
  public void testEnabledAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION_2), "getConfiguredEnabled", false);
  }

  @Test
  public void testVisibleAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION_2), "getConfiguredVisible", false);
  }

  @Test
  public void testLabelVisibleAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION_2), "getConfiguredLabelVisible", false);
  }

  @Test
  public void testMandatoryAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION_2), "getConfiguredMandatory", true);
  }

  @Test
  public void testMasterAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION_2), "getConfiguredMasterRequired", true);
    testMethod(getField(FORM_NAME, LOCATION_2), "getConfiguredMasterField", "return LabelTest1");
  }

  @Test
  public void testWidthAttribute2() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION_2), "getConfiguredGridW", 2);
  }

  @Test
  public void testWidthPixelsAttribute2() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION_2), "getConfiguredWidthInPixel", 200);
  }

  @Test
  public void testHorizontalAlignAttribute2() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION_2), "getConfiguredHorizontalAlignment", 0);
  }

  @Test
  public void testWrapTextAttribute2() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION_2), "getConfiguredWrapText", true);
  }
}
