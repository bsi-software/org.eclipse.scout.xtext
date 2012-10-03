/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Field Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.FormFieldElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormFieldElement#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormFieldElement#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormFieldElement#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormFieldElement#getMaster <em>Master</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormFieldElement#getLogic <em>Logic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getFormFieldElement()
 * @model
 * @generated
 */
public interface FormFieldElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormFieldElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormFieldElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' reference.
   * @see #setText(TranslationElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormFieldElement_Text()
   * @model
   * @generated
   */
  TranslationElement getText();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormFieldElement#getText <em>Text</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' reference.
   * @see #getText()
   * @generated
   */
  void setText(TranslationElement value);

  /**
   * Returns the value of the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enabled</em>' attribute.
   * @see #setEnabled(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormFieldElement_Enabled()
   * @model
   * @generated
   */
  String getEnabled();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormFieldElement#getEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #getEnabled()
   * @generated
   */
  void setEnabled(String value);

  /**
   * Returns the value of the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visible</em>' attribute.
   * @see #setVisible(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormFieldElement_Visible()
   * @model
   * @generated
   */
  String getVisible();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormFieldElement#getVisible <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible</em>' attribute.
   * @see #getVisible()
   * @generated
   */
  void setVisible(String value);

  /**
   * Returns the value of the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Master</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Master</em>' reference.
   * @see #setMaster(ValueFieldElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormFieldElement_Master()
   * @model
   * @generated
   */
  ValueFieldElement getMaster();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormFieldElement#getMaster <em>Master</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Master</em>' reference.
   * @see #getMaster()
   * @generated
   */
  void setMaster(ValueFieldElement value);

  /**
   * Returns the value of the '<em><b>Logic</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.LogicElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logic</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormFieldElement_Logic()
   * @model containment="true"
   * @generated
   */
  EList<LogicElement> getLogic();

} // FormFieldElement
