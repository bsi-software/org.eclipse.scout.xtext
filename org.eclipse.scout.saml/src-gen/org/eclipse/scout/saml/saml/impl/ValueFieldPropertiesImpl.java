/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.scout.saml.saml.FormFieldProperties;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.ValueFieldProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Field Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ValueFieldPropertiesImpl#getFormFieldProperties <em>Form Field Properties</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ValueFieldPropertiesImpl#getMandatory <em>Mandatory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueFieldPropertiesImpl extends MinimalEObjectImpl.Container implements ValueFieldProperties
{
  /**
   * The cached value of the '{@link #getFormFieldProperties() <em>Form Field Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormFieldProperties()
   * @generated
   * @ordered
   */
  protected FormFieldProperties formFieldProperties;

  /**
   * The default value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMandatory()
   * @generated
   * @ordered
   */
  protected static final String MANDATORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMandatory()
   * @generated
   * @ordered
   */
  protected String mandatory = MANDATORY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueFieldPropertiesImpl()
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
    return SamlPackage.Literals.VALUE_FIELD_PROPERTIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormFieldProperties getFormFieldProperties()
  {
    return formFieldProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormFieldProperties(FormFieldProperties newFormFieldProperties, NotificationChain msgs)
  {
    FormFieldProperties oldFormFieldProperties = formFieldProperties;
    formFieldProperties = newFormFieldProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.VALUE_FIELD_PROPERTIES__FORM_FIELD_PROPERTIES, oldFormFieldProperties, newFormFieldProperties);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormFieldProperties(FormFieldProperties newFormFieldProperties)
  {
    if (newFormFieldProperties != formFieldProperties)
    {
      NotificationChain msgs = null;
      if (formFieldProperties != null)
        msgs = ((InternalEObject)formFieldProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.VALUE_FIELD_PROPERTIES__FORM_FIELD_PROPERTIES, null, msgs);
      if (newFormFieldProperties != null)
        msgs = ((InternalEObject)newFormFieldProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.VALUE_FIELD_PROPERTIES__FORM_FIELD_PROPERTIES, null, msgs);
      msgs = basicSetFormFieldProperties(newFormFieldProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.VALUE_FIELD_PROPERTIES__FORM_FIELD_PROPERTIES, newFormFieldProperties, newFormFieldProperties));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMandatory()
  {
    return mandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMandatory(String newMandatory)
  {
    String oldMandatory = mandatory;
    mandatory = newMandatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.VALUE_FIELD_PROPERTIES__MANDATORY, oldMandatory, mandatory));
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
      case SamlPackage.VALUE_FIELD_PROPERTIES__FORM_FIELD_PROPERTIES:
        return basicSetFormFieldProperties(null, msgs);
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
      case SamlPackage.VALUE_FIELD_PROPERTIES__FORM_FIELD_PROPERTIES:
        return getFormFieldProperties();
      case SamlPackage.VALUE_FIELD_PROPERTIES__MANDATORY:
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
      case SamlPackage.VALUE_FIELD_PROPERTIES__FORM_FIELD_PROPERTIES:
        setFormFieldProperties((FormFieldProperties)newValue);
        return;
      case SamlPackage.VALUE_FIELD_PROPERTIES__MANDATORY:
        setMandatory((String)newValue);
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
      case SamlPackage.VALUE_FIELD_PROPERTIES__FORM_FIELD_PROPERTIES:
        setFormFieldProperties((FormFieldProperties)null);
        return;
      case SamlPackage.VALUE_FIELD_PROPERTIES__MANDATORY:
        setMandatory(MANDATORY_EDEFAULT);
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
      case SamlPackage.VALUE_FIELD_PROPERTIES__FORM_FIELD_PROPERTIES:
        return formFieldProperties != null;
      case SamlPackage.VALUE_FIELD_PROPERTIES__MANDATORY:
        return MANDATORY_EDEFAULT == null ? mandatory != null : !MANDATORY_EDEFAULT.equals(mandatory);
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
    result.append(" (mandatory: ");
    result.append(mandatory);
    result.append(')');
    return result.toString();
  }

} //ValueFieldPropertiesImpl
