/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.CompositeElementRule;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.SequenceBoxElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Box Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.SequenceBoxElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.SequenceBoxElementImpl#getFieldRule <em>Field Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceBoxElementImpl extends CompositeElementImpl implements SequenceBoxElement
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
  protected CompositeElementRule fieldRule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceBoxElementImpl()
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
    return SamlPackage.Literals.SEQUENCE_BOX_ELEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.SEQUENCE_BOX_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeElementRule getFieldRule()
  {
    return fieldRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFieldRule(CompositeElementRule newFieldRule, NotificationChain msgs)
  {
    CompositeElementRule oldFieldRule = fieldRule;
    fieldRule = newFieldRule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.SEQUENCE_BOX_ELEMENT__FIELD_RULE, oldFieldRule, newFieldRule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldRule(CompositeElementRule newFieldRule)
  {
    if (newFieldRule != fieldRule)
    {
      NotificationChain msgs = null;
      if (fieldRule != null)
        msgs = ((InternalEObject)fieldRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.SEQUENCE_BOX_ELEMENT__FIELD_RULE, null, msgs);
      if (newFieldRule != null)
        msgs = ((InternalEObject)newFieldRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.SEQUENCE_BOX_ELEMENT__FIELD_RULE, null, msgs);
      msgs = basicSetFieldRule(newFieldRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.SEQUENCE_BOX_ELEMENT__FIELD_RULE, newFieldRule, newFieldRule));
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
      case SamlPackage.SEQUENCE_BOX_ELEMENT__FIELD_RULE:
        return basicSetFieldRule(null, msgs);
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
      case SamlPackage.SEQUENCE_BOX_ELEMENT__NAME:
        return getName();
      case SamlPackage.SEQUENCE_BOX_ELEMENT__FIELD_RULE:
        return getFieldRule();
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
      case SamlPackage.SEQUENCE_BOX_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case SamlPackage.SEQUENCE_BOX_ELEMENT__FIELD_RULE:
        setFieldRule((CompositeElementRule)newValue);
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
      case SamlPackage.SEQUENCE_BOX_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SamlPackage.SEQUENCE_BOX_ELEMENT__FIELD_RULE:
        setFieldRule((CompositeElementRule)null);
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
      case SamlPackage.SEQUENCE_BOX_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SamlPackage.SEQUENCE_BOX_ELEMENT__FIELD_RULE:
        return fieldRule != null;
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
    result.append(')');
    return result.toString();
  }

} //SequenceBoxElementImpl
