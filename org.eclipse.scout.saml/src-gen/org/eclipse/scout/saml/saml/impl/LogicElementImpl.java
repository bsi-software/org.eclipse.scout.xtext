/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LogicElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LogicElementImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LogicElementImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LogicElementImpl#getExec <em>Exec</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LogicElementImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicElementImpl extends MinimalEObjectImpl.Container implements LogicElement
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
   * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected static final String EVENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected String event = EVENT_EDEFAULT;

  /**
   * The default value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlacement()
   * @generated
   * @ordered
   */
  protected static final String PLACEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlacement()
   * @generated
   * @ordered
   */
  protected String placement = PLACEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getExec() <em>Exec</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExec()
   * @generated
   * @ordered
   */
  protected LogicElement exec;

  /**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected String source = SOURCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicElementImpl()
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
    return SamlPackage.Literals.LOGIC_ELEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(String newEvent)
  {
    String oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_ELEMENT__EVENT, oldEvent, event));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPlacement()
  {
    return placement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlacement(String newPlacement)
  {
    String oldPlacement = placement;
    placement = newPlacement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_ELEMENT__PLACEMENT, oldPlacement, placement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicElement getExec()
  {
    if (exec != null && exec.eIsProxy())
    {
      InternalEObject oldExec = (InternalEObject)exec;
      exec = (LogicElement)eResolveProxy(oldExec);
      if (exec != oldExec)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.LOGIC_ELEMENT__EXEC, oldExec, exec));
      }
    }
    return exec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicElement basicGetExec()
  {
    return exec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExec(LogicElement newExec)
  {
    LogicElement oldExec = exec;
    exec = newExec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_ELEMENT__EXEC, oldExec, exec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(String newSource)
  {
    String oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_ELEMENT__SOURCE, oldSource, source));
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
      case SamlPackage.LOGIC_ELEMENT__NAME:
        return getName();
      case SamlPackage.LOGIC_ELEMENT__EVENT:
        return getEvent();
      case SamlPackage.LOGIC_ELEMENT__PLACEMENT:
        return getPlacement();
      case SamlPackage.LOGIC_ELEMENT__EXEC:
        if (resolve) return getExec();
        return basicGetExec();
      case SamlPackage.LOGIC_ELEMENT__SOURCE:
        return getSource();
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
      case SamlPackage.LOGIC_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case SamlPackage.LOGIC_ELEMENT__EVENT:
        setEvent((String)newValue);
        return;
      case SamlPackage.LOGIC_ELEMENT__PLACEMENT:
        setPlacement((String)newValue);
        return;
      case SamlPackage.LOGIC_ELEMENT__EXEC:
        setExec((LogicElement)newValue);
        return;
      case SamlPackage.LOGIC_ELEMENT__SOURCE:
        setSource((String)newValue);
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
      case SamlPackage.LOGIC_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SamlPackage.LOGIC_ELEMENT__EVENT:
        setEvent(EVENT_EDEFAULT);
        return;
      case SamlPackage.LOGIC_ELEMENT__PLACEMENT:
        setPlacement(PLACEMENT_EDEFAULT);
        return;
      case SamlPackage.LOGIC_ELEMENT__EXEC:
        setExec((LogicElement)null);
        return;
      case SamlPackage.LOGIC_ELEMENT__SOURCE:
        setSource(SOURCE_EDEFAULT);
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
      case SamlPackage.LOGIC_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SamlPackage.LOGIC_ELEMENT__EVENT:
        return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
      case SamlPackage.LOGIC_ELEMENT__PLACEMENT:
        return PLACEMENT_EDEFAULT == null ? placement != null : !PLACEMENT_EDEFAULT.equals(placement);
      case SamlPackage.LOGIC_ELEMENT__EXEC:
        return exec != null;
      case SamlPackage.LOGIC_ELEMENT__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
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
    result.append(", event: ");
    result.append(event);
    result.append(", placement: ");
    result.append(placement);
    result.append(", source: ");
    result.append(source);
    result.append(')');
    return result.toString();
  }

} //LogicElementImpl
