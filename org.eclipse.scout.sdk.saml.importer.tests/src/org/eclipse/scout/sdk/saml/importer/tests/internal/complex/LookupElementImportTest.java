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

import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.sdk.saml.importer.tests.AbstractSamlImporterTest;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.IScoutBundle;
import org.junit.Assert;
import org.junit.Test;

/**
 * <h3>{@link LookupElementImportTest}</h3> ...
 * 
 * @author mvi
 * @since 3.9.0 04.02.2013
 */
public class LookupElementImportTest extends AbstractSamlImporterTest {

  private final static String LOOKUP_NAME = "Levels";

  @Test
  public void testLookupServiceInterfaceCreated() throws Exception {
    IScoutBundle shared = getScoutBundle(_SuiteComplexImporterTests.SHARED_BUNDLE);

    String ifFqn = shared.getDefaultPackage(IScoutBundle.SHARED_SERVICES_LOOKUP) + ".I" + LOOKUP_NAME + SdkProperties.SUFFIX_LOOKUP_SERVICE;
    Assert.assertTrue(TypeUtility.existsType(ifFqn));
  }

  @Test
  public void testLookupServiceImplementationCreated() throws Exception {
    getLookupService();
  }

  @Test
  public void testLookupCallCreated() throws Exception {
    IScoutBundle shared = getScoutBundle(_SuiteComplexImporterTests.SHARED_BUNDLE);

    String lcFqn = shared.getDefaultPackage(IScoutBundle.SHARED_SERVICES_LOOKUP) + "." + LOOKUP_NAME + SdkProperties.SUFFIX_LOOKUP_CALL;
    Assert.assertTrue(TypeUtility.existsType(lcFqn));
  }

  @Test
  public void testLookupServiceLogic() throws Exception {
    IType svc = getLookupService();

    IMethod[] methods = TypeUtility.getMethods(svc);
    Assert.assertEquals(3, methods.length);

    testMethod(svc, "createDummyData", "100L");

    testMethod(svc, "getDataByAll", "createDummyData");
  }

  private IType getLookupService() {
    IScoutBundle server = getScoutBundle(_SuiteComplexImporterTests.SERVER_BUNDLE);
    String svcFqn = server.getDefaultPackage(IScoutBundle.SERVER_SERVICES_LOOKUP) + "." + LOOKUP_NAME + SdkProperties.SUFFIX_LOOKUP_SERVICE;
    IType svc = TypeUtility.getType(svcFqn);
    Assert.assertTrue(TypeUtility.exists(svc));
    return svc;
  }
}
