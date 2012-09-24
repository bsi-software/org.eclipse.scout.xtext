/**
 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.TemplateElement#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.TemplateElement#getReplaces <em>Replaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getTemplateElement()
 * @model
 * @generated
 */
public interface TemplateElement extends RootElement
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(TemplateElementClassAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTemplateElement_Class()
   * @model containment="true"
   * @generated
   */
  TemplateElementClassAttribute getClass_();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.TemplateElement#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(TemplateElementClassAttribute value);

  /**
   * Returns the value of the '<em><b>Replaces</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Replaces</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Replaces</em>' containment reference.
   * @see #setReplaces(TemplateElementReplacesAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTemplateElement_Replaces()
   * @model containment="true"
   * @generated
   */
  TemplateElementReplacesAttribute getReplaces();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.TemplateElement#getReplaces <em>Replaces</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Replaces</em>' containment reference.
   * @see #getReplaces()
   * @generated
   */
  void setReplaces(TemplateElementReplacesAttribute value);

} // TemplateElement
