/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.LogicElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.LogicElement#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.LogicElement#getPlacement <em>Placement</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LogicElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' attribute.
   * @see #setEvent(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicElement_Event()
   * @model
   * @generated
   */
  String getEvent();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LogicElement#getEvent <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' attribute.
   * @see #getEvent()
   * @generated
   */
  void setEvent(String value);

  /**
   * Returns the value of the '<em><b>Placement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Placement</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Placement</em>' attribute.
   * @see #setPlacement(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicElement_Placement()
   * @model
   * @generated
   */
  String getPlacement();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LogicElement#getPlacement <em>Placement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Placement</em>' attribute.
   * @see #getPlacement()
   * @generated
   */
  void setPlacement(String value);

  /**
   * Returns the value of the '<em><b>Exec</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exec</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exec</em>' reference.
   * @see #setExec(LogicElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicElement_Exec()
   * @model
   * @generated
   */
  LogicElement getExec();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LogicElement#getExec <em>Exec</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exec</em>' reference.
   * @see #getExec()
   * @generated
   */
  void setExec(LogicElement value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicElement_Source()
   * @model
   * @generated
   */
  String getSource();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LogicElement#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(String value);

} // LogicElement
