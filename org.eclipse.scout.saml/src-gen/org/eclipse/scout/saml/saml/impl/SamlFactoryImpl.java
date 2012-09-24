/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.scout.saml.saml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SamlFactoryImpl extends EFactoryImpl implements SamlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SamlFactory init()
  {
    try
    {
      SamlFactory theSamlFactory = (SamlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/scout/saml/Saml"); 
      if (theSamlFactory != null)
      {
        return theSamlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SamlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SamlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SamlPackage.MODEL: return createModel();
      case SamlPackage.ROOT_ELEMENT: return createRootElement();
      case SamlPackage.ABSTRACT_SCOUT_TYPE: return createAbstractScoutType();
      case SamlPackage.ABSTRACT_FIELD_ELEMENT: return createAbstractFieldElement();
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES: return createAbstractFieldProperties();
      case SamlPackage.TEXT_ATTRIBUTE: return createTextAttribute();
      case SamlPackage.ENABLED_ATTRIBUE: return createEnabledAttribue();
      case SamlPackage.VISIBLE_ATTRIBUE: return createVisibleAttribue();
      case SamlPackage.MASTER_ATTRIBUTE: return createMasterAttribute();
      case SamlPackage.ABSTRACT_VALUE_FIELD_ELEMENT: return createAbstractValueFieldElement();
      case SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES: return createAbstractValueFieldProperties();
      case SamlPackage.MANDATORY_ATTRIBUE: return createMandatoryAttribue();
      case SamlPackage.ABSTRACT_CONTAINER_FIELD_ELEMENT: return createAbstractContainerFieldElement();
      case SamlPackage.MODULE_ELEMENT: return createModuleElement();
      case SamlPackage.TRANSLATION_ELEMENT: return createTranslationElement();
      case SamlPackage.TRANSLATION_ATTRIBUTE: return createTranslationAttribute();
      case SamlPackage.JAVA_ELEMENT: return createJavaElement();
      case SamlPackage.RUN_AT_ATTRIBUTE: return createRunAtAttribute();
      case SamlPackage.CODE_ELEMENT: return createCodeElement();
      case SamlPackage.CODE_ID_ATTRIBUTE: return createCodeIdAttribute();
      case SamlPackage.LOGIC_ELEMENT: return createLogicElement();
      case SamlPackage.LOGIC_OPTIONAL_PROPERTIES: return createLogicOptionalProperties();
      case SamlPackage.LOGIC_TYPE_ATTRIBUTE: return createLogicTypeAttribute();
      case SamlPackage.LOGIC_EXEC_ATTRIBUTE: return createLogicExecAttribute();
      case SamlPackage.LOOKUP_ELEMENT: return createLookupElement();
      case SamlPackage.TEMPLATE_ELEMENT: return createTemplateElement();
      case SamlPackage.TEMPLATE_ELEMENT_CLASS_ATTRIBUTE: return createTemplateElementClassAttribute();
      case SamlPackage.TEMPLATE_ELEMENT_REPLACES_ATTRIBUTE: return createTemplateElementReplacesAttribute();
      case SamlPackage.FORM_ELEMENT: return createFormElement();
      case SamlPackage.FORM_ELEMENT_MODAL_ATTRIBUTE: return createFormElementModalAttribute();
      case SamlPackage.FORM_ELEMENT_COLUMNS_ATTRIBUTE: return createFormElementColumnsAttribute();
      case SamlPackage.SEQUENCE_BOX_ELEMENT: return createSequenceBoxElement();
      case SamlPackage.STRING_ELEMENT: return createStringElement();
      case SamlPackage.STRING_ELEMENT_PROPERTIES: return createStringElementProperties();
      case SamlPackage.STRING_ELEMENT_MAXLEN_ATTRIBUTE: return createStringElementMaxlenAttribute();
      case SamlPackage.DOUBLE_ELEMENT: return createDoubleElement();
      case SamlPackage.LONG_ELEMENT: return createLongElement();
      case SamlPackage.DATE_ELEMENT: return createDateElement();
      case SamlPackage.SMARTFIELD_ELEMENT: return createSmartfieldElement();
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES: return createSmartFieldElementProperties();
      case SamlPackage.SMARTFIELD_ELEMENT_CODE_ATTRIBUTE: return createSmartfieldElementCodeAttribute();
      case SamlPackage.SMARTFIELD_ELEMENT_VALUE_TYPE_ATTRIBUTE: return createSmartfieldElementValueTypeAttribute();
      case SamlPackage.SMARTFIELD_ELEMENT_LOOKUP_ATTRIBUTE: return createSmartfieldElementLookupAttribute();
      case SamlPackage.ZREG_BOX_ELEMENT: return createZregBoxElement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SamlPackage.BOOLEAN_TYPE:
        return createBooleanTypeFromString(eDataType, initialValue);
      case SamlPackage.JAVA_RUN_AT_ATTRIBUTE_LIST:
        return createJavaRunAtAttributeListFromString(eDataType, initialValue);
      case SamlPackage.LOGIC_TYPE_ATTRIBUTE_LIST:
        return createLogicTypeAttributeListFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SamlPackage.BOOLEAN_TYPE:
        return convertBooleanTypeToString(eDataType, instanceValue);
      case SamlPackage.JAVA_RUN_AT_ATTRIBUTE_LIST:
        return convertJavaRunAtAttributeListToString(eDataType, instanceValue);
      case SamlPackage.LOGIC_TYPE_ATTRIBUTE_LIST:
        return convertLogicTypeAttributeListToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RootElement createRootElement()
  {
    RootElementImpl rootElement = new RootElementImpl();
    return rootElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractScoutType createAbstractScoutType()
  {
    AbstractScoutTypeImpl abstractScoutType = new AbstractScoutTypeImpl();
    return abstractScoutType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractFieldElement createAbstractFieldElement()
  {
    AbstractFieldElementImpl abstractFieldElement = new AbstractFieldElementImpl();
    return abstractFieldElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractFieldProperties createAbstractFieldProperties()
  {
    AbstractFieldPropertiesImpl abstractFieldProperties = new AbstractFieldPropertiesImpl();
    return abstractFieldProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextAttribute createTextAttribute()
  {
    TextAttributeImpl textAttribute = new TextAttributeImpl();
    return textAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnabledAttribue createEnabledAttribue()
  {
    EnabledAttribueImpl enabledAttribue = new EnabledAttribueImpl();
    return enabledAttribue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisibleAttribue createVisibleAttribue()
  {
    VisibleAttribueImpl visibleAttribue = new VisibleAttribueImpl();
    return visibleAttribue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MasterAttribute createMasterAttribute()
  {
    MasterAttributeImpl masterAttribute = new MasterAttributeImpl();
    return masterAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractValueFieldElement createAbstractValueFieldElement()
  {
    AbstractValueFieldElementImpl abstractValueFieldElement = new AbstractValueFieldElementImpl();
    return abstractValueFieldElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractValueFieldProperties createAbstractValueFieldProperties()
  {
    AbstractValueFieldPropertiesImpl abstractValueFieldProperties = new AbstractValueFieldPropertiesImpl();
    return abstractValueFieldProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MandatoryAttribue createMandatoryAttribue()
  {
    MandatoryAttribueImpl mandatoryAttribue = new MandatoryAttribueImpl();
    return mandatoryAttribue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractContainerFieldElement createAbstractContainerFieldElement()
  {
    AbstractContainerFieldElementImpl abstractContainerFieldElement = new AbstractContainerFieldElementImpl();
    return abstractContainerFieldElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleElement createModuleElement()
  {
    ModuleElementImpl moduleElement = new ModuleElementImpl();
    return moduleElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TranslationElement createTranslationElement()
  {
    TranslationElementImpl translationElement = new TranslationElementImpl();
    return translationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TranslationAttribute createTranslationAttribute()
  {
    TranslationAttributeImpl translationAttribute = new TranslationAttributeImpl();
    return translationAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaElement createJavaElement()
  {
    JavaElementImpl javaElement = new JavaElementImpl();
    return javaElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunAtAttribute createRunAtAttribute()
  {
    RunAtAttributeImpl runAtAttribute = new RunAtAttributeImpl();
    return runAtAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeElement createCodeElement()
  {
    CodeElementImpl codeElement = new CodeElementImpl();
    return codeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeIdAttribute createCodeIdAttribute()
  {
    CodeIdAttributeImpl codeIdAttribute = new CodeIdAttributeImpl();
    return codeIdAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicElement createLogicElement()
  {
    LogicElementImpl logicElement = new LogicElementImpl();
    return logicElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicOptionalProperties createLogicOptionalProperties()
  {
    LogicOptionalPropertiesImpl logicOptionalProperties = new LogicOptionalPropertiesImpl();
    return logicOptionalProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicTypeAttribute createLogicTypeAttribute()
  {
    LogicTypeAttributeImpl logicTypeAttribute = new LogicTypeAttributeImpl();
    return logicTypeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicExecAttribute createLogicExecAttribute()
  {
    LogicExecAttributeImpl logicExecAttribute = new LogicExecAttributeImpl();
    return logicExecAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LookupElement createLookupElement()
  {
    LookupElementImpl lookupElement = new LookupElementImpl();
    return lookupElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateElement createTemplateElement()
  {
    TemplateElementImpl templateElement = new TemplateElementImpl();
    return templateElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateElementClassAttribute createTemplateElementClassAttribute()
  {
    TemplateElementClassAttributeImpl templateElementClassAttribute = new TemplateElementClassAttributeImpl();
    return templateElementClassAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateElementReplacesAttribute createTemplateElementReplacesAttribute()
  {
    TemplateElementReplacesAttributeImpl templateElementReplacesAttribute = new TemplateElementReplacesAttributeImpl();
    return templateElementReplacesAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormElement createFormElement()
  {
    FormElementImpl formElement = new FormElementImpl();
    return formElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormElementModalAttribute createFormElementModalAttribute()
  {
    FormElementModalAttributeImpl formElementModalAttribute = new FormElementModalAttributeImpl();
    return formElementModalAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormElementColumnsAttribute createFormElementColumnsAttribute()
  {
    FormElementColumnsAttributeImpl formElementColumnsAttribute = new FormElementColumnsAttributeImpl();
    return formElementColumnsAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceBoxElement createSequenceBoxElement()
  {
    SequenceBoxElementImpl sequenceBoxElement = new SequenceBoxElementImpl();
    return sequenceBoxElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringElement createStringElement()
  {
    StringElementImpl stringElement = new StringElementImpl();
    return stringElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringElementProperties createStringElementProperties()
  {
    StringElementPropertiesImpl stringElementProperties = new StringElementPropertiesImpl();
    return stringElementProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringElementMaxlenAttribute createStringElementMaxlenAttribute()
  {
    StringElementMaxlenAttributeImpl stringElementMaxlenAttribute = new StringElementMaxlenAttributeImpl();
    return stringElementMaxlenAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleElement createDoubleElement()
  {
    DoubleElementImpl doubleElement = new DoubleElementImpl();
    return doubleElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongElement createLongElement()
  {
    LongElementImpl longElement = new LongElementImpl();
    return longElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateElement createDateElement()
  {
    DateElementImpl dateElement = new DateElementImpl();
    return dateElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartfieldElement createSmartfieldElement()
  {
    SmartfieldElementImpl smartfieldElement = new SmartfieldElementImpl();
    return smartfieldElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartFieldElementProperties createSmartFieldElementProperties()
  {
    SmartFieldElementPropertiesImpl smartFieldElementProperties = new SmartFieldElementPropertiesImpl();
    return smartFieldElementProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartfieldElementCodeAttribute createSmartfieldElementCodeAttribute()
  {
    SmartfieldElementCodeAttributeImpl smartfieldElementCodeAttribute = new SmartfieldElementCodeAttributeImpl();
    return smartfieldElementCodeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartfieldElementValueTypeAttribute createSmartfieldElementValueTypeAttribute()
  {
    SmartfieldElementValueTypeAttributeImpl smartfieldElementValueTypeAttribute = new SmartfieldElementValueTypeAttributeImpl();
    return smartfieldElementValueTypeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartfieldElementLookupAttribute createSmartfieldElementLookupAttribute()
  {
    SmartfieldElementLookupAttributeImpl smartfieldElementLookupAttribute = new SmartfieldElementLookupAttributeImpl();
    return smartfieldElementLookupAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ZregBoxElement createZregBoxElement()
  {
    ZregBoxElementImpl zregBoxElement = new ZregBoxElementImpl();
    return zregBoxElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanType createBooleanTypeFromString(EDataType eDataType, String initialValue)
  {
    BooleanType result = BooleanType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaRunAtAttributeList createJavaRunAtAttributeListFromString(EDataType eDataType, String initialValue)
  {
    JavaRunAtAttributeList result = JavaRunAtAttributeList.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJavaRunAtAttributeListToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicTypeAttributeList createLogicTypeAttributeListFromString(EDataType eDataType, String initialValue)
  {
    LogicTypeAttributeList result = LogicTypeAttributeList.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLogicTypeAttributeListToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SamlPackage getSamlPackage()
  {
    return (SamlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SamlPackage getPackage()
  {
    return SamlPackage.eINSTANCE;
  }

} //SamlFactoryImpl
