package org.eclipse.scout.saml.validation;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.scout.commons.holders.BooleanHolder;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.MenuElement;
import org.eclipse.scout.saml.saml.NamedTypeElement;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IContainer.Manager;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SamlJavaValidatorHelper {
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  protected ResourceDescriptionsProvider resourceDescriptionsProvider;
  
  @Inject
  protected Manager manager;
  
  public List<FormFieldElement> allFieldsOfForm(final FormElement form) {
    List<FormFieldElement> _eAllOfType = EcoreUtil2.<FormFieldElement>eAllOfType(form, FormFieldElement.class);
    return _eAllOfType;
  }
  
  public List<MenuElement> allMenusOfForm(final FormElement form) {
    List<MenuElement> _eAllOfType = EcoreUtil2.<MenuElement>eAllOfType(form, MenuElement.class);
    return _eAllOfType;
  }
  
  public List<FormFieldElement> allFieldsInSameForm(final EObject element) {
    FormElement _containerOfType = EcoreUtil2.<FormElement>getContainerOfType(element, FormElement.class);
    List<FormFieldElement> _allFieldsOfForm = this.allFieldsOfForm(_containerOfType);
    return _allFieldsOfForm;
  }
  
  public HashSet<IEObjectDescription> allObjectsOfType(final EObject context, final EClass type) {
    final Resource eResource = context.eResource();
    final IResourceDescriptions index = this.resourceDescriptionsProvider.getResourceDescriptions(eResource);
    URI _uRI = eResource.getURI();
    final IResourceDescription resourceDescription = index.getResourceDescription(_uRI);
    HashSet<IEObjectDescription> _hashSet = new HashSet<IEObjectDescription>();
    HashSet<IEObjectDescription> allVisibileObjects = _hashSet;
    List<IContainer> _visibleContainers = this.manager.getVisibleContainers(resourceDescription, index);
    for (final IContainer visibleContainer : _visibleContainers) {
      Iterable<IEObjectDescription> _exportedObjectsByType = visibleContainer.getExportedObjectsByType(type);
      Iterables.<IEObjectDescription>addAll(allVisibileObjects, _exportedObjectsByType);
    }
    return allVisibileObjects;
  }
  
  public boolean hasGlobalDuplicate(final NamedTypeElement element) {
    String _name = element.getName();
    return this.hasGlobalDuplicate(_name, element);
  }
  
  public boolean hasGlobalDuplicate(final String elementName, final EObject context) {
    return this.hasGlobalDuplicate(elementName, context, false);
  }
  
  public boolean hasGlobalDuplicate(final String elementName, final EObject context, final boolean useFqn) {
    boolean _xblockexpression = false;
    {
      BooleanHolder _booleanHolder = new BooleanHolder(Boolean.valueOf(false));
      final BooleanHolder elementFound = _booleanHolder;
      EClass _eClass = context.eClass();
      HashSet<IEObjectDescription> _allObjectsOfType = this.allObjectsOfType(context, _eClass);
      final Function1<IEObjectDescription,Boolean> _function = new Function1<IEObjectDescription,Boolean>() {
          public Boolean apply(final IEObjectDescription it) {
            QualifiedName _qualifiedName = it.getQualifiedName();
            String candidateName = _qualifiedName.getLastSegment();
            if (useFqn) {
              QualifiedName _qualifiedName_1 = it.getQualifiedName();
              String _string = _qualifiedName_1.toString();
              candidateName = _string;
            }
            boolean _equals = candidateName.equals(elementName);
            if (_equals) {
              Boolean _value = elementFound.getValue();
              if ((_value).booleanValue()) {
                return Boolean.valueOf(false);
              }
              elementFound.setValue(Boolean.valueOf(true));
            }
            return Boolean.valueOf(true);
          }
        };
      boolean _forall = IterableExtensions.<IEObjectDescription>forall(_allObjectsOfType, _function);
      boolean _not = (!_forall);
      _xblockexpression = (_not);
    }
    return _xblockexpression;
  }
  
  public boolean hasDuplicate(final List<? extends EObject> list) {
    boolean _xblockexpression = false;
    {
      HashSet<String> _hashSet = new HashSet<String>();
      final HashSet<String> qualifiedNames = _hashSet;
      final Function1<EObject,Boolean> _function = new Function1<EObject,Boolean>() {
          public Boolean apply(final EObject it) {
            QualifiedName _fullyQualifiedName = SamlJavaValidatorHelper.this._iQualifiedNameProvider.getFullyQualifiedName(it);
            String _lastSegment = _fullyQualifiedName.getLastSegment();
            boolean _add = qualifiedNames.add(_lastSegment);
            return Boolean.valueOf(_add);
          }
        };
      boolean _forall = IterableExtensions.forall(list, _function);
      boolean _not = (!_forall);
      _xblockexpression = (_not);
    }
    return _xblockexpression;
  }
}
