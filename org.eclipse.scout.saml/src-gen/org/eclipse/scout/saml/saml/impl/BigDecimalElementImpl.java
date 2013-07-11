/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.BigDecimalElement;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Big Decimal Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.BigDecimalElementImpl#getPercent <em>Percent</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.BigDecimalElementImpl#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.BigDecimalElementImpl#getHorizontalAlign <em>Horizontal Align</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.BigDecimalElementImpl#getFractionDigits <em>Fraction Digits</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.BigDecimalElementImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.BigDecimalElementImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.BigDecimalElementImpl#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BigDecimalElementImpl extends ValueFieldElementImpl implements BigDecimalElement
{
  /**
   * The default value of the '{@link #getPercent() <em>Percent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPercent()
   * @generated
   * @ordered
   */
  protected static final String PERCENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPercent() <em>Percent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPercent()
   * @generated
   * @ordered
   */
  protected String percent = PERCENT_EDEFAULT;

  /**
   * The default value of the '{@link #getGrouping() <em>Grouping</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGrouping()
   * @generated
   * @ordered
   */
  protected static final String GROUPING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGrouping() <em>Grouping</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGrouping()
   * @generated
   * @ordered
   */
  protected String grouping = GROUPING_EDEFAULT;

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
   * The default value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionDigits()
   * @generated
   * @ordered
   */
  protected static final int FRACTION_DIGITS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFractionDigits()
   * @generated
   * @ordered
   */
  protected int fractionDigits = FRACTION_DIGITS_EDEFAULT;

  /**
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final String MIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected String min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final String MAX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected String max = MAX_EDEFAULT;

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
  protected BigDecimalElementImpl()
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
    return SamlPackage.Literals.BIG_DECIMAL_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPercent()
  {
    return percent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPercent(String newPercent)
  {
    String oldPercent = percent;
    percent = newPercent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.BIG_DECIMAL_ELEMENT__PERCENT, oldPercent, percent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGrouping()
  {
    return grouping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGrouping(String newGrouping)
  {
    String oldGrouping = grouping;
    grouping = newGrouping;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.BIG_DECIMAL_ELEMENT__GROUPING, oldGrouping, grouping));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.BIG_DECIMAL_ELEMENT__HORIZONTAL_ALIGN, oldHorizontalAlign, horizontalAlign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFractionDigits()
  {
    return fractionDigits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFractionDigits(int newFractionDigits)
  {
    int oldFractionDigits = fractionDigits;
    fractionDigits = newFractionDigits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.BIG_DECIMAL_ELEMENT__FRACTION_DIGITS, oldFractionDigits, fractionDigits));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(String newMin)
  {
    String oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.BIG_DECIMAL_ELEMENT__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(String newMax)
  {
    String oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.BIG_DECIMAL_ELEMENT__MAX, oldMax, max));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.BIG_DECIMAL_ELEMENT__FORMAT, oldFormat, format));
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
      case SamlPackage.BIG_DECIMAL_ELEMENT__PERCENT:
        return getPercent();
      case SamlPackage.BIG_DECIMAL_ELEMENT__GROUPING:
        return getGrouping();
      case SamlPackage.BIG_DECIMAL_ELEMENT__HORIZONTAL_ALIGN:
        return getHorizontalAlign();
      case SamlPackage.BIG_DECIMAL_ELEMENT__FRACTION_DIGITS:
        return getFractionDigits();
      case SamlPackage.BIG_DECIMAL_ELEMENT__MIN:
        return getMin();
      case SamlPackage.BIG_DECIMAL_ELEMENT__MAX:
        return getMax();
      case SamlPackage.BIG_DECIMAL_ELEMENT__FORMAT:
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
      case SamlPackage.BIG_DECIMAL_ELEMENT__PERCENT:
        setPercent((String)newValue);
        return;
      case SamlPackage.BIG_DECIMAL_ELEMENT__GROUPING:
        setGrouping((String)newValue);
        return;
      case SamlPackage.BIG_DECIMAL_ELEMENT__HORIZONTAL_ALIGN:
        setHorizontalAlign((String)newValue);
        return;
      case SamlPackage.BIG_DECIMAL_ELEMENT__FRACTION_DIGITS:
        setFractionDigits((Integer)newValue);
        return;
      case SamlPackage.BIG_DECIMAL_ELEMENT__MIN:
        setMin((String)newValue);
        return;
      case SamlPackage.BIG_DECIMAL_ELEMENT__MAX:
        setMax((String)newValue);
        return;
      case SamlPackage.BIG_DECIMAL_ELEMENT__FORMAT:
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
      case SamlPackage.BIG_DECIMAL_ELEMENT__PERCENT:
        setPercent(PERCENT_EDEFAULT);
        return;
      case SamlPackage.BIG_DECIMAL_ELEMENT__GROUPING:
        setGrouping(GROUPING_EDEFAULT);
        return;
      case SamlPackage.BIG_DECIMAL_ELEMENT__HORIZONTAL_ALIGN:
        setHorizontalAlign(HORIZONTAL_ALIGN_EDEFAULT);
        return;
      case SamlPackage.BIG_DECIMAL_ELEMENT__FRACTION_DIGITS:
        setFractionDigits(FRACTION_DIGITS_EDEFAULT);
        return;
      case SamlPackage.BIG_DECIMAL_ELEMENT__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case SamlPackage.BIG_DECIMAL_ELEMENT__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case SamlPackage.BIG_DECIMAL_ELEMENT__FORMAT:
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
      case SamlPackage.BIG_DECIMAL_ELEMENT__PERCENT:
        return PERCENT_EDEFAULT == null ? percent != null : !PERCENT_EDEFAULT.equals(percent);
      case SamlPackage.BIG_DECIMAL_ELEMENT__GROUPING:
        return GROUPING_EDEFAULT == null ? grouping != null : !GROUPING_EDEFAULT.equals(grouping);
      case SamlPackage.BIG_DECIMAL_ELEMENT__HORIZONTAL_ALIGN:
        return HORIZONTAL_ALIGN_EDEFAULT == null ? horizontalAlign != null : !HORIZONTAL_ALIGN_EDEFAULT.equals(horizontalAlign);
      case SamlPackage.BIG_DECIMAL_ELEMENT__FRACTION_DIGITS:
        return fractionDigits != FRACTION_DIGITS_EDEFAULT;
      case SamlPackage.BIG_DECIMAL_ELEMENT__MIN:
        return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
      case SamlPackage.BIG_DECIMAL_ELEMENT__MAX:
        return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
      case SamlPackage.BIG_DECIMAL_ELEMENT__FORMAT:
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
    result.append(" (percent: ");
    result.append(percent);
    result.append(", grouping: ");
    result.append(grouping);
    result.append(", horizontalAlign: ");
    result.append(horizontalAlign);
    result.append(", fractionDigits: ");
    result.append(fractionDigits);
    result.append(", min: ");
    result.append(min);
    result.append(", max: ");
    result.append(max);
    result.append(", format: ");
    result.append(format);
    result.append(')');
    return result.toString();
  }

} //BigDecimalElementImpl
