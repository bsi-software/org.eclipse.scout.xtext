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
class MenuTests {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
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