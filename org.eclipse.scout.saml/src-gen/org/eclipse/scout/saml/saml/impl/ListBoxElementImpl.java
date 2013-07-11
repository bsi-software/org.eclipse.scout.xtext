/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.ListBoxElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Box Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ListBoxElementImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ListBoxElementImpl#getLookup <em>Lookup</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ListBoxElementImpl#getGridHeight <em>Grid Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListBoxElementImpl extends GenericValueFieldElementImpl implements ListBoxElement
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
   * The cached value of the '{@link #getLookup() <em>Lookup</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLookup()
   * @generated
   * @ordered
   */
  protected LookupElement lookup;

  /**
   * The default value of the '{@link #getGridHeight() <em>Grid Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGridHeight()
   * @generated
   * @ordered
   */
  protected static final int GRID_HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getGridHeight() <em>Grid Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGridHeight()
   * @generated
   * @ordered
   */
  protected int gridHeight = GRID_HEIGHT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListBoxElementImpl()
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
    return SamlPackage.Literals.LIST_BOX_ELEMENT;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.LIST_BOX_ELEMENT__CODE, oldCode, code));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LIST_BOX_ELEMENT__CODE, oldCode, code));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.LIST_BOX_ELEMENT__LOOKUP, oldLookup, lookup));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LIST_BOX_ELEMENT__LOOKUP, oldLookup, lookup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getGridHeight()
  {
    return gridHeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGridHeight(int newGridHeight)
  {
    int oldGridHeight = gridHeight;
    gridHeight = newGridHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LIST_BOX_ELEMENT__GRID_HEIGHT, oldGridHeight, gridHeight));
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
      case SamlPackage.LIST_BOX_ELEMENT__CODE:
        if (resolve) return getCode();
        return basicGetCode();
      case SamlPackage.LIST_BOX_ELEMENT__LOOKUP:
        if (resolve) return getLookup();
        return basicGetLookup();
      case SamlPackage.LIST_BOX_ELEMENT__GRID_HEIGHT:
        return getGridHeight();
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
      case SamlPackage.LIST_BOX_ELEMENT__CODE:
        setCode((CodeElement)newValue);
        return;
      case SamlPackage.LIST_BOX_ELEMENT__LOOKUP:
        setLookup((LookupElement)newValue);
        return;
      case SamlPackage.LIST_BOX_ELEMENT__GRID_HEIGHT:
        setGridHeight((Integer)newValue);
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
      case SamlPackage.LIST_BOX_ELEMENT__CODE:
        setCode((CodeElement)null);
        return;
      case SamlPackage.LIST_BOX_ELEMENT__LOOKUP:
        setLookup((LookupElement)null);
        return;
      case SamlPackage.LIST_BOX_ELEMENT__GRID_HEIGHT:
        setGridHeight(GRID_HEIGHT_EDEFAULT);
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
      case SamlPackage.LIST_BOX_ELEMENT__CODE:
        return code != null;
      case SamlPackage.LIST_BOX_ELEMENT__LOOKUP:
        return lookup != null;
      case SamlPackage.LIST_BOX_ELEMENT__GRID_HEIGHT:
        return gridHeight != GRID_HEIGHT_EDEFAULT;
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
    result.append(" (gridHeight: ");
    result.append(gridHeight);
    result.append(')');
    return result.toString();
  }

} //ListBoxElementImpl
