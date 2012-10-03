/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Field Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.ValueFieldProperties#getFormFieldProperties <em>Form Field Properties</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ValueFieldProperties#getMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getValueFieldProperties()
 * @model
 * @generated
 */
public interface ValueFieldProperties extends EObject
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getValueFieldProperties_FormFieldProperties()
   * @model containment="true"
   * @generated
   */
  FormFieldProperties getFormFieldProperties();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ValueFieldProperties#getFormFieldProperties <em>Form Field Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Form Field Properties</em>' containment reference.
   * @see #getFormFieldProperties()
   * @generated
   */
  void setFormFieldProperties(FormFieldProperties value);

  /**
   * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mandatory</em>' attribute.
   * @see #setMandatory(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getValueFieldProperties_Mandatory()
   * @model
   * @generated
   */
  String getMandatory();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ValueFieldProperties#getMandatory <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mandatory</em>' attribute.
   * @see #getMandatory()
   * @generated
   */
  void setMandatory(String value);

} // ValueFieldProperties
