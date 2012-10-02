package org.eclipse.scout.saml.tests;

import com.google.inject.Inject;
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
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = SamlInjectorProvider.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testParsingAndLinking() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.util.List");
      _builder.newLine();
      _builder.append("import org.eclipse.scout.rt.shared.services.^lookup.LookupRow");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.append("java_code Foo runat=server {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return new java.util.LinkedList<org.eclipse.scout.rt.shared.services.^lookup.LookupRow>()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("java_code Foo2 runat=server {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return new java.util.LinkedList<org.eclipse.scout.rt.shared.services.^lookup.LookupRow>()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testForms() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.util.List");
      _builder.newLine();
      _builder.append("import org.eclipse.scout.rt.shared.services.^lookup.LookupRow");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sequence_box MyBox {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("string my");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("long mzlong {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("logic event=all runat=server {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("sequence_box asdf {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLogicElementValidation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.util.List");
      _builder.newLine();
      _builder.append("import org.eclipse.scout.rt.shared.services.^lookup.LookupRow");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sequence_box MyBox {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("string my");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("long mzlong {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("logic event=all {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("return null");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("sequence_box asdf {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _logicElement = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse, _logicElement, 
        SamlJavaValidator.RUNAT_MANDATORY, 
        "\'runat\' is mandatory when providing the source");
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateElements() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.util.List");
      _builder.newLine();
      _builder.append("import org.eclipse.scout.rt.shared.services.^lookup.LookupRow");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sequence_box MyForm {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("string my");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _formElement = SamlPackage.eINSTANCE.getFormElement();
      this._validationTestHelper.assertError(_parse, _formElement, 
        SamlJavaValidator.DUPLICATE);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLeafNodeScoping() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.util.List");
      _builder.newLine();
      _builder.append("import org.eclipse.scout.rt.shared.services.^lookup.LookupRow");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string test1");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sequence_box MyBox3 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("string string1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sequence_box MyBox {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("string my master=test1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("string my2 master=string1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNonDuplicateTranslations() {
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
}
