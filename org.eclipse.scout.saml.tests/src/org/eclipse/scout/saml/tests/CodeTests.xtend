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
	def void testCodeSuperType() {
		'''
		module a.b
		
		template CodeTypeAbs definition="org.eclipse.test.shared.services.codes.CodeTypeAbs"

		code C1 id="Integer.valueOf(1234)" value_type="java.lang.Integer" 
		
		code C2 id="new CodeType()" value_type="org.eclipse.test.shared.services.codes.CodeType" super_type=CodeTypeAbs
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testChildCodes() {
		'''
		module a.b
		
		code Parent id="1234" {
			code Child1 id="\"child1\"" value_type="java.lang.String"
			code Child2 id="\"child2\"" {
				code Child2_1 id="1234" value_type="java.lang.Integer"
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testCodeLogic() {
		'''
		module a.b
		
		translation CodeName default_lang="Test" en_GB="Testing"
		
		code MyTest id="Integer.valueOf(1234)" text=CodeName {
			logic event=load placement=inline {
				"whatever"
			}
		}
		'''.parse.assertNoErrors
		
		'''
		module a.b
		
		
		code MyTest id="Integer.valueOf(1234)" {
			logic event=load placement=server {
				"whatever"
			}
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::PLACEMENT_INLINE_ONLY_FOR_CODE, SamlJavaValidator::MSG_PLACEMENT_INLINE_ONLY_FOR_CODE)
		
		'''
		module a.b
		
		code MyTest id="Integer.valueOf(1234)" {
			logic event=init placement=inline {
				"whatever"
			}
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::INVALID_LOGIC_ELEMENT, SamlJavaValidator::MSG_WRONG_LOGIC_EVENT);
	}
}