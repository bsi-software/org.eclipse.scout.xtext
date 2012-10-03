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
 *   <li>{@link org.eclipse.scout.saml.saml.DoubleElement#getValueFieldProperties <em>Value Field Properties</em>}</li>
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
   * Returns the value of the '<em><b>Value Field Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Field Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Field Properties</em>' containment reference.
   * @see #setValueFieldProperties(ValueFieldProperties)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getDoubleElement_ValueFieldProperties()
   * @model containment="true"
   * @generated
   */
  ValueFieldProperties getValueFieldProperties();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.DoubleElement#getValueFieldProperties <em>Value Field Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Field Properties</em>' containment reference.
   * @see #getValueFieldProperties()
   * @generated
   */
  void setValueFieldProperties(ValueFieldProperties value);

} // DoubleElement
