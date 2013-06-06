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
import org.eclipse.scout.sdk.extensions.targetpackage.IDefaultTargetPackage;
import org.eclipse.scout.sdk.saml.importer.tests.AbstractSamlImporterTest;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.IScoutBundle;
import org.junit.Assert;
import org.junit.Test;

/**
 * <h3>{@link FormElementImportTest}</h3> ...
 * 
 * @author mvi
 * @since 3.9.0 04.02.2013
 */
public class FormElementImportTest extends AbstractSamlImporterTest {

  public final static String FORM_NAME = "ComplexLogicTest";
  public final static String ESCAPED_FORM_NAME = "Form";

  @Test
  public void testServerServiceInterfaceCreated() throws Exception {
    IScoutBundle shared = getScoutBundle(_SuiteComplexImporterTests.SHARED_BUNDLE);
    String fqn = shared.getDefaultPackage(IDefaultTargetPackage.SHARED_SERVICES) + ".I" + FORM_NAME + SdkProperties.SUFFIX_SERVICE;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
  }

  @Test
  public void testClientServiceInterfaceCreated() throws Exception {
    IScoutBundle client = getScoutBundle(_SuiteComplexImporterTests.CLIENT_BUNDLE);
    String fqn = client.getDefaultPackage(IDefaultTargetPackage.CLIENT_SERVICES) + ".I" + FORM_NAME + "Client" + SdkProperties.SUFFIX_SERVICE;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
  }

  @Test
  public void testServerServiceImplementationCreated() throws Exception {
    getServerServiceType();
  }

  @Test
  public void testClientServiceImplementationCreated() throws Exception {
    getClientServiceType();
  }

  @Test
  public void testFormDataCreated() throws Exception {
    IScoutBundle shared = getScoutBundle(_SuiteComplexImporterTests.SHARED_BUNDLE);
    String fqn = shared.getDefaultPackage(IDefaultTargetPackage.SHARED_SERVICES) + "." + FORM_NAME + SdkProperties.SUFFIX_FORM_DATA;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
  }

  @Test
  public void testFormCreated() throws Exception {
    getFormType();
  }

  @Test
  public void testNewHandlerCreated() throws Exception {
    getNewHandlerType();
  }

  @Test
  public void testMainBoxCreated() throws Exception {
    getMainBoxType();
  }

  @Test
  public void testFormAttributes() throws Exception {
    IType form = getFormType();

    testBoolConfigMethod(form, "getConfiguredModal", false);

    testNlsConfigMethod(form, "getConfiguredTitle", "trans.text1");
    testNlsConfigMethod(form, "getConfiguredSubTitle", "trans.text2");
  }

  @Test
  public void testMainBoxAttributes() throws Exception {
    IType mainBox = getMainBoxType();

    testIntConfigMethod(mainBox, "getConfiguredGridColumnCount", 3);
    testIntConfigMethod(mainBox, "getConfiguredWidthInPixel", 1000);
  }

  @Test
  public void testServerLogicPlacement() throws Exception {
    IType serverService = getServerServiceType();

    testMethod(serverService, "prepareCreate", "System.out.println(\"execLoad\");");

    testMethod(serverService, "create", "System.out.println(\"server call create\");");
  }

  @Test
  public void testClientLogicPlacement() throws Exception {
    IType clientService = getClientServiceType();

    testMethod(clientService, "create", "client call create");
  }

  @Test
  public void testInlineLogicPlacement() throws Exception {
    IType handler = getNewHandlerType();

    testMethod(handler, "execStore", "inline logic between");
  }

  @Test
  public void testLogicCalls() throws Exception {
    IType handler = getNewHandlerType();

    testMethod(handler, "execStore", FORM_NAME + "FormData formData = new " + FORM_NAME + "FormData();", "exportFormData",
        "I" + FORM_NAME + "Service.class).create(formData);", "SERVICES.getService(I" + FORM_NAME + "ClientService.class)");
  }

  @Test
  public void testEscapedServerServiceInterfaceCreated() throws Exception {
    IScoutBundle shared = getScoutBundle(_SuiteComplexImporterTests.SHARED_BUNDLE);
    String fqn = shared.getDefaultPackage(IDefaultTargetPackage.SHARED_SERVICES) + ".I" + ESCAPED_FORM_NAME + SdkProperties.SUFFIX_SERVICE;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
  }

  @Test
  public void testEscapedClientServiceInterfaceCreated() throws Exception {
    IScoutBundle client = getScoutBundle(_SuiteComplexImporterTests.CLIENT_BUNDLE);
    String fqn = client.getDefaultPackage(IDefaultTargetPackage.CLIENT_SERVICES) + ".I" + ESCAPED_FORM_NAME + "Client" + SdkProperties.SUFFIX_SERVICE;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
  }

  @Test
  public void testEscapedServerServiceImplementationCreated() throws Exception {
    IScoutBundle server = getScoutBundle(_SuiteComplexImporterTests.SERVER_BUNDLE);
    String fqn = server.getDefaultPackage(IDefaultTargetPackage.SERVER_SERVICES) + "." + ESCAPED_FORM_NAME + SdkProperties.SUFFIX_SERVICE;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
  }

  @Test
  public void testEscapedClientServiceImplementationCreated() throws Exception {
    IScoutBundle client = getScoutBundle(_SuiteComplexImporterTests.CLIENT_BUNDLE);
    String fqn = client.getDefaultPackage(IDefaultTargetPackage.CLIENT_SERVICES) + "." + ESCAPED_FORM_NAME + "Client" + SdkProperties.SUFFIX_SERVICE;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
  }

  @Test
  public void testEscapedFormDataCreated() throws Exception {
    IScoutBundle shared = getScoutBundle(_SuiteComplexImporterTests.SHARED_BUNDLE);
    String fqn = shared.getDefaultPackage(IDefaultTargetPackage.SHARED_SERVICES) + "." + ESCAPED_FORM_NAME + SdkProperties.SUFFIX_FORM_DATA;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
  }

  @Test
  public void testEscapedFormCreated() throws Exception {
    IScoutBundle client = getScoutBundle(_SuiteComplexImporterTests.CLIENT_BUNDLE);
    String fqn = client.getDefaultPackage(IDefaultTargetPackage.CLIENT_FORMS) + "." + ESCAPED_FORM_NAME + SdkProperties.SUFFIX_FORM;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
  }

  private IType getFormType() throws Exception {
    IScoutBundle client = getScoutBundle(_SuiteComplexImporterTests.CLIENT_BUNDLE);
    String fqn = client.getDefaultPackage(IDefaultTargetPackage.CLIENT_FORMS) + "." + FORM_NAME + SdkProperties.SUFFIX_FORM;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
    return t;
  }

  static IType getMainBoxType() throws Exception {
    IScoutBundle client = getScoutBundle(_SuiteComplexImporterTests.CLIENT_BUNDLE);
    String fqn = client.getDefaultPackage(IDefaultTargetPackage.CLIENT_FORMS) + "." + FORM_NAME + SdkProperties.SUFFIX_FORM + "." + SdkProperties.TYPE_NAME_MAIN_BOX;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
    return t;
  }

  private IType getNewHandlerType() throws Exception {
    IScoutBundle client = getScoutBundle(_SuiteComplexImporterTests.CLIENT_BUNDLE);
    String fqn = client.getDefaultPackage(IDefaultTargetPackage.CLIENT_FORMS) + "." + FORM_NAME + SdkProperties.SUFFIX_FORM + ".NewHandler";
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
    return t;
  }

  static IType getClientServiceType() throws Exception {
    IScoutBundle client = getScoutBundle(_SuiteComplexImporterTests.CLIENT_BUNDLE);
    String fqn = client.getDefaultPackage(IDefaultTargetPackage.CLIENT_SERVICES) + "." + FORM_NAME + "Client" + SdkProperties.SUFFIX_SERVICE;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
    return t;
  }

  static IType getServerServiceType() throws Exception {
    IScoutBundle server = getScoutBundle(_SuiteComplexImporterTests.SERVER_BUNDLE);
    String fqn = server.getDefaultPackage(IDefaultTargetPackage.SERVER_SERVICES) + "." + FORM_NAME + SdkProperties.SUFFIX_SERVICE;
    IType t = TypeUtility.getType(fqn);
    Assert.assertTrue(TypeUtility.exists(t));
    return t;
  }
}
