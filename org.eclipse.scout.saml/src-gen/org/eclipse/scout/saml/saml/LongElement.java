/**
 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Long Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.LongElement#getValueFieldProperties <em>Value Field Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getLongElement()
 * @model
 * @generated
 */
public interface LongElement extends ValueFieldElement
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLongElement_ValueFieldProperties()
   * @model containment="true"
   * @generated
   */
  ValueFieldProperties getValueFieldProperties();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LongElement#getValueFieldProperties <em>Value Field Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Field Properties</em>' containment reference.
   * @see #getValueFieldProperties()
   * @generated
   */
  void setValueFieldProperties(ValueFieldProperties value);

} // LongElement
