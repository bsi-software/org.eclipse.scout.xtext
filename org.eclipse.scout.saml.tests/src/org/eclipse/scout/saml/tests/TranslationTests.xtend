package org.eclipse.scout.saml.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.scout.saml.SamlInjectorProvider
import org.eclipse.scout.saml.saml.Model
import org.eclipse.scout.saml.saml.SamlPackage
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.scout.saml.validation.SamlJavaValidator

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SamlInjectorProvider))
class TranslationTests {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;
	
	@Test
	def void testTranslations() {
		'''
		module a.b
		
		translation TransTest en="en" de="de" de_CH="de_CH"
		translation TransTest2 en="en" de="de" de_CH="de_CH"
		'''.parse.assertNoErrors
	}

	@Test
	def void testLangAttributes() {
		'''
		module a.b
		
		translation MyTrans en="en" en="ab"
		'''.parse.assertError(SamlPackage::eINSTANCE.translationElement, SamlJavaValidator::DUPLICATE, SamlJavaValidator::MSG_DUPLICATE_LANG)
	}
	
	@Test
	def void testNlsKeyAttributes() {
		'''
		module a.b
		
		translation MyTrans.test.blub en="en" 
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testFqnDuplicate() {
		'''
		module a.b
		
		translation MyTrans.test.blub en="en"
		translation MyTrans.test2.blub en="en"
		translation MyTrans2.test.blub en="en"
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testTranslationDuplicate() {
		'''
		module a.b
		
		translation MyTrans.test.blub en="en"
		translation MyTrans.test.blub en="en"
		'''.parse.assertError(SamlPackage::eINSTANCE.translationElement, SamlJavaValidator::DUPLICATE, SamlJavaValidator::MSG_DUPLICATE)
	}
	
	@Test
	def void testQualifiedNlsKeyReference() {
		val resourceSet = resourceSetProvider.get()
		'''
		module a.b
		
		translation MyTrans.test.blub en="en" 
		'''.parse(resourceSet).assertNoErrors
		
		'''
		module a.b
		
		form MyForm title=MyTrans.test.blub {
			
		}
		'''.parse(resourceSet).assertNoErrors
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
	def void testLanguagePattern() {
		'''
		module a.b
		
		translation MyTrans e="en" it_CH="it" default_lang="ab"
		'''.parse.assertError(SamlPackage::eINSTANCE.translationElement, SamlJavaValidator::INVALID_LANG, SamlJavaValidator::MSG_INVALID_LANG)
		
		'''
		module a.b
		
		translation MyTrans enn="en" it_CH="it" default_lang="ab"
		'''.parse.assertError(SamlPackage::eINSTANCE.translationElement, SamlJavaValidator::INVALID_LANG, SamlJavaValidator::MSG_INVALID_LANG)
		
		'''
		module a.b
		
		translation MyTrans eafdsadf="en" it_CH="it" default_lang="ab"
		'''.parse.assertError(SamlPackage::eINSTANCE.translationElement, SamlJavaValidator::INVALID_LANG, SamlJavaValidator::MSG_INVALID_LANG)
		
		'''
		module a.b
		
		translation MyTrans en_GBB="en" default_lang="ab"
		'''.parse.assertError(SamlPackage::eINSTANCE.translationElement, SamlJavaValidator::INVALID_LANG, SamlJavaValidator::MSG_INVALID_LANG)
	}
	
	@Test
	def void testDefaultLangMissing() {
		'''
		module a.b
		
		translation MyTrans en="en" it_CH="it" default_lang="ab"
		'''.parse.assertNoErrors
		
		'''
		module a.b
		
		translation MyTrans en="en" default_lang="ab"
		'''.parse.assertNoIssues
		
		'''
		module a.b
		
		translation MyTrans en="en" ab="ab"
		'''.parse.assertWarning(SamlPackage::eINSTANCE.translationElement, SamlJavaValidator::DEFAULT_LANG_MISSING, SamlJavaValidator::MSG_DEFAULT_LANG_MISSING)
	}
}