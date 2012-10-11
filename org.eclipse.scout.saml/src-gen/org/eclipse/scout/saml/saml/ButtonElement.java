/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.ButtonElement#getProcessButton <em>Process Button</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ButtonElement#getMenus <em>Menus</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getButtonElement()
 * @model
 * @generated
 */
public interface ButtonElement extends FormFieldElement
{
  /**
   * Returns the value of the '<em><b>Process Button</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process Button</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Button</em>' attribute.
   * @see #setProcessButton(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getButtonElement_ProcessButton()
   * @model
   * @generated
   */
  String getProcessButton();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ButtonElement#getProcessButton <em>Process Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process Button</em>' attribute.
   * @see #getProcessButton()
   * @generated
   */
  void setProcessButton(String value);

  /**
   * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.MenuElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menus</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getButtonElement_Menus()
   * @model containment="true"
   * @generated
   */
  EList<MenuElement> getMenus();

} // ButtonElement
