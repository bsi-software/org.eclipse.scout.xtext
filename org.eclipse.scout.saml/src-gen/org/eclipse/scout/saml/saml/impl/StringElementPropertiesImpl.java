/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.scout.saml.saml.AbstractValueFieldProperties;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.StringElementMaxlenAttribute;
import org.eclipse.scout.saml.saml.StringElementProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Element Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.StringElementPropertiesImpl#getValueFieldProperties <em>Value Field Properties</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.StringElementPropertiesImpl#getMaxlen <em>Maxlen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringElementPropertiesImpl extends MinimalEObjectImpl.Container implements StringElementProperties
{
  /**
   * The cached value of the '{@link #getValueFieldProperties() <em>Value Field Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueFieldProperties()
   * @generated
   * @ordered
   */
  protected AbstractValueFieldProperties valueFieldProperties;

  /**
   * The cached value of the '{@link #getMaxlen() <em>Maxlen</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxlen()
   * @generated
   * @ordered
   */
  protected StringElementMaxlenAttribute maxlen;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringElementPropertiesImpl()
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
    return SamlPackage.Literals.STRING_ELEMENT_PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractValueFieldProperties getValueFieldProperties()
  {
    return valueFieldProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueFieldProperties(AbstractValueFieldProperties newValueFieldProperties, NotificationChain msgs)
  {
    AbstractValueFieldProperties oldValueFieldProperties = valueFieldProperties;
    valueFieldProperties = newValueFieldProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.STRING_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES, oldValueFieldProperties, newValueFieldProperties);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueFieldProperties(AbstractValueFieldProperties newValueFieldProperties)
  {
    if (newValueFieldProperties != valueFieldProperties)
    {
      NotificationChain msgs = null;
      if (valueFieldProperties != null)
        msgs = ((InternalEObject)valueFieldProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.STRING_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES, null, msgs);
      if (newValueFieldProperties != null)
        msgs = ((InternalEObject)newValueFieldProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.STRING_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES, null, msgs);
      msgs = basicSetValueFieldProperties(newValueFieldProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.STRING_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES, newValueFieldProperties, newValueFieldProperties));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringElementMaxlenAttribute getMaxlen()
  {
    return maxlen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaxlen(StringElementMaxlenAttribute newMaxlen, NotificationChain msgs)
  {
    StringElementMaxlenAttribute oldMaxlen = maxlen;
    maxlen = newMaxlen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.STRING_ELEMENT_PROPERTIES__MAXLEN, oldMaxlen, newMaxlen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxlen(StringElementMaxlenAttribute newMaxlen)
  {
    if (newMaxlen != maxlen)
    {
      NotificationChain msgs = null;
      if (maxlen != null)
        msgs = ((InternalEObject)maxlen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.STRING_ELEMENT_PROPERTIES__MAXLEN, null, msgs);
      if (newMaxlen != null)
        msgs = ((InternalEObject)newMaxlen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.STRING_ELEMENT_PROPERTIES__MAXLEN, null, msgs);
      msgs = basicSetMaxlen(newMaxlen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.STRING_ELEMENT_PROPERTIES__MAXLEN, newMaxlen, newMaxlen));
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
      case SamlPackage.STRING_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES:
        return basicSetValueFieldProperties(null, msgs);
      case SamlPackage.STRING_ELEMENT_PROPERTIES__MAXLEN:
        return basicSetMaxlen(null, msgs);
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
      case SamlPackage.STRING_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES:
        return getValueFieldProperties();
      case SamlPackage.STRING_ELEMENT_PROPERTIES__MAXLEN:
        return getMaxlen();
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
      case SamlPackage.STRING_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES:
        setValueFieldProperties((AbstractValueFieldProperties)newValue);
        return;
      case SamlPackage.STRING_ELEMENT_PROPERTIES__MAXLEN:
        setMaxlen((StringElementMaxlenAttribute)newValue);
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
      case SamlPackage.STRING_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES:
        setValueFieldProperties((AbstractValueFieldProperties)null);
        return;
      case SamlPackage.STRING_ELEMENT_PROPERTIES__MAXLEN:
        setMaxlen((StringElementMaxlenAttribute)null);
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
      case SamlPackage.STRING_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES:
        return valueFieldProperties != null;
      case SamlPackage.STRING_ELEMENT_PROPERTIES__MAXLEN:
        return maxlen != null;
    }
    return super.eIsSet(featureID);
  }

} //StringElementPropertiesImpl
