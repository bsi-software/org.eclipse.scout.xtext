package org.eclipse.scout.saml.tests

import com.google.inject.Inject
import org.eclipse.scout.saml.SamlInjectorProvider
import org.eclipse.scout.saml.saml.Model
import org.eclipse.scout.saml.saml.SamlPackage
import org.eclipse.scout.saml.validation.SamlJavaValidator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SamlInjectorProvider))
class CodeTests {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testCodeLogic() {
		'''
		module a.b
		
		translation CodeName default_lang="Test" en_GB="Testing"
		
		code MyTest id=1234 text=CodeName {
			logic event=load placement=inline {
				"whatever"
			}
		}
		'''.parse.assertNoErrors
		
		'''
		module a.b
		
		
		code MyTest id=1234 {
			logic event=load placement=server {
				"whatever"
			}
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::PLACEMENT_INLINE_ONLY_FOR_CODE, SamlJavaValidator::MSG_PLACEMENT_INLINE_ONLY_FOR_CODE)
		
		'''
		module a.b
		
		code MyTest id=1234 {
			logic event=init placement=inline {
				"whatever"
			}
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::INVALID_LOGIC_ELEMENT, SamlJavaValidator::MSG_WRONG_LOGIC_EVENT);
	}
}