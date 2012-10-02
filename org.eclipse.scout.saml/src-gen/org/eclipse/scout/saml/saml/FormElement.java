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
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getModal <em>Modal</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getLogic <em>Logic</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement()
 * @model
 * @generated
 */
public interface FormElement extends EObject
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Modal</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.scout.saml.saml.BooleanType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modal</em>' attribute.
   * @see org.eclipse.scout.saml.saml.BooleanType
   * @see #setModal(BooleanType)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Modal()
   * @model
   * @generated
   */
  BooleanType getModal();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormElement#getModal <em>Modal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modal</em>' attribute.
   * @see org.eclipse.scout.saml.saml.BooleanType
   * @see #getModal()
   * @generated
   */
  void setModal(BooleanType value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' attribute.
   * @see #setColumns(int)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Columns()
   * @model
   * @generated
   */
  int getColumns();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormElement#getColumns <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columns</em>' attribute.
   * @see #getColumns()
   * @generated
   */
  void setColumns(int value);

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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Logic()
   * @model containment="true"
   * @generated
   */
  EList<LogicElement> getLogic();

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.ControlElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Fields()
   * @model containment="true"
   * @generated
   */
  EList<ControlElement> getFields();

} // FormElement
