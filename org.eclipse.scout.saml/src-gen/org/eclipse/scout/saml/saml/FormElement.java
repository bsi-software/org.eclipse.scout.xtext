/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getModal <em>Modal</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement()
 * @model
 * @generated
 */
public interface FormElement extends RootElement, AbstractScoutType
{
  /**
   * Returns the value of the '<em><b>Modal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modal</em>' containment reference.
   * @see #setModal(FormElementModalAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Modal()
   * @model containment="true"
   * @generated
   */
  FormElementModalAttribute getModal();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormElement#getModal <em>Modal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modal</em>' containment reference.
   * @see #getModal()
   * @generated
   */
  void setModal(FormElementModalAttribute value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(TextAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Text()
   * @model containment="true"
   * @generated
   */
  TextAttribute getText();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormElement#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(TextAttribute value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference.
   * @see #setColumns(FormElementColumnsAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Columns()
   * @model containment="true"
   * @generated
   */
  FormElementColumnsAttribute getColumns();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormElement#getColumns <em>Columns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columns</em>' containment reference.
   * @see #getColumns()
   * @generated
   */
  void setColumns(FormElementColumnsAttribute value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Elements()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getElements();

} // FormElement
