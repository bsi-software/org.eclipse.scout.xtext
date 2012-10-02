/**
 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Box Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.SequenceBoxElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.SequenceBoxElement#getFieldRule <em>Field Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getSequenceBoxElement()
 * @model
 * @generated
 */
public interface SequenceBoxElement extends CompositeElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getSequenceBoxElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.SequenceBoxElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Field Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Rule</em>' containment reference.
   * @see #setFieldRule(CompositeElementRule)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getSequenceBoxElement_FieldRule()
   * @model containment="true"
   * @generated
   */
  CompositeElementRule getFieldRule();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.SequenceBoxElement#getFieldRule <em>Field Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Rule</em>' containment reference.
   * @see #getFieldRule()
   * @generated
   */
  void setFieldRule(CompositeElementRule value);

} // SequenceBoxElement
