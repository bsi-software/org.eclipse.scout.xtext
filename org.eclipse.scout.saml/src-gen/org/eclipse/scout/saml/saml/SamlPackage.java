/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
   * The feature id for the '<em><b>Logics</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__LOGICS = 7;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 8;

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
   * The feature id for the '<em><b>Placement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__PLACEMENT = 2;

  /**
   * The feature id for the '<em><b>Exec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__EXEC = 3;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
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
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ELEMENT__TEXT = 2;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ELEMENT__LOGIC = 3;

  /**
   * The number of structural features of the '<em>Code Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ELEMENT_FEATURE_COUNT = 4;

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
   * The feature id for the '<em><b>Definition</b></em>' attribute.
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
   * The feature id for the '<em><b>Title</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__TITLE = 3;

  /**
   * The feature id for the '<em><b>Subtitle</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__SUBTITLE = 4;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__WIDTH_IN_PIXELS = 5;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__SUPER_TYPE = 6;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__LOGIC = 7;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__FIELDS = 8;

  /**
   * The feature id for the '<em><b>Key Strokes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__KEY_STROKES = 9;

  /**
   * The number of structural features of the '<em>Form Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT_FEATURE_COUNT = 10;

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
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FIELD_ELEMENT__ENABLED = 1;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FIELD_ELEMENT__VISIBLE = 2;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FIELD_ELEMENT__SUPER_TYPE = 3;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FIELD_ELEMENT__LOGIC = 4;

  /**
   * The number of structural features of the '<em>Form Field Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FIELD_ELEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.CompositeFieldElementImpl <em>Composite Field Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.CompositeFieldElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCompositeFieldElement()
   * @generated
   */
  int COMPOSITE_FIELD_ELEMENT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD_ELEMENT__NAME = FORM_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD_ELEMENT__ENABLED = FORM_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD_ELEMENT__VISIBLE = FORM_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD_ELEMENT__SUPER_TYPE = FORM_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD_ELEMENT__LOGIC = FORM_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_FIELD_ELEMENT__TEXT = FORM_FIELD_ELEMENT_FEATURE_COUNT + 0;

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
  int SEQUENCE_BOX_ELEMENT = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__NAME = COMPOSITE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__ENABLED = COMPOSITE_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__VISIBLE = COMPOSITE_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__SUPER_TYPE = COMPOSITE_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__LOGIC = COMPOSITE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__TEXT = COMPOSITE_FIELD_ELEMENT__TEXT;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__FIELDS = COMPOSITE_FIELD_ELEMENT__FIELDS;

  /**
   * The feature id for the '<em><b>Label Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__LABEL_VISIBLE = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__GRID_WIDTH = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__WIDTH_IN_PIXELS = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sequence Box Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT_FEATURE_COUNT = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.GroupBoxElementImpl <em>Group Box Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.GroupBoxElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getGroupBoxElement()
   * @generated
   */
  int GROUP_BOX_ELEMENT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__NAME = COMPOSITE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__ENABLED = COMPOSITE_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__VISIBLE = COMPOSITE_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__SUPER_TYPE = COMPOSITE_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__LOGIC = COMPOSITE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__TEXT = COMPOSITE_FIELD_ELEMENT__TEXT;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__FIELDS = COMPOSITE_FIELD_ELEMENT__FIELDS;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__COLUMNS = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__LABEL_VISIBLE = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Border Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__BORDER_VISIBLE = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Border Decoration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__BORDER_DECORATION = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Grid Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__GRID_HEIGHT = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__GRID_WIDTH = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT__WIDTH_IN_PIXELS = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Group Box Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BOX_ELEMENT_FEATURE_COUNT = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.ValueFieldElementImpl <em>Value Field Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.ValueFieldElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getValueFieldElement()
   * @generated
   */
  int VALUE_FIELD_ELEMENT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT__NAME = FORM_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT__ENABLED = FORM_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT__VISIBLE = FORM_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT__SUPER_TYPE = FORM_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT__LOGIC = FORM_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT__TEXT = FORM_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT__LABEL_VISIBLE = FORM_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT__MASTER = FORM_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT__MANDATORY = FORM_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT__GRID_WIDTH = FORM_FIELD_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS = FORM_FIELD_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Value Field Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FIELD_ELEMENT_FEATURE_COUNT = FORM_FIELD_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.StringElementImpl <em>String Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.StringElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getStringElement()
   * @generated
   */
  int STRING_ELEMENT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__NAME = VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__ENABLED = VALUE_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__VISIBLE = VALUE_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__SUPER_TYPE = VALUE_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__LOGIC = VALUE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__TEXT = VALUE_FIELD_ELEMENT__TEXT;

  /**
   * The feature id for the '<em><b>Label Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__LABEL_VISIBLE = VALUE_FIELD_ELEMENT__LABEL_VISIBLE;

  /**
   * The feature id for the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__MASTER = VALUE_FIELD_ELEMENT__MASTER;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__MANDATORY = VALUE_FIELD_ELEMENT__MANDATORY;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__GRID_WIDTH = VALUE_FIELD_ELEMENT__GRID_WIDTH;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__WIDTH_IN_PIXELS = VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS;

  /**
   * The feature id for the '<em><b>Maxlen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__MAXLEN = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Grid Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__GRID_HEIGHT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Horizontal Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__HORIZONTAL_ALIGN = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>String Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT_FEATURE_COUNT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.BigDecimalElementImpl <em>Big Decimal Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.BigDecimalElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getBigDecimalElement()
   * @generated
   */
  int BIG_DECIMAL_ELEMENT = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__NAME = VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__ENABLED = VALUE_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__VISIBLE = VALUE_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__SUPER_TYPE = VALUE_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__LOGIC = VALUE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__TEXT = VALUE_FIELD_ELEMENT__TEXT;

  /**
   * The feature id for the '<em><b>Label Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__LABEL_VISIBLE = VALUE_FIELD_ELEMENT__LABEL_VISIBLE;

  /**
   * The feature id for the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__MASTER = VALUE_FIELD_ELEMENT__MASTER;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__MANDATORY = VALUE_FIELD_ELEMENT__MANDATORY;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__GRID_WIDTH = VALUE_FIELD_ELEMENT__GRID_WIDTH;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__WIDTH_IN_PIXELS = VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS;

  /**
   * The feature id for the '<em><b>Percent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__PERCENT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Grouping</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__GROUPING = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Horizontal Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__HORIZONTAL_ALIGN = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fraction Digits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__FRACTION_DIGITS = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__MIN = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT__MAX = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Big Decimal Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIG_DECIMAL_ELEMENT_FEATURE_COUNT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LongElementImpl <em>Long Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LongElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLongElement()
   * @generated
   */
  int LONG_ELEMENT = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__NAME = VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__ENABLED = VALUE_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__VISIBLE = VALUE_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__SUPER_TYPE = VALUE_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__LOGIC = VALUE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__TEXT = VALUE_FIELD_ELEMENT__TEXT;

  /**
   * The feature id for the '<em><b>Label Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__LABEL_VISIBLE = VALUE_FIELD_ELEMENT__LABEL_VISIBLE;

  /**
   * The feature id for the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__MASTER = VALUE_FIELD_ELEMENT__MASTER;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__MANDATORY = VALUE_FIELD_ELEMENT__MANDATORY;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__GRID_WIDTH = VALUE_FIELD_ELEMENT__GRID_WIDTH;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__WIDTH_IN_PIXELS = VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS;

  /**
   * The feature id for the '<em><b>Horizontal Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__HORIZONTAL_ALIGN = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__MIN = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__MAX = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Long Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT_FEATURE_COUNT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.DateElementImpl <em>Date Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.DateElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getDateElement()
   * @generated
   */
  int DATE_ELEMENT = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__NAME = VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__ENABLED = VALUE_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__VISIBLE = VALUE_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__SUPER_TYPE = VALUE_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__LOGIC = VALUE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__TEXT = VALUE_FIELD_ELEMENT__TEXT;

  /**
   * The feature id for the '<em><b>Label Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__LABEL_VISIBLE = VALUE_FIELD_ELEMENT__LABEL_VISIBLE;

  /**
   * The feature id for the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__MASTER = VALUE_FIELD_ELEMENT__MASTER;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__MANDATORY = VALUE_FIELD_ELEMENT__MANDATORY;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__GRID_WIDTH = VALUE_FIELD_ELEMENT__GRID_WIDTH;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__WIDTH_IN_PIXELS = VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS;

  /**
   * The number of structural features of the '<em>Date Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT_FEATURE_COUNT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementImpl <em>Smartfield Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.SmartfieldElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSmartfieldElement()
   * @generated
   */
  int SMARTFIELD_ELEMENT = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__NAME = VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__ENABLED = VALUE_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__VISIBLE = VALUE_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__SUPER_TYPE = VALUE_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__LOGIC = VALUE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__TEXT = VALUE_FIELD_ELEMENT__TEXT;

  /**
   * The feature id for the '<em><b>Label Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__LABEL_VISIBLE = VALUE_FIELD_ELEMENT__LABEL_VISIBLE;

  /**
   * The feature id for the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__MASTER = VALUE_FIELD_ELEMENT__MASTER;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__MANDATORY = VALUE_FIELD_ELEMENT__MANDATORY;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__GRID_WIDTH = VALUE_FIELD_ELEMENT__GRID_WIDTH;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__WIDTH_IN_PIXELS = VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS;

  /**
   * The feature id for the '<em><b>Code</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__CODE = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__VALUE_TYPE = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lookup</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__LOOKUP = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Menus</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__MENUS = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Smartfield Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT_FEATURE_COUNT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.ListBoxElementImpl <em>List Box Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.ListBoxElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getListBoxElement()
   * @generated
   */
  int LIST_BOX_ELEMENT = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__NAME = VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__ENABLED = VALUE_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__VISIBLE = VALUE_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__SUPER_TYPE = VALUE_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__LOGIC = VALUE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__TEXT = VALUE_FIELD_ELEMENT__TEXT;

  /**
   * The feature id for the '<em><b>Label Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__LABEL_VISIBLE = VALUE_FIELD_ELEMENT__LABEL_VISIBLE;

  /**
   * The feature id for the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__MASTER = VALUE_FIELD_ELEMENT__MASTER;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__MANDATORY = VALUE_FIELD_ELEMENT__MANDATORY;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__GRID_WIDTH = VALUE_FIELD_ELEMENT__GRID_WIDTH;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__WIDTH_IN_PIXELS = VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS;

  /**
   * The feature id for the '<em><b>Code</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__CODE = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__VALUE_TYPE = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lookup</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__LOOKUP = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Grid Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT__GRID_HEIGHT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>List Box Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_BOX_ELEMENT_FEATURE_COUNT = VALUE_FIELD_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl <em>Custom Field Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCustomFieldElement()
   * @generated
   */
  int CUSTOM_FIELD_ELEMENT = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__NAME = FORM_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__ENABLED = FORM_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__VISIBLE = FORM_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__SUPER_TYPE = FORM_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__LOGIC = FORM_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__TEXT = FORM_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__LABEL_VISIBLE = FORM_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__GRID_WIDTH = FORM_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__WIDTH_IN_PIXELS = FORM_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT__FIELDS = FORM_FIELD_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Custom Field Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FIELD_ELEMENT_FEATURE_COUNT = FORM_FIELD_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.ButtonElementImpl <em>Button Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.ButtonElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getButtonElement()
   * @generated
   */
  int BUTTON_ELEMENT = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT__NAME = FORM_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT__ENABLED = FORM_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT__VISIBLE = FORM_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT__SUPER_TYPE = FORM_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT__LOGIC = FORM_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT__TEXT = FORM_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Process Button</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT__PROCESS_BUTTON = FORM_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT__GRID_WIDTH = FORM_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT__WIDTH_IN_PIXELS = FORM_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Menus</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT__MENUS = FORM_FIELD_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Button Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT_FEATURE_COUNT = FORM_FIELD_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.MenuElementImpl <em>Menu Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.MenuElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getMenuElement()
   * @generated
   */
  int MENU_ELEMENT = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ELEMENT__ENABLED = 1;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ELEMENT__VISIBLE = 2;

  /**
   * The feature id for the '<em><b>Single Select</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ELEMENT__SINGLE_SELECT = 3;

  /**
   * The feature id for the '<em><b>Multi Select</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ELEMENT__MULTI_SELECT = 4;

  /**
   * The feature id for the '<em><b>Empty Select</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ELEMENT__EMPTY_SELECT = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ELEMENT__TYPE = 6;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ELEMENT__TEXT = 7;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ELEMENT__SUPER_TYPE = 8;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ELEMENT__LOGIC = 9;

  /**
   * The feature id for the '<em><b>Menus</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ELEMENT__MENUS = 10;

  /**
   * The number of structural features of the '<em>Menu Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MENU_ELEMENT_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.TableElementImpl <em>Table Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.TableElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTableElement()
   * @generated
   */
  int TABLE_ELEMENT = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__NAME = FORM_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__ENABLED = FORM_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__VISIBLE = FORM_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__SUPER_TYPE = FORM_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__LOGIC = FORM_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__TEXT = FORM_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__LABEL_VISIBLE = FORM_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Grid Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__GRID_HEIGHT = FORM_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__GRID_WIDTH = FORM_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__WIDTH_IN_PIXELS = FORM_FIELD_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Menus</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__MENUS = FORM_FIELD_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__COLUMNS = FORM_FIELD_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Table Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT_FEATURE_COUNT = FORM_FIELD_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.ColumnElementImpl <em>Column Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.ColumnElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getColumnElement()
   * @generated
   */
  int COLUMN_ELEMENT = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ELEMENT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ELEMENT__TEXT = 2;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ELEMENT__WIDTH = 3;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ELEMENT__VISIBLE = 4;

  /**
   * The feature id for the '<em><b>Displayable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ELEMENT__DISPLAYABLE = 5;

  /**
   * The number of structural features of the '<em>Column Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_ELEMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.KeyElementImpl <em>Key Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.KeyElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getKeyElement()
   * @generated
   */
  int KEY_ELEMENT = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Stroke</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_ELEMENT__STROKE = 1;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_ELEMENT__LOGIC = 2;

  /**
   * The number of structural features of the '<em>Key Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.TabElementImpl <em>Tab Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.TabElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTabElement()
   * @generated
   */
  int TAB_ELEMENT = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ELEMENT__NAME = COMPOSITE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ELEMENT__ENABLED = COMPOSITE_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ELEMENT__VISIBLE = COMPOSITE_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ELEMENT__SUPER_TYPE = COMPOSITE_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ELEMENT__LOGIC = COMPOSITE_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ELEMENT__TEXT = COMPOSITE_FIELD_ELEMENT__TEXT;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ELEMENT__FIELDS = COMPOSITE_FIELD_ELEMENT__FIELDS;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ELEMENT__COLUMNS = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tab Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_ELEMENT_FEATURE_COUNT = COMPOSITE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.TabBoxElementImpl <em>Tab Box Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.TabBoxElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTabBoxElement()
   * @generated
   */
  int TAB_BOX_ELEMENT = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_BOX_ELEMENT__NAME = FORM_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_BOX_ELEMENT__ENABLED = FORM_FIELD_ELEMENT__ENABLED;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_BOX_ELEMENT__VISIBLE = FORM_FIELD_ELEMENT__VISIBLE;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_BOX_ELEMENT__SUPER_TYPE = FORM_FIELD_ELEMENT__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_BOX_ELEMENT__LOGIC = FORM_FIELD_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_BOX_ELEMENT__GRID_WIDTH = FORM_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_BOX_ELEMENT__WIDTH_IN_PIXELS = FORM_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_BOX_ELEMENT__TABS = FORM_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Tab Box Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_BOX_ELEMENT_FEATURE_COUNT = FORM_FIELD_ELEMENT_FEATURE_COUNT + 3;


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
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.Model#getLogics <em>Logics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logics</em>'.
   * @see org.eclipse.scout.saml.saml.Model#getLogics()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Logics();

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
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LogicElement#getPlacement <em>Placement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Placement</em>'.
   * @see org.eclipse.scout.saml.saml.LogicElement#getPlacement()
   * @see #getLogicElement()
   * @generated
   */
  EAttribute getLogicElement_Placement();

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
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LogicElement#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see org.eclipse.scout.saml.saml.LogicElement#getSource()
   * @see #getLogicElement()
   * @generated
   */
  EAttribute getLogicElement_Source();

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
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.CodeElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.CodeElement#getText()
   * @see #getCodeElement()
   * @generated
   */
  EReference getCodeElement_Text();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.CodeElement#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logic</em>'.
   * @see org.eclipse.scout.saml.saml.CodeElement#getLogic()
   * @see #getCodeElement()
   * @generated
   */
  EReference getCodeElement_Logic();

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
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.TemplateElement#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Definition</em>'.
   * @see org.eclipse.scout.saml.saml.TemplateElement#getDefinition()
   * @see #getTemplateElement()
   * @generated
   */
  EAttribute getTemplateElement_Definition();

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
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.FormElement#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Title</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getTitle()
   * @see #getFormElement()
   * @generated
   */
  EReference getFormElement_Title();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.FormElement#getSubtitle <em>Subtitle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Subtitle</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getSubtitle()
   * @see #getFormElement()
   * @generated
   */
  EReference getFormElement_Subtitle();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.FormElement#getWidthInPixels <em>Width In Pixels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width In Pixels</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getWidthInPixels()
   * @see #getFormElement()
   * @generated
   */
  EAttribute getFormElement_WidthInPixels();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.FormElement#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getSuperType()
   * @see #getFormElement()
   * @generated
   */
  EReference getFormElement_SuperType();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.FormElement#getKeyStrokes <em>Key Strokes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Key Strokes</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getKeyStrokes()
   * @see #getFormElement()
   * @generated
   */
  EReference getFormElement_KeyStrokes();

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
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.FormFieldElement#getEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see org.eclipse.scout.saml.saml.FormFieldElement#getEnabled()
   * @see #getFormFieldElement()
   * @generated
   */
  EAttribute getFormFieldElement_Enabled();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.FormFieldElement#getVisible <em>Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visible</em>'.
   * @see org.eclipse.scout.saml.saml.FormFieldElement#getVisible()
   * @see #getFormFieldElement()
   * @generated
   */
  EAttribute getFormFieldElement_Visible();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.FormFieldElement#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.scout.saml.saml.FormFieldElement#getSuperType()
   * @see #getFormFieldElement()
   * @generated
   */
  EReference getFormFieldElement_SuperType();

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
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.CompositeFieldElement <em>Composite Field Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Field Element</em>'.
   * @see org.eclipse.scout.saml.saml.CompositeFieldElement
   * @generated
   */
  EClass getCompositeFieldElement();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.CompositeFieldElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.CompositeFieldElement#getText()
   * @see #getCompositeFieldElement()
   * @generated
   */
  EReference getCompositeFieldElement_Text();

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
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.SequenceBoxElement#getLabelVisible <em>Label Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Visible</em>'.
   * @see org.eclipse.scout.saml.saml.SequenceBoxElement#getLabelVisible()
   * @see #getSequenceBoxElement()
   * @generated
   */
  EAttribute getSequenceBoxElement_LabelVisible();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.SequenceBoxElement#getGridWidth <em>Grid Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grid Width</em>'.
   * @see org.eclipse.scout.saml.saml.SequenceBoxElement#getGridWidth()
   * @see #getSequenceBoxElement()
   * @generated
   */
  EAttribute getSequenceBoxElement_GridWidth();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.SequenceBoxElement#getWidthInPixels <em>Width In Pixels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width In Pixels</em>'.
   * @see org.eclipse.scout.saml.saml.SequenceBoxElement#getWidthInPixels()
   * @see #getSequenceBoxElement()
   * @generated
   */
  EAttribute getSequenceBoxElement_WidthInPixels();

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
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.GroupBoxElement#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Columns</em>'.
   * @see org.eclipse.scout.saml.saml.GroupBoxElement#getColumns()
   * @see #getGroupBoxElement()
   * @generated
   */
  EAttribute getGroupBoxElement_Columns();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.GroupBoxElement#getLabelVisible <em>Label Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Visible</em>'.
   * @see org.eclipse.scout.saml.saml.GroupBoxElement#getLabelVisible()
   * @see #getGroupBoxElement()
   * @generated
   */
  EAttribute getGroupBoxElement_LabelVisible();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.GroupBoxElement#getBorderVisible <em>Border Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Border Visible</em>'.
   * @see org.eclipse.scout.saml.saml.GroupBoxElement#getBorderVisible()
   * @see #getGroupBoxElement()
   * @generated
   */
  EAttribute getGroupBoxElement_BorderVisible();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.GroupBoxElement#getBorderDecoration <em>Border Decoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Border Decoration</em>'.
   * @see org.eclipse.scout.saml.saml.GroupBoxElement#getBorderDecoration()
   * @see #getGroupBoxElement()
   * @generated
   */
  EAttribute getGroupBoxElement_BorderDecoration();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.GroupBoxElement#getGridHeight <em>Grid Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grid Height</em>'.
   * @see org.eclipse.scout.saml.saml.GroupBoxElement#getGridHeight()
   * @see #getGroupBoxElement()
   * @generated
   */
  EAttribute getGroupBoxElement_GridHeight();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.GroupBoxElement#getGridWidth <em>Grid Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grid Width</em>'.
   * @see org.eclipse.scout.saml.saml.GroupBoxElement#getGridWidth()
   * @see #getGroupBoxElement()
   * @generated
   */
  EAttribute getGroupBoxElement_GridWidth();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.GroupBoxElement#getWidthInPixels <em>Width In Pixels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width In Pixels</em>'.
   * @see org.eclipse.scout.saml.saml.GroupBoxElement#getWidthInPixels()
   * @see #getGroupBoxElement()
   * @generated
   */
  EAttribute getGroupBoxElement_WidthInPixels();

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
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.ValueFieldElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.ValueFieldElement#getText()
   * @see #getValueFieldElement()
   * @generated
   */
  EReference getValueFieldElement_Text();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ValueFieldElement#getLabelVisible <em>Label Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Visible</em>'.
   * @see org.eclipse.scout.saml.saml.ValueFieldElement#getLabelVisible()
   * @see #getValueFieldElement()
   * @generated
   */
  EAttribute getValueFieldElement_LabelVisible();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.ValueFieldElement#getMaster <em>Master</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Master</em>'.
   * @see org.eclipse.scout.saml.saml.ValueFieldElement#getMaster()
   * @see #getValueFieldElement()
   * @generated
   */
  EReference getValueFieldElement_Master();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ValueFieldElement#getMandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mandatory</em>'.
   * @see org.eclipse.scout.saml.saml.ValueFieldElement#getMandatory()
   * @see #getValueFieldElement()
   * @generated
   */
  EAttribute getValueFieldElement_Mandatory();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ValueFieldElement#getGridWidth <em>Grid Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grid Width</em>'.
   * @see org.eclipse.scout.saml.saml.ValueFieldElement#getGridWidth()
   * @see #getValueFieldElement()
   * @generated
   */
  EAttribute getValueFieldElement_GridWidth();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ValueFieldElement#getWidthInPixels <em>Width In Pixels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width In Pixels</em>'.
   * @see org.eclipse.scout.saml.saml.ValueFieldElement#getWidthInPixels()
   * @see #getValueFieldElement()
   * @generated
   */
  EAttribute getValueFieldElement_WidthInPixels();

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
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.StringElement#getGridHeight <em>Grid Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grid Height</em>'.
   * @see org.eclipse.scout.saml.saml.StringElement#getGridHeight()
   * @see #getStringElement()
   * @generated
   */
  EAttribute getStringElement_GridHeight();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.StringElement#getHorizontalAlign <em>Horizontal Align</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Horizontal Align</em>'.
   * @see org.eclipse.scout.saml.saml.StringElement#getHorizontalAlign()
   * @see #getStringElement()
   * @generated
   */
  EAttribute getStringElement_HorizontalAlign();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.BigDecimalElement <em>Big Decimal Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Big Decimal Element</em>'.
   * @see org.eclipse.scout.saml.saml.BigDecimalElement
   * @generated
   */
  EClass getBigDecimalElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.BigDecimalElement#getPercent <em>Percent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Percent</em>'.
   * @see org.eclipse.scout.saml.saml.BigDecimalElement#getPercent()
   * @see #getBigDecimalElement()
   * @generated
   */
  EAttribute getBigDecimalElement_Percent();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.BigDecimalElement#getGrouping <em>Grouping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grouping</em>'.
   * @see org.eclipse.scout.saml.saml.BigDecimalElement#getGrouping()
   * @see #getBigDecimalElement()
   * @generated
   */
  EAttribute getBigDecimalElement_Grouping();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.BigDecimalElement#getHorizontalAlign <em>Horizontal Align</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Horizontal Align</em>'.
   * @see org.eclipse.scout.saml.saml.BigDecimalElement#getHorizontalAlign()
   * @see #getBigDecimalElement()
   * @generated
   */
  EAttribute getBigDecimalElement_HorizontalAlign();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.BigDecimalElement#getFractionDigits <em>Fraction Digits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fraction Digits</em>'.
   * @see org.eclipse.scout.saml.saml.BigDecimalElement#getFractionDigits()
   * @see #getBigDecimalElement()
   * @generated
   */
  EAttribute getBigDecimalElement_FractionDigits();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.BigDecimalElement#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see org.eclipse.scout.saml.saml.BigDecimalElement#getMin()
   * @see #getBigDecimalElement()
   * @generated
   */
  EAttribute getBigDecimalElement_Min();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.BigDecimalElement#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see org.eclipse.scout.saml.saml.BigDecimalElement#getMax()
   * @see #getBigDecimalElement()
   * @generated
   */
  EAttribute getBigDecimalElement_Max();

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
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LongElement#getHorizontalAlign <em>Horizontal Align</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Horizontal Align</em>'.
   * @see org.eclipse.scout.saml.saml.LongElement#getHorizontalAlign()
   * @see #getLongElement()
   * @generated
   */
  EAttribute getLongElement_HorizontalAlign();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LongElement#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see org.eclipse.scout.saml.saml.LongElement#getMin()
   * @see #getLongElement()
   * @generated
   */
  EAttribute getLongElement_Min();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LongElement#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see org.eclipse.scout.saml.saml.LongElement#getMax()
   * @see #getLongElement()
   * @generated
   */
  EAttribute getLongElement_Max();

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
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.SmartfieldElement <em>Smartfield Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smartfield Element</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElement
   * @generated
   */
  EClass getSmartfieldElement();

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
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.SmartfieldElement#getValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Type</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElement#getValueType()
   * @see #getSmartfieldElement()
   * @generated
   */
  EAttribute getSmartfieldElement_ValueType();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.SmartfieldElement#getMenus <em>Menus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Menus</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElement#getMenus()
   * @see #getSmartfieldElement()
   * @generated
   */
  EReference getSmartfieldElement_Menus();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.ListBoxElement <em>List Box Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Box Element</em>'.
   * @see org.eclipse.scout.saml.saml.ListBoxElement
   * @generated
   */
  EClass getListBoxElement();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.ListBoxElement#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Code</em>'.
   * @see org.eclipse.scout.saml.saml.ListBoxElement#getCode()
   * @see #getListBoxElement()
   * @generated
   */
  EReference getListBoxElement_Code();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ListBoxElement#getValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Type</em>'.
   * @see org.eclipse.scout.saml.saml.ListBoxElement#getValueType()
   * @see #getListBoxElement()
   * @generated
   */
  EAttribute getListBoxElement_ValueType();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.ListBoxElement#getLookup <em>Lookup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Lookup</em>'.
   * @see org.eclipse.scout.saml.saml.ListBoxElement#getLookup()
   * @see #getListBoxElement()
   * @generated
   */
  EReference getListBoxElement_Lookup();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ListBoxElement#getGridHeight <em>Grid Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grid Height</em>'.
   * @see org.eclipse.scout.saml.saml.ListBoxElement#getGridHeight()
   * @see #getListBoxElement()
   * @generated
   */
  EAttribute getListBoxElement_GridHeight();

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
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.CustomFieldElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.CustomFieldElement#getText()
   * @see #getCustomFieldElement()
   * @generated
   */
  EReference getCustomFieldElement_Text();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.CustomFieldElement#getLabelVisible <em>Label Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Visible</em>'.
   * @see org.eclipse.scout.saml.saml.CustomFieldElement#getLabelVisible()
   * @see #getCustomFieldElement()
   * @generated
   */
  EAttribute getCustomFieldElement_LabelVisible();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.CustomFieldElement#getGridWidth <em>Grid Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grid Width</em>'.
   * @see org.eclipse.scout.saml.saml.CustomFieldElement#getGridWidth()
   * @see #getCustomFieldElement()
   * @generated
   */
  EAttribute getCustomFieldElement_GridWidth();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.CustomFieldElement#getWidthInPixels <em>Width In Pixels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width In Pixels</em>'.
   * @see org.eclipse.scout.saml.saml.CustomFieldElement#getWidthInPixels()
   * @see #getCustomFieldElement()
   * @generated
   */
  EAttribute getCustomFieldElement_WidthInPixels();

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
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.ButtonElement <em>Button Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button Element</em>'.
   * @see org.eclipse.scout.saml.saml.ButtonElement
   * @generated
   */
  EClass getButtonElement();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.ButtonElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.ButtonElement#getText()
   * @see #getButtonElement()
   * @generated
   */
  EReference getButtonElement_Text();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ButtonElement#getProcessButton <em>Process Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process Button</em>'.
   * @see org.eclipse.scout.saml.saml.ButtonElement#getProcessButton()
   * @see #getButtonElement()
   * @generated
   */
  EAttribute getButtonElement_ProcessButton();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ButtonElement#getGridWidth <em>Grid Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grid Width</em>'.
   * @see org.eclipse.scout.saml.saml.ButtonElement#getGridWidth()
   * @see #getButtonElement()
   * @generated
   */
  EAttribute getButtonElement_GridWidth();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ButtonElement#getWidthInPixels <em>Width In Pixels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width In Pixels</em>'.
   * @see org.eclipse.scout.saml.saml.ButtonElement#getWidthInPixels()
   * @see #getButtonElement()
   * @generated
   */
  EAttribute getButtonElement_WidthInPixels();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.ButtonElement#getMenus <em>Menus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Menus</em>'.
   * @see org.eclipse.scout.saml.saml.ButtonElement#getMenus()
   * @see #getButtonElement()
   * @generated
   */
  EReference getButtonElement_Menus();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.MenuElement <em>Menu Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Menu Element</em>'.
   * @see org.eclipse.scout.saml.saml.MenuElement
   * @generated
   */
  EClass getMenuElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.MenuElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.MenuElement#getName()
   * @see #getMenuElement()
   * @generated
   */
  EAttribute getMenuElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.MenuElement#getEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see org.eclipse.scout.saml.saml.MenuElement#getEnabled()
   * @see #getMenuElement()
   * @generated
   */
  EAttribute getMenuElement_Enabled();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.MenuElement#getVisible <em>Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visible</em>'.
   * @see org.eclipse.scout.saml.saml.MenuElement#getVisible()
   * @see #getMenuElement()
   * @generated
   */
  EAttribute getMenuElement_Visible();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.MenuElement#getSingleSelect <em>Single Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Single Select</em>'.
   * @see org.eclipse.scout.saml.saml.MenuElement#getSingleSelect()
   * @see #getMenuElement()
   * @generated
   */
  EAttribute getMenuElement_SingleSelect();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.MenuElement#getMultiSelect <em>Multi Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multi Select</em>'.
   * @see org.eclipse.scout.saml.saml.MenuElement#getMultiSelect()
   * @see #getMenuElement()
   * @generated
   */
  EAttribute getMenuElement_MultiSelect();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.MenuElement#getEmptySelect <em>Empty Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Empty Select</em>'.
   * @see org.eclipse.scout.saml.saml.MenuElement#getEmptySelect()
   * @see #getMenuElement()
   * @generated
   */
  EAttribute getMenuElement_EmptySelect();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.MenuElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.scout.saml.saml.MenuElement#getType()
   * @see #getMenuElement()
   * @generated
   */
  EAttribute getMenuElement_Type();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.MenuElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.MenuElement#getText()
   * @see #getMenuElement()
   * @generated
   */
  EReference getMenuElement_Text();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.MenuElement#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.eclipse.scout.saml.saml.MenuElement#getSuperType()
   * @see #getMenuElement()
   * @generated
   */
  EReference getMenuElement_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.MenuElement#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logic</em>'.
   * @see org.eclipse.scout.saml.saml.MenuElement#getLogic()
   * @see #getMenuElement()
   * @generated
   */
  EReference getMenuElement_Logic();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.MenuElement#getMenus <em>Menus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Menus</em>'.
   * @see org.eclipse.scout.saml.saml.MenuElement#getMenus()
   * @see #getMenuElement()
   * @generated
   */
  EReference getMenuElement_Menus();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.TableElement <em>Table Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Element</em>'.
   * @see org.eclipse.scout.saml.saml.TableElement
   * @generated
   */
  EClass getTableElement();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.TableElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.TableElement#getText()
   * @see #getTableElement()
   * @generated
   */
  EReference getTableElement_Text();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.TableElement#getLabelVisible <em>Label Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label Visible</em>'.
   * @see org.eclipse.scout.saml.saml.TableElement#getLabelVisible()
   * @see #getTableElement()
   * @generated
   */
  EAttribute getTableElement_LabelVisible();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.TableElement#getGridHeight <em>Grid Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grid Height</em>'.
   * @see org.eclipse.scout.saml.saml.TableElement#getGridHeight()
   * @see #getTableElement()
   * @generated
   */
  EAttribute getTableElement_GridHeight();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.TableElement#getGridWidth <em>Grid Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grid Width</em>'.
   * @see org.eclipse.scout.saml.saml.TableElement#getGridWidth()
   * @see #getTableElement()
   * @generated
   */
  EAttribute getTableElement_GridWidth();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.TableElement#getWidthInPixels <em>Width In Pixels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width In Pixels</em>'.
   * @see org.eclipse.scout.saml.saml.TableElement#getWidthInPixels()
   * @see #getTableElement()
   * @generated
   */
  EAttribute getTableElement_WidthInPixels();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.TableElement#getMenus <em>Menus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Menus</em>'.
   * @see org.eclipse.scout.saml.saml.TableElement#getMenus()
   * @see #getTableElement()
   * @generated
   */
  EReference getTableElement_Menus();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.TableElement#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see org.eclipse.scout.saml.saml.TableElement#getColumns()
   * @see #getTableElement()
   * @generated
   */
  EReference getTableElement_Columns();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.ColumnElement <em>Column Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Element</em>'.
   * @see org.eclipse.scout.saml.saml.ColumnElement
   * @generated
   */
  EClass getColumnElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ColumnElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.ColumnElement#getName()
   * @see #getColumnElement()
   * @generated
   */
  EAttribute getColumnElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ColumnElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.scout.saml.saml.ColumnElement#getType()
   * @see #getColumnElement()
   * @generated
   */
  EAttribute getColumnElement_Type();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.ColumnElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.ColumnElement#getText()
   * @see #getColumnElement()
   * @generated
   */
  EReference getColumnElement_Text();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ColumnElement#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.eclipse.scout.saml.saml.ColumnElement#getWidth()
   * @see #getColumnElement()
   * @generated
   */
  EAttribute getColumnElement_Width();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ColumnElement#getVisible <em>Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visible</em>'.
   * @see org.eclipse.scout.saml.saml.ColumnElement#getVisible()
   * @see #getColumnElement()
   * @generated
   */
  EAttribute getColumnElement_Visible();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ColumnElement#getDisplayable <em>Displayable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Displayable</em>'.
   * @see org.eclipse.scout.saml.saml.ColumnElement#getDisplayable()
   * @see #getColumnElement()
   * @generated
   */
  EAttribute getColumnElement_Displayable();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.KeyElement <em>Key Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Element</em>'.
   * @see org.eclipse.scout.saml.saml.KeyElement
   * @generated
   */
  EClass getKeyElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.KeyElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.KeyElement#getName()
   * @see #getKeyElement()
   * @generated
   */
  EAttribute getKeyElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.KeyElement#getStroke <em>Stroke</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stroke</em>'.
   * @see org.eclipse.scout.saml.saml.KeyElement#getStroke()
   * @see #getKeyElement()
   * @generated
   */
  EAttribute getKeyElement_Stroke();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.KeyElement#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logic</em>'.
   * @see org.eclipse.scout.saml.saml.KeyElement#getLogic()
   * @see #getKeyElement()
   * @generated
   */
  EReference getKeyElement_Logic();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.TabElement <em>Tab Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab Element</em>'.
   * @see org.eclipse.scout.saml.saml.TabElement
   * @generated
   */
  EClass getTabElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.TabElement#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Columns</em>'.
   * @see org.eclipse.scout.saml.saml.TabElement#getColumns()
   * @see #getTabElement()
   * @generated
   */
  EAttribute getTabElement_Columns();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.TabBoxElement <em>Tab Box Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab Box Element</em>'.
   * @see org.eclipse.scout.saml.saml.TabBoxElement
   * @generated
   */
  EClass getTabBoxElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.TabBoxElement#getGridWidth <em>Grid Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grid Width</em>'.
   * @see org.eclipse.scout.saml.saml.TabBoxElement#getGridWidth()
   * @see #getTabBoxElement()
   * @generated
   */
  EAttribute getTabBoxElement_GridWidth();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.TabBoxElement#getWidthInPixels <em>Width In Pixels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width In Pixels</em>'.
   * @see org.eclipse.scout.saml.saml.TabBoxElement#getWidthInPixels()
   * @see #getTabBoxElement()
   * @generated
   */
  EAttribute getTabBoxElement_WidthInPixels();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.TabBoxElement#getTabs <em>Tabs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tabs</em>'.
   * @see org.eclipse.scout.saml.saml.TabBoxElement#getTabs()
   * @see #getTabBoxElement()
   * @generated
   */
  EReference getTabBoxElement_Tabs();

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
     * The meta object literal for the '<em><b>Logics</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__LOGICS = eINSTANCE.getModel_Logics();

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
     * The meta object literal for the '<em><b>Placement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_ELEMENT__PLACEMENT = eINSTANCE.getLogicElement_Placement();

    /**
     * The meta object literal for the '<em><b>Exec</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_ELEMENT__EXEC = eINSTANCE.getLogicElement_Exec();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_ELEMENT__SOURCE = eINSTANCE.getLogicElement_Source();

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
     * The meta object literal for the '<em><b>Text</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CODE_ELEMENT__TEXT = eINSTANCE.getCodeElement_Text();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CODE_ELEMENT__LOGIC = eINSTANCE.getCodeElement_Logic();

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
     * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE_ELEMENT__DEFINITION = eINSTANCE.getTemplateElement_Definition();

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
     * The meta object literal for the '<em><b>Title</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_ELEMENT__TITLE = eINSTANCE.getFormElement_Title();

    /**
     * The meta object literal for the '<em><b>Subtitle</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_ELEMENT__SUBTITLE = eINSTANCE.getFormElement_Subtitle();

    /**
     * The meta object literal for the '<em><b>Width In Pixels</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_ELEMENT__WIDTH_IN_PIXELS = eINSTANCE.getFormElement_WidthInPixels();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_ELEMENT__SUPER_TYPE = eINSTANCE.getFormElement_SuperType();

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
     * The meta object literal for the '<em><b>Key Strokes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_ELEMENT__KEY_STROKES = eINSTANCE.getFormElement_KeyStrokes();

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
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_FIELD_ELEMENT__ENABLED = eINSTANCE.getFormFieldElement_Enabled();

    /**
     * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_FIELD_ELEMENT__VISIBLE = eINSTANCE.getFormFieldElement_Visible();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_FIELD_ELEMENT__SUPER_TYPE = eINSTANCE.getFormFieldElement_SuperType();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_FIELD_ELEMENT__LOGIC = eINSTANCE.getFormFieldElement_Logic();

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
     * The meta object literal for the '<em><b>Text</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_FIELD_ELEMENT__TEXT = eINSTANCE.getCompositeFieldElement_Text();

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
     * The meta object literal for the '<em><b>Label Visible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE_BOX_ELEMENT__LABEL_VISIBLE = eINSTANCE.getSequenceBoxElement_LabelVisible();

    /**
     * The meta object literal for the '<em><b>Grid Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE_BOX_ELEMENT__GRID_WIDTH = eINSTANCE.getSequenceBoxElement_GridWidth();

    /**
     * The meta object literal for the '<em><b>Width In Pixels</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE_BOX_ELEMENT__WIDTH_IN_PIXELS = eINSTANCE.getSequenceBoxElement_WidthInPixels();

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
     * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_BOX_ELEMENT__COLUMNS = eINSTANCE.getGroupBoxElement_Columns();

    /**
     * The meta object literal for the '<em><b>Label Visible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_BOX_ELEMENT__LABEL_VISIBLE = eINSTANCE.getGroupBoxElement_LabelVisible();

    /**
     * The meta object literal for the '<em><b>Border Visible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_BOX_ELEMENT__BORDER_VISIBLE = eINSTANCE.getGroupBoxElement_BorderVisible();

    /**
     * The meta object literal for the '<em><b>Border Decoration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_BOX_ELEMENT__BORDER_DECORATION = eINSTANCE.getGroupBoxElement_BorderDecoration();

    /**
     * The meta object literal for the '<em><b>Grid Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_BOX_ELEMENT__GRID_HEIGHT = eINSTANCE.getGroupBoxElement_GridHeight();

    /**
     * The meta object literal for the '<em><b>Grid Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_BOX_ELEMENT__GRID_WIDTH = eINSTANCE.getGroupBoxElement_GridWidth();

    /**
     * The meta object literal for the '<em><b>Width In Pixels</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_BOX_ELEMENT__WIDTH_IN_PIXELS = eINSTANCE.getGroupBoxElement_WidthInPixels();

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
     * The meta object literal for the '<em><b>Text</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_FIELD_ELEMENT__TEXT = eINSTANCE.getValueFieldElement_Text();

    /**
     * The meta object literal for the '<em><b>Label Visible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_FIELD_ELEMENT__LABEL_VISIBLE = eINSTANCE.getValueFieldElement_LabelVisible();

    /**
     * The meta object literal for the '<em><b>Master</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_FIELD_ELEMENT__MASTER = eINSTANCE.getValueFieldElement_Master();

    /**
     * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_FIELD_ELEMENT__MANDATORY = eINSTANCE.getValueFieldElement_Mandatory();

    /**
     * The meta object literal for the '<em><b>Grid Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_FIELD_ELEMENT__GRID_WIDTH = eINSTANCE.getValueFieldElement_GridWidth();

    /**
     * The meta object literal for the '<em><b>Width In Pixels</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS = eINSTANCE.getValueFieldElement_WidthInPixels();

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
     * The meta object literal for the '<em><b>Maxlen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ELEMENT__MAXLEN = eINSTANCE.getStringElement_Maxlen();

    /**
     * The meta object literal for the '<em><b>Grid Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ELEMENT__GRID_HEIGHT = eINSTANCE.getStringElement_GridHeight();

    /**
     * The meta object literal for the '<em><b>Horizontal Align</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ELEMENT__HORIZONTAL_ALIGN = eINSTANCE.getStringElement_HorizontalAlign();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.BigDecimalElementImpl <em>Big Decimal Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.BigDecimalElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getBigDecimalElement()
     * @generated
     */
    EClass BIG_DECIMAL_ELEMENT = eINSTANCE.getBigDecimalElement();

    /**
     * The meta object literal for the '<em><b>Percent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIG_DECIMAL_ELEMENT__PERCENT = eINSTANCE.getBigDecimalElement_Percent();

    /**
     * The meta object literal for the '<em><b>Grouping</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIG_DECIMAL_ELEMENT__GROUPING = eINSTANCE.getBigDecimalElement_Grouping();

    /**
     * The meta object literal for the '<em><b>Horizontal Align</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIG_DECIMAL_ELEMENT__HORIZONTAL_ALIGN = eINSTANCE.getBigDecimalElement_HorizontalAlign();

    /**
     * The meta object literal for the '<em><b>Fraction Digits</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIG_DECIMAL_ELEMENT__FRACTION_DIGITS = eINSTANCE.getBigDecimalElement_FractionDigits();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIG_DECIMAL_ELEMENT__MIN = eINSTANCE.getBigDecimalElement_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIG_DECIMAL_ELEMENT__MAX = eINSTANCE.getBigDecimalElement_Max();

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
     * The meta object literal for the '<em><b>Horizontal Align</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LONG_ELEMENT__HORIZONTAL_ALIGN = eINSTANCE.getLongElement_HorizontalAlign();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LONG_ELEMENT__MIN = eINSTANCE.getLongElement_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LONG_ELEMENT__MAX = eINSTANCE.getLongElement_Max();

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
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementImpl <em>Smartfield Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.SmartfieldElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSmartfieldElement()
     * @generated
     */
    EClass SMARTFIELD_ELEMENT = eINSTANCE.getSmartfieldElement();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMARTFIELD_ELEMENT__CODE = eINSTANCE.getSmartfieldElement_Code();

    /**
     * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMARTFIELD_ELEMENT__VALUE_TYPE = eINSTANCE.getSmartfieldElement_ValueType();

    /**
     * The meta object literal for the '<em><b>Lookup</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMARTFIELD_ELEMENT__LOOKUP = eINSTANCE.getSmartfieldElement_Lookup();

    /**
     * The meta object literal for the '<em><b>Menus</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMARTFIELD_ELEMENT__MENUS = eINSTANCE.getSmartfieldElement_Menus();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.ListBoxElementImpl <em>List Box Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.ListBoxElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getListBoxElement()
     * @generated
     */
    EClass LIST_BOX_ELEMENT = eINSTANCE.getListBoxElement();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_BOX_ELEMENT__CODE = eINSTANCE.getListBoxElement_Code();

    /**
     * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST_BOX_ELEMENT__VALUE_TYPE = eINSTANCE.getListBoxElement_ValueType();

    /**
     * The meta object literal for the '<em><b>Lookup</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_BOX_ELEMENT__LOOKUP = eINSTANCE.getListBoxElement_Lookup();

    /**
     * The meta object literal for the '<em><b>Grid Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST_BOX_ELEMENT__GRID_HEIGHT = eINSTANCE.getListBoxElement_GridHeight();

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
     * The meta object literal for the '<em><b>Text</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_FIELD_ELEMENT__TEXT = eINSTANCE.getCustomFieldElement_Text();

    /**
     * The meta object literal for the '<em><b>Label Visible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_FIELD_ELEMENT__LABEL_VISIBLE = eINSTANCE.getCustomFieldElement_LabelVisible();

    /**
     * The meta object literal for the '<em><b>Grid Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_FIELD_ELEMENT__GRID_WIDTH = eINSTANCE.getCustomFieldElement_GridWidth();

    /**
     * The meta object literal for the '<em><b>Width In Pixels</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_FIELD_ELEMENT__WIDTH_IN_PIXELS = eINSTANCE.getCustomFieldElement_WidthInPixels();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_FIELD_ELEMENT__FIELDS = eINSTANCE.getCustomFieldElement_Fields();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.ButtonElementImpl <em>Button Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.ButtonElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getButtonElement()
     * @generated
     */
    EClass BUTTON_ELEMENT = eINSTANCE.getButtonElement();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON_ELEMENT__TEXT = eINSTANCE.getButtonElement_Text();

    /**
     * The meta object literal for the '<em><b>Process Button</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_ELEMENT__PROCESS_BUTTON = eINSTANCE.getButtonElement_ProcessButton();

    /**
     * The meta object literal for the '<em><b>Grid Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_ELEMENT__GRID_WIDTH = eINSTANCE.getButtonElement_GridWidth();

    /**
     * The meta object literal for the '<em><b>Width In Pixels</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_ELEMENT__WIDTH_IN_PIXELS = eINSTANCE.getButtonElement_WidthInPixels();

    /**
     * The meta object literal for the '<em><b>Menus</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON_ELEMENT__MENUS = eINSTANCE.getButtonElement_Menus();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.MenuElementImpl <em>Menu Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.MenuElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getMenuElement()
     * @generated
     */
    EClass MENU_ELEMENT = eINSTANCE.getMenuElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU_ELEMENT__NAME = eINSTANCE.getMenuElement_Name();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU_ELEMENT__ENABLED = eINSTANCE.getMenuElement_Enabled();

    /**
     * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU_ELEMENT__VISIBLE = eINSTANCE.getMenuElement_Visible();

    /**
     * The meta object literal for the '<em><b>Single Select</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU_ELEMENT__SINGLE_SELECT = eINSTANCE.getMenuElement_SingleSelect();

    /**
     * The meta object literal for the '<em><b>Multi Select</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU_ELEMENT__MULTI_SELECT = eINSTANCE.getMenuElement_MultiSelect();

    /**
     * The meta object literal for the '<em><b>Empty Select</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU_ELEMENT__EMPTY_SELECT = eINSTANCE.getMenuElement_EmptySelect();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MENU_ELEMENT__TYPE = eINSTANCE.getMenuElement_Type();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MENU_ELEMENT__TEXT = eINSTANCE.getMenuElement_Text();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MENU_ELEMENT__SUPER_TYPE = eINSTANCE.getMenuElement_SuperType();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MENU_ELEMENT__LOGIC = eINSTANCE.getMenuElement_Logic();

    /**
     * The meta object literal for the '<em><b>Menus</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MENU_ELEMENT__MENUS = eINSTANCE.getMenuElement_Menus();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.TableElementImpl <em>Table Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.TableElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTableElement()
     * @generated
     */
    EClass TABLE_ELEMENT = eINSTANCE.getTableElement();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_ELEMENT__TEXT = eINSTANCE.getTableElement_Text();

    /**
     * The meta object literal for the '<em><b>Label Visible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_ELEMENT__LABEL_VISIBLE = eINSTANCE.getTableElement_LabelVisible();

    /**
     * The meta object literal for the '<em><b>Grid Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_ELEMENT__GRID_HEIGHT = eINSTANCE.getTableElement_GridHeight();

    /**
     * The meta object literal for the '<em><b>Grid Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_ELEMENT__GRID_WIDTH = eINSTANCE.getTableElement_GridWidth();

    /**
     * The meta object literal for the '<em><b>Width In Pixels</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_ELEMENT__WIDTH_IN_PIXELS = eINSTANCE.getTableElement_WidthInPixels();

    /**
     * The meta object literal for the '<em><b>Menus</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_ELEMENT__MENUS = eINSTANCE.getTableElement_Menus();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_ELEMENT__COLUMNS = eINSTANCE.getTableElement_Columns();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.ColumnElementImpl <em>Column Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.ColumnElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getColumnElement()
     * @generated
     */
    EClass COLUMN_ELEMENT = eINSTANCE.getColumnElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_ELEMENT__NAME = eINSTANCE.getColumnElement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_ELEMENT__TYPE = eINSTANCE.getColumnElement_Type();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_ELEMENT__TEXT = eINSTANCE.getColumnElement_Text();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_ELEMENT__WIDTH = eINSTANCE.getColumnElement_Width();

    /**
     * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_ELEMENT__VISIBLE = eINSTANCE.getColumnElement_Visible();

    /**
     * The meta object literal for the '<em><b>Displayable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_ELEMENT__DISPLAYABLE = eINSTANCE.getColumnElement_Displayable();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.KeyElementImpl <em>Key Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.KeyElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getKeyElement()
     * @generated
     */
    EClass KEY_ELEMENT = eINSTANCE.getKeyElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_ELEMENT__NAME = eINSTANCE.getKeyElement_Name();

    /**
     * The meta object literal for the '<em><b>Stroke</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_ELEMENT__STROKE = eINSTANCE.getKeyElement_Stroke();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY_ELEMENT__LOGIC = eINSTANCE.getKeyElement_Logic();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.TabElementImpl <em>Tab Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.TabElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTabElement()
     * @generated
     */
    EClass TAB_ELEMENT = eINSTANCE.getTabElement();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAB_ELEMENT__COLUMNS = eINSTANCE.getTabElement_Columns();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.TabBoxElementImpl <em>Tab Box Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.TabBoxElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTabBoxElement()
     * @generated
     */
    EClass TAB_BOX_ELEMENT = eINSTANCE.getTabBoxElement();

    /**
     * The meta object literal for the '<em><b>Grid Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAB_BOX_ELEMENT__GRID_WIDTH = eINSTANCE.getTabBoxElement_GridWidth();

    /**
     * The meta object literal for the '<em><b>Width In Pixels</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAB_BOX_ELEMENT__WIDTH_IN_PIXELS = eINSTANCE.getTabBoxElement_WidthInPixels();

    /**
     * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_BOX_ELEMENT__TABS = eINSTANCE.getTabBoxElement_Tabs();

  }

} //SamlPackage
