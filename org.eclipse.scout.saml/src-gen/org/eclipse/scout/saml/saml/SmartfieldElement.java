/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smartfield Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.SmartfieldElement#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.SmartfieldElement#getLogic <em>Logic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getSmartfieldElement()
 * @model
 * @generated
 */
public interface SmartfieldElement extends AbstractValueFieldElement
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.SmartFieldElementProperties}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getSmartfieldElement_Properties()
   * @model containment="true"
   * @generated
   */
  EList<SmartFieldElementProperties> getProperties();

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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getSmartfieldElement_Logic()
   * @model containment="true"
   * @generated
   */
  EList<LogicElement> getLogic();

} // SmartfieldElement
