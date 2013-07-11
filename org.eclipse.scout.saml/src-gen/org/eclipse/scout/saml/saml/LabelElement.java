/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.LabelElement#getWrapText <em>Wrap Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.LabelElement#getGridHeight <em>Grid Height</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.LabelElement#getHorizontalAlign <em>Horizontal Align</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getLabelElement()
 * @model
 * @generated
 */
public interface LabelElement extends ValueFieldElement
{
  /**
   * Returns the value of the '<em><b>Wrap Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wrap Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wrap Text</em>' attribute.
   * @see #setWrapText(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLabelElement_WrapText()
   * @model
   * @generated
   */
  String getWrapText();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LabelElement#getWrapText <em>Wrap Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wrap Text</em>' attribute.
   * @see #getWrapText()
   * @generated
   */
  void setWrapText(String value);

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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLabelElement_GridHeight()
   * @model
   * @generated
   */
  int getGridHeight();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LabelElement#getGridHeight <em>Grid Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grid Height</em>' attribute.
   * @see #getGridHeight()
   * @generated
   */
  void setGridHeight(int value);

  /**
   * Returns the value of the '<em><b>Horizontal Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Horizontal Align</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Horizontal Align</em>' attribute.
   * @see #setHorizontalAlign(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLabelElement_HorizontalAlign()
   * @model
   * @generated
   */
  String getHorizontalAlign();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LabelElement#getHorizontalAlign <em>Horizontal Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horizontal Align</em>' attribute.
   * @see #getHorizontalAlign()
   * @generated
   */
  void setHorizontalAlign(String value);

} // LabelElement
