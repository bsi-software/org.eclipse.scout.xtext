package org.eclipse.scout.saml.validation

import com.google.inject.Inject
import java.util.HashSet
import org.eclipse.emf.ecore.EObject
import org.eclipse.scout.saml.saml.FormElement
import org.eclipse.scout.saml.saml.FormFieldElement
import org.eclipse.scout.saml.saml.Model
import org.eclipse.scout.saml.saml.SamlPackage
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IContainer$Manager
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider

import static extension org.eclipse.xtext.EcoreUtil2.*

class SamlJavaValidatorHelper {
	
	@Inject extension IQualifiedNameProvider
	
	@Inject
	protected ResourceDescriptionsProvider resourceDescriptionsProvider;

	@Inject
	protected IContainer$Manager manager;
	
	def hasDuplicates(EObject eObject) {
		eObject.getContainerOfType(typeof(Model)).
			eAll.findFirst [ 
				it.eClass.EPackage == SamlPackage::eINSTANCE &&
				it != eObject && 
				it.fullyQualifiedName != null &&
				eObject.fullyQualifiedName != null && 
				it.fullyQualifiedName.lastSegment == eObject.fullyQualifiedName.lastSegment
			]
	}
	
	def allFieldsInSameForm(EObject element) {
		element.getContainerOfType(typeof(FormElement)).eAllOfType(typeof(FormFieldElement))
	}
	
	def allTranslations(EObject context) {
		val eResource = context.eResource();
		val index = resourceDescriptionsProvider
				.getResourceDescriptions(eResource);
		val resourceDescription = index
				.getResourceDescription(eResource.getURI());
		var allVisibileTranslations = new HashSet<IEObjectDescription>();
		for (IContainer visibleContainer : manager.getVisibleContainers(
				resourceDescription, index)) {
			allVisibileTranslations.addAll(visibleContainer
					.getExportedObjectsByType(SamlPackage::eINSTANCE.translationElement));
		}
		return allVisibileTranslations;
	}
	
	def hasDuplicateTranslations(EObject context) {
		val qualifiedNames = new HashSet<String>()
		! context.allTranslations.forall [
			qualifiedNames.add(qualifiedName.lastSegment)
		]
	}
}