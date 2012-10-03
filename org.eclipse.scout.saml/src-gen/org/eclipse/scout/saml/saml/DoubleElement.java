/**
 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.DoubleElement#getMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getDoubleElement()
 * @model
 * @generated
 */
public interface DoubleElement extends ValueFieldElement
{
  /**
   * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mandatory</em>' attribute.
   * @see #setMandatory(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getDoubleElement_Mandatory()
   * @model
   * @generated
   */
  String getMandatory();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.DoubleElement#getMandatory <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mandatory</em>' attribute.
   * @see #getMandatory()
   * @generated
   */
  void setMandatory(String value);

} // DoubleElement
