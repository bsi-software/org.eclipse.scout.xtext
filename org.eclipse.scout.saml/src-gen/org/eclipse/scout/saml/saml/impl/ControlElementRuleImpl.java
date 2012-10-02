/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.scout.saml.saml.BooleanType;
import org.eclipse.scout.saml.saml.ControlElementRule;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TranslationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Element Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ControlElementRuleImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ControlElementRuleImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ControlElementRuleImpl#getVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlElementRuleImpl extends MinimalEObjectImpl.Container implements ControlElementRule
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
   * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnabled()
   * @generated
   * @ordered
   */
  protected static final BooleanType ENABLED_EDEFAULT = BooleanType.TRUE;

  /**
   * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnabled()
   * @generated
   * @ordered
   */
  protected BooleanType enabled = ENABLED_EDEFAULT;

  /**
   * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisible()
   * @generated
   * @ordered
   */
  protected static final BooleanType VISIBLE_EDEFAULT = BooleanType.TRUE;

  /**
   * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisible()
   * @generated
   * @ordered
   */
  protected BooleanType visible = VISIBLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlElementRuleImpl()
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
    return SamlPackage.Literals.CONTROL_ELEMENT_RULE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.CONTROL_ELEMENT_RULE__TEXT, oldText, text));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.CONTROL_ELEMENT_RULE__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanType getEnabled()
  {
    return enabled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnabled(BooleanType newEnabled)
  {
    BooleanType oldEnabled = enabled;
    enabled = newEnabled == null ? ENABLED_EDEFAULT : newEnabled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.CONTROL_ELEMENT_RULE__ENABLED, oldEnabled, enabled));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanType getVisible()
  {
    return visible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisible(BooleanType newVisible)
  {
    BooleanType oldVisible = visible;
    visible = newVisible == null ? VISIBLE_EDEFAULT : newVisible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.CONTROL_ELEMENT_RULE__VISIBLE, oldVisible, visible));
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
      case SamlPackage.CONTROL_ELEMENT_RULE__TEXT:
        if (resolve) return getText();
        return basicGetText();
      case SamlPackage.CONTROL_ELEMENT_RULE__ENABLED:
        return getEnabled();
      case SamlPackage.CONTROL_ELEMENT_RULE__VISIBLE:
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
      case SamlPackage.CONTROL_ELEMENT_RULE__TEXT:
        setText((TranslationElement)newValue);
        return;
      case SamlPackage.CONTROL_ELEMENT_RULE__ENABLED:
        setEnabled((BooleanType)newValue);
        return;
      case SamlPackage.CONTROL_ELEMENT_RULE__VISIBLE:
        setVisible((BooleanType)newValue);
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
      case SamlPackage.CONTROL_ELEMENT_RULE__TEXT:
        setText((TranslationElement)null);
        return;
      case SamlPackage.CONTROL_ELEMENT_RULE__ENABLED:
        setEnabled(ENABLED_EDEFAULT);
        return;
      case SamlPackage.CONTROL_ELEMENT_RULE__VISIBLE:
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
      case SamlPackage.CONTROL_ELEMENT_RULE__TEXT:
        return text != null;
      case SamlPackage.CONTROL_ELEMENT_RULE__ENABLED:
        return enabled != ENABLED_EDEFAULT;
      case SamlPackage.CONTROL_ELEMENT_RULE__VISIBLE:
        return visible != VISIBLE_EDEFAULT;
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
    result.append(" (enabled: ");
    result.append(enabled);
    result.append(", visible: ");
    result.append(visible);
    result.append(')');
    return result.toString();
  }

} //ControlElementRuleImpl
