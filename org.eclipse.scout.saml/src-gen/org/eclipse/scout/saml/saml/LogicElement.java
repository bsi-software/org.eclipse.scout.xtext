/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.LogicElement#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.LogicElement#getRunat <em>Runat</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.LogicElement#getExec <em>Exec</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.LogicElement#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicElement()
 * @model
 * @generated
 */
public interface LogicElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.scout.saml.saml.LogicType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' attribute.
   * @see org.eclipse.scout.saml.saml.LogicType
   * @see #setEvent(LogicType)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicElement_Event()
   * @model
   * @generated
   */
  LogicType getEvent();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LogicElement#getEvent <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' attribute.
   * @see org.eclipse.scout.saml.saml.LogicType
   * @see #getEvent()
   * @generated
   */
  void setEvent(LogicType value);

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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicElement_Runat()
   * @model
   * @generated
   */
  String getRunat();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LogicElement#getRunat <em>Runat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Runat</em>' attribute.
   * @see #getRunat()
   * @generated
   */
  void setRunat(String value);

  /**
   * Returns the value of the '<em><b>Exec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exec</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exec</em>' reference.
   * @see #setExec(JavaCodeElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicElement_Exec()
   * @model
   * @generated
   */
  JavaCodeElement getExec();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LogicElement#getExec <em>Exec</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exec</em>' reference.
   * @see #getExec()
   * @generated
   */
  void setExec(JavaCodeElement value);

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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicElement_Source()
   * @model containment="true"
   * @generated
   */
  XExpression getSource();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LogicElement#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(XExpression value);

} // LogicElement
