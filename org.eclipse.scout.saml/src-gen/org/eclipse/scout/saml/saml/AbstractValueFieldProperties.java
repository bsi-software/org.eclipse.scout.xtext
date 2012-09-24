/**
 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Value Field Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.AbstractValueFieldProperties#getMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getAbstractValueFieldProperties()
 * @model
 * @generated
 */
public interface AbstractValueFieldProperties extends StringElementProperties, SmartFieldElementProperties
{
  /**
   * Returns the value of the '<em><b>Mandatory</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mandatory</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mandatory</em>' containment reference.
   * @see #setMandatory(MandatoryAttribue)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getAbstractValueFieldProperties_Mandatory()
   * @model containment="true"
   * @generated
   */
  MandatoryAttribue getMandatory();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.AbstractValueFieldProperties#getMandatory <em>Mandatory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mandatory</em>' containment reference.
   * @see #getMandatory()
   * @generated
   */
  void setMandatory(MandatoryAttribue value);

} // AbstractValueFieldProperties
