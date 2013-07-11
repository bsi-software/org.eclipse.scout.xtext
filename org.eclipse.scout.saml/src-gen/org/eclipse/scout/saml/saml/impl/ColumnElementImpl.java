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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.scout.saml.saml.ColumnElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TranslationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ColumnElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ColumnElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ColumnElementImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ColumnElementImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ColumnElementImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ColumnElementImpl#getDisplayable <em>Displayable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnElementImpl extends MinimalEObjectImpl.Container implements ColumnElement
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

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
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected int width = WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisible()
   * @generated
   * @ordered
   */
  protected static final String VISIBLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisible()
   * @generated
   * @ordered
   */
  protected String visible = VISIBLE_EDEFAULT;

  /**
   * The default value of the '{@link #getDisplayable() <em>Displayable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayable()
   * @generated
   * @ordered
   */
  protected static final String DISPLAYABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDisplayable() <em>Displayable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayable()
   * @generated
   * @ordered
   */
  protected String displayable = DISPLAYABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColumnElementImpl()
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
    return SamlPackage.Literals.COLUMN_ELEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.COLUMN_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.COLUMN_ELEMENT__TYPE, oldType, type));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.COLUMN_ELEMENT__TEXT, oldText, text));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.COLUMN_ELEMENT__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(int newWidth)
  {
    int oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.COLUMN_ELEMENT__WIDTH, oldWidth, width));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVisible()
  {
    return visible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisible(String newVisible)
  {
    String oldVisible = visible;
    visible = newVisible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.COLUMN_ELEMENT__VISIBLE, oldVisible, visible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDisplayable()
  {
    return displayable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplayable(String newDisplayable)
  {
    String oldDisplayable = displayable;
    displayable = newDisplayable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.COLUMN_ELEMENT__DISPLAYABLE, oldDisplayable, displayable));
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
      case SamlPackage.COLUMN_ELEMENT__NAME:
        return getName();
      case SamlPackage.COLUMN_ELEMENT__TYPE:
        return getType();
      case SamlPackage.COLUMN_ELEMENT__TEXT:
        if (resolve) return getText();
        return basicGetText();
      case SamlPackage.COLUMN_ELEMENT__WIDTH:
        return getWidth();
      case SamlPackage.COLUMN_ELEMENT__VISIBLE:
        return getVisible();
      case SamlPackage.COLUMN_ELEMENT__DISPLAYABLE:
        return getDisplayable();
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
      case SamlPackage.COLUMN_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case SamlPackage.COLUMN_ELEMENT__TYPE:
        setType((String)newValue);
        return;
      case SamlPackage.COLUMN_ELEMENT__TEXT:
        setText((TranslationElement)newValue);
        return;
      case SamlPackage.COLUMN_ELEMENT__WIDTH:
        setWidth((Integer)newValue);
        return;
      case SamlPackage.COLUMN_ELEMENT__VISIBLE:
        setVisible((String)newValue);
        return;
      case SamlPackage.COLUMN_ELEMENT__DISPLAYABLE:
        setDisplayable((String)newValue);
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
      case SamlPackage.COLUMN_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SamlPackage.COLUMN_ELEMENT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case SamlPackage.COLUMN_ELEMENT__TEXT:
        setText((TranslationElement)null);
        return;
      case SamlPackage.COLUMN_ELEMENT__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case SamlPackage.COLUMN_ELEMENT__VISIBLE:
        setVisible(VISIBLE_EDEFAULT);
        return;
      case SamlPackage.COLUMN_ELEMENT__DISPLAYABLE:
        setDisplayable(DISPLAYABLE_EDEFAULT);
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
      case SamlPackage.COLUMN_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SamlPackage.COLUMN_ELEMENT__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case SamlPackage.COLUMN_ELEMENT__TEXT:
        return text != null;
      case SamlPackage.COLUMN_ELEMENT__WIDTH:
        return width != WIDTH_EDEFAULT;
      case SamlPackage.COLUMN_ELEMENT__VISIBLE:
        return VISIBLE_EDEFAULT == null ? visible != null : !VISIBLE_EDEFAULT.equals(visible);
      case SamlPackage.COLUMN_ELEMENT__DISPLAYABLE:
        return DISPLAYABLE_EDEFAULT == null ? displayable != null : !DISPLAYABLE_EDEFAULT.equals(displayable);
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
    result.append(", type: ");
    result.append(type);
    result.append(", width: ");
    result.append(width);
    result.append(", visible: ");
    result.append(visible);
    result.append(", displayable: ");
    result.append(displayable);
    result.append(')');
    return result.toString();
  }

} //ColumnElementImpl
