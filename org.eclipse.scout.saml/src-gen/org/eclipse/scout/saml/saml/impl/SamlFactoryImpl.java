/**
 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.ecore.EClass;
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
      case SamlPackage.TRANSLATION_ELEMENT: return createTranslationElement();
      case SamlPackage.LANGUAGE_ATTRIBUTE: return createLanguageAttribute();
      case SamlPackage.LOGIC_ELEMENT: return createLogicElement();
      case SamlPackage.CODE_ELEMENT: return createCodeElement();
      case SamlPackage.LOOKUP_ELEMENT: return createLookupElement();
      case SamlPackage.TEMPLATE_ELEMENT: return createTemplateElement();
      case SamlPackage.FORM_ELEMENT: return createFormElement();
      case SamlPackage.FORM_FIELD_ELEMENT: return createFormFieldElement();
      case SamlPackage.COMPOSITE_FIELD_ELEMENT: return createCompositeFieldElement();
      case SamlPackage.SEQUENCE_BOX_ELEMENT: return createSequenceBoxElement();
      case SamlPackage.GROUP_BOX_ELEMENT: return createGroupBoxElement();
      case SamlPackage.VALUE_FIELD_ELEMENT: return createValueFieldElement();
      case SamlPackage.STRING_ELEMENT: return createStringElement();
      case SamlPackage.BIG_DECIMAL_ELEMENT: return createBigDecimalElement();
      case SamlPackage.LONG_ELEMENT: return createLongElement();
      case SamlPackage.DATE_ELEMENT: return createDateElement();
      case SamlPackage.SMARTFIELD_ELEMENT: return createSmartfieldElement();
      case SamlPackage.CUSTOM_FIELD_ELEMENT: return createCustomFieldElement();
      case SamlPackage.BUTTON_ELEMENT: return createButtonElement();
      case SamlPackage.MENU_ELEMENT: return createMenuElement();
      case SamlPackage.TABLE_ELEMENT: return createTableElement();
      case SamlPackage.COLUMN_ELEMENT: return createColumnElement();
      case SamlPackage.KEY_ELEMENT: return createKeyElement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public TemplateElement createTemplateElement()
  {
    TemplateElementImpl templateElement = new TemplateElementImpl();
    return templateElement;
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
  public FormFieldElement createFormFieldElement()
  {
    FormFieldElementImpl formFieldElement = new FormFieldElementImpl();
    return formFieldElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeFieldElement createCompositeFieldElement()
  {
    CompositeFieldElementImpl compositeFieldElement = new CompositeFieldElementImpl();
    return compositeFieldElement;
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
  public GroupBoxElement createGroupBoxElement()
  {
    GroupBoxElementImpl groupBoxElement = new GroupBoxElementImpl();
    return groupBoxElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueFieldElement createValueFieldElement()
  {
    ValueFieldElementImpl valueFieldElement = new ValueFieldElementImpl();
    return valueFieldElement;
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
  public BigDecimalElement createBigDecimalElement()
  {
    BigDecimalElementImpl bigDecimalElement = new BigDecimalElementImpl();
    return bigDecimalElement;
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
  public DateElement createDateElement()
  {
    DateElementImpl dateElement = new DateElementImpl();
    return dateElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmartfieldElement createSmartfieldElement()
  {
    SmartfieldElementImpl smartfieldElement = new SmartfieldElementImpl();
    return smartfieldElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomFieldElement createCustomFieldElement()
  {
    CustomFieldElementImpl customFieldElement = new CustomFieldElementImpl();
    return customFieldElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonElement createButtonElement()
  {
    ButtonElementImpl buttonElement = new ButtonElementImpl();
    return buttonElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MenuElement createMenuElement()
  {
    MenuElementImpl menuElement = new MenuElementImpl();
    return menuElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableElement createTableElement()
  {
    TableElementImpl tableElement = new TableElementImpl();
    return tableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnElement createColumnElement()
  {
    ColumnElementImpl columnElement = new ColumnElementImpl();
    return columnElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyElement createKeyElement()
  {
    KeyElementImpl keyElement = new KeyElementImpl();
    return keyElement;
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
