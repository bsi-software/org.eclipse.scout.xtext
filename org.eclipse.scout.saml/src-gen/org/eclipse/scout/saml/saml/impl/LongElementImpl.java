/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LongElementImpl#getHorizontalAlign <em>Horizontal Align</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LongElementImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LongElementImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LongElementImpl#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LongElementImpl extends ValueFieldElementImpl implements LongElement
{
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
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final int MIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected int min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final int MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected int max = MAX_EDEFAULT;

  /**
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected static final String FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected String format = FORMAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LongElementImpl()
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
    return SamlPackage.Literals.LONG_ELEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LONG_ELEMENT__HORIZONTAL_ALIGN, oldHorizontalAlign, horizontalAlign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(int newMin)
  {
    int oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LONG_ELEMENT__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(int newMax)
  {
    int oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LONG_ELEMENT__MAX, oldMax, max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(String newFormat)
  {
    String oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LONG_ELEMENT__FORMAT, oldFormat, format));
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
      case SamlPackage.LONG_ELEMENT__HORIZONTAL_ALIGN:
        return getHorizontalAlign();
      case SamlPackage.LONG_ELEMENT__MIN:
        return getMin();
      case SamlPackage.LONG_ELEMENT__MAX:
        return getMax();
      case SamlPackage.LONG_ELEMENT__FORMAT:
        return getFormat();
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
      case SamlPackage.LONG_ELEMENT__HORIZONTAL_ALIGN:
        setHorizontalAlign((String)newValue);
        return;
      case SamlPackage.LONG_ELEMENT__MIN:
        setMin((Integer)newValue);
        return;
      case SamlPackage.LONG_ELEMENT__MAX:
        setMax((Integer)newValue);
        return;
      case SamlPackage.LONG_ELEMENT__FORMAT:
        setFormat((String)newValue);
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
      case SamlPackage.LONG_ELEMENT__HORIZONTAL_ALIGN:
        setHorizontalAlign(HORIZONTAL_ALIGN_EDEFAULT);
        return;
      case SamlPackage.LONG_ELEMENT__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case SamlPackage.LONG_ELEMENT__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case SamlPackage.LONG_ELEMENT__FORMAT:
        setFormat(FORMAT_EDEFAULT);
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
      case SamlPackage.LONG_ELEMENT__HORIZONTAL_ALIGN:
        return HORIZONTAL_ALIGN_EDEFAULT == null ? horizontalAlign != null : !HORIZONTAL_ALIGN_EDEFAULT.equals(horizontalAlign);
      case SamlPackage.LONG_ELEMENT__MIN:
        return min != MIN_EDEFAULT;
      case SamlPackage.LONG_ELEMENT__MAX:
        return max != MAX_EDEFAULT;
      case SamlPackage.LONG_ELEMENT__FORMAT:
        return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
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
    result.append(" (horizontalAlign: ");
    result.append(horizontalAlign);
    result.append(", min: ");
    result.append(min);
    result.append(", max: ");
    result.append(max);
    result.append(", format: ");
    result.append(format);
    result.append(')');
    return result.toString();
  }

} //LongElementImpl
