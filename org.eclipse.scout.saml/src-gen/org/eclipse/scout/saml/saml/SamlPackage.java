/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.RootElementImpl <em>Root Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.RootElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getRootElement()
   * @generated
   */
  int ROOT_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Root Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.AbstractScoutTypeImpl <em>Abstract Scout Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.AbstractScoutTypeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getAbstractScoutType()
   * @generated
   */
  int ABSTRACT_SCOUT_TYPE = 2;

  /**
   * The number of structural features of the '<em>Abstract Scout Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SCOUT_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.AbstractFieldElementImpl <em>Abstract Field Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.AbstractFieldElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getAbstractFieldElement()
   * @generated
   */
  int ABSTRACT_FIELD_ELEMENT = 3;

  /**
   * The number of structural features of the '<em>Abstract Field Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FIELD_ELEMENT_FEATURE_COUNT = ABSTRACT_SCOUT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.StringElementPropertiesImpl <em>String Element Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.StringElementPropertiesImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getStringElementProperties()
   * @generated
   */
  int STRING_ELEMENT_PROPERTIES = 33;

  /**
   * The feature id for the '<em><b>Maxlen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT_PROPERTIES__MAXLEN = 0;

  /**
   * The number of structural features of the '<em>String Element Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT_PROPERTIES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.AbstractValueFieldPropertiesImpl <em>Abstract Value Field Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.AbstractValueFieldPropertiesImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getAbstractValueFieldProperties()
   * @generated
   */
  int ABSTRACT_VALUE_FIELD_PROPERTIES = 10;

  /**
   * The feature id for the '<em><b>Maxlen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VALUE_FIELD_PROPERTIES__MAXLEN = STRING_ELEMENT_PROPERTIES__MAXLEN;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VALUE_FIELD_PROPERTIES__CODE = STRING_ELEMENT_PROPERTIES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VALUE_FIELD_PROPERTIES__VALUE_TYPE = STRING_ELEMENT_PROPERTIES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lookup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VALUE_FIELD_PROPERTIES__LOOKUP = STRING_ELEMENT_PROPERTIES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VALUE_FIELD_PROPERTIES__MANDATORY = STRING_ELEMENT_PROPERTIES_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Abstract Value Field Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VALUE_FIELD_PROPERTIES_FEATURE_COUNT = STRING_ELEMENT_PROPERTIES_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.AbstractFieldPropertiesImpl <em>Abstract Field Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.AbstractFieldPropertiesImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getAbstractFieldProperties()
   * @generated
   */
  int ABSTRACT_FIELD_PROPERTIES = 4;

  /**
   * The feature id for the '<em><b>Maxlen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FIELD_PROPERTIES__MAXLEN = ABSTRACT_VALUE_FIELD_PROPERTIES__MAXLEN;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FIELD_PROPERTIES__CODE = ABSTRACT_VALUE_FIELD_PROPERTIES__CODE;

  /**
   * The feature id for the '<em><b>Value type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FIELD_PROPERTIES__VALUE_TYPE = ABSTRACT_VALUE_FIELD_PROPERTIES__VALUE_TYPE;

  /**
   * The feature id for the '<em><b>Lookup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FIELD_PROPERTIES__LOOKUP = ABSTRACT_VALUE_FIELD_PROPERTIES__LOOKUP;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FIELD_PROPERTIES__MANDATORY = ABSTRACT_VALUE_FIELD_PROPERTIES__MANDATORY;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FIELD_PROPERTIES__TEXT = ABSTRACT_VALUE_FIELD_PROPERTIES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visible</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FIELD_PROPERTIES__VISIBLE = ABSTRACT_VALUE_FIELD_PROPERTIES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Master</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FIELD_PROPERTIES__MASTER = ABSTRACT_VALUE_FIELD_PROPERTIES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FIELD_PROPERTIES__ENABLED = ABSTRACT_VALUE_FIELD_PROPERTIES_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Abstract Field Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_FIELD_PROPERTIES_FEATURE_COUNT = ABSTRACT_VALUE_FIELD_PROPERTIES_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.TextAttributeImpl <em>Text Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.TextAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTextAttribute()
   * @generated
   */
  int TEXT_ATTRIBUTE = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Text Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.EnabledAttribueImpl <em>Enabled Attribue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.EnabledAttribueImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getEnabledAttribue()
   * @generated
   */
  int ENABLED_ATTRIBUE = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENABLED_ATTRIBUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Enabled Attribue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENABLED_ATTRIBUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.VisibleAttribueImpl <em>Visible Attribue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.VisibleAttribueImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getVisibleAttribue()
   * @generated
   */
  int VISIBLE_ATTRIBUE = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBLE_ATTRIBUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Visible Attribue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBLE_ATTRIBUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.MasterAttributeImpl <em>Master Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.MasterAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getMasterAttribute()
   * @generated
   */
  int MASTER_ATTRIBUTE = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASTER_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Master Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASTER_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.AbstractValueFieldElementImpl <em>Abstract Value Field Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.AbstractValueFieldElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getAbstractValueFieldElement()
   * @generated
   */
  int ABSTRACT_VALUE_FIELD_ELEMENT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VALUE_FIELD_ELEMENT__NAME = ABSTRACT_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abstract Value Field Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT = ABSTRACT_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.MandatoryAttribueImpl <em>Mandatory Attribue</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.MandatoryAttribueImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getMandatoryAttribue()
   * @generated
   */
  int MANDATORY_ATTRIBUE = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_ATTRIBUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Mandatory Attribue</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_ATTRIBUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.AbstractContainerFieldElementImpl <em>Abstract Container Field Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.AbstractContainerFieldElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getAbstractContainerFieldElement()
   * @generated
   */
  int ABSTRACT_CONTAINER_FIELD_ELEMENT = 12;

  /**
   * The number of structural features of the '<em>Abstract Container Field Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONTAINER_FIELD_ELEMENT_FEATURE_COUNT = ABSTRACT_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.ModuleElementImpl <em>Module Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.ModuleElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getModuleElement()
   * @generated
   */
  int MODULE_ELEMENT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_ELEMENT__NAME = ROOT_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Module Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_ELEMENT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.TranslationElementImpl <em>Translation Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.TranslationElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTranslationElement()
   * @generated
   */
  int TRANSLATION_ELEMENT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSLATION_ELEMENT__NAME = ROOT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Translations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSLATION_ELEMENT__TRANSLATIONS = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Translation Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSLATION_ELEMENT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.TranslationAttributeImpl <em>Translation Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.TranslationAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTranslationAttribute()
   * @generated
   */
  int TRANSLATION_ATTRIBUTE = 15;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSLATION_ATTRIBUTE__LANG = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSLATION_ATTRIBUTE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Translation Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSLATION_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.JavaElementImpl <em>Java Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.JavaElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getJavaElement()
   * @generated
   */
  int JAVA_ELEMENT = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Runat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_ELEMENT__RUNAT = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_ELEMENT__SOURCE = 2;

  /**
   * The number of structural features of the '<em>Java Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.RunAtAttributeImpl <em>Run At Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.RunAtAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getRunAtAttribute()
   * @generated
   */
  int RUN_AT_ATTRIBUTE = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_AT_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Run At Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_AT_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.CodeElementImpl <em>Code Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.CodeElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCodeElement()
   * @generated
   */
  int CODE_ELEMENT = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ELEMENT__NAME = ROOT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ELEMENT__ID = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Code Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ELEMENT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.CodeIdAttributeImpl <em>Code Id Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.CodeIdAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCodeIdAttribute()
   * @generated
   */
  int CODE_ID_ATTRIBUTE = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ID_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Code Id Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_ID_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LogicElementImpl <em>Logic Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LogicElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicElement()
   * @generated
   */
  int LOGIC_ELEMENT = 20;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__PROPERTIES = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT__SOURCE = 2;

  /**
   * The number of structural features of the '<em>Logic Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LogicOptionalPropertiesImpl <em>Logic Optional Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LogicOptionalPropertiesImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicOptionalProperties()
   * @generated
   */
  int LOGIC_OPTIONAL_PROPERTIES = 21;

  /**
   * The feature id for the '<em><b>Runat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_OPTIONAL_PROPERTIES__RUNAT = 0;

  /**
   * The feature id for the '<em><b>Exec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_OPTIONAL_PROPERTIES__EXEC = 1;

  /**
   * The number of structural features of the '<em>Logic Optional Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_OPTIONAL_PROPERTIES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LogicTypeAttributeImpl <em>Logic Type Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LogicTypeAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicTypeAttribute()
   * @generated
   */
  int LOGIC_TYPE_ATTRIBUTE = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_TYPE_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Logic Type Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_TYPE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LogicExecAttributeImpl <em>Logic Exec Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LogicExecAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicExecAttribute()
   * @generated
   */
  int LOGIC_EXEC_ATTRIBUTE = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXEC_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Logic Exec Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXEC_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LookupElementImpl <em>Lookup Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LookupElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLookupElement()
   * @generated
   */
  int LOOKUP_ELEMENT = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_ELEMENT__NAME = ROOT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Servicelogic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_ELEMENT__SERVICELOGIC = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lookup Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKUP_ELEMENT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.TemplateElementImpl <em>Template Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.TemplateElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTemplateElement()
   * @generated
   */
  int TEMPLATE_ELEMENT = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_ELEMENT__NAME = ROOT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_ELEMENT__CLASS = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Replaces</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_ELEMENT__REPLACES = ROOT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Template Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_ELEMENT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.TemplateElementClassAttributeImpl <em>Template Element Class Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.TemplateElementClassAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTemplateElementClassAttribute()
   * @generated
   */
  int TEMPLATE_ELEMENT_CLASS_ATTRIBUTE = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_ELEMENT_CLASS_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Template Element Class Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_ELEMENT_CLASS_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.TemplateElementReplacesAttributeImpl <em>Template Element Replaces Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.TemplateElementReplacesAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTemplateElementReplacesAttribute()
   * @generated
   */
  int TEMPLATE_ELEMENT_REPLACES_ATTRIBUTE = 27;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_ELEMENT_REPLACES_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Template Element Replaces Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_ELEMENT_REPLACES_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.FormElementImpl <em>Form Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.FormElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getFormElement()
   * @generated
   */
  int FORM_ELEMENT = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__NAME = ROOT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Modal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__MODAL = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__TEXT = ROOT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__COLUMNS = ROOT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT__ELEMENTS = ROOT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Form Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.FormElementModalAttributeImpl <em>Form Element Modal Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.FormElementModalAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getFormElementModalAttribute()
   * @generated
   */
  int FORM_ELEMENT_MODAL_ATTRIBUTE = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT_MODAL_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Form Element Modal Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT_MODAL_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.FormElementColumnsAttributeImpl <em>Form Element Columns Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.FormElementColumnsAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getFormElementColumnsAttribute()
   * @generated
   */
  int FORM_ELEMENT_COLUMNS_ATTRIBUTE = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT_COLUMNS_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Form Element Columns Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_ELEMENT_COLUMNS_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.SequenceBoxElementImpl <em>Sequence Box Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.SequenceBoxElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSequenceBoxElement()
   * @generated
   */
  int SEQUENCE_BOX_ELEMENT = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__NAME = ABSTRACT_CONTAINER_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__PROPERTIES = ABSTRACT_CONTAINER_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT__CHILDREN = ABSTRACT_CONTAINER_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sequence Box Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_BOX_ELEMENT_FEATURE_COUNT = ABSTRACT_CONTAINER_FIELD_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.StringElementImpl <em>String Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.StringElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getStringElement()
   * @generated
   */
  int STRING_ELEMENT = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__NAME = ABSTRACT_VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__PROPERTIES = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT__LOGIC = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT_FEATURE_COUNT = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.StringElementMaxlenAttributeImpl <em>String Element Maxlen Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.StringElementMaxlenAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getStringElementMaxlenAttribute()
   * @generated
   */
  int STRING_ELEMENT_MAXLEN_ATTRIBUTE = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT_MAXLEN_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>String Element Maxlen Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_ELEMENT_MAXLEN_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.DoubleElementImpl <em>Double Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.DoubleElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getDoubleElement()
   * @generated
   */
  int DOUBLE_ELEMENT = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ELEMENT__NAME = ABSTRACT_VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ELEMENT__PROPERTIES = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ELEMENT__CHILDREN = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Double Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_ELEMENT_FEATURE_COUNT = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.LongElementImpl <em>Long Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.LongElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLongElement()
   * @generated
   */
  int LONG_ELEMENT = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__NAME = ABSTRACT_VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__PROPERTIES = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT__CHILDREN = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Long Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_ELEMENT_FEATURE_COUNT = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.DateElementImpl <em>Date Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.DateElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getDateElement()
   * @generated
   */
  int DATE_ELEMENT = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__NAME = ABSTRACT_VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__PROPERTIES = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT__CHILDREN = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Date Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ELEMENT_FEATURE_COUNT = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementImpl <em>Smartfield Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.SmartfieldElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSmartfieldElement()
   * @generated
   */
  int SMARTFIELD_ELEMENT = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__NAME = ABSTRACT_VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__PROPERTIES = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Logic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT__LOGIC = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Smartfield Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT_FEATURE_COUNT = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.SmartFieldElementPropertiesImpl <em>Smart Field Element Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.SmartFieldElementPropertiesImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSmartFieldElementProperties()
   * @generated
   */
  int SMART_FIELD_ELEMENT_PROPERTIES = 39;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_FIELD_ELEMENT_PROPERTIES__CODE = 0;

  /**
   * The feature id for the '<em><b>Value type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_FIELD_ELEMENT_PROPERTIES__VALUE_TYPE = 1;

  /**
   * The feature id for the '<em><b>Lookup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_FIELD_ELEMENT_PROPERTIES__LOOKUP = 2;

  /**
   * The number of structural features of the '<em>Smart Field Element Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMART_FIELD_ELEMENT_PROPERTIES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementCodeAttributeImpl <em>Smartfield Element Code Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.SmartfieldElementCodeAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSmartfieldElementCodeAttribute()
   * @generated
   */
  int SMARTFIELD_ELEMENT_CODE_ATTRIBUTE = 40;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT_CODE_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Smartfield Element Code Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT_CODE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementValueTypeAttributeImpl <em>Smartfield Element Value Type Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.SmartfieldElementValueTypeAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSmartfieldElementValueTypeAttribute()
   * @generated
   */
  int SMARTFIELD_ELEMENT_VALUE_TYPE_ATTRIBUTE = 41;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT_VALUE_TYPE_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Smartfield Element Value Type Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT_VALUE_TYPE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementLookupAttributeImpl <em>Smartfield Element Lookup Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.SmartfieldElementLookupAttributeImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSmartfieldElementLookupAttribute()
   * @generated
   */
  int SMARTFIELD_ELEMENT_LOOKUP_ATTRIBUTE = 42;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT_LOOKUP_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Smartfield Element Lookup Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMARTFIELD_ELEMENT_LOOKUP_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.impl.ZregBoxElementImpl <em>Zreg Box Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.impl.ZregBoxElementImpl
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getZregBoxElement()
   * @generated
   */
  int ZREG_BOX_ELEMENT = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZREG_BOX_ELEMENT__NAME = ABSTRACT_VALUE_FIELD_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZREG_BOX_ELEMENT__PROPERTIES = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZREG_BOX_ELEMENT__CHILDREN = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Zreg Box Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZREG_BOX_ELEMENT_FEATURE_COUNT = ABSTRACT_VALUE_FIELD_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.BooleanType <em>Boolean Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.BooleanType
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getBooleanType()
   * @generated
   */
  int BOOLEAN_TYPE = 44;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.JavaRunAtAttributeList <em>Java Run At Attribute List</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.JavaRunAtAttributeList
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getJavaRunAtAttributeList()
   * @generated
   */
  int JAVA_RUN_AT_ATTRIBUTE_LIST = 45;

  /**
   * The meta object id for the '{@link org.eclipse.scout.saml.saml.LogicTypeAttributeList <em>Logic Type Attribute List</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.scout.saml.saml.LogicTypeAttributeList
   * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicTypeAttributeList()
   * @generated
   */
  int LOGIC_TYPE_ATTRIBUTE_LIST = 46;


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
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipse.scout.saml.saml.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.RootElement <em>Root Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root Element</em>'.
   * @see org.eclipse.scout.saml.saml.RootElement
   * @generated
   */
  EClass getRootElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.RootElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.RootElement#getName()
   * @see #getRootElement()
   * @generated
   */
  EAttribute getRootElement_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.AbstractScoutType <em>Abstract Scout Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Scout Type</em>'.
   * @see org.eclipse.scout.saml.saml.AbstractScoutType
   * @generated
   */
  EClass getAbstractScoutType();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.AbstractFieldElement <em>Abstract Field Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Field Element</em>'.
   * @see org.eclipse.scout.saml.saml.AbstractFieldElement
   * @generated
   */
  EClass getAbstractFieldElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.AbstractFieldProperties <em>Abstract Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Field Properties</em>'.
   * @see org.eclipse.scout.saml.saml.AbstractFieldProperties
   * @generated
   */
  EClass getAbstractFieldProperties();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.AbstractFieldProperties#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.AbstractFieldProperties#getText()
   * @see #getAbstractFieldProperties()
   * @generated
   */
  EReference getAbstractFieldProperties_Text();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.AbstractFieldProperties#getVisible <em>Visible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Visible</em>'.
   * @see org.eclipse.scout.saml.saml.AbstractFieldProperties#getVisible()
   * @see #getAbstractFieldProperties()
   * @generated
   */
  EReference getAbstractFieldProperties_Visible();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.AbstractFieldProperties#getMaster <em>Master</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Master</em>'.
   * @see org.eclipse.scout.saml.saml.AbstractFieldProperties#getMaster()
   * @see #getAbstractFieldProperties()
   * @generated
   */
  EReference getAbstractFieldProperties_Master();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.AbstractFieldProperties#getEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enabled</em>'.
   * @see org.eclipse.scout.saml.saml.AbstractFieldProperties#getEnabled()
   * @see #getAbstractFieldProperties()
   * @generated
   */
  EReference getAbstractFieldProperties_Enabled();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.TextAttribute <em>Text Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.TextAttribute
   * @generated
   */
  EClass getTextAttribute();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.TextAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.TextAttribute#getValue()
   * @see #getTextAttribute()
   * @generated
   */
  EReference getTextAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.EnabledAttribue <em>Enabled Attribue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enabled Attribue</em>'.
   * @see org.eclipse.scout.saml.saml.EnabledAttribue
   * @generated
   */
  EClass getEnabledAttribue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.EnabledAttribue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.EnabledAttribue#getValue()
   * @see #getEnabledAttribue()
   * @generated
   */
  EAttribute getEnabledAttribue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.VisibleAttribue <em>Visible Attribue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visible Attribue</em>'.
   * @see org.eclipse.scout.saml.saml.VisibleAttribue
   * @generated
   */
  EClass getVisibleAttribue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.VisibleAttribue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.VisibleAttribue#getValue()
   * @see #getVisibleAttribue()
   * @generated
   */
  EAttribute getVisibleAttribue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.MasterAttribute <em>Master Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Master Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.MasterAttribute
   * @generated
   */
  EClass getMasterAttribute();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.MasterAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.MasterAttribute#getValue()
   * @see #getMasterAttribute()
   * @generated
   */
  EReference getMasterAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.AbstractValueFieldElement <em>Abstract Value Field Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Value Field Element</em>'.
   * @see org.eclipse.scout.saml.saml.AbstractValueFieldElement
   * @generated
   */
  EClass getAbstractValueFieldElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.AbstractValueFieldElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.AbstractValueFieldElement#getName()
   * @see #getAbstractValueFieldElement()
   * @generated
   */
  EAttribute getAbstractValueFieldElement_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.AbstractValueFieldProperties <em>Abstract Value Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Value Field Properties</em>'.
   * @see org.eclipse.scout.saml.saml.AbstractValueFieldProperties
   * @generated
   */
  EClass getAbstractValueFieldProperties();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.AbstractValueFieldProperties#getMandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mandatory</em>'.
   * @see org.eclipse.scout.saml.saml.AbstractValueFieldProperties#getMandatory()
   * @see #getAbstractValueFieldProperties()
   * @generated
   */
  EReference getAbstractValueFieldProperties_Mandatory();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.MandatoryAttribue <em>Mandatory Attribue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory Attribue</em>'.
   * @see org.eclipse.scout.saml.saml.MandatoryAttribue
   * @generated
   */
  EClass getMandatoryAttribue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.MandatoryAttribue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.MandatoryAttribue#getValue()
   * @see #getMandatoryAttribue()
   * @generated
   */
  EAttribute getMandatoryAttribue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.AbstractContainerFieldElement <em>Abstract Container Field Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Container Field Element</em>'.
   * @see org.eclipse.scout.saml.saml.AbstractContainerFieldElement
   * @generated
   */
  EClass getAbstractContainerFieldElement();

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
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.TranslationElement <em>Translation Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Translation Element</em>'.
   * @see org.eclipse.scout.saml.saml.TranslationElement
   * @generated
   */
  EClass getTranslationElement();

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
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.TranslationAttribute <em>Translation Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Translation Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.TranslationAttribute
   * @generated
   */
  EClass getTranslationAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.TranslationAttribute#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang</em>'.
   * @see org.eclipse.scout.saml.saml.TranslationAttribute#getLang()
   * @see #getTranslationAttribute()
   * @generated
   */
  EAttribute getTranslationAttribute_Lang();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.TranslationAttribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.scout.saml.saml.TranslationAttribute#getType()
   * @see #getTranslationAttribute()
   * @generated
   */
  EAttribute getTranslationAttribute_Type();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.JavaElement <em>Java Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Element</em>'.
   * @see org.eclipse.scout.saml.saml.JavaElement
   * @generated
   */
  EClass getJavaElement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.JavaElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.scout.saml.saml.JavaElement#getName()
   * @see #getJavaElement()
   * @generated
   */
  EAttribute getJavaElement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.JavaElement#getRunat <em>Runat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Runat</em>'.
   * @see org.eclipse.scout.saml.saml.JavaElement#getRunat()
   * @see #getJavaElement()
   * @generated
   */
  EReference getJavaElement_Runat();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.JavaElement#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see org.eclipse.scout.saml.saml.JavaElement#getSource()
   * @see #getJavaElement()
   * @generated
   */
  EAttribute getJavaElement_Source();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.RunAtAttribute <em>Run At Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Run At Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.RunAtAttribute
   * @generated
   */
  EClass getRunAtAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.RunAtAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.RunAtAttribute#getValue()
   * @see #getRunAtAttribute()
   * @generated
   */
  EAttribute getRunAtAttribute_Value();

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
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.CodeElement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.eclipse.scout.saml.saml.CodeElement#getId()
   * @see #getCodeElement()
   * @generated
   */
  EReference getCodeElement_Id();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.CodeIdAttribute <em>Code Id Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code Id Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.CodeIdAttribute
   * @generated
   */
  EClass getCodeIdAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.CodeIdAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.CodeIdAttribute#getValue()
   * @see #getCodeIdAttribute()
   * @generated
   */
  EAttribute getCodeIdAttribute_Value();

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
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.LogicElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.scout.saml.saml.LogicElement#getType()
   * @see #getLogicElement()
   * @generated
   */
  EReference getLogicElement_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.LogicElement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipse.scout.saml.saml.LogicElement#getProperties()
   * @see #getLogicElement()
   * @generated
   */
  EReference getLogicElement_Properties();

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
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.LogicOptionalProperties <em>Logic Optional Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logic Optional Properties</em>'.
   * @see org.eclipse.scout.saml.saml.LogicOptionalProperties
   * @generated
   */
  EClass getLogicOptionalProperties();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.LogicOptionalProperties#getRunat <em>Runat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Runat</em>'.
   * @see org.eclipse.scout.saml.saml.LogicOptionalProperties#getRunat()
   * @see #getLogicOptionalProperties()
   * @generated
   */
  EReference getLogicOptionalProperties_Runat();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.LogicOptionalProperties#getExec <em>Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exec</em>'.
   * @see org.eclipse.scout.saml.saml.LogicOptionalProperties#getExec()
   * @see #getLogicOptionalProperties()
   * @generated
   */
  EReference getLogicOptionalProperties_Exec();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.LogicTypeAttribute <em>Logic Type Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logic Type Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.LogicTypeAttribute
   * @generated
   */
  EClass getLogicTypeAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.LogicTypeAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.LogicTypeAttribute#getValue()
   * @see #getLogicTypeAttribute()
   * @generated
   */
  EAttribute getLogicTypeAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.LogicExecAttribute <em>Logic Exec Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logic Exec Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.LogicExecAttribute
   * @generated
   */
  EClass getLogicExecAttribute();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.LogicExecAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.LogicExecAttribute#getValue()
   * @see #getLogicExecAttribute()
   * @generated
   */
  EReference getLogicExecAttribute_Value();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.LookupElement#getServicelogic <em>Servicelogic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Servicelogic</em>'.
   * @see org.eclipse.scout.saml.saml.LookupElement#getServicelogic()
   * @see #getLookupElement()
   * @generated
   */
  EReference getLookupElement_Servicelogic();

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
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.TemplateElement#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see org.eclipse.scout.saml.saml.TemplateElement#getClass_()
   * @see #getTemplateElement()
   * @generated
   */
  EReference getTemplateElement_Class();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.TemplateElement#getReplaces <em>Replaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Replaces</em>'.
   * @see org.eclipse.scout.saml.saml.TemplateElement#getReplaces()
   * @see #getTemplateElement()
   * @generated
   */
  EReference getTemplateElement_Replaces();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.TemplateElementClassAttribute <em>Template Element Class Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Element Class Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.TemplateElementClassAttribute
   * @generated
   */
  EClass getTemplateElementClassAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.TemplateElementClassAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.TemplateElementClassAttribute#getValue()
   * @see #getTemplateElementClassAttribute()
   * @generated
   */
  EAttribute getTemplateElementClassAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.TemplateElementReplacesAttribute <em>Template Element Replaces Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Element Replaces Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.TemplateElementReplacesAttribute
   * @generated
   */
  EClass getTemplateElementReplacesAttribute();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.TemplateElementReplacesAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.TemplateElementReplacesAttribute#getValue()
   * @see #getTemplateElementReplacesAttribute()
   * @generated
   */
  EReference getTemplateElementReplacesAttribute_Value();

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
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.FormElement#getModal <em>Modal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modal</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getModal()
   * @see #getFormElement()
   * @generated
   */
  EReference getFormElement_Modal();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.FormElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getText()
   * @see #getFormElement()
   * @generated
   */
  EReference getFormElement_Text();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.FormElement#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Columns</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getColumns()
   * @see #getFormElement()
   * @generated
   */
  EReference getFormElement_Columns();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.FormElement#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipse.scout.saml.saml.FormElement#getElements()
   * @see #getFormElement()
   * @generated
   */
  EReference getFormElement_Elements();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.FormElementModalAttribute <em>Form Element Modal Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form Element Modal Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.FormElementModalAttribute
   * @generated
   */
  EClass getFormElementModalAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.FormElementModalAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.FormElementModalAttribute#getValue()
   * @see #getFormElementModalAttribute()
   * @generated
   */
  EAttribute getFormElementModalAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.FormElementColumnsAttribute <em>Form Element Columns Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form Element Columns Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.FormElementColumnsAttribute
   * @generated
   */
  EClass getFormElementColumnsAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.FormElementColumnsAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.FormElementColumnsAttribute#getValue()
   * @see #getFormElementColumnsAttribute()
   * @generated
   */
  EAttribute getFormElementColumnsAttribute_Value();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.SequenceBoxElement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipse.scout.saml.saml.SequenceBoxElement#getProperties()
   * @see #getSequenceBoxElement()
   * @generated
   */
  EReference getSequenceBoxElement_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.SequenceBoxElement#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipse.scout.saml.saml.SequenceBoxElement#getChildren()
   * @see #getSequenceBoxElement()
   * @generated
   */
  EReference getSequenceBoxElement_Children();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.StringElement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipse.scout.saml.saml.StringElement#getProperties()
   * @see #getStringElement()
   * @generated
   */
  EReference getStringElement_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.StringElement#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logic</em>'.
   * @see org.eclipse.scout.saml.saml.StringElement#getLogic()
   * @see #getStringElement()
   * @generated
   */
  EReference getStringElement_Logic();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.StringElementProperties <em>String Element Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Element Properties</em>'.
   * @see org.eclipse.scout.saml.saml.StringElementProperties
   * @generated
   */
  EClass getStringElementProperties();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.StringElementProperties#getMaxlen <em>Maxlen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Maxlen</em>'.
   * @see org.eclipse.scout.saml.saml.StringElementProperties#getMaxlen()
   * @see #getStringElementProperties()
   * @generated
   */
  EReference getStringElementProperties_Maxlen();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.StringElementMaxlenAttribute <em>String Element Maxlen Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Element Maxlen Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.StringElementMaxlenAttribute
   * @generated
   */
  EClass getStringElementMaxlenAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.scout.saml.saml.StringElementMaxlenAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.StringElementMaxlenAttribute#getValue()
   * @see #getStringElementMaxlenAttribute()
   * @generated
   */
  EAttribute getStringElementMaxlenAttribute_Value();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.DoubleElement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipse.scout.saml.saml.DoubleElement#getProperties()
   * @see #getDoubleElement()
   * @generated
   */
  EReference getDoubleElement_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.DoubleElement#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipse.scout.saml.saml.DoubleElement#getChildren()
   * @see #getDoubleElement()
   * @generated
   */
  EReference getDoubleElement_Children();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.LongElement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipse.scout.saml.saml.LongElement#getProperties()
   * @see #getLongElement()
   * @generated
   */
  EReference getLongElement_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.LongElement#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipse.scout.saml.saml.LongElement#getChildren()
   * @see #getLongElement()
   * @generated
   */
  EReference getLongElement_Children();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.DateElement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipse.scout.saml.saml.DateElement#getProperties()
   * @see #getDateElement()
   * @generated
   */
  EReference getDateElement_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.DateElement#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipse.scout.saml.saml.DateElement#getChildren()
   * @see #getDateElement()
   * @generated
   */
  EReference getDateElement_Children();

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
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.SmartfieldElement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElement#getProperties()
   * @see #getSmartfieldElement()
   * @generated
   */
  EReference getSmartfieldElement_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.SmartfieldElement#getLogic <em>Logic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Logic</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElement#getLogic()
   * @see #getSmartfieldElement()
   * @generated
   */
  EReference getSmartfieldElement_Logic();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.SmartFieldElementProperties <em>Smart Field Element Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smart Field Element Properties</em>'.
   * @see org.eclipse.scout.saml.saml.SmartFieldElementProperties
   * @generated
   */
  EClass getSmartFieldElementProperties();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.SmartFieldElementProperties#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Code</em>'.
   * @see org.eclipse.scout.saml.saml.SmartFieldElementProperties#getCode()
   * @see #getSmartFieldElementProperties()
   * @generated
   */
  EReference getSmartFieldElementProperties_Code();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.SmartFieldElementProperties#getValue_type <em>Value type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value type</em>'.
   * @see org.eclipse.scout.saml.saml.SmartFieldElementProperties#getValue_type()
   * @see #getSmartFieldElementProperties()
   * @generated
   */
  EReference getSmartFieldElementProperties_Value_type();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.scout.saml.saml.SmartFieldElementProperties#getLookup <em>Lookup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lookup</em>'.
   * @see org.eclipse.scout.saml.saml.SmartFieldElementProperties#getLookup()
   * @see #getSmartFieldElementProperties()
   * @generated
   */
  EReference getSmartFieldElementProperties_Lookup();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.SmartfieldElementCodeAttribute <em>Smartfield Element Code Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smartfield Element Code Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElementCodeAttribute
   * @generated
   */
  EClass getSmartfieldElementCodeAttribute();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.SmartfieldElementCodeAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElementCodeAttribute#getValue()
   * @see #getSmartfieldElementCodeAttribute()
   * @generated
   */
  EReference getSmartfieldElementCodeAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.SmartfieldElementValueTypeAttribute <em>Smartfield Element Value Type Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smartfield Element Value Type Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElementValueTypeAttribute
   * @generated
   */
  EClass getSmartfieldElementValueTypeAttribute();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.SmartfieldElementValueTypeAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElementValueTypeAttribute#getValue()
   * @see #getSmartfieldElementValueTypeAttribute()
   * @generated
   */
  EReference getSmartfieldElementValueTypeAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.SmartfieldElementLookupAttribute <em>Smartfield Element Lookup Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smartfield Element Lookup Attribute</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElementLookupAttribute
   * @generated
   */
  EClass getSmartfieldElementLookupAttribute();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.scout.saml.saml.SmartfieldElementLookupAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.eclipse.scout.saml.saml.SmartfieldElementLookupAttribute#getValue()
   * @see #getSmartfieldElementLookupAttribute()
   * @generated
   */
  EReference getSmartfieldElementLookupAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.scout.saml.saml.ZregBoxElement <em>Zreg Box Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Zreg Box Element</em>'.
   * @see org.eclipse.scout.saml.saml.ZregBoxElement
   * @generated
   */
  EClass getZregBoxElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.ZregBoxElement#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipse.scout.saml.saml.ZregBoxElement#getProperties()
   * @see #getZregBoxElement()
   * @generated
   */
  EReference getZregBoxElement_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.scout.saml.saml.ZregBoxElement#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipse.scout.saml.saml.ZregBoxElement#getChildren()
   * @see #getZregBoxElement()
   * @generated
   */
  EReference getZregBoxElement_Children();

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
   * Returns the meta object for enum '{@link org.eclipse.scout.saml.saml.JavaRunAtAttributeList <em>Java Run At Attribute List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Java Run At Attribute List</em>'.
   * @see org.eclipse.scout.saml.saml.JavaRunAtAttributeList
   * @generated
   */
  EEnum getJavaRunAtAttributeList();

  /**
   * Returns the meta object for enum '{@link org.eclipse.scout.saml.saml.LogicTypeAttributeList <em>Logic Type Attribute List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Logic Type Attribute List</em>'.
   * @see org.eclipse.scout.saml.saml.LogicTypeAttributeList
   * @generated
   */
  EEnum getLogicTypeAttributeList();

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
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.RootElementImpl <em>Root Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.RootElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getRootElement()
     * @generated
     */
    EClass ROOT_ELEMENT = eINSTANCE.getRootElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROOT_ELEMENT__NAME = eINSTANCE.getRootElement_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.AbstractScoutTypeImpl <em>Abstract Scout Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.AbstractScoutTypeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getAbstractScoutType()
     * @generated
     */
    EClass ABSTRACT_SCOUT_TYPE = eINSTANCE.getAbstractScoutType();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.AbstractFieldElementImpl <em>Abstract Field Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.AbstractFieldElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getAbstractFieldElement()
     * @generated
     */
    EClass ABSTRACT_FIELD_ELEMENT = eINSTANCE.getAbstractFieldElement();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.AbstractFieldPropertiesImpl <em>Abstract Field Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.AbstractFieldPropertiesImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getAbstractFieldProperties()
     * @generated
     */
    EClass ABSTRACT_FIELD_PROPERTIES = eINSTANCE.getAbstractFieldProperties();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_FIELD_PROPERTIES__TEXT = eINSTANCE.getAbstractFieldProperties_Text();

    /**
     * The meta object literal for the '<em><b>Visible</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_FIELD_PROPERTIES__VISIBLE = eINSTANCE.getAbstractFieldProperties_Visible();

    /**
     * The meta object literal for the '<em><b>Master</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_FIELD_PROPERTIES__MASTER = eINSTANCE.getAbstractFieldProperties_Master();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_FIELD_PROPERTIES__ENABLED = eINSTANCE.getAbstractFieldProperties_Enabled();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.TextAttributeImpl <em>Text Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.TextAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTextAttribute()
     * @generated
     */
    EClass TEXT_ATTRIBUTE = eINSTANCE.getTextAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEXT_ATTRIBUTE__VALUE = eINSTANCE.getTextAttribute_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.EnabledAttribueImpl <em>Enabled Attribue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.EnabledAttribueImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getEnabledAttribue()
     * @generated
     */
    EClass ENABLED_ATTRIBUE = eINSTANCE.getEnabledAttribue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENABLED_ATTRIBUE__VALUE = eINSTANCE.getEnabledAttribue_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.VisibleAttribueImpl <em>Visible Attribue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.VisibleAttribueImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getVisibleAttribue()
     * @generated
     */
    EClass VISIBLE_ATTRIBUE = eINSTANCE.getVisibleAttribue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISIBLE_ATTRIBUE__VALUE = eINSTANCE.getVisibleAttribue_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.MasterAttributeImpl <em>Master Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.MasterAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getMasterAttribute()
     * @generated
     */
    EClass MASTER_ATTRIBUTE = eINSTANCE.getMasterAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MASTER_ATTRIBUTE__VALUE = eINSTANCE.getMasterAttribute_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.AbstractValueFieldElementImpl <em>Abstract Value Field Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.AbstractValueFieldElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getAbstractValueFieldElement()
     * @generated
     */
    EClass ABSTRACT_VALUE_FIELD_ELEMENT = eINSTANCE.getAbstractValueFieldElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_VALUE_FIELD_ELEMENT__NAME = eINSTANCE.getAbstractValueFieldElement_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.AbstractValueFieldPropertiesImpl <em>Abstract Value Field Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.AbstractValueFieldPropertiesImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getAbstractValueFieldProperties()
     * @generated
     */
    EClass ABSTRACT_VALUE_FIELD_PROPERTIES = eINSTANCE.getAbstractValueFieldProperties();

    /**
     * The meta object literal for the '<em><b>Mandatory</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_VALUE_FIELD_PROPERTIES__MANDATORY = eINSTANCE.getAbstractValueFieldProperties_Mandatory();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.MandatoryAttribueImpl <em>Mandatory Attribue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.MandatoryAttribueImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getMandatoryAttribue()
     * @generated
     */
    EClass MANDATORY_ATTRIBUE = eINSTANCE.getMandatoryAttribue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANDATORY_ATTRIBUE__VALUE = eINSTANCE.getMandatoryAttribue_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.AbstractContainerFieldElementImpl <em>Abstract Container Field Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.AbstractContainerFieldElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getAbstractContainerFieldElement()
     * @generated
     */
    EClass ABSTRACT_CONTAINER_FIELD_ELEMENT = eINSTANCE.getAbstractContainerFieldElement();

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
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.TranslationElementImpl <em>Translation Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.TranslationElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTranslationElement()
     * @generated
     */
    EClass TRANSLATION_ELEMENT = eINSTANCE.getTranslationElement();

    /**
     * The meta object literal for the '<em><b>Translations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSLATION_ELEMENT__TRANSLATIONS = eINSTANCE.getTranslationElement_Translations();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.TranslationAttributeImpl <em>Translation Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.TranslationAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTranslationAttribute()
     * @generated
     */
    EClass TRANSLATION_ATTRIBUTE = eINSTANCE.getTranslationAttribute();

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSLATION_ATTRIBUTE__LANG = eINSTANCE.getTranslationAttribute_Lang();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSLATION_ATTRIBUTE__TYPE = eINSTANCE.getTranslationAttribute_Type();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.JavaElementImpl <em>Java Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.JavaElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getJavaElement()
     * @generated
     */
    EClass JAVA_ELEMENT = eINSTANCE.getJavaElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_ELEMENT__NAME = eINSTANCE.getJavaElement_Name();

    /**
     * The meta object literal for the '<em><b>Runat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JAVA_ELEMENT__RUNAT = eINSTANCE.getJavaElement_Runat();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_ELEMENT__SOURCE = eINSTANCE.getJavaElement_Source();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.RunAtAttributeImpl <em>Run At Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.RunAtAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getRunAtAttribute()
     * @generated
     */
    EClass RUN_AT_ATTRIBUTE = eINSTANCE.getRunAtAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN_AT_ATTRIBUTE__VALUE = eINSTANCE.getRunAtAttribute_Value();

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
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CODE_ELEMENT__ID = eINSTANCE.getCodeElement_Id();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.CodeIdAttributeImpl <em>Code Id Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.CodeIdAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getCodeIdAttribute()
     * @generated
     */
    EClass CODE_ID_ATTRIBUTE = eINSTANCE.getCodeIdAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODE_ID_ATTRIBUTE__VALUE = eINSTANCE.getCodeIdAttribute_Value();

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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_ELEMENT__TYPE = eINSTANCE.getLogicElement_Type();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_ELEMENT__PROPERTIES = eINSTANCE.getLogicElement_Properties();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_ELEMENT__SOURCE = eINSTANCE.getLogicElement_Source();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.LogicOptionalPropertiesImpl <em>Logic Optional Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.LogicOptionalPropertiesImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicOptionalProperties()
     * @generated
     */
    EClass LOGIC_OPTIONAL_PROPERTIES = eINSTANCE.getLogicOptionalProperties();

    /**
     * The meta object literal for the '<em><b>Runat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_OPTIONAL_PROPERTIES__RUNAT = eINSTANCE.getLogicOptionalProperties_Runat();

    /**
     * The meta object literal for the '<em><b>Exec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_OPTIONAL_PROPERTIES__EXEC = eINSTANCE.getLogicOptionalProperties_Exec();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.LogicTypeAttributeImpl <em>Logic Type Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.LogicTypeAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicTypeAttribute()
     * @generated
     */
    EClass LOGIC_TYPE_ATTRIBUTE = eINSTANCE.getLogicTypeAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_TYPE_ATTRIBUTE__VALUE = eINSTANCE.getLogicTypeAttribute_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.LogicExecAttributeImpl <em>Logic Exec Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.LogicExecAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicExecAttribute()
     * @generated
     */
    EClass LOGIC_EXEC_ATTRIBUTE = eINSTANCE.getLogicExecAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXEC_ATTRIBUTE__VALUE = eINSTANCE.getLogicExecAttribute_Value();

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
     * The meta object literal for the '<em><b>Servicelogic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOKUP_ELEMENT__SERVICELOGIC = eINSTANCE.getLookupElement_Servicelogic();

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
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_ELEMENT__CLASS = eINSTANCE.getTemplateElement_Class();

    /**
     * The meta object literal for the '<em><b>Replaces</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_ELEMENT__REPLACES = eINSTANCE.getTemplateElement_Replaces();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.TemplateElementClassAttributeImpl <em>Template Element Class Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.TemplateElementClassAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTemplateElementClassAttribute()
     * @generated
     */
    EClass TEMPLATE_ELEMENT_CLASS_ATTRIBUTE = eINSTANCE.getTemplateElementClassAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE_ELEMENT_CLASS_ATTRIBUTE__VALUE = eINSTANCE.getTemplateElementClassAttribute_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.TemplateElementReplacesAttributeImpl <em>Template Element Replaces Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.TemplateElementReplacesAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getTemplateElementReplacesAttribute()
     * @generated
     */
    EClass TEMPLATE_ELEMENT_REPLACES_ATTRIBUTE = eINSTANCE.getTemplateElementReplacesAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_ELEMENT_REPLACES_ATTRIBUTE__VALUE = eINSTANCE.getTemplateElementReplacesAttribute_Value();

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
     * The meta object literal for the '<em><b>Modal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_ELEMENT__MODAL = eINSTANCE.getFormElement_Modal();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_ELEMENT__TEXT = eINSTANCE.getFormElement_Text();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_ELEMENT__COLUMNS = eINSTANCE.getFormElement_Columns();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_ELEMENT__ELEMENTS = eINSTANCE.getFormElement_Elements();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.FormElementModalAttributeImpl <em>Form Element Modal Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.FormElementModalAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getFormElementModalAttribute()
     * @generated
     */
    EClass FORM_ELEMENT_MODAL_ATTRIBUTE = eINSTANCE.getFormElementModalAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_ELEMENT_MODAL_ATTRIBUTE__VALUE = eINSTANCE.getFormElementModalAttribute_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.FormElementColumnsAttributeImpl <em>Form Element Columns Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.FormElementColumnsAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getFormElementColumnsAttribute()
     * @generated
     */
    EClass FORM_ELEMENT_COLUMNS_ATTRIBUTE = eINSTANCE.getFormElementColumnsAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_ELEMENT_COLUMNS_ATTRIBUTE__VALUE = eINSTANCE.getFormElementColumnsAttribute_Value();

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
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_BOX_ELEMENT__PROPERTIES = eINSTANCE.getSequenceBoxElement_Properties();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_BOX_ELEMENT__CHILDREN = eINSTANCE.getSequenceBoxElement_Children();

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
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_ELEMENT__PROPERTIES = eINSTANCE.getStringElement_Properties();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_ELEMENT__LOGIC = eINSTANCE.getStringElement_Logic();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.StringElementPropertiesImpl <em>String Element Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.StringElementPropertiesImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getStringElementProperties()
     * @generated
     */
    EClass STRING_ELEMENT_PROPERTIES = eINSTANCE.getStringElementProperties();

    /**
     * The meta object literal for the '<em><b>Maxlen</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRING_ELEMENT_PROPERTIES__MAXLEN = eINSTANCE.getStringElementProperties_Maxlen();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.StringElementMaxlenAttributeImpl <em>String Element Maxlen Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.StringElementMaxlenAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getStringElementMaxlenAttribute()
     * @generated
     */
    EClass STRING_ELEMENT_MAXLEN_ATTRIBUTE = eINSTANCE.getStringElementMaxlenAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_ELEMENT_MAXLEN_ATTRIBUTE__VALUE = eINSTANCE.getStringElementMaxlenAttribute_Value();

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
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOUBLE_ELEMENT__PROPERTIES = eINSTANCE.getDoubleElement_Properties();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOUBLE_ELEMENT__CHILDREN = eINSTANCE.getDoubleElement_Children();

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
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LONG_ELEMENT__PROPERTIES = eINSTANCE.getLongElement_Properties();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LONG_ELEMENT__CHILDREN = eINSTANCE.getLongElement_Children();

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
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATE_ELEMENT__PROPERTIES = eINSTANCE.getDateElement_Properties();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATE_ELEMENT__CHILDREN = eINSTANCE.getDateElement_Children();

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
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMARTFIELD_ELEMENT__PROPERTIES = eINSTANCE.getSmartfieldElement_Properties();

    /**
     * The meta object literal for the '<em><b>Logic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMARTFIELD_ELEMENT__LOGIC = eINSTANCE.getSmartfieldElement_Logic();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.SmartFieldElementPropertiesImpl <em>Smart Field Element Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.SmartFieldElementPropertiesImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSmartFieldElementProperties()
     * @generated
     */
    EClass SMART_FIELD_ELEMENT_PROPERTIES = eINSTANCE.getSmartFieldElementProperties();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMART_FIELD_ELEMENT_PROPERTIES__CODE = eINSTANCE.getSmartFieldElementProperties_Code();

    /**
     * The meta object literal for the '<em><b>Value type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMART_FIELD_ELEMENT_PROPERTIES__VALUE_TYPE = eINSTANCE.getSmartFieldElementProperties_Value_type();

    /**
     * The meta object literal for the '<em><b>Lookup</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMART_FIELD_ELEMENT_PROPERTIES__LOOKUP = eINSTANCE.getSmartFieldElementProperties_Lookup();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementCodeAttributeImpl <em>Smartfield Element Code Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.SmartfieldElementCodeAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSmartfieldElementCodeAttribute()
     * @generated
     */
    EClass SMARTFIELD_ELEMENT_CODE_ATTRIBUTE = eINSTANCE.getSmartfieldElementCodeAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMARTFIELD_ELEMENT_CODE_ATTRIBUTE__VALUE = eINSTANCE.getSmartfieldElementCodeAttribute_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementValueTypeAttributeImpl <em>Smartfield Element Value Type Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.SmartfieldElementValueTypeAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSmartfieldElementValueTypeAttribute()
     * @generated
     */
    EClass SMARTFIELD_ELEMENT_VALUE_TYPE_ATTRIBUTE = eINSTANCE.getSmartfieldElementValueTypeAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMARTFIELD_ELEMENT_VALUE_TYPE_ATTRIBUTE__VALUE = eINSTANCE.getSmartfieldElementValueTypeAttribute_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementLookupAttributeImpl <em>Smartfield Element Lookup Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.SmartfieldElementLookupAttributeImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getSmartfieldElementLookupAttribute()
     * @generated
     */
    EClass SMARTFIELD_ELEMENT_LOOKUP_ATTRIBUTE = eINSTANCE.getSmartfieldElementLookupAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMARTFIELD_ELEMENT_LOOKUP_ATTRIBUTE__VALUE = eINSTANCE.getSmartfieldElementLookupAttribute_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.impl.ZregBoxElementImpl <em>Zreg Box Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.impl.ZregBoxElementImpl
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getZregBoxElement()
     * @generated
     */
    EClass ZREG_BOX_ELEMENT = eINSTANCE.getZregBoxElement();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ZREG_BOX_ELEMENT__PROPERTIES = eINSTANCE.getZregBoxElement_Properties();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ZREG_BOX_ELEMENT__CHILDREN = eINSTANCE.getZregBoxElement_Children();

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
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.JavaRunAtAttributeList <em>Java Run At Attribute List</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.JavaRunAtAttributeList
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getJavaRunAtAttributeList()
     * @generated
     */
    EEnum JAVA_RUN_AT_ATTRIBUTE_LIST = eINSTANCE.getJavaRunAtAttributeList();

    /**
     * The meta object literal for the '{@link org.eclipse.scout.saml.saml.LogicTypeAttributeList <em>Logic Type Attribute List</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.scout.saml.saml.LogicTypeAttributeList
     * @see org.eclipse.scout.saml.saml.impl.SamlPackageImpl#getLogicTypeAttributeList()
     * @generated
     */
    EEnum LOGIC_TYPE_ATTRIBUTE_LIST = eINSTANCE.getLogicTypeAttributeList();

  }

} //SamlPackage
