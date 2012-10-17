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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.saml.saml.ValueFieldElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Field Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormFieldElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormFieldElementImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormFieldElementImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormFieldElementImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormFieldElementImpl#getLabelVisible <em>Label Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormFieldElementImpl#getMaster <em>Master</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormFieldElementImpl#getGridHeight <em>Grid Height</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormFieldElementImpl#getGridWidth <em>Grid Width</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormFieldElementImpl#getLogic <em>Logic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormFieldElementImpl extends MinimalEObjectImpl.Container implements FormFieldElement
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
   * The cached value of the '{@link #getText() <em>Text</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected TranslationElement text;

  /**
   * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnabled()
   * @generated
   * @ordered
   */
  protected static final String ENABLED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnabled()
   * @generated
   * @ordered
   */
  protected String enabled = ENABLED_EDEFAULT;

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
   * The cached value of the '{@link #getLogic() <em>Logic</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogic()
   * @generated
   * @ordered
   */
  protected EList<LogicElement> logic;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormFieldElementImpl()
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
    return SamlPackage.Literals.FORM_FIELD_ELEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_FIELD_ELEMENT__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.FORM_FIELD_ELEMENT__TEXT, oldText, text));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_FIELD_ELEMENT__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnabled()
  {
    return enabled;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnabled(String newEnabled)
  {
    String oldEnabled = enabled;
    enabled = newEnabled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_FIELD_ELEMENT__ENABLED, oldEnabled, enabled));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_FIELD_ELEMENT__VISIBLE, oldVisible, visible));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_FIELD_ELEMENT__LABEL_VISIBLE, oldLabelVisible, labelVisible));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.FORM_FIELD_ELEMENT__MASTER, oldMaster, master));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_FIELD_ELEMENT__MASTER, oldMaster, master));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_FIELD_ELEMENT__GRID_HEIGHT, oldGridHeight, gridHeight));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_FIELD_ELEMENT__GRID_WIDTH, oldGridWidth, gridWidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LogicElement> getLogic()
  {
    if (logic == null)
    {
      logic = new EObjectContainmentEList<LogicElement>(LogicElement.class, this, SamlPackage.FORM_FIELD_ELEMENT__LOGIC);
    }
    return logic;
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
      case SamlPackage.FORM_FIELD_ELEMENT__LOGIC:
        return ((InternalEList<?>)getLogic()).basicRemove(otherEnd, msgs);
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
      case SamlPackage.FORM_FIELD_ELEMENT__NAME:
        return getName();
      case SamlPackage.FORM_FIELD_ELEMENT__TEXT:
        if (resolve) return getText();
        return basicGetText();
      case SamlPackage.FORM_FIELD_ELEMENT__ENABLED:
        return getEnabled();
      case SamlPackage.FORM_FIELD_ELEMENT__VISIBLE:
        return getVisible();
      case SamlPackage.FORM_FIELD_ELEMENT__LABEL_VISIBLE:
        return getLabelVisible();
      case SamlPackage.FORM_FIELD_ELEMENT__MASTER:
        if (resolve) return getMaster();
        return basicGetMaster();
      case SamlPackage.FORM_FIELD_ELEMENT__GRID_HEIGHT:
        return getGridHeight();
      case SamlPackage.FORM_FIELD_ELEMENT__GRID_WIDTH:
        return getGridWidth();
      case SamlPackage.FORM_FIELD_ELEMENT__LOGIC:
        return getLogic();
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
      case SamlPackage.FORM_FIELD_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__TEXT:
        setText((TranslationElement)newValue);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__ENABLED:
        setEnabled((String)newValue);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__VISIBLE:
        setVisible((String)newValue);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__LABEL_VISIBLE:
        setLabelVisible((String)newValue);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__MASTER:
        setMaster((ValueFieldElement)newValue);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__GRID_HEIGHT:
        setGridHeight((Integer)newValue);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__GRID_WIDTH:
        setGridWidth((Integer)newValue);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__LOGIC:
        getLogic().clear();
        getLogic().addAll((Collection<? extends LogicElement>)newValue);
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
      case SamlPackage.FORM_FIELD_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__TEXT:
        setText((TranslationElement)null);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__ENABLED:
        setEnabled(ENABLED_EDEFAULT);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__VISIBLE:
        setVisible(VISIBLE_EDEFAULT);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__LABEL_VISIBLE:
        setLabelVisible(LABEL_VISIBLE_EDEFAULT);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__MASTER:
        setMaster((ValueFieldElement)null);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__GRID_HEIGHT:
        setGridHeight(GRID_HEIGHT_EDEFAULT);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__GRID_WIDTH:
        setGridWidth(GRID_WIDTH_EDEFAULT);
        return;
      case SamlPackage.FORM_FIELD_ELEMENT__LOGIC:
        getLogic().clear();
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
      case SamlPackage.FORM_FIELD_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SamlPackage.FORM_FIELD_ELEMENT__TEXT:
        return text != null;
      case SamlPackage.FORM_FIELD_ELEMENT__ENABLED:
        return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
      case SamlPackage.FORM_FIELD_ELEMENT__VISIBLE:
        return VISIBLE_EDEFAULT == null ? visible != null : !VISIBLE_EDEFAULT.equals(visible);
      case SamlPackage.FORM_FIELD_ELEMENT__LABEL_VISIBLE:
        return LABEL_VISIBLE_EDEFAULT == null ? labelVisible != null : !LABEL_VISIBLE_EDEFAULT.equals(labelVisible);
      case SamlPackage.FORM_FIELD_ELEMENT__MASTER:
        return master != null;
      case SamlPackage.FORM_FIELD_ELEMENT__GRID_HEIGHT:
        return gridHeight != GRID_HEIGHT_EDEFAULT;
      case SamlPackage.FORM_FIELD_ELEMENT__GRID_WIDTH:
        return gridWidth != GRID_WIDTH_EDEFAULT;
      case SamlPackage.FORM_FIELD_ELEMENT__LOGIC:
        return logic != null && !logic.isEmpty();
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
    result.append(", enabled: ");
    result.append(enabled);
    result.append(", visible: ");
    result.append(visible);
    result.append(", labelVisible: ");
    result.append(labelVisible);
    result.append(", gridHeight: ");
    result.append(gridHeight);
    result.append(", gridWidth: ");
    result.append(gridWidth);
    result.append(')');
    return result.toString();
  }

} //FormFieldElementImpl
