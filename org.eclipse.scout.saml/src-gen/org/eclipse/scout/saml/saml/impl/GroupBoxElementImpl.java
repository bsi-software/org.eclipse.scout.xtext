/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.GroupBoxElement;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Box Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.GroupBoxElementImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.GroupBoxElementImpl#getBorderVisible <em>Border Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.GroupBoxElementImpl#getBorderDecoration <em>Border Decoration</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.GroupBoxElementImpl#getGridHeight <em>Grid Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupBoxElementImpl extends CompositeFieldElementImpl implements GroupBoxElement
{
  /**
   * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected static final int COLUMNS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected int columns = COLUMNS_EDEFAULT;

  /**
   * The default value of the '{@link #getBorderVisible() <em>Border Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderVisible()
   * @generated
   * @ordered
   */
  protected static final String BORDER_VISIBLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBorderVisible() <em>Border Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderVisible()
   * @generated
   * @ordered
   */
  protected String borderVisible = BORDER_VISIBLE_EDEFAULT;

  /**
   * The default value of the '{@link #getBorderDecoration() <em>Border Decoration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderDecoration()
   * @generated
   * @ordered
   */
  protected static final String BORDER_DECORATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBorderDecoration() <em>Border Decoration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderDecoration()
   * @generated
   * @ordered
   */
  protected String borderDecoration = BORDER_DECORATION_EDEFAULT;

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
  protected GroupBoxElementImpl()
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
    return SamlPackage.Literals.GROUP_BOX_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getColumns()
  {
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumns(int newColumns)
  {
    int oldColumns = columns;
    columns = newColumns;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.GROUP_BOX_ELEMENT__COLUMNS, oldColumns, columns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBorderVisible()
  {
    return borderVisible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorderVisible(String newBorderVisible)
  {
    String oldBorderVisible = borderVisible;
    borderVisible = newBorderVisible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.GROUP_BOX_ELEMENT__BORDER_VISIBLE, oldBorderVisible, borderVisible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBorderDecoration()
  {
    return borderDecoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorderDecoration(String newBorderDecoration)
  {
    String oldBorderDecoration = borderDecoration;
    borderDecoration = newBorderDecoration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.GROUP_BOX_ELEMENT__BORDER_DECORATION, oldBorderDecoration, borderDecoration));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.GROUP_BOX_ELEMENT__GRID_HEIGHT, oldGridHeight, gridHeight));
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
      case SamlPackage.GROUP_BOX_ELEMENT__COLUMNS:
        return getColumns();
      case SamlPackage.GROUP_BOX_ELEMENT__BORDER_VISIBLE:
        return getBorderVisible();
      case SamlPackage.GROUP_BOX_ELEMENT__BORDER_DECORATION:
        return getBorderDecoration();
      case SamlPackage.GROUP_BOX_ELEMENT__GRID_HEIGHT:
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
      case SamlPackage.GROUP_BOX_ELEMENT__COLUMNS:
        setColumns((Integer)newValue);
        return;
      case SamlPackage.GROUP_BOX_ELEMENT__BORDER_VISIBLE:
        setBorderVisible((String)newValue);
        return;
      case SamlPackage.GROUP_BOX_ELEMENT__BORDER_DECORATION:
        setBorderDecoration((String)newValue);
        return;
      case SamlPackage.GROUP_BOX_ELEMENT__GRID_HEIGHT:
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
      case SamlPackage.GROUP_BOX_ELEMENT__COLUMNS:
        setColumns(COLUMNS_EDEFAULT);
        return;
      case SamlPackage.GROUP_BOX_ELEMENT__BORDER_VISIBLE:
        setBorderVisible(BORDER_VISIBLE_EDEFAULT);
        return;
      case SamlPackage.GROUP_BOX_ELEMENT__BORDER_DECORATION:
        setBorderDecoration(BORDER_DECORATION_EDEFAULT);
        return;
      case SamlPackage.GROUP_BOX_ELEMENT__GRID_HEIGHT:
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
      case SamlPackage.GROUP_BOX_ELEMENT__COLUMNS:
        return columns != COLUMNS_EDEFAULT;
      case SamlPackage.GROUP_BOX_ELEMENT__BORDER_VISIBLE:
        return BORDER_VISIBLE_EDEFAULT == null ? borderVisible != null : !BORDER_VISIBLE_EDEFAULT.equals(borderVisible);
      case SamlPackage.GROUP_BOX_ELEMENT__BORDER_DECORATION:
        return BORDER_DECORATION_EDEFAULT == null ? borderDecoration != null : !BORDER_DECORATION_EDEFAULT.equals(borderDecoration);
      case SamlPackage.GROUP_BOX_ELEMENT__GRID_HEIGHT:
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
    result.append(" (columns: ");
    result.append(columns);
    result.append(", borderVisible: ");
    result.append(borderVisible);
    result.append(", borderDecoration: ");
    result.append(borderDecoration);
    result.append(", gridHeight: ");
    result.append(gridHeight);
    result.append(')');
    return result.toString();
  }

} //GroupBoxElementImpl
