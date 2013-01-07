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
public class MenuTests {
  @Inject
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testMenuSelections() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MenuTest {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("smartfield MySmart {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("menu M1 enabled=true visible=true single_select=true multi_select=true empty_select=true");
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
  public void testMenuNameUniqueness() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MenuTest {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("smartfield MySmart {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("menu M1 enabled=true visible=true single_select=true multi_select=true empty_select=true");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("menu M1 enabled=false visible=true type=separator");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _formElement = SamlPackage.eINSTANCE.getFormElement();
      this._validationTestHelper.assertError(_parse, _formElement, SamlJavaValidator.DUPLICATE, SamlJavaValidator.MSG_DUPLICATE_MENU);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMenuTypes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MenuTest {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("logic placement=server event=new_discard {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("\"System.out.println(\\\"canceled\\\"); return formData;\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("smartfield MySmart {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("menu M1 enabled=true visible=true single_select=true multi_select=true empty_select=true");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("menu M2 enabled=false visible=true type=separator");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("menu M3 enabled=true visible=true type=cancel {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("logic event=click placement=inline {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("\"System.out.println(\\\"cancel menu inline\\\");\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("logic event=click placement=server {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("\"System.out.println(\\\"cancel menu server\\\"); return formData;\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("logic event=click placement=client {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("\"System.out.println(\\\"cancel menu client\\\");\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("menu M4 enabled=true visible=true type=normal");
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
  public void testMenuTree() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("translation MenuText default_lang=\"menu\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MenuTest {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("smartfield MySmart {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("menu M1 enabled=true visible=true text=MenuText");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("table MyTab {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("menu M2 text=MenuText {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("menu M21 text=MenuText {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("logic event=click placement=client {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("\"\"");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
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
}
