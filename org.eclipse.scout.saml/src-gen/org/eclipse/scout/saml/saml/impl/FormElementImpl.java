/**
 */
package org.eclipse.scout.saml.saml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.FormElementColumnsAttribute;
import org.eclipse.scout.saml.saml.FormElementModalAttribute;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TextAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getModal <em>Modal</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FormElementImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormElementImpl extends RootElementImpl implements FormElement
{
  /**
   * The cached value of the '{@link #getModal() <em>Modal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModal()
   * @generated
   * @ordered
   */
  protected FormElementModalAttribute modal;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected TextAttribute text;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected FormElementColumnsAttribute columns;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<EObject> elements;

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
  public FormElementModalAttribute getModal()
  {
    return modal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModal(FormElementModalAttribute newModal, NotificationChain msgs)
  {
    FormElementModalAttribute oldModal = modal;
    modal = newModal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_ELEMENT__MODAL, oldModal, newModal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModal(FormElementModalAttribute newModal)
  {
    if (newModal != modal)
    {
      NotificationChain msgs = null;
      if (modal != null)
        msgs = ((InternalEObject)modal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.FORM_ELEMENT__MODAL, null, msgs);
      if (newModal != null)
        msgs = ((InternalEObject)newModal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.FORM_ELEMENT__MODAL, null, msgs);
      msgs = basicSetModal(newModal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_ELEMENT__MODAL, newModal, newModal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextAttribute getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(TextAttribute newText, NotificationChain msgs)
  {
    TextAttribute oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_ELEMENT__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(TextAttribute newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.FORM_ELEMENT__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.FORM_ELEMENT__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_ELEMENT__TEXT, newText, newText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormElementColumnsAttribute getColumns()
  {
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumns(FormElementColumnsAttribute newColumns, NotificationChain msgs)
  {
    FormElementColumnsAttribute oldColumns = columns;
    columns = newColumns;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_ELEMENT__COLUMNS, oldColumns, newColumns);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumns(FormElementColumnsAttribute newColumns)
  {
    if (newColumns != columns)
    {
      NotificationChain msgs = null;
      if (columns != null)
        msgs = ((InternalEObject)columns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.FORM_ELEMENT__COLUMNS, null, msgs);
      if (newColumns != null)
        msgs = ((InternalEObject)newColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.FORM_ELEMENT__COLUMNS, null, msgs);
      msgs = basicSetColumns(newColumns, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FORM_ELEMENT__COLUMNS, newColumns, newColumns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<EObject>(EObject.class, this, SamlPackage.FORM_ELEMENT__ELEMENTS);
    }
    return elements;
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
      case SamlPackage.FORM_ELEMENT__MODAL:
        return basicSetModal(null, msgs);
      case SamlPackage.FORM_ELEMENT__TEXT:
        return basicSetText(null, msgs);
      case SamlPackage.FORM_ELEMENT__COLUMNS:
        return basicSetColumns(null, msgs);
      case SamlPackage.FORM_ELEMENT__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case SamlPackage.FORM_ELEMENT__TEXT:
        return getText();
      case SamlPackage.FORM_ELEMENT__COLUMNS:
        return getColumns();
      case SamlPackage.FORM_ELEMENT__ELEMENTS:
        return getElements();
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
        setModal((FormElementModalAttribute)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__TEXT:
        setText((TextAttribute)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__COLUMNS:
        setColumns((FormElementColumnsAttribute)newValue);
        return;
      case SamlPackage.FORM_ELEMENT__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends EObject>)newValue);
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
        setModal((FormElementModalAttribute)null);
        return;
      case SamlPackage.FORM_ELEMENT__TEXT:
        setText((TextAttribute)null);
        return;
      case SamlPackage.FORM_ELEMENT__COLUMNS:
        setColumns((FormElementColumnsAttribute)null);
        return;
      case SamlPackage.FORM_ELEMENT__ELEMENTS:
        getElements().clear();
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
        return modal != null;
      case SamlPackage.FORM_ELEMENT__TEXT:
        return text != null;
      case SamlPackage.FORM_ELEMENT__COLUMNS:
        return columns != null;
      case SamlPackage.FORM_ELEMENT__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FormElementImpl
