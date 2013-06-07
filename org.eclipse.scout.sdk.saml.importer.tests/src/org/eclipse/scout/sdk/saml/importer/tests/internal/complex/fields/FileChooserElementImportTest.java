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

import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.sdk.saml.importer.tests.AbstractSamlFieldImporterTest;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.type.config.PropertyMethodSourceUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 * <h3>{@link FileChooserElementImportTest}</h3>
 * 
 * @author mvi
 * @since 3.9.0 13.02.2013
 */
public class FileChooserElementImportTest extends AbstractSamlFieldImporterTest implements IComplexFieldTestConstants {

  private final static String[] LOCATION1 = new String[]{"GroupTest", "TestTabBox", "TestTab2", "TestFileChooser1"};
  private final static String[] LOCATION2 = new String[]{"GroupTest", "TestTabBox", "TestTab2", "TestFileChooser2"};

  @Test
  public void testNumAttributes1() throws Exception {
    IType field = getField(FORM_NAME, LOCATION1);
    Assert.assertEquals(14, TypeUtility.getMethods(field).length);
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
  public void testWidthAttribute1() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredGridW", 5);
  }

  @Test
  public void testWidthPixelsAttribute1() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredWidthInPixel", 105);
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
  public void testMaxLenAttribute1() throws Exception {
    testIntConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredMaxLength", 300);
  }

  @Test
  public void testDefaultDirAttribute1() throws Exception {
    testStringConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredDirectory", "C:\\Users");
  }

  @Test
  public void testLoadAttribute1() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredTypeLoad", true);
  }

  @Test
  public void testModeAttribute1() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredFolderMode", true);
  }

  @Test
  public void testShowDirectoryAttribute1() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredShowDirectory", true);
  }

  @Test
  public void testShowFileNameAttribute1() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredShowFileName", false);
  }

  @Test
  public void testShowExtensionAttribute1() throws Exception {
    testBoolConfigMethod(getField(FORM_NAME, LOCATION1), "getConfiguredShowFileExtension", false);
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
  public void testDefaultDirAttribute2() throws Exception {
    testStringConfigMethod(getField(FORM_NAME, LOCATION2), "getConfiguredDirectory", "C:\\Program Files");
  }

  public void testExtensionsAttribute2() throws Exception {
    IType owner = getField(FORM_NAME, LOCATION2);

    IMethod m = TypeUtility.getMethod(owner, "getConfiguredFileExtensions");
    Assert.assertTrue(TypeUtility.exists(m));

    String returnValue = PropertyMethodSourceUtility.getMethodReturnValue(m);
    Assert.assertTrue(returnValue.contains("jpg"));
    Assert.assertTrue(returnValue.contains("jpeg"));
    Assert.assertTrue(returnValue.contains("png"));
    Assert.assertTrue(returnValue.contains("bmp"));
    Assert.assertTrue(returnValue.contains("gif"));
  }
}
