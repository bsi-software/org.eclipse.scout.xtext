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

import org.eclipse.scout.saml.saml.BooleanType;
import org.eclipse.scout.saml.saml.ControlElementRule;
import org.eclipse.scout.saml.saml.LeafElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leaf Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LeafElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LeafElementImpl#getFieldRule <em>Field Rule</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LeafElementImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.LeafElementImpl#getLogic <em>Logic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeafElementImpl extends ControlElementImpl implements LeafElement
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
   * The cached value of the '{@link #getFieldRule() <em>Field Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldRule()
   * @generated
   * @ordered
   */
  protected ControlElementRule fieldRule;

  /**
   * The default value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMandatory()
   * @generated
   * @ordered
   */
  protected static final BooleanType MANDATORY_EDEFAULT = BooleanType.TRUE;

  /**
   * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMandatory()
   * @generated
   * @ordered
   */
  protected BooleanType mandatory = MANDATORY_EDEFAULT;

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
  protected LeafElementImpl()
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
    return SamlPackage.Literals.LEAF_ELEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LEAF_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlElementRule getFieldRule()
  {
    return fieldRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFieldRule(ControlElementRule newFieldRule, NotificationChain msgs)
  {
    ControlElementRule oldFieldRule = fieldRule;
    fieldRule = newFieldRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.LEAF_ELEMENT__FIELD_RULE, oldFieldRule, newFieldRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldRule(ControlElementRule newFieldRule)
  {
    if (newFieldRule != fieldRule)
    {
      NotificationChain msgs = null;
      if (fieldRule != null)
        msgs = ((InternalEObject)fieldRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.LEAF_ELEMENT__FIELD_RULE, null, msgs);
      if (newFieldRule != null)
        msgs = ((InternalEObject)newFieldRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.LEAF_ELEMENT__FIELD_RULE, null, msgs);
      msgs = basicSetFieldRule(newFieldRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LEAF_ELEMENT__FIELD_RULE, newFieldRule, newFieldRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanType getMandatory()
  {
    return mandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMandatory(BooleanType newMandatory)
  {
    BooleanType oldMandatory = mandatory;
    mandatory = newMandatory == null ? MANDATORY_EDEFAULT : newMandatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.LEAF_ELEMENT__MANDATORY, oldMandatory, mandatory));
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
      logic = new EObjectContainmentEList<LogicElement>(LogicElement.class, this, SamlPackage.LEAF_ELEMENT__LOGIC);
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
      case SamlPackage.LEAF_ELEMENT__FIELD_RULE:
        return basicSetFieldRule(null, msgs);
      case SamlPackage.LEAF_ELEMENT__LOGIC:
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
      case SamlPackage.LEAF_ELEMENT__NAME:
        return getName();
      case SamlPackage.LEAF_ELEMENT__FIELD_RULE:
        return getFieldRule();
      case SamlPackage.LEAF_ELEMENT__MANDATORY:
        return getMandatory();
      case SamlPackage.LEAF_ELEMENT__LOGIC:
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
      case SamlPackage.LEAF_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case SamlPackage.LEAF_ELEMENT__FIELD_RULE:
        setFieldRule((ControlElementRule)newValue);
        return;
      case SamlPackage.LEAF_ELEMENT__MANDATORY:
        setMandatory((BooleanType)newValue);
        return;
      case SamlPackage.LEAF_ELEMENT__LOGIC:
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
      case SamlPackage.LEAF_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SamlPackage.LEAF_ELEMENT__FIELD_RULE:
        setFieldRule((ControlElementRule)null);
        return;
      case SamlPackage.LEAF_ELEMENT__MANDATORY:
        setMandatory(MANDATORY_EDEFAULT);
        return;
      case SamlPackage.LEAF_ELEMENT__LOGIC:
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
      case SamlPackage.LEAF_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SamlPackage.LEAF_ELEMENT__FIELD_RULE:
        return fieldRule != null;
      case SamlPackage.LEAF_ELEMENT__MANDATORY:
        return mandatory != MANDATORY_EDEFAULT;
      case SamlPackage.LEAF_ELEMENT__LOGIC:
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
    result.append(", mandatory: ");
    result.append(mandatory);
    result.append(')');
    return result.toString();
  }

} //LeafElementImpl
