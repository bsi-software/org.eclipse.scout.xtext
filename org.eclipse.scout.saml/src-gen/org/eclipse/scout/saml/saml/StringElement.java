/**
 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.StringElement#getMaxlen <em>Maxlen</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.StringElement#getGridHeight <em>Grid Height</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.StringElement#getHorizontalAlign <em>Horizontal Align</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getStringElement()
 * @model
 * @generated
 */
public interface StringElement extends ValueFieldElement
{
  /**
   * Returns the value of the '<em><b>Maxlen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maxlen</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maxlen</em>' attribute.
   * @see #setMaxlen(int)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getStringElement_Maxlen()
   * @model
   * @generated
   */
  int getMaxlen();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.StringElement#getMaxlen <em>Maxlen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maxlen</em>' attribute.
   * @see #getMaxlen()
   * @generated
   */
  void setMaxlen(int value);

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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getStringElement_GridHeight()
   * @model
   * @generated
   */
  int getGridHeight();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.StringElement#getGridHeight <em>Grid Height</em>}' attribute.
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getStringElement_HorizontalAlign()
   * @model
   * @generated
   */
  String getHorizontalAlign();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.StringElement#getHorizontalAlign <em>Horizontal Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Horizontal Align</em>' attribute.
   * @see #getHorizontalAlign()
   * @generated
   */
  void setHorizontalAlign(String value);

} // StringElement
