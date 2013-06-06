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

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SamlInjectorProvider))
class MiscTests {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testEscapedNames() {
		'''
		module a.test.^shared
		
		translation My.^form.test.Name en="en" de="de" de_CH="de_CH"
		translation TransTest2 en="en" de="de" de_CH="de_CH"
		
		form ^form {}
		'''.parse.assertNoErrors
	}
}