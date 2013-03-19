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

import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.Signature;
import org.eclipse.scout.sdk.extensions.targetpackage.IDefaultTargetPackage;
import org.eclipse.scout.sdk.saml.importer.tests.AbstractSamlImporterTest;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.internal.sigcache.SignatureCache;
import org.eclipse.scout.sdk.util.signature.SignatureUtility;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.IScoutBundle;
import org.junit.Assert;
import org.junit.Test;

/**
 * <h3>{@link CodeElementImportTest}</h3> ...
 * 
 * @author mvi
 * @since 3.9.0 04.02.2013
 */
public class CodeElementImportTest extends AbstractSamlImporterTest {

  @Test
  public void testCodeTypeCreated() throws Exception {
    getCreatedCodeType();
  }

  @Test
  public void testCodeTypeInnerTypes() throws Exception {
    IType codeType = getCreatedCodeType();

    IType[] innerCodes = codeType.getTypes();
    Assert.assertEquals(2, innerCodes.length);
  }

  @Test
  public void testCodeTypeGeneric() throws Exception {
    IType codeType = getCreatedCodeType();
    testGenericType(codeType, String.class.getName());

    IType franceCode = codeType.getType("France" + SdkProperties.SUFFIX_CODE);
    Assert.assertTrue(TypeUtility.exists(franceCode));
    testGenericType(franceCode, Integer.class.getName());
  }

  @Test
  public void testCodeTypeId() throws Exception {
    IType codeType = getCreatedCodeType();

    IField[] fields = codeType.getFields();
    Assert.assertEquals(3, fields.length);

    IField idField = codeType.getField("ID");
    Assert.assertTrue(TypeUtility.exists(idField));

    Assert.assertEquals("Main", TypeUtility.getFieldConstant(idField));
  }

  @Test
  public void testCodeTypeTextMethod() throws Exception {
    IType codeType = getCreatedCodeType();

    testNlsConfigMethod(codeType, "getConfiguredText", "trans.text1");
  }

  @Test
  public void testCodeTypeLoadLogic() throws Exception {
    IType codeType = getCreatedCodeType();

    testMethod(codeType, "execLoadCodes", "System.out.println(\"execLoadCodes\");", "return null;");
  }

  @Test
  public void testCustomField() throws Exception {
    IType codeType = getCreatedCodeType();

    IField customField = codeType.getField("CustomIntField");
    Assert.assertTrue(TypeUtility.exists(customField));

    Assert.assertEquals(Integer.valueOf(101), TypeUtility.getFieldConstant(customField));
  }

  private void testGenericType(IType owner, String expectedFqn) throws Exception {
    String[] typeArguments = Signature.getTypeArguments(owner.getSuperclassTypeSignature());
    Assert.assertEquals(1, typeArguments.length);

    String genericTypeSig = SignatureUtility.getResolvedSignature(typeArguments[0], owner);

    Assert.assertEquals(SignatureCache.createTypeSignature(expectedFqn), genericTypeSig);
  }

  private IType getCreatedCodeType() throws Exception {
    IScoutBundle shared = getScoutBundle(_SuiteComplexImporterTests.SHARED_BUNDLE);
    Assert.assertNotNull(shared);

    String name = "Departments" + SdkProperties.SUFFIX_CODE_TYPE;

    IType type = TypeUtility.getType(shared.getDefaultPackage(IDefaultTargetPackage.SHARED_SERVICES_CODE) + "." + name);
    Assert.assertTrue(TypeUtility.exists(type));

    return type;
  }
}
