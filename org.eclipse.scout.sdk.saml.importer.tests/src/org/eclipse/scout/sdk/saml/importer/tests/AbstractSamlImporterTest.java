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
package org.eclipse.scout.sdk.saml.importer.tests;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.commons.holders.BooleanHolder;
import org.eclipse.scout.saml.ui.internal.SamlActivator;
import org.eclipse.scout.sdk.ScoutSdkCore;
import org.eclipse.scout.sdk.saml.importer.SamlImportHelper;
import org.eclipse.scout.sdk.saml.importer.tests.internal.SamlImporterTestsActivator;
import org.eclipse.scout.sdk.test.AbstractScoutSdkTest;
import org.eclipse.scout.sdk.util.ScoutSeverityManager;
import org.eclipse.scout.sdk.util.jdt.JdtUtility;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.IScoutBundle;
import org.eclipse.scout.sdk.workspace.type.config.PropertyMethodSourceUtility;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.junit.Assert;

import com.google.inject.Injector;

/**
 * <h3>{@link AbstractSamlImporterTest}</h3> ...
 * 
 * @author mvi
 * @since 3.9.0 04.02.2013
 */
public class AbstractSamlImporterTest extends AbstractScoutSdkTest {
  private static final String RESOURCES_FOLDER_NAME = "resources";

  protected static void setupWorkspace(String baseFolder, String... projects) throws Exception {
    JdtUtility.setWorkspaceAutoBuilding(false);
    setAutoUpdateFormData(false);
    clearWorkspace();
    Assert.assertNotNull("baseFolder must not be null", baseFolder);
    if (projects == null || projects.length == 0) {
      projects = new String[]{null};
    }
    for (String project : projects) {
      IProject javaProject = createProject(project);
      copyProject(RESOURCES_FOLDER_NAME, baseFolder, project);
      javaProject.close(null);
      javaProject.open(null);
    }
    buildWorkspace();
  }

  protected static IScoutBundle getScoutBundle(String name) {
    return ScoutSdkCore.getScoutWorkspace().getScoutBundle(getProject(name));
  }

  protected void testTypeInSuperHierarchy(IType t, String toFindInHierarchyFqn) throws Exception {
    ITypeHierarchy h = t.newSupertypeHierarchy(null);
    Assert.assertNotNull(h);

    IType iDateColumn = TypeUtility.getType(toFindInHierarchyFqn);
    Assert.assertTrue(TypeUtility.exists(iDateColumn));

    Assert.assertTrue(h.contains(iDateColumn));
  }

  protected void testMethod(IType owner, String name, String... srcContains) throws Exception {
    IMethod loadMethod = TypeUtility.getMethod(owner, name);
    Assert.assertTrue(TypeUtility.exists(loadMethod));

    String logicSource = loadMethod.getSource();
    Assert.assertNotNull(logicSource);

    for (String s : srcContains) {
      if (!logicSource.contains(s)) {
        Assert.fail("Source of '" + loadMethod + "' does not contain '" + s + "'.");
      }
    }
  }

  protected void testBoolConfigMethod(IType owner, String name, boolean expected) throws Exception {
    IMethod m = TypeUtility.getMethod(owner, name);
    Assert.assertTrue(TypeUtility.exists(m));

    String returnValue = PropertyMethodSourceUtility.getMethodReturnValue(m);
    Assert.assertNotNull(returnValue);

    boolean val = PropertyMethodSourceUtility.parseReturnParameterBoolean(returnValue, m, owner.newSupertypeHierarchy(null));
    Assert.assertEquals(expected, val);
  }

  protected void testStringConfigMethod(IType owner, String name, String expected) throws Exception {
    IMethod m = TypeUtility.getMethod(owner, name);
    Assert.assertTrue(TypeUtility.exists(m));

    String returnValue = PropertyMethodSourceUtility.getMethodReturnValue(m);
    Assert.assertNotNull(returnValue);

    String val = PropertyMethodSourceUtility.parseReturnParameterString(returnValue, m, owner.newSupertypeHierarchy(null));
    Assert.assertNotNull(val);
    Assert.assertEquals(expected, val);
  }

  protected void testDoubleConfigMethod(IType owner, String name, double expected) throws Exception {
    IMethod m = TypeUtility.getMethod(owner, name);
    Assert.assertTrue(TypeUtility.exists(m));

    String returnValue = PropertyMethodSourceUtility.getMethodReturnValue(m);
    Assert.assertNotNull(returnValue);

    double val = PropertyMethodSourceUtility.parseReturnParameterDouble(returnValue, m, owner.newSupertypeHierarchy(null));
    Assert.assertNotNull(val);
    Assert.assertEquals(expected, val, 0.000000001);
  }

  protected void testIntConfigMethod(IType owner, String name, int expected) throws Exception {
    IMethod m = TypeUtility.getMethod(owner, name);
    Assert.assertTrue(TypeUtility.exists(m));

    String val = PropertyMethodSourceUtility.getMethodReturnValue(m);
    Assert.assertNotNull(val);

    int intVal = PropertyMethodSourceUtility.parseReturnParameterInteger(val, m, owner.newSupertypeHierarchy(null));
    Assert.assertEquals(expected, intVal);
  }

  protected void testNlsConfigMethod(IType owner, String name, String expectedNlsKey) throws Exception {
    IMethod textMethod = TypeUtility.getMethod(owner, name);
    Assert.assertTrue(TypeUtility.exists(textMethod));

    String returnValue = PropertyMethodSourceUtility.getMethodReturnValue(textMethod);
    Assert.assertNotNull(returnValue);

    BooleanHolder isNlsText = new BooleanHolder();
    String nlsKey = PropertyMethodSourceUtility.parseReturnParameterNlsKey(returnValue, isNlsText);
    Assert.assertNotNull(isNlsText.getValue());
    Assert.assertTrue(isNlsText.getValue().booleanValue());
    Assert.assertEquals(expectedNlsKey, nlsKey);
  }

  protected static void doSamlImport(String samlInputProjectName) throws Exception {
    Injector injector = SamlActivator.getInstance().getInjector(SamlActivator.ORG_ECLIPSE_SCOUT_SAML_SAML);
    Assert.assertNotNull(injector);

    IProject inputProject = getProject(samlInputProjectName);
    Assert.assertNotNull(inputProject);

    IResourceSetProvider resSetProvider = injector.getInstance(IResourceSetProvider.class);
    Assert.assertNotNull(resSetProvider);

    XtextResourceSet resourceSet = (XtextResourceSet) resSetProvider.get(inputProject);
    Assert.assertNotNull(resourceSet);

    IStatus result = SamlImportHelper.importSamlSync(inputProject, injector, resourceSet);
    Assert.assertNotNull(result);

    if (!result.isOK()) {
      Throwable t = result.getException();
      Assert.assertTrue(t instanceof Exception);
      throw (Exception) t;
    }

    buildWorkspace();

    int severity = ScoutSeverityManager.getInstance().getSeverityOf(ResourcesPlugin.getWorkspace().getRoot());
    if (severity >= IMarker.SEVERITY_ERROR) {
      Assert.fail("The created workspace contains errors.");
    }
  }

  protected static void copyProject(String... pathElements) throws IOException {
    URL resource = FileLocator.find(Platform.getBundle(SamlImporterTestsActivator.PLUGIN_ID), createPath(pathElements), null);
    if (resource != null) {
      String path = FileLocator.toFileURL(resource).getPath();
      copyFilesRecursive(path, ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString());
    }
  }
}
