/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Element Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.CompositeElementRule#getRule <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.CompositeElementRule#getLogic <em>Logic</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.CompositeElementRule#getChildre <em>Childre</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getCompositeElementRule()
 * @model
 * @generated
 */
public interface CompositeElementRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference.
   * @see #setRule(ControlElementRule)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getCompositeElementRule_Rule()
   * @model containment="true"
   * @generated
   */
  ControlElementRule getRule();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.CompositeElementRule#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(ControlElementRule value);

  /**
   * Returns the value of the '<em><b>Logic</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.LogicElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logic</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getCompositeElementRule_Logic()
   * @model containment="true"
   * @generated
   */
  EList<LogicElement> getLogic();

  /**
   * Returns the value of the '<em><b>Childre</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.ControlElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Childre</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Childre</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getCompositeElementRule_Childre()
   * @model containment="true"
   * @generated
   */
  EList<ControlElement> getChildre();

} // CompositeElementRule
