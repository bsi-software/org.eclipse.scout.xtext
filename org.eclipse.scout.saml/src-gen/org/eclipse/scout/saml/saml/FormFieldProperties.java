/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Field Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.FormFieldProperties#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormFieldProperties#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormFieldProperties#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormFieldProperties#getMaster <em>Master</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getFormFieldProperties()
 * @model
 * @generated
 */
public interface FormFieldProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' reference.
   * @see #setText(TranslationElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormFieldProperties_Text()
   * @model
   * @generated
   */
  TranslationElement getText();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormFieldProperties#getText <em>Text</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' reference.
   * @see #getText()
   * @generated
   */
  void setText(TranslationElement value);

  /**
   * Returns the value of the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enabled</em>' attribute.
   * @see #setEnabled(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormFieldProperties_Enabled()
   * @model
   * @generated
   */
  String getEnabled();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormFieldProperties#getEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #getEnabled()
   * @generated
   */
  void setEnabled(String value);

  /**
   * Returns the value of the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visible</em>' attribute.
   * @see #setVisible(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormFieldProperties_Visible()
   * @model
   * @generated
   */
  String getVisible();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormFieldProperties#getVisible <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible</em>' attribute.
   * @see #getVisible()
   * @generated
   */
  void setVisible(String value);

  /**
   * Returns the value of the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Master</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Master</em>' reference.
   * @see #setMaster(ValueFieldElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormFieldProperties_Master()
   * @model
   * @generated
   */
  ValueFieldElement getMaster();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormFieldProperties#getMaster <em>Master</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Master</em>' reference.
   * @see #getMaster()
   * @generated
   */
  void setMaster(ValueFieldElement value);

} // FormFieldProperties
