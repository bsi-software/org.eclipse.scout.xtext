/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Field Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.CustomFieldElement#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.CustomFieldElement#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getCustomFieldElement()
 * @model
 * @generated
 */
public interface CustomFieldElement extends FormFieldElement
{
  /**
   * Returns the value of the '<em><b>Template</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' reference.
   * @see #setTemplate(TemplateElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getCustomFieldElement_Template()
   * @model
   * @generated
   */
  TemplateElement getTemplate();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.CustomFieldElement#getTemplate <em>Template</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' reference.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(TemplateElement value);

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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getCustomFieldElement_Fields()
   * @model containment="true"
   * @generated
   */
  EList<FormFieldElement> getFields();

} // CustomFieldElement
