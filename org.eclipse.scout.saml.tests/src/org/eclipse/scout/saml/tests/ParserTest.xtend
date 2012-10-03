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
	def void testParsingAndLinking() {
		'''
module a.b

import java.util.List
import org.eclipse.scout.rt.shared.services.^lookup.LookupRow

form MyForm {

logic Foo runat=server {
	return new 
	java.util.LinkedList<org.eclipse.scout.rt.shared.services.^lookup.LookupRow>();
}

logic Foo2 runat=server {
	return new 
	java.util.LinkedList<org.eclipse.scout.rt.shared.services.^lookup.LookupRow>();
}

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
	def void testXVariableDeclaration() {
'''
module a.b

import java.util.List
import org.eclipse.scout.rt.shared.services.^lookup.LookupRow

form MyForm {

logic Foo runat=server {
	String s = "String";
	String s1 = "My" + s;
	return new java.util.LinkedList<org.eclipse.scout.rt.shared.services.^lookup.LookupRow>();
}

}
'''.parse.assertNoErrors
	}

	@Test
	def void testXTypeLiteral() {
'''
module a.b

import java.util.List
import org.eclipse.xtext.EcoreUtil2

form MyForm {

logic Foo runat=server {
	List<String> strings =
		EcoreUtil2::typeSelect
			(new java.util.LinkedList<String>(), String.class) ;
	return null;
}

}
'''.parse.assertNoErrors
	}

	@Test
	def void testXUnaryOperation() {
'''
module a.b

import java.util.List
import org.eclipse.xtext.EcoreUtil2

form MyForm {

logic Foo runat=server {
	boolean isItTrue =
		!(EcoreUtil2::typeSelect
			(new java.util.LinkedList<String>(), String.class).size() > 0) ;
	return null;
}

}
'''.parse.assertNoErrors
	}

	@Test
	def void testConstructorCall() {
'''
module a.b

import java.util.List
import org.eclipse.xtext.EcoreUtil2

form MyForm {

logic Foo runat=server {
	String s = new String();
	String s2 = new String("test");
	return null;
}

}
'''.parse.assertNoErrors
	}

	@Test
	def void testMultipleFiles() {
		val resourceSet = resourceSetProvider.get()
		'''
module a.b

translation TransTest en="en" de="de" de_CH="de_CH"
translation TransTest2 en="en" de="de" de_CH="de_CH"
'''.parse(resourceSet).assertNoErrors

'''
module a.b

translation TransTest3 en="en"

form MyForm text=TransTest {
	
}
'''.parse(resourceSet).assertNoErrors
	}
	
}