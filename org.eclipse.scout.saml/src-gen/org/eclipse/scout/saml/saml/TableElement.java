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
 *   <li>{@link org.eclipse.scout.saml.saml.TableElement#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.TableElement#getLabelVisible <em>Label Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.TableElement#getGridHeight <em>Grid Height</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.TableElement#getGridWidth <em>Grid Width</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.TableElement#getWidthInPixels <em>Width In Pixels</em>}</li>
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
   * Returns the value of the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' reference.
   * @see #setText(TranslationElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTableElement_Text()
   * @model
   * @generated
   */
  TranslationElement getText();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.TableElement#getText <em>Text</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' reference.
   * @see #getText()
   * @generated
   */
  void setText(TranslationElement value);

  /**
   * Returns the value of the '<em><b>Label Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Visible</em>' attribute.
   * @see #setLabelVisible(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTableElement_LabelVisible()
   * @model
   * @generated
   */
  String getLabelVisible();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.TableElement#getLabelVisible <em>Label Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Visible</em>' attribute.
   * @see #getLabelVisible()
   * @generated
   */
  void setLabelVisible(String value);

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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTableElement_GridHeight()
   * @model
   * @generated
   */
  int getGridHeight();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.TableElement#getGridHeight <em>Grid Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grid Height</em>' attribute.
   * @see #getGridHeight()
   * @generated
   */
  void setGridHeight(int value);

  /**
   * Returns the value of the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grid Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grid Width</em>' attribute.
   * @see #setGridWidth(int)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTableElement_GridWidth()
   * @model
   * @generated
   */
  int getGridWidth();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.TableElement#getGridWidth <em>Grid Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grid Width</em>' attribute.
   * @see #getGridWidth()
   * @generated
   */
  void setGridWidth(int value);

  /**
   * Returns the value of the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width In Pixels</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width In Pixels</em>' attribute.
   * @see #setWidthInPixels(int)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTableElement_WidthInPixels()
   * @model
   * @generated
   */
  int getWidthInPixels();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.TableElement#getWidthInPixels <em>Width In Pixels</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width In Pixels</em>' attribute.
   * @see #getWidthInPixels()
   * @generated
   */
  void setWidthInPixels(int value);

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
