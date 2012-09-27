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
import org.eclipse.scout.saml.saml.AbstractValueFieldProperties;
import org.eclipse.scout.saml.saml.MandatoryAttribue;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Value Field Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.AbstractValueFieldPropertiesImpl#getFieldproperties <em>Fieldproperties</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.AbstractValueFieldPropertiesImpl#getMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractValueFieldPropertiesImpl extends MinimalEObjectImpl.Container implements AbstractValueFieldProperties
{
  /**
   * The cached value of the '{@link #getFieldproperties() <em>Fieldproperties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldproperties()
   * @generated
   * @ordered
   */
  protected AbstractFieldProperties fieldproperties;

  /**
   * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMandatory()
   * @generated
   * @ordered
   */
  protected MandatoryAttribue mandatory;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractValueFieldPropertiesImpl()
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
    return SamlPackage.Literals.ABSTRACT_VALUE_FIELD_PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractFieldProperties getFieldproperties()
  {
    return fieldproperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFieldproperties(AbstractFieldProperties newFieldproperties, NotificationChain msgs)
  {
    AbstractFieldProperties oldFieldproperties = fieldproperties;
    fieldproperties = newFieldproperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__FIELDPROPERTIES, oldFieldproperties, newFieldproperties);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldproperties(AbstractFieldProperties newFieldproperties)
  {
    if (newFieldproperties != fieldproperties)
    {
      NotificationChain msgs = null;
      if (fieldproperties != null)
        msgs = ((InternalEObject)fieldproperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__FIELDPROPERTIES, null, msgs);
      if (newFieldproperties != null)
        msgs = ((InternalEObject)newFieldproperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__FIELDPROPERTIES, null, msgs);
      msgs = basicSetFieldproperties(newFieldproperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__FIELDPROPERTIES, newFieldproperties, newFieldproperties));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MandatoryAttribue getMandatory()
  {
    return mandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMandatory(MandatoryAttribue newMandatory, NotificationChain msgs)
  {
    MandatoryAttribue oldMandatory = mandatory;
    mandatory = newMandatory;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__MANDATORY, oldMandatory, newMandatory);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMandatory(MandatoryAttribue newMandatory)
  {
    if (newMandatory != mandatory)
    {
      NotificationChain msgs = null;
      if (mandatory != null)
        msgs = ((InternalEObject)mandatory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__MANDATORY, null, msgs);
      if (newMandatory != null)
        msgs = ((InternalEObject)newMandatory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__MANDATORY, null, msgs);
      msgs = basicSetMandatory(newMandatory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__MANDATORY, newMandatory, newMandatory));
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
      case SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__FIELDPROPERTIES:
        return basicSetFieldproperties(null, msgs);
      case SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__MANDATORY:
        return basicSetMandatory(null, msgs);
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
      case SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__FIELDPROPERTIES:
        return getFieldproperties();
      case SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__MANDATORY:
        return getMandatory();
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
      case SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__FIELDPROPERTIES:
        setFieldproperties((AbstractFieldProperties)newValue);
        return;
      case SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__MANDATORY:
        setMandatory((MandatoryAttribue)newValue);
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
      case SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__FIELDPROPERTIES:
        setFieldproperties((AbstractFieldProperties)null);
        return;
      case SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__MANDATORY:
        setMandatory((MandatoryAttribue)null);
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
      case SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__FIELDPROPERTIES:
        return fieldproperties != null;
      case SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES__MANDATORY:
        return mandatory != null;
    }
    return super.eIsSet(featureID);
  }

} //AbstractValueFieldPropertiesImpl
