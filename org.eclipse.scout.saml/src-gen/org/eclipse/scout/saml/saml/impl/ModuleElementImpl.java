/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ModuleElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ModuleElementImpl#getClient <em>Client</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ModuleElementImpl#getShared <em>Shared</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ModuleElementImpl#getServer <em>Server</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleElementImpl extends MinimalEObjectImpl.Container implements ModuleElement
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getClient() <em>Client</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClient()
   * @generated
   * @ordered
   */
  protected static final String CLIENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClient() <em>Client</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClient()
   * @generated
   * @ordered
   */
  protected String client = CLIENT_EDEFAULT;

  /**
   * The default value of the '{@link #getShared() <em>Shared</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShared()
   * @generated
   * @ordered
   */
  protected static final String SHARED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShared() <em>Shared</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShared()
   * @generated
   * @ordered
   */
  protected String shared = SHARED_EDEFAULT;

  /**
   * The default value of the '{@link #getServer() <em>Server</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServer()
   * @generated
   * @ordered
   */
  protected static final String SERVER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServer() <em>Server</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServer()
   * @generated
   * @ordered
   */
  protected String server = SERVER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SamlPackage.Literals.MODULE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.MODULE_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClient()
  {
    return client;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClient(String newClient)
  {
    String oldClient = client;
    client = newClient;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.MODULE_ELEMENT__CLIENT, oldClient, client));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShared()
  {
    return shared;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShared(String newShared)
  {
    String oldShared = shared;
    shared = newShared;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.MODULE_ELEMENT__SHARED, oldShared, shared));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServer()
  {
    return server;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServer(String newServer)
  {
    String oldServer = server;
    server = newServer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.MODULE_ELEMENT__SERVER, oldServer, server));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SamlPackage.MODULE_ELEMENT__NAME:
        return getName();
      case SamlPackage.MODULE_ELEMENT__CLIENT:
        return getClient();
      case SamlPackage.MODULE_ELEMENT__SHARED:
        return getShared();
      case SamlPackage.MODULE_ELEMENT__SERVER:
        return getServer();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SamlPackage.MODULE_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case SamlPackage.MODULE_ELEMENT__CLIENT:
        setClient((String)newValue);
        return;
      case SamlPackage.MODULE_ELEMENT__SHARED:
        setShared((String)newValue);
        return;
      case SamlPackage.MODULE_ELEMENT__SERVER:
        setServer((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SamlPackage.MODULE_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SamlPackage.MODULE_ELEMENT__CLIENT:
        setClient(CLIENT_EDEFAULT);
        return;
      case SamlPackage.MODULE_ELEMENT__SHARED:
        setShared(SHARED_EDEFAULT);
        return;
      case SamlPackage.MODULE_ELEMENT__SERVER:
        setServer(SERVER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SamlPackage.MODULE_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SamlPackage.MODULE_ELEMENT__CLIENT:
        return CLIENT_EDEFAULT == null ? client != null : !CLIENT_EDEFAULT.equals(client);
      case SamlPackage.MODULE_ELEMENT__SHARED:
        return SHARED_EDEFAULT == null ? shared != null : !SHARED_EDEFAULT.equals(shared);
      case SamlPackage.MODULE_ELEMENT__SERVER:
        return SERVER_EDEFAULT == null ? server != null : !SERVER_EDEFAULT.equals(server);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", client: ");
    result.append(client);
    result.append(", shared: ");
    result.append(shared);
    result.append(", server: ");
    result.append(server);
    result.append(')');
    return result.toString();
  }

} //ModuleElementImpl
