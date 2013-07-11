/**
 * <copyright>
 * </copyright>
 *

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

import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.ImportElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.Model;
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TemplateElement;
import org.eclipse.scout.saml.saml.TranslationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ModelImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ModelImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ModelImpl#getCodes <em>Codes</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ModelImpl#getLookups <em>Lookups</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ModelImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ModelImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.ModelImpl#getLogics <em>Logics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected ModuleElement module;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportElement> imports;

  /**
   * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTranslations()
   * @generated
   * @ordered
   */
  protected EList<TranslationElement> translations;

  /**
   * The cached value of the '{@link #getCodes() <em>Codes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodes()
   * @generated
   * @ordered
   */
  protected EList<CodeElement> codes;

  /**
   * The cached value of the '{@link #getLookups() <em>Lookups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLookups()
   * @generated
   * @ordered
   */
  protected EList<LookupElement> lookups;

  /**
   * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplates()
   * @generated
   * @ordered
   */
  protected EList<TemplateElement> templates;

  /**
   * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForms()
   * @generated
   * @ordered
   */
  protected EList<FormElement> forms;

  /**
   * The cached value of the '{@link #getLogics() <em>Logics</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogics()
   * @generated
   * @ordered
   */
  protected EList<LogicElement> logics;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return SamlPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleElement getModule()
  {
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModule(ModuleElement newModule, NotificationChain msgs)
  {
    ModuleElement oldModule = module;
    module = newModule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamlPackage.MODEL__MODULE, oldModule, newModule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModule(ModuleElement newModule)
  {
    if (newModule != module)
    {
      NotificationChain msgs = null;
      if (module != null)
        msgs = ((InternalEObject)module).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamlPackage.MODEL__MODULE, null, msgs);
      if (newModule != null)
        msgs = ((InternalEObject)newModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamlPackage.MODEL__MODULE, null, msgs);
      msgs = basicSetModule(newModule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.MODEL__MODULE, newModule, newModule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportElement> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportElement>(ImportElement.class, this, SamlPackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TranslationElement> getTranslations()
  {
    if (translations == null)
    {
      translations = new EObjectContainmentEList<TranslationElement>(TranslationElement.class, this, SamlPackage.MODEL__TRANSLATIONS);
    }
    return translations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CodeElement> getCodes()
  {
    if (codes == null)
    {
      codes = new EObjectContainmentEList<CodeElement>(CodeElement.class, this, SamlPackage.MODEL__CODES);
    }
    return codes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LookupElement> getLookups()
  {
    if (lookups == null)
    {
      lookups = new EObjectContainmentEList<LookupElement>(LookupElement.class, this, SamlPackage.MODEL__LOOKUPS);
    }
    return lookups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateElement> getTemplates()
  {
    if (templates == null)
    {
      templates = new EObjectContainmentEList<TemplateElement>(TemplateElement.class, this, SamlPackage.MODEL__TEMPLATES);
    }
    return templates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FormElement> getForms()
  {
    if (forms == null)
    {
      forms = new EObjectContainmentEList<FormElement>(FormElement.class, this, SamlPackage.MODEL__FORMS);
    }
    return forms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LogicElement> getLogics()
  {
    if (logics == null)
    {
      logics = new EObjectContainmentEList<LogicElement>(LogicElement.class, this, SamlPackage.MODEL__LOGICS);
    }
    return logics;
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
      case SamlPackage.MODEL__MODULE:
        return basicSetModule(null, msgs);
      case SamlPackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case SamlPackage.MODEL__TRANSLATIONS:
        return ((InternalEList<?>)getTranslations()).basicRemove(otherEnd, msgs);
      case SamlPackage.MODEL__CODES:
        return ((InternalEList<?>)getCodes()).basicRemove(otherEnd, msgs);
      case SamlPackage.MODEL__LOOKUPS:
        return ((InternalEList<?>)getLookups()).basicRemove(otherEnd, msgs);
      case SamlPackage.MODEL__TEMPLATES:
        return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
      case SamlPackage.MODEL__FORMS:
        return ((InternalEList<?>)getForms()).basicRemove(otherEnd, msgs);
      case SamlPackage.MODEL__LOGICS:
        return ((InternalEList<?>)getLogics()).basicRemove(otherEnd, msgs);
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
      case SamlPackage.MODEL__MODULE:
        return getModule();
      case SamlPackage.MODEL__IMPORTS:
        return getImports();
      case SamlPackage.MODEL__TRANSLATIONS:
        return getTranslations();
      case SamlPackage.MODEL__CODES:
        return getCodes();
      case SamlPackage.MODEL__LOOKUPS:
        return getLookups();
      case SamlPackage.MODEL__TEMPLATES:
        return getTemplates();
      case SamlPackage.MODEL__FORMS:
        return getForms();
      case SamlPackage.MODEL__LOGICS:
        return getLogics();
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
      case SamlPackage.MODEL__MODULE:
        setModule((ModuleElement)newValue);
        return;
      case SamlPackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportElement>)newValue);
        return;
      case SamlPackage.MODEL__TRANSLATIONS:
        getTranslations().clear();
        getTranslations().addAll((Collection<? extends TranslationElement>)newValue);
        return;
      case SamlPackage.MODEL__CODES:
        getCodes().clear();
        getCodes().addAll((Collection<? extends CodeElement>)newValue);
        return;
      case SamlPackage.MODEL__LOOKUPS:
        getLookups().clear();
        getLookups().addAll((Collection<? extends LookupElement>)newValue);
        return;
      case SamlPackage.MODEL__TEMPLATES:
        getTemplates().clear();
        getTemplates().addAll((Collection<? extends TemplateElement>)newValue);
        return;
      case SamlPackage.MODEL__FORMS:
        getForms().clear();
        getForms().addAll((Collection<? extends FormElement>)newValue);
        return;
      case SamlPackage.MODEL__LOGICS:
        getLogics().clear();
        getLogics().addAll((Collection<? extends LogicElement>)newValue);
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
      case SamlPackage.MODEL__MODULE:
        setModule((ModuleElement)null);
        return;
      case SamlPackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case SamlPackage.MODEL__TRANSLATIONS:
        getTranslations().clear();
        return;
      case SamlPackage.MODEL__CODES:
        getCodes().clear();
        return;
      case SamlPackage.MODEL__LOOKUPS:
        getLookups().clear();
        return;
      case SamlPackage.MODEL__TEMPLATES:
        getTemplates().clear();
        return;
      case SamlPackage.MODEL__FORMS:
        getForms().clear();
        return;
      case SamlPackage.MODEL__LOGICS:
        getLogics().clear();
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
      case SamlPackage.MODEL__MODULE:
        return module != null;
      case SamlPackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case SamlPackage.MODEL__TRANSLATIONS:
        return translations != null && !translations.isEmpty();
      case SamlPackage.MODEL__CODES:
        return codes != null && !codes.isEmpty();
      case SamlPackage.MODEL__LOOKUPS:
        return lookups != null && !lookups.isEmpty();
      case SamlPackage.MODEL__TEMPLATES:
        return templates != null && !templates.isEmpty();
      case SamlPackage.MODEL__FORMS:
        return forms != null && !forms.isEmpty();
      case SamlPackage.MODEL__LOGICS:
        return logics != null && !logics.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
