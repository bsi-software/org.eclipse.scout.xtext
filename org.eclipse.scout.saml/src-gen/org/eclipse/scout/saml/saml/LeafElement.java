/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.LeafElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.LeafElement#getFieldRule <em>Field Rule</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.LeafElement#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.LeafElement#getLogic <em>Logic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getLeafElement()
 * @model
 * @generated
 */
public interface LeafElement extends ControlElement
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLeafElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LeafElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Field Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Rule</em>' containment reference.
   * @see #setFieldRule(ControlElementRule)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLeafElement_FieldRule()
   * @model containment="true"
   * @generated
   */
  ControlElementRule getFieldRule();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LeafElement#getFieldRule <em>Field Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Rule</em>' containment reference.
   * @see #getFieldRule()
   * @generated
   */
  void setFieldRule(ControlElementRule value);

  /**
   * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.scout.saml.saml.BooleanType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mandatory</em>' attribute.
   * @see org.eclipse.scout.saml.saml.BooleanType
   * @see #setMandatory(BooleanType)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLeafElement_Mandatory()
   * @model
   * @generated
   */
  BooleanType getMandatory();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.LeafElement#getMandatory <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mandatory</em>' attribute.
   * @see org.eclipse.scout.saml.saml.BooleanType
   * @see #getMandatory()
   * @generated
   */
  void setMandatory(BooleanType value);

  /**
   * Returns the value of the '<em><b>Logic</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.LogicElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logic</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getLeafElement_Logic()
   * @model containment="true"
   * @generated
   */
  EList<LogicElement> getLogic();

} // LeafElement
