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
public class ParserTest {
  @Inject
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
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
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.newLine();
      _builder.append("logic Foo runat=server {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return new ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("java.util.LinkedList<org.eclipse.scout.rt.shared.services.^lookup.LookupRow>();");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("logic Foo2 runat=server {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return new ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("java.util.LinkedList<org.eclipse.scout.rt.shared.services.^lookup.LookupRow>();");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
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
  
  @Test
  public void testXVariableDeclaration() {
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
      _builder.newLine();
      _builder.append("logic Foo runat=server {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String s = \"String\";");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String s1 = \"My\" + s;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return new java.util.LinkedList<org.eclipse.scout.rt.shared.services.^lookup.LookupRow>();");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
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
  public void testXTypeLiteral() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.util.List");
      _builder.newLine();
      _builder.append("import org.eclipse.xtext.EcoreUtil2");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.newLine();
      _builder.append("logic Foo runat=server {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("List<String> strings =");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("EcoreUtil2::typeSelect");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("(new java.util.LinkedList<String>(), String.class) ;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
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
  public void testXUnaryOperation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.util.List");
      _builder.newLine();
      _builder.append("import org.eclipse.xtext.EcoreUtil2");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.newLine();
      _builder.append("logic Foo runat=server {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("boolean isItTrue =");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("!(EcoreUtil2::typeSelect");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("(new java.util.LinkedList<String>(), String.class).size() > 0) ;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
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
  public void testConstructorCall() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.util.List");
      _builder.newLine();
      _builder.append("import org.eclipse.xtext.EcoreUtil2");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.newLine();
      _builder.append("logic Foo runat=server {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String s = new String();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String s2 = new String(\"test\");");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("return null;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
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
  public void testMultipleFiles() {
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
      _builder_1.append("form MyForm text=TransTest {");
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
}
