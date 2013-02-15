/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.RadioButtonElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TranslationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Button Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.RadioButtonElementImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.RadioButtonElementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.RadioButtonElementImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.RadioButtonElementImpl#getVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadioButtonElementImpl extends NamedTypeElementImpl implements RadioButtonElement
{
  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected TranslationElement text;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnabled()
   * @generated
   * @ordered
   */
  protected static final String ENABLED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnabled()
   * @generated
   * @ordered
   */
  protected String enabled = ENABLED_EDEFAULT;

  /**
   * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisible()
   * @generated
   * @ordered
   */
  protected static final String VISIBLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisible()
   * @generated
   * @ordered
   */
  protected String visible = VISIBLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RadioButtonElementImpl()
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
    return SamlPackage.Literals.RADIO_BUTTON_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TranslationElement getText()
  {
    if (text != null && text.eIsProxy())
    {
      InternalEObject oldText = (InternalEObject)text;
      text = (TranslationElement)eResolveProxy(oldText);
      if (text != oldText)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.RADIO_BUTTON_ELEMENT__TEXT, oldText, text));
      }
    }
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TranslationElement basicGetText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(TranslationElement newText)
  {
    TranslationElement oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.RADIO_BUTTON_ELEMENT__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.RADIO_BUTTON_ELEMENT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnabled()
  {
    return enabled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnabled(String newEnabled)
  {
    String oldEnabled = enabled;
    enabled = newEnabled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.RADIO_BUTTON_ELEMENT__ENABLED, oldEnabled, enabled));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVisible()
  {
    return visible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisible(String newVisible)
  {
    String oldVisible = visible;
    visible = newVisible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.RADIO_BUTTON_ELEMENT__VISIBLE, oldVisible, visible));
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
      case SamlPackage.RADIO_BUTTON_ELEMENT__TEXT:
        if (resolve) return getText();
        return basicGetText();
      case SamlPackage.RADIO_BUTTON_ELEMENT__VALUE:
        return getValue();
      case SamlPackage.RADIO_BUTTON_ELEMENT__ENABLED:
        return getEnabled();
      case SamlPackage.RADIO_BUTTON_ELEMENT__VISIBLE:
        return getVisible();
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
      case SamlPackage.RADIO_BUTTON_ELEMENT__TEXT:
        setText((TranslationElement)newValue);
        return;
      case SamlPackage.RADIO_BUTTON_ELEMENT__VALUE:
        setValue((String)newValue);
        return;
      case SamlPackage.RADIO_BUTTON_ELEMENT__ENABLED:
        setEnabled((String)newValue);
        return;
      case SamlPackage.RADIO_BUTTON_ELEMENT__VISIBLE:
        setVisible((String)newValue);
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
      case SamlPackage.RADIO_BUTTON_ELEMENT__TEXT:
        setText((TranslationElement)null);
        return;
      case SamlPackage.RADIO_BUTTON_ELEMENT__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case SamlPackage.RADIO_BUTTON_ELEMENT__ENABLED:
        setEnabled(ENABLED_EDEFAULT);
        return;
      case SamlPackage.RADIO_BUTTON_ELEMENT__VISIBLE:
        setVisible(VISIBLE_EDEFAULT);
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
      case SamlPackage.RADIO_BUTTON_ELEMENT__TEXT:
        return text != null;
      case SamlPackage.RADIO_BUTTON_ELEMENT__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case SamlPackage.RADIO_BUTTON_ELEMENT__ENABLED:
        return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
      case SamlPackage.RADIO_BUTTON_ELEMENT__VISIBLE:
        return VISIBLE_EDEFAULT == null ? visible != null : !VISIBLE_EDEFAULT.equals(visible);
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
    result.append(" (value: ");
    result.append(value);
    result.append(", enabled: ");
    result.append(enabled);
    result.append(", visible: ");
    result.append(visible);
    result.append(')');
    return result.toString();
  }

} //RadioButtonElementImpl
