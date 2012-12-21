/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.StringElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.StringElementImpl#getMaxlen <em>Maxlen</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.StringElementImpl#getGridHeight <em>Grid Height</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.StringElementImpl#getHorizontalAlign <em>Horizontal Align</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringElementImpl extends ValueFieldElementImpl implements StringElement
{
  /**
   * The default value of the '{@link #getMaxlen() <em>Maxlen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxlen()
   * @generated
   * @ordered
   */
  protected static final int MAXLEN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxlen() <em>Maxlen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxlen()
   * @generated
   * @ordered
   */
  protected int maxlen = MAXLEN_EDEFAULT;

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
   * The default value of the '{@link #getHorizontalAlign() <em>Horizontal Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorizontalAlign()
   * @generated
   * @ordered
   */
  protected static final String HORIZONTAL_ALIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHorizontalAlign() <em>Horizontal Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorizontalAlign()
   * @generated
   * @ordered
   */
  protected String horizontalAlign = HORIZONTAL_ALIGN_EDEFAULT;

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
  public int getMaxlen()
  {
    return maxlen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxlen(int newMaxlen)
  {
    int oldMaxlen = maxlen;
    maxlen = newMaxlen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.STRING_ELEMENT__MAXLEN, oldMaxlen, maxlen));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.STRING_ELEMENT__GRID_HEIGHT, oldGridHeight, gridHeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHorizontalAlign()
  {
    return horizontalAlign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorizontalAlign(String newHorizontalAlign)
  {
    String oldHorizontalAlign = horizontalAlign;
    horizontalAlign = newHorizontalAlign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.STRING_ELEMENT__HORIZONTAL_ALIGN, oldHorizontalAlign, horizontalAlign));
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
      case SamlPackage.STRING_ELEMENT__MAXLEN:
        return getMaxlen();
      case SamlPackage.STRING_ELEMENT__GRID_HEIGHT:
        return getGridHeight();
      case SamlPackage.STRING_ELEMENT__HORIZONTAL_ALIGN:
        return getHorizontalAlign();
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
      case SamlPackage.STRING_ELEMENT__MAXLEN:
        setMaxlen((Integer)newValue);
        return;
      case SamlPackage.STRING_ELEMENT__GRID_HEIGHT:
        setGridHeight((Integer)newValue);
        return;
      case SamlPackage.STRING_ELEMENT__HORIZONTAL_ALIGN:
        setHorizontalAlign((String)newValue);
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
      case SamlPackage.STRING_ELEMENT__MAXLEN:
        setMaxlen(MAXLEN_EDEFAULT);
        return;
      case SamlPackage.STRING_ELEMENT__GRID_HEIGHT:
        setGridHeight(GRID_HEIGHT_EDEFAULT);
        return;
      case SamlPackage.STRING_ELEMENT__HORIZONTAL_ALIGN:
        setHorizontalAlign(HORIZONTAL_ALIGN_EDEFAULT);
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
      case SamlPackage.STRING_ELEMENT__MAXLEN:
        return maxlen != MAXLEN_EDEFAULT;
      case SamlPackage.STRING_ELEMENT__GRID_HEIGHT:
        return gridHeight != GRID_HEIGHT_EDEFAULT;
      case SamlPackage.STRING_ELEMENT__HORIZONTAL_ALIGN:
        return HORIZONTAL_ALIGN_EDEFAULT == null ? horizontalAlign != null : !HORIZONTAL_ALIGN_EDEFAULT.equals(horizontalAlign);
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
    result.append(" (maxlen: ");
    result.append(maxlen);
    result.append(", gridHeight: ");
    result.append(gridHeight);
    result.append(", horizontalAlign: ");
    result.append(horizontalAlign);
    result.append(')');
    return result.toString();
  }

} //StringElementImpl
