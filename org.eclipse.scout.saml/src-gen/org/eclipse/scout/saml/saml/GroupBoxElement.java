/**
 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Box Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.GroupBoxElement#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.GroupBoxElement#getBorderVisible <em>Border Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.GroupBoxElement#getBorderDecoration <em>Border Decoration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getGroupBoxElement()
 * @model
 * @generated
 */
public interface GroupBoxElement extends CompositeFieldElement
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' attribute.
   * @see #setColumns(int)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getGroupBoxElement_Columns()
   * @model
   * @generated
   */
  int getColumns();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.GroupBoxElement#getColumns <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columns</em>' attribute.
   * @see #getColumns()
   * @generated
   */
  void setColumns(int value);

  /**
   * Returns the value of the '<em><b>Border Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Border Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Border Visible</em>' attribute.
   * @see #setBorderVisible(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getGroupBoxElement_BorderVisible()
   * @model
   * @generated
   */
  String getBorderVisible();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.GroupBoxElement#getBorderVisible <em>Border Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border Visible</em>' attribute.
   * @see #getBorderVisible()
   * @generated
   */
  void setBorderVisible(String value);

  /**
   * Returns the value of the '<em><b>Border Decoration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Border Decoration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Border Decoration</em>' attribute.
   * @see #setBorderDecoration(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getGroupBoxElement_BorderDecoration()
   * @model
   * @generated
   */
  String getBorderDecoration();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.GroupBoxElement#getBorderDecoration <em>Border Decoration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border Decoration</em>' attribute.
   * @see #getBorderDecoration()
   * @generated
   */
  void setBorderDecoration(String value);

} // GroupBoxElement
