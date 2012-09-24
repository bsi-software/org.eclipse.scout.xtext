/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Optional Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.LogicOptionalProperties#getRunat <em>Runat</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.LogicOptionalProperties#getExec <em>Exec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicOptionalProperties()
 * @model
 * @generated
 */
public interface LogicOptionalProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Runat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Runat</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Runat</em>' containment reference.
   * @see #setRunat(RunAtAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicOptionalProperties_Runat()
   * @model containment="true"
   * @generated
   */
  RunAtAttribute getRunat();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LogicOptionalProperties#getRunat <em>Runat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Runat</em>' containment reference.
   * @see #getRunat()
   * @generated
   */
  void setRunat(RunAtAttribute value);

  /**
   * Returns the value of the '<em><b>Exec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exec</em>' containment reference.
   * @see #setExec(LogicExecAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicOptionalProperties_Exec()
   * @model containment="true"
   * @generated
   */
  LogicExecAttribute getExec();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LogicOptionalProperties#getExec <em>Exec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exec</em>' containment reference.
   * @see #getExec()
   * @generated
   */
  void setExec(LogicExecAttribute value);

} // LogicOptionalProperties
