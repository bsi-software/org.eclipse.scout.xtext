/**
 */
package org.eclipse.scout.saml.saml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.scout.saml.saml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.scout.saml.saml.SamlPackage
 * @generated
 */
public class SamlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SamlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SamlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SamlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SamlPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.ROOT_ELEMENT:
      {
        RootElement rootElement = (RootElement)theEObject;
        T result = caseRootElement(rootElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.ABSTRACT_SCOUT_TYPE:
      {
        AbstractScoutType abstractScoutType = (AbstractScoutType)theEObject;
        T result = caseAbstractScoutType(abstractScoutType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.ABSTRACT_FIELD_ELEMENT:
      {
        AbstractFieldElement abstractFieldElement = (AbstractFieldElement)theEObject;
        T result = caseAbstractFieldElement(abstractFieldElement);
        if (result == null) result = caseAbstractScoutType(abstractFieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES:
      {
        AbstractFieldProperties abstractFieldProperties = (AbstractFieldProperties)theEObject;
        T result = caseAbstractFieldProperties(abstractFieldProperties);
        if (result == null) result = caseAbstractValueFieldProperties(abstractFieldProperties);
        if (result == null) result = caseStringElementProperties(abstractFieldProperties);
        if (result == null) result = caseSmartFieldElementProperties(abstractFieldProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.TEXT_ATTRIBUTE:
      {
        TextAttribute textAttribute = (TextAttribute)theEObject;
        T result = caseTextAttribute(textAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.ENABLED_ATTRIBUE:
      {
        EnabledAttribue enabledAttribue = (EnabledAttribue)theEObject;
        T result = caseEnabledAttribue(enabledAttribue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.VISIBLE_ATTRIBUE:
      {
        VisibleAttribue visibleAttribue = (VisibleAttribue)theEObject;
        T result = caseVisibleAttribue(visibleAttribue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.MASTER_ATTRIBUTE:
      {
        MasterAttribute masterAttribute = (MasterAttribute)theEObject;
        T result = caseMasterAttribute(masterAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.ABSTRACT_VALUE_FIELD_ELEMENT:
      {
        AbstractValueFieldElement abstractValueFieldElement = (AbstractValueFieldElement)theEObject;
        T result = caseAbstractValueFieldElement(abstractValueFieldElement);
        if (result == null) result = caseAbstractFieldElement(abstractValueFieldElement);
        if (result == null) result = caseAbstractScoutType(abstractValueFieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES:
      {
        AbstractValueFieldProperties abstractValueFieldProperties = (AbstractValueFieldProperties)theEObject;
        T result = caseAbstractValueFieldProperties(abstractValueFieldProperties);
        if (result == null) result = caseStringElementProperties(abstractValueFieldProperties);
        if (result == null) result = caseSmartFieldElementProperties(abstractValueFieldProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.MANDATORY_ATTRIBUE:
      {
        MandatoryAttribue mandatoryAttribue = (MandatoryAttribue)theEObject;
        T result = caseMandatoryAttribue(mandatoryAttribue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.ABSTRACT_CONTAINER_FIELD_ELEMENT:
      {
        AbstractContainerFieldElement abstractContainerFieldElement = (AbstractContainerFieldElement)theEObject;
        T result = caseAbstractContainerFieldElement(abstractContainerFieldElement);
        if (result == null) result = caseAbstractFieldElement(abstractContainerFieldElement);
        if (result == null) result = caseAbstractScoutType(abstractContainerFieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.MODULE_ELEMENT:
      {
        ModuleElement moduleElement = (ModuleElement)theEObject;
        T result = caseModuleElement(moduleElement);
        if (result == null) result = caseRootElement(moduleElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.TRANSLATION_ELEMENT:
      {
        TranslationElement translationElement = (TranslationElement)theEObject;
        T result = caseTranslationElement(translationElement);
        if (result == null) result = caseRootElement(translationElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.TRANSLATION_ATTRIBUTE:
      {
        TranslationAttribute translationAttribute = (TranslationAttribute)theEObject;
        T result = caseTranslationAttribute(translationAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.JAVA_ELEMENT:
      {
        JavaElement javaElement = (JavaElement)theEObject;
        T result = caseJavaElement(javaElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.RUN_AT_ATTRIBUTE:
      {
        RunAtAttribute runAtAttribute = (RunAtAttribute)theEObject;
        T result = caseRunAtAttribute(runAtAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.CODE_ELEMENT:
      {
        CodeElement codeElement = (CodeElement)theEObject;
        T result = caseCodeElement(codeElement);
        if (result == null) result = caseRootElement(codeElement);
        if (result == null) result = caseAbstractScoutType(codeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.CODE_ID_ATTRIBUTE:
      {
        CodeIdAttribute codeIdAttribute = (CodeIdAttribute)theEObject;
        T result = caseCodeIdAttribute(codeIdAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LOGIC_ELEMENT:
      {
        LogicElement logicElement = (LogicElement)theEObject;
        T result = caseLogicElement(logicElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LOGIC_OPTIONAL_PROPERTIES:
      {
        LogicOptionalProperties logicOptionalProperties = (LogicOptionalProperties)theEObject;
        T result = caseLogicOptionalProperties(logicOptionalProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LOGIC_TYPE_ATTRIBUTE:
      {
        LogicTypeAttribute logicTypeAttribute = (LogicTypeAttribute)theEObject;
        T result = caseLogicTypeAttribute(logicTypeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LOGIC_EXEC_ATTRIBUTE:
      {
        LogicExecAttribute logicExecAttribute = (LogicExecAttribute)theEObject;
        T result = caseLogicExecAttribute(logicExecAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LOOKUP_ELEMENT:
      {
        LookupElement lookupElement = (LookupElement)theEObject;
        T result = caseLookupElement(lookupElement);
        if (result == null) result = caseRootElement(lookupElement);
        if (result == null) result = caseAbstractScoutType(lookupElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.TEMPLATE_ELEMENT:
      {
        TemplateElement templateElement = (TemplateElement)theEObject;
        T result = caseTemplateElement(templateElement);
        if (result == null) result = caseRootElement(templateElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.TEMPLATE_ELEMENT_CLASS_ATTRIBUTE:
      {
        TemplateElementClassAttribute templateElementClassAttribute = (TemplateElementClassAttribute)theEObject;
        T result = caseTemplateElementClassAttribute(templateElementClassAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.TEMPLATE_ELEMENT_REPLACES_ATTRIBUTE:
      {
        TemplateElementReplacesAttribute templateElementReplacesAttribute = (TemplateElementReplacesAttribute)theEObject;
        T result = caseTemplateElementReplacesAttribute(templateElementReplacesAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.FORM_ELEMENT:
      {
        FormElement formElement = (FormElement)theEObject;
        T result = caseFormElement(formElement);
        if (result == null) result = caseRootElement(formElement);
        if (result == null) result = caseAbstractScoutType(formElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.FORM_ELEMENT_MODAL_ATTRIBUTE:
      {
        FormElementModalAttribute formElementModalAttribute = (FormElementModalAttribute)theEObject;
        T result = caseFormElementModalAttribute(formElementModalAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.FORM_ELEMENT_COLUMNS_ATTRIBUTE:
      {
        FormElementColumnsAttribute formElementColumnsAttribute = (FormElementColumnsAttribute)theEObject;
        T result = caseFormElementColumnsAttribute(formElementColumnsAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.SEQUENCE_BOX_ELEMENT:
      {
        SequenceBoxElement sequenceBoxElement = (SequenceBoxElement)theEObject;
        T result = caseSequenceBoxElement(sequenceBoxElement);
        if (result == null) result = caseAbstractContainerFieldElement(sequenceBoxElement);
        if (result == null) result = caseAbstractFieldElement(sequenceBoxElement);
        if (result == null) result = caseAbstractScoutType(sequenceBoxElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.STRING_ELEMENT:
      {
        StringElement stringElement = (StringElement)theEObject;
        T result = caseStringElement(stringElement);
        if (result == null) result = caseAbstractValueFieldElement(stringElement);
        if (result == null) result = caseAbstractFieldElement(stringElement);
        if (result == null) result = caseAbstractScoutType(stringElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.STRING_ELEMENT_PROPERTIES:
      {
        StringElementProperties stringElementProperties = (StringElementProperties)theEObject;
        T result = caseStringElementProperties(stringElementProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.STRING_ELEMENT_MAXLEN_ATTRIBUTE:
      {
        StringElementMaxlenAttribute stringElementMaxlenAttribute = (StringElementMaxlenAttribute)theEObject;
        T result = caseStringElementMaxlenAttribute(stringElementMaxlenAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.DOUBLE_ELEMENT:
      {
        DoubleElement doubleElement = (DoubleElement)theEObject;
        T result = caseDoubleElement(doubleElement);
        if (result == null) result = caseAbstractValueFieldElement(doubleElement);
        if (result == null) result = caseAbstractFieldElement(doubleElement);
        if (result == null) result = caseAbstractScoutType(doubleElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LONG_ELEMENT:
      {
        LongElement longElement = (LongElement)theEObject;
        T result = caseLongElement(longElement);
        if (result == null) result = caseAbstractValueFieldElement(longElement);
        if (result == null) result = caseAbstractFieldElement(longElement);
        if (result == null) result = caseAbstractScoutType(longElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.DATE_ELEMENT:
      {
        DateElement dateElement = (DateElement)theEObject;
        T result = caseDateElement(dateElement);
        if (result == null) result = caseAbstractValueFieldElement(dateElement);
        if (result == null) result = caseAbstractFieldElement(dateElement);
        if (result == null) result = caseAbstractScoutType(dateElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.SMARTFIELD_ELEMENT:
      {
        SmartfieldElement smartfieldElement = (SmartfieldElement)theEObject;
        T result = caseSmartfieldElement(smartfieldElement);
        if (result == null) result = caseAbstractValueFieldElement(smartfieldElement);
        if (result == null) result = caseAbstractFieldElement(smartfieldElement);
        if (result == null) result = caseAbstractScoutType(smartfieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES:
      {
        SmartFieldElementProperties smartFieldElementProperties = (SmartFieldElementProperties)theEObject;
        T result = caseSmartFieldElementProperties(smartFieldElementProperties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.SMARTFIELD_ELEMENT_CODE_ATTRIBUTE:
      {
        SmartfieldElementCodeAttribute smartfieldElementCodeAttribute = (SmartfieldElementCodeAttribute)theEObject;
        T result = caseSmartfieldElementCodeAttribute(smartfieldElementCodeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.SMARTFIELD_ELEMENT_VALUE_TYPE_ATTRIBUTE:
      {
        SmartfieldElementValueTypeAttribute smartfieldElementValueTypeAttribute = (SmartfieldElementValueTypeAttribute)theEObject;
        T result = caseSmartfieldElementValueTypeAttribute(smartfieldElementValueTypeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.SMARTFIELD_ELEMENT_LOOKUP_ATTRIBUTE:
      {
        SmartfieldElementLookupAttribute smartfieldElementLookupAttribute = (SmartfieldElementLookupAttribute)theEObject;
        T result = caseSmartfieldElementLookupAttribute(smartfieldElementLookupAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.ZREG_BOX_ELEMENT:
      {
        ZregBoxElement zregBoxElement = (ZregBoxElement)theEObject;
        T result = caseZregBoxElement(zregBoxElement);
        if (result == null) result = caseAbstractValueFieldElement(zregBoxElement);
        if (result == null) result = caseAbstractFieldElement(zregBoxElement);
        if (result == null) result = caseAbstractScoutType(zregBoxElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRootElement(RootElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Scout Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Scout Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractScoutType(AbstractScoutType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Field Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Field Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractFieldElement(AbstractFieldElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Field Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Field Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractFieldProperties(AbstractFieldProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextAttribute(TextAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enabled Attribue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enabled Attribue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnabledAttribue(EnabledAttribue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visible Attribue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visible Attribue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisibleAttribue(VisibleAttribue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Master Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Master Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMasterAttribute(MasterAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Value Field Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Value Field Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractValueFieldElement(AbstractValueFieldElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Value Field Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Value Field Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractValueFieldProperties(AbstractValueFieldProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mandatory Attribue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mandatory Attribue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMandatoryAttribue(MandatoryAttribue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Container Field Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Container Field Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractContainerFieldElement(AbstractContainerFieldElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleElement(ModuleElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Translation Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Translation Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTranslationElement(TranslationElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Translation Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Translation Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTranslationAttribute(TranslationAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Java Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Java Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJavaElement(JavaElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Run At Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Run At Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRunAtAttribute(RunAtAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Code Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Code Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCodeElement(CodeElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Code Id Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Code Id Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCodeIdAttribute(CodeIdAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logic Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logic Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicElement(LogicElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logic Optional Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logic Optional Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicOptionalProperties(LogicOptionalProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logic Type Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logic Type Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicTypeAttribute(LogicTypeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logic Exec Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logic Exec Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicExecAttribute(LogicExecAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lookup Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lookup Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLookupElement(LookupElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateElement(TemplateElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Element Class Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Element Class Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateElementClassAttribute(TemplateElementClassAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Element Replaces Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Element Replaces Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateElementReplacesAttribute(TemplateElementReplacesAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormElement(FormElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form Element Modal Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form Element Modal Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormElementModalAttribute(FormElementModalAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form Element Columns Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form Element Columns Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormElementColumnsAttribute(FormElementColumnsAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Box Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Box Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceBoxElement(SequenceBoxElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringElement(StringElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Element Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Element Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringElementProperties(StringElementProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Element Maxlen Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Element Maxlen Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringElementMaxlenAttribute(StringElementMaxlenAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleElement(DoubleElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Long Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Long Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLongElement(LongElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateElement(DateElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Smartfield Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Smartfield Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmartfieldElement(SmartfieldElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Smart Field Element Properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Smart Field Element Properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmartFieldElementProperties(SmartFieldElementProperties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Smartfield Element Code Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Smartfield Element Code Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmartfieldElementCodeAttribute(SmartfieldElementCodeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Smartfield Element Value Type Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Smartfield Element Value Type Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmartfieldElementValueTypeAttribute(SmartfieldElementValueTypeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Smartfield Element Lookup Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Smartfield Element Lookup Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSmartfieldElementLookupAttribute(SmartfieldElementLookupAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Zreg Box Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zreg Box Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseZregBoxElement(ZregBoxElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SamlSwitch
