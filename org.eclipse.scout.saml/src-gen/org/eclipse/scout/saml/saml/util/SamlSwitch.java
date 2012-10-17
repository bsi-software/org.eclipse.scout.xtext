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
      case SamlPackage.MODULE_ELEMENT:
      {
        ModuleElement moduleElement = (ModuleElement)theEObject;
        T result = caseModuleElement(moduleElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.IMPORT_ELEMENT:
      {
        ImportElement importElement = (ImportElement)theEObject;
        T result = caseImportElement(importElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.TRANSLATION_ELEMENT:
      {
        TranslationElement translationElement = (TranslationElement)theEObject;
        T result = caseTranslationElement(translationElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LANGUAGE_ATTRIBUTE:
      {
        LanguageAttribute languageAttribute = (LanguageAttribute)theEObject;
        T result = caseLanguageAttribute(languageAttribute);
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
      case SamlPackage.CODE_ELEMENT:
      {
        CodeElement codeElement = (CodeElement)theEObject;
        T result = caseCodeElement(codeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LOOKUP_ELEMENT:
      {
        LookupElement lookupElement = (LookupElement)theEObject;
        T result = caseLookupElement(lookupElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.TEMPLATE_ELEMENT:
      {
        TemplateElement templateElement = (TemplateElement)theEObject;
        T result = caseTemplateElement(templateElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.FORM_ELEMENT:
      {
        FormElement formElement = (FormElement)theEObject;
        T result = caseFormElement(formElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.FORM_FIELD_ELEMENT:
      {
        FormFieldElement formFieldElement = (FormFieldElement)theEObject;
        T result = caseFormFieldElement(formFieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.COMPOSITE_FIELD_ELEMENT:
      {
        CompositeFieldElement compositeFieldElement = (CompositeFieldElement)theEObject;
        T result = caseCompositeFieldElement(compositeFieldElement);
        if (result == null) result = caseFormFieldElement(compositeFieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.SEQUENCE_BOX_ELEMENT:
      {
        SequenceBoxElement sequenceBoxElement = (SequenceBoxElement)theEObject;
        T result = caseSequenceBoxElement(sequenceBoxElement);
        if (result == null) result = caseCompositeFieldElement(sequenceBoxElement);
        if (result == null) result = caseFormFieldElement(sequenceBoxElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.GROUP_BOX_ELEMENT:
      {
        GroupBoxElement groupBoxElement = (GroupBoxElement)theEObject;
        T result = caseGroupBoxElement(groupBoxElement);
        if (result == null) result = caseCompositeFieldElement(groupBoxElement);
        if (result == null) result = caseFormFieldElement(groupBoxElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.VALUE_FIELD_ELEMENT:
      {
        ValueFieldElement valueFieldElement = (ValueFieldElement)theEObject;
        T result = caseValueFieldElement(valueFieldElement);
        if (result == null) result = caseFormFieldElement(valueFieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.STRING_ELEMENT:
      {
        StringElement stringElement = (StringElement)theEObject;
        T result = caseStringElement(stringElement);
        if (result == null) result = caseValueFieldElement(stringElement);
        if (result == null) result = caseFormFieldElement(stringElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.DOUBLE_ELEMENT:
      {
        DoubleElement doubleElement = (DoubleElement)theEObject;
        T result = caseDoubleElement(doubleElement);
        if (result == null) result = caseValueFieldElement(doubleElement);
        if (result == null) result = caseFormFieldElement(doubleElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LONG_ELEMENT:
      {
        LongElement longElement = (LongElement)theEObject;
        T result = caseLongElement(longElement);
        if (result == null) result = caseValueFieldElement(longElement);
        if (result == null) result = caseFormFieldElement(longElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.DATE_ELEMENT:
      {
        DateElement dateElement = (DateElement)theEObject;
        T result = caseDateElement(dateElement);
        if (result == null) result = caseValueFieldElement(dateElement);
        if (result == null) result = caseFormFieldElement(dateElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.SMARTFIELD_ELEMENT:
      {
        SmartfieldElement smartfieldElement = (SmartfieldElement)theEObject;
        T result = caseSmartfieldElement(smartfieldElement);
        if (result == null) result = caseValueFieldElement(smartfieldElement);
        if (result == null) result = caseFormFieldElement(smartfieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.CUSTOM_FIELD_ELEMENT:
      {
        CustomFieldElement customFieldElement = (CustomFieldElement)theEObject;
        T result = caseCustomFieldElement(customFieldElement);
        if (result == null) result = caseFormFieldElement(customFieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.BUTTON_ELEMENT:
      {
        ButtonElement buttonElement = (ButtonElement)theEObject;
        T result = caseButtonElement(buttonElement);
        if (result == null) result = caseFormFieldElement(buttonElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.MENU_ELEMENT:
      {
        MenuElement menuElement = (MenuElement)theEObject;
        T result = caseMenuElement(menuElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.TABLE_ELEMENT:
      {
        TableElement tableElement = (TableElement)theEObject;
        T result = caseTableElement(tableElement);
        if (result == null) result = caseFormFieldElement(tableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.COLUMN_ELEMENT:
      {
        ColumnElement columnElement = (ColumnElement)theEObject;
        T result = caseColumnElement(columnElement);
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
   * Returns the result of interpreting the object as an instance of '<em>Import Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportElement(ImportElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Language Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguageAttribute(LanguageAttribute object)
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
   * Returns the result of interpreting the object as an instance of '<em>Form Field Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form Field Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormFieldElement(FormFieldElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Field Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Field Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeFieldElement(CompositeFieldElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Group Box Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Box Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupBoxElement(GroupBoxElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Field Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Field Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueFieldElement(ValueFieldElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Custom Field Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Field Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomFieldElement(CustomFieldElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButtonElement(ButtonElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Menu Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Menu Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMenuElement(MenuElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableElement(TableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Column Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Column Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColumnElement(ColumnElement object)
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
