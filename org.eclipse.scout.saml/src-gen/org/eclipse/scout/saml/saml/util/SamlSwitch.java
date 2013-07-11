/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.scout.saml.saml.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
public class SamlSwitch<T>
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
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
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
        if (result == null) result = caseNamedTypeElement(codeElement);
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
        if (result == null) result = caseNamedTypeElement(formElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.FORM_FIELD_ELEMENT:
      {
        FormFieldElement formFieldElement = (FormFieldElement)theEObject;
        T result = caseFormFieldElement(formFieldElement);
        if (result == null) result = caseNamedTypeElement(formFieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.NAMED_TYPE_ELEMENT:
      {
        NamedTypeElement namedTypeElement = (NamedTypeElement)theEObject;
        T result = caseNamedTypeElement(namedTypeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.COMPOSITE_FIELD_ELEMENT:
      {
        CompositeFieldElement compositeFieldElement = (CompositeFieldElement)theEObject;
        T result = caseCompositeFieldElement(compositeFieldElement);
        if (result == null) result = caseFormFieldElement(compositeFieldElement);
        if (result == null) result = caseNamedTypeElement(compositeFieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.SEQUENCE_BOX_ELEMENT:
      {
        SequenceBoxElement sequenceBoxElement = (SequenceBoxElement)theEObject;
        T result = caseSequenceBoxElement(sequenceBoxElement);
        if (result == null) result = caseCompositeFieldElement(sequenceBoxElement);
        if (result == null) result = caseFormFieldElement(sequenceBoxElement);
        if (result == null) result = caseNamedTypeElement(sequenceBoxElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.GROUP_BOX_ELEMENT:
      {
        GroupBoxElement groupBoxElement = (GroupBoxElement)theEObject;
        T result = caseGroupBoxElement(groupBoxElement);
        if (result == null) result = caseCompositeFieldElement(groupBoxElement);
        if (result == null) result = caseFormFieldElement(groupBoxElement);
        if (result == null) result = caseNamedTypeElement(groupBoxElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.GENERIC_VALUE_FIELD_ELEMENT:
      {
        GenericValueFieldElement genericValueFieldElement = (GenericValueFieldElement)theEObject;
        T result = caseGenericValueFieldElement(genericValueFieldElement);
        if (result == null) result = caseValueFieldElement(genericValueFieldElement);
        if (result == null) result = caseFormFieldElement(genericValueFieldElement);
        if (result == null) result = caseNamedTypeElement(genericValueFieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.VALUE_FIELD_ELEMENT:
      {
        ValueFieldElement valueFieldElement = (ValueFieldElement)theEObject;
        T result = caseValueFieldElement(valueFieldElement);
        if (result == null) result = caseFormFieldElement(valueFieldElement);
        if (result == null) result = caseNamedTypeElement(valueFieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.STRING_ELEMENT:
      {
        StringElement stringElement = (StringElement)theEObject;
        T result = caseStringElement(stringElement);
        if (result == null) result = caseValueFieldElement(stringElement);
        if (result == null) result = caseFormFieldElement(stringElement);
        if (result == null) result = caseNamedTypeElement(stringElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LABEL_ELEMENT:
      {
        LabelElement labelElement = (LabelElement)theEObject;
        T result = caseLabelElement(labelElement);
        if (result == null) result = caseValueFieldElement(labelElement);
        if (result == null) result = caseFormFieldElement(labelElement);
        if (result == null) result = caseNamedTypeElement(labelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.BIG_DECIMAL_ELEMENT:
      {
        BigDecimalElement bigDecimalElement = (BigDecimalElement)theEObject;
        T result = caseBigDecimalElement(bigDecimalElement);
        if (result == null) result = caseValueFieldElement(bigDecimalElement);
        if (result == null) result = caseFormFieldElement(bigDecimalElement);
        if (result == null) result = caseNamedTypeElement(bigDecimalElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LONG_ELEMENT:
      {
        LongElement longElement = (LongElement)theEObject;
        T result = caseLongElement(longElement);
        if (result == null) result = caseValueFieldElement(longElement);
        if (result == null) result = caseFormFieldElement(longElement);
        if (result == null) result = caseNamedTypeElement(longElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.DATE_ELEMENT:
      {
        DateElement dateElement = (DateElement)theEObject;
        T result = caseDateElement(dateElement);
        if (result == null) result = caseValueFieldElement(dateElement);
        if (result == null) result = caseFormFieldElement(dateElement);
        if (result == null) result = caseNamedTypeElement(dateElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.SMARTFIELD_ELEMENT:
      {
        SmartfieldElement smartfieldElement = (SmartfieldElement)theEObject;
        T result = caseSmartfieldElement(smartfieldElement);
        if (result == null) result = caseGenericValueFieldElement(smartfieldElement);
        if (result == null) result = caseValueFieldElement(smartfieldElement);
        if (result == null) result = caseFormFieldElement(smartfieldElement);
        if (result == null) result = caseNamedTypeElement(smartfieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LIST_BOX_ELEMENT:
      {
        ListBoxElement listBoxElement = (ListBoxElement)theEObject;
        T result = caseListBoxElement(listBoxElement);
        if (result == null) result = caseGenericValueFieldElement(listBoxElement);
        if (result == null) result = caseValueFieldElement(listBoxElement);
        if (result == null) result = caseFormFieldElement(listBoxElement);
        if (result == null) result = caseNamedTypeElement(listBoxElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.CUSTOM_FIELD_ELEMENT:
      {
        CustomFieldElement customFieldElement = (CustomFieldElement)theEObject;
        T result = caseCustomFieldElement(customFieldElement);
        if (result == null) result = caseFormFieldElement(customFieldElement);
        if (result == null) result = caseNamedTypeElement(customFieldElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.BUTTON_ELEMENT:
      {
        ButtonElement buttonElement = (ButtonElement)theEObject;
        T result = caseButtonElement(buttonElement);
        if (result == null) result = caseFormFieldElement(buttonElement);
        if (result == null) result = caseNamedTypeElement(buttonElement);
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
        if (result == null) result = caseNamedTypeElement(tableElement);
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
      case SamlPackage.KEY_ELEMENT:
      {
        KeyElement keyElement = (KeyElement)theEObject;
        T result = caseKeyElement(keyElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.TAB_ELEMENT:
      {
        TabElement tabElement = (TabElement)theEObject;
        T result = caseTabElement(tabElement);
        if (result == null) result = caseCompositeFieldElement(tabElement);
        if (result == null) result = caseFormFieldElement(tabElement);
        if (result == null) result = caseNamedTypeElement(tabElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.TAB_BOX_ELEMENT:
      {
        TabBoxElement tabBoxElement = (TabBoxElement)theEObject;
        T result = caseTabBoxElement(tabBoxElement);
        if (result == null) result = caseFormFieldElement(tabBoxElement);
        if (result == null) result = caseNamedTypeElement(tabBoxElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.CHECKBOX_ELEMENT:
      {
        CheckboxElement checkboxElement = (CheckboxElement)theEObject;
        T result = caseCheckboxElement(checkboxElement);
        if (result == null) result = caseValueFieldElement(checkboxElement);
        if (result == null) result = caseFormFieldElement(checkboxElement);
        if (result == null) result = caseNamedTypeElement(checkboxElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.FILE_CHOOSER_ELEMENT:
      {
        FileChooserElement fileChooserElement = (FileChooserElement)theEObject;
        T result = caseFileChooserElement(fileChooserElement);
        if (result == null) result = caseValueFieldElement(fileChooserElement);
        if (result == null) result = caseFormFieldElement(fileChooserElement);
        if (result == null) result = caseNamedTypeElement(fileChooserElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.RADIO_GROUP_ELEMENT:
      {
        RadioGroupElement radioGroupElement = (RadioGroupElement)theEObject;
        T result = caseRadioGroupElement(radioGroupElement);
        if (result == null) result = caseGenericValueFieldElement(radioGroupElement);
        if (result == null) result = caseValueFieldElement(radioGroupElement);
        if (result == null) result = caseFormFieldElement(radioGroupElement);
        if (result == null) result = caseNamedTypeElement(radioGroupElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.RADIO_BUTTON_ELEMENT:
      {
        RadioButtonElement radioButtonElement = (RadioButtonElement)theEObject;
        T result = caseRadioButtonElement(radioButtonElement);
        if (result == null) result = caseNamedTypeElement(radioButtonElement);
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
   * Returns the result of interpreting the object as an instance of '<em>Named Type Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Type Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedTypeElement(NamedTypeElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Generic Value Field Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Value Field Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericValueFieldElement(GenericValueFieldElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Label Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelElement(LabelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Big Decimal Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Big Decimal Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBigDecimalElement(BigDecimalElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>List Box Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Box Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListBoxElement(ListBoxElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Key Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyElement(KeyElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabElement(TabElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Box Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Box Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabBoxElement(TabBoxElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Checkbox Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Checkbox Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckboxElement(CheckboxElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Chooser Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Chooser Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFileChooserElement(FileChooserElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Radio Group Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Radio Group Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRadioGroupElement(RadioGroupElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Radio Button Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Radio Button Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRadioButtonElement(RadioButtonElement object)
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SamlSwitch
