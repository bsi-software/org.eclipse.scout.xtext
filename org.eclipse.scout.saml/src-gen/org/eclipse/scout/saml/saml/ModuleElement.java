/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.ModuleElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ModuleElement#getClient <em>Client</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ModuleElement#getShared <em>Shared</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ModuleElement#getServer <em>Server</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getModuleElement()
 * @model
 * @generated
 */
public interface ModuleElement extends EObject
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getModuleElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ModuleElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Client</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Client</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Client</em>' attribute.
   * @see #setClient(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getModuleElement_Client()
   * @model
   * @generated
   */
  String getClient();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ModuleElement#getClient <em>Client</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Client</em>' attribute.
   * @see #getClient()
   * @generated
   */
  void setClient(String value);

  /**
   * Returns the value of the '<em><b>Shared</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shared</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shared</em>' attribute.
   * @see #setShared(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getModuleElement_Shared()
   * @model
   * @generated
   */
  String getShared();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ModuleElement#getShared <em>Shared</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shared</em>' attribute.
   * @see #getShared()
   * @generated
   */
  void setShared(String value);

  /**
   * Returns the value of the '<em><b>Server</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server</em>' attribute.
   * @see #setServer(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getModuleElement_Server()
   * @model
   * @generated
   */
  String getServer();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ModuleElement#getServer <em>Server</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server</em>' attribute.
   * @see #getServer()
   * @generated
   */
  void setServer(String value);

} // ModuleElement
