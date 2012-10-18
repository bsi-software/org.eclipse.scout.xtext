package org.eclipse.scout.saml.tests

import com.google.inject.Inject
import org.eclipse.scout.saml.SamlInjectorProvider
import org.eclipse.scout.saml.saml.Model
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.scout.saml.saml.SamlPackage
import org.eclipse.scout.saml.validation.SamlJavaValidator
import com.google.inject.Provider
import org.eclipse.xtext.resource.XtextResourceSet

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SamlInjectorProvider))
class ParserTest {
	
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
	def void testLogicElementAttributes() {
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
	def void testForms() {
		'''
		module a.b
		
		form MyForm {
			sequence_box MyBox {
				string myString
				long mylong {
					logic event=all placement=server { "" }
				}
				sequence_box asdf {
					
				}
			}
		}
		'''.parse.assertNoErrors
	}

	@Test
	def void testMasterAttribute() {
		'''
		module a.b
		
		form MyForm {
			string test1
			
			sequence_box MyBox3 {
				string string1
			}
			
			sequence_box MyBox {
				string my master=test1
				string my2 master=string1
			}
		}
		
		form MyForm2 {
			string test1
			string string1 master=test1
		}
		'''.parse.assertNoErrors
	}

	@Test
	def void testTranslations() {
		'''
		module a.b
		
		translation TransTest en="en" de="de" de_CH="de_CH"
		translation TransTest2 en="en" de="de" de_CH="de_CH"
		'''.parse.assertNoErrors
	}


	@Test
	def void testTextRefOverFiles() {
		val resourceSet = resourceSetProvider.get()
		'''
		module a.b
		
		translation TransTest en="en" de="de" de_CH="de_CH"
		translation TransTest2 en="en" de="de" de_CH="de_CH"
		'''.parse(resourceSet).assertNoErrors

		'''
		module a.b
		
		translation TransTest3 en="en"
		
		form MyForm title=TransTest {
			
		}
		'''.parse(resourceSet).assertNoErrors
	}
	
	@Test
	def void testUniquencess() {
		'''
		module a.b
		
		form MyForm {
			sequence_box MyBox {
				string my
			}
			sequence_box MyBox2 {
				string my
			}
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.formElement, SamlJavaValidator::DUPLICATE, SamlJavaValidator::MSG_DUPLICATE_FIELD)
		
		
		val rs = resourceSetProvider.get()
		'''
		module a.b
		form FormA {
			
		}
		'''.parse(rs).assertNoErrors
		
		'''
		module a.b
		form FormA {
			
		}
		'''.parse(rs).assertError(SamlPackage::eINSTANCE.model, SamlJavaValidator::DUPLICATE, SamlJavaValidator::MSG_DUPLICATE)
		
		
		val rs2 = resourceSetProvider.get()
		'''
		module a.b
		form FormA {
			string StringA
		}
		'''.parse(rs2).assertNoErrors
		
		'''
		module a.b
		form FormB {
			string StringA
		}
		'''.parse(rs2).assertNoErrors
	}
}