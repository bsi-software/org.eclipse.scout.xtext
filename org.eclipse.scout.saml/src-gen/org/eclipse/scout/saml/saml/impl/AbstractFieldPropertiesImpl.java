/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.scout.saml.saml.AbstractFieldProperties;
import org.eclipse.scout.saml.saml.EnabledAttribue;
import org.eclipse.scout.saml.saml.MasterAttribute;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TextAttribute;
import org.eclipse.scout.saml.saml.VisibleAttribue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Field Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.AbstractFieldPropertiesImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.AbstractFieldPropertiesImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.AbstractFieldPropertiesImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.AbstractFieldPropertiesImpl#getEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractFieldPropertiesImpl extends MinimalEObjectImpl.Container implements AbstractFieldProperties
{
  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected TextAttribute text;

  /**
   * The cached value of the '{@link #getVisible() <em>Visible</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisible()
   * @generated
   * @ordered
   */
  protected VisibleAttribue visible;

  /**
   * The cached value of the '{@link #getMaster() <em>Master</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaster()
   * @generated
   * @ordered
   */
  protected MasterAttribute master;

  /**
   * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnabled()
   * @generated
   * @ordered
   */
  protected EnabledAttribue enabled;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractFieldPropertiesImpl()
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
    return SamlPackage.Literals.ABSTRACT_FIELD_PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextAttribute getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(TextAttribute newText, NotificationChain msgs)
  {
    TextAttribute oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.ABSTRACT_FIELD_PROPERTIES__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(TextAttribute newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.ABSTRACT_FIELD_PROPERTIES__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.ABSTRACT_FIELD_PROPERTIES__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.ABSTRACT_FIELD_PROPERTIES__TEXT, newText, newText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisibleAttribue getVisible()
  {
    return visible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVisible(VisibleAttribue newVisible, NotificationChain msgs)
  {
    VisibleAttribue oldVisible = visible;
    visible = newVisible;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.ABSTRACT_FIELD_PROPERTIES__VISIBLE, oldVisible, newVisible);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisible(VisibleAttribue newVisible)
  {
    if (newVisible != visible)
    {
      NotificationChain msgs = null;
      if (visible != null)
        msgs = ((InternalEObject)visible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.ABSTRACT_FIELD_PROPERTIES__VISIBLE, null, msgs);
      if (newVisible != null)
        msgs = ((InternalEObject)newVisible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.ABSTRACT_FIELD_PROPERTIES__VISIBLE, null, msgs);
      msgs = basicSetVisible(newVisible, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.ABSTRACT_FIELD_PROPERTIES__VISIBLE, newVisible, newVisible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MasterAttribute getMaster()
  {
    return master;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaster(MasterAttribute newMaster, NotificationChain msgs)
  {
    MasterAttribute oldMaster = master;
    master = newMaster;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.ABSTRACT_FIELD_PROPERTIES__MASTER, oldMaster, newMaster);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaster(MasterAttribute newMaster)
  {
    if (newMaster != master)
    {
      NotificationChain msgs = null;
      if (master != null)
        msgs = ((InternalEObject)master).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.ABSTRACT_FIELD_PROPERTIES__MASTER, null, msgs);
      if (newMaster != null)
        msgs = ((InternalEObject)newMaster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.ABSTRACT_FIELD_PROPERTIES__MASTER, null, msgs);
      msgs = basicSetMaster(newMaster, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.ABSTRACT_FIELD_PROPERTIES__MASTER, newMaster, newMaster));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnabledAttribue getEnabled()
  {
    return enabled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnabled(EnabledAttribue newEnabled, NotificationChain msgs)
  {
    EnabledAttribue oldEnabled = enabled;
    enabled = newEnabled;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.ABSTRACT_FIELD_PROPERTIES__ENABLED, oldEnabled, newEnabled);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnabled(EnabledAttribue newEnabled)
  {
    if (newEnabled != enabled)
    {
      NotificationChain msgs = null;
      if (enabled != null)
        msgs = ((InternalEObject)enabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.ABSTRACT_FIELD_PROPERTIES__ENABLED, null, msgs);
      if (newEnabled != null)
        msgs = ((InternalEObject)newEnabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.ABSTRACT_FIELD_PROPERTIES__ENABLED, null, msgs);
      msgs = basicSetEnabled(newEnabled, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.ABSTRACT_FIELD_PROPERTIES__ENABLED, newEnabled, newEnabled));
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
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__TEXT:
        return basicSetText(null, msgs);
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__VISIBLE:
        return basicSetVisible(null, msgs);
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__MASTER:
        return basicSetMaster(null, msgs);
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__ENABLED:
        return basicSetEnabled(null, msgs);
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
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__TEXT:
        return getText();
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__VISIBLE:
        return getVisible();
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__MASTER:
        return getMaster();
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__ENABLED:
        return getEnabled();
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
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__TEXT:
        setText((TextAttribute)newValue);
        return;
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__VISIBLE:
        setVisible((VisibleAttribue)newValue);
        return;
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__MASTER:
        setMaster((MasterAttribute)newValue);
        return;
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__ENABLED:
        setEnabled((EnabledAttribue)newValue);
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
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__TEXT:
        setText((TextAttribute)null);
        return;
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__VISIBLE:
        setVisible((VisibleAttribue)null);
        return;
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__MASTER:
        setMaster((MasterAttribute)null);
        return;
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__ENABLED:
        setEnabled((EnabledAttribue)null);
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
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__TEXT:
        return text != null;
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__VISIBLE:
        return visible != null;
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__MASTER:
        return master != null;
      case SamlPackage.ABSTRACT_FIELD_PROPERTIES__ENABLED:
        return enabled != null;
    }
    return super.eIsSet(featureID);
  }

} //AbstractFieldPropertiesImpl
