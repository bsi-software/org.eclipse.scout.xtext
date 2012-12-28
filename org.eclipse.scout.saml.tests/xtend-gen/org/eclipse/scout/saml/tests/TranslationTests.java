package org.eclipse.scout.saml.tests;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.scout.saml.SamlInjectorProvider;
import org.eclipse.scout.saml.saml.Model;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.validation.SamlJavaValidator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = SamlInjectorProvider.class)
@SuppressWarnings("all")
public class TranslationTests {
  @Inject
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Test
  public void testTranslations() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("translation TransTest en=\"en\" de=\"de\" de_CH=\"de_CH\"");
      _builder.newLine();
      _builder.append("translation TransTest2 en=\"en\" de=\"de\" de_CH=\"de_CH\"");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLangAttributes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("translation MyTrans en=\"en\" en=\"ab\"");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _translationElement = SamlPackage.eINSTANCE.getTranslationElement();
      this._validationTestHelper.assertError(_parse, _translationElement, SamlJavaValidator.DUPLICATE, SamlJavaValidator.MSG_DUPLICATE_LANG);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNlsKeyAttributes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("translation MyTrans.test.blub en=\"en\" ");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testQualifiedNlsKeyReference() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("translation MyTrans.test.blub en=\"en\" ");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder, resourceSet);
      this._validationTestHelper.assertNoErrors(_parse);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module a.b");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("form MyForm title=MyTrans.test.blub {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      Model _parse_1 = this._parseHelper.parse(_builder_1, resourceSet);
      this._validationTestHelper.assertNoErrors(_parse_1);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTextRefOverFiles() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("translation TransTest en=\"en\" de=\"de\" de_CH=\"de_CH\"");
      _builder.newLine();
      _builder.append("translation TransTest2 en=\"en\" de=\"de\" de_CH=\"de_CH\"");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder, resourceSet);
      this._validationTestHelper.assertNoErrors(_parse);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module a.b");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("translation TransTest3 en=\"en\"");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("form MyForm title=TransTest {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      Model _parse_1 = this._parseHelper.parse(_builder_1, resourceSet);
      this._validationTestHelper.assertNoErrors(_parse_1);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLanguagePattern() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("translation MyTrans e=\"en\" it_CH=\"it\" default_lang=\"ab\"");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _translationElement = SamlPackage.eINSTANCE.getTranslationElement();
      this._validationTestHelper.assertError(_parse, _translationElement, SamlJavaValidator.INVALID_LANG, SamlJavaValidator.MSG_INVALID_LANG);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module a.b");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("translation MyTrans enn=\"en\" it_CH=\"it\" default_lang=\"ab\"");
      _builder_1.newLine();
      Model _parse_1 = this._parseHelper.parse(_builder_1);
      EClass _translationElement_1 = SamlPackage.eINSTANCE.getTranslationElement();
      this._validationTestHelper.assertError(_parse_1, _translationElement_1, SamlJavaValidator.INVALID_LANG, SamlJavaValidator.MSG_INVALID_LANG);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module a.b");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("translation MyTrans eafdsadf=\"en\" it_CH=\"it\" default_lang=\"ab\"");
      _builder_2.newLine();
      Model _parse_2 = this._parseHelper.parse(_builder_2);
      EClass _translationElement_2 = SamlPackage.eINSTANCE.getTranslationElement();
      this._validationTestHelper.assertError(_parse_2, _translationElement_2, SamlJavaValidator.INVALID_LANG, SamlJavaValidator.MSG_INVALID_LANG);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module a.b");
      _builder_3.newLine();
      _builder_3.newLine();
      _builder_3.append("translation MyTrans en_GBB=\"en\" default_lang=\"ab\"");
      _builder_3.newLine();
      Model _parse_3 = this._parseHelper.parse(_builder_3);
      EClass _translationElement_3 = SamlPackage.eINSTANCE.getTranslationElement();
      this._validationTestHelper.assertError(_parse_3, _translationElement_3, SamlJavaValidator.INVALID_LANG, SamlJavaValidator.MSG_INVALID_LANG);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDefaultLangMissing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("translation MyTrans en=\"en\" it_CH=\"it\" default_lang=\"ab\"");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module a.b");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("translation MyTrans en=\"en\" default_lang=\"ab\"");
      _builder_1.newLine();
      Model _parse_1 = this._parseHelper.parse(_builder_1);
      this._validationTestHelper.assertNoIssues(_parse_1);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module a.b");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("translation MyTrans en=\"en\" ab=\"ab\"");
      _builder_2.newLine();
      Model _parse_2 = this._parseHelper.parse(_builder_2);
      EClass _translationElement = SamlPackage.eINSTANCE.getTranslationElement();
      this._validationTestHelper.assertWarning(_parse_2, _translationElement, SamlJavaValidator.DEFAULT_LANG_MISSING, SamlJavaValidator.MSG_DEFAULT_LANG_MISSING);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
