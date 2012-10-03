package org.eclipse.scout.saml.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.Model;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.ValueFieldElement;
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
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class SamlJavaValidatorHelper {
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  protected ResourceDescriptionsProvider resourceDescriptionsProvider;
  
  @Inject
  protected Manager manager;
  
  public EObject hasDuplicates(final EObject eObject) {
    Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(eObject, Model.class);
    TreeIterator<EObject> _eAll = EcoreUtil2.eAll(_containerOfType);
    final Function1<EObject,Boolean> _function = new Function1<EObject,Boolean>() {
        public Boolean apply(final EObject it) {
          boolean _and = false;
          boolean _and_1 = false;
          boolean _and_2 = false;
          boolean _and_3 = false;
          EClass _eClass = it.eClass();
          EPackage _ePackage = _eClass.getEPackage();
          boolean _equals = Objects.equal(_ePackage, SamlPackage.eINSTANCE);
          if (!_equals) {
            _and_3 = false;
          } else {
            boolean _notEquals = (!Objects.equal(it, eObject));
            _and_3 = (_equals && _notEquals);
          }
          if (!_and_3) {
            _and_2 = false;
          } else {
            QualifiedName _fullyQualifiedName = SamlJavaValidatorHelper.this._iQualifiedNameProvider.getFullyQualifiedName(it);
            boolean _notEquals_1 = (!Objects.equal(_fullyQualifiedName, null));
            _and_2 = (_and_3 && _notEquals_1);
          }
          if (!_and_2) {
            _and_1 = false;
          } else {
            QualifiedName _fullyQualifiedName_1 = SamlJavaValidatorHelper.this._iQualifiedNameProvider.getFullyQualifiedName(eObject);
            boolean _notEquals_2 = (!Objects.equal(_fullyQualifiedName_1, null));
            _and_1 = (_and_2 && _notEquals_2);
          }
          if (!_and_1) {
            _and = false;
          } else {
            QualifiedName _fullyQualifiedName_2 = SamlJavaValidatorHelper.this._iQualifiedNameProvider.getFullyQualifiedName(it);
            String _lastSegment = _fullyQualifiedName_2.getLastSegment();
            QualifiedName _fullyQualifiedName_3 = SamlJavaValidatorHelper.this._iQualifiedNameProvider.getFullyQualifiedName(eObject);
            String _lastSegment_1 = _fullyQualifiedName_3.getLastSegment();
            boolean _equals_1 = Objects.equal(_lastSegment, _lastSegment_1);
            _and = (_and_1 && _equals_1);
          }
          return Boolean.valueOf(_and);
        }
      };
    EObject _findFirst = IteratorExtensions.<EObject>findFirst(_eAll, _function);
    return _findFirst;
  }
  
  public List<ValueFieldElement> leafNodes(final EObject element) {
    FormElement _containerOfType = EcoreUtil2.<FormElement>getContainerOfType(element, FormElement.class);
    List<ValueFieldElement> _eAllOfType = EcoreUtil2.<ValueFieldElement>eAllOfType(_containerOfType, ValueFieldElement.class);
    return _eAllOfType;
  }
  
  public HashSet<IEObjectDescription> allTranslations(final EObject context) {
    final Resource eResource = context.eResource();
    final IResourceDescriptions index = this.resourceDescriptionsProvider.getResourceDescriptions(eResource);
    URI _uRI = eResource.getURI();
    final IResourceDescription resourceDescription = index.getResourceDescription(_uRI);
    HashSet<IEObjectDescription> _hashSet = new HashSet<IEObjectDescription>();
    HashSet<IEObjectDescription> allVisibileTranslations = _hashSet;
    List<IContainer> _visibleContainers = this.manager.getVisibleContainers(resourceDescription, index);
    for (final IContainer visibleContainer : _visibleContainers) {
      EClass _translationElement = SamlPackage.eINSTANCE.getTranslationElement();
      Iterable<IEObjectDescription> _exportedObjectsByType = visibleContainer.getExportedObjectsByType(_translationElement);
      Iterables.<IEObjectDescription>addAll(allVisibileTranslations, _exportedObjectsByType);
    }
    return allVisibileTranslations;
  }
  
  public boolean hasDuplicateTranslations(final EObject context) {
    boolean _xblockexpression = false;
    {
      HashSet<String> _hashSet = new HashSet<String>();
      final HashSet<String> qualifiedNames = _hashSet;
      HashSet<IEObjectDescription> _allTranslations = this.allTranslations(context);
      final Function1<IEObjectDescription,Boolean> _function = new Function1<IEObjectDescription,Boolean>() {
          public Boolean apply(final IEObjectDescription it) {
            QualifiedName _qualifiedName = it.getQualifiedName();
            String _lastSegment = _qualifiedName.getLastSegment();
            boolean _add = qualifiedNames.add(_lastSegment);
            return Boolean.valueOf(_add);
          }
        };
      boolean _forall = IterableExtensions.<IEObjectDescription>forall(_allTranslations, _function);
      boolean _not = (!_forall);
      _xblockexpression = (_not);
    }
    return _xblockexpression;
  }
}
