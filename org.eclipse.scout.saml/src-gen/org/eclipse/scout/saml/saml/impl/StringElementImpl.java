/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.LeafElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.StringElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.StringElementImpl#getMaster <em>Master</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringElementImpl extends LeafElementImpl implements StringElement
{
  /**
   * The cached value of the '{@link #getMaster() <em>Master</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaster()
   * @generated
   * @ordered
   */
  protected LeafElement master;

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
  public LeafElement getMaster()
  {
    if (master != null && master.eIsProxy())
    {
      InternalEObject oldMaster = (InternalEObject)master;
      master = (LeafElement)eResolveProxy(oldMaster);
      if (master != oldMaster)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.STRING_ELEMENT__MASTER, oldMaster, master));
      }
    }
    return master;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeafElement basicGetMaster()
  {
    return master;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaster(LeafElement newMaster)
  {
    LeafElement oldMaster = master;
    master = newMaster;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.STRING_ELEMENT__MASTER, oldMaster, master));
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
      case SamlPackage.STRING_ELEMENT__MASTER:
        if (resolve) return getMaster();
        return basicGetMaster();
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
      case SamlPackage.STRING_ELEMENT__MASTER:
        setMaster((LeafElement)newValue);
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
      case SamlPackage.STRING_ELEMENT__MASTER:
        setMaster((LeafElement)null);
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
      case SamlPackage.STRING_ELEMENT__MASTER:
        return master != null;
    }
    return super.eIsSet(featureID);
  }

} //StringElementImpl
