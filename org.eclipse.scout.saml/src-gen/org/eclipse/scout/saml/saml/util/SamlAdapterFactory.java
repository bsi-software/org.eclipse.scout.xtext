/**
 */
package org.eclipse.scout.saml.saml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.scout.saml.saml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.scout.saml.saml.SamlPackage
 * @generated
 */
public class SamlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SamlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SamlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SamlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SamlSwitch<Adapter> modelSwitch =
    new SamlSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseRootElement(RootElement object)
      {
        return createRootElementAdapter();
      }
      @Override
      public Adapter caseAbstractScoutType(AbstractScoutType object)
      {
        return createAbstractScoutTypeAdapter();
      }
      @Override
      public Adapter caseAbstractFieldElement(AbstractFieldElement object)
      {
        return createAbstractFieldElementAdapter();
      }
      @Override
      public Adapter caseAbstractFieldProperties(AbstractFieldProperties object)
      {
        return createAbstractFieldPropertiesAdapter();
      }
      @Override
      public Adapter caseTextAttribute(TextAttribute object)
      {
        return createTextAttributeAdapter();
      }
      @Override
      public Adapter caseEnabledAttribue(EnabledAttribue object)
      {
        return createEnabledAttribueAdapter();
      }
      @Override
      public Adapter caseVisibleAttribue(VisibleAttribue object)
      {
        return createVisibleAttribueAdapter();
      }
      @Override
      public Adapter caseMasterAttribute(MasterAttribute object)
      {
        return createMasterAttributeAdapter();
      }
      @Override
      public Adapter caseAbstractValueFieldElement(AbstractValueFieldElement object)
      {
        return createAbstractValueFieldElementAdapter();
      }
      @Override
      public Adapter caseAbstractValueFieldProperties(AbstractValueFieldProperties object)
      {
        return createAbstractValueFieldPropertiesAdapter();
      }
      @Override
      public Adapter caseMandatoryAttribue(MandatoryAttribue object)
      {
        return createMandatoryAttribueAdapter();
      }
      @Override
      public Adapter caseAbstractContainerFieldElement(AbstractContainerFieldElement object)
      {
        return createAbstractContainerFieldElementAdapter();
      }
      @Override
      public Adapter caseModuleElement(ModuleElement object)
      {
        return createModuleElementAdapter();
      }
      @Override
      public Adapter caseTranslationElement(TranslationElement object)
      {
        return createTranslationElementAdapter();
      }
      @Override
      public Adapter caseTranslationAttribute(TranslationAttribute object)
      {
        return createTranslationAttributeAdapter();
      }
      @Override
      public Adapter caseJavaElement(JavaElement object)
      {
        return createJavaElementAdapter();
      }
      @Override
      public Adapter caseRunAtAttribute(RunAtAttribute object)
      {
        return createRunAtAttributeAdapter();
      }
      @Override
      public Adapter caseCodeElement(CodeElement object)
      {
        return createCodeElementAdapter();
      }
      @Override
      public Adapter caseCodeIdAttribute(CodeIdAttribute object)
      {
        return createCodeIdAttributeAdapter();
      }
      @Override
      public Adapter caseLogicElement(LogicElement object)
      {
        return createLogicElementAdapter();
      }
      @Override
      public Adapter caseLogicOptionalProperties(LogicOptionalProperties object)
      {
        return createLogicOptionalPropertiesAdapter();
      }
      @Override
      public Adapter caseLogicTypeAttribute(LogicTypeAttribute object)
      {
        return createLogicTypeAttributeAdapter();
      }
      @Override
      public Adapter caseLogicExecAttribute(LogicExecAttribute object)
      {
        return createLogicExecAttributeAdapter();
      }
      @Override
      public Adapter caseLookupElement(LookupElement object)
      {
        return createLookupElementAdapter();
      }
      @Override
      public Adapter caseTemplateElement(TemplateElement object)
      {
        return createTemplateElementAdapter();
      }
      @Override
      public Adapter caseTemplateElementClassAttribute(TemplateElementClassAttribute object)
      {
        return createTemplateElementClassAttributeAdapter();
      }
      @Override
      public Adapter caseTemplateElementReplacesAttribute(TemplateElementReplacesAttribute object)
      {
        return createTemplateElementReplacesAttributeAdapter();
      }
      @Override
      public Adapter caseFormElement(FormElement object)
      {
        return createFormElementAdapter();
      }
      @Override
      public Adapter caseFormElementModalAttribute(FormElementModalAttribute object)
      {
        return createFormElementModalAttributeAdapter();
      }
      @Override
      public Adapter caseFormElementColumnsAttribute(FormElementColumnsAttribute object)
      {
        return createFormElementColumnsAttributeAdapter();
      }
      @Override
      public Adapter caseSequenceBoxElement(SequenceBoxElement object)
      {
        return createSequenceBoxElementAdapter();
      }
      @Override
      public Adapter caseStringElement(StringElement object)
      {
        return createStringElementAdapter();
      }
      @Override
      public Adapter caseStringElementProperties(StringElementProperties object)
      {
        return createStringElementPropertiesAdapter();
      }
      @Override
      public Adapter caseStringElementMaxlenAttribute(StringElementMaxlenAttribute object)
      {
        return createStringElementMaxlenAttributeAdapter();
      }
      @Override
      public Adapter caseDoubleElement(DoubleElement object)
      {
        return createDoubleElementAdapter();
      }
      @Override
      public Adapter caseLongElement(LongElement object)
      {
        return createLongElementAdapter();
      }
      @Override
      public Adapter caseDateElement(DateElement object)
      {
        return createDateElementAdapter();
      }
      @Override
      public Adapter caseSmartfieldElement(SmartfieldElement object)
      {
        return createSmartfieldElementAdapter();
      }
      @Override
      public Adapter caseSmartFieldElementProperties(SmartFieldElementProperties object)
      {
        return createSmartFieldElementPropertiesAdapter();
      }
      @Override
      public Adapter caseSmartfieldElementCodeAttribute(SmartfieldElementCodeAttribute object)
      {
        return createSmartfieldElementCodeAttributeAdapter();
      }
      @Override
      public Adapter caseSmartfieldElementValueTypeAttribute(SmartfieldElementValueTypeAttribute object)
      {
        return createSmartfieldElementValueTypeAttributeAdapter();
      }
      @Override
      public Adapter caseSmartfieldElementLookupAttribute(SmartfieldElementLookupAttribute object)
      {
        return createSmartfieldElementLookupAttributeAdapter();
      }
      @Override
      public Adapter caseZregBoxElement(ZregBoxElement object)
      {
        return createZregBoxElementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.RootElement <em>Root Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.RootElement
   * @generated
   */
  public Adapter createRootElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.AbstractScoutType <em>Abstract Scout Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.AbstractScoutType
   * @generated
   */
  public Adapter createAbstractScoutTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.AbstractFieldElement <em>Abstract Field Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.AbstractFieldElement
   * @generated
   */
  public Adapter createAbstractFieldElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.AbstractFieldProperties <em>Abstract Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.AbstractFieldProperties
   * @generated
   */
  public Adapter createAbstractFieldPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.TextAttribute <em>Text Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.TextAttribute
   * @generated
   */
  public Adapter createTextAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.EnabledAttribue <em>Enabled Attribue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.EnabledAttribue
   * @generated
   */
  public Adapter createEnabledAttribueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.VisibleAttribue <em>Visible Attribue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.VisibleAttribue
   * @generated
   */
  public Adapter createVisibleAttribueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.MasterAttribute <em>Master Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.MasterAttribute
   * @generated
   */
  public Adapter createMasterAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.AbstractValueFieldElement <em>Abstract Value Field Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.AbstractValueFieldElement
   * @generated
   */
  public Adapter createAbstractValueFieldElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.AbstractValueFieldProperties <em>Abstract Value Field Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.AbstractValueFieldProperties
   * @generated
   */
  public Adapter createAbstractValueFieldPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.MandatoryAttribue <em>Mandatory Attribue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.MandatoryAttribue
   * @generated
   */
  public Adapter createMandatoryAttribueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.AbstractContainerFieldElement <em>Abstract Container Field Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.AbstractContainerFieldElement
   * @generated
   */
  public Adapter createAbstractContainerFieldElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.ModuleElement <em>Module Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.ModuleElement
   * @generated
   */
  public Adapter createModuleElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.TranslationElement <em>Translation Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.TranslationElement
   * @generated
   */
  public Adapter createTranslationElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.TranslationAttribute <em>Translation Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.TranslationAttribute
   * @generated
   */
  public Adapter createTranslationAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.JavaElement <em>Java Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.JavaElement
   * @generated
   */
  public Adapter createJavaElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.RunAtAttribute <em>Run At Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.RunAtAttribute
   * @generated
   */
  public Adapter createRunAtAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.CodeElement <em>Code Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.CodeElement
   * @generated
   */
  public Adapter createCodeElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.CodeIdAttribute <em>Code Id Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.CodeIdAttribute
   * @generated
   */
  public Adapter createCodeIdAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.LogicElement <em>Logic Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.LogicElement
   * @generated
   */
  public Adapter createLogicElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.LogicOptionalProperties <em>Logic Optional Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.LogicOptionalProperties
   * @generated
   */
  public Adapter createLogicOptionalPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.LogicTypeAttribute <em>Logic Type Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.LogicTypeAttribute
   * @generated
   */
  public Adapter createLogicTypeAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.LogicExecAttribute <em>Logic Exec Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.LogicExecAttribute
   * @generated
   */
  public Adapter createLogicExecAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.LookupElement <em>Lookup Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.LookupElement
   * @generated
   */
  public Adapter createLookupElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.TemplateElement <em>Template Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.TemplateElement
   * @generated
   */
  public Adapter createTemplateElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.TemplateElementClassAttribute <em>Template Element Class Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.TemplateElementClassAttribute
   * @generated
   */
  public Adapter createTemplateElementClassAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.TemplateElementReplacesAttribute <em>Template Element Replaces Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.TemplateElementReplacesAttribute
   * @generated
   */
  public Adapter createTemplateElementReplacesAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.FormElement <em>Form Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.FormElement
   * @generated
   */
  public Adapter createFormElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.FormElementModalAttribute <em>Form Element Modal Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.FormElementModalAttribute
   * @generated
   */
  public Adapter createFormElementModalAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.FormElementColumnsAttribute <em>Form Element Columns Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.FormElementColumnsAttribute
   * @generated
   */
  public Adapter createFormElementColumnsAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.SequenceBoxElement <em>Sequence Box Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.SequenceBoxElement
   * @generated
   */
  public Adapter createSequenceBoxElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.StringElement <em>String Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.StringElement
   * @generated
   */
  public Adapter createStringElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.StringElementProperties <em>String Element Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.StringElementProperties
   * @generated
   */
  public Adapter createStringElementPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.StringElementMaxlenAttribute <em>String Element Maxlen Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.StringElementMaxlenAttribute
   * @generated
   */
  public Adapter createStringElementMaxlenAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.DoubleElement <em>Double Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.DoubleElement
   * @generated
   */
  public Adapter createDoubleElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.LongElement <em>Long Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.LongElement
   * @generated
   */
  public Adapter createLongElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.DateElement <em>Date Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.DateElement
   * @generated
   */
  public Adapter createDateElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.SmartfieldElement <em>Smartfield Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.SmartfieldElement
   * @generated
   */
  public Adapter createSmartfieldElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.SmartFieldElementProperties <em>Smart Field Element Properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.SmartFieldElementProperties
   * @generated
   */
  public Adapter createSmartFieldElementPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.SmartfieldElementCodeAttribute <em>Smartfield Element Code Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.SmartfieldElementCodeAttribute
   * @generated
   */
  public Adapter createSmartfieldElementCodeAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.SmartfieldElementValueTypeAttribute <em>Smartfield Element Value Type Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.SmartfieldElementValueTypeAttribute
   * @generated
   */
  public Adapter createSmartfieldElementValueTypeAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.SmartfieldElementLookupAttribute <em>Smartfield Element Lookup Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.SmartfieldElementLookupAttribute
   * @generated
   */
  public Adapter createSmartfieldElementLookupAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.ZregBoxElement <em>Zreg Box Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.ZregBoxElement
   * @generated
   */
  public Adapter createZregBoxElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SamlAdapterFactory
