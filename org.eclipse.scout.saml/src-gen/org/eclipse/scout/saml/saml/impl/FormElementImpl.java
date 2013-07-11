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

import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.KeyElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TemplateElement;
import org.eclipse.scout.saml.saml.TranslationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getModal <em>Modal</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getWidthInPixels <em>Width In Pixels</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getSvcSuperType <em>Svc Super Type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getLogic <em>Logic</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getKeyStrokes <em>Key Strokes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormElementImpl extends NamedTypeElementImpl implements FormElement
{
  /**
   * The default value of the '{@link #getModal() <em>Modal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModal()
   * @generated
   * @ordered
   */
  protected static final String MODAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModal() <em>Modal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModal()
   * @generated
   * @ordered
   */
  protected String modal = MODAL_EDEFAULT;

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
   * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected TranslationElement title;

  /**
   * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtitle()
   * @generated
   * @ordered
   */
  protected TranslationElement subtitle;

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
   * The cached value of the '{@link #getSvcSuperType() <em>Svc Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSvcSuperType()
   * @generated
   * @ordered
   */
  protected TemplateElement svcSuperType;

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
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<FormFieldElement> fields;

  /**
   * The cached value of the '{@link #getKeyStrokes() <em>Key Strokes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyStrokes()
   * @generated
   * @ordered
   */
  protected EList<KeyElement> keyStrokes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormElementImpl()
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
    return SamlPackage.Literals.FORM_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModal()
  {
    return modal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModal(String newModal)
  {
    String oldModal = modal;
    modal = newModal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_ELEMENT__MODAL, oldModal, modal));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_ELEMENT__COLUMNS, oldColumns, columns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TranslationElement getTitle()
  {
    if (title != null && title.eIsProxy())
    {
      InternalEObject oldTitle = (InternalEObject)title;
      title = (TranslationElement)eResolveProxy(oldTitle);
      if (title != oldTitle)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.FORM_ELEMENT__TITLE, oldTitle, title));
      }
    }
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TranslationElement basicGetTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(TranslationElement newTitle)
  {
    TranslationElement oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_ELEMENT__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TranslationElement getSubtitle()
  {
    if (subtitle != null && subtitle.eIsProxy())
    {
      InternalEObject oldSubtitle = (InternalEObject)subtitle;
      subtitle = (TranslationElement)eResolveProxy(oldSubtitle);
      if (subtitle != oldSubtitle)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.FORM_ELEMENT__SUBTITLE, oldSubtitle, subtitle));
      }
    }
    return subtitle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TranslationElement basicGetSubtitle()
  {
    return subtitle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtitle(TranslationElement newSubtitle)
  {
    TranslationElement oldSubtitle = subtitle;
    subtitle = newSubtitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_ELEMENT__SUBTITLE, oldSubtitle, subtitle));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_ELEMENT__WIDTH_IN_PIXELS, oldWidthInPixels, widthInPixels));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateElement getSvcSuperType()
  {
    if (svcSuperType != null && svcSuperType.eIsProxy())
    {
      InternalEObject oldSvcSuperType = (InternalEObject)svcSuperType;
      svcSuperType = (TemplateElement)eResolveProxy(oldSvcSuperType);
      if (svcSuperType != oldSvcSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.FORM_ELEMENT__SVC_SUPER_TYPE, oldSvcSuperType, svcSuperType));
      }
    }
    return svcSuperType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateElement basicGetSvcSuperType()
  {
    return svcSuperType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSvcSuperType(TemplateElement newSvcSuperType)
  {
    TemplateElement oldSvcSuperType = svcSuperType;
    svcSuperType = newSvcSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_ELEMENT__SVC_SUPER_TYPE, oldSvcSuperType, svcSuperType));
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
      logic = new EObjectContainmentEList<LogicElement>(LogicElement.class, this, SamlPackage.FORM_ELEMENT__LOGIC);
    }
    return logic;
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
      fields = new EObjectContainmentEList<FormFieldElement>(FormFieldElement.class, this, SamlPackage.FORM_ELEMENT__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KeyElement> getKeyStrokes()
  {
    if (keyStrokes == null)
    {
      keyStrokes = new EObjectContainmentEList<KeyElement>(KeyElement.class, this, SamlPackage.FORM_ELEMENT__KEY_STROKES);
    }
    return keyStrokes;
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
      case SamlPackage.FORM_ELEMENT__LOGIC:
        return ((InternalEList<?>)getLogic()).basicRemove(otherEnd, msgs);
      case SamlPackage.FORM_ELEMENT__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case SamlPackage.FORM_ELEMENT__KEY_STROKES:
        return ((InternalEList<?>)getKeyStrokes()).basicRemove(otherEnd, msgs);
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
      case SamlPackage.FORM_ELEMENT__MODAL:
        return getModal();
      case SamlPackage.FORM_ELEMENT__COLUMNS:
        return getColumns();
      case SamlPackage.FORM_ELEMENT__TITLE:
        if (resolve) return getTitle();
        return basicGetTitle();
      case SamlPackage.FORM_ELEMENT__SUBTITLE:
        if (resolve) return getSubtitle();
        return basicGetSubtitle();
      case SamlPackage.FORM_ELEMENT__WIDTH_IN_PIXELS:
        return getWidthInPixels();
      case SamlPackage.FORM_ELEMENT__SVC_SUPER_TYPE:
        if (resolve) return getSvcSuperType();
        return basicGetSvcSuperType();
      case SamlPackage.FORM_ELEMENT__LOGIC:
        return getLogic();
      case SamlPackage.FORM_ELEMENT__FIELDS:
        return getFields();
      case SamlPackage.FORM_ELEMENT__KEY_STROKES:
        return getKeyStrokes();
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
      case SamlPackage.FORM_ELEMENT__MODAL:
        setModal((String)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__COLUMNS:
        setColumns((Integer)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__TITLE:
        setTitle((TranslationElement)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__SUBTITLE:
        setSubtitle((TranslationElement)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__WIDTH_IN_PIXELS:
        setWidthInPixels((Integer)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__SVC_SUPER_TYPE:
        setSvcSuperType((TemplateElement)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__LOGIC:
        getLogic().clear();
        getLogic().addAll((Collection<? extends LogicElement>)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends FormFieldElement>)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__KEY_STROKES:
        getKeyStrokes().clear();
        getKeyStrokes().addAll((Collection<? extends KeyElement>)newValue);
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
      case SamlPackage.FORM_ELEMENT__MODAL:
        setModal(MODAL_EDEFAULT);
        return;
      case SamlPackage.FORM_ELEMENT__COLUMNS:
        setColumns(COLUMNS_EDEFAULT);
        return;
      case SamlPackage.FORM_ELEMENT__TITLE:
        setTitle((TranslationElement)null);
        return;
      case SamlPackage.FORM_ELEMENT__SUBTITLE:
        setSubtitle((TranslationElement)null);
        return;
      case SamlPackage.FORM_ELEMENT__WIDTH_IN_PIXELS:
        setWidthInPixels(WIDTH_IN_PIXELS_EDEFAULT);
        return;
      case SamlPackage.FORM_ELEMENT__SVC_SUPER_TYPE:
        setSvcSuperType((TemplateElement)null);
        return;
      case SamlPackage.FORM_ELEMENT__LOGIC:
        getLogic().clear();
        return;
      case SamlPackage.FORM_ELEMENT__FIELDS:
        getFields().clear();
        return;
      case SamlPackage.FORM_ELEMENT__KEY_STROKES:
        getKeyStrokes().clear();
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
      case SamlPackage.FORM_ELEMENT__MODAL:
        return MODAL_EDEFAULT == null ? modal != null : !MODAL_EDEFAULT.equals(modal);
      case SamlPackage.FORM_ELEMENT__COLUMNS:
        return columns != COLUMNS_EDEFAULT;
      case SamlPackage.FORM_ELEMENT__TITLE:
        return title != null;
      case SamlPackage.FORM_ELEMENT__SUBTITLE:
        return subtitle != null;
      case SamlPackage.FORM_ELEMENT__WIDTH_IN_PIXELS:
        return widthInPixels != WIDTH_IN_PIXELS_EDEFAULT;
      case SamlPackage.FORM_ELEMENT__SVC_SUPER_TYPE:
        return svcSuperType != null;
      case SamlPackage.FORM_ELEMENT__LOGIC:
        return logic != null && !logic.isEmpty();
      case SamlPackage.FORM_ELEMENT__FIELDS:
        return fields != null && !fields.isEmpty();
      case SamlPackage.FORM_ELEMENT__KEY_STROKES:
        return keyStrokes != null && !keyStrokes.isEmpty();
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
    result.append(" (modal: ");
    result.append(modal);
    result.append(", columns: ");
    result.append(columns);
    result.append(", widthInPixels: ");
    result.append(widthInPixels);
    result.append(')');
    return result.toString();
  }

} //FormElementImpl
