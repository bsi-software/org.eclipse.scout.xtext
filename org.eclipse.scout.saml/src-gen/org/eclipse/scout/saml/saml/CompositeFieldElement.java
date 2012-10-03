/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Field Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.CompositeFieldElement#getFormFieldProperties <em>Form Field Properties</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.CompositeFieldElement#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getCompositeFieldElement()
 * @model
 * @generated
 */
public interface CompositeFieldElement extends FormFieldElement
{
  /**
   * Returns the value of the '<em><b>Form Field Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Form Field Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Form Field Properties</em>' containment reference.
   * @see #setFormFieldProperties(FormFieldProperties)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getCompositeFieldElement_FormFieldProperties()
   * @model containment="true"
   * @generated
   */
  FormFieldProperties getFormFieldProperties();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.CompositeFieldElement#getFormFieldProperties <em>Form Field Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Form Field Properties</em>' containment reference.
   * @see #getFormFieldProperties()
   * @generated
   */
  void setFormFieldProperties(FormFieldProperties value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.FormFieldElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getCompositeFieldElement_Fields()
   * @model containment="true"
   * @generated
   */
  EList<FormFieldElement> getFields();

} // CompositeFieldElement
