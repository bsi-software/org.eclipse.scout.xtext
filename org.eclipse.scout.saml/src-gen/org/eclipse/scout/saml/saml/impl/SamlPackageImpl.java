/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.CompositeFieldElement;
import org.eclipse.scout.saml.saml.CustomFieldElement;
import org.eclipse.scout.saml.saml.DateElement;
import org.eclipse.scout.saml.saml.DoubleElement;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.FormFieldProperties;
import org.eclipse.scout.saml.saml.GroupBoxElement;
import org.eclipse.scout.saml.saml.ImportElement;
import org.eclipse.scout.saml.saml.LanguageAttribute;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.Model;
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.saml.saml.SamlFactory;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.SequenceBoxElement;
import org.eclipse.scout.saml.saml.SmartfieldElement;
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.saml.TemplateElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.saml.saml.ValueFieldElement;
import org.eclipse.scout.saml.saml.ValueFieldProperties;
import org.eclipse.scout.saml.saml.XBlockExpression;
import org.eclipse.scout.saml.saml.XConstructorCall;
import org.eclipse.scout.saml.saml.XVariableDeclaration;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

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
  private EClass formFieldPropertiesEClass = null;

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
  private EClass valueFieldPropertiesEClass = null;

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
  private EClass doubleElementEClass = null;

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
  private EClass customFieldElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xBlockExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xConstructorCallEClass = null;

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

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();

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
  public EAttribute getLogicElement_Runat()
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
  public EReference getLogicElement_Source()
  {
    return (EReference)logicElementEClass.getEStructuralFeatures().get(4);
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
  public EReference getTemplateElement_Definition()
  {
    return (EReference)templateElementEClass.getEStructuralFeatures().get(1);
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
  public EReference getFormElement_Text()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormElement_Logic()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormElement_Fields()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(5);
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
  public EReference getFormFieldElement_Logic()
  {
    return (EReference)formFieldElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormFieldProperties()
  {
    return formFieldPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormFieldProperties_Text()
  {
    return (EReference)formFieldPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormFieldProperties_Enabled()
  {
    return (EAttribute)formFieldPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormFieldProperties_Visible()
  {
    return (EAttribute)formFieldPropertiesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormFieldProperties_Master()
  {
    return (EReference)formFieldPropertiesEClass.getEStructuralFeatures().get(3);
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
  public EReference getCompositeFieldElement_FormFieldProperties()
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
  public EClass getGroupBoxElement()
  {
    return groupBoxElementEClass;
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
  public EClass getValueFieldProperties()
  {
    return valueFieldPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueFieldProperties_FormFieldProperties()
  {
    return (EReference)valueFieldPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueFieldProperties_Mandatory()
  {
    return (EAttribute)valueFieldPropertiesEClass.getEStructuralFeatures().get(1);
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
  public EReference getStringElement_ValueFieldProperties()
  {
    return (EReference)stringElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringElement_Maxlen()
  {
    return (EAttribute)stringElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleElement()
  {
    return doubleElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoubleElement_ValueFieldProperties()
  {
    return (EReference)doubleElementEClass.getEStructuralFeatures().get(0);
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
  public EReference getLongElement_ValueFieldProperties()
  {
    return (EReference)longElementEClass.getEStructuralFeatures().get(0);
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
  public EReference getDateElement_ValueFieldProperties()
  {
    return (EReference)dateElementEClass.getEStructuralFeatures().get(0);
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
  public EReference getSmartfieldElement_ValueFieldProperties()
  {
    return (EReference)smartfieldElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartfieldElement_Code()
  {
    return (EReference)smartfieldElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartfieldElement_ValueType()
  {
    return (EReference)smartfieldElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartfieldElement_Lookup()
  {
    return (EReference)smartfieldElementEClass.getEStructuralFeatures().get(3);
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
  public EReference getCustomFieldElement_Template()
  {
    return (EReference)customFieldElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomFieldElement_FormFieldProperties()
  {
    return (EReference)customFieldElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCustomFieldElement_Fields()
  {
    return (EReference)customFieldElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXBlockExpression()
  {
    return xBlockExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXVariableDeclaration()
  {
    return xVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXConstructorCall()
  {
    return xConstructorCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXConstructorCall_IsArray()
  {
    return (EAttribute)xConstructorCallEClass.getEStructuralFeatures().get(0);
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
    createEAttribute(logicElementEClass, LOGIC_ELEMENT__RUNAT);
    createEReference(logicElementEClass, LOGIC_ELEMENT__EXEC);
    createEReference(logicElementEClass, LOGIC_ELEMENT__SOURCE);

    codeElementEClass = createEClass(CODE_ELEMENT);
    createEAttribute(codeElementEClass, CODE_ELEMENT__NAME);
    createEAttribute(codeElementEClass, CODE_ELEMENT__ID);

    lookupElementEClass = createEClass(LOOKUP_ELEMENT);
    createEAttribute(lookupElementEClass, LOOKUP_ELEMENT__NAME);
    createEReference(lookupElementEClass, LOOKUP_ELEMENT__LOGIC);

    templateElementEClass = createEClass(TEMPLATE_ELEMENT);
    createEAttribute(templateElementEClass, TEMPLATE_ELEMENT__NAME);
    createEReference(templateElementEClass, TEMPLATE_ELEMENT__DEFINITION);

    formElementEClass = createEClass(FORM_ELEMENT);
    createEAttribute(formElementEClass, FORM_ELEMENT__NAME);
    createEAttribute(formElementEClass, FORM_ELEMENT__MODAL);
    createEAttribute(formElementEClass, FORM_ELEMENT__COLUMNS);
    createEReference(formElementEClass, FORM_ELEMENT__TEXT);
    createEReference(formElementEClass, FORM_ELEMENT__LOGIC);
    createEReference(formElementEClass, FORM_ELEMENT__FIELDS);

    formFieldElementEClass = createEClass(FORM_FIELD_ELEMENT);
    createEAttribute(formFieldElementEClass, FORM_FIELD_ELEMENT__NAME);
    createEReference(formFieldElementEClass, FORM_FIELD_ELEMENT__LOGIC);

    formFieldPropertiesEClass = createEClass(FORM_FIELD_PROPERTIES);
    createEReference(formFieldPropertiesEClass, FORM_FIELD_PROPERTIES__TEXT);
    createEAttribute(formFieldPropertiesEClass, FORM_FIELD_PROPERTIES__ENABLED);
    createEAttribute(formFieldPropertiesEClass, FORM_FIELD_PROPERTIES__VISIBLE);
    createEReference(formFieldPropertiesEClass, FORM_FIELD_PROPERTIES__MASTER);

    compositeFieldElementEClass = createEClass(COMPOSITE_FIELD_ELEMENT);
    createEReference(compositeFieldElementEClass, COMPOSITE_FIELD_ELEMENT__FORM_FIELD_PROPERTIES);
    createEReference(compositeFieldElementEClass, COMPOSITE_FIELD_ELEMENT__FIELDS);

    sequenceBoxElementEClass = createEClass(SEQUENCE_BOX_ELEMENT);

    groupBoxElementEClass = createEClass(GROUP_BOX_ELEMENT);

    valueFieldElementEClass = createEClass(VALUE_FIELD_ELEMENT);

    valueFieldPropertiesEClass = createEClass(VALUE_FIELD_PROPERTIES);
    createEReference(valueFieldPropertiesEClass, VALUE_FIELD_PROPERTIES__FORM_FIELD_PROPERTIES);
    createEAttribute(valueFieldPropertiesEClass, VALUE_FIELD_PROPERTIES__MANDATORY);

    stringElementEClass = createEClass(STRING_ELEMENT);
    createEReference(stringElementEClass, STRING_ELEMENT__VALUE_FIELD_PROPERTIES);
    createEAttribute(stringElementEClass, STRING_ELEMENT__MAXLEN);

    doubleElementEClass = createEClass(DOUBLE_ELEMENT);
    createEReference(doubleElementEClass, DOUBLE_ELEMENT__VALUE_FIELD_PROPERTIES);

    longElementEClass = createEClass(LONG_ELEMENT);
    createEReference(longElementEClass, LONG_ELEMENT__VALUE_FIELD_PROPERTIES);

    dateElementEClass = createEClass(DATE_ELEMENT);
    createEReference(dateElementEClass, DATE_ELEMENT__VALUE_FIELD_PROPERTIES);

    smartfieldElementEClass = createEClass(SMARTFIELD_ELEMENT);
    createEReference(smartfieldElementEClass, SMARTFIELD_ELEMENT__VALUE_FIELD_PROPERTIES);
    createEReference(smartfieldElementEClass, SMARTFIELD_ELEMENT__CODE);
    createEReference(smartfieldElementEClass, SMARTFIELD_ELEMENT__VALUE_TYPE);
    createEReference(smartfieldElementEClass, SMARTFIELD_ELEMENT__LOOKUP);

    customFieldElementEClass = createEClass(CUSTOM_FIELD_ELEMENT);
    createEReference(customFieldElementEClass, CUSTOM_FIELD_ELEMENT__TEMPLATE);
    createEReference(customFieldElementEClass, CUSTOM_FIELD_ELEMENT__FORM_FIELD_PROPERTIES);
    createEReference(customFieldElementEClass, CUSTOM_FIELD_ELEMENT__FIELDS);

    xBlockExpressionEClass = createEClass(XBLOCK_EXPRESSION);

    xVariableDeclarationEClass = createEClass(XVARIABLE_DECLARATION);

    xConstructorCallEClass = createEClass(XCONSTRUCTOR_CALL);
    createEAttribute(xConstructorCallEClass, XCONSTRUCTOR_CALL__IS_ARRAY);
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

    // Obtain other dependent packages
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    compositeFieldElementEClass.getESuperTypes().add(this.getFormFieldElement());
    sequenceBoxElementEClass.getESuperTypes().add(this.getCompositeFieldElement());
    groupBoxElementEClass.getESuperTypes().add(this.getCompositeFieldElement());
    valueFieldElementEClass.getESuperTypes().add(this.getFormFieldElement());
    stringElementEClass.getESuperTypes().add(this.getValueFieldElement());
    doubleElementEClass.getESuperTypes().add(this.getValueFieldElement());
    longElementEClass.getESuperTypes().add(this.getValueFieldElement());
    dateElementEClass.getESuperTypes().add(this.getValueFieldElement());
    smartfieldElementEClass.getESuperTypes().add(this.getValueFieldElement());
    customFieldElementEClass.getESuperTypes().add(this.getValueFieldElement());
    xBlockExpressionEClass.getESuperTypes().add(theXbasePackage.getXBlockExpression());
    xVariableDeclarationEClass.getESuperTypes().add(theXbasePackage.getXVariableDeclaration());
    xConstructorCallEClass.getESuperTypes().add(theXbasePackage.getXConstructorCall());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Module(), this.getModuleElement(), null, "module", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Imports(), this.getImportElement(), null, "imports", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Translations(), this.getTranslationElement(), null, "translations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Codes(), this.getCodeElement(), null, "codes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Lookups(), this.getLookupElement(), null, "lookups", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Templates(), this.getTemplateElement(), null, "templates", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Forms(), this.getFormElement(), null, "forms", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEAttribute(getLogicElement_Runat(), ecorePackage.getEString(), "runat", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicElement_Exec(), this.getLogicElement(), null, "exec", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicElement_Source(), theXbasePackage.getXBlockExpression(), null, "source", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeElementEClass, CodeElement.class, "CodeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCodeElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCodeElement_Id(), ecorePackage.getEInt(), "id", null, 0, 1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lookupElementEClass, LookupElement.class, "LookupElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLookupElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, LookupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLookupElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, LookupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateElementEClass, TemplateElement.class, "TemplateElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTemplateElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, TemplateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateElement_Definition(), theTypesPackage.getJvmTypeReference(), null, "definition", null, 0, 1, TemplateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formElementEClass, FormElement.class, "FormElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFormElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormElement_Modal(), ecorePackage.getEString(), "modal", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormElement_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_Text(), this.getTranslationElement(), null, "text", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_Fields(), this.getFormFieldElement(), null, "fields", null, 0, -1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formFieldElementEClass, FormFieldElement.class, "FormFieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFormFieldElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormFieldElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, FormFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formFieldPropertiesEClass, FormFieldProperties.class, "FormFieldProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFormFieldProperties_Text(), this.getTranslationElement(), null, "text", null, 0, 1, FormFieldProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormFieldProperties_Enabled(), ecorePackage.getEString(), "enabled", null, 0, 1, FormFieldProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormFieldProperties_Visible(), ecorePackage.getEString(), "visible", null, 0, 1, FormFieldProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormFieldProperties_Master(), this.getValueFieldElement(), null, "master", null, 0, 1, FormFieldProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositeFieldElementEClass, CompositeFieldElement.class, "CompositeFieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompositeFieldElement_FormFieldProperties(), this.getFormFieldProperties(), null, "formFieldProperties", null, 0, 1, CompositeFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositeFieldElement_Fields(), this.getFormFieldElement(), null, "fields", null, 0, -1, CompositeFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceBoxElementEClass, SequenceBoxElement.class, "SequenceBoxElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(groupBoxElementEClass, GroupBoxElement.class, "GroupBoxElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(valueFieldElementEClass, ValueFieldElement.class, "ValueFieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(valueFieldPropertiesEClass, ValueFieldProperties.class, "ValueFieldProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValueFieldProperties_FormFieldProperties(), this.getFormFieldProperties(), null, "formFieldProperties", null, 0, 1, ValueFieldProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValueFieldProperties_Mandatory(), ecorePackage.getEString(), "mandatory", null, 0, 1, ValueFieldProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringElementEClass, StringElement.class, "StringElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringElement_ValueFieldProperties(), this.getValueFieldProperties(), null, "valueFieldProperties", null, 0, 1, StringElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringElement_Maxlen(), ecorePackage.getEInt(), "maxlen", null, 0, 1, StringElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleElementEClass, DoubleElement.class, "DoubleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDoubleElement_ValueFieldProperties(), this.getValueFieldProperties(), null, "valueFieldProperties", null, 0, 1, DoubleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(longElementEClass, LongElement.class, "LongElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLongElement_ValueFieldProperties(), this.getValueFieldProperties(), null, "valueFieldProperties", null, 0, 1, LongElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateElementEClass, DateElement.class, "DateElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDateElement_ValueFieldProperties(), this.getValueFieldProperties(), null, "valueFieldProperties", null, 0, 1, DateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smartfieldElementEClass, SmartfieldElement.class, "SmartfieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSmartfieldElement_ValueFieldProperties(), this.getValueFieldProperties(), null, "valueFieldProperties", null, 0, 1, SmartfieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSmartfieldElement_Code(), this.getCodeElement(), null, "code", null, 0, 1, SmartfieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSmartfieldElement_ValueType(), theTypesPackage.getJvmTypeReference(), null, "valueType", null, 0, 1, SmartfieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSmartfieldElement_Lookup(), this.getLookupElement(), null, "lookup", null, 0, 1, SmartfieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customFieldElementEClass, CustomFieldElement.class, "CustomFieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCustomFieldElement_Template(), this.getTemplateElement(), null, "template", null, 0, 1, CustomFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomFieldElement_FormFieldProperties(), this.getFormFieldProperties(), null, "formFieldProperties", null, 0, 1, CustomFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCustomFieldElement_Fields(), this.getFormFieldElement(), null, "fields", null, 0, -1, CustomFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xBlockExpressionEClass, XBlockExpression.class, "XBlockExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xVariableDeclarationEClass, XVariableDeclaration.class, "XVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xConstructorCallEClass, XConstructorCall.class, "XConstructorCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXConstructorCall_IsArray(), ecorePackage.getEBoolean(), "isArray", null, 0, 1, XConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SamlPackageImpl
