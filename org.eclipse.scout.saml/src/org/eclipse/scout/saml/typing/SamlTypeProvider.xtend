package org.eclipse.scout.saml.typing

import com.google.inject.Singleton
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider

@Singleton
class SamlTypeProvider extends XbaseTypeProvider {
	
	/*
	@Inject extension JvmTypesBuilder
	def dispatch type(XConstructorCall constructorCall, JvmTypeReference rawExpectation, boolean rawType) {
		val t = super._type(constructorCall, rawExpectation, rawType)
		if (constructorCall.isArray)
			t?.addArrayTypeDimension
		else
			t
	}*/
}