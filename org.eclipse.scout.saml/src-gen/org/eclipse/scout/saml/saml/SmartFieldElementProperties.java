/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Field Element Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.SmartFieldElementProperties#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.SmartFieldElementProperties#getValue_type <em>Value type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.SmartFieldElementProperties#getLookup <em>Lookup</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getSmartFieldElementProperties()
 * @model
 * @generated
 */
public interface SmartFieldElementProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' containment reference.
   * @see #setCode(SmartfieldElementCodeAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getSmartFieldElementProperties_Code()
   * @model containment="true"
   * @generated
   */
  SmartfieldElementCodeAttribute getCode();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.SmartFieldElementProperties#getCode <em>Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' containment reference.
   * @see #getCode()
   * @generated
   */
  void setCode(SmartfieldElementCodeAttribute value);

  /**
   * Returns the value of the '<em><b>Value type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value type</em>' containment reference.
   * @see #setValue_type(SmartfieldElementValueTypeAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getSmartFieldElementProperties_Value_type()
   * @model containment="true"
   * @generated
   */
  SmartfieldElementValueTypeAttribute getValue_type();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.SmartFieldElementProperties#getValue_type <em>Value type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value type</em>' containment reference.
   * @see #getValue_type()
   * @generated
   */
  void setValue_type(SmartfieldElementValueTypeAttribute value);

  /**
   * Returns the value of the '<em><b>Lookup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lookup</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lookup</em>' containment reference.
   * @see #setLookup(SmartfieldElementLookupAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getSmartFieldElementProperties_Lookup()
   * @model containment="true"
   * @generated
   */
  SmartfieldElementLookupAttribute getLookup();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.SmartFieldElementProperties#getLookup <em>Lookup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lookup</em>' containment reference.
   * @see #getLookup()
   * @generated
   */
  void setLookup(SmartfieldElementLookupAttribute value);

} // SmartFieldElementProperties
