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

import org.eclipse.scout.saml.saml.BooleanType;
import org.eclipse.scout.saml.saml.ControlElement;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getModal <em>Modal</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getLogic <em>Logic</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormElementImpl extends MinimalEObjectImpl.Container implements FormElement
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
   * The default value of the '{@link #getModal() <em>Modal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModal()
   * @generated
   * @ordered
   */
  protected static final BooleanType MODAL_EDEFAULT = BooleanType.TRUE;

  /**
   * The cached value of the '{@link #getModal() <em>Modal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModal()
   * @generated
   * @ordered
   */
  protected BooleanType modal = MODAL_EDEFAULT;

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
  protected EList<ControlElement> fields;

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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanType getModal()
  {
    return modal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModal(BooleanType newModal)
  {
    BooleanType oldModal = modal;
    modal = newModal == null ? MODAL_EDEFAULT : newModal;
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
  public EList<ControlElement> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<ControlElement>(ControlElement.class, this, SamlPackage.FORM_ELEMENT__FIELDS);
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
      case SamlPackage.FORM_ELEMENT__LOGIC:
        return ((InternalEList<?>)getLogic()).basicRemove(otherEnd, msgs);
      case SamlPackage.FORM_ELEMENT__FIELDS:
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
      case SamlPackage.FORM_ELEMENT__NAME:
        return getName();
      case SamlPackage.FORM_ELEMENT__MODAL:
        return getModal();
      case SamlPackage.FORM_ELEMENT__COLUMNS:
        return getColumns();
      case SamlPackage.FORM_ELEMENT__LOGIC:
        return getLogic();
      case SamlPackage.FORM_ELEMENT__FIELDS:
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
      case SamlPackage.FORM_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__MODAL:
        setModal((BooleanType)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__COLUMNS:
        setColumns((Integer)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__LOGIC:
        getLogic().clear();
        getLogic().addAll((Collection<? extends LogicElement>)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends ControlElement>)newValue);
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
      case SamlPackage.FORM_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SamlPackage.FORM_ELEMENT__MODAL:
        setModal(MODAL_EDEFAULT);
        return;
      case SamlPackage.FORM_ELEMENT__COLUMNS:
        setColumns(COLUMNS_EDEFAULT);
        return;
      case SamlPackage.FORM_ELEMENT__LOGIC:
        getLogic().clear();
        return;
      case SamlPackage.FORM_ELEMENT__FIELDS:
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
      case SamlPackage.FORM_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SamlPackage.FORM_ELEMENT__MODAL:
        return modal != MODAL_EDEFAULT;
      case SamlPackage.FORM_ELEMENT__COLUMNS:
        return columns != COLUMNS_EDEFAULT;
      case SamlPackage.FORM_ELEMENT__LOGIC:
        return logic != null && !logic.isEmpty();
      case SamlPackage.FORM_ELEMENT__FIELDS:
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
    result.append(" (name: ");
    result.append(name);
    result.append(", modal: ");
    result.append(modal);
    result.append(", columns: ");
    result.append(columns);
    result.append(')');
    return result.toString();
  }

} //FormElementImpl
