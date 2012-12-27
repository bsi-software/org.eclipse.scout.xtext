/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.SequenceBoxElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Box Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.SequenceBoxElementImpl#getLabelVisible <em>Label Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.SequenceBoxElementImpl#getGridWidth <em>Grid Width</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.SequenceBoxElementImpl#getWidthInPixels <em>Width In Pixels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceBoxElementImpl extends CompositeFieldElementImpl implements SequenceBoxElement
{
  /**
   * The default value of the '{@link #getLabelVisible() <em>Label Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelVisible()
   * @generated
   * @ordered
   */
  protected static final String LABEL_VISIBLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabelVisible() <em>Label Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelVisible()
   * @generated
   * @ordered
   */
  protected String labelVisible = LABEL_VISIBLE_EDEFAULT;

  /**
   * The default value of the '{@link #getGridWidth() <em>Grid Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGridWidth()
   * @generated
   * @ordered
   */
  protected static final int GRID_WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getGridWidth() <em>Grid Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGridWidth()
   * @generated
   * @ordered
   */
  protected int gridWidth = GRID_WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getWidthInPixels() <em>Width In Pixels</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidthInPixels()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_IN_PIXELS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWidthInPixels() <em>Width In Pixels</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidthInPixels()
   * @generated
   * @ordered
   */
  protected int widthInPixels = WIDTH_IN_PIXELS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceBoxElementImpl()
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
    return SamlPackage.Literals.SEQUENCE_BOX_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabelVisible()
  {
    return labelVisible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelVisible(String newLabelVisible)
  {
    String oldLabelVisible = labelVisible;
    labelVisible = newLabelVisible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.SEQUENCE_BOX_ELEMENT__LABEL_VISIBLE, oldLabelVisible, labelVisible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getGridWidth()
  {
    return gridWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGridWidth(int newGridWidth)
  {
    int oldGridWidth = gridWidth;
    gridWidth = newGridWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.SEQUENCE_BOX_ELEMENT__GRID_WIDTH, oldGridWidth, gridWidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWidthInPixels()
  {
    return widthInPixels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidthInPixels(int newWidthInPixels)
  {
    int oldWidthInPixels = widthInPixels;
    widthInPixels = newWidthInPixels;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.SEQUENCE_BOX_ELEMENT__WIDTH_IN_PIXELS, oldWidthInPixels, widthInPixels));
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
      case SamlPackage.SEQUENCE_BOX_ELEMENT__LABEL_VISIBLE:
        return getLabelVisible();
      case SamlPackage.SEQUENCE_BOX_ELEMENT__GRID_WIDTH:
        return getGridWidth();
      case SamlPackage.SEQUENCE_BOX_ELEMENT__WIDTH_IN_PIXELS:
        return getWidthInPixels();
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
      case SamlPackage.SEQUENCE_BOX_ELEMENT__LABEL_VISIBLE:
        setLabelVisible((String)newValue);
        return;
      case SamlPackage.SEQUENCE_BOX_ELEMENT__GRID_WIDTH:
        setGridWidth((Integer)newValue);
        return;
      case SamlPackage.SEQUENCE_BOX_ELEMENT__WIDTH_IN_PIXELS:
        setWidthInPixels((Integer)newValue);
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
      case SamlPackage.SEQUENCE_BOX_ELEMENT__LABEL_VISIBLE:
        setLabelVisible(LABEL_VISIBLE_EDEFAULT);
        return;
      case SamlPackage.SEQUENCE_BOX_ELEMENT__GRID_WIDTH:
        setGridWidth(GRID_WIDTH_EDEFAULT);
        return;
      case SamlPackage.SEQUENCE_BOX_ELEMENT__WIDTH_IN_PIXELS:
        setWidthInPixels(WIDTH_IN_PIXELS_EDEFAULT);
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
      case SamlPackage.SEQUENCE_BOX_ELEMENT__LABEL_VISIBLE:
        return LABEL_VISIBLE_EDEFAULT == null ? labelVisible != null : !LABEL_VISIBLE_EDEFAULT.equals(labelVisible);
      case SamlPackage.SEQUENCE_BOX_ELEMENT__GRID_WIDTH:
        return gridWidth != GRID_WIDTH_EDEFAULT;
      case SamlPackage.SEQUENCE_BOX_ELEMENT__WIDTH_IN_PIXELS:
        return widthInPixels != WIDTH_IN_PIXELS_EDEFAULT;
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
    result.append(" (labelVisible: ");
    result.append(labelVisible);
    result.append(", gridWidth: ");
    result.append(gridWidth);
    result.append(", widthInPixels: ");
    result.append(widthInPixels);
    result.append(')');
    return result.toString();
  }

} //SequenceBoxElementImpl
