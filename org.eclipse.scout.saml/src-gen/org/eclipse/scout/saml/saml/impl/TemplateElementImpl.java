/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TemplateElement;
import org.eclipse.scout.saml.saml.TemplateElementClassAttribute;
import org.eclipse.scout.saml.saml.TemplateElementReplacesAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.TemplateElementImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.TemplateElementImpl#getReplaces <em>Replaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateElementImpl extends RootElementImpl implements TemplateElement
{
  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected TemplateElementClassAttribute class_;

  /**
   * The cached value of the '{@link #getReplaces() <em>Replaces</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplaces()
   * @generated
   * @ordered
   */
  protected TemplateElementReplacesAttribute replaces;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateElementImpl()
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
    return SamlPackage.Literals.TEMPLATE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateElementClassAttribute getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(TemplateElementClassAttribute newClass, NotificationChain msgs)
  {
    TemplateElementClassAttribute oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.TEMPLATE_ELEMENT__CLASS, oldClass, newClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(TemplateElementClassAttribute newClass)
  {
    if (newClass != class_)
    {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.TEMPLATE_ELEMENT__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.TEMPLATE_ELEMENT__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.TEMPLATE_ELEMENT__CLASS, newClass, newClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateElementReplacesAttribute getReplaces()
  {
    return replaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReplaces(TemplateElementReplacesAttribute newReplaces, NotificationChain msgs)
  {
    TemplateElementReplacesAttribute oldReplaces = replaces;
    replaces = newReplaces;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.TEMPLATE_ELEMENT__REPLACES, oldReplaces, newReplaces);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReplaces(TemplateElementReplacesAttribute newReplaces)
  {
    if (newReplaces != replaces)
    {
      NotificationChain msgs = null;
      if (replaces != null)
        msgs = ((InternalEObject)replaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.TEMPLATE_ELEMENT__REPLACES, null, msgs);
      if (newReplaces != null)
        msgs = ((InternalEObject)newReplaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.TEMPLATE_ELEMENT__REPLACES, null, msgs);
      msgs = basicSetReplaces(newReplaces, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.TEMPLATE_ELEMENT__REPLACES, newReplaces, newReplaces));
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
      case SamlPackage.TEMPLATE_ELEMENT__CLASS:
        return basicSetClass(null, msgs);
      case SamlPackage.TEMPLATE_ELEMENT__REPLACES:
        return basicSetReplaces(null, msgs);
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
      case SamlPackage.TEMPLATE_ELEMENT__CLASS:
        return getClass_();
      case SamlPackage.TEMPLATE_ELEMENT__REPLACES:
        return getReplaces();
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
      case SamlPackage.TEMPLATE_ELEMENT__CLASS:
        setClass((TemplateElementClassAttribute)newValue);
        return;
      case SamlPackage.TEMPLATE_ELEMENT__REPLACES:
        setReplaces((TemplateElementReplacesAttribute)newValue);
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
      case SamlPackage.TEMPLATE_ELEMENT__CLASS:
        setClass((TemplateElementClassAttribute)null);
        return;
      case SamlPackage.TEMPLATE_ELEMENT__REPLACES:
        setReplaces((TemplateElementReplacesAttribute)null);
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
      case SamlPackage.TEMPLATE_ELEMENT__CLASS:
        return class_ != null;
      case SamlPackage.TEMPLATE_ELEMENT__REPLACES:
        return replaces != null;
    }
    return super.eIsSet(featureID);
  }

} //TemplateElementImpl
