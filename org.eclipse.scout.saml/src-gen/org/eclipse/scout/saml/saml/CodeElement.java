/**
 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.CodeElement#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getCodeElement()
 * @model
 * @generated
 */
public interface CodeElement extends RootElement, AbstractScoutType
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(CodeIdAttribute)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getCodeElement_Id()
   * @model containment="true"
   * @generated
   */
  CodeIdAttribute getId();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.CodeElement#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(CodeIdAttribute value);

} // CodeElement
