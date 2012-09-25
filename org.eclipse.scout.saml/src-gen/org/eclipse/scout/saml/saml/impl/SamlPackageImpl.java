/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.scout.saml.saml.AbstractContainerFieldElement;
import org.eclipse.scout.saml.saml.AbstractFieldElement;
import org.eclipse.scout.saml.saml.AbstractFieldProperties;
import org.eclipse.scout.saml.saml.AbstractScoutType;
import org.eclipse.scout.saml.saml.AbstractValueFieldElement;
import org.eclipse.scout.saml.saml.AbstractValueFieldProperties;
import org.eclipse.scout.saml.saml.BooleanType;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.CodeIdAttribute;
import org.eclipse.scout.saml.saml.DateElement;
import org.eclipse.scout.saml.saml.DoubleElement;
import org.eclipse.scout.saml.saml.EnabledAttribue;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.FormElementColumnsAttribute;
import org.eclipse.scout.saml.saml.FormElementModalAttribute;
import org.eclipse.scout.saml.saml.JavaElement;
import org.eclipse.scout.saml.saml.JavaRunAtAttributeList;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.LogicExecAttribute;
import org.eclipse.scout.saml.saml.LogicOptionalProperties;
import org.eclipse.scout.saml.saml.LogicTypeAttribute;
import org.eclipse.scout.saml.saml.LogicTypeAttributeList;
import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.MandatoryAttribue;
import org.eclipse.scout.saml.saml.MasterAttribute;
import org.eclipse.scout.saml.saml.Model;
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.saml.saml.RootElement;
import org.eclipse.scout.saml.saml.RunAtAttribute;
import org.eclipse.scout.saml.saml.SamlFactory;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.SequenceBoxElement;
import org.eclipse.scout.saml.saml.SmartFieldElementProperties;
import org.eclipse.scout.saml.saml.SmartfieldElement;
import org.eclipse.scout.saml.saml.SmartfieldElementCodeAttribute;
import org.eclipse.scout.saml.saml.SmartfieldElementLookupAttribute;
import org.eclipse.scout.saml.saml.SmartfieldElementValueTypeAttribute;
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.saml.StringElementMaxlenAttribute;
import org.eclipse.scout.saml.saml.StringElementProperties;
import org.eclipse.scout.saml.saml.TemplateElement;
import org.eclipse.scout.saml.saml.TemplateElementClassAttribute;
import org.eclipse.scout.saml.saml.TemplateElementReplacesAttribute;
import org.eclipse.scout.saml.saml.TextAttribute;
import org.eclipse.scout.saml.saml.TranslationAttribute;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.saml.saml.VisibleAttribue;
import org.eclipse.scout.saml.saml.ZregBoxElement;

import org.eclipse.xtext.common.types.TypesPackage;

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
  private EClass rootElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractScoutTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractFieldElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractFieldPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enabledAttribueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass visibleAttribueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass masterAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractValueFieldElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractValueFieldPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mandatoryAttribueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractContainerFieldElementEClass = null;

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
  private EClass translationElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass translationAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass javaElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass runAtAttributeEClass = null;

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
  private EClass codeIdAttributeEClass = null;

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
  private EClass logicOptionalPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicTypeAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicExecAttributeEClass = null;

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
  private EClass templateElementClassAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateElementReplacesAttributeEClass = null;

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
  private EClass formElementModalAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formElementColumnsAttributeEClass = null;

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
  private EClass stringElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringElementPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringElementMaxlenAttributeEClass = null;

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
  private EClass smartFieldElementPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smartfieldElementCodeAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smartfieldElementValueTypeAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smartfieldElementLookupAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass zregBoxElementEClass = null;

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
  private EEnum javaRunAtAttributeListEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum logicTypeAttributeListEEnum = null;

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
    TypesPackage.eINSTANCE.eClass();

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
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRootElement()
  {
    return rootElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRootElement_Name()
  {
    return (EAttribute)rootElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractScoutType()
  {
    return abstractScoutTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractFieldElement()
  {
    return abstractFieldElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractFieldProperties()
  {
    return abstractFieldPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractFieldProperties_Text()
  {
    return (EReference)abstractFieldPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractFieldProperties_Visible()
  {
    return (EReference)abstractFieldPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractFieldProperties_Master()
  {
    return (EReference)abstractFieldPropertiesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractFieldProperties_Enabled()
  {
    return (EReference)abstractFieldPropertiesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextAttribute()
  {
    return textAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextAttribute_Value()
  {
    return (EReference)textAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnabledAttribue()
  {
    return enabledAttribueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnabledAttribue_Value()
  {
    return (EAttribute)enabledAttribueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVisibleAttribue()
  {
    return visibleAttribueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVisibleAttribue_Value()
  {
    return (EAttribute)visibleAttribueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMasterAttribute()
  {
    return masterAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMasterAttribute_Value()
  {
    return (EReference)masterAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractValueFieldElement()
  {
    return abstractValueFieldElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractValueFieldElement_Name()
  {
    return (EAttribute)abstractValueFieldElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractValueFieldProperties()
  {
    return abstractValueFieldPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractValueFieldProperties_Mandatory()
  {
    return (EReference)abstractValueFieldPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMandatoryAttribue()
  {
    return mandatoryAttribueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMandatoryAttribue_Value()
  {
    return (EAttribute)mandatoryAttribueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractContainerFieldElement()
  {
    return abstractContainerFieldElementEClass;
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
  public EClass getTranslationElement()
  {
    return translationElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTranslationElement_Translations()
  {
    return (EReference)translationElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTranslationAttribute()
  {
    return translationAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTranslationAttribute_Lang()
  {
    return (EAttribute)translationAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTranslationAttribute_Text()
  {
    return (EAttribute)translationAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJavaElement()
  {
    return javaElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaElement_Name()
  {
    return (EAttribute)javaElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJavaElement_Runat()
  {
    return (EReference)javaElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJavaElement_Source()
  {
    return (EAttribute)javaElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRunAtAttribute()
  {
    return runAtAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRunAtAttribute_Value()
  {
    return (EAttribute)runAtAttributeEClass.getEStructuralFeatures().get(0);
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
  public EReference getCodeElement_Id()
  {
    return (EReference)codeElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCodeIdAttribute()
  {
    return codeIdAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCodeIdAttribute_Value()
  {
    return (EAttribute)codeIdAttributeEClass.getEStructuralFeatures().get(0);
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
  public EReference getLogicElement_Type()
  {
    return (EReference)logicElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicElement_Properties()
  {
    return (EReference)logicElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicElement_Source()
  {
    return (EAttribute)logicElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicOptionalProperties()
  {
    return logicOptionalPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicOptionalProperties_Runat()
  {
    return (EReference)logicOptionalPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicOptionalProperties_Exec()
  {
    return (EReference)logicOptionalPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicTypeAttribute()
  {
    return logicTypeAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicTypeAttribute_Value()
  {
    return (EAttribute)logicTypeAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicExecAttribute()
  {
    return logicExecAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicExecAttribute_Value()
  {
    return (EReference)logicExecAttributeEClass.getEStructuralFeatures().get(0);
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
  public EReference getLookupElement_Servicelogic()
  {
    return (EReference)lookupElementEClass.getEStructuralFeatures().get(0);
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
  public EReference getTemplateElement_Class()
  {
    return (EReference)templateElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateElement_Replaces()
  {
    return (EReference)templateElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateElementClassAttribute()
  {
    return templateElementClassAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTemplateElementClassAttribute_Value()
  {
    return (EAttribute)templateElementClassAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateElementReplacesAttribute()
  {
    return templateElementReplacesAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateElementReplacesAttribute_Value()
  {
    return (EReference)templateElementReplacesAttributeEClass.getEStructuralFeatures().get(0);
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
  public EReference getFormElement_Modal()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormElement_Text()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormElement_Columns()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormElement_Elements()
  {
    return (EReference)formElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormElementModalAttribute()
  {
    return formElementModalAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormElementModalAttribute_Value()
  {
    return (EAttribute)formElementModalAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormElementColumnsAttribute()
  {
    return formElementColumnsAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormElementColumnsAttribute_Value()
  {
    return (EAttribute)formElementColumnsAttributeEClass.getEStructuralFeatures().get(0);
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
  public EReference getSequenceBoxElement_Properties()
  {
    return (EReference)sequenceBoxElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequenceBoxElement_Children()
  {
    return (EReference)sequenceBoxElementEClass.getEStructuralFeatures().get(2);
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
  public EReference getStringElement_Properties()
  {
    return (EReference)stringElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringElement_Logic()
  {
    return (EReference)stringElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringElementProperties()
  {
    return stringElementPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringElementProperties_Maxlen()
  {
    return (EReference)stringElementPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringElementMaxlenAttribute()
  {
    return stringElementMaxlenAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringElementMaxlenAttribute_Value()
  {
    return (EAttribute)stringElementMaxlenAttributeEClass.getEStructuralFeatures().get(0);
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
  public EReference getDoubleElement_Properties()
  {
    return (EReference)doubleElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoubleElement_Children()
  {
    return (EReference)doubleElementEClass.getEStructuralFeatures().get(1);
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
  public EReference getLongElement_Properties()
  {
    return (EReference)longElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLongElement_Children()
  {
    return (EReference)longElementEClass.getEStructuralFeatures().get(1);
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
  public EReference getDateElement_Properties()
  {
    return (EReference)dateElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDateElement_Children()
  {
    return (EReference)dateElementEClass.getEStructuralFeatures().get(1);
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
  public EReference getSmartfieldElement_Properties()
  {
    return (EReference)smartfieldElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartfieldElement_Logic()
  {
    return (EReference)smartfieldElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmartFieldElementProperties()
  {
    return smartFieldElementPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartFieldElementProperties_Code()
  {
    return (EReference)smartFieldElementPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartFieldElementProperties_Value_type()
  {
    return (EReference)smartFieldElementPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartFieldElementProperties_Lookup()
  {
    return (EReference)smartFieldElementPropertiesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmartfieldElementCodeAttribute()
  {
    return smartfieldElementCodeAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartfieldElementCodeAttribute_Value()
  {
    return (EReference)smartfieldElementCodeAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmartfieldElementValueTypeAttribute()
  {
    return smartfieldElementValueTypeAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartfieldElementValueTypeAttribute_Value()
  {
    return (EReference)smartfieldElementValueTypeAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSmartfieldElementLookupAttribute()
  {
    return smartfieldElementLookupAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSmartfieldElementLookupAttribute_Value()
  {
    return (EReference)smartfieldElementLookupAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getZregBoxElement()
  {
    return zregBoxElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getZregBoxElement_Properties()
  {
    return (EReference)zregBoxElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getZregBoxElement_Children()
  {
    return (EReference)zregBoxElementEClass.getEStructuralFeatures().get(1);
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
  public EEnum getJavaRunAtAttributeList()
  {
    return javaRunAtAttributeListEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLogicTypeAttributeList()
  {
    return logicTypeAttributeListEEnum;
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
    createEReference(modelEClass, MODEL__ELEMENTS);

    rootElementEClass = createEClass(ROOT_ELEMENT);
    createEAttribute(rootElementEClass, ROOT_ELEMENT__NAME);

    abstractScoutTypeEClass = createEClass(ABSTRACT_SCOUT_TYPE);

    abstractFieldElementEClass = createEClass(ABSTRACT_FIELD_ELEMENT);

    abstractFieldPropertiesEClass = createEClass(ABSTRACT_FIELD_PROPERTIES);
    createEReference(abstractFieldPropertiesEClass, ABSTRACT_FIELD_PROPERTIES__TEXT);
    createEReference(abstractFieldPropertiesEClass, ABSTRACT_FIELD_PROPERTIES__VISIBLE);
    createEReference(abstractFieldPropertiesEClass, ABSTRACT_FIELD_PROPERTIES__MASTER);
    createEReference(abstractFieldPropertiesEClass, ABSTRACT_FIELD_PROPERTIES__ENABLED);

    textAttributeEClass = createEClass(TEXT_ATTRIBUTE);
    createEReference(textAttributeEClass, TEXT_ATTRIBUTE__VALUE);

    enabledAttribueEClass = createEClass(ENABLED_ATTRIBUE);
    createEAttribute(enabledAttribueEClass, ENABLED_ATTRIBUE__VALUE);

    visibleAttribueEClass = createEClass(VISIBLE_ATTRIBUE);
    createEAttribute(visibleAttribueEClass, VISIBLE_ATTRIBUE__VALUE);

    masterAttributeEClass = createEClass(MASTER_ATTRIBUTE);
    createEReference(masterAttributeEClass, MASTER_ATTRIBUTE__VALUE);

    abstractValueFieldElementEClass = createEClass(ABSTRACT_VALUE_FIELD_ELEMENT);
    createEAttribute(abstractValueFieldElementEClass, ABSTRACT_VALUE_FIELD_ELEMENT__NAME);

    abstractValueFieldPropertiesEClass = createEClass(ABSTRACT_VALUE_FIELD_PROPERTIES);
    createEReference(abstractValueFieldPropertiesEClass, ABSTRACT_VALUE_FIELD_PROPERTIES__MANDATORY);

    mandatoryAttribueEClass = createEClass(MANDATORY_ATTRIBUE);
    createEAttribute(mandatoryAttribueEClass, MANDATORY_ATTRIBUE__VALUE);

    abstractContainerFieldElementEClass = createEClass(ABSTRACT_CONTAINER_FIELD_ELEMENT);

    moduleElementEClass = createEClass(MODULE_ELEMENT);

    translationElementEClass = createEClass(TRANSLATION_ELEMENT);
    createEReference(translationElementEClass, TRANSLATION_ELEMENT__TRANSLATIONS);

    translationAttributeEClass = createEClass(TRANSLATION_ATTRIBUTE);
    createEAttribute(translationAttributeEClass, TRANSLATION_ATTRIBUTE__LANG);
    createEAttribute(translationAttributeEClass, TRANSLATION_ATTRIBUTE__TEXT);

    javaElementEClass = createEClass(JAVA_ELEMENT);
    createEAttribute(javaElementEClass, JAVA_ELEMENT__NAME);
    createEReference(javaElementEClass, JAVA_ELEMENT__RUNAT);
    createEAttribute(javaElementEClass, JAVA_ELEMENT__SOURCE);

    runAtAttributeEClass = createEClass(RUN_AT_ATTRIBUTE);
    createEAttribute(runAtAttributeEClass, RUN_AT_ATTRIBUTE__VALUE);

    codeElementEClass = createEClass(CODE_ELEMENT);
    createEReference(codeElementEClass, CODE_ELEMENT__ID);

    codeIdAttributeEClass = createEClass(CODE_ID_ATTRIBUTE);
    createEAttribute(codeIdAttributeEClass, CODE_ID_ATTRIBUTE__VALUE);

    logicElementEClass = createEClass(LOGIC_ELEMENT);
    createEReference(logicElementEClass, LOGIC_ELEMENT__TYPE);
    createEReference(logicElementEClass, LOGIC_ELEMENT__PROPERTIES);
    createEAttribute(logicElementEClass, LOGIC_ELEMENT__SOURCE);

    logicOptionalPropertiesEClass = createEClass(LOGIC_OPTIONAL_PROPERTIES);
    createEReference(logicOptionalPropertiesEClass, LOGIC_OPTIONAL_PROPERTIES__RUNAT);
    createEReference(logicOptionalPropertiesEClass, LOGIC_OPTIONAL_PROPERTIES__EXEC);

    logicTypeAttributeEClass = createEClass(LOGIC_TYPE_ATTRIBUTE);
    createEAttribute(logicTypeAttributeEClass, LOGIC_TYPE_ATTRIBUTE__VALUE);

    logicExecAttributeEClass = createEClass(LOGIC_EXEC_ATTRIBUTE);
    createEReference(logicExecAttributeEClass, LOGIC_EXEC_ATTRIBUTE__VALUE);

    lookupElementEClass = createEClass(LOOKUP_ELEMENT);
    createEReference(lookupElementEClass, LOOKUP_ELEMENT__SERVICELOGIC);

    templateElementEClass = createEClass(TEMPLATE_ELEMENT);
    createEReference(templateElementEClass, TEMPLATE_ELEMENT__CLASS);
    createEReference(templateElementEClass, TEMPLATE_ELEMENT__REPLACES);

    templateElementClassAttributeEClass = createEClass(TEMPLATE_ELEMENT_CLASS_ATTRIBUTE);
    createEAttribute(templateElementClassAttributeEClass, TEMPLATE_ELEMENT_CLASS_ATTRIBUTE__VALUE);

    templateElementReplacesAttributeEClass = createEClass(TEMPLATE_ELEMENT_REPLACES_ATTRIBUTE);
    createEReference(templateElementReplacesAttributeEClass, TEMPLATE_ELEMENT_REPLACES_ATTRIBUTE__VALUE);

    formElementEClass = createEClass(FORM_ELEMENT);
    createEReference(formElementEClass, FORM_ELEMENT__MODAL);
    createEReference(formElementEClass, FORM_ELEMENT__TEXT);
    createEReference(formElementEClass, FORM_ELEMENT__COLUMNS);
    createEReference(formElementEClass, FORM_ELEMENT__ELEMENTS);

    formElementModalAttributeEClass = createEClass(FORM_ELEMENT_MODAL_ATTRIBUTE);
    createEAttribute(formElementModalAttributeEClass, FORM_ELEMENT_MODAL_ATTRIBUTE__VALUE);

    formElementColumnsAttributeEClass = createEClass(FORM_ELEMENT_COLUMNS_ATTRIBUTE);
    createEAttribute(formElementColumnsAttributeEClass, FORM_ELEMENT_COLUMNS_ATTRIBUTE__VALUE);

    sequenceBoxElementEClass = createEClass(SEQUENCE_BOX_ELEMENT);
    createEAttribute(sequenceBoxElementEClass, SEQUENCE_BOX_ELEMENT__NAME);
    createEReference(sequenceBoxElementEClass, SEQUENCE_BOX_ELEMENT__PROPERTIES);
    createEReference(sequenceBoxElementEClass, SEQUENCE_BOX_ELEMENT__CHILDREN);

    stringElementEClass = createEClass(STRING_ELEMENT);
    createEReference(stringElementEClass, STRING_ELEMENT__PROPERTIES);
    createEReference(stringElementEClass, STRING_ELEMENT__LOGIC);

    stringElementPropertiesEClass = createEClass(STRING_ELEMENT_PROPERTIES);
    createEReference(stringElementPropertiesEClass, STRING_ELEMENT_PROPERTIES__MAXLEN);

    stringElementMaxlenAttributeEClass = createEClass(STRING_ELEMENT_MAXLEN_ATTRIBUTE);
    createEAttribute(stringElementMaxlenAttributeEClass, STRING_ELEMENT_MAXLEN_ATTRIBUTE__VALUE);

    doubleElementEClass = createEClass(DOUBLE_ELEMENT);
    createEReference(doubleElementEClass, DOUBLE_ELEMENT__PROPERTIES);
    createEReference(doubleElementEClass, DOUBLE_ELEMENT__CHILDREN);

    longElementEClass = createEClass(LONG_ELEMENT);
    createEReference(longElementEClass, LONG_ELEMENT__PROPERTIES);
    createEReference(longElementEClass, LONG_ELEMENT__CHILDREN);

    dateElementEClass = createEClass(DATE_ELEMENT);
    createEReference(dateElementEClass, DATE_ELEMENT__PROPERTIES);
    createEReference(dateElementEClass, DATE_ELEMENT__CHILDREN);

    smartfieldElementEClass = createEClass(SMARTFIELD_ELEMENT);
    createEReference(smartfieldElementEClass, SMARTFIELD_ELEMENT__PROPERTIES);
    createEReference(smartfieldElementEClass, SMARTFIELD_ELEMENT__LOGIC);

    smartFieldElementPropertiesEClass = createEClass(SMART_FIELD_ELEMENT_PROPERTIES);
    createEReference(smartFieldElementPropertiesEClass, SMART_FIELD_ELEMENT_PROPERTIES__CODE);
    createEReference(smartFieldElementPropertiesEClass, SMART_FIELD_ELEMENT_PROPERTIES__VALUE_TYPE);
    createEReference(smartFieldElementPropertiesEClass, SMART_FIELD_ELEMENT_PROPERTIES__LOOKUP);

    smartfieldElementCodeAttributeEClass = createEClass(SMARTFIELD_ELEMENT_CODE_ATTRIBUTE);
    createEReference(smartfieldElementCodeAttributeEClass, SMARTFIELD_ELEMENT_CODE_ATTRIBUTE__VALUE);

    smartfieldElementValueTypeAttributeEClass = createEClass(SMARTFIELD_ELEMENT_VALUE_TYPE_ATTRIBUTE);
    createEReference(smartfieldElementValueTypeAttributeEClass, SMARTFIELD_ELEMENT_VALUE_TYPE_ATTRIBUTE__VALUE);

    smartfieldElementLookupAttributeEClass = createEClass(SMARTFIELD_ELEMENT_LOOKUP_ATTRIBUTE);
    createEReference(smartfieldElementLookupAttributeEClass, SMARTFIELD_ELEMENT_LOOKUP_ATTRIBUTE__VALUE);

    zregBoxElementEClass = createEClass(ZREG_BOX_ELEMENT);
    createEReference(zregBoxElementEClass, ZREG_BOX_ELEMENT__PROPERTIES);
    createEReference(zregBoxElementEClass, ZREG_BOX_ELEMENT__CHILDREN);

    // Create enums
    booleanTypeEEnum = createEEnum(BOOLEAN_TYPE);
    javaRunAtAttributeListEEnum = createEEnum(JAVA_RUN_AT_ATTRIBUTE_LIST);
    logicTypeAttributeListEEnum = createEEnum(LOGIC_TYPE_ATTRIBUTE_LIST);
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
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    abstractFieldElementEClass.getESuperTypes().add(this.getAbstractScoutType());
    abstractFieldPropertiesEClass.getESuperTypes().add(this.getAbstractValueFieldProperties());
    abstractValueFieldElementEClass.getESuperTypes().add(this.getAbstractFieldElement());
    abstractValueFieldPropertiesEClass.getESuperTypes().add(this.getStringElementProperties());
    abstractValueFieldPropertiesEClass.getESuperTypes().add(this.getSmartFieldElementProperties());
    abstractContainerFieldElementEClass.getESuperTypes().add(this.getAbstractFieldElement());
    moduleElementEClass.getESuperTypes().add(this.getRootElement());
    translationElementEClass.getESuperTypes().add(this.getRootElement());
    codeElementEClass.getESuperTypes().add(this.getRootElement());
    codeElementEClass.getESuperTypes().add(this.getAbstractScoutType());
    lookupElementEClass.getESuperTypes().add(this.getRootElement());
    lookupElementEClass.getESuperTypes().add(this.getAbstractScoutType());
    templateElementEClass.getESuperTypes().add(this.getRootElement());
    formElementEClass.getESuperTypes().add(this.getRootElement());
    formElementEClass.getESuperTypes().add(this.getAbstractScoutType());
    sequenceBoxElementEClass.getESuperTypes().add(this.getAbstractContainerFieldElement());
    stringElementEClass.getESuperTypes().add(this.getAbstractValueFieldElement());
    doubleElementEClass.getESuperTypes().add(this.getAbstractValueFieldElement());
    longElementEClass.getESuperTypes().add(this.getAbstractValueFieldElement());
    dateElementEClass.getESuperTypes().add(this.getAbstractValueFieldElement());
    smartfieldElementEClass.getESuperTypes().add(this.getAbstractValueFieldElement());
    zregBoxElementEClass.getESuperTypes().add(this.getAbstractValueFieldElement());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getRootElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rootElementEClass, RootElement.class, "RootElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRootElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, RootElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractScoutTypeEClass, AbstractScoutType.class, "AbstractScoutType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractFieldElementEClass, AbstractFieldElement.class, "AbstractFieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractFieldPropertiesEClass, AbstractFieldProperties.class, "AbstractFieldProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractFieldProperties_Text(), this.getTextAttribute(), null, "text", null, 0, 1, AbstractFieldProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractFieldProperties_Visible(), this.getVisibleAttribue(), null, "visible", null, 0, 1, AbstractFieldProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractFieldProperties_Master(), this.getMasterAttribute(), null, "master", null, 0, 1, AbstractFieldProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractFieldProperties_Enabled(), this.getEnabledAttribue(), null, "enabled", null, 0, 1, AbstractFieldProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textAttributeEClass, TextAttribute.class, "TextAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTextAttribute_Value(), this.getTranslationElement(), null, "value", null, 0, 1, TextAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enabledAttribueEClass, EnabledAttribue.class, "EnabledAttribue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnabledAttribue_Value(), this.getBooleanType(), "value", null, 0, 1, EnabledAttribue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(visibleAttribueEClass, VisibleAttribue.class, "VisibleAttribue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVisibleAttribue_Value(), this.getBooleanType(), "value", null, 0, 1, VisibleAttribue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(masterAttributeEClass, MasterAttribute.class, "MasterAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMasterAttribute_Value(), this.getAbstractFieldElement(), null, "value", null, 0, 1, MasterAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractValueFieldElementEClass, AbstractValueFieldElement.class, "AbstractValueFieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractValueFieldElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractValueFieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractValueFieldPropertiesEClass, AbstractValueFieldProperties.class, "AbstractValueFieldProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractValueFieldProperties_Mandatory(), this.getMandatoryAttribue(), null, "mandatory", null, 0, 1, AbstractValueFieldProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mandatoryAttribueEClass, MandatoryAttribue.class, "MandatoryAttribue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMandatoryAttribue_Value(), this.getBooleanType(), "value", null, 0, 1, MandatoryAttribue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractContainerFieldElementEClass, AbstractContainerFieldElement.class, "AbstractContainerFieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(moduleElementEClass, ModuleElement.class, "ModuleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(translationElementEClass, TranslationElement.class, "TranslationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTranslationElement_Translations(), this.getTranslationAttribute(), null, "translations", null, 0, -1, TranslationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(translationAttributeEClass, TranslationAttribute.class, "TranslationAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTranslationAttribute_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, TranslationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTranslationAttribute_Text(), ecorePackage.getEString(), "text", null, 0, 1, TranslationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(javaElementEClass, JavaElement.class, "JavaElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJavaElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, JavaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJavaElement_Runat(), this.getRunAtAttribute(), null, "runat", null, 0, 1, JavaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJavaElement_Source(), ecorePackage.getEString(), "source", null, 0, 1, JavaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(runAtAttributeEClass, RunAtAttribute.class, "RunAtAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRunAtAttribute_Value(), this.getJavaRunAtAttributeList(), "value", null, 0, 1, RunAtAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeElementEClass, CodeElement.class, "CodeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCodeElement_Id(), this.getCodeIdAttribute(), null, "id", null, 0, 1, CodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(codeIdAttributeEClass, CodeIdAttribute.class, "CodeIdAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCodeIdAttribute_Value(), ecorePackage.getEInt(), "value", null, 0, 1, CodeIdAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicElementEClass, LogicElement.class, "LogicElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicElement_Type(), this.getLogicTypeAttribute(), null, "type", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicElement_Properties(), this.getLogicOptionalProperties(), null, "properties", null, 0, -1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogicElement_Source(), ecorePackage.getEString(), "source", null, 0, 1, LogicElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicOptionalPropertiesEClass, LogicOptionalProperties.class, "LogicOptionalProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicOptionalProperties_Runat(), this.getRunAtAttribute(), null, "runat", null, 0, 1, LogicOptionalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicOptionalProperties_Exec(), this.getLogicExecAttribute(), null, "exec", null, 0, 1, LogicOptionalProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicTypeAttributeEClass, LogicTypeAttribute.class, "LogicTypeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLogicTypeAttribute_Value(), this.getLogicTypeAttributeList(), "value", null, 0, 1, LogicTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicExecAttributeEClass, LogicExecAttribute.class, "LogicExecAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicExecAttribute_Value(), this.getJavaElement(), null, "value", null, 0, 1, LogicExecAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lookupElementEClass, LookupElement.class, "LookupElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLookupElement_Servicelogic(), ecorePackage.getEObject(), null, "servicelogic", null, 0, -1, LookupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateElementEClass, TemplateElement.class, "TemplateElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateElement_Class(), this.getTemplateElementClassAttribute(), null, "class", null, 0, 1, TemplateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateElement_Replaces(), this.getTemplateElementReplacesAttribute(), null, "replaces", null, 0, 1, TemplateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateElementClassAttributeEClass, TemplateElementClassAttribute.class, "TemplateElementClassAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTemplateElementClassAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, TemplateElementClassAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateElementReplacesAttributeEClass, TemplateElementReplacesAttribute.class, "TemplateElementReplacesAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateElementReplacesAttribute_Value(), this.getAbstractScoutType(), null, "value", null, 0, 1, TemplateElementReplacesAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formElementEClass, FormElement.class, "FormElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFormElement_Modal(), this.getFormElementModalAttribute(), null, "modal", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_Text(), this.getTextAttribute(), null, "text", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_Columns(), this.getFormElementColumnsAttribute(), null, "columns", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormElement_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formElementModalAttributeEClass, FormElementModalAttribute.class, "FormElementModalAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFormElementModalAttribute_Value(), this.getBooleanType(), "value", null, 0, 1, FormElementModalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formElementColumnsAttributeEClass, FormElementColumnsAttribute.class, "FormElementColumnsAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFormElementColumnsAttribute_Value(), ecorePackage.getEInt(), "value", null, 0, 1, FormElementColumnsAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceBoxElementEClass, SequenceBoxElement.class, "SequenceBoxElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSequenceBoxElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, SequenceBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSequenceBoxElement_Properties(), this.getAbstractFieldProperties(), null, "properties", null, 0, -1, SequenceBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSequenceBoxElement_Children(), ecorePackage.getEObject(), null, "children", null, 0, -1, SequenceBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringElementEClass, StringElement.class, "StringElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringElement_Properties(), this.getStringElementProperties(), null, "properties", null, 0, -1, StringElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStringElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, StringElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringElementPropertiesEClass, StringElementProperties.class, "StringElementProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringElementProperties_Maxlen(), this.getStringElementMaxlenAttribute(), null, "maxlen", null, 0, 1, StringElementProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringElementMaxlenAttributeEClass, StringElementMaxlenAttribute.class, "StringElementMaxlenAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringElementMaxlenAttribute_Value(), ecorePackage.getEInt(), "value", null, 0, 1, StringElementMaxlenAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleElementEClass, DoubleElement.class, "DoubleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDoubleElement_Properties(), this.getAbstractValueFieldProperties(), null, "properties", null, 0, -1, DoubleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDoubleElement_Children(), this.getLogicElement(), null, "children", null, 0, -1, DoubleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(longElementEClass, LongElement.class, "LongElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLongElement_Properties(), this.getAbstractValueFieldProperties(), null, "properties", null, 0, -1, LongElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLongElement_Children(), this.getLogicElement(), null, "children", null, 0, -1, LongElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateElementEClass, DateElement.class, "DateElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDateElement_Properties(), this.getAbstractValueFieldProperties(), null, "properties", null, 0, -1, DateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDateElement_Children(), this.getLogicElement(), null, "children", null, 0, -1, DateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smartfieldElementEClass, SmartfieldElement.class, "SmartfieldElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSmartfieldElement_Properties(), this.getSmartFieldElementProperties(), null, "properties", null, 0, -1, SmartfieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSmartfieldElement_Logic(), this.getLogicElement(), null, "logic", null, 0, -1, SmartfieldElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smartFieldElementPropertiesEClass, SmartFieldElementProperties.class, "SmartFieldElementProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSmartFieldElementProperties_Code(), this.getSmartfieldElementCodeAttribute(), null, "code", null, 0, 1, SmartFieldElementProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSmartFieldElementProperties_Value_type(), this.getSmartfieldElementValueTypeAttribute(), null, "value_type", null, 0, 1, SmartFieldElementProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSmartFieldElementProperties_Lookup(), this.getSmartfieldElementLookupAttribute(), null, "lookup", null, 0, 1, SmartFieldElementProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smartfieldElementCodeAttributeEClass, SmartfieldElementCodeAttribute.class, "SmartfieldElementCodeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSmartfieldElementCodeAttribute_Value(), this.getCodeElement(), null, "value", null, 0, 1, SmartfieldElementCodeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smartfieldElementValueTypeAttributeEClass, SmartfieldElementValueTypeAttribute.class, "SmartfieldElementValueTypeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSmartfieldElementValueTypeAttribute_Value(), theTypesPackage.getJvmType(), null, "value", null, 0, 1, SmartfieldElementValueTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smartfieldElementLookupAttributeEClass, SmartfieldElementLookupAttribute.class, "SmartfieldElementLookupAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSmartfieldElementLookupAttribute_Value(), this.getLookupElement(), null, "value", null, 0, 1, SmartfieldElementLookupAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(zregBoxElementEClass, ZregBoxElement.class, "ZregBoxElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getZregBoxElement_Properties(), this.getAbstractFieldProperties(), null, "properties", null, 0, -1, ZregBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getZregBoxElement_Children(), this.getLogicElement(), null, "children", null, 0, -1, ZregBoxElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(booleanTypeEEnum, BooleanType.class, "BooleanType");
    addEEnumLiteral(booleanTypeEEnum, BooleanType.TRUE);
    addEEnumLiteral(booleanTypeEEnum, BooleanType.FALSE);

    initEEnum(javaRunAtAttributeListEEnum, JavaRunAtAttributeList.class, "JavaRunAtAttributeList");
    addEEnumLiteral(javaRunAtAttributeListEEnum, JavaRunAtAttributeList.CLIENT);
    addEEnumLiteral(javaRunAtAttributeListEEnum, JavaRunAtAttributeList.SERVER);

    initEEnum(logicTypeAttributeListEEnum, LogicTypeAttributeList.class, "LogicTypeAttributeList");
    addEEnumLiteral(logicTypeAttributeListEEnum, LogicTypeAttributeList.GLOBAL);
    addEEnumLiteral(logicTypeAttributeListEEnum, LogicTypeAttributeList.ALL);
    addEEnumLiteral(logicTypeAttributeListEEnum, LogicTypeAttributeList.MODIFY_LOAD);
    addEEnumLiteral(logicTypeAttributeListEEnum, LogicTypeAttributeList.MODIFY_STORE);
    addEEnumLiteral(logicTypeAttributeListEEnum, LogicTypeAttributeList.NEW_LOAD);
    addEEnumLiteral(logicTypeAttributeListEEnum, LogicTypeAttributeList.NEW_STORE);
    addEEnumLiteral(logicTypeAttributeListEEnum, LogicTypeAttributeList.CHANGED);
    addEEnumLiteral(logicTypeAttributeListEEnum, LogicTypeAttributeList.CLICK);
    addEEnumLiteral(logicTypeAttributeListEEnum, LogicTypeAttributeList.MASTER_CHANGED);
    addEEnumLiteral(logicTypeAttributeListEEnum, LogicTypeAttributeList.INIT);

    // Create resource
    createResource(eNS_URI);
  }

} //SamlPackageImpl
