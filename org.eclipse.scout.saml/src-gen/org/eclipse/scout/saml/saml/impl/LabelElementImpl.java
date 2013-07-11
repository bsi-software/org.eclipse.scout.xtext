/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.LabelElement;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LabelElementImpl#getWrapText <em>Wrap Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LabelElementImpl#getGridHeight <em>Grid Height</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LabelElementImpl#getHorizontalAlign <em>Horizontal Align</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelElementImpl extends ValueFieldElementImpl implements LabelElement
{
  /**
   * The default value of the '{@link #getWrapText() <em>Wrap Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrapText()
   * @generated
   * @ordered
   */
  protected static final String WRAP_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWrapText() <em>Wrap Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrapText()
   * @generated
   * @ordered
   */
  protected String wrapText = WRAP_TEXT_EDEFAULT;

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
  protected LabelElementImpl()
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
    return SamlPackage.Literals.LABEL_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWrapText()
  {
    return wrapText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWrapText(String newWrapText)
  {
    String oldWrapText = wrapText;
    wrapText = newWrapText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LABEL_ELEMENT__WRAP_TEXT, oldWrapText, wrapText));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LABEL_ELEMENT__GRID_HEIGHT, oldGridHeight, gridHeight));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LABEL_ELEMENT__HORIZONTAL_ALIGN, oldHorizontalAlign, horizontalAlign));
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
      case SamlPackage.LABEL_ELEMENT__WRAP_TEXT:
        return getWrapText();
      case SamlPackage.LABEL_ELEMENT__GRID_HEIGHT:
        return getGridHeight();
      case SamlPackage.LABEL_ELEMENT__HORIZONTAL_ALIGN:
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
      case SamlPackage.LABEL_ELEMENT__WRAP_TEXT:
        setWrapText((String)newValue);
        return;
      case SamlPackage.LABEL_ELEMENT__GRID_HEIGHT:
        setGridHeight((Integer)newValue);
        return;
      case SamlPackage.LABEL_ELEMENT__HORIZONTAL_ALIGN:
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
      case SamlPackage.LABEL_ELEMENT__WRAP_TEXT:
        setWrapText(WRAP_TEXT_EDEFAULT);
        return;
      case SamlPackage.LABEL_ELEMENT__GRID_HEIGHT:
        setGridHeight(GRID_HEIGHT_EDEFAULT);
        return;
      case SamlPackage.LABEL_ELEMENT__HORIZONTAL_ALIGN:
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
      case SamlPackage.LABEL_ELEMENT__WRAP_TEXT:
        return WRAP_TEXT_EDEFAULT == null ? wrapText != null : !WRAP_TEXT_EDEFAULT.equals(wrapText);
      case SamlPackage.LABEL_ELEMENT__GRID_HEIGHT:
        return gridHeight != GRID_HEIGHT_EDEFAULT;
      case SamlPackage.LABEL_ELEMENT__HORIZONTAL_ALIGN:
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
    result.append(" (wrapText: ");
    result.append(wrapText);
    result.append(", gridHeight: ");
    result.append(gridHeight);
    result.append(", horizontalAlign: ");
    result.append(horizontalAlign);
    result.append(')');
    return result.toString();
  }

} //LabelElementImpl
