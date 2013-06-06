package org.eclipse.scout.saml.tests;

import com.google.inject.Inject;
import org.eclipse.scout.saml.SamlInjectorProvider;
import org.eclipse.scout.saml.saml.Model;
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
public class MiscTests {
  @Inject
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testEscapedNames() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.test.^shared");
      _builder.newLine();
      _builder.newLine();
      _builder.append("translation My.^form.test.Name en=\"en\" de=\"de\" de_CH=\"de_CH\"");
      _builder.newLine();
      _builder.append("translation TransTest2 en=\"en\" de=\"de\" de_CH=\"de_CH\"");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form ^form {}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
