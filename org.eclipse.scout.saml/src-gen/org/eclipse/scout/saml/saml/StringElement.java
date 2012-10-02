/**
 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.StringElement#getMaster <em>Master</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getStringElement()
 * @model
 * @generated
 */
public interface StringElement extends LeafElement
{
  /**
   * Returns the value of the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Master</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Master</em>' reference.
   * @see #setMaster(LeafElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getStringElement_Master()
   * @model
   * @generated
   */
  LeafElement getMaster();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.StringElement#getMaster <em>Master</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Master</em>' reference.
   * @see #getMaster()
   * @generated
   */
  void setMaster(LeafElement value);

} // StringElement
