/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Element Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.ControlElementRule#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ControlElementRule#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ControlElementRule#getVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getControlElementRule()
 * @model
 * @generated
 */
public interface ControlElementRule extends EObject
{
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getControlElementRule_Text()
   * @model
   * @generated
   */
  TranslationElement getText();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ControlElementRule#getText <em>Text</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' reference.
   * @see #getText()
   * @generated
   */
  void setText(TranslationElement value);

  /**
   * Returns the value of the '<em><b>Enabled</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.scout.saml.saml.BooleanType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enabled</em>' attribute.
   * @see org.eclipse.scout.saml.saml.BooleanType
   * @see #setEnabled(BooleanType)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getControlElementRule_Enabled()
   * @model
   * @generated
   */
  BooleanType getEnabled();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ControlElementRule#getEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see org.eclipse.scout.saml.saml.BooleanType
   * @see #getEnabled()
   * @generated
   */
  void setEnabled(BooleanType value);

  /**
   * Returns the value of the '<em><b>Visible</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.scout.saml.saml.BooleanType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visible</em>' attribute.
   * @see org.eclipse.scout.saml.saml.BooleanType
   * @see #setVisible(BooleanType)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getControlElementRule_Visible()
   * @model
   * @generated
   */
  BooleanType getVisible();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ControlElementRule#getVisible <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible</em>' attribute.
   * @see org.eclipse.scout.saml.saml.BooleanType
   * @see #getVisible()
   * @generated
   */
  void setVisible(BooleanType value);

} // ControlElementRule
