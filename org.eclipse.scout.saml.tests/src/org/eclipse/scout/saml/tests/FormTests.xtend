package org.eclipse.scout.saml.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.scout.saml.SamlInjectorProvider
import org.eclipse.scout.saml.saml.Model
import org.eclipse.scout.saml.saml.SamlPackage
import org.eclipse.scout.saml.validation.SamlJavaValidator
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SamlInjectorProvider))
class FormTests {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Inject private Provider<XtextResourceSet> resourceSetProvider;

	@Test
	def void testFormFieldUniqueness() {
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
		
		'''
		module a.b
		
		form MyForm {
			date d1
			date d2
			date d1
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.formElement, SamlJavaValidator::DUPLICATE, SamlJavaValidator::MSG_DUPLICATE_FIELD)
		
		'''
		module a.b
		
		form MyForm {
			sequence_box MyBox {
				string my
			}
			sequence_box MyBox2 {
				string my2
			}
		}
		
		form MyForm2 {
			string my
			string my2
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleForm() {
		'''
		module a.b
		
		form MyForm {
			sequence_box MyBox {
				string myString
				long mylong {
					logic event=changed placement=server { "" }
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
	def void testFormUniquencessOverFiles() {
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
		translation T1 en="en"
		form FormA title=T1 {
			string StringA
		}
		'''.parse(rs2).assertNoErrors
		
		'''
		module a.b
		form FormB title=T1 {
			string StringA
		}
		'''.parse(rs2).assertNoErrors
	}
	
	
}