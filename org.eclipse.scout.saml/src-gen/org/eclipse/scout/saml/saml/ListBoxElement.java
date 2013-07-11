/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Box Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.ListBoxElement#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ListBoxElement#getLookup <em>Lookup</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ListBoxElement#getGridHeight <em>Grid Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getListBoxElement()
 * @model
 * @generated
 */
public interface ListBoxElement extends GenericValueFieldElement
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getListBoxElement_Code()
   * @model
   * @generated
   */
  CodeElement getCode();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ListBoxElement#getCode <em>Code</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' reference.
   * @see #getCode()
   * @generated
   */
  void setCode(CodeElement value);

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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getListBoxElement_Lookup()
   * @model
   * @generated
   */
  LookupElement getLookup();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ListBoxElement#getLookup <em>Lookup</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lookup</em>' reference.
   * @see #getLookup()
   * @generated
   */
  void setLookup(LookupElement value);

  /**
   * Returns the value of the '<em><b>Grid Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grid Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grid Height</em>' attribute.
   * @see #setGridHeight(int)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getListBoxElement_GridHeight()
   * @model
   * @generated
   */
  int getGridHeight();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ListBoxElement#getGridHeight <em>Grid Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grid Height</em>' attribute.
   * @see #getGridHeight()
   * @generated
   */
  void setGridHeight(int value);

} // ListBoxElement
