/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.scout.saml.saml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SamlFactoryImpl extends EFactoryImpl implements SamlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SamlFactory init()
  {
    try
    {
      SamlFactory theSamlFactory = (SamlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/scout/saml/Saml"); 
      if (theSamlFactory != null)
      {
        return theSamlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SamlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SamlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SamlPackage.MODEL: return createModel();
      case SamlPackage.MODULE_ELEMENT: return createModuleElement();
      case SamlPackage.IMPORT_ELEMENT: return createImportElement();
      case SamlPackage.JAVA_CODE_ELEMENT: return createJavaCodeElement();
      case SamlPackage.LOGIC_ELEMENT: return createLogicElement();
      case SamlPackage.CODE_ELEMENT: return createCodeElement();
      case SamlPackage.TRANSLATION_ELEMENT: return createTranslationElement();
      case SamlPackage.LANGUAGE_ATTRIBUTE: return createLanguageAttribute();
      case SamlPackage.LOOKUP_ELEMENT: return createLookupElement();
      case SamlPackage.FORM_ELEMENT: return createFormElement();
      case SamlPackage.CONTROL_ELEMENT: return createControlElement();
      case SamlPackage.CONTROL_ELEMENT_RULE: return createControlElementRule();
      case SamlPackage.COMPOSITE_ELEMENT: return createCompositeElement();
      case SamlPackage.COMPOSITE_ELEMENT_RULE: return createCompositeElementRule();
      case SamlPackage.LEAF_ELEMENT: return createLeafElement();
      case SamlPackage.STRING_ELEMENT: return createStringElement();
      case SamlPackage.DOUBLE_ELEMENT: return createDoubleElement();
      case SamlPackage.LONG_ELEMENT: return createLongElement();
      case SamlPackage.SEQUENCE_BOX_ELEMENT: return createSequenceBoxElement();
      case SamlPackage.XBLOCK_EXPRESSION: return createXBlockExpression();
      case SamlPackage.XVARIABLE_DECLARATION: return createXVariableDeclaration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SamlPackage.BOOLEAN_TYPE:
        return createBooleanTypeFromString(eDataType, initialValue);
      case SamlPackage.LOGIC_TYPE:
        return createLogicTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SamlPackage.BOOLEAN_TYPE:
        return convertBooleanTypeToString(eDataType, instanceValue);
      case SamlPackage.LOGIC_TYPE:
        return convertLogicTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleElement createModuleElement()
  {
    ModuleElementImpl moduleElement = new ModuleElementImpl();
    return moduleElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportElement createImportElement()
  {
    ImportElementImpl importElement = new ImportElementImpl();
    return importElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaCodeElement createJavaCodeElement()
  {
    JavaCodeElementImpl javaCodeElement = new JavaCodeElementImpl();
    return javaCodeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicElement createLogicElement()
  {
    LogicElementImpl logicElement = new LogicElementImpl();
    return logicElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeElement createCodeElement()
  {
    CodeElementImpl codeElement = new CodeElementImpl();
    return codeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TranslationElement createTranslationElement()
  {
    TranslationElementImpl translationElement = new TranslationElementImpl();
    return translationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageAttribute createLanguageAttribute()
  {
    LanguageAttributeImpl languageAttribute = new LanguageAttributeImpl();
    return languageAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LookupElement createLookupElement()
  {
    LookupElementImpl lookupElement = new LookupElementImpl();
    return lookupElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormElement createFormElement()
  {
    FormElementImpl formElement = new FormElementImpl();
    return formElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlElement createControlElement()
  {
    ControlElementImpl controlElement = new ControlElementImpl();
    return controlElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlElementRule createControlElementRule()
  {
    ControlElementRuleImpl controlElementRule = new ControlElementRuleImpl();
    return controlElementRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeElement createCompositeElement()
  {
    CompositeElementImpl compositeElement = new CompositeElementImpl();
    return compositeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeElementRule createCompositeElementRule()
  {
    CompositeElementRuleImpl compositeElementRule = new CompositeElementRuleImpl();
    return compositeElementRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeafElement createLeafElement()
  {
    LeafElementImpl leafElement = new LeafElementImpl();
    return leafElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringElement createStringElement()
  {
    StringElementImpl stringElement = new StringElementImpl();
    return stringElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleElement createDoubleElement()
  {
    DoubleElementImpl doubleElement = new DoubleElementImpl();
    return doubleElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongElement createLongElement()
  {
    LongElementImpl longElement = new LongElementImpl();
    return longElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceBoxElement createSequenceBoxElement()
  {
    SequenceBoxElementImpl sequenceBoxElement = new SequenceBoxElementImpl();
    return sequenceBoxElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBlockExpression createXBlockExpression()
  {
    XBlockExpressionImpl xBlockExpression = new XBlockExpressionImpl();
    return xBlockExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XVariableDeclaration createXVariableDeclaration()
  {
    XVariableDeclarationImpl xVariableDeclaration = new XVariableDeclarationImpl();
    return xVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanType createBooleanTypeFromString(EDataType eDataType, String initialValue)
  {
    BooleanType result = BooleanType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicType createLogicTypeFromString(EDataType eDataType, String initialValue)
  {
    LogicType result = LogicType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLogicTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SamlPackage getSamlPackage()
  {
    return (SamlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SamlPackage getPackage()
  {
    return SamlPackage.eINSTANCE;
  }

} //SamlFactoryImpl
