/**
 */
package org.eclipse.scout.saml.saml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.scout.saml.saml.*;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;

import org.eclipse.xtext.xbase.XExpression;

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
      case SamlPackage.JAVA_CODE_ELEMENT:
      {
        JavaCodeElement javaCodeElement = (JavaCodeElement)theEObject;
        T result = caseJavaCodeElement(javaCodeElement);
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
      case SamlPackage.LOOKUP_ELEMENT:
      {
        LookupElement lookupElement = (LookupElement)theEObject;
        T result = caseLookupElement(lookupElement);
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
      case SamlPackage.CONTROL_ELEMENT:
      {
        ControlElement controlElement = (ControlElement)theEObject;
        T result = caseControlElement(controlElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.CONTROL_ELEMENT_RULE:
      {
        ControlElementRule controlElementRule = (ControlElementRule)theEObject;
        T result = caseControlElementRule(controlElementRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.COMPOSITE_ELEMENT:
      {
        CompositeElement compositeElement = (CompositeElement)theEObject;
        T result = caseCompositeElement(compositeElement);
        if (result == null) result = caseControlElement(compositeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.COMPOSITE_ELEMENT_RULE:
      {
        CompositeElementRule compositeElementRule = (CompositeElementRule)theEObject;
        T result = caseCompositeElementRule(compositeElementRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LEAF_ELEMENT:
      {
        LeafElement leafElement = (LeafElement)theEObject;
        T result = caseLeafElement(leafElement);
        if (result == null) result = caseControlElement(leafElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.STRING_ELEMENT:
      {
        StringElement stringElement = (StringElement)theEObject;
        T result = caseStringElement(stringElement);
        if (result == null) result = caseLeafElement(stringElement);
        if (result == null) result = caseControlElement(stringElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.DOUBLE_ELEMENT:
      {
        DoubleElement doubleElement = (DoubleElement)theEObject;
        T result = caseDoubleElement(doubleElement);
        if (result == null) result = caseLeafElement(doubleElement);
        if (result == null) result = caseControlElement(doubleElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.LONG_ELEMENT:
      {
        LongElement longElement = (LongElement)theEObject;
        T result = caseLongElement(longElement);
        if (result == null) result = caseLeafElement(longElement);
        if (result == null) result = caseControlElement(longElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.SEQUENCE_BOX_ELEMENT:
      {
        SequenceBoxElement sequenceBoxElement = (SequenceBoxElement)theEObject;
        T result = caseSequenceBoxElement(sequenceBoxElement);
        if (result == null) result = caseCompositeElement(sequenceBoxElement);
        if (result == null) result = caseControlElement(sequenceBoxElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.XBLOCK_EXPRESSION:
      {
        XBlockExpression xBlockExpression = (XBlockExpression)theEObject;
        T result = caseXBlockExpression(xBlockExpression);
        if (result == null) result = caseXbase_XBlockExpression(xBlockExpression);
        if (result == null) result = caseXExpression(xBlockExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.XVARIABLE_DECLARATION:
      {
        XVariableDeclaration xVariableDeclaration = (XVariableDeclaration)theEObject;
        T result = caseXVariableDeclaration(xVariableDeclaration);
        if (result == null) result = caseXbase_XVariableDeclaration(xVariableDeclaration);
        if (result == null) result = caseXExpression(xVariableDeclaration);
        if (result == null) result = caseJvmIdentifiableElement(xVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SamlPackage.XTYPE_LITERAL:
      {
        XTypeLiteral xTypeLiteral = (XTypeLiteral)theEObject;
        T result = caseXTypeLiteral(xTypeLiteral);
        if (result == null) result = caseXbase_XTypeLiteral(xTypeLiteral);
        if (result == null) result = caseXExpression(xTypeLiteral);
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
   * Returns the result of interpreting the object as an instance of '<em>Java Code Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Java Code Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJavaCodeElement(JavaCodeElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Control Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControlElement(ControlElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Element Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Element Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControlElementRule(ControlElementRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeElement(CompositeElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Element Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Element Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeElementRule(CompositeElementRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leaf Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leaf Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeafElement(LeafElement object)
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
   * Returns the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXBlockExpression(XBlockExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XVariable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XVariable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXVariableDeclaration(XVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XType Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XType Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXTypeLiteral(XTypeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression(XExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXbase_XBlockExpression(org.eclipse.xtext.xbase.XBlockExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jvm Identifiable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jvm Identifiable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJvmIdentifiableElement(JvmIdentifiableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XVariable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XVariable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXbase_XVariableDeclaration(org.eclipse.xtext.xbase.XVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XType Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XType Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXbase_XTypeLiteral(org.eclipse.xtext.xbase.XTypeLiteral object)
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
