/**
 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Value Field Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.GenericValueFieldElement#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.GenericValueFieldElement#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.GenericValueFieldElement#getLookup <em>Lookup</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getGenericValueFieldElement()
 * @model
 * @generated
 */
public interface GenericValueFieldElement extends ValueFieldElement
{
  /**
   * Returns the value of the '<em><b>Code</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' reference.
   * @see #setCode(CodeElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getGenericValueFieldElement_Code()
   * @model
   * @generated
   */
  CodeElement getCode();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.GenericValueFieldElement#getCode <em>Code</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' reference.
   * @see #getCode()
   * @generated
   */
  void setCode(CodeElement value);

  /**
   * Returns the value of the '<em><b>Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Type</em>' attribute.
   * @see #setValueType(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getGenericValueFieldElement_ValueType()
   * @model
   * @generated
   */
  String getValueType();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.GenericValueFieldElement#getValueType <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Type</em>' attribute.
   * @see #getValueType()
   * @generated
   */
  void setValueType(String value);

  /**
   * Returns the value of the '<em><b>Lookup</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lookup</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lookup</em>' reference.
   * @see #setLookup(LookupElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getGenericValueFieldElement_Lookup()
   * @model
   * @generated
   */
  LookupElement getLookup();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.GenericValueFieldElement#getLookup <em>Lookup</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lookup</em>' reference.
   * @see #getLookup()
   * @generated
   */
  void setLookup(LookupElement value);

} // GenericValueFieldElement
