/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.scout.saml.saml.SamlFactory
 * @model kind="package"
 * @generated
 */
public interface SamlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "saml";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/scout/saml/Saml";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "saml";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SamlPackage eINSTANCE = org.eclipse.scout.saml.saml.impl.SamlPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.ModelImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODULE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Translations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TRANSLATIONS = 2;

  /**
   * The feature id for the '<em><b>Codes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CODES = 3;

  /**
   * The feature id for the '<em><b>Lookups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__LOOKUPS = 4;

  /**
   * The feature id for the '<em><b>Templates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TEMPLATES = 5;

  /**
   * The feature id for the '<em><b>Forms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FORMS = 6;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.ModuleElementImpl <em>Module Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.ModuleElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getModuleElement()
   * @generated
   */
  int MODULE_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Module Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.ImportElementImpl <em>Import Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.ImportElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getImportElement()
   * @generated
   */
  int IMPORT_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_ELEMENT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.TranslationElementImpl <em>Translation Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.TranslationElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTranslationElement()
   * @generated
   */
  int TRANSLATION_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSLATION_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Translations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSLATION_ELEMENT__TRANSLATIONS = 1;

  /**
   * The number of structural features of the '<em>Translation Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSLATION_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LanguageAttributeImpl <em>Language Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LanguageAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLanguageAttribute()
   * @generated
   */
  int LANGUAGE_ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_ATTRIBUTE__LANG = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_ATTRIBUTE__TEXT = 1;

  /**
   * The number of structural features of the '<em>Language Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LogicElementImpl <em>Logic Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LogicElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicElement()
   * @generated
   */
  int LOGIC_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__EVENT = 1;

  /**
   * The feature id for the '<em><b>Runat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__RUNAT = 2;

  /**
   * The feature id for the '<em><b>Exec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__EXEC = 3;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__SOURCE = 4;

  /**
   * The number of structural features of the '<em>Logic Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.CodeElementImpl <em>Code Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.CodeElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCodeElement()
   * @generated
   */
  int CODE_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ELEMENT__ID = 1;

  /**
   * The number of structural features of the '<em>Code Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LookupElementImpl <em>Lookup Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LookupElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLookupElement()
   * @generated
   */
  int LOOKUP_ELEMENT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_ELEMENT__LOGIC = 1;

  /**
   * The number of structural features of the '<em>Lookup Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.TemplateElementImpl <em>Template Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.TemplateElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTemplateElement()
   * @generated
   */
  int TEMPLATE_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_ELEMENT__DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Template Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.FormElementImpl <em>Form Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.FormElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getFormElement()
   * @generated
   */
  int FORM_ELEMENT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Modal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__MODAL = 1;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__COLUMNS = 2;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__TEXT = 3;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__LOGIC = 4;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__FIELDS = 5;

  /**
   * The number of structural features of the '<em>Form Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.FormFieldElementImpl <em>Form Field Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.FormFieldElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getFormFieldElement()
   * @generated
   */
  int FORM_FIELD_ELEMENT = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FIELD_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FIELD_ELEMENT__LOGIC = 1;

  /**
   * The number of structural features of the '<em>Form Field Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FIELD_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.FormFieldPropertiesImpl <em>Form Field Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.FormFieldPropertiesImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getFormFieldProperties()
   * @generated
   */
  int FORM_FIELD_PROPERTIES = 11;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FIELD_PROPERTIES__TEXT = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FIELD_PROPERTIES__ENABLED = 1;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FIELD_PROPERTIES__VISIBLE = 2;

  /**
   * The feature id for the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FIELD_PROPERTIES__MASTER = 3;

  /**
   * The number of structural features of the '<em>Form Field Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FIELD_PROPERTIES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.CompositeFieldElementImpl <em>Composite Field Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.CompositeFieldElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCompositeFieldElement()
   * @generated
   */
  int COMPOSITE_FIELD_ELEMENT = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD_ELEMENT__NAME = FORM_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD_ELEMENT__LOGIC = FORM_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Form Field Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD_ELEMENT__FORM_FIELD_PROPERTIES = FORM_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD_ELEMENT__FIELDS = FORM_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Composite Field Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT = FORM_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.SequenceBoxElementImpl <em>Sequence Box Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.SequenceBoxElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSequenceBoxElement()
   * @generated
   */
  int SEQUENCE_BOX_ELEMENT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__NAME = COMPOSITE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__LOGIC = COMPOSITE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Form Field Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__FORM_FIELD_PROPERTIES = COMPOSITE_FIELD_ELEMENT__FORM_FIELD_PROPERTIES;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__FIELDS = COMPOSITE_FIELD_ELEMENT__FIELDS;

  /**
   * The number of structural features of the '<em>Sequence Box Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT_FEATURE_COUNT = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.GroupBoxElementImpl <em>Group Box Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.GroupBoxElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getGroupBoxElement()
   * @generated
   */
  int GROUP_BOX_ELEMENT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__NAME = COMPOSITE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__LOGIC = COMPOSITE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Form Field Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__FORM_FIELD_PROPERTIES = COMPOSITE_FIELD_ELEMENT__FORM_FIELD_PROPERTIES;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__FIELDS = COMPOSITE_FIELD_ELEMENT__FIELDS;

  /**
   * The number of structural features of the '<em>Group Box Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT_FEATURE_COUNT = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.ValueFieldElementImpl <em>Value Field Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.ValueFieldElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getValueFieldElement()
   * @generated
   */
  int VALUE_FIELD_ELEMENT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT__NAME = FORM_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT__LOGIC = FORM_FIELD_ELEMENT__LOGIC;

  /**
   * The number of structural features of the '<em>Value Field Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT_FEATURE_COUNT = FORM_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.ValueFieldPropertiesImpl <em>Value Field Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.ValueFieldPropertiesImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getValueFieldProperties()
   * @generated
   */
  int VALUE_FIELD_PROPERTIES = 16;

  /**
   * The feature id for the '<em><b>Form Field Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_PROPERTIES__FORM_FIELD_PROPERTIES = 0;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_PROPERTIES__MANDATORY = 1;

  /**
   * The number of structural features of the '<em>Value Field Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_PROPERTIES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.StringElementImpl <em>String Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.StringElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getStringElement()
   * @generated
   */
  int STRING_ELEMENT = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__NAME = VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__LOGIC = VALUE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Value Field Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__VALUE_FIELD_PROPERTIES = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Maxlen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__MAXLEN = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT_FEATURE_COUNT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.DoubleElementImpl <em>Double Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.DoubleElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getDoubleElement()
   * @generated
   */
  int DOUBLE_ELEMENT = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ELEMENT__NAME = VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ELEMENT__LOGIC = VALUE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Value Field Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ELEMENT__VALUE_FIELD_PROPERTIES = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ELEMENT_FEATURE_COUNT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LongElementImpl <em>Long Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LongElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLongElement()
   * @generated
   */
  int LONG_ELEMENT = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__NAME = VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__LOGIC = VALUE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Value Field Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__VALUE_FIELD_PROPERTIES = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Long Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT_FEATURE_COUNT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.DateElementImpl <em>Date Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.DateElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getDateElement()
   * @generated
   */
  int DATE_ELEMENT = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__NAME = VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__LOGIC = VALUE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Value Field Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__VALUE_FIELD_PROPERTIES = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Date Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT_FEATURE_COUNT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementImpl <em>Smartfield Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.SmartfieldElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSmartfieldElement()
   * @generated
   */
  int SMARTFIELD_ELEMENT = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__NAME = VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__LOGIC = VALUE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Value Field Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__VALUE_FIELD_PROPERTIES = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__CODE = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__VALUE_TYPE = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Lookup</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__LOOKUP = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Smartfield Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT_FEATURE_COUNT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl <em>Custom Field Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCustomFieldElement()
   * @generated
   */
  int CUSTOM_FIELD_ELEMENT = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__NAME = VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__LOGIC = VALUE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__TEMPLATE = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Form Field Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__FORM_FIELD_PROPERTIES = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__FIELDS = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Custom Field Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT_FEATURE_COUNT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.XBlockExpressionImpl <em>XBlock Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.XBlockExpressionImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getXBlockExpression()
   * @generated
   */
  int XBLOCK_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBLOCK_EXPRESSION__EXPRESSIONS = XbasePackage.XBLOCK_EXPRESSION__EXPRESSIONS;

  /**
   * The number of structural features of the '<em>XBlock Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XBLOCK_EXPRESSION_FEATURE_COUNT = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.XVariableDeclarationImpl <em>XVariable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.XVariableDeclarationImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getXVariableDeclaration()
   * @generated
   */
  int XVARIABLE_DECLARATION = 24;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XVARIABLE_DECLARATION__TYPE = XbasePackage.XVARIABLE_DECLARATION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XVARIABLE_DECLARATION__NAME = XbasePackage.XVARIABLE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XVARIABLE_DECLARATION__RIGHT = XbasePackage.XVARIABLE_DECLARATION__RIGHT;

  /**
   * The feature id for the '<em><b>Writeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XVARIABLE_DECLARATION__WRITEABLE = XbasePackage.XVARIABLE_DECLARATION__WRITEABLE;

  /**
   * The number of structural features of the '<em>XVariable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XVARIABLE_DECLARATION_FEATURE_COUNT = XbasePackage.XVARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.XConstructorCallImpl <em>XConstructor Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.XConstructorCallImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getXConstructorCall()
   * @generated
   */
  int XCONSTRUCTOR_CALL = 25;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL__CONSTRUCTOR = XbasePackage.XCONSTRUCTOR_CALL__CONSTRUCTOR;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL__ARGUMENTS = XbasePackage.XCONSTRUCTOR_CALL__ARGUMENTS;

  /**
   * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL__TYPE_ARGUMENTS = XbasePackage.XCONSTRUCTOR_CALL__TYPE_ARGUMENTS;

  /**
   * The feature id for the '<em><b>Invalid Feature Issue Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL__INVALID_FEATURE_ISSUE_CODE = XbasePackage.XCONSTRUCTOR_CALL__INVALID_FEATURE_ISSUE_CODE;

  /**
   * The feature id for the '<em><b>Valid Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL__VALID_FEATURE = XbasePackage.XCONSTRUCTOR_CALL__VALID_FEATURE;

  /**
   * The feature id for the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL__IS_ARRAY = XbasePackage.XCONSTRUCTOR_CALL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XConstructor Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XCONSTRUCTOR_CALL_FEATURE_COUNT = XbasePackage.XCONSTRUCTOR_CALL_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.eclipse.scout.saml.saml.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.Model#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see org.eclipse.scout.saml.saml.Model#getModule()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Module();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipse.scout.saml.saml.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.Model#getTranslations <em>Translations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Translations</em>'.
   * @see org.eclipse.scout.saml.saml.Model#getTranslations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Translations();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.Model#getCodes <em>Codes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Codes</em>'.
   * @see org.eclipse.scout.saml.saml.Model#getCodes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Codes();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.Model#getLookups <em>Lookups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lookups</em>'.
   * @see org.eclipse.scout.saml.saml.Model#getLookups()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Lookups();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.Model#getTemplates <em>Templates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Templates</em>'.
   * @see org.eclipse.scout.saml.saml.Model#getTemplates()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Templates();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.Model#getForms <em>Forms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Forms</em>'.
   * @see org.eclipse.scout.saml.saml.Model#getForms()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Forms();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.ModuleElement <em>Module Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Element</em>'.
   * @see org.eclipse.scout.saml.saml.ModuleElement
   * @generated
   */
  EClass getModuleElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ModuleElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.ModuleElement#getName()
   * @see #getModuleElement()
   * @generated
   */
  EAttribute getModuleElement_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.ImportElement <em>Import Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Element</em>'.
   * @see org.eclipse.scout.saml.saml.ImportElement
   * @generated
   */
  EClass getImportElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ImportElement#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.eclipse.scout.saml.saml.ImportElement#getImportedNamespace()
   * @see #getImportElement()
   * @generated
   */
  EAttribute getImportElement_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.TranslationElement <em>Translation Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Translation Element</em>'.
   * @see org.eclipse.scout.saml.saml.TranslationElement
   * @generated
   */
  EClass getTranslationElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.TranslationElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.TranslationElement#getName()
   * @see #getTranslationElement()
   * @generated
   */
  EAttribute getTranslationElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.TranslationElement#getTranslations <em>Translations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Translations</em>'.
   * @see org.eclipse.scout.saml.saml.TranslationElement#getTranslations()
   * @see #getTranslationElement()
   * @generated
   */
  EReference getTranslationElement_Translations();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.LanguageAttribute <em>Language Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Language Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.LanguageAttribute
   * @generated
   */
  EClass getLanguageAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LanguageAttribute#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang</em>'.
   * @see org.eclipse.scout.saml.saml.LanguageAttribute#getLang()
   * @see #getLanguageAttribute()
   * @generated
   */
  EAttribute getLanguageAttribute_Lang();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LanguageAttribute#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.LanguageAttribute#getText()
   * @see #getLanguageAttribute()
   * @generated
   */
  EAttribute getLanguageAttribute_Text();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.LogicElement <em>Logic Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logic Element</em>'.
   * @see org.eclipse.scout.saml.saml.LogicElement
   * @generated
   */
  EClass getLogicElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LogicElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.LogicElement#getName()
   * @see #getLogicElement()
   * @generated
   */
  EAttribute getLogicElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LogicElement#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event</em>'.
   * @see org.eclipse.scout.saml.saml.LogicElement#getEvent()
   * @see #getLogicElement()
   * @generated
   */
  EAttribute getLogicElement_Event();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LogicElement#getRunat <em>Runat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Runat</em>'.
   * @see org.eclipse.scout.saml.saml.LogicElement#getRunat()
   * @see #getLogicElement()
   * @generated
   */
  EAttribute getLogicElement_Runat();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.LogicElement#getExec <em>Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Exec</em>'.
   * @see org.eclipse.scout.saml.saml.LogicElement#getExec()
   * @see #getLogicElement()
   * @generated
   */
  EReference getLogicElement_Exec();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.LogicElement#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.eclipse.scout.saml.saml.LogicElement#getSource()
   * @see #getLogicElement()
   * @generated
   */
  EReference getLogicElement_Source();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.CodeElement <em>Code Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Element</em>'.
   * @see org.eclipse.scout.saml.saml.CodeElement
   * @generated
   */
  EClass getCodeElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.CodeElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.CodeElement#getName()
   * @see #getCodeElement()
   * @generated
   */
  EAttribute getCodeElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.CodeElement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.eclipse.scout.saml.saml.CodeElement#getId()
   * @see #getCodeElement()
   * @generated
   */
  EAttribute getCodeElement_Id();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.LookupElement <em>Lookup Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lookup Element</em>'.
   * @see org.eclipse.scout.saml.saml.LookupElement
   * @generated
   */
  EClass getLookupElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LookupElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.LookupElement#getName()
   * @see #getLookupElement()
   * @generated
   */
  EAttribute getLookupElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.LookupElement#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logic</em>'.
   * @see org.eclipse.scout.saml.saml.LookupElement#getLogic()
   * @see #getLookupElement()
   * @generated
   */
  EReference getLookupElement_Logic();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.TemplateElement <em>Template Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Element</em>'.
   * @see org.eclipse.scout.saml.saml.TemplateElement
   * @generated
   */
  EClass getTemplateElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.TemplateElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.TemplateElement#getName()
   * @see #getTemplateElement()
   * @generated
   */
  EAttribute getTemplateElement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.TemplateElement#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see org.eclipse.scout.saml.saml.TemplateElement#getDefinition()
   * @see #getTemplateElement()
   * @generated
   */
  EReference getTemplateElement_Definition();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.FormElement <em>Form Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form Element</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement
   * @generated
   */
  EClass getFormElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.FormElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getName()
   * @see #getFormElement()
   * @generated
   */
  EAttribute getFormElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.FormElement#getModal <em>Modal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modal</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getModal()
   * @see #getFormElement()
   * @generated
   */
  EAttribute getFormElement_Modal();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.FormElement#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Columns</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getColumns()
   * @see #getFormElement()
   * @generated
   */
  EAttribute getFormElement_Columns();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.FormElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getText()
   * @see #getFormElement()
   * @generated
   */
  EReference getFormElement_Text();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.FormElement#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logic</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getLogic()
   * @see #getFormElement()
   * @generated
   */
  EReference getFormElement_Logic();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.FormElement#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getFields()
   * @see #getFormElement()
   * @generated
   */
  EReference getFormElement_Fields();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.FormFieldElement <em>Form Field Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form Field Element</em>'.
   * @see org.eclipse.scout.saml.saml.FormFieldElement
   * @generated
   */
  EClass getFormFieldElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.FormFieldElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.FormFieldElement#getName()
   * @see #getFormFieldElement()
   * @generated
   */
  EAttribute getFormFieldElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.FormFieldElement#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logic</em>'.
   * @see org.eclipse.scout.saml.saml.FormFieldElement#getLogic()
   * @see #getFormFieldElement()
   * @generated
   */
  EReference getFormFieldElement_Logic();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.FormFieldProperties <em>Form Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form Field Properties</em>'.
   * @see org.eclipse.scout.saml.saml.FormFieldProperties
   * @generated
   */
  EClass getFormFieldProperties();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.FormFieldProperties#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.FormFieldProperties#getText()
   * @see #getFormFieldProperties()
   * @generated
   */
  EReference getFormFieldProperties_Text();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.FormFieldProperties#getEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see org.eclipse.scout.saml.saml.FormFieldProperties#getEnabled()
   * @see #getFormFieldProperties()
   * @generated
   */
  EAttribute getFormFieldProperties_Enabled();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.FormFieldProperties#getVisible <em>Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visible</em>'.
   * @see org.eclipse.scout.saml.saml.FormFieldProperties#getVisible()
   * @see #getFormFieldProperties()
   * @generated
   */
  EAttribute getFormFieldProperties_Visible();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.FormFieldProperties#getMaster <em>Master</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Master</em>'.
   * @see org.eclipse.scout.saml.saml.FormFieldProperties#getMaster()
   * @see #getFormFieldProperties()
   * @generated
   */
  EReference getFormFieldProperties_Master();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.CompositeFieldElement <em>Composite Field Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Field Element</em>'.
   * @see org.eclipse.scout.saml.saml.CompositeFieldElement
   * @generated
   */
  EClass getCompositeFieldElement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.CompositeFieldElement#getFormFieldProperties <em>Form Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Form Field Properties</em>'.
   * @see org.eclipse.scout.saml.saml.CompositeFieldElement#getFormFieldProperties()
   * @see #getCompositeFieldElement()
   * @generated
   */
  EReference getCompositeFieldElement_FormFieldProperties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.CompositeFieldElement#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.eclipse.scout.saml.saml.CompositeFieldElement#getFields()
   * @see #getCompositeFieldElement()
   * @generated
   */
  EReference getCompositeFieldElement_Fields();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.SequenceBoxElement <em>Sequence Box Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Box Element</em>'.
   * @see org.eclipse.scout.saml.saml.SequenceBoxElement
   * @generated
   */
  EClass getSequenceBoxElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.GroupBoxElement <em>Group Box Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Box Element</em>'.
   * @see org.eclipse.scout.saml.saml.GroupBoxElement
   * @generated
   */
  EClass getGroupBoxElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.ValueFieldElement <em>Value Field Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Field Element</em>'.
   * @see org.eclipse.scout.saml.saml.ValueFieldElement
   * @generated
   */
  EClass getValueFieldElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.ValueFieldProperties <em>Value Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Field Properties</em>'.
   * @see org.eclipse.scout.saml.saml.ValueFieldProperties
   * @generated
   */
  EClass getValueFieldProperties();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.ValueFieldProperties#getFormFieldProperties <em>Form Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Form Field Properties</em>'.
   * @see org.eclipse.scout.saml.saml.ValueFieldProperties#getFormFieldProperties()
   * @see #getValueFieldProperties()
   * @generated
   */
  EReference getValueFieldProperties_FormFieldProperties();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ValueFieldProperties#getMandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mandatory</em>'.
   * @see org.eclipse.scout.saml.saml.ValueFieldProperties#getMandatory()
   * @see #getValueFieldProperties()
   * @generated
   */
  EAttribute getValueFieldProperties_Mandatory();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.StringElement <em>String Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Element</em>'.
   * @see org.eclipse.scout.saml.saml.StringElement
   * @generated
   */
  EClass getStringElement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.StringElement#getValueFieldProperties <em>Value Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Field Properties</em>'.
   * @see org.eclipse.scout.saml.saml.StringElement#getValueFieldProperties()
   * @see #getStringElement()
   * @generated
   */
  EReference getStringElement_ValueFieldProperties();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.StringElement#getMaxlen <em>Maxlen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maxlen</em>'.
   * @see org.eclipse.scout.saml.saml.StringElement#getMaxlen()
   * @see #getStringElement()
   * @generated
   */
  EAttribute getStringElement_Maxlen();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.DoubleElement <em>Double Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Element</em>'.
   * @see org.eclipse.scout.saml.saml.DoubleElement
   * @generated
   */
  EClass getDoubleElement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.DoubleElement#getValueFieldProperties <em>Value Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Field Properties</em>'.
   * @see org.eclipse.scout.saml.saml.DoubleElement#getValueFieldProperties()
   * @see #getDoubleElement()
   * @generated
   */
  EReference getDoubleElement_ValueFieldProperties();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.LongElement <em>Long Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long Element</em>'.
   * @see org.eclipse.scout.saml.saml.LongElement
   * @generated
   */
  EClass getLongElement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.LongElement#getValueFieldProperties <em>Value Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Field Properties</em>'.
   * @see org.eclipse.scout.saml.saml.LongElement#getValueFieldProperties()
   * @see #getLongElement()
   * @generated
   */
  EReference getLongElement_ValueFieldProperties();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.DateElement <em>Date Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Element</em>'.
   * @see org.eclipse.scout.saml.saml.DateElement
   * @generated
   */
  EClass getDateElement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.DateElement#getValueFieldProperties <em>Value Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Field Properties</em>'.
   * @see org.eclipse.scout.saml.saml.DateElement#getValueFieldProperties()
   * @see #getDateElement()
   * @generated
   */
  EReference getDateElement_ValueFieldProperties();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.SmartfieldElement <em>Smartfield Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smartfield Element</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElement
   * @generated
   */
  EClass getSmartfieldElement();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.SmartfieldElement#getValueFieldProperties <em>Value Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Field Properties</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElement#getValueFieldProperties()
   * @see #getSmartfieldElement()
   * @generated
   */
  EReference getSmartfieldElement_ValueFieldProperties();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.SmartfieldElement#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Code</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElement#getCode()
   * @see #getSmartfieldElement()
   * @generated
   */
  EReference getSmartfieldElement_Code();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.SmartfieldElement#getValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Type</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElement#getValueType()
   * @see #getSmartfieldElement()
   * @generated
   */
  EReference getSmartfieldElement_ValueType();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.SmartfieldElement#getLookup <em>Lookup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Lookup</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElement#getLookup()
   * @see #getSmartfieldElement()
   * @generated
   */
  EReference getSmartfieldElement_Lookup();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.CustomFieldElement <em>Custom Field Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Field Element</em>'.
   * @see org.eclipse.scout.saml.saml.CustomFieldElement
   * @generated
   */
  EClass getCustomFieldElement();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.CustomFieldElement#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Template</em>'.
   * @see org.eclipse.scout.saml.saml.CustomFieldElement#getTemplate()
   * @see #getCustomFieldElement()
   * @generated
   */
  EReference getCustomFieldElement_Template();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.CustomFieldElement#getFormFieldProperties <em>Form Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Form Field Properties</em>'.
   * @see org.eclipse.scout.saml.saml.CustomFieldElement#getFormFieldProperties()
   * @see #getCustomFieldElement()
   * @generated
   */
  EReference getCustomFieldElement_FormFieldProperties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.CustomFieldElement#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.eclipse.scout.saml.saml.CustomFieldElement#getFields()
   * @see #getCustomFieldElement()
   * @generated
   */
  EReference getCustomFieldElement_Fields();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.XBlockExpression <em>XBlock Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XBlock Expression</em>'.
   * @see org.eclipse.scout.saml.saml.XBlockExpression
   * @generated
   */
  EClass getXBlockExpression();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.XVariableDeclaration <em>XVariable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XVariable Declaration</em>'.
   * @see org.eclipse.scout.saml.saml.XVariableDeclaration
   * @generated
   */
  EClass getXVariableDeclaration();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.XConstructorCall <em>XConstructor Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XConstructor Call</em>'.
   * @see org.eclipse.scout.saml.saml.XConstructorCall
   * @generated
   */
  EClass getXConstructorCall();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.XConstructorCall#isIsArray <em>Is Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Array</em>'.
   * @see org.eclipse.scout.saml.saml.XConstructorCall#isIsArray()
   * @see #getXConstructorCall()
   * @generated
   */
  EAttribute getXConstructorCall_IsArray();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SamlFactory getSamlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.ModelImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODULE = eINSTANCE.getModel_Module();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Translations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TRANSLATIONS = eINSTANCE.getModel_Translations();

    /**
     * The meta object literal for the '<em><b>Codes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CODES = eINSTANCE.getModel_Codes();

    /**
     * The meta object literal for the '<em><b>Lookups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__LOOKUPS = eINSTANCE.getModel_Lookups();

    /**
     * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TEMPLATES = eINSTANCE.getModel_Templates();

    /**
     * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FORMS = eINSTANCE.getModel_Forms();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.ModuleElementImpl <em>Module Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.ModuleElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getModuleElement()
     * @generated
     */
    EClass MODULE_ELEMENT = eINSTANCE.getModuleElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_ELEMENT__NAME = eINSTANCE.getModuleElement_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.ImportElementImpl <em>Import Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.ImportElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getImportElement()
     * @generated
     */
    EClass IMPORT_ELEMENT = eINSTANCE.getImportElement();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_ELEMENT__IMPORTED_NAMESPACE = eINSTANCE.getImportElement_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.TranslationElementImpl <em>Translation Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.TranslationElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTranslationElement()
     * @generated
     */
    EClass TRANSLATION_ELEMENT = eINSTANCE.getTranslationElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSLATION_ELEMENT__NAME = eINSTANCE.getTranslationElement_Name();

    /**
     * The meta object literal for the '<em><b>Translations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSLATION_ELEMENT__TRANSLATIONS = eINSTANCE.getTranslationElement_Translations();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.LanguageAttributeImpl <em>Language Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.LanguageAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLanguageAttribute()
     * @generated
     */
    EClass LANGUAGE_ATTRIBUTE = eINSTANCE.getLanguageAttribute();

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANGUAGE_ATTRIBUTE__LANG = eINSTANCE.getLanguageAttribute_Lang();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANGUAGE_ATTRIBUTE__TEXT = eINSTANCE.getLanguageAttribute_Text();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.LogicElementImpl <em>Logic Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.LogicElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicElement()
     * @generated
     */
    EClass LOGIC_ELEMENT = eINSTANCE.getLogicElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_ELEMENT__NAME = eINSTANCE.getLogicElement_Name();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_ELEMENT__EVENT = eINSTANCE.getLogicElement_Event();

    /**
     * The meta object literal for the '<em><b>Runat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_ELEMENT__RUNAT = eINSTANCE.getLogicElement_Runat();

    /**
     * The meta object literal for the '<em><b>Exec</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_ELEMENT__EXEC = eINSTANCE.getLogicElement_Exec();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_ELEMENT__SOURCE = eINSTANCE.getLogicElement_Source();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.CodeElementImpl <em>Code Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.CodeElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCodeElement()
     * @generated
     */
    EClass CODE_ELEMENT = eINSTANCE.getCodeElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODE_ELEMENT__NAME = eINSTANCE.getCodeElement_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODE_ELEMENT__ID = eINSTANCE.getCodeElement_Id();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.LookupElementImpl <em>Lookup Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.LookupElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLookupElement()
     * @generated
     */
    EClass LOOKUP_ELEMENT = eINSTANCE.getLookupElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOKUP_ELEMENT__NAME = eINSTANCE.getLookupElement_Name();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOKUP_ELEMENT__LOGIC = eINSTANCE.getLookupElement_Logic();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.TemplateElementImpl <em>Template Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.TemplateElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTemplateElement()
     * @generated
     */
    EClass TEMPLATE_ELEMENT = eINSTANCE.getTemplateElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE_ELEMENT__NAME = eINSTANCE.getTemplateElement_Name();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_ELEMENT__DEFINITION = eINSTANCE.getTemplateElement_Definition();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.FormElementImpl <em>Form Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.FormElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getFormElement()
     * @generated
     */
    EClass FORM_ELEMENT = eINSTANCE.getFormElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_ELEMENT__NAME = eINSTANCE.getFormElement_Name();

    /**
     * The meta object literal for the '<em><b>Modal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_ELEMENT__MODAL = eINSTANCE.getFormElement_Modal();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_ELEMENT__COLUMNS = eINSTANCE.getFormElement_Columns();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_ELEMENT__TEXT = eINSTANCE.getFormElement_Text();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_ELEMENT__LOGIC = eINSTANCE.getFormElement_Logic();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_ELEMENT__FIELDS = eINSTANCE.getFormElement_Fields();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.FormFieldElementImpl <em>Form Field Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.FormFieldElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getFormFieldElement()
     * @generated
     */
    EClass FORM_FIELD_ELEMENT = eINSTANCE.getFormFieldElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_FIELD_ELEMENT__NAME = eINSTANCE.getFormFieldElement_Name();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_FIELD_ELEMENT__LOGIC = eINSTANCE.getFormFieldElement_Logic();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.FormFieldPropertiesImpl <em>Form Field Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.FormFieldPropertiesImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getFormFieldProperties()
     * @generated
     */
    EClass FORM_FIELD_PROPERTIES = eINSTANCE.getFormFieldProperties();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_FIELD_PROPERTIES__TEXT = eINSTANCE.getFormFieldProperties_Text();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_FIELD_PROPERTIES__ENABLED = eINSTANCE.getFormFieldProperties_Enabled();

    /**
     * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_FIELD_PROPERTIES__VISIBLE = eINSTANCE.getFormFieldProperties_Visible();

    /**
     * The meta object literal for the '<em><b>Master</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_FIELD_PROPERTIES__MASTER = eINSTANCE.getFormFieldProperties_Master();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.CompositeFieldElementImpl <em>Composite Field Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.CompositeFieldElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCompositeFieldElement()
     * @generated
     */
    EClass COMPOSITE_FIELD_ELEMENT = eINSTANCE.getCompositeFieldElement();

    /**
     * The meta object literal for the '<em><b>Form Field Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_FIELD_ELEMENT__FORM_FIELD_PROPERTIES = eINSTANCE.getCompositeFieldElement_FormFieldProperties();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_FIELD_ELEMENT__FIELDS = eINSTANCE.getCompositeFieldElement_Fields();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.SequenceBoxElementImpl <em>Sequence Box Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.SequenceBoxElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSequenceBoxElement()
     * @generated
     */
    EClass SEQUENCE_BOX_ELEMENT = eINSTANCE.getSequenceBoxElement();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.GroupBoxElementImpl <em>Group Box Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.GroupBoxElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getGroupBoxElement()
     * @generated
     */
    EClass GROUP_BOX_ELEMENT = eINSTANCE.getGroupBoxElement();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.ValueFieldElementImpl <em>Value Field Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.ValueFieldElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getValueFieldElement()
     * @generated
     */
    EClass VALUE_FIELD_ELEMENT = eINSTANCE.getValueFieldElement();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.ValueFieldPropertiesImpl <em>Value Field Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.ValueFieldPropertiesImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getValueFieldProperties()
     * @generated
     */
    EClass VALUE_FIELD_PROPERTIES = eINSTANCE.getValueFieldProperties();

    /**
     * The meta object literal for the '<em><b>Form Field Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_FIELD_PROPERTIES__FORM_FIELD_PROPERTIES = eINSTANCE.getValueFieldProperties_FormFieldProperties();

    /**
     * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_FIELD_PROPERTIES__MANDATORY = eINSTANCE.getValueFieldProperties_Mandatory();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.StringElementImpl <em>String Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.StringElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getStringElement()
     * @generated
     */
    EClass STRING_ELEMENT = eINSTANCE.getStringElement();

    /**
     * The meta object literal for the '<em><b>Value Field Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_ELEMENT__VALUE_FIELD_PROPERTIES = eINSTANCE.getStringElement_ValueFieldProperties();

    /**
     * The meta object literal for the '<em><b>Maxlen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ELEMENT__MAXLEN = eINSTANCE.getStringElement_Maxlen();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.DoubleElementImpl <em>Double Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.DoubleElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getDoubleElement()
     * @generated
     */
    EClass DOUBLE_ELEMENT = eINSTANCE.getDoubleElement();

    /**
     * The meta object literal for the '<em><b>Value Field Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOUBLE_ELEMENT__VALUE_FIELD_PROPERTIES = eINSTANCE.getDoubleElement_ValueFieldProperties();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.LongElementImpl <em>Long Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.LongElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLongElement()
     * @generated
     */
    EClass LONG_ELEMENT = eINSTANCE.getLongElement();

    /**
     * The meta object literal for the '<em><b>Value Field Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LONG_ELEMENT__VALUE_FIELD_PROPERTIES = eINSTANCE.getLongElement_ValueFieldProperties();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.DateElementImpl <em>Date Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.DateElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getDateElement()
     * @generated
     */
    EClass DATE_ELEMENT = eINSTANCE.getDateElement();

    /**
     * The meta object literal for the '<em><b>Value Field Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATE_ELEMENT__VALUE_FIELD_PROPERTIES = eINSTANCE.getDateElement_ValueFieldProperties();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementImpl <em>Smartfield Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.SmartfieldElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSmartfieldElement()
     * @generated
     */
    EClass SMARTFIELD_ELEMENT = eINSTANCE.getSmartfieldElement();

    /**
     * The meta object literal for the '<em><b>Value Field Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMARTFIELD_ELEMENT__VALUE_FIELD_PROPERTIES = eINSTANCE.getSmartfieldElement_ValueFieldProperties();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMARTFIELD_ELEMENT__CODE = eINSTANCE.getSmartfieldElement_Code();

    /**
     * The meta object literal for the '<em><b>Value Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMARTFIELD_ELEMENT__VALUE_TYPE = eINSTANCE.getSmartfieldElement_ValueType();

    /**
     * The meta object literal for the '<em><b>Lookup</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMARTFIELD_ELEMENT__LOOKUP = eINSTANCE.getSmartfieldElement_Lookup();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl <em>Custom Field Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCustomFieldElement()
     * @generated
     */
    EClass CUSTOM_FIELD_ELEMENT = eINSTANCE.getCustomFieldElement();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_FIELD_ELEMENT__TEMPLATE = eINSTANCE.getCustomFieldElement_Template();

    /**
     * The meta object literal for the '<em><b>Form Field Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_FIELD_ELEMENT__FORM_FIELD_PROPERTIES = eINSTANCE.getCustomFieldElement_FormFieldProperties();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_FIELD_ELEMENT__FIELDS = eINSTANCE.getCustomFieldElement_Fields();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.XBlockExpressionImpl <em>XBlock Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.XBlockExpressionImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getXBlockExpression()
     * @generated
     */
    EClass XBLOCK_EXPRESSION = eINSTANCE.getXBlockExpression();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.XVariableDeclarationImpl <em>XVariable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.XVariableDeclarationImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getXVariableDeclaration()
     * @generated
     */
    EClass XVARIABLE_DECLARATION = eINSTANCE.getXVariableDeclaration();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.XConstructorCallImpl <em>XConstructor Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.XConstructorCallImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getXConstructorCall()
     * @generated
     */
    EClass XCONSTRUCTOR_CALL = eINSTANCE.getXConstructorCall();

    /**
     * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XCONSTRUCTOR_CALL__IS_ARRAY = eINSTANCE.getXConstructorCall_IsArray();

  }

} //SamlPackage
