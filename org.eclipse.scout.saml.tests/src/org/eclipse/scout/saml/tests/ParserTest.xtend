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

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SamlInjectorProvider))
class ParserTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper

	@Test
	def void testParsingAndLinking() {
		'''
module a.b

import java.util.List
import org.eclipse.scout.rt.shared.services.^lookup.LookupRow


java_code Foo runat=server {
	return new 
	java.util.LinkedList<org.eclipse.scout.rt.shared.services.^lookup.LookupRow>();
}

java_code Foo2 runat=server {
	return new 
	java.util.LinkedList<org.eclipse.scout.rt.shared.services.^lookup.LookupRow>();
}
		'''.parse.assertNoErrors
	}
	
	
	@Test
	def void testForms() {
'''
module a.b

import java.util.List
import org.eclipse.scout.rt.shared.services.^lookup.LookupRow

form MyForm {
	sequence_box MyBox {
		string my
		long mzlong {
			logic event=all runat=server {
				
			}
		}
		sequence_box asdf {
			
		}
	}
}
'''.parse.assertNoErrors
	}

	@Test
	def void testLogicElementValidation() {
'''
module a.b

import java.util.List
import org.eclipse.scout.rt.shared.services.^lookup.LookupRow

form MyForm {
	sequence_box MyBox {
		string my
		long mzlong {
			logic event=all {
				return null
			}
		}
		sequence_box asdf {
			
		}
	}
}
'''.parse.assertError(
	SamlPackage::eINSTANCE.logicElement,
	SamlJavaValidator::RUNAT_MANDATORY,
	"'runat' is mandatory when providing the source"
)
	}

	@Test
	def void testDuplicateElements() {
'''
module a.b

import java.util.List
import org.eclipse.scout.rt.shared.services.^lookup.LookupRow

form MyForm {
	sequence_box MyForm {
		string my
	}
}
'''.parse.assertError(
	SamlPackage::eINSTANCE.formElement,
	SamlJavaValidator::DUPLICATE
)
	}

	@Test
	def void testLeafNodeScoping() {
'''
module a.b

import java.util.List
import org.eclipse.scout.rt.shared.services.^lookup.LookupRow

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
'''.parse.assertNoErrors
	}

	@Test
	def void testNonDuplicateTranslations() {
'''
module a.b

translation TransTest en="en" de="de" de_CH="de_CH"
translation TransTest2 en="en" de="de" de_CH="de_CH"
'''.parse.assertNoErrors
	}

	@Test
	def void testVariableDeclarations() {
'''
module a.b

import java.util.List
import org.eclipse.scout.rt.shared.services.^lookup.LookupRow

java_code Foo runat=server {
	String s = "String";
	String s1 = "My" + s;
	return new java.util.LinkedList<org.eclipse.scout.rt.shared.services.^lookup.LookupRow>();
}
'''.parse.assertNoErrors
	}
	
}