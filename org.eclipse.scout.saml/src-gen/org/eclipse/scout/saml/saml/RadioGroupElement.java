/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Group Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.RadioGroupElement#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getRadioGroupElement()
 * @model
 * @generated
 */
public interface RadioGroupElement extends GenericValueFieldElement
{
  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.RadioButtonElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getRadioGroupElement_Options()
   * @model containment="true"
   * @generated
   */
  EList<RadioButtonElement> getOptions();

} // RadioGroupElement
