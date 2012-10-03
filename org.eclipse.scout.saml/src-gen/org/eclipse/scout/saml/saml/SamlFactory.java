/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.scout.saml.saml.SamlPackage
 * @generated
 */
public interface SamlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SamlFactory eINSTANCE = org.eclipse.scout.saml.saml.impl.SamlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Module Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Element</em>'.
   * @generated
   */
  ModuleElement createModuleElement();

  /**
   * Returns a new object of class '<em>Import Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Element</em>'.
   * @generated
   */
  ImportElement createImportElement();

  /**
   * Returns a new object of class '<em>Translation Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Translation Element</em>'.
   * @generated
   */
  TranslationElement createTranslationElement();

  /**
   * Returns a new object of class '<em>Language Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Language Attribute</em>'.
   * @generated
   */
  LanguageAttribute createLanguageAttribute();

  /**
   * Returns a new object of class '<em>Logic Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logic Element</em>'.
   * @generated
   */
  LogicElement createLogicElement();

  /**
   * Returns a new object of class '<em>Code Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Code Element</em>'.
   * @generated
   */
  CodeElement createCodeElement();

  /**
   * Returns a new object of class '<em>Lookup Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lookup Element</em>'.
   * @generated
   */
  LookupElement createLookupElement();

  /**
   * Returns a new object of class '<em>Template Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template Element</em>'.
   * @generated
   */
  TemplateElement createTemplateElement();

  /**
   * Returns a new object of class '<em>Form Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form Element</em>'.
   * @generated
   */
  FormElement createFormElement();

  /**
   * Returns a new object of class '<em>Form Field Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form Field Element</em>'.
   * @generated
   */
  FormFieldElement createFormFieldElement();

  /**
   * Returns a new object of class '<em>Form Field Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form Field Properties</em>'.
   * @generated
   */
  FormFieldProperties createFormFieldProperties();

  /**
   * Returns a new object of class '<em>Composite Field Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Field Element</em>'.
   * @generated
   */
  CompositeFieldElement createCompositeFieldElement();

  /**
   * Returns a new object of class '<em>Sequence Box Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Box Element</em>'.
   * @generated
   */
  SequenceBoxElement createSequenceBoxElement();

  /**
   * Returns a new object of class '<em>Group Box Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Box Element</em>'.
   * @generated
   */
  GroupBoxElement createGroupBoxElement();

  /**
   * Returns a new object of class '<em>Value Field Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Field Element</em>'.
   * @generated
   */
  ValueFieldElement createValueFieldElement();

  /**
   * Returns a new object of class '<em>Value Field Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Field Properties</em>'.
   * @generated
   */
  ValueFieldProperties createValueFieldProperties();

  /**
   * Returns a new object of class '<em>String Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Element</em>'.
   * @generated
   */
  StringElement createStringElement();

  /**
   * Returns a new object of class '<em>Double Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Element</em>'.
   * @generated
   */
  DoubleElement createDoubleElement();

  /**
   * Returns a new object of class '<em>Long Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Long Element</em>'.
   * @generated
   */
  LongElement createLongElement();

  /**
   * Returns a new object of class '<em>Date Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Element</em>'.
   * @generated
   */
  DateElement createDateElement();

  /**
   * Returns a new object of class '<em>Smartfield Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Smartfield Element</em>'.
   * @generated
   */
  SmartfieldElement createSmartfieldElement();

  /**
   * Returns a new object of class '<em>Custom Field Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Field Element</em>'.
   * @generated
   */
  CustomFieldElement createCustomFieldElement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SamlPackage getSamlPackage();

} //SamlFactory
