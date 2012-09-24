/**
 */
package org.eclipse.scout.saml.saml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.saml.StringElementProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.StringElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.StringElementImpl#getLogic <em>Logic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringElementImpl extends AbstractValueFieldElementImpl implements StringElement
{
  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<StringElementProperties> properties;

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
  protected StringElementImpl()
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
    return SamlPackage.Literals.STRING_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StringElementProperties> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<StringElementProperties>(StringElementProperties.class, this, SamlPackage.STRING_ELEMENT__PROPERTIES);
    }
    return properties;
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
      logic = new EObjectContainmentEList<LogicElement>(LogicElement.class, this, SamlPackage.STRING_ELEMENT__LOGIC);
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
      case SamlPackage.STRING_ELEMENT__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case SamlPackage.STRING_ELEMENT__LOGIC:
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
      case SamlPackage.STRING_ELEMENT__PROPERTIES:
        return getProperties();
      case SamlPackage.STRING_ELEMENT__LOGIC:
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
      case SamlPackage.STRING_ELEMENT__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends StringElementProperties>)newValue);
        return;
      case SamlPackage.STRING_ELEMENT__LOGIC:
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
      case SamlPackage.STRING_ELEMENT__PROPERTIES:
        getProperties().clear();
        return;
      case SamlPackage.STRING_ELEMENT__LOGIC:
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
      case SamlPackage.STRING_ELEMENT__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case SamlPackage.STRING_ELEMENT__LOGIC:
        return logic != null && !logic.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StringElementImpl
