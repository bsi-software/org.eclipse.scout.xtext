package org.eclipse.scout.saml.typing

import org.eclipse.xtext.xbase.typing.XbaseTypeProvider
import org.eclipse.scout.saml.saml.XConstructorCall
import org.eclipse.xtext.common.types.JvmTypeReference
import com.google.inject.Singleton
import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

@Singleton
class SamlTypeProvider extends XbaseTypeProvider {
	
	@Inject extension JvmTypesBuilder
	
	def dispatch type(XConstructorCall constructorCall, JvmTypeReference rawExpectation, boolean rawType) {
		val t = super._type(constructorCall, rawExpectation, rawType)
		if (constructorCall.isArray)
			t?.addArrayTypeDimension
		else
			t
	}
}