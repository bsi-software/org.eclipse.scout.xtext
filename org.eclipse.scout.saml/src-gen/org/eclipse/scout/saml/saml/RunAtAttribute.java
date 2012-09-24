/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run At Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.RunAtAttribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getRunAtAttribute()
 * @model
 * @generated
 */
public interface RunAtAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.scout.saml.saml.JavaRunAtAttributeList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.eclipse.scout.saml.saml.JavaRunAtAttributeList
   * @see #setValue(JavaRunAtAttributeList)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getRunAtAttribute_Value()
   * @model
   * @generated
   */
  JavaRunAtAttributeList getValue();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.RunAtAttribute#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.eclipse.scout.saml.saml.JavaRunAtAttributeList
   * @see #getValue()
   * @generated
   */
  void setValue(JavaRunAtAttributeList value);

} // RunAtAttribute
