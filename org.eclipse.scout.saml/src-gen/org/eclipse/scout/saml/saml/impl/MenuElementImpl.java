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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.MenuElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TranslationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.MenuElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.MenuElementImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.MenuElementImpl#getLogic <em>Logic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuElementImpl extends MinimalEObjectImpl.Container implements MenuElement
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getLogic() <em>Logic</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogic()
   * @generated
   * @ordered
   */
  protected EList<LogicElement> logic;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MenuElementImpl()
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
    return SamlPackage.Literals.MENU_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.MENU_ELEMENT__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.MENU_ELEMENT__TEXT, oldText, text));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.MENU_ELEMENT__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LogicElement> getLogic()
  {
    if (logic == null)
    {
      logic = new EObjectContainmentEList<LogicElement>(LogicElement.class, this, SamlPackage.MENU_ELEMENT__LOGIC);
    }
    return logic;
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
      case SamlPackage.MENU_ELEMENT__LOGIC:
        return ((InternalEList<?>)getLogic()).basicRemove(otherEnd, msgs);
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
      case SamlPackage.MENU_ELEMENT__NAME:
        return getName();
      case SamlPackage.MENU_ELEMENT__TEXT:
        if (resolve) return getText();
        return basicGetText();
      case SamlPackage.MENU_ELEMENT__LOGIC:
        return getLogic();
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
      case SamlPackage.MENU_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case SamlPackage.MENU_ELEMENT__TEXT:
        setText((TranslationElement)newValue);
        return;
      case SamlPackage.MENU_ELEMENT__LOGIC:
        getLogic().clear();
        getLogic().addAll((Collection<? extends LogicElement>)newValue);
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
      case SamlPackage.MENU_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SamlPackage.MENU_ELEMENT__TEXT:
        setText((TranslationElement)null);
        return;
      case SamlPackage.MENU_ELEMENT__LOGIC:
        getLogic().clear();
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
      case SamlPackage.MENU_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SamlPackage.MENU_ELEMENT__TEXT:
        return text != null;
      case SamlPackage.MENU_ELEMENT__LOGIC:
        return logic != null && !logic.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MenuElementImpl