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

import org.eclipse.jdt.core.IType;
import org.eclipse.scout.sdk.extensions.runtime.classes.IRuntimeClasses;
import org.eclipse.scout.sdk.saml.importer.tests.AbstractSamlFieldImporterTest;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 * <h3>{@link ColumnElementImportTest}</h3> ...
 * 
 * @author mvi
 * @since 3.9.0 05.02.2013
 */
public class ColumnElementImportTest extends AbstractSamlFieldImporterTest implements IComplexFieldTestConstants {

  private final static String[] LOCATION1 = new String[]{"GroupTest", "TestTable", SdkProperties.TYPE_NAME_TABLEFIELD_TABLE, "ColumnTest1"};
  private final static String[] LOCATION2 = new String[]{"GroupTest", "TestTable", SdkProperties.TYPE_NAME_TABLEFIELD_TABLE, "ColumnTest2"};
  private final static String[] LOCATION3 = new String[]{"GroupTest", "TestTable", SdkProperties.TYPE_NAME_TABLEFIELD_TABLE, "ColumnTest3"};
  private final static String[] LOCATION4 = new String[]{"GroupTest", "TestTable", SdkProperties.TYPE_NAME_TABLEFIELD_TABLE, "ColumnTest4"};

  @Test
  public void testNumAttributes1() throws Exception {
    IType field = getField(FORM_NAME, LOCATION1);
    Assert.assertEquals(4, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTypeAttribute1() throws Exception {
    IType col = getField(FORM_NAME, LOCATION1);
    testTypeInSuperHierarchy(col, IRuntimeClasses.IDateColumn);
  }

  @Test
  public void testTextAttribute1() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredHeaderText", "trans.text1");
  }

  @Test
  public void testVisibleAttribute1() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredVisible", false);
  }

  @Test
  public void testWidthAttribute1() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredWidth", 30);
  }

  @Test
  public void testDisplayableAttribute1() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredDisplayable", false);
  }

  @Test
  public void testNumAttributes2() throws Exception {
    IType field = getField(FORM_NAME, LOCATION2);
    Assert.assertEquals(2, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTypeAttribute2() throws Exception {
    IType col = getField(FORM_NAME, LOCATION2);
    testTypeInSuperHierarchy(col, IRuntimeClasses.IStringColumn);
  }

  @Test
  public void testTextAttribute2() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredHeaderText", "trans.text2");
  }

  @Test
  public void testWidthAttribute2() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredWidth", 31);
  }

  @Test
  public void testNumAttributes3() throws Exception {
    IType field = getField(FORM_NAME, LOCATION3);
    Assert.assertEquals(2, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTypeAttribute3() throws Exception {
    IType col = getField(FORM_NAME, LOCATION3);
    testTypeInSuperHierarchy(col, IRuntimeClasses.IIntegerColumn);
  }

  @Test
  public void testTextAttribute3() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION3), "getConfiguredHeaderText", "trans.text1");
  }

  @Test
  public void testWidthAttribute3() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION3), "getConfiguredWidth", 32);
  }

  @Test
  public void testNumAttributes4() throws Exception {
    IType field = getField(FORM_NAME, LOCATION4);
    Assert.assertEquals(2, TypeUtility.getMethods(field).length);
  }

  @Test
  public void testTypeAttribute4() throws Exception {
    IType col = getField(FORM_NAME, LOCATION4);
    testTypeInSuperHierarchy(col, IRuntimeClasses.IBigDecimalColumn);
  }

  @Test
  public void testTextAttribute4() throws Exception {
    testNlsConfigMethod(getField(FORM_NAME, LOCATION4), "getConfiguredHeaderText", "trans.text2");
  }

  @Test
  public void testWidthAttribute4() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION4), "getConfiguredWidth", 33);
  }
}
