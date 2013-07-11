/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Box Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.TabBoxElement#getGridWidth <em>Grid Width</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.TabBoxElement#getWidthInPixels <em>Width In Pixels</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.TabBoxElement#getTabs <em>Tabs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getTabBoxElement()
 * @model
 * @generated
 */
public interface TabBoxElement extends FormFieldElement
{
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTabBoxElement_GridWidth()
   * @model
   * @generated
   */
  int getGridWidth();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.TabBoxElement#getGridWidth <em>Grid Width</em>}' attribute.
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTabBoxElement_WidthInPixels()
   * @model
   * @generated
   */
  int getWidthInPixels();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.TabBoxElement#getWidthInPixels <em>Width In Pixels</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width In Pixels</em>' attribute.
   * @see #getWidthInPixels()
   * @generated
   */
  void setWidthInPixels(int value);

  /**
   * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.TabElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tabs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tabs</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTabBoxElement_Tabs()
   * @model containment="true"
   * @generated
   */
  EList<TabElement> getTabs();

} // TabBoxElement
