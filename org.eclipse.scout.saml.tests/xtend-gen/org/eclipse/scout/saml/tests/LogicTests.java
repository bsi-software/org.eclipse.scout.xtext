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
public class LogicTests {
  @Inject
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Test
  public void testNamedLogic() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("lookup MyLookup {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("logic Foo3 placement=server { \"\" }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("logic Foo placement=server { \"\" }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("logic Foo2 placement=client { \"\" }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module a.b");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("lookup MyLookup {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("logic Foo placement=server { \"\" }");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("form MyForm {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("logic Foo placement=server { \"\" }");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      Model _parse_1 = this._parseHelper.parse(_builder_1);
      EClass _logicElement = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse_1, _logicElement, SamlJavaValidator.DUPLICATE, SamlJavaValidator.MSG_DUPLICATE);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLogicAttributes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("logic A { \"\" }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _logicElement = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse, _logicElement, SamlJavaValidator.PLACEMENT_MANDATORY, SamlJavaValidator.MSG_PLACEMENT_MANDATORY);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module a.b");
      _builder_1.newLine();
      _builder_1.append("form MyForm {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("logic event=changed { \"\" }");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      Model _parse_1 = this._parseHelper.parse(_builder_1);
      EClass _logicElement_1 = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse_1, _logicElement_1, SamlJavaValidator.PLACEMENT_MANDATORY, SamlJavaValidator.MSG_PLACEMENT_MANDATORY);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module a.b");
      _builder_2.newLine();
      _builder_2.append("form MyForm {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("logic event=changed");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      Model _parse_2 = this._parseHelper.parse(_builder_2);
      EClass _logicElement_2 = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse_2, _logicElement_2, SamlJavaValidator.INVALID_LOGIC_ELEMENT, SamlJavaValidator.MSG_SOURCE_LINKED_OR_GIVEN);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module a.b");
      _builder_3.newLine();
      _builder_3.append("form MyForm {");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("logic C placement=server { \"\" }");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("logic event=changed exec=C { \"\" }");
      _builder_3.newLine();
      _builder_3.append("}");
      _builder_3.newLine();
      Model _parse_3 = this._parseHelper.parse(_builder_3);
      EClass _logicElement_3 = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse_3, _logicElement_3, SamlJavaValidator.INVALID_LOGIC_ELEMENT, SamlJavaValidator.MSG_SOURCE_LINKED_OR_GIVEN);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("module a.b");
      _builder_4.newLine();
      _builder_4.append("form MyForm {");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("logic A placement=server");
      _builder_4.newLine();
      _builder_4.append("}");
      _builder_4.newLine();
      Model _parse_4 = this._parseHelper.parse(_builder_4);
      EClass _logicElement_4 = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse_4, _logicElement_4, SamlJavaValidator.INVALID_LOGIC_ELEMENT, SamlJavaValidator.MSG_NAMED_LOGIC_ELEMENTS_NEEDS_SOURCE);
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("module a.b");
      _builder_5.newLine();
      _builder_5.append("form MyForm {");
      _builder_5.newLine();
      _builder_5.append("\t");
      _builder_5.append("logic A event=changed placement=server { \"\" }");
      _builder_5.newLine();
      _builder_5.append("}");
      _builder_5.newLine();
      Model _parse_5 = this._parseHelper.parse(_builder_5);
      EClass _logicElement_5 = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse_5, _logicElement_5, SamlJavaValidator.INVALID_LOGIC_ELEMENT, SamlJavaValidator.MSG_NAMED_LOGIC_ELEMENTS_NO_EVENT);
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("module a.b");
      _builder_6.newLine();
      _builder_6.append("form MyForm {");
      _builder_6.newLine();
      _builder_6.append("\t");
      _builder_6.append("logic C placement=server { \"\" }");
      _builder_6.newLine();
      _builder_6.append("\t");
      _builder_6.append("logic A exec=C placement=server { \"\" }");
      _builder_6.newLine();
      _builder_6.append("}");
      _builder_6.newLine();
      Model _parse_6 = this._parseHelper.parse(_builder_6);
      EClass _logicElement_6 = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse_6, _logicElement_6, SamlJavaValidator.INVALID_LOGIC_ELEMENT, SamlJavaValidator.MSG_NAMED_LOGIC_NO_EXEC);
      StringConcatenation _builder_7 = new StringConcatenation();
      _builder_7.append("module a.b");
      _builder_7.newLine();
      _builder_7.append("form MyForm {");
      _builder_7.newLine();
      _builder_7.append("\t");
      _builder_7.append("logic event=all placement=server { \"\" }");
      _builder_7.newLine();
      _builder_7.append("}");
      _builder_7.newLine();
      Model _parse_7 = this._parseHelper.parse(_builder_7);
      EClass _logicElement_7 = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse_7, _logicElement_7, SamlJavaValidator.INVALID_LOGIC_ELEMENT, SamlJavaValidator.MSG_WRONG_LOGIC_EVENT);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLookupLogic() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("lookup MyLookup {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("logic Foo3 placement=client { \"\" }");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _logicElement = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse, _logicElement, SamlJavaValidator.PLACEMENT_SERVER_ONLY_FOR_LOOKUP, SamlJavaValidator.MSG_PLACEMENT_SERVER_ONLY_FOR_LOOKUP);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testKeyStrokeLogic() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("key DoSomething stroke=\"f2\" {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("logic event=activated placement=server { \"\" }");
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
  public void testEventMatchingContainer() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("key stroke=\"f2\" {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("logic event=click placement=server { \"\" }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _logicElement = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse, _logicElement, SamlJavaValidator.INVALID_LOGIC_ELEMENT, SamlJavaValidator.MSG_WRONG_LOGIC_EVENT);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSeparatedLogic() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module c.test");
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("logic exec=EvalForm");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder, resourceSet);
      this._validationTestHelper.assertNoErrors(_parse);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module c.test");
      _builder_1.newLine();
      _builder_1.append("logic EvalForm placement=client {");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("\"whatever\"");
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
