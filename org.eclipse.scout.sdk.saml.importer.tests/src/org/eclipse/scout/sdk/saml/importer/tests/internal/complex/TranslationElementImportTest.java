package org.eclipse.scout.sdk.saml.importer.tests.internal.complex;

import java.util.HashMap;
import java.util.Locale;

import org.eclipse.jdt.core.IType;
import org.eclipse.scout.nls.sdk.model.INlsEntry;
import org.eclipse.scout.nls.sdk.model.util.Language;
import org.eclipse.scout.nls.sdk.model.workspace.project.INlsProject;
import org.eclipse.scout.nls.sdk.services.model.ws.NlsServiceType;
import org.eclipse.scout.sdk.extensions.runtime.classes.IRuntimeClasses;
import org.eclipse.scout.sdk.saml.importer.tests.AbstractSamlImporterTest;
import org.eclipse.scout.sdk.util.pde.PluginModelHelper;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.IScoutBundle;
import org.junit.Assert;
import org.junit.Test;

public class TranslationElementImportTest extends AbstractSamlImporterTest {

  @Test
  public void testNlsServiceCreated() throws Exception {
    IScoutBundle shared = getScoutBundle(_SuiteComplexImporterTests.SHARED_BUNDLE);
    Assert.assertNotNull(shared);

    IType type = TypeUtility.getType(shared.getDefaultPackage(NlsServiceType.TEXT_SERVICE_PACKAGE_ID) + ".ComplexTextProviderService");
    Assert.assertTrue(TypeUtility.exists(type));
  }

  @Test
  public void testNlsServiceRegistredInPluginXml() throws Exception {
    IScoutBundle shared = getScoutBundle(_SuiteComplexImporterTests.SHARED_BUNDLE);
    Assert.assertNotNull(shared);

    PluginModelHelper pmh = new PluginModelHelper(_SuiteComplexImporterTests.SHARED_BUNDLE);

    HashMap<String, String> attributes = new HashMap<String, String>(2);
    attributes.put("factory", IRuntimeClasses.DefaultServiceFactory);
    attributes.put("class", shared.getDefaultPackage(NlsServiceType.TEXT_SERVICE_PACKAGE_ID) + ".ComplexTextProviderService");

    pmh.PluginXml.existsSimpleExtension(IRuntimeClasses.EXTENSION_POINT_SERVICES, IRuntimeClasses.EXTENSION_ELEMENT_SERVICE, attributes);
  }

  @Test
  public void testNlsLanguagesExisting() throws Exception {
    INlsProject nlsProject = getNlsProject();

    Assert.assertTrue(nlsProject.containsLanguage(Language.LANGUAGE_DEFAULT));
    Assert.assertTrue(nlsProject.containsLanguage(new Language(new Locale("en"))));
    Assert.assertTrue(nlsProject.containsLanguage(new Language(new Locale("de", "CH"))));
  }

  @Test
  public void testNlsKeyExisting() throws Exception {
    INlsProject nlsProject = getNlsProject();

    INlsEntry entry = nlsProject.getEntry("trans.text1");
    Assert.assertNotNull(entry);
    Assert.assertEquals(3, entry.getAllTranslations().size());

    Assert.assertEquals("text1_default", entry.getTranslation(Language.LANGUAGE_DEFAULT));
    Assert.assertEquals("text1_en", entry.getTranslation(new Language(new Locale("en"))));
    Assert.assertEquals("text1_de_CH", entry.getTranslation(new Language(new Locale("de", "CH"))));
  }

  private INlsProject getNlsProject() throws Exception {
    IScoutBundle shared = getScoutBundle(_SuiteComplexImporterTests.SHARED_BUNDLE);
    Assert.assertNotNull(shared);

    INlsProject nlsProject = shared.getNlsProject();
    Assert.assertNotNull(nlsProject);

    return nlsProject;
  }
}
