/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.scout.saml.saml.JavaCodeElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.LogicType;
import org.eclipse.scout.saml.saml.SamlPackage;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LogicElementImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LogicElementImpl#getRunat <em>Runat</em>}</li>
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
   * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected static final LogicType EVENT_EDEFAULT = LogicType.GLOBAL;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected LogicType event = EVENT_EDEFAULT;

  /**
   * The default value of the '{@link #getRunat() <em>Runat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunat()
   * @generated
   * @ordered
   */
  protected static final String RUNAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRunat() <em>Runat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunat()
   * @generated
   * @ordered
   */
  protected String runat = RUNAT_EDEFAULT;

  /**
   * The cached value of the '{@link #getExec() <em>Exec</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExec()
   * @generated
   * @ordered
   */
  protected JavaCodeElement exec;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected XExpression source;

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
  public LogicType getEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(LogicType newEvent)
  {
    LogicType oldEvent = event;
    event = newEvent == null ? EVENT_EDEFAULT : newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_ELEMENT__EVENT, oldEvent, event));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRunat()
  {
    return runat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRunat(String newRunat)
  {
    String oldRunat = runat;
    runat = newRunat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_ELEMENT__RUNAT, oldRunat, runat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaCodeElement getExec()
  {
    if (exec != null && exec.eIsProxy())
    {
      InternalEObject oldExec = (InternalEObject)exec;
      exec = (JavaCodeElement)eResolveProxy(oldExec);
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
  public JavaCodeElement basicGetExec()
  {
    return exec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExec(JavaCodeElement newExec)
  {
    JavaCodeElement oldExec = exec;
    exec = newExec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_ELEMENT__EXEC, oldExec, exec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(XExpression newSource, NotificationChain msgs)
  {
    XExpression oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_ELEMENT__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(XExpression newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.LOGIC_ELEMENT__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.LOGIC_ELEMENT__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_ELEMENT__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SamlPackage.LOGIC_ELEMENT__SOURCE:
        return basicSetSource(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SamlPackage.LOGIC_ELEMENT__EVENT:
        return getEvent();
      case SamlPackage.LOGIC_ELEMENT__RUNAT:
        return getRunat();
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
      case SamlPackage.LOGIC_ELEMENT__EVENT:
        setEvent((LogicType)newValue);
        return;
      case SamlPackage.LOGIC_ELEMENT__RUNAT:
        setRunat((String)newValue);
        return;
      case SamlPackage.LOGIC_ELEMENT__EXEC:
        setExec((JavaCodeElement)newValue);
        return;
      case SamlPackage.LOGIC_ELEMENT__SOURCE:
        setSource((XExpression)newValue);
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
      case SamlPackage.LOGIC_ELEMENT__EVENT:
        setEvent(EVENT_EDEFAULT);
        return;
      case SamlPackage.LOGIC_ELEMENT__RUNAT:
        setRunat(RUNAT_EDEFAULT);
        return;
      case SamlPackage.LOGIC_ELEMENT__EXEC:
        setExec((JavaCodeElement)null);
        return;
      case SamlPackage.LOGIC_ELEMENT__SOURCE:
        setSource((XExpression)null);
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
      case SamlPackage.LOGIC_ELEMENT__EVENT:
        return event != EVENT_EDEFAULT;
      case SamlPackage.LOGIC_ELEMENT__RUNAT:
        return RUNAT_EDEFAULT == null ? runat != null : !RUNAT_EDEFAULT.equals(runat);
      case SamlPackage.LOGIC_ELEMENT__EXEC:
        return exec != null;
      case SamlPackage.LOGIC_ELEMENT__SOURCE:
        return source != null;
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
    result.append(" (event: ");
    result.append(event);
    result.append(", runat: ");
    result.append(runat);
    result.append(')');
    return result.toString();
  }

} //LogicElementImpl
