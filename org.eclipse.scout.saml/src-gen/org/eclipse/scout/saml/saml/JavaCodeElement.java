/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Code Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.JavaCodeElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.JavaCodeElement#getRunat <em>Runat</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.JavaCodeElement#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getJavaCodeElement()
 * @model
 * @generated
 */
public interface JavaCodeElement extends EObject
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getJavaCodeElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.JavaCodeElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Runat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Runat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Runat</em>' attribute.
   * @see #setRunat(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getJavaCodeElement_Runat()
   * @model
   * @generated
   */
  String getRunat();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.JavaCodeElement#getRunat <em>Runat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Runat</em>' attribute.
   * @see #getRunat()
   * @generated
   */
  void setRunat(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(XExpression)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getJavaCodeElement_Source()
   * @model containment="true"
   * @generated
   */
  XExpression getSource();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.JavaCodeElement#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(XExpression value);

} // JavaCodeElement
