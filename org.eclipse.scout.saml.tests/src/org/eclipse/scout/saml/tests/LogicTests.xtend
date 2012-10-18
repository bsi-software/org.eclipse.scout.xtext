package org.eclipse.scout.saml.tests

import com.google.inject.Inject
import org.eclipse.scout.saml.saml.Model
import org.eclipse.scout.saml.saml.SamlPackage
import org.eclipse.scout.saml.validation.SamlJavaValidator
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.scout.saml.SamlInjectorProvider

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SamlInjectorProvider))
class LogicTests {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper

	@Test
	def void testNamedLogic() {
		'''
		module a.b
		
		lookup MyLookup {
			logic Foo3 placement=server { "" }
		}
		
		form MyForm {
			logic Foo placement=server { "" }
			logic Foo2 placement=client { "" }
		}
		'''.parse.assertNoErrors
		
		'''
		module a.b
		
		lookup MyLookup {
			logic Foo placement=server { "" }
		}
		
		form MyForm {
			logic Foo placement=server { "" }
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::DUPLICATE, SamlJavaValidator::MSG_DUPLICATE)
	}
	
	@Test
	def void testLogicAttributes() {
		'''
		module a.b
		form MyForm {
			logic A { "" }
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::PLACEMENT_MANDATORY, SamlJavaValidator::MSG_PLACEMENT_MANDATORY);
		
		'''
		module a.b
		form MyForm {
			logic event=changed { "" }
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::PLACEMENT_MANDATORY, SamlJavaValidator::MSG_PLACEMENT_MANDATORY);
		
		'''
		module a.b
		form MyForm {
			logic event=changed
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::INVALID_LOGIC_ELEMENT, SamlJavaValidator::MSG_SOURCE_LINKED_OR_GIVEN);

		'''
		module a.b
		form MyForm {
			logic C placement=server { "" }
			logic event=changed exec=C { "" }
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::INVALID_LOGIC_ELEMENT, SamlJavaValidator::MSG_SOURCE_LINKED_OR_GIVEN);
		
				
		'''
		module a.b
		form MyForm {
			logic A placement=server
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::INVALID_LOGIC_ELEMENT, SamlJavaValidator::MSG_NAMED_LOGIC_ELEMENTS_NEEDS_SOURCE);
		
		'''
		module a.b
		form MyForm {
			logic A event=changed placement=server { "" }
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::INVALID_LOGIC_ELEMENT, SamlJavaValidator::MSG_NAMED_LOGIC_ELEMENTS_NO_EVENT);
		
		'''
		module a.b
		form MyForm {
			logic C placement=server { "" }
			logic A exec=C placement=server { "" }
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::INVALID_LOGIC_ELEMENT, SamlJavaValidator::MSG_NAMED_LOGIC_NO_EXEC);
		
		'''
		module a.b
		form MyForm {
			logic event=all placement=server { "" }
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::INVALID_LOGIC_ELEMENT, SamlJavaValidator::MSG_WRONG_LOGIC_EVENT);
	}
	
	@Test
	def void testLookupLogic() {
		'''
		module a.b
		
		lookup MyLookup {
			logic Foo3 placement=client { "" }
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::PLACEMENT_SERVER_ONLY_FOR_LOOKUP, SamlJavaValidator::MSG_PLACEMENT_SERVER_ONLY_FOR_LOOKUP)
	}
}