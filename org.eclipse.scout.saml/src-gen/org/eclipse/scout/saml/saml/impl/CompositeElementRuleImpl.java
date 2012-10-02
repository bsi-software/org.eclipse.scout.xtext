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

import org.eclipse.scout.saml.saml.CompositeElementRule;
import org.eclipse.scout.saml.saml.ControlElement;
import org.eclipse.scout.saml.saml.ControlElementRule;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Element Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.CompositeElementRuleImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.CompositeElementRuleImpl#getLogic <em>Logic</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.CompositeElementRuleImpl#getChildre <em>Childre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeElementRuleImpl extends MinimalEObjectImpl.Container implements CompositeElementRule
{
  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected ControlElementRule rule;

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
   * The cached value of the '{@link #getChildre() <em>Childre</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildre()
   * @generated
   * @ordered
   */
  protected EList<ControlElement> childre;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositeElementRuleImpl()
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
    return SamlPackage.Literals.COMPOSITE_ELEMENT_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlElementRule getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRule(ControlElementRule newRule, NotificationChain msgs)
  {
    ControlElementRule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.COMPOSITE_ELEMENT_RULE__RULE, oldRule, newRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(ControlElementRule newRule)
  {
    if (newRule != rule)
    {
      NotificationChain msgs = null;
      if (rule != null)
        msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.COMPOSITE_ELEMENT_RULE__RULE, null, msgs);
      if (newRule != null)
        msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.COMPOSITE_ELEMENT_RULE__RULE, null, msgs);
      msgs = basicSetRule(newRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.COMPOSITE_ELEMENT_RULE__RULE, newRule, newRule));
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
      logic = new EObjectContainmentEList<LogicElement>(LogicElement.class, this, SamlPackage.COMPOSITE_ELEMENT_RULE__LOGIC);
    }
    return logic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ControlElement> getChildre()
  {
    if (childre == null)
    {
      childre = new EObjectContainmentEList<ControlElement>(ControlElement.class, this, SamlPackage.COMPOSITE_ELEMENT_RULE__CHILDRE);
    }
    return childre;
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
      case SamlPackage.COMPOSITE_ELEMENT_RULE__RULE:
        return basicSetRule(null, msgs);
      case SamlPackage.COMPOSITE_ELEMENT_RULE__LOGIC:
        return ((InternalEList<?>)getLogic()).basicRemove(otherEnd, msgs);
      case SamlPackage.COMPOSITE_ELEMENT_RULE__CHILDRE:
        return ((InternalEList<?>)getChildre()).basicRemove(otherEnd, msgs);
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
      case SamlPackage.COMPOSITE_ELEMENT_RULE__RULE:
        return getRule();
      case SamlPackage.COMPOSITE_ELEMENT_RULE__LOGIC:
        return getLogic();
      case SamlPackage.COMPOSITE_ELEMENT_RULE__CHILDRE:
        return getChildre();
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
      case SamlPackage.COMPOSITE_ELEMENT_RULE__RULE:
        setRule((ControlElementRule)newValue);
        return;
      case SamlPackage.COMPOSITE_ELEMENT_RULE__LOGIC:
        getLogic().clear();
        getLogic().addAll((Collection<? extends LogicElement>)newValue);
        return;
      case SamlPackage.COMPOSITE_ELEMENT_RULE__CHILDRE:
        getChildre().clear();
        getChildre().addAll((Collection<? extends ControlElement>)newValue);
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
      case SamlPackage.COMPOSITE_ELEMENT_RULE__RULE:
        setRule((ControlElementRule)null);
        return;
      case SamlPackage.COMPOSITE_ELEMENT_RULE__LOGIC:
        getLogic().clear();
        return;
      case SamlPackage.COMPOSITE_ELEMENT_RULE__CHILDRE:
        getChildre().clear();
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
      case SamlPackage.COMPOSITE_ELEMENT_RULE__RULE:
        return rule != null;
      case SamlPackage.COMPOSITE_ELEMENT_RULE__LOGIC:
        return logic != null && !logic.isEmpty();
      case SamlPackage.COMPOSITE_ELEMENT_RULE__CHILDRE:
        return childre != null && !childre.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CompositeElementRuleImpl
