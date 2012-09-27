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
import org.eclipse.scout.saml.saml.SmartFieldElementProperties;
import org.eclipse.scout.saml.saml.SmartfieldElementCodeAttribute;
import org.eclipse.scout.saml.saml.SmartfieldElementLookupAttribute;
import org.eclipse.scout.saml.saml.SmartfieldElementValueTypeAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart Field Element Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.SmartFieldElementPropertiesImpl#getValueFieldProperties <em>Value Field Properties</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.SmartFieldElementPropertiesImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.SmartFieldElementPropertiesImpl#getValue_type <em>Value type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.SmartFieldElementPropertiesImpl#getLookup <em>Lookup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmartFieldElementPropertiesImpl extends MinimalEObjectImpl.Container implements SmartFieldElementProperties
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
   * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected SmartfieldElementCodeAttribute code;

  /**
   * The cached value of the '{@link #getValue_type() <em>Value type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue_type()
   * @generated
   * @ordered
   */
  protected SmartfieldElementValueTypeAttribute value_type;

  /**
   * The cached value of the '{@link #getLookup() <em>Lookup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLookup()
   * @generated
   * @ordered
   */
  protected SmartfieldElementLookupAttribute lookup;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SmartFieldElementPropertiesImpl()
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
    return SamlPackage.Literals.SMART_FIELD_ELEMENT_PROPERTIES;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES, oldValueFieldProperties, newValueFieldProperties);
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
        msgs = ((InternalEObject)valueFieldProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES, null, msgs);
      if (newValueFieldProperties != null)
        msgs = ((InternalEObject)newValueFieldProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES, null, msgs);
      msgs = basicSetValueFieldProperties(newValueFieldProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES, newValueFieldProperties, newValueFieldProperties));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartfieldElementCodeAttribute getCode()
  {
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCode(SmartfieldElementCodeAttribute newCode, NotificationChain msgs)
  {
    SmartfieldElementCodeAttribute oldCode = code;
    code = newCode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__CODE, oldCode, newCode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCode(SmartfieldElementCodeAttribute newCode)
  {
    if (newCode != code)
    {
      NotificationChain msgs = null;
      if (code != null)
        msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__CODE, null, msgs);
      if (newCode != null)
        msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__CODE, null, msgs);
      msgs = basicSetCode(newCode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__CODE, newCode, newCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartfieldElementValueTypeAttribute getValue_type()
  {
    return value_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue_type(SmartfieldElementValueTypeAttribute newValue_type, NotificationChain msgs)
  {
    SmartfieldElementValueTypeAttribute oldValue_type = value_type;
    value_type = newValue_type;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_TYPE, oldValue_type, newValue_type);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue_type(SmartfieldElementValueTypeAttribute newValue_type)
  {
    if (newValue_type != value_type)
    {
      NotificationChain msgs = null;
      if (value_type != null)
        msgs = ((InternalEObject)value_type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_TYPE, null, msgs);
      if (newValue_type != null)
        msgs = ((InternalEObject)newValue_type).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_TYPE, null, msgs);
      msgs = basicSetValue_type(newValue_type, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_TYPE, newValue_type, newValue_type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartfieldElementLookupAttribute getLookup()
  {
    return lookup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLookup(SmartfieldElementLookupAttribute newLookup, NotificationChain msgs)
  {
    SmartfieldElementLookupAttribute oldLookup = lookup;
    lookup = newLookup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__LOOKUP, oldLookup, newLookup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLookup(SmartfieldElementLookupAttribute newLookup)
  {
    if (newLookup != lookup)
    {
      NotificationChain msgs = null;
      if (lookup != null)
        msgs = ((InternalEObject)lookup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__LOOKUP, null, msgs);
      if (newLookup != null)
        msgs = ((InternalEObject)newLookup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__LOOKUP, null, msgs);
      msgs = basicSetLookup(newLookup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__LOOKUP, newLookup, newLookup));
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
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES:
        return basicSetValueFieldProperties(null, msgs);
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__CODE:
        return basicSetCode(null, msgs);
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_TYPE:
        return basicSetValue_type(null, msgs);
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__LOOKUP:
        return basicSetLookup(null, msgs);
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
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES:
        return getValueFieldProperties();
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__CODE:
        return getCode();
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_TYPE:
        return getValue_type();
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__LOOKUP:
        return getLookup();
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
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES:
        setValueFieldProperties((AbstractValueFieldProperties)newValue);
        return;
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__CODE:
        setCode((SmartfieldElementCodeAttribute)newValue);
        return;
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_TYPE:
        setValue_type((SmartfieldElementValueTypeAttribute)newValue);
        return;
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__LOOKUP:
        setLookup((SmartfieldElementLookupAttribute)newValue);
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
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES:
        setValueFieldProperties((AbstractValueFieldProperties)null);
        return;
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__CODE:
        setCode((SmartfieldElementCodeAttribute)null);
        return;
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_TYPE:
        setValue_type((SmartfieldElementValueTypeAttribute)null);
        return;
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__LOOKUP:
        setLookup((SmartfieldElementLookupAttribute)null);
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
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_FIELD_PROPERTIES:
        return valueFieldProperties != null;
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__CODE:
        return code != null;
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__VALUE_TYPE:
        return value_type != null;
      case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES__LOOKUP:
        return lookup != null;
    }
    return super.eIsSet(featureID);
  }

} //SmartFieldElementPropertiesImpl
