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

import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.saml.saml.ValueFieldElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Field Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ValueFieldElementImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ValueFieldElementImpl#getLabelVisible <em>Label Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ValueFieldElementImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ValueFieldElementImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ValueFieldElementImpl#getGridWidth <em>Grid Width</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ValueFieldElementImpl#getWidthInPixels <em>Width In Pixels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueFieldElementImpl extends FormFieldElementImpl implements ValueFieldElement
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
   * The cached value of the '{@link #getMaster() <em>Master</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaster()
   * @generated
   * @ordered
   */
  protected ValueFieldElement master;

  /**
   * The default value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMandatory()
   * @generated
   * @ordered
   */
  protected static final String MANDATORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMandatory()
   * @generated
   * @ordered
   */
  protected String mandatory = MANDATORY_EDEFAULT;

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
  protected ValueFieldElementImpl()
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
    return SamlPackage.Literals.VALUE_FIELD_ELEMENT;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.VALUE_FIELD_ELEMENT__TEXT, oldText, text));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.VALUE_FIELD_ELEMENT__TEXT, oldText, text));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.VALUE_FIELD_ELEMENT__LABEL_VISIBLE, oldLabelVisible, labelVisible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueFieldElement getMaster()
  {
    if (master != null && master.eIsProxy())
    {
      InternalEObject oldMaster = (InternalEObject)master;
      master = (ValueFieldElement)eResolveProxy(oldMaster);
      if (master != oldMaster)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.VALUE_FIELD_ELEMENT__MASTER, oldMaster, master));
      }
    }
    return master;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueFieldElement basicGetMaster()
  {
    return master;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaster(ValueFieldElement newMaster)
  {
    ValueFieldElement oldMaster = master;
    master = newMaster;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.VALUE_FIELD_ELEMENT__MASTER, oldMaster, master));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMandatory()
  {
    return mandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMandatory(String newMandatory)
  {
    String oldMandatory = mandatory;
    mandatory = newMandatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.VALUE_FIELD_ELEMENT__MANDATORY, oldMandatory, mandatory));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.VALUE_FIELD_ELEMENT__GRID_WIDTH, oldGridWidth, gridWidth));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS, oldWidthInPixels, widthInPixels));
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
      case SamlPackage.VALUE_FIELD_ELEMENT__TEXT:
        if (resolve) return getText();
        return basicGetText();
      case SamlPackage.VALUE_FIELD_ELEMENT__LABEL_VISIBLE:
        return getLabelVisible();
      case SamlPackage.VALUE_FIELD_ELEMENT__MASTER:
        if (resolve) return getMaster();
        return basicGetMaster();
      case SamlPackage.VALUE_FIELD_ELEMENT__MANDATORY:
        return getMandatory();
      case SamlPackage.VALUE_FIELD_ELEMENT__GRID_WIDTH:
        return getGridWidth();
      case SamlPackage.VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS:
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
      case SamlPackage.VALUE_FIELD_ELEMENT__TEXT:
        setText((TranslationElement)newValue);
        return;
      case SamlPackage.VALUE_FIELD_ELEMENT__LABEL_VISIBLE:
        setLabelVisible((String)newValue);
        return;
      case SamlPackage.VALUE_FIELD_ELEMENT__MASTER:
        setMaster((ValueFieldElement)newValue);
        return;
      case SamlPackage.VALUE_FIELD_ELEMENT__MANDATORY:
        setMandatory((String)newValue);
        return;
      case SamlPackage.VALUE_FIELD_ELEMENT__GRID_WIDTH:
        setGridWidth((Integer)newValue);
        return;
      case SamlPackage.VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS:
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
      case SamlPackage.VALUE_FIELD_ELEMENT__TEXT:
        setText((TranslationElement)null);
        return;
      case SamlPackage.VALUE_FIELD_ELEMENT__LABEL_VISIBLE:
        setLabelVisible(LABEL_VISIBLE_EDEFAULT);
        return;
      case SamlPackage.VALUE_FIELD_ELEMENT__MASTER:
        setMaster((ValueFieldElement)null);
        return;
      case SamlPackage.VALUE_FIELD_ELEMENT__MANDATORY:
        setMandatory(MANDATORY_EDEFAULT);
        return;
      case SamlPackage.VALUE_FIELD_ELEMENT__GRID_WIDTH:
        setGridWidth(GRID_WIDTH_EDEFAULT);
        return;
      case SamlPackage.VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS:
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
      case SamlPackage.VALUE_FIELD_ELEMENT__TEXT:
        return text != null;
      case SamlPackage.VALUE_FIELD_ELEMENT__LABEL_VISIBLE:
        return LABEL_VISIBLE_EDEFAULT == null ? labelVisible != null : !LABEL_VISIBLE_EDEFAULT.equals(labelVisible);
      case SamlPackage.VALUE_FIELD_ELEMENT__MASTER:
        return master != null;
      case SamlPackage.VALUE_FIELD_ELEMENT__MANDATORY:
        return MANDATORY_EDEFAULT == null ? mandatory != null : !MANDATORY_EDEFAULT.equals(mandatory);
      case SamlPackage.VALUE_FIELD_ELEMENT__GRID_WIDTH:
        return gridWidth != GRID_WIDTH_EDEFAULT;
      case SamlPackage.VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS:
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
    result.append(", mandatory: ");
    result.append(mandatory);
    result.append(", gridWidth: ");
    result.append(gridWidth);
    result.append(", widthInPixels: ");
    result.append(widthInPixels);
    result.append(')');
    return result.toString();
  }

} //ValueFieldElementImpl
