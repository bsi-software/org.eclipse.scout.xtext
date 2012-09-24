/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Element Replaces Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.TemplateElementReplacesAttribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getTemplateElementReplacesAttribute()
 * @model
 * @generated
 */
public interface TemplateElementReplacesAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(AbstractScoutType)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getTemplateElementReplacesAttribute_Value()
   * @model
   * @generated
   */
  AbstractScoutType getValue();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.TemplateElementReplacesAttribute#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(AbstractScoutType value);

} // TemplateElementReplacesAttribute
