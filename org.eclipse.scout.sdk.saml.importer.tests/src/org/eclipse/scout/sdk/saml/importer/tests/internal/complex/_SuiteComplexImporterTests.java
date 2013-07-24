package org.eclipse.scout.sdk.saml.importer.tests.internal.complex;

import org.eclipse.core.runtime.Platform;
import org.eclipse.scout.commons.TuningUtility;
import org.eclipse.scout.sdk.saml.importer.tests.AbstractSamlImporterTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.SamlImporterTestsActivator;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.BigdecimalElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.ButtonElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.CheckboxElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.ColumnElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.CustomFieldElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.DateElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.FileChooserElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.GroupElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.LabelElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.ListElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.LongElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.MenuElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.RadioButtonElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.RadioGroupElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.SequenceBoxElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.SmartfieldElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.StringElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.TabElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.TabboxElementImportTest;
import org.eclipse.scout.sdk.saml.importer.tests.internal.complex.fields.TableElementImportTest;
import org.eclipse.scout.sdk.testing.TestUtility;
import org.eclipse.scout.sdk.testing.TestWorkspaceUtility;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TranslationElementImportTest.class, CodeElementImportTest.class, LookupElementImportTest.class, FormElementImportTest.class, KeyElementImportTest.class,
    BigdecimalElementImportTest.class, ButtonElementImportTest.class, ColumnElementImportTest.class, DateElementImportTest.class, GroupElementImportTest.class,
    ListElementImportTest.class, MenuElementImportTest.class, SequenceBoxElementImportTest.class, SmartfieldElementImportTest.class, StringElementImportTest.class,
    TabboxElementImportTest.class, TabElementImportTest.class, TableElementImportTest.class, CustomFieldElementImportTest.class, CheckboxElementImportTest.class,
    RadioGroupElementImportTest.class, RadioButtonElementImportTest.class, FileChooserElementImportTest.class, LongElementImportTest.class, LabelElementImportTest.class})
public class _SuiteComplexImporterTests extends AbstractSamlImporterTest {

  public final static String SHARED_BUNDLE = "org.eclipse.scout.saml.tests.complex.shared";
  public final static String CLIENT_BUNDLE = "org.eclipse.scout.saml.tests.complex.client";
  public final static String SERVER_BUNDLE = "org.eclipse.scout.saml.tests.complex.server";
  public final static String SAML_INPUT_BUNDLE = "org.eclipse.scout.saml.tests.complex.input";

  @BeforeClass
  public static void setUpWorkspace() throws Exception {
    TestUtility.showEgitMessageBoxes(false);
    TestWorkspaceUtility.setupWorkspace(Platform.getBundle(SamlImporterTestsActivator.PLUGIN_ID),
        "resources/complex", SHARED_BUNDLE, CLIENT_BUNDLE, SERVER_BUNDLE, SAML_INPUT_BUNDLE);

    doSamlImport(SAML_INPUT_BUNDLE);
  }

  @AfterClass
  public static void cleanUpWorkspace() throws Exception {
//    clearWorkspace();
    TuningUtility.finishAll(true);
  }
}
