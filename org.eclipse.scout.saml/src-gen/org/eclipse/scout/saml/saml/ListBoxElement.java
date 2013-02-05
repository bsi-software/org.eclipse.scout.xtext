/**
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
