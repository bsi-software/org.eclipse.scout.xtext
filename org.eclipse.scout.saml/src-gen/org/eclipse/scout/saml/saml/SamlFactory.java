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
   * Returns a new object of class '<em>Java Code Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Java Code Element</em>'.
   * @generated
   */
  JavaCodeElement createJavaCodeElement();

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
   * Returns a new object of class '<em>Lookup Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lookup Element</em>'.
   * @generated
   */
  LookupElement createLookupElement();

  /**
   * Returns a new object of class '<em>Form Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form Element</em>'.
   * @generated
   */
  FormElement createFormElement();

  /**
   * Returns a new object of class '<em>Control Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Element</em>'.
   * @generated
   */
  ControlElement createControlElement();

  /**
   * Returns a new object of class '<em>Control Element Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Element Rule</em>'.
   * @generated
   */
  ControlElementRule createControlElementRule();

  /**
   * Returns a new object of class '<em>Composite Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Element</em>'.
   * @generated
   */
  CompositeElement createCompositeElement();

  /**
   * Returns a new object of class '<em>Composite Element Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Element Rule</em>'.
   * @generated
   */
  CompositeElementRule createCompositeElementRule();

  /**
   * Returns a new object of class '<em>Leaf Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Leaf Element</em>'.
   * @generated
   */
  LeafElement createLeafElement();

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
   * Returns a new object of class '<em>Sequence Box Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Box Element</em>'.
   * @generated
   */
  SequenceBoxElement createSequenceBoxElement();

  /**
   * Returns a new object of class '<em>XBlock Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XBlock Expression</em>'.
   * @generated
   */
  XBlockExpression createXBlockExpression();

  /**
   * Returns a new object of class '<em>XVariable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XVariable Declaration</em>'.
   * @generated
   */
  XVariableDeclaration createXVariableDeclaration();

  /**
   * Returns a new object of class '<em>XType Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XType Literal</em>'.
   * @generated
   */
  XTypeLiteral createXTypeLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SamlPackage getSamlPackage();

} //SamlFactory
