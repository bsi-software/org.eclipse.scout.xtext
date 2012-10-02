/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.LanguageAttribute#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.LanguageAttribute#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getLanguageAttribute()
 * @model
 * @generated
 */
public interface LanguageAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lang</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lang</em>' attribute.
   * @see #setLang(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLanguageAttribute_Lang()
   * @model
   * @generated
   */
  String getLang();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LanguageAttribute#getLang <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lang</em>' attribute.
   * @see #getLang()
   * @generated
   */
  void setLang(String value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLanguageAttribute_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LanguageAttribute#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // LanguageAttribute
