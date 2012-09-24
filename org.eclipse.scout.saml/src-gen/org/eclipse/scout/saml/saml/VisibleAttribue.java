/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visible Attribue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.VisibleAttribue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getVisibleAttribue()
 * @model
 * @generated
 */
public interface VisibleAttribue extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.scout.saml.saml.BooleanType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.eclipse.scout.saml.saml.BooleanType
   * @see #setValue(BooleanType)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getVisibleAttribue_Value()
   * @model
   * @generated
   */
  BooleanType getValue();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.VisibleAttribue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.eclipse.scout.saml.saml.BooleanType
   * @see #getValue()
   * @generated
   */
  void setValue(BooleanType value);

} // VisibleAttribue
