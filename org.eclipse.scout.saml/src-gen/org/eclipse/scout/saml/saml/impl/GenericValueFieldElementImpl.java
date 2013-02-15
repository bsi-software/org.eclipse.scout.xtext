/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.GenericValueFieldElement;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Value Field Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.GenericValueFieldElementImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericValueFieldElementImpl extends ValueFieldElementImpl implements GenericValueFieldElement
{
  /**
   * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueType()
   * @generated
   * @ordered
   */
  protected static final String VALUE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueType()
   * @generated
   * @ordered
   */
  protected String valueType = VALUE_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericValueFieldElementImpl()
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
    return SamlPackage.Literals.GENERIC_VALUE_FIELD_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueType()
  {
    return valueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueType(String newValueType)
  {
    String oldValueType = valueType;
    valueType = newValueType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.GENERIC_VALUE_FIELD_ELEMENT__VALUE_TYPE, oldValueType, valueType));
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
      case SamlPackage.GENERIC_VALUE_FIELD_ELEMENT__VALUE_TYPE:
        return getValueType();
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
      case SamlPackage.GENERIC_VALUE_FIELD_ELEMENT__VALUE_TYPE:
        setValueType((String)newValue);
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
      case SamlPackage.GENERIC_VALUE_FIELD_ELEMENT__VALUE_TYPE:
        setValueType(VALUE_TYPE_EDEFAULT);
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
      case SamlPackage.GENERIC_VALUE_FIELD_ELEMENT__VALUE_TYPE:
        return VALUE_TYPE_EDEFAULT == null ? valueType != null : !VALUE_TYPE_EDEFAULT.equals(valueType);
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
    result.append(" (valueType: ");
    result.append(valueType);
    result.append(')');
    return result.toString();
  }

} //GenericValueFieldElementImpl
