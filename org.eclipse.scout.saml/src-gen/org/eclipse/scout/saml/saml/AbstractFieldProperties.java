/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Field Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.AbstractFieldProperties#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.AbstractFieldProperties#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.AbstractFieldProperties#getMaster <em>Master</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.AbstractFieldProperties#getEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getAbstractFieldProperties()
 * @model
 * @generated
 */
public interface AbstractFieldProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(TextAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getAbstractFieldProperties_Text()
   * @model containment="true"
   * @generated
   */
  TextAttribute getText();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.AbstractFieldProperties#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(TextAttribute value);

  /**
   * Returns the value of the '<em><b>Visible</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visible</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visible</em>' containment reference.
   * @see #setVisible(VisibleAttribue)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getAbstractFieldProperties_Visible()
   * @model containment="true"
   * @generated
   */
  VisibleAttribue getVisible();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.AbstractFieldProperties#getVisible <em>Visible</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible</em>' containment reference.
   * @see #getVisible()
   * @generated
   */
  void setVisible(VisibleAttribue value);

  /**
   * Returns the value of the '<em><b>Master</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Master</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Master</em>' containment reference.
   * @see #setMaster(MasterAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getAbstractFieldProperties_Master()
   * @model containment="true"
   * @generated
   */
  MasterAttribute getMaster();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.AbstractFieldProperties#getMaster <em>Master</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Master</em>' containment reference.
   * @see #getMaster()
   * @generated
   */
  void setMaster(MasterAttribute value);

  /**
   * Returns the value of the '<em><b>Enabled</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enabled</em>' containment reference.
   * @see #setEnabled(EnabledAttribue)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getAbstractFieldProperties_Enabled()
   * @model containment="true"
   * @generated
   */
  EnabledAttribue getEnabled();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.AbstractFieldProperties#getEnabled <em>Enabled</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' containment reference.
   * @see #getEnabled()
   * @generated
   */
  void setEnabled(EnabledAttribue value);

} // AbstractFieldProperties
