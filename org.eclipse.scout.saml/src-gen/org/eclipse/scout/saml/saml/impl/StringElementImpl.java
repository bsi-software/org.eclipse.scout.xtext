/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.saml.ValueFieldProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.StringElementImpl#getValueFieldProperties <em>Value Field Properties</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.StringElementImpl#getMaxlen <em>Maxlen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringElementImpl extends ValueFieldElementImpl implements StringElement
{
  /**
   * The cached value of the '{@link #getValueFieldProperties() <em>Value Field Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueFieldProperties()
   * @generated
   * @ordered
   */
  protected ValueFieldProperties valueFieldProperties;

  /**
   * The default value of the '{@link #getMaxlen() <em>Maxlen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxlen()
   * @generated
   * @ordered
   */
  protected static final int MAXLEN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxlen() <em>Maxlen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxlen()
   * @generated
   * @ordered
   */
  protected int maxlen = MAXLEN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringElementImpl()
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
    return SamlPackage.Literals.STRING_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueFieldProperties getValueFieldProperties()
  {
    return valueFieldProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueFieldProperties(ValueFieldProperties newValueFieldProperties, NotificationChain msgs)
  {
    ValueFieldProperties oldValueFieldProperties = valueFieldProperties;
    valueFieldProperties = newValueFieldProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.STRING_ELEMENT__VALUE_FIELD_PROPERTIES, oldValueFieldProperties, newValueFieldProperties);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueFieldProperties(ValueFieldProperties newValueFieldProperties)
  {
    if (newValueFieldProperties != valueFieldProperties)
    {
      NotificationChain msgs = null;
      if (valueFieldProperties != null)
        msgs = ((InternalEObject)valueFieldProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.STRING_ELEMENT__VALUE_FIELD_PROPERTIES, null, msgs);
      if (newValueFieldProperties != null)
        msgs = ((InternalEObject)newValueFieldProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.STRING_ELEMENT__VALUE_FIELD_PROPERTIES, null, msgs);
      msgs = basicSetValueFieldProperties(newValueFieldProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.STRING_ELEMENT__VALUE_FIELD_PROPERTIES, newValueFieldProperties, newValueFieldProperties));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxlen()
  {
    return maxlen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxlen(int newMaxlen)
  {
    int oldMaxlen = maxlen;
    maxlen = newMaxlen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.STRING_ELEMENT__MAXLEN, oldMaxlen, maxlen));
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
      case SamlPackage.STRING_ELEMENT__VALUE_FIELD_PROPERTIES:
        return basicSetValueFieldProperties(null, msgs);
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
      case SamlPackage.STRING_ELEMENT__VALUE_FIELD_PROPERTIES:
        return getValueFieldProperties();
      case SamlPackage.STRING_ELEMENT__MAXLEN:
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
      case SamlPackage.STRING_ELEMENT__VALUE_FIELD_PROPERTIES:
        setValueFieldProperties((ValueFieldProperties)newValue);
        return;
      case SamlPackage.STRING_ELEMENT__MAXLEN:
        setMaxlen((Integer)newValue);
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
      case SamlPackage.STRING_ELEMENT__VALUE_FIELD_PROPERTIES:
        setValueFieldProperties((ValueFieldProperties)null);
        return;
      case SamlPackage.STRING_ELEMENT__MAXLEN:
        setMaxlen(MAXLEN_EDEFAULT);
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
      case SamlPackage.STRING_ELEMENT__VALUE_FIELD_PROPERTIES:
        return valueFieldProperties != null;
      case SamlPackage.STRING_ELEMENT__MAXLEN:
        return maxlen != MAXLEN_EDEFAULT;
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
    result.append(" (maxlen: ");
    result.append(maxlen);
    result.append(')');
    return result.toString();
  }

} //StringElementImpl
