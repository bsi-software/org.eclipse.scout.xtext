/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.ColumnElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ColumnElement#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ColumnElement#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ColumnElement#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ColumnElement#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ColumnElement#getDisplayable <em>Displayable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getColumnElement()
 * @model
 * @generated
 */
public interface ColumnElement extends EObject
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getColumnElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ColumnElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getColumnElement_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ColumnElement#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getColumnElement_Text()
   * @model
   * @generated
   */
  TranslationElement getText();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ColumnElement#getText <em>Text</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' reference.
   * @see #getText()
   * @generated
   */
  void setText(TranslationElement value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(int)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getColumnElement_Width()
   * @model
   * @generated
   */
  int getWidth();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ColumnElement#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(int value);

  /**
   * Returns the value of the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visible</em>' attribute.
   * @see #setVisible(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getColumnElement_Visible()
   * @model
   * @generated
   */
  String getVisible();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ColumnElement#getVisible <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible</em>' attribute.
   * @see #getVisible()
   * @generated
   */
  void setVisible(String value);

  /**
   * Returns the value of the '<em><b>Displayable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Displayable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Displayable</em>' attribute.
   * @see #setDisplayable(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getColumnElement_Displayable()
   * @model
   * @generated
   */
  String getDisplayable();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ColumnElement#getDisplayable <em>Displayable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Displayable</em>' attribute.
   * @see #getDisplayable()
   * @generated
   */
  void setDisplayable(String value);

} // ColumnElement
