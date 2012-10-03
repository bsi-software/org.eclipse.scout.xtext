/**
 */
package org.eclipse.scout.saml.saml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.scout.saml.saml.*;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;

import org.eclipse.xtext.xbase.XExpression;

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
      public Adapter caseModuleElement(ModuleElement object)
      {
        return createModuleElementAdapter();
      }
      @Override
      public Adapter caseImportElement(ImportElement object)
      {
        return createImportElementAdapter();
      }
      @Override
      public Adapter caseJavaCodeElement(JavaCodeElement object)
      {
        return createJavaCodeElementAdapter();
      }
      @Override
      public Adapter caseLogicElement(LogicElement object)
      {
        return createLogicElementAdapter();
      }
      @Override
      public Adapter caseCodeElement(CodeElement object)
      {
        return createCodeElementAdapter();
      }
      @Override
      public Adapter caseTranslationElement(TranslationElement object)
      {
        return createTranslationElementAdapter();
      }
      @Override
      public Adapter caseLanguageAttribute(LanguageAttribute object)
      {
        return createLanguageAttributeAdapter();
      }
      @Override
      public Adapter caseLookupElement(LookupElement object)
      {
        return createLookupElementAdapter();
      }
      @Override
      public Adapter caseFormElement(FormElement object)
      {
        return createFormElementAdapter();
      }
      @Override
      public Adapter caseControlElement(ControlElement object)
      {
        return createControlElementAdapter();
      }
      @Override
      public Adapter caseControlElementRule(ControlElementRule object)
      {
        return createControlElementRuleAdapter();
      }
      @Override
      public Adapter caseCompositeElement(CompositeElement object)
      {
        return createCompositeElementAdapter();
      }
      @Override
      public Adapter caseCompositeElementRule(CompositeElementRule object)
      {
        return createCompositeElementRuleAdapter();
      }
      @Override
      public Adapter caseLeafElement(LeafElement object)
      {
        return createLeafElementAdapter();
      }
      @Override
      public Adapter caseStringElement(StringElement object)
      {
        return createStringElementAdapter();
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
      public Adapter caseSequenceBoxElement(SequenceBoxElement object)
      {
        return createSequenceBoxElementAdapter();
      }
      @Override
      public Adapter caseXBlockExpression(XBlockExpression object)
      {
        return createXBlockExpressionAdapter();
      }
      @Override
      public Adapter caseXVariableDeclaration(XVariableDeclaration object)
      {
        return createXVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseXExpression(XExpression object)
      {
        return createXExpressionAdapter();
      }
      @Override
      public Adapter caseXbase_XBlockExpression(org.eclipse.xtext.xbase.XBlockExpression object)
      {
        return createXbase_XBlockExpressionAdapter();
      }
      @Override
      public Adapter caseJvmIdentifiableElement(JvmIdentifiableElement object)
      {
        return createJvmIdentifiableElementAdapter();
      }
      @Override
      public Adapter caseXbase_XVariableDeclaration(org.eclipse.xtext.xbase.XVariableDeclaration object)
      {
        return createXbase_XVariableDeclarationAdapter();
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
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.ImportElement <em>Import Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.ImportElement
   * @generated
   */
  public Adapter createImportElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.JavaCodeElement <em>Java Code Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.JavaCodeElement
   * @generated
   */
  public Adapter createJavaCodeElementAdapter()
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
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.LanguageAttribute <em>Language Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.LanguageAttribute
   * @generated
   */
  public Adapter createLanguageAttributeAdapter()
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
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.ControlElement <em>Control Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.ControlElement
   * @generated
   */
  public Adapter createControlElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.ControlElementRule <em>Control Element Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.ControlElementRule
   * @generated
   */
  public Adapter createControlElementRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.CompositeElement <em>Composite Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.CompositeElement
   * @generated
   */
  public Adapter createCompositeElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.CompositeElementRule <em>Composite Element Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.CompositeElementRule
   * @generated
   */
  public Adapter createCompositeElementRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.LeafElement <em>Leaf Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.LeafElement
   * @generated
   */
  public Adapter createLeafElementAdapter()
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
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.XBlockExpression <em>XBlock Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.XBlockExpression
   * @generated
   */
  public Adapter createXBlockExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.scout.saml.saml.XVariableDeclaration <em>XVariable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.scout.saml.saml.XVariableDeclaration
   * @generated
   */
  public Adapter createXVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XExpression
   * @generated
   */
  public Adapter createXExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XBlockExpression <em>XBlock Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XBlockExpression
   * @generated
   */
  public Adapter createXbase_XBlockExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.common.types.JvmIdentifiableElement <em>Jvm Identifiable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.common.types.JvmIdentifiableElement
   * @generated
   */
  public Adapter createJvmIdentifiableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.xbase.XVariableDeclaration <em>XVariable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.xbase.XVariableDeclaration
   * @generated
   */
  public Adapter createXbase_XVariableDeclarationAdapter()
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
