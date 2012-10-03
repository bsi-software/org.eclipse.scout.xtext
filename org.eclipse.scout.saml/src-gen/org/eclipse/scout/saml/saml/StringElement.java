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
 *   <li>{@link org.eclipse.scout.saml.saml.StringElement#getValueFieldProperties <em>Value Field Properties</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.StringElement#getMaxlen <em>Maxlen</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getStringElement()
 * @model
 * @generated
 */
public interface StringElement extends ValueFieldElement
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getStringElement_ValueFieldProperties()
   * @model containment="true"
   * @generated
   */
  ValueFieldProperties getValueFieldProperties();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.StringElement#getValueFieldProperties <em>Value Field Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Field Properties</em>' containment reference.
   * @see #getValueFieldProperties()
   * @generated
   */
  void setValueFieldProperties(ValueFieldProperties value);

  /**
   * Returns the value of the '<em><b>Maxlen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maxlen</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maxlen</em>' attribute.
   * @see #setMaxlen(int)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getStringElement_Maxlen()
   * @model
   * @generated
   */
  int getMaxlen();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.StringElement#getMaxlen <em>Maxlen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maxlen</em>' attribute.
   * @see #getMaxlen()
   * @generated
   */
  void setMaxlen(int value);

} // StringElement
