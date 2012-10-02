/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.scout.saml.saml.BooleanType;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.CompositeElement;
import org.eclipse.scout.saml.saml.CompositeElementRule;
import org.eclipse.scout.saml.saml.ControlElement;
import org.eclipse.scout.saml.saml.ControlElementRule;
import org.eclipse.scout.saml.saml.DoubleElement;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.ImportElement;
import org.eclipse.scout.saml.saml.JavaCodeElement;
import org.eclipse.scout.saml.saml.LanguageAttribute;
import org.eclipse.scout.saml.saml.LeafElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.LogicType;
import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.Model;
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.saml.saml.SamlFactory;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.SequenceBoxElement;
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.saml.saml.XBlockExpression;
import org.eclipse.scout.saml.saml.XTypeLiteral;
import org.eclipse.scout.saml.saml.XVariableDeclaration;

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
  private EClass javaCodeElementEClass = null;

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
  private EClass lookupElementEClass = null;

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
  private EClass controlElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlElementRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositeElementRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leafElementEClass = null;

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
  private EClass sequenceBoxElementEClass = null;

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
  private EClass xTypeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleanTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum logicTypeEEnum = null;

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
  public EReference getModel_Codes()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Translations()
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
  public EReference getModel_Forms()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(5);
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
  public EClass getJavaCodeElement()
  {
    return javaCodeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaCodeElement_Name()
  {
    return (EAttribute)javaCodeElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaCodeElement_Runat()
  {
    return (EAttribute)javaCodeElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJavaCodeElement_Source()
  {
    return (EReference)javaCodeElementEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getLogicElement_Event()
  {
    return (EAttribute)logicElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicElement_Runat()
  {
    return (EAttribute)logicElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicElement_Exec()
  {
    return (EReference)logicElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicElement_Source()
  {
    return (EReference)logicElementEClass.getEStructuralFeatures().get(3);
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
  public EReference getLookupElement_Javacode()
  {
    return (EReference)lookupElementEClass.getEStructuralFeatures().get(2);
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
  public EReference getFormElement_Logic()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormElement_Fields()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getControlElement()
  {
    return controlElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getControlElementRule()
  {
    return controlElementRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getControlElementRule_Text()
  {
    return (EReference)controlElementRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getControlElementRule_Enabled()
  {
    return (EAttribute)controlElementRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getControlElementRule_Visible()
  {
    return (EAttribute)controlElementRuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeElement()
  {
    return compositeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeElementRule()
  {
    return compositeElementRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeElementRule_Rule()
  {
    return (EReference)compositeElementRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeElementRule_Logic()
  {
    return (EReference)compositeElementRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeElementRule_Childre()
  {
    return (EReference)compositeElementRuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeafElement()
  {
    return leafElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLeafElement_Name()
  {
    return (EAttribute)leafElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLeafElement_FieldRule()
  {
    return (EReference)leafElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLeafElement_Mandatory()
  {
    return (EAttribute)leafElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLeafElement_Logic()
  {
    return (EReference)leafElementEClass.getEStructuralFeatures().get(3);
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
  public EReference getStringElement_Master()
  {
    return (EReference)stringElementEClass.getEStructuralFeatures().get(0);
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
  public EClass getLongElement()
  {
    return longElementEClass;
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
  public EAttribute getSequenceBoxElement_Name()
  {
    return (EAttribute)sequenceBoxElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequenceBoxElement_FieldRule()
  {
    return (EReference)sequenceBoxElementEClass.getEStructuralFeatures().get(1);
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
  public EClass getXTypeLiteral()
  {
    return xTypeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBooleanType()
  {
    return booleanTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLogicType()
  {
    return logicTypeEEnum;
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
    createEReference(modelEClass, MODEL__CODES);
    createEReference(modelEClass, MODEL__TRANSLATIONS);
    createEReference(modelEClass, MODEL__LOOKUPS);
    createEReference(modelEClass, MODEL__FORMS);

    moduleElementEClass = createEClass(MODULE_ELEMENT);
    createEAttribute(moduleElementEClass, MODULE_ELEMENT__NAME);

    importElementEClass = createEClass(IMPORT_ELEMENT);
    createEAttribute(importElementEClass, IMPORT_ELEMENT__IMPORTED_NAMESPACE);

    javaCodeElementEClass = createEClass(JAVA_CODE_ELEMENT);
    createEAttribute(javaCodeElementEClass, JAVA_CODE_ELEMENT__NAME);
    createEAttribute(javaCodeElementEClass, JAVA_CODE_ELEMENT__RUNAT);
    createEReference(javaCodeElementEClass, JAVA_CODE_ELEMENT__SOURCE);

    logicElementEClass = createEClass(LOGIC_ELEMENT);
    createEAttribute(logicElementEClass, LOGIC_ELEMENT__EVENT);
    createEAttribute(logicElementEClass, LOGIC_ELEMENT__RUNAT);
    createEReference(logicElementEClass, LOGIC_ELEMENT__EXEC);
    createEReference(logicElementEClass, LOGIC_ELEMENT__SOURCE);

    codeElementEClass = createEClass(CODE_ELEMENT);
    createEAttribute(codeElementEClass, CODE_ELEMENT__NAME);
    createEAttribute(codeElementEClass, CODE_ELEMENT__ID);

    translationElementEClass = createEClass(TRANSLATION_ELEMENT);
    createEAttribute(translationElementEClass, TRANSLATION_ELEMENT__NAME);
    createEReference(translationElementEClass, TRANSLATION_ELEMENT__TRANSLATIONS);

    languageAttributeEClass = createEClass(LANGUAGE_ATTRIBUTE);
    createEAttribute(languageAttributeEClass, LANGUAGE_ATTRIBUTE__LANG);
    createEAttribute(languageAttributeEClass, LANGUAGE_ATTRIBUTE__TEXT);

    lookupElementEClass = createEClass(LOOKUP_ELEMENT);
    createEAttribute(lookupElementEClass, LOOKUP_ELEMENT__NAME);
    createEReference(lookupElementEClass, LOOKUP_ELEMENT__LOGIC);
    createEReference(lookupElementEClass, LOOKUP_ELEMENT__JAVACODE);

    formElementEClass = createEClass(FORM_ELEMENT);
    createEAttribute(formElementEClass, FORM_ELEMENT__NAME);
    createEAttribute(formElementEClass, FORM_ELEMENT__MODAL);
    createEAttribute(formElementEClass, FORM_ELEMENT__COLUMNS);
    createEReference(formElementEClass, FORM_ELEMENT__LOGIC);
    createEReference(formElementEClass, FORM_ELEMENT__FIELDS);

    controlElementEClass = createEClass(CONTROL_ELEMENT);

    controlElementRuleEClass = createEClass(CONTROL_ELEMENT_RULE);
    createEReference(controlElementRuleEClass, CONTROL_ELEMENT_RULE__TEXT);
    createEAttribute(controlElementRuleEClass, CONTROL_ELEMENT_RULE__ENABLED);
    createEAttribute(controlElementRuleEClass, CONTROL_ELEMENT_RULE__VISIBLE);

    compositeElementEClass = createEClass(COMPOSITE_ELEMENT);

    compositeElementRuleEClass = createEClass(COMPOSITE_ELEMENT_RULE);
    createEReference(compositeElementRuleEClass, COMPOSITE_ELEMENT_RULE__RULE);
    createEReference(compositeElementRuleEClass, COMPOSITE_ELEMENT_RULE__LOGIC);
    createEReference(compositeElementRuleEClass, COMPOSITE_ELEMENT_RULE__CHILDRE);

    leafElementEClass = createEClass(LEAF_ELEMENT);
    createEAttribute(leafElementEClass, LEAF_ELEMENT__NAME);
    createEReference(leafElementEClass, LEAF_ELEMENT__FIELD_RULE);
    createEAttribute(leafElementEClass, LEAF_ELEMENT__MANDATORY);
    createEReference(leafElementEClass, LEAF_ELEMENT__LOGIC);

    stringElementEClass = createEClass(STRING_ELEMENT);
    createEReference(stringElementEClass, STRING_ELEMENT__MASTER);

    doubleElementEClass = createEClass(DOUBLE_ELEMENT);

    longElementEClass = createEClass(LONG_ELEMENT);

    sequenceBoxElementEClass = createEClass(SEQUENCE_BOX_ELEMENT);
    createEAttribute(sequenceBoxElementEClass, SEQUENCE_BOX_ELEMENT__NAME);
    createEReference(sequenceBoxElementEClass, SEQUENCE_BOX_ELEMENT__FIELD_RULE);

    xBlockExpressionEClass = createEClass(XBLOCK_EXPRESSION);

    xVariableDeclarationEClass = createEClass(XVARIABLE_DECLARATION);

    xTypeLiteralEClass = createEClass(XTYPE_LITERAL);

    // Create enums
    booleanTypeEEnum = createEEnum(BOOLEAN_TYPE);
    logicTypeEEnum = createEEnum(LOGIC_TYPE);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    compositeElementEClass.getESuperTypes().add(this.getControlElement());
    leafElementEClass.getESuperTypes().add(this.getControlElement());
    stringElementEClass.getESuperTypes().add(this.getLeafElement());
    doubleElementEClass.getESuperTypes().add(this.getLeafElement());
    longElementEClass.getESuperTypes().add(this.getLeafElement());
    sequenceBoxElementEClass.getESuperTypes().add(this.getCompositeElement());
    xBlockExpressionEClass.getESuperTypes().add(theXbasePackage.getXBlockExpression());
    xVariableDeclarationEClass.getESuperTypes().add(theXbasePackage.getXVariableDeclaration());
    xTypeLiteralEClass.getESuperTypes().add(theXbasePackage.getXTypeLiteral());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Module(), this.getModuleElement(), null, "module", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Imports(), this.getImportElement(), null, "imports", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Codes(), ecorePackage.getEObject(), null, "codes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Translations(), this.getTranslationElement(), null, "translations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Lookups(), this.getLookupElement(), null, "lookups", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Forms(), this.getFormElement(), null, "forms", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleElementEClass, ModuleElement.class, "ModuleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModuleElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importElementEClass, ImportElement.class, "ImportElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportElement_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, ImportElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(javaCodeElementEClass, JavaCodeElement.class, "JavaCodeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJavaCodeElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, JavaCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaCodeElement_Runat(), ecorePackage.getEString(), "runat", null, 0, 1, JavaCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJavaCodeElement_Source(), theXbasePackage.getXBlockExpression(), null, "source", null, 0, 1, JavaCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicElementEClass, LogicElement.class, "LogicElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLogicElement_Event(), this.getLogicType(), "event", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogicElement_Runat(), ecorePackage.getEString(), "runat", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicElement_Exec(), this.getJavaCodeElement(), null, "exec", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicElement_Source(), theXbasePackage.getXBlockExpression(), null, "source", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeElementEClass, CodeElement.class, "CodeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCodeElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCodeElement_Id(), ecorePackage.getEInt(), "id", null, 0, 1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(translationElementEClass, TranslationElement.class, "TranslationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTranslationElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, TranslationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTranslationElement_Translations(), this.getLanguageAttribute(), null, "translations", null, 0, -1, TranslationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(languageAttributeEClass, LanguageAttribute.class, "LanguageAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLanguageAttribute_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, LanguageAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguageAttribute_Text(), ecorePackage.getEString(), "text", null, 0, 1, LanguageAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lookupElementEClass, LookupElement.class, "LookupElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLookupElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, LookupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLookupElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, LookupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLookupElement_Javacode(), this.getJavaCodeElement(), null, "javacode", null, 0, -1, LookupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formElementEClass, FormElement.class, "FormElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFormElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormElement_Modal(), this.getBooleanType(), "modal", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormElement_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_Fields(), this.getControlElement(), null, "fields", null, 0, -1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controlElementEClass, ControlElement.class, "ControlElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(controlElementRuleEClass, ControlElementRule.class, "ControlElementRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getControlElementRule_Text(), this.getTranslationElement(), null, "text", null, 0, 1, ControlElementRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getControlElementRule_Enabled(), this.getBooleanType(), "enabled", null, 0, 1, ControlElementRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getControlElementRule_Visible(), this.getBooleanType(), "visible", null, 0, 1, ControlElementRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositeElementEClass, CompositeElement.class, "CompositeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compositeElementRuleEClass, CompositeElementRule.class, "CompositeElementRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompositeElementRule_Rule(), this.getControlElementRule(), null, "rule", null, 0, 1, CompositeElementRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositeElementRule_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, CompositeElementRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositeElementRule_Childre(), this.getControlElement(), null, "childre", null, 0, -1, CompositeElementRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(leafElementEClass, LeafElement.class, "LeafElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLeafElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, LeafElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLeafElement_FieldRule(), this.getControlElementRule(), null, "fieldRule", null, 0, 1, LeafElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLeafElement_Mandatory(), this.getBooleanType(), "mandatory", null, 0, 1, LeafElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLeafElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, LeafElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringElementEClass, StringElement.class, "StringElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringElement_Master(), this.getLeafElement(), null, "master", null, 0, 1, StringElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleElementEClass, DoubleElement.class, "DoubleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(longElementEClass, LongElement.class, "LongElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sequenceBoxElementEClass, SequenceBoxElement.class, "SequenceBoxElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSequenceBoxElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, SequenceBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSequenceBoxElement_FieldRule(), this.getCompositeElementRule(), null, "fieldRule", null, 0, 1, SequenceBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xBlockExpressionEClass, XBlockExpression.class, "XBlockExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xVariableDeclarationEClass, XVariableDeclaration.class, "XVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xTypeLiteralEClass, XTypeLiteral.class, "XTypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(booleanTypeEEnum, BooleanType.class, "BooleanType");
    addEEnumLiteral(booleanTypeEEnum, BooleanType.TRUE);
    addEEnumLiteral(booleanTypeEEnum, BooleanType.FALSE);

    initEEnum(logicTypeEEnum, LogicType.class, "LogicType");
    addEEnumLiteral(logicTypeEEnum, LogicType.GLOBAL);
    addEEnumLiteral(logicTypeEEnum, LogicType.ALL);
    addEEnumLiteral(logicTypeEEnum, LogicType.MODIFY_LOAD);
    addEEnumLiteral(logicTypeEEnum, LogicType.MODIFY_STORE);
    addEEnumLiteral(logicTypeEEnum, LogicType.NEW_LOAD);
    addEEnumLiteral(logicTypeEEnum, LogicType.NEW_STORE);
    addEEnumLiteral(logicTypeEEnum, LogicType.CHANGED);
    addEEnumLiteral(logicTypeEEnum, LogicType.CLICK);
    addEEnumLiteral(logicTypeEEnum, LogicType.MASTER_CHANGED);
    addEEnumLiteral(logicTypeEEnum, LogicType.INIT);

    // Create resource
    createResource(eNS_URI);
  }

} //SamlPackageImpl
