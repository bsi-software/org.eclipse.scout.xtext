/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.scout.saml.saml.LogicExecAttribute;
import org.eclipse.scout.saml.saml.LogicOptionalProperties;
import org.eclipse.scout.saml.saml.RunAtAttribute;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Optional Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LogicOptionalPropertiesImpl#getRunat <em>Runat</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LogicOptionalPropertiesImpl#getExec <em>Exec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicOptionalPropertiesImpl extends MinimalEObjectImpl.Container implements LogicOptionalProperties
{
  /**
   * The cached value of the '{@link #getRunat() <em>Runat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunat()
   * @generated
   * @ordered
   */
  protected RunAtAttribute runat;

  /**
   * The cached value of the '{@link #getExec() <em>Exec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExec()
   * @generated
   * @ordered
   */
  protected LogicExecAttribute exec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicOptionalPropertiesImpl()
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
    return SamlPackage.Literals.LOGIC_OPTIONAL_PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunAtAttribute getRunat()
  {
    return runat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRunat(RunAtAttribute newRunat, NotificationChain msgs)
  {
    RunAtAttribute oldRunat = runat;
    runat = newRunat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_OPTIONAL_PROPERTIES__RUNAT, oldRunat, newRunat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRunat(RunAtAttribute newRunat)
  {
    if (newRunat != runat)
    {
      NotificationChain msgs = null;
      if (runat != null)
        msgs = ((InternalEObject)runat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.LOGIC_OPTIONAL_PROPERTIES__RUNAT, null, msgs);
      if (newRunat != null)
        msgs = ((InternalEObject)newRunat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.LOGIC_OPTIONAL_PROPERTIES__RUNAT, null, msgs);
      msgs = basicSetRunat(newRunat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_OPTIONAL_PROPERTIES__RUNAT, newRunat, newRunat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicExecAttribute getExec()
  {
    return exec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExec(LogicExecAttribute newExec, NotificationChain msgs)
  {
    LogicExecAttribute oldExec = exec;
    exec = newExec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_OPTIONAL_PROPERTIES__EXEC, oldExec, newExec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExec(LogicExecAttribute newExec)
  {
    if (newExec != exec)
    {
      NotificationChain msgs = null;
      if (exec != null)
        msgs = ((InternalEObject)exec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.LOGIC_OPTIONAL_PROPERTIES__EXEC, null, msgs);
      if (newExec != null)
        msgs = ((InternalEObject)newExec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.LOGIC_OPTIONAL_PROPERTIES__EXEC, null, msgs);
      msgs = basicSetExec(newExec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LOGIC_OPTIONAL_PROPERTIES__EXEC, newExec, newExec));
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
      case SamlPackage.LOGIC_OPTIONAL_PROPERTIES__RUNAT:
        return basicSetRunat(null, msgs);
      case SamlPackage.LOGIC_OPTIONAL_PROPERTIES__EXEC:
        return basicSetExec(null, msgs);
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
      case SamlPackage.LOGIC_OPTIONAL_PROPERTIES__RUNAT:
        return getRunat();
      case SamlPackage.LOGIC_OPTIONAL_PROPERTIES__EXEC:
        return getExec();
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
      case SamlPackage.LOGIC_OPTIONAL_PROPERTIES__RUNAT:
        setRunat((RunAtAttribute)newValue);
        return;
      case SamlPackage.LOGIC_OPTIONAL_PROPERTIES__EXEC:
        setExec((LogicExecAttribute)newValue);
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
      case SamlPackage.LOGIC_OPTIONAL_PROPERTIES__RUNAT:
        setRunat((RunAtAttribute)null);
        return;
      case SamlPackage.LOGIC_OPTIONAL_PROPERTIES__EXEC:
        setExec((LogicExecAttribute)null);
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
      case SamlPackage.LOGIC_OPTIONAL_PROPERTIES__RUNAT:
        return runat != null;
      case SamlPackage.LOGIC_OPTIONAL_PROPERTIES__EXEC:
        return exec != null;
    }
    return super.eIsSet(featureID);
  }

} //LogicOptionalPropertiesImpl
