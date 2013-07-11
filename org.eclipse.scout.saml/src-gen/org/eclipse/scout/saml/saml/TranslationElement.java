/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.TranslationElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.TranslationElement#getTranslations <em>Translations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getTranslationElement()
 * @model
 * @generated
 */
public interface TranslationElement extends EObject
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTranslationElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.TranslationElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Translations</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.LanguageAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Translations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Translations</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTranslationElement_Translations()
   * @model containment="true"
   * @generated
   */
  EList<LanguageAttribute> getTranslations();

} // TranslationElement
