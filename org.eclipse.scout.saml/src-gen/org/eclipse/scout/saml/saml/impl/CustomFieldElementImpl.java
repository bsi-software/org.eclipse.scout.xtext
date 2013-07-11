/**
 * <copyright>
 * </copyright>
 *

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

import org.eclipse.scout.saml.saml.CustomFieldElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TranslationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Field Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl#getLabelVisible <em>Label Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl#getGridWidth <em>Grid Width</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl#getWidthInPixels <em>Width In Pixels</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomFieldElementImpl extends FormFieldElementImpl implements CustomFieldElement
{
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
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<FormFieldElement> fields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomFieldElementImpl()
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
    return SamlPackage.Literals.CUSTOM_FIELD_ELEMENT;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.CUSTOM_FIELD_ELEMENT__TEXT, oldText, text));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.CUSTOM_FIELD_ELEMENT__TEXT, oldText, text));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.CUSTOM_FIELD_ELEMENT__LABEL_VISIBLE, oldLabelVisible, labelVisible));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.CUSTOM_FIELD_ELEMENT__GRID_WIDTH, oldGridWidth, gridWidth));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.CUSTOM_FIELD_ELEMENT__WIDTH_IN_PIXELS, oldWidthInPixels, widthInPixels));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FormFieldElement> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<FormFieldElement>(FormFieldElement.class, this, SamlPackage.CUSTOM_FIELD_ELEMENT__FIELDS);
    }
    return fields;
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
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
      case SamlPackage.CUSTOM_FIELD_ELEMENT__TEXT:
        if (resolve) return getText();
        return basicGetText();
      case SamlPackage.CUSTOM_FIELD_ELEMENT__LABEL_VISIBLE:
        return getLabelVisible();
      case SamlPackage.CUSTOM_FIELD_ELEMENT__GRID_WIDTH:
        return getGridWidth();
      case SamlPackage.CUSTOM_FIELD_ELEMENT__WIDTH_IN_PIXELS:
        return getWidthInPixels();
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FIELDS:
        return getFields();
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
      case SamlPackage.CUSTOM_FIELD_ELEMENT__TEXT:
        setText((TranslationElement)newValue);
        return;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__LABEL_VISIBLE:
        setLabelVisible((String)newValue);
        return;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__GRID_WIDTH:
        setGridWidth((Integer)newValue);
        return;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__WIDTH_IN_PIXELS:
        setWidthInPixels((Integer)newValue);
        return;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends FormFieldElement>)newValue);
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
      case SamlPackage.CUSTOM_FIELD_ELEMENT__TEXT:
        setText((TranslationElement)null);
        return;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__LABEL_VISIBLE:
        setLabelVisible(LABEL_VISIBLE_EDEFAULT);
        return;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__GRID_WIDTH:
        setGridWidth(GRID_WIDTH_EDEFAULT);
        return;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__WIDTH_IN_PIXELS:
        setWidthInPixels(WIDTH_IN_PIXELS_EDEFAULT);
        return;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FIELDS:
        getFields().clear();
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
      case SamlPackage.CUSTOM_FIELD_ELEMENT__TEXT:
        return text != null;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__LABEL_VISIBLE:
        return LABEL_VISIBLE_EDEFAULT == null ? labelVisible != null : !LABEL_VISIBLE_EDEFAULT.equals(labelVisible);
      case SamlPackage.CUSTOM_FIELD_ELEMENT__GRID_WIDTH:
        return gridWidth != GRID_WIDTH_EDEFAULT;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__WIDTH_IN_PIXELS:
        return widthInPixels != WIDTH_IN_PIXELS_EDEFAULT;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FIELDS:
        return fields != null && !fields.isEmpty();
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

} //CustomFieldElementImpl
