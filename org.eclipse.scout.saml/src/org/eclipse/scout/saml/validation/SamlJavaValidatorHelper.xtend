package org.eclipse.scout.saml.validation

import com.google.inject.Inject
import java.util.HashSet
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.scout.commons.holders.BooleanHolder
import org.eclipse.scout.saml.saml.FormElement
import org.eclipse.scout.saml.saml.FormFieldElement
import org.eclipse.scout.saml.saml.MenuElement
import org.eclipse.scout.saml.saml.NamedTypeElement
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider

import static extension org.eclipse.xtext.EcoreUtil2.*

class SamlJavaValidatorHelper {
	
	@Inject extension IQualifiedNameProvider
	
	@Inject
	protected ResourceDescriptionsProvider resourceDescriptionsProvider;

	@Inject
	protected IContainer$Manager manager;
	
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
	
	def hasGlobalDuplicate(NamedTypeElement element) {
		return hasGlobalDuplicate(element.name, element);
	}
	
	def hasGlobalDuplicate(String elementName, EObject context) {
		return hasGlobalDuplicate(elementName, context, false);
	}
	
	def hasGlobalDuplicate(String elementName, EObject context, boolean useFqn) {
		val elementFound = new BooleanHolder(false);
		!allObjectsOfType(context, context.eClass()).forall [
			var candidateName = it.qualifiedName.lastSegment;
			if (useFqn) {
				candidateName = it.qualifiedName.toString;
			}
			if (candidateName.equals(elementName)) {
				if (elementFound.value) {
					return false;
				}
				elementFound.setValue(true);
			}
			return true;
		]
	}
	
	def hasDuplicate(List<? extends EObject> list) {
		val qualifiedNames = new HashSet<String>()
		!list.forall [
			qualifiedNames.add(it.fullyQualifiedName.lastSegment)
		]
	}
}