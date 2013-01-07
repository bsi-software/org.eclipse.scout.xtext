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
class MenuTests {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testMenuSelections() {
		'''
		module a.b
		
		form MenuTest {
			smartfield MySmart {
				menu M1 enabled=true visible=true single_select=true multi_select=true empty_select=true
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testMenuNameUniqueness() {
		'''
		module a.b
		
		form MenuTest {
			smartfield MySmart {
				menu M1 enabled=true visible=true single_select=true multi_select=true empty_select=true
				menu M1 enabled=false visible=true type=separator
			}
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.formElement, SamlJavaValidator::DUPLICATE, SamlJavaValidator::MSG_DUPLICATE_MENU)
	}
	
	@Test
	def void testMenuTypes() {
		'''
		module a.b
		
		form MenuTest {
			logic placement=server event=new_discard {
				"System.out.println(\"canceled\"); return formData;"
			}
			
			smartfield MySmart {
				menu M1 enabled=true visible=true single_select=true multi_select=true empty_select=true
				menu M2 enabled=false visible=true type=separator
				menu M3 enabled=true visible=true type=cancel {
					logic event=click placement=inline {
						"System.out.println(\"cancel menu inline\");"
					}
					logic event=click placement=server {
						"System.out.println(\"cancel menu server\"); return formData;"
					}
					logic event=click placement=client {
						"System.out.println(\"cancel menu client\");"
					}
				}
				menu M4 enabled=true visible=true type=normal
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testMenuTree() {
		'''
		module a.b
		
		translation MenuText default_lang="menu"
		
		form MenuTest {
			smartfield MySmart {
				menu M1 enabled=true visible=true text=MenuText
			}
			table MyTab {
				menu M2 text=MenuText {
					menu M21 text=MenuText {
						logic event=click placement=client {
							""
						}
					}
				}
			}
		}
		'''.parse.assertNoErrors
	}
}