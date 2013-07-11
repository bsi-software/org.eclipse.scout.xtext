package org.eclipse.scout.saml.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.scout.saml.SamlInjectorProvider
import org.eclipse.scout.saml.saml.Model
import org.eclipse.scout.saml.saml.SamlPackage
import org.eclipse.scout.saml.validation.SamlJavaValidator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SamlInjectorProvider))
class LogicTests {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;

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
	def void testNoFormatValue() {
		'''
		module a.b
		
		form MyTest {
			string MyString  {
				logic event=format_value placement=server {
					"whatever"
				}
			}
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::INVALID_LOGIC_ELEMENT, SamlJavaValidator::MSG_EVENT_ONLY_INLINE)
		
		'''
		module a.b
		
		form MyTest {
			string MyString  {
				logic event=format_value placement=inline {
					"whatever"
				}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testNamedTopLevelLogic() {
		'''
		module a.b
		
		logic Foo3 placement=server { "" }
		logic Foo placement=server { "" }
		logic Foo2 placement=client { "" }
		'''.parse.assertNoErrors
		
		'''
		module a.b
		
		logic Foo3 placement=server { "" }
		logic Foo placement=server { "" }
		logic Foo placement=client { "" }
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
	
	@Test
	def void testKeyStrokeLogic() {
		'''
		module a.b
		form MyForm {
			key DoSomething stroke="f2" {
				logic event=activated placement=server { "" }
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testEventMatchingContainer() {
		'''
		module a.b
		form MyForm {
			key stroke="f2" {
				logic event=click placement=server { "" }
			}
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::INVALID_LOGIC_ELEMENT, SamlJavaValidator::MSG_WRONG_LOGIC_EVENT)
	}
	
	@Test
	def void testSeparatedLogic() {
		val resourceSet = resourceSetProvider.get()
		
		'''
		module c.test
		logic EvalForm placement=client {
		    "whatever"
		}
		'''.parse(resourceSet).assertNoErrors
		
		'''
		module c.test
		form MyForm {
		    logic exec=EvalForm
		}
		'''.parse(resourceSet).assertNoErrors
	}
	
	@Test
	def void testUnnamedSeparatedLogic() {
		val resourceSet = resourceSetProvider.get()
		
		'''
		module c.test
		logic placement=client {
		    "whatever"
		}
		'''.parse(resourceSet).assertError(SamlPackage::eINSTANCE.logicElement, SamlJavaValidator::INVALID_LOGIC_ELEMENT, SamlJavaValidator::MSG_ONLY_NAMED_LOGIC_ON_TOP_LEVEL)
	}
	
	@Test
	def void testRegexValidationLogic() {
		'''
		module a.b
		
		form MyTest {
			string MyString  {
				logic event=validate_value placement=inline {
					"[0-9]{1}"
				}
			}
		}
		'''.parse.assertNoErrors
		
		'''
		module a.b
		
		logic RegexValidationCode placement=inline {
		    "[0-9]{1}"
		}
		
		form MyTest {
			string MyString  {
				logic event=validate_value exec=RegexValidationCode
			}
		}
		'''.parse.assertNoErrors
	}
}