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

import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TabBoxElement;
import org.eclipse.scout.saml.saml.TabElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab Box Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.TabBoxElementImpl#getGridWidth <em>Grid Width</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.TabBoxElementImpl#getWidthInPixels <em>Width In Pixels</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.TabBoxElementImpl#getTabs <em>Tabs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabBoxElementImpl extends FormFieldElementImpl implements TabBoxElement
{
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
   * The cached value of the '{@link #getTabs() <em>Tabs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTabs()
   * @generated
   * @ordered
   */
  protected EList<TabElement> tabs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TabBoxElementImpl()
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
    return SamlPackage.Literals.TAB_BOX_ELEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.TAB_BOX_ELEMENT__GRID_WIDTH, oldGridWidth, gridWidth));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.TAB_BOX_ELEMENT__WIDTH_IN_PIXELS, oldWidthInPixels, widthInPixels));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TabElement> getTabs()
  {
    if (tabs == null)
    {
      tabs = new EObjectContainmentEList<TabElement>(TabElement.class, this, SamlPackage.TAB_BOX_ELEMENT__TABS);
    }
    return tabs;
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
      case SamlPackage.TAB_BOX_ELEMENT__TABS:
        return ((InternalEList<?>)getTabs()).basicRemove(otherEnd, msgs);
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
      case SamlPackage.TAB_BOX_ELEMENT__GRID_WIDTH:
        return getGridWidth();
      case SamlPackage.TAB_BOX_ELEMENT__WIDTH_IN_PIXELS:
        return getWidthInPixels();
      case SamlPackage.TAB_BOX_ELEMENT__TABS:
        return getTabs();
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
      case SamlPackage.TAB_BOX_ELEMENT__GRID_WIDTH:
        setGridWidth((Integer)newValue);
        return;
      case SamlPackage.TAB_BOX_ELEMENT__WIDTH_IN_PIXELS:
        setWidthInPixels((Integer)newValue);
        return;
      case SamlPackage.TAB_BOX_ELEMENT__TABS:
        getTabs().clear();
        getTabs().addAll((Collection<? extends TabElement>)newValue);
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
      case SamlPackage.TAB_BOX_ELEMENT__GRID_WIDTH:
        setGridWidth(GRID_WIDTH_EDEFAULT);
        return;
      case SamlPackage.TAB_BOX_ELEMENT__WIDTH_IN_PIXELS:
        setWidthInPixels(WIDTH_IN_PIXELS_EDEFAULT);
        return;
      case SamlPackage.TAB_BOX_ELEMENT__TABS:
        getTabs().clear();
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
      case SamlPackage.TAB_BOX_ELEMENT__GRID_WIDTH:
        return gridWidth != GRID_WIDTH_EDEFAULT;
      case SamlPackage.TAB_BOX_ELEMENT__WIDTH_IN_PIXELS:
        return widthInPixels != WIDTH_IN_PIXELS_EDEFAULT;
      case SamlPackage.TAB_BOX_ELEMENT__TABS:
        return tabs != null && !tabs.isEmpty();
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
    result.append(" (gridWidth: ");
    result.append(gridWidth);
    result.append(", widthInPixels: ");
    result.append(widthInPixels);
    result.append(')');
    return result.toString();
  }

} //TabBoxElementImpl
