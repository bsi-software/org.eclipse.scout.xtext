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
public class CodeTests {
  @Inject
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testCodeSuperType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("template CodeTypeAbs definition=\"org.eclipse.test.shared.services.codes.CodeTypeAbs\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("code C1 id=\"Integer.valueOf(1234)\" value_type=\"java.lang.Integer\" ");
      _builder.newLine();
      _builder.newLine();
      _builder.append("code C2 id=\"new CodeType()\" value_type=\"org.eclipse.test.shared.services.codes.CodeType\" super_type=CodeTypeAbs");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testChildCodes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("code Parent id=\"1234\" {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("code Child1 id=\"\\\"child1\\\"\" value_type=\"java.lang.String\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("code Child2 id=\"\\\"child2\\\"\" {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("code Child2_1 id=\"1234\" value_type=\"java.lang.Integer\"");
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
  public void testCodeLogic() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("translation CodeName default_lang=\"Test\" en_GB=\"Testing\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("code MyTest id=\"Integer.valueOf(1234)\" text=CodeName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("logic event=load placement=inline {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("\"whatever\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module a.b");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("code MyTest id=\"Integer.valueOf(1234)\" {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("logic event=load placement=server {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("\"whatever\"");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      Model _parse_1 = this._parseHelper.parse(_builder_1);
      EClass _logicElement = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse_1, _logicElement, SamlJavaValidator.PLACEMENT_INLINE_ONLY_FOR_CODE, SamlJavaValidator.MSG_PLACEMENT_INLINE_ONLY_FOR_CODE);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module a.b");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("code MyTest id=\"Integer.valueOf(1234)\" {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("logic event=init placement=inline {");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("\"whatever\"");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      Model _parse_2 = this._parseHelper.parse(_builder_2);
      EClass _logicElement_1 = SamlPackage.eINSTANCE.getLogicElement();
      this._validationTestHelper.assertError(_parse_2, _logicElement_1, SamlJavaValidator.INVALID_LOGIC_ELEMENT, SamlJavaValidator.MSG_WRONG_LOGIC_EVENT);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
