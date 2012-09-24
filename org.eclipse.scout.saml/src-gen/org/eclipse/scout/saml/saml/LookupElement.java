/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lookup Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.LookupElement#getServicelogic <em>Servicelogic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getLookupElement()
 * @model
 * @generated
 */
public interface LookupElement extends RootElement, AbstractScoutType
{
  /**
   * Returns the value of the '<em><b>Servicelogic</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Servicelogic</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servicelogic</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLookupElement_Servicelogic()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getServicelogic();

} // LookupElement
