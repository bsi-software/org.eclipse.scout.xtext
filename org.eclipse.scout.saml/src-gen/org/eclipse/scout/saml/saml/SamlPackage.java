/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The feature id for the '<em><b>Codes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CODES = 2;

  /**
   * The feature id for the '<em><b>Translations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TRANSLATIONS = 3;

  /**
   * The feature id for the '<em><b>Lookups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__LOOKUPS = 4;

  /**
   * The feature id for the '<em><b>Forms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FORMS = 5;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 6;

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
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.JavaCodeElementImpl <em>Java Code Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.JavaCodeElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getJavaCodeElement()
   * @generated
   */
  int JAVA_CODE_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CODE_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Runat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CODE_ELEMENT__RUNAT = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CODE_ELEMENT__SOURCE = 2;

  /**
   * The number of structural features of the '<em>Java Code Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_CODE_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LogicElementImpl <em>Logic Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LogicElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicElement()
   * @generated
   */
  int LOGIC_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__EVENT = 0;

  /**
   * The feature id for the '<em><b>Runat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__RUNAT = 1;

  /**
   * The feature id for the '<em><b>Exec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__EXEC = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__SOURCE = 3;

  /**
   * The number of structural features of the '<em>Logic Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.CodeElementImpl <em>Code Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.CodeElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCodeElement()
   * @generated
   */
  int CODE_ELEMENT = 5;

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
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.TranslationElementImpl <em>Translation Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.TranslationElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTranslationElement()
   * @generated
   */
  int TRANSLATION_ELEMENT = 6;

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
  int LANGUAGE_ATTRIBUTE = 7;

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
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LookupElementImpl <em>Lookup Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LookupElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLookupElement()
   * @generated
   */
  int LOOKUP_ELEMENT = 8;

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
   * The feature id for the '<em><b>Javacode</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_ELEMENT__JAVACODE = 2;

  /**
   * The number of structural features of the '<em>Lookup Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_ELEMENT_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__LOGIC = 3;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__FIELDS = 4;

  /**
   * The number of structural features of the '<em>Form Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.ControlElementImpl <em>Control Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.ControlElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getControlElement()
   * @generated
   */
  int CONTROL_ELEMENT = 10;

  /**
   * The number of structural features of the '<em>Control Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.ControlElementRuleImpl <em>Control Element Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.ControlElementRuleImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getControlElementRule()
   * @generated
   */
  int CONTROL_ELEMENT_RULE = 11;

  /**
   * The feature id for the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ELEMENT_RULE__TEXT = 0;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ELEMENT_RULE__ENABLED = 1;

  /**
   * The feature id for the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ELEMENT_RULE__VISIBLE = 2;

  /**
   * The number of structural features of the '<em>Control Element Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_ELEMENT_RULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.CompositeElementImpl <em>Composite Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.CompositeElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCompositeElement()
   * @generated
   */
  int COMPOSITE_ELEMENT = 12;

  /**
   * The number of structural features of the '<em>Composite Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_ELEMENT_FEATURE_COUNT = CONTROL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.CompositeElementRuleImpl <em>Composite Element Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.CompositeElementRuleImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCompositeElementRule()
   * @generated
   */
  int COMPOSITE_ELEMENT_RULE = 13;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_ELEMENT_RULE__RULE = 0;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_ELEMENT_RULE__LOGIC = 1;

  /**
   * The feature id for the '<em><b>Childre</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_ELEMENT_RULE__CHILDRE = 2;

  /**
   * The number of structural features of the '<em>Composite Element Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_ELEMENT_RULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LeafElementImpl <em>Leaf Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LeafElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLeafElement()
   * @generated
   */
  int LEAF_ELEMENT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_ELEMENT__NAME = CONTROL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Field Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_ELEMENT__FIELD_RULE = CONTROL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_ELEMENT__MANDATORY = CONTROL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_ELEMENT__LOGIC = CONTROL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Leaf Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_ELEMENT_FEATURE_COUNT = CONTROL_ELEMENT_FEATURE_COUNT + 4;

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
  int STRING_ELEMENT__NAME = LEAF_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Field Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__FIELD_RULE = LEAF_ELEMENT__FIELD_RULE;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__MANDATORY = LEAF_ELEMENT__MANDATORY;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__LOGIC = LEAF_ELEMENT__LOGIC;

  /**
   * The feature id for the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__MASTER = LEAF_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT_FEATURE_COUNT = LEAF_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.DoubleElementImpl <em>Double Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.DoubleElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getDoubleElement()
   * @generated
   */
  int DOUBLE_ELEMENT = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ELEMENT__NAME = LEAF_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Field Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ELEMENT__FIELD_RULE = LEAF_ELEMENT__FIELD_RULE;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ELEMENT__MANDATORY = LEAF_ELEMENT__MANDATORY;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ELEMENT__LOGIC = LEAF_ELEMENT__LOGIC;

  /**
   * The number of structural features of the '<em>Double Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ELEMENT_FEATURE_COUNT = LEAF_ELEMENT_FEATURE_COUNT + 0;

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
  int LONG_ELEMENT__NAME = LEAF_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Field Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__FIELD_RULE = LEAF_ELEMENT__FIELD_RULE;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__MANDATORY = LEAF_ELEMENT__MANDATORY;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__LOGIC = LEAF_ELEMENT__LOGIC;

  /**
   * The number of structural features of the '<em>Long Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT_FEATURE_COUNT = LEAF_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.SequenceBoxElementImpl <em>Sequence Box Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.SequenceBoxElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSequenceBoxElement()
   * @generated
   */
  int SEQUENCE_BOX_ELEMENT = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__NAME = COMPOSITE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Field Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__FIELD_RULE = COMPOSITE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sequence Box Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT_FEATURE_COUNT = COMPOSITE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.XBlockExpressionImpl <em>XBlock Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.XBlockExpressionImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getXBlockExpression()
   * @generated
   */
  int XBLOCK_EXPRESSION = 19;

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
  int XVARIABLE_DECLARATION = 20;

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
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.BooleanType <em>Boolean Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.BooleanType
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getBooleanType()
   * @generated
   */
  int BOOLEAN_TYPE = 21;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.LogicType <em>Logic Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.LogicType
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicType()
   * @generated
   */
  int LOGIC_TYPE = 22;


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
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.JavaCodeElement <em>Java Code Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Code Element</em>'.
   * @see org.eclipse.scout.saml.saml.JavaCodeElement
   * @generated
   */
  EClass getJavaCodeElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.JavaCodeElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.JavaCodeElement#getName()
   * @see #getJavaCodeElement()
   * @generated
   */
  EAttribute getJavaCodeElement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.JavaCodeElement#getRunat <em>Runat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Runat</em>'.
   * @see org.eclipse.scout.saml.saml.JavaCodeElement#getRunat()
   * @see #getJavaCodeElement()
   * @generated
   */
  EAttribute getJavaCodeElement_Runat();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.JavaCodeElement#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.eclipse.scout.saml.saml.JavaCodeElement#getSource()
   * @see #getJavaCodeElement()
   * @generated
   */
  EReference getJavaCodeElement_Source();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.LookupElement#getJavacode <em>Javacode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Javacode</em>'.
   * @see org.eclipse.scout.saml.saml.LookupElement#getJavacode()
   * @see #getLookupElement()
   * @generated
   */
  EReference getLookupElement_Javacode();

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
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.ControlElement <em>Control Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Element</em>'.
   * @see org.eclipse.scout.saml.saml.ControlElement
   * @generated
   */
  EClass getControlElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.ControlElementRule <em>Control Element Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Element Rule</em>'.
   * @see org.eclipse.scout.saml.saml.ControlElementRule
   * @generated
   */
  EClass getControlElementRule();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.ControlElementRule#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.ControlElementRule#getText()
   * @see #getControlElementRule()
   * @generated
   */
  EReference getControlElementRule_Text();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ControlElementRule#getEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see org.eclipse.scout.saml.saml.ControlElementRule#getEnabled()
   * @see #getControlElementRule()
   * @generated
   */
  EAttribute getControlElementRule_Enabled();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.ControlElementRule#getVisible <em>Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visible</em>'.
   * @see org.eclipse.scout.saml.saml.ControlElementRule#getVisible()
   * @see #getControlElementRule()
   * @generated
   */
  EAttribute getControlElementRule_Visible();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.CompositeElement <em>Composite Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Element</em>'.
   * @see org.eclipse.scout.saml.saml.CompositeElement
   * @generated
   */
  EClass getCompositeElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.CompositeElementRule <em>Composite Element Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Element Rule</em>'.
   * @see org.eclipse.scout.saml.saml.CompositeElementRule
   * @generated
   */
  EClass getCompositeElementRule();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.CompositeElementRule#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see org.eclipse.scout.saml.saml.CompositeElementRule#getRule()
   * @see #getCompositeElementRule()
   * @generated
   */
  EReference getCompositeElementRule_Rule();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.CompositeElementRule#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logic</em>'.
   * @see org.eclipse.scout.saml.saml.CompositeElementRule#getLogic()
   * @see #getCompositeElementRule()
   * @generated
   */
  EReference getCompositeElementRule_Logic();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.CompositeElementRule#getChildre <em>Childre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Childre</em>'.
   * @see org.eclipse.scout.saml.saml.CompositeElementRule#getChildre()
   * @see #getCompositeElementRule()
   * @generated
   */
  EReference getCompositeElementRule_Childre();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.LeafElement <em>Leaf Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leaf Element</em>'.
   * @see org.eclipse.scout.saml.saml.LeafElement
   * @generated
   */
  EClass getLeafElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LeafElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.LeafElement#getName()
   * @see #getLeafElement()
   * @generated
   */
  EAttribute getLeafElement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.LeafElement#getFieldRule <em>Field Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field Rule</em>'.
   * @see org.eclipse.scout.saml.saml.LeafElement#getFieldRule()
   * @see #getLeafElement()
   * @generated
   */
  EReference getLeafElement_FieldRule();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LeafElement#getMandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mandatory</em>'.
   * @see org.eclipse.scout.saml.saml.LeafElement#getMandatory()
   * @see #getLeafElement()
   * @generated
   */
  EAttribute getLeafElement_Mandatory();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.LeafElement#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logic</em>'.
   * @see org.eclipse.scout.saml.saml.LeafElement#getLogic()
   * @see #getLeafElement()
   * @generated
   */
  EReference getLeafElement_Logic();

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
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.StringElement#getMaster <em>Master</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Master</em>'.
   * @see org.eclipse.scout.saml.saml.StringElement#getMaster()
   * @see #getStringElement()
   * @generated
   */
  EReference getStringElement_Master();

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
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.LongElement <em>Long Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long Element</em>'.
   * @see org.eclipse.scout.saml.saml.LongElement
   * @generated
   */
  EClass getLongElement();

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
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.SequenceBoxElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.SequenceBoxElement#getName()
   * @see #getSequenceBoxElement()
   * @generated
   */
  EAttribute getSequenceBoxElement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.SequenceBoxElement#getFieldRule <em>Field Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field Rule</em>'.
   * @see org.eclipse.scout.saml.saml.SequenceBoxElement#getFieldRule()
   * @see #getSequenceBoxElement()
   * @generated
   */
  EReference getSequenceBoxElement_FieldRule();

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
   * Returns the meta object for enum '{@link org.eclipse.scout.saml.saml.BooleanType <em>Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean Type</em>'.
   * @see org.eclipse.scout.saml.saml.BooleanType
   * @generated
   */
  EEnum getBooleanType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.scout.saml.saml.LogicType <em>Logic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Logic Type</em>'.
   * @see org.eclipse.scout.saml.saml.LogicType
   * @generated
   */
  EEnum getLogicType();

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
     * The meta object literal for the '<em><b>Codes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CODES = eINSTANCE.getModel_Codes();

    /**
     * The meta object literal for the '<em><b>Translations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TRANSLATIONS = eINSTANCE.getModel_Translations();

    /**
     * The meta object literal for the '<em><b>Lookups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__LOOKUPS = eINSTANCE.getModel_Lookups();

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
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.JavaCodeElementImpl <em>Java Code Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.JavaCodeElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getJavaCodeElement()
     * @generated
     */
    EClass JAVA_CODE_ELEMENT = eINSTANCE.getJavaCodeElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_CODE_ELEMENT__NAME = eINSTANCE.getJavaCodeElement_Name();

    /**
     * The meta object literal for the '<em><b>Runat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_CODE_ELEMENT__RUNAT = eINSTANCE.getJavaCodeElement_Runat();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JAVA_CODE_ELEMENT__SOURCE = eINSTANCE.getJavaCodeElement_Source();

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
     * The meta object literal for the '<em><b>Javacode</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOKUP_ELEMENT__JAVACODE = eINSTANCE.getLookupElement_Javacode();

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
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.ControlElementImpl <em>Control Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.ControlElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getControlElement()
     * @generated
     */
    EClass CONTROL_ELEMENT = eINSTANCE.getControlElement();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.ControlElementRuleImpl <em>Control Element Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.ControlElementRuleImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getControlElementRule()
     * @generated
     */
    EClass CONTROL_ELEMENT_RULE = eINSTANCE.getControlElementRule();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_ELEMENT_RULE__TEXT = eINSTANCE.getControlElementRule_Text();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_ELEMENT_RULE__ENABLED = eINSTANCE.getControlElementRule_Enabled();

    /**
     * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_ELEMENT_RULE__VISIBLE = eINSTANCE.getControlElementRule_Visible();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.CompositeElementImpl <em>Composite Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.CompositeElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCompositeElement()
     * @generated
     */
    EClass COMPOSITE_ELEMENT = eINSTANCE.getCompositeElement();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.CompositeElementRuleImpl <em>Composite Element Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.CompositeElementRuleImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCompositeElementRule()
     * @generated
     */
    EClass COMPOSITE_ELEMENT_RULE = eINSTANCE.getCompositeElementRule();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_ELEMENT_RULE__RULE = eINSTANCE.getCompositeElementRule_Rule();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_ELEMENT_RULE__LOGIC = eINSTANCE.getCompositeElementRule_Logic();

    /**
     * The meta object literal for the '<em><b>Childre</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_ELEMENT_RULE__CHILDRE = eINSTANCE.getCompositeElementRule_Childre();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.LeafElementImpl <em>Leaf Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.LeafElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLeafElement()
     * @generated
     */
    EClass LEAF_ELEMENT = eINSTANCE.getLeafElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEAF_ELEMENT__NAME = eINSTANCE.getLeafElement_Name();

    /**
     * The meta object literal for the '<em><b>Field Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEAF_ELEMENT__FIELD_RULE = eINSTANCE.getLeafElement_FieldRule();

    /**
     * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEAF_ELEMENT__MANDATORY = eINSTANCE.getLeafElement_Mandatory();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEAF_ELEMENT__LOGIC = eINSTANCE.getLeafElement_Logic();

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
     * The meta object literal for the '<em><b>Master</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_ELEMENT__MASTER = eINSTANCE.getStringElement_Master();

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
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.LongElementImpl <em>Long Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.LongElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLongElement()
     * @generated
     */
    EClass LONG_ELEMENT = eINSTANCE.getLongElement();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE_BOX_ELEMENT__NAME = eINSTANCE.getSequenceBoxElement_Name();

    /**
     * The meta object literal for the '<em><b>Field Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_BOX_ELEMENT__FIELD_RULE = eINSTANCE.getSequenceBoxElement_FieldRule();

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
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.BooleanType <em>Boolean Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.BooleanType
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getBooleanType()
     * @generated
     */
    EEnum BOOLEAN_TYPE = eINSTANCE.getBooleanType();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.LogicType <em>Logic Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.LogicType
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicType()
     * @generated
     */
    EEnum LOGIC_TYPE = eINSTANCE.getLogicType();

  }

} //SamlPackage
