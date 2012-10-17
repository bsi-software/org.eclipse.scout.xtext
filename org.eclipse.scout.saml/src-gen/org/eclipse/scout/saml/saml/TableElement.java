/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.TableElement#getMenus <em>Menus</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.TableElement#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getTableElement()
 * @model
 * @generated
 */
public interface TableElement extends FormFieldElement
{
  /**
   * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.MenuElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menus</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTableElement_Menus()
   * @model containment="true"
   * @generated
   */
  EList<MenuElement> getMenus();

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.ColumnElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTableElement_Columns()
   * @model containment="true"
   * @generated
   */
  EList<ColumnElement> getColumns();

} // TableElement
