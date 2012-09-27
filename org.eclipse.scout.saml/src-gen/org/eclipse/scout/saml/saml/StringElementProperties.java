/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Element Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.StringElementProperties#getValueFieldProperties <em>Value Field Properties</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.StringElementProperties#getMaxlen <em>Maxlen</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getStringElementProperties()
 * @model
 * @generated
 */
public interface StringElementProperties extends EObject
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
   * @see #setValueFieldProperties(AbstractValueFieldProperties)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getStringElementProperties_ValueFieldProperties()
   * @model containment="true"
   * @generated
   */
  AbstractValueFieldProperties getValueFieldProperties();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.StringElementProperties#getValueFieldProperties <em>Value Field Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Field Properties</em>' containment reference.
   * @see #getValueFieldProperties()
   * @generated
   */
  void setValueFieldProperties(AbstractValueFieldProperties value);

  /**
   * Returns the value of the '<em><b>Maxlen</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maxlen</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maxlen</em>' containment reference.
   * @see #setMaxlen(StringElementMaxlenAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getStringElementProperties_Maxlen()
   * @model containment="true"
   * @generated
   */
  StringElementMaxlenAttribute getMaxlen();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.StringElementProperties#getMaxlen <em>Maxlen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maxlen</em>' containment reference.
   * @see #getMaxlen()
   * @generated
   */
  void setMaxlen(StringElementMaxlenAttribute value);

} // StringElementProperties
