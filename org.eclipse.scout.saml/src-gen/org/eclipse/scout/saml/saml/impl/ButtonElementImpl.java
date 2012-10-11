/**
 */
package org.eclipse.scout.saml.saml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.scout.saml.saml.ButtonElement;
import org.eclipse.scout.saml.saml.MenuElement;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ButtonElementImpl#getProcessButton <em>Process Button</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ButtonElementImpl#getMenus <em>Menus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButtonElementImpl extends FormFieldElementImpl implements ButtonElement
{
  /**
   * The default value of the '{@link #getProcessButton() <em>Process Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessButton()
   * @generated
   * @ordered
   */
  protected static final String PROCESS_BUTTON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcessButton() <em>Process Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessButton()
   * @generated
   * @ordered
   */
  protected String processButton = PROCESS_BUTTON_EDEFAULT;

  /**
   * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenus()
   * @generated
   * @ordered
   */
  protected EList<MenuElement> menus;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ButtonElementImpl()
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
    return SamlPackage.Literals.BUTTON_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProcessButton()
  {
    return processButton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessButton(String newProcessButton)
  {
    String oldProcessButton = processButton;
    processButton = newProcessButton;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.BUTTON_ELEMENT__PROCESS_BUTTON, oldProcessButton, processButton));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MenuElement> getMenus()
  {
    if (menus == null)
    {
      menus = new EObjectContainmentEList<MenuElement>(MenuElement.class, this, SamlPackage.BUTTON_ELEMENT__MENUS);
    }
    return menus;
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
      case SamlPackage.BUTTON_ELEMENT__MENUS:
        return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
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
      case SamlPackage.BUTTON_ELEMENT__PROCESS_BUTTON:
        return getProcessButton();
      case SamlPackage.BUTTON_ELEMENT__MENUS:
        return getMenus();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SamlPackage.BUTTON_ELEMENT__PROCESS_BUTTON:
        setProcessButton((String)newValue);
        return;
      case SamlPackage.BUTTON_ELEMENT__MENUS:
        getMenus().clear();
        getMenus().addAll((Collection<? extends MenuElement>)newValue);
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
      case SamlPackage.BUTTON_ELEMENT__PROCESS_BUTTON:
        setProcessButton(PROCESS_BUTTON_EDEFAULT);
        return;
      case SamlPackage.BUTTON_ELEMENT__MENUS:
        getMenus().clear();
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
      case SamlPackage.BUTTON_ELEMENT__PROCESS_BUTTON:
        return PROCESS_BUTTON_EDEFAULT == null ? processButton != null : !PROCESS_BUTTON_EDEFAULT.equals(processButton);
      case SamlPackage.BUTTON_ELEMENT__MENUS:
        return menus != null && !menus.isEmpty();
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
    result.append(" (processButton: ");
    result.append(processButton);
    result.append(')');
    return result.toString();
  }

} //ButtonElementImpl
