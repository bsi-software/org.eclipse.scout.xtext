/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.scout.saml.saml.BigDecimalElement;
import org.eclipse.scout.saml.saml.ButtonElement;
import org.eclipse.scout.saml.saml.CheckboxElement;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.ColumnElement;
import org.eclipse.scout.saml.saml.CompositeFieldElement;
import org.eclipse.scout.saml.saml.CustomFieldElement;
import org.eclipse.scout.saml.saml.DateElement;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.GenericValueFieldElement;
import org.eclipse.scout.saml.saml.GroupBoxElement;
import org.eclipse.scout.saml.saml.ImportElement;
import org.eclipse.scout.saml.saml.KeyElement;
import org.eclipse.scout.saml.saml.LanguageAttribute;
import org.eclipse.scout.saml.saml.ListBoxElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.MenuElement;
import org.eclipse.scout.saml.saml.Model;
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.saml.saml.SamlFactory;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.SequenceBoxElement;
import org.eclipse.scout.saml.saml.SmartfieldElement;
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.saml.TabBoxElement;
import org.eclipse.scout.saml.saml.TabElement;
import org.eclipse.scout.saml.saml.TableElement;
import org.eclipse.scout.saml.saml.TemplateElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.saml.saml.ValueFieldElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SamlPackageImpl extends EPackageImpl implements SamlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass translationElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass languageAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass codeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookupElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formFieldElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositeFieldElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceBoxElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupBoxElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueFieldElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericValueFieldElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bigDecimalElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smartfieldElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listBoxElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customFieldElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass menuElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tabElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tabBoxElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkboxElementEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.scout.saml.saml.SamlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SamlPackageImpl()
  {
    super(eNS_URI, SamlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SamlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SamlPackage init()
  {
    if (isInited) return (SamlPackage)EPackage.Registry.INSTANCE.getEPackage(SamlPackage.eNS_URI);

    // Obtain or create and register package
    SamlPackageImpl theSamlPackage = (SamlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SamlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SamlPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSamlPackage.createPackageContents();

    // Initialize created meta-data
    theSamlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSamlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SamlPackage.eNS_URI, theSamlPackage);
    return theSamlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Module()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Imports()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Translations()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Codes()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Lookups()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Templates()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Forms()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Logics()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleElement()
  {
    return moduleElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModuleElement_Name()
  {
    return (EAttribute)moduleElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportElement()
  {
    return importElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportElement_ImportedNamespace()
  {
    return (EAttribute)importElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTranslationElement()
  {
    return translationElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTranslationElement_Name()
  {
    return (EAttribute)translationElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTranslationElement_Translations()
  {
    return (EReference)translationElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLanguageAttribute()
  {
    return languageAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLanguageAttribute_Lang()
  {
    return (EAttribute)languageAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLanguageAttribute_Text()
  {
    return (EAttribute)languageAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicElement()
  {
    return logicElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicElement_Name()
  {
    return (EAttribute)logicElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicElement_Event()
  {
    return (EAttribute)logicElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicElement_Placement()
  {
    return (EAttribute)logicElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicElement_Exec()
  {
    return (EReference)logicElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicElement_Source()
  {
    return (EAttribute)logicElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeElement()
  {
    return codeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeElement_Name()
  {
    return (EAttribute)codeElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeElement_Id()
  {
    return (EAttribute)codeElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeElement_ValueType()
  {
    return (EAttribute)codeElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeElement_Text()
  {
    return (EReference)codeElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeElement_SuperType()
  {
    return (EReference)codeElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeElement_Logic()
  {
    return (EReference)codeElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCodeElement_Codes()
  {
    return (EReference)codeElementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLookupElement()
  {
    return lookupElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLookupElement_Name()
  {
    return (EAttribute)lookupElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLookupElement_Logic()
  {
    return (EReference)lookupElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateElement()
  {
    return templateElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTemplateElement_Name()
  {
    return (EAttribute)templateElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTemplateElement_Definition()
  {
    return (EAttribute)templateElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormElement()
  {
    return formElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormElement_Name()
  {
    return (EAttribute)formElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormElement_Modal()
  {
    return (EAttribute)formElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormElement_Columns()
  {
    return (EAttribute)formElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormElement_Title()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormElement_Subtitle()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormElement_WidthInPixels()
  {
    return (EAttribute)formElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormElement_SuperType()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormElement_Logic()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormElement_Fields()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormElement_KeyStrokes()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormFieldElement()
  {
    return formFieldElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormFieldElement_Name()
  {
    return (EAttribute)formFieldElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormFieldElement_Enabled()
  {
    return (EAttribute)formFieldElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormFieldElement_Visible()
  {
    return (EAttribute)formFieldElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormFieldElement_SuperType()
  {
    return (EReference)formFieldElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormFieldElement_Logic()
  {
    return (EReference)formFieldElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeFieldElement()
  {
    return compositeFieldElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeFieldElement_Text()
  {
    return (EReference)compositeFieldElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeFieldElement_Fields()
  {
    return (EReference)compositeFieldElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequenceBoxElement()
  {
    return sequenceBoxElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSequenceBoxElement_LabelVisible()
  {
    return (EAttribute)sequenceBoxElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSequenceBoxElement_GridWidth()
  {
    return (EAttribute)sequenceBoxElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSequenceBoxElement_WidthInPixels()
  {
    return (EAttribute)sequenceBoxElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupBoxElement()
  {
    return groupBoxElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupBoxElement_Columns()
  {
    return (EAttribute)groupBoxElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupBoxElement_LabelVisible()
  {
    return (EAttribute)groupBoxElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupBoxElement_BorderVisible()
  {
    return (EAttribute)groupBoxElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupBoxElement_BorderDecoration()
  {
    return (EAttribute)groupBoxElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupBoxElement_GridHeight()
  {
    return (EAttribute)groupBoxElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupBoxElement_GridWidth()
  {
    return (EAttribute)groupBoxElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupBoxElement_WidthInPixels()
  {
    return (EAttribute)groupBoxElementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueFieldElement()
  {
    return valueFieldElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueFieldElement_Text()
  {
    return (EReference)valueFieldElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueFieldElement_LabelVisible()
  {
    return (EAttribute)valueFieldElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueFieldElement_Master()
  {
    return (EReference)valueFieldElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueFieldElement_Mandatory()
  {
    return (EAttribute)valueFieldElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueFieldElement_GridWidth()
  {
    return (EAttribute)valueFieldElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueFieldElement_WidthInPixels()
  {
    return (EAttribute)valueFieldElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenericValueFieldElement()
  {
    return genericValueFieldElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericValueFieldElement_Code()
  {
    return (EReference)genericValueFieldElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenericValueFieldElement_ValueType()
  {
    return (EAttribute)genericValueFieldElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenericValueFieldElement_Lookup()
  {
    return (EReference)genericValueFieldElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringElement()
  {
    return stringElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringElement_Maxlen()
  {
    return (EAttribute)stringElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringElement_GridHeight()
  {
    return (EAttribute)stringElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringElement_HorizontalAlign()
  {
    return (EAttribute)stringElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBigDecimalElement()
  {
    return bigDecimalElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBigDecimalElement_Percent()
  {
    return (EAttribute)bigDecimalElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBigDecimalElement_Grouping()
  {
    return (EAttribute)bigDecimalElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBigDecimalElement_HorizontalAlign()
  {
    return (EAttribute)bigDecimalElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBigDecimalElement_FractionDigits()
  {
    return (EAttribute)bigDecimalElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBigDecimalElement_Min()
  {
    return (EAttribute)bigDecimalElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBigDecimalElement_Max()
  {
    return (EAttribute)bigDecimalElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLongElement()
  {
    return longElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLongElement_HorizontalAlign()
  {
    return (EAttribute)longElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLongElement_Min()
  {
    return (EAttribute)longElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLongElement_Max()
  {
    return (EAttribute)longElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateElement()
  {
    return dateElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmartfieldElement()
  {
    return smartfieldElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartfieldElement_Menus()
  {
    return (EReference)smartfieldElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListBoxElement()
  {
    return listBoxElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListBoxElement_GridHeight()
  {
    return (EAttribute)listBoxElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustomFieldElement()
  {
    return customFieldElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomFieldElement_Text()
  {
    return (EReference)customFieldElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomFieldElement_LabelVisible()
  {
    return (EAttribute)customFieldElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomFieldElement_GridWidth()
  {
    return (EAttribute)customFieldElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustomFieldElement_WidthInPixels()
  {
    return (EAttribute)customFieldElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomFieldElement_Fields()
  {
    return (EReference)customFieldElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButtonElement()
  {
    return buttonElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButtonElement_Text()
  {
    return (EReference)buttonElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButtonElement_ProcessButton()
  {
    return (EAttribute)buttonElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButtonElement_Type()
  {
    return (EAttribute)buttonElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButtonElement_GridWidth()
  {
    return (EAttribute)buttonElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButtonElement_WidthInPixels()
  {
    return (EAttribute)buttonElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButtonElement_Menus()
  {
    return (EReference)buttonElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMenuElement()
  {
    return menuElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenuElement_Name()
  {
    return (EAttribute)menuElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenuElement_Enabled()
  {
    return (EAttribute)menuElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenuElement_Visible()
  {
    return (EAttribute)menuElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenuElement_SingleSelect()
  {
    return (EAttribute)menuElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenuElement_MultiSelect()
  {
    return (EAttribute)menuElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenuElement_EmptySelect()
  {
    return (EAttribute)menuElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMenuElement_Type()
  {
    return (EAttribute)menuElementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenuElement_Text()
  {
    return (EReference)menuElementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenuElement_SuperType()
  {
    return (EReference)menuElementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenuElement_Logic()
  {
    return (EReference)menuElementEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMenuElement_Menus()
  {
    return (EReference)menuElementEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableElement()
  {
    return tableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableElement_Text()
  {
    return (EReference)tableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableElement_LabelVisible()
  {
    return (EAttribute)tableElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableElement_GridHeight()
  {
    return (EAttribute)tableElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableElement_GridWidth()
  {
    return (EAttribute)tableElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableElement_WidthInPixels()
  {
    return (EAttribute)tableElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableElement_Menus()
  {
    return (EReference)tableElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableElement_Columns()
  {
    return (EReference)tableElementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnElement()
  {
    return columnElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnElement_Name()
  {
    return (EAttribute)columnElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnElement_Type()
  {
    return (EAttribute)columnElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColumnElement_Text()
  {
    return (EReference)columnElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnElement_Width()
  {
    return (EAttribute)columnElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnElement_Visible()
  {
    return (EAttribute)columnElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnElement_Displayable()
  {
    return (EAttribute)columnElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeyElement()
  {
    return keyElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyElement_Name()
  {
    return (EAttribute)keyElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyElement_Stroke()
  {
    return (EAttribute)keyElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeyElement_Logic()
  {
    return (EReference)keyElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTabElement()
  {
    return tabElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTabElement_Columns()
  {
    return (EAttribute)tabElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTabBoxElement()
  {
    return tabBoxElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTabBoxElement_GridWidth()
  {
    return (EAttribute)tabBoxElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTabBoxElement_WidthInPixels()
  {
    return (EAttribute)tabBoxElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabBoxElement_Tabs()
  {
    return (EReference)tabBoxElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheckboxElement()
  {
    return checkboxElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SamlFactory getSamlFactory()
  {
    return (SamlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__MODULE);
    createEReference(modelEClass, MODEL__IMPORTS);
    createEReference(modelEClass, MODEL__TRANSLATIONS);
    createEReference(modelEClass, MODEL__CODES);
    createEReference(modelEClass, MODEL__LOOKUPS);
    createEReference(modelEClass, MODEL__TEMPLATES);
    createEReference(modelEClass, MODEL__FORMS);
    createEReference(modelEClass, MODEL__LOGICS);

    moduleElementEClass = createEClass(MODULE_ELEMENT);
    createEAttribute(moduleElementEClass, MODULE_ELEMENT__NAME);

    importElementEClass = createEClass(IMPORT_ELEMENT);
    createEAttribute(importElementEClass, IMPORT_ELEMENT__IMPORTED_NAMESPACE);

    translationElementEClass = createEClass(TRANSLATION_ELEMENT);
    createEAttribute(translationElementEClass, TRANSLATION_ELEMENT__NAME);
    createEReference(translationElementEClass, TRANSLATION_ELEMENT__TRANSLATIONS);

    languageAttributeEClass = createEClass(LANGUAGE_ATTRIBUTE);
    createEAttribute(languageAttributeEClass, LANGUAGE_ATTRIBUTE__LANG);
    createEAttribute(languageAttributeEClass, LANGUAGE_ATTRIBUTE__TEXT);

    logicElementEClass = createEClass(LOGIC_ELEMENT);
    createEAttribute(logicElementEClass, LOGIC_ELEMENT__NAME);
    createEAttribute(logicElementEClass, LOGIC_ELEMENT__EVENT);
    createEAttribute(logicElementEClass, LOGIC_ELEMENT__PLACEMENT);
    createEReference(logicElementEClass, LOGIC_ELEMENT__EXEC);
    createEAttribute(logicElementEClass, LOGIC_ELEMENT__SOURCE);

    codeElementEClass = createEClass(CODE_ELEMENT);
    createEAttribute(codeElementEClass, CODE_ELEMENT__NAME);
    createEAttribute(codeElementEClass, CODE_ELEMENT__ID);
    createEAttribute(codeElementEClass, CODE_ELEMENT__VALUE_TYPE);
    createEReference(codeElementEClass, CODE_ELEMENT__TEXT);
    createEReference(codeElementEClass, CODE_ELEMENT__SUPER_TYPE);
    createEReference(codeElementEClass, CODE_ELEMENT__LOGIC);
    createEReference(codeElementEClass, CODE_ELEMENT__CODES);

    lookupElementEClass = createEClass(LOOKUP_ELEMENT);
    createEAttribute(lookupElementEClass, LOOKUP_ELEMENT__NAME);
    createEReference(lookupElementEClass, LOOKUP_ELEMENT__LOGIC);

    templateElementEClass = createEClass(TEMPLATE_ELEMENT);
    createEAttribute(templateElementEClass, TEMPLATE_ELEMENT__NAME);
    createEAttribute(templateElementEClass, TEMPLATE_ELEMENT__DEFINITION);

    formElementEClass = createEClass(FORM_ELEMENT);
    createEAttribute(formElementEClass, FORM_ELEMENT__NAME);
    createEAttribute(formElementEClass, FORM_ELEMENT__MODAL);
    createEAttribute(formElementEClass, FORM_ELEMENT__COLUMNS);
    createEReference(formElementEClass, FORM_ELEMENT__TITLE);
    createEReference(formElementEClass, FORM_ELEMENT__SUBTITLE);
    createEAttribute(formElementEClass, FORM_ELEMENT__WIDTH_IN_PIXELS);
    createEReference(formElementEClass, FORM_ELEMENT__SUPER_TYPE);
    createEReference(formElementEClass, FORM_ELEMENT__LOGIC);
    createEReference(formElementEClass, FORM_ELEMENT__FIELDS);
    createEReference(formElementEClass, FORM_ELEMENT__KEY_STROKES);

    formFieldElementEClass = createEClass(FORM_FIELD_ELEMENT);
    createEAttribute(formFieldElementEClass, FORM_FIELD_ELEMENT__NAME);
    createEAttribute(formFieldElementEClass, FORM_FIELD_ELEMENT__ENABLED);
    createEAttribute(formFieldElementEClass, FORM_FIELD_ELEMENT__VISIBLE);
    createEReference(formFieldElementEClass, FORM_FIELD_ELEMENT__SUPER_TYPE);
    createEReference(formFieldElementEClass, FORM_FIELD_ELEMENT__LOGIC);

    compositeFieldElementEClass = createEClass(COMPOSITE_FIELD_ELEMENT);
    createEReference(compositeFieldElementEClass, COMPOSITE_FIELD_ELEMENT__TEXT);
    createEReference(compositeFieldElementEClass, COMPOSITE_FIELD_ELEMENT__FIELDS);

    sequenceBoxElementEClass = createEClass(SEQUENCE_BOX_ELEMENT);
    createEAttribute(sequenceBoxElementEClass, SEQUENCE_BOX_ELEMENT__LABEL_VISIBLE);
    createEAttribute(sequenceBoxElementEClass, SEQUENCE_BOX_ELEMENT__GRID_WIDTH);
    createEAttribute(sequenceBoxElementEClass, SEQUENCE_BOX_ELEMENT__WIDTH_IN_PIXELS);

    groupBoxElementEClass = createEClass(GROUP_BOX_ELEMENT);
    createEAttribute(groupBoxElementEClass, GROUP_BOX_ELEMENT__COLUMNS);
    createEAttribute(groupBoxElementEClass, GROUP_BOX_ELEMENT__LABEL_VISIBLE);
    createEAttribute(groupBoxElementEClass, GROUP_BOX_ELEMENT__BORDER_VISIBLE);
    createEAttribute(groupBoxElementEClass, GROUP_BOX_ELEMENT__BORDER_DECORATION);
    createEAttribute(groupBoxElementEClass, GROUP_BOX_ELEMENT__GRID_HEIGHT);
    createEAttribute(groupBoxElementEClass, GROUP_BOX_ELEMENT__GRID_WIDTH);
    createEAttribute(groupBoxElementEClass, GROUP_BOX_ELEMENT__WIDTH_IN_PIXELS);

    valueFieldElementEClass = createEClass(VALUE_FIELD_ELEMENT);
    createEReference(valueFieldElementEClass, VALUE_FIELD_ELEMENT__TEXT);
    createEAttribute(valueFieldElementEClass, VALUE_FIELD_ELEMENT__LABEL_VISIBLE);
    createEReference(valueFieldElementEClass, VALUE_FIELD_ELEMENT__MASTER);
    createEAttribute(valueFieldElementEClass, VALUE_FIELD_ELEMENT__MANDATORY);
    createEAttribute(valueFieldElementEClass, VALUE_FIELD_ELEMENT__GRID_WIDTH);
    createEAttribute(valueFieldElementEClass, VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS);

    genericValueFieldElementEClass = createEClass(GENERIC_VALUE_FIELD_ELEMENT);
    createEReference(genericValueFieldElementEClass, GENERIC_VALUE_FIELD_ELEMENT__CODE);
    createEAttribute(genericValueFieldElementEClass, GENERIC_VALUE_FIELD_ELEMENT__VALUE_TYPE);
    createEReference(genericValueFieldElementEClass, GENERIC_VALUE_FIELD_ELEMENT__LOOKUP);

    stringElementEClass = createEClass(STRING_ELEMENT);
    createEAttribute(stringElementEClass, STRING_ELEMENT__MAXLEN);
    createEAttribute(stringElementEClass, STRING_ELEMENT__GRID_HEIGHT);
    createEAttribute(stringElementEClass, STRING_ELEMENT__HORIZONTAL_ALIGN);

    bigDecimalElementEClass = createEClass(BIG_DECIMAL_ELEMENT);
    createEAttribute(bigDecimalElementEClass, BIG_DECIMAL_ELEMENT__PERCENT);
    createEAttribute(bigDecimalElementEClass, BIG_DECIMAL_ELEMENT__GROUPING);
    createEAttribute(bigDecimalElementEClass, BIG_DECIMAL_ELEMENT__HORIZONTAL_ALIGN);
    createEAttribute(bigDecimalElementEClass, BIG_DECIMAL_ELEMENT__FRACTION_DIGITS);
    createEAttribute(bigDecimalElementEClass, BIG_DECIMAL_ELEMENT__MIN);
    createEAttribute(bigDecimalElementEClass, BIG_DECIMAL_ELEMENT__MAX);

    longElementEClass = createEClass(LONG_ELEMENT);
    createEAttribute(longElementEClass, LONG_ELEMENT__HORIZONTAL_ALIGN);
    createEAttribute(longElementEClass, LONG_ELEMENT__MIN);
    createEAttribute(longElementEClass, LONG_ELEMENT__MAX);

    dateElementEClass = createEClass(DATE_ELEMENT);

    smartfieldElementEClass = createEClass(SMARTFIELD_ELEMENT);
    createEReference(smartfieldElementEClass, SMARTFIELD_ELEMENT__MENUS);

    listBoxElementEClass = createEClass(LIST_BOX_ELEMENT);
    createEAttribute(listBoxElementEClass, LIST_BOX_ELEMENT__GRID_HEIGHT);

    customFieldElementEClass = createEClass(CUSTOM_FIELD_ELEMENT);
    createEReference(customFieldElementEClass, CUSTOM_FIELD_ELEMENT__TEXT);
    createEAttribute(customFieldElementEClass, CUSTOM_FIELD_ELEMENT__LABEL_VISIBLE);
    createEAttribute(customFieldElementEClass, CUSTOM_FIELD_ELEMENT__GRID_WIDTH);
    createEAttribute(customFieldElementEClass, CUSTOM_FIELD_ELEMENT__WIDTH_IN_PIXELS);
    createEReference(customFieldElementEClass, CUSTOM_FIELD_ELEMENT__FIELDS);

    buttonElementEClass = createEClass(BUTTON_ELEMENT);
    createEReference(buttonElementEClass, BUTTON_ELEMENT__TEXT);
    createEAttribute(buttonElementEClass, BUTTON_ELEMENT__PROCESS_BUTTON);
    createEAttribute(buttonElementEClass, BUTTON_ELEMENT__TYPE);
    createEAttribute(buttonElementEClass, BUTTON_ELEMENT__GRID_WIDTH);
    createEAttribute(buttonElementEClass, BUTTON_ELEMENT__WIDTH_IN_PIXELS);
    createEReference(buttonElementEClass, BUTTON_ELEMENT__MENUS);

    menuElementEClass = createEClass(MENU_ELEMENT);
    createEAttribute(menuElementEClass, MENU_ELEMENT__NAME);
    createEAttribute(menuElementEClass, MENU_ELEMENT__ENABLED);
    createEAttribute(menuElementEClass, MENU_ELEMENT__VISIBLE);
    createEAttribute(menuElementEClass, MENU_ELEMENT__SINGLE_SELECT);
    createEAttribute(menuElementEClass, MENU_ELEMENT__MULTI_SELECT);
    createEAttribute(menuElementEClass, MENU_ELEMENT__EMPTY_SELECT);
    createEAttribute(menuElementEClass, MENU_ELEMENT__TYPE);
    createEReference(menuElementEClass, MENU_ELEMENT__TEXT);
    createEReference(menuElementEClass, MENU_ELEMENT__SUPER_TYPE);
    createEReference(menuElementEClass, MENU_ELEMENT__LOGIC);
    createEReference(menuElementEClass, MENU_ELEMENT__MENUS);

    tableElementEClass = createEClass(TABLE_ELEMENT);
    createEReference(tableElementEClass, TABLE_ELEMENT__TEXT);
    createEAttribute(tableElementEClass, TABLE_ELEMENT__LABEL_VISIBLE);
    createEAttribute(tableElementEClass, TABLE_ELEMENT__GRID_HEIGHT);
    createEAttribute(tableElementEClass, TABLE_ELEMENT__GRID_WIDTH);
    createEAttribute(tableElementEClass, TABLE_ELEMENT__WIDTH_IN_PIXELS);
    createEReference(tableElementEClass, TABLE_ELEMENT__MENUS);
    createEReference(tableElementEClass, TABLE_ELEMENT__COLUMNS);

    columnElementEClass = createEClass(COLUMN_ELEMENT);
    createEAttribute(columnElementEClass, COLUMN_ELEMENT__NAME);
    createEAttribute(columnElementEClass, COLUMN_ELEMENT__TYPE);
    createEReference(columnElementEClass, COLUMN_ELEMENT__TEXT);
    createEAttribute(columnElementEClass, COLUMN_ELEMENT__WIDTH);
    createEAttribute(columnElementEClass, COLUMN_ELEMENT__VISIBLE);
    createEAttribute(columnElementEClass, COLUMN_ELEMENT__DISPLAYABLE);

    keyElementEClass = createEClass(KEY_ELEMENT);
    createEAttribute(keyElementEClass, KEY_ELEMENT__NAME);
    createEAttribute(keyElementEClass, KEY_ELEMENT__STROKE);
    createEReference(keyElementEClass, KEY_ELEMENT__LOGIC);

    tabElementEClass = createEClass(TAB_ELEMENT);
    createEAttribute(tabElementEClass, TAB_ELEMENT__COLUMNS);

    tabBoxElementEClass = createEClass(TAB_BOX_ELEMENT);
    createEAttribute(tabBoxElementEClass, TAB_BOX_ELEMENT__GRID_WIDTH);
    createEAttribute(tabBoxElementEClass, TAB_BOX_ELEMENT__WIDTH_IN_PIXELS);
    createEReference(tabBoxElementEClass, TAB_BOX_ELEMENT__TABS);

    checkboxElementEClass = createEClass(CHECKBOX_ELEMENT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    compositeFieldElementEClass.getESuperTypes().add(this.getFormFieldElement());
    sequenceBoxElementEClass.getESuperTypes().add(this.getCompositeFieldElement());
    groupBoxElementEClass.getESuperTypes().add(this.getCompositeFieldElement());
    valueFieldElementEClass.getESuperTypes().add(this.getFormFieldElement());
    genericValueFieldElementEClass.getESuperTypes().add(this.getValueFieldElement());
    stringElementEClass.getESuperTypes().add(this.getValueFieldElement());
    bigDecimalElementEClass.getESuperTypes().add(this.getValueFieldElement());
    longElementEClass.getESuperTypes().add(this.getValueFieldElement());
    dateElementEClass.getESuperTypes().add(this.getValueFieldElement());
    smartfieldElementEClass.getESuperTypes().add(this.getGenericValueFieldElement());
    listBoxElementEClass.getESuperTypes().add(this.getGenericValueFieldElement());
    customFieldElementEClass.getESuperTypes().add(this.getFormFieldElement());
    buttonElementEClass.getESuperTypes().add(this.getFormFieldElement());
    tableElementEClass.getESuperTypes().add(this.getFormFieldElement());
    tabElementEClass.getESuperTypes().add(this.getCompositeFieldElement());
    tabBoxElementEClass.getESuperTypes().add(this.getFormFieldElement());
    checkboxElementEClass.getESuperTypes().add(this.getValueFieldElement());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Module(), this.getModuleElement(), null, "module", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Imports(), this.getImportElement(), null, "imports", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Translations(), this.getTranslationElement(), null, "translations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Codes(), this.getCodeElement(), null, "codes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Lookups(), this.getLookupElement(), null, "lookups", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Templates(), this.getTemplateElement(), null, "templates", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Forms(), this.getFormElement(), null, "forms", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Logics(), this.getLogicElement(), null, "logics", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleElementEClass, ModuleElement.class, "ModuleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModuleElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importElementEClass, ImportElement.class, "ImportElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportElement_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, ImportElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(translationElementEClass, TranslationElement.class, "TranslationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTranslationElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, TranslationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTranslationElement_Translations(), this.getLanguageAttribute(), null, "translations", null, 0, -1, TranslationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(languageAttributeEClass, LanguageAttribute.class, "LanguageAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLanguageAttribute_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, LanguageAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguageAttribute_Text(), ecorePackage.getEString(), "text", null, 0, 1, LanguageAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicElementEClass, LogicElement.class, "LogicElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLogicElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogicElement_Event(), ecorePackage.getEString(), "event", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogicElement_Placement(), ecorePackage.getEString(), "placement", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicElement_Exec(), this.getLogicElement(), null, "exec", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogicElement_Source(), ecorePackage.getEString(), "source", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeElementEClass, CodeElement.class, "CodeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCodeElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCodeElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCodeElement_ValueType(), ecorePackage.getEString(), "valueType", null, 0, 1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCodeElement_Text(), this.getTranslationElement(), null, "text", null, 0, 1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCodeElement_SuperType(), this.getTemplateElement(), null, "superType", null, 0, 1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCodeElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCodeElement_Codes(), this.getCodeElement(), null, "codes", null, 0, -1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lookupElementEClass, LookupElement.class, "LookupElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLookupElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, LookupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLookupElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, LookupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateElementEClass, TemplateElement.class, "TemplateElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTemplateElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, TemplateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTemplateElement_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, TemplateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formElementEClass, FormElement.class, "FormElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFormElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormElement_Modal(), ecorePackage.getEString(), "modal", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormElement_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_Title(), this.getTranslationElement(), null, "title", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_Subtitle(), this.getTranslationElement(), null, "subtitle", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormElement_WidthInPixels(), ecorePackage.getEInt(), "widthInPixels", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_SuperType(), this.getTemplateElement(), null, "superType", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_Fields(), this.getFormFieldElement(), null, "fields", null, 0, -1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_KeyStrokes(), this.getKeyElement(), null, "keyStrokes", null, 0, -1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formFieldElementEClass, FormFieldElement.class, "FormFieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFormFieldElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormFieldElement_Enabled(), ecorePackage.getEString(), "enabled", null, 0, 1, FormFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormFieldElement_Visible(), ecorePackage.getEString(), "visible", null, 0, 1, FormFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormFieldElement_SuperType(), this.getTemplateElement(), null, "superType", null, 0, 1, FormFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormFieldElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, FormFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositeFieldElementEClass, CompositeFieldElement.class, "CompositeFieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompositeFieldElement_Text(), this.getTranslationElement(), null, "text", null, 0, 1, CompositeFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositeFieldElement_Fields(), this.getFormFieldElement(), null, "fields", null, 0, -1, CompositeFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceBoxElementEClass, SequenceBoxElement.class, "SequenceBoxElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSequenceBoxElement_LabelVisible(), ecorePackage.getEString(), "labelVisible", null, 0, 1, SequenceBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSequenceBoxElement_GridWidth(), ecorePackage.getEInt(), "gridWidth", null, 0, 1, SequenceBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSequenceBoxElement_WidthInPixels(), ecorePackage.getEInt(), "widthInPixels", null, 0, 1, SequenceBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupBoxElementEClass, GroupBoxElement.class, "GroupBoxElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGroupBoxElement_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, GroupBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGroupBoxElement_LabelVisible(), ecorePackage.getEString(), "labelVisible", null, 0, 1, GroupBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGroupBoxElement_BorderVisible(), ecorePackage.getEString(), "borderVisible", null, 0, 1, GroupBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGroupBoxElement_BorderDecoration(), ecorePackage.getEString(), "borderDecoration", null, 0, 1, GroupBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGroupBoxElement_GridHeight(), ecorePackage.getEInt(), "gridHeight", null, 0, 1, GroupBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGroupBoxElement_GridWidth(), ecorePackage.getEInt(), "gridWidth", null, 0, 1, GroupBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGroupBoxElement_WidthInPixels(), ecorePackage.getEInt(), "widthInPixels", null, 0, 1, GroupBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueFieldElementEClass, ValueFieldElement.class, "ValueFieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValueFieldElement_Text(), this.getTranslationElement(), null, "text", null, 0, 1, ValueFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValueFieldElement_LabelVisible(), ecorePackage.getEString(), "labelVisible", null, 0, 1, ValueFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValueFieldElement_Master(), this.getValueFieldElement(), null, "master", null, 0, 1, ValueFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValueFieldElement_Mandatory(), ecorePackage.getEString(), "mandatory", null, 0, 1, ValueFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValueFieldElement_GridWidth(), ecorePackage.getEInt(), "gridWidth", null, 0, 1, ValueFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValueFieldElement_WidthInPixels(), ecorePackage.getEInt(), "widthInPixels", null, 0, 1, ValueFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genericValueFieldElementEClass, GenericValueFieldElement.class, "GenericValueFieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGenericValueFieldElement_Code(), this.getCodeElement(), null, "code", null, 0, 1, GenericValueFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGenericValueFieldElement_ValueType(), ecorePackage.getEString(), "valueType", null, 0, 1, GenericValueFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGenericValueFieldElement_Lookup(), this.getLookupElement(), null, "lookup", null, 0, 1, GenericValueFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringElementEClass, StringElement.class, "StringElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringElement_Maxlen(), ecorePackage.getEInt(), "maxlen", null, 0, 1, StringElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringElement_GridHeight(), ecorePackage.getEInt(), "gridHeight", null, 0, 1, StringElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringElement_HorizontalAlign(), ecorePackage.getEString(), "horizontalAlign", null, 0, 1, StringElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bigDecimalElementEClass, BigDecimalElement.class, "BigDecimalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBigDecimalElement_Percent(), ecorePackage.getEString(), "percent", null, 0, 1, BigDecimalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBigDecimalElement_Grouping(), ecorePackage.getEString(), "grouping", null, 0, 1, BigDecimalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBigDecimalElement_HorizontalAlign(), ecorePackage.getEString(), "horizontalAlign", null, 0, 1, BigDecimalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBigDecimalElement_FractionDigits(), ecorePackage.getEInt(), "fractionDigits", null, 0, 1, BigDecimalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBigDecimalElement_Min(), ecorePackage.getEString(), "min", null, 0, 1, BigDecimalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBigDecimalElement_Max(), ecorePackage.getEString(), "max", null, 0, 1, BigDecimalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(longElementEClass, LongElement.class, "LongElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLongElement_HorizontalAlign(), ecorePackage.getEString(), "horizontalAlign", null, 0, 1, LongElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLongElement_Min(), ecorePackage.getEInt(), "min", null, 0, 1, LongElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLongElement_Max(), ecorePackage.getEInt(), "max", null, 0, 1, LongElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateElementEClass, DateElement.class, "DateElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smartfieldElementEClass, SmartfieldElement.class, "SmartfieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSmartfieldElement_Menus(), this.getMenuElement(), null, "menus", null, 0, -1, SmartfieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listBoxElementEClass, ListBoxElement.class, "ListBoxElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getListBoxElement_GridHeight(), ecorePackage.getEInt(), "gridHeight", null, 0, 1, ListBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customFieldElementEClass, CustomFieldElement.class, "CustomFieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomFieldElement_Text(), this.getTranslationElement(), null, "text", null, 0, 1, CustomFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomFieldElement_LabelVisible(), ecorePackage.getEString(), "labelVisible", null, 0, 1, CustomFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomFieldElement_GridWidth(), ecorePackage.getEInt(), "gridWidth", null, 0, 1, CustomFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCustomFieldElement_WidthInPixels(), ecorePackage.getEInt(), "widthInPixels", null, 0, 1, CustomFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomFieldElement_Fields(), this.getFormFieldElement(), null, "fields", null, 0, -1, CustomFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonElementEClass, ButtonElement.class, "ButtonElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getButtonElement_Text(), this.getTranslationElement(), null, "text", null, 0, 1, ButtonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButtonElement_ProcessButton(), ecorePackage.getEString(), "processButton", null, 0, 1, ButtonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButtonElement_Type(), ecorePackage.getEString(), "type", null, 0, 1, ButtonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButtonElement_GridWidth(), ecorePackage.getEInt(), "gridWidth", null, 0, 1, ButtonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButtonElement_WidthInPixels(), ecorePackage.getEInt(), "widthInPixels", null, 0, 1, ButtonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButtonElement_Menus(), this.getMenuElement(), null, "menus", null, 0, -1, ButtonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(menuElementEClass, MenuElement.class, "MenuElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMenuElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MenuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMenuElement_Enabled(), ecorePackage.getEString(), "enabled", null, 0, 1, MenuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMenuElement_Visible(), ecorePackage.getEString(), "visible", null, 0, 1, MenuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMenuElement_SingleSelect(), ecorePackage.getEString(), "singleSelect", null, 0, 1, MenuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMenuElement_MultiSelect(), ecorePackage.getEString(), "multiSelect", null, 0, 1, MenuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMenuElement_EmptySelect(), ecorePackage.getEString(), "emptySelect", null, 0, 1, MenuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMenuElement_Type(), ecorePackage.getEString(), "type", null, 0, 1, MenuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMenuElement_Text(), this.getTranslationElement(), null, "text", null, 0, 1, MenuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMenuElement_SuperType(), this.getTemplateElement(), null, "superType", null, 0, 1, MenuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMenuElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, MenuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMenuElement_Menus(), this.getMenuElement(), null, "menus", null, 0, -1, MenuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableElementEClass, TableElement.class, "TableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableElement_Text(), this.getTranslationElement(), null, "text", null, 0, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableElement_LabelVisible(), ecorePackage.getEString(), "labelVisible", null, 0, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableElement_GridHeight(), ecorePackage.getEInt(), "gridHeight", null, 0, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableElement_GridWidth(), ecorePackage.getEInt(), "gridWidth", null, 0, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTableElement_WidthInPixels(), ecorePackage.getEInt(), "widthInPixels", null, 0, 1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableElement_Menus(), this.getMenuElement(), null, "menus", null, 0, -1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableElement_Columns(), this.getColumnElement(), null, "columns", null, 0, -1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnElementEClass, ColumnElement.class, "ColumnElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ColumnElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnElement_Type(), ecorePackage.getEString(), "type", null, 0, 1, ColumnElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColumnElement_Text(), this.getTranslationElement(), null, "text", null, 0, 1, ColumnElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnElement_Width(), ecorePackage.getEInt(), "width", null, 0, 1, ColumnElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnElement_Visible(), ecorePackage.getEString(), "visible", null, 0, 1, ColumnElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnElement_Displayable(), ecorePackage.getEString(), "displayable", null, 0, 1, ColumnElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keyElementEClass, KeyElement.class, "KeyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKeyElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKeyElement_Stroke(), ecorePackage.getEString(), "stroke", null, 0, 1, KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKeyElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, KeyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tabElementEClass, TabElement.class, "TabElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTabElement_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, TabElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tabBoxElementEClass, TabBoxElement.class, "TabBoxElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTabBoxElement_GridWidth(), ecorePackage.getEInt(), "gridWidth", null, 0, 1, TabBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTabBoxElement_WidthInPixels(), ecorePackage.getEInt(), "widthInPixels", null, 0, 1, TabBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTabBoxElement_Tabs(), this.getTabElement(), null, "tabs", null, 0, -1, TabBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkboxElementEClass, CheckboxElement.class, "CheckboxElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //SamlPackageImpl
