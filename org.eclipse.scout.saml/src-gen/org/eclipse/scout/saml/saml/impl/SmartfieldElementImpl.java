/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.SmartfieldElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smartfield Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.SmartfieldElementImpl#getLookup <em>Lookup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmartfieldElementImpl extends ValueFieldElementImpl implements SmartfieldElement
{
  /**
   * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected CodeElement code;

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
   * The cached value of the '{@link #getLookup() <em>Lookup</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLookup()
   * @generated
   * @ordered
   */
  protected LookupElement lookup;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SmartfieldElementImpl()
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
    return SamlPackage.Literals.SMARTFIELD_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeElement getCode()
  {
    if (code != null && code.eIsProxy())
    {
      InternalEObject oldCode = (InternalEObject)code;
      code = (CodeElement)eResolveProxy(oldCode);
      if (code != oldCode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.SMARTFIELD_ELEMENT__CODE, oldCode, code));
      }
    }
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeElement basicGetCode()
  {
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCode(CodeElement newCode)
  {
    CodeElement oldCode = code;
    code = newCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.SMARTFIELD_ELEMENT__CODE, oldCode, code));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.SMARTFIELD_ELEMENT__VALUE_TYPE, oldValueType, valueType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LookupElement getLookup()
  {
    if (lookup != null && lookup.eIsProxy())
    {
      InternalEObject oldLookup = (InternalEObject)lookup;
      lookup = (LookupElement)eResolveProxy(oldLookup);
      if (lookup != oldLookup)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.SMARTFIELD_ELEMENT__LOOKUP, oldLookup, lookup));
      }
    }
    return lookup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LookupElement basicGetLookup()
  {
    return lookup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLookup(LookupElement newLookup)
  {
    LookupElement oldLookup = lookup;
    lookup = newLookup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.SMARTFIELD_ELEMENT__LOOKUP, oldLookup, lookup));
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
      case SamlPackage.SMARTFIELD_ELEMENT__CODE:
        if (resolve) return getCode();
        return basicGetCode();
      case SamlPackage.SMARTFIELD_ELEMENT__VALUE_TYPE:
        return getValueType();
      case SamlPackage.SMARTFIELD_ELEMENT__LOOKUP:
        if (resolve) return getLookup();
        return basicGetLookup();
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
      case SamlPackage.SMARTFIELD_ELEMENT__CODE:
        setCode((CodeElement)newValue);
        return;
      case SamlPackage.SMARTFIELD_ELEMENT__VALUE_TYPE:
        setValueType((String)newValue);
        return;
      case SamlPackage.SMARTFIELD_ELEMENT__LOOKUP:
        setLookup((LookupElement)newValue);
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
      case SamlPackage.SMARTFIELD_ELEMENT__CODE:
        setCode((CodeElement)null);
        return;
      case SamlPackage.SMARTFIELD_ELEMENT__VALUE_TYPE:
        setValueType(VALUE_TYPE_EDEFAULT);
        return;
      case SamlPackage.SMARTFIELD_ELEMENT__LOOKUP:
        setLookup((LookupElement)null);
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
      case SamlPackage.SMARTFIELD_ELEMENT__CODE:
        return code != null;
      case SamlPackage.SMARTFIELD_ELEMENT__VALUE_TYPE:
        return VALUE_TYPE_EDEFAULT == null ? valueType != null : !VALUE_TYPE_EDEFAULT.equals(valueType);
      case SamlPackage.SMARTFIELD_ELEMENT__LOOKUP:
        return lookup != null;
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

} //SmartfieldElementImpl
