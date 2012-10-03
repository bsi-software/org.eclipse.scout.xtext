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

import org.eclipse.scout.saml.saml.CustomFieldElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.FormFieldProperties;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TemplateElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Field Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl#getFormFieldProperties <em>Form Field Properties</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.CustomFieldElementImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomFieldElementImpl extends ValueFieldElementImpl implements CustomFieldElement
{
  /**
   * The cached value of the '{@link #getTemplate() <em>Template</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplate()
   * @generated
   * @ordered
   */
  protected TemplateElement template;

  /**
   * The cached value of the '{@link #getFormFieldProperties() <em>Form Field Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormFieldProperties()
   * @generated
   * @ordered
   */
  protected FormFieldProperties formFieldProperties;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomFieldElementImpl()
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
    return SamlPackage.Literals.CUSTOM_FIELD_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateElement getTemplate()
  {
    if (template != null && template.eIsProxy())
    {
      InternalEObject oldTemplate = (InternalEObject)template;
      template = (TemplateElement)eResolveProxy(oldTemplate);
      if (template != oldTemplate)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SamlPackage.CUSTOM_FIELD_ELEMENT__TEMPLATE, oldTemplate, template));
      }
    }
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateElement basicGetTemplate()
  {
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplate(TemplateElement newTemplate)
  {
    TemplateElement oldTemplate = template;
    template = newTemplate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.CUSTOM_FIELD_ELEMENT__TEMPLATE, oldTemplate, template));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormFieldProperties getFormFieldProperties()
  {
    return formFieldProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormFieldProperties(FormFieldProperties newFormFieldProperties, NotificationChain msgs)
  {
    FormFieldProperties oldFormFieldProperties = formFieldProperties;
    formFieldProperties = newFormFieldProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.CUSTOM_FIELD_ELEMENT__FORM_FIELD_PROPERTIES, oldFormFieldProperties, newFormFieldProperties);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormFieldProperties(FormFieldProperties newFormFieldProperties)
  {
    if (newFormFieldProperties != formFieldProperties)
    {
      NotificationChain msgs = null;
      if (formFieldProperties != null)
        msgs = ((InternalEObject)formFieldProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.CUSTOM_FIELD_ELEMENT__FORM_FIELD_PROPERTIES, null, msgs);
      if (newFormFieldProperties != null)
        msgs = ((InternalEObject)newFormFieldProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.CUSTOM_FIELD_ELEMENT__FORM_FIELD_PROPERTIES, null, msgs);
      msgs = basicSetFormFieldProperties(newFormFieldProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.CUSTOM_FIELD_ELEMENT__FORM_FIELD_PROPERTIES, newFormFieldProperties, newFormFieldProperties));
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
      fields = new EObjectContainmentEList<FormFieldElement>(FormFieldElement.class, this, SamlPackage.CUSTOM_FIELD_ELEMENT__FIELDS);
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
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FORM_FIELD_PROPERTIES:
        return basicSetFormFieldProperties(null, msgs);
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FIELDS:
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
      case SamlPackage.CUSTOM_FIELD_ELEMENT__TEMPLATE:
        if (resolve) return getTemplate();
        return basicGetTemplate();
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FORM_FIELD_PROPERTIES:
        return getFormFieldProperties();
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FIELDS:
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
      case SamlPackage.CUSTOM_FIELD_ELEMENT__TEMPLATE:
        setTemplate((TemplateElement)newValue);
        return;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FORM_FIELD_PROPERTIES:
        setFormFieldProperties((FormFieldProperties)newValue);
        return;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends FormFieldElement>)newValue);
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
      case SamlPackage.CUSTOM_FIELD_ELEMENT__TEMPLATE:
        setTemplate((TemplateElement)null);
        return;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FORM_FIELD_PROPERTIES:
        setFormFieldProperties((FormFieldProperties)null);
        return;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FIELDS:
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
      case SamlPackage.CUSTOM_FIELD_ELEMENT__TEMPLATE:
        return template != null;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FORM_FIELD_PROPERTIES:
        return formFieldProperties != null;
      case SamlPackage.CUSTOM_FIELD_ELEMENT__FIELDS:
        return fields != null && !fields.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CustomFieldElementImpl
