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
import org.eclipse.emf.ecore.EClass
import java.util.Set
import java.util.List
import org.eclipse.scout.saml.saml.MenuElement

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
	
	def allFieldsOfForm(FormElement form) {
		form.eAllOfType(typeof(FormFieldElement));
	}
	
	def allMenusOfForm(FormElement form) {
		form.eAllOfType(typeof(MenuElement));
	}
	
	def allFieldsInSameForm(EObject element) {
		element.getContainerOfType(typeof(FormElement)).allFieldsOfForm
	}
	
	def allObjectsOfType(EObject context, EClass type) {
		val eResource = context.eResource();
		val index = resourceDescriptionsProvider.getResourceDescriptions(eResource);
		val resourceDescription = index.getResourceDescription(eResource.getURI());
		var allVisibileObjects = new HashSet<IEObjectDescription>();
		for (IContainer visibleContainer : manager.getVisibleContainers(resourceDescription, index)) {
			allVisibileObjects.addAll(visibleContainer.getExportedObjectsByType(type));
		}
		return allVisibileObjects;
	}
	
	def hasGlobalDuplicate(EObject context, EClass type) {
		hasGlobalDuplicate(context, type, false)
	}
	
	def hasGlobalDuplicate(EObject context, EClass type, boolean useFqn) {
		context.allObjectsOfType(type).hasDuplicate(useFqn)
	}
	
	def hasDuplicate(Set<IEObjectDescription> d, boolean useFqn) {
		val qualifiedNames = new HashSet<String>()
		!d.forall [
			if(useFqn) {
				qualifiedNames.add(it.qualifiedName.toString)
			} else {
				qualifiedNames.add(it.qualifiedName.lastSegment)
			}
		]
	}
	
	def hasDuplicate(List<? extends EObject> list) {
		val qualifiedNames = new HashSet<String>()
		!list.forall [
			qualifiedNames.add(it.fullyQualifiedName.lastSegment)
		]
	}
}