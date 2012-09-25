package org.eclipse.scout.saml.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.scout.saml.saml.AbstractFieldProperties;
import org.eclipse.scout.saml.saml.AbstractValueFieldProperties;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.CodeIdAttribute;
import org.eclipse.scout.saml.saml.DateElement;
import org.eclipse.scout.saml.saml.DoubleElement;
import org.eclipse.scout.saml.saml.EnabledAttribue;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.FormElementColumnsAttribute;
import org.eclipse.scout.saml.saml.FormElementModalAttribute;
import org.eclipse.scout.saml.saml.JavaElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.LogicExecAttribute;
import org.eclipse.scout.saml.saml.LogicOptionalProperties;
import org.eclipse.scout.saml.saml.LogicTypeAttribute;
import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.MandatoryAttribue;
import org.eclipse.scout.saml.saml.MasterAttribute;
import org.eclipse.scout.saml.saml.Model;
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.saml.saml.RunAtAttribute;
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
import org.eclipse.scout.saml.services.SamlGrammarAccess;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SamlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SamlGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SamlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SamlPackage.ABSTRACT_FIELD_PROPERTIES:
				if(context == grammarAccess.getAbstractFieldPropertiesRule() ||
				   context == grammarAccess.getAbstractValueFieldPropertiesRule() ||
				   context == grammarAccess.getSmartFieldElementPropertiesRule() ||
				   context == grammarAccess.getStringElementPropertiesRule()) {
					sequence_AbstractFieldProperties(context, (AbstractFieldProperties) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.ABSTRACT_VALUE_FIELD_PROPERTIES:
				if(context == grammarAccess.getAbstractValueFieldPropertiesRule() ||
				   context == grammarAccess.getSmartFieldElementPropertiesRule() ||
				   context == grammarAccess.getStringElementPropertiesRule()) {
					sequence_AbstractValueFieldProperties(context, (AbstractValueFieldProperties) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.CODE_ELEMENT:
				if(context == grammarAccess.getAbstractScoutTypeRule() ||
				   context == grammarAccess.getCodeElementRule() ||
				   context == grammarAccess.getRootElementRule()) {
					sequence_CodeElement(context, (CodeElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.CODE_ID_ATTRIBUTE:
				if(context == grammarAccess.getCodeIdAttributeRule()) {
					sequence_CodeIdAttribute(context, (CodeIdAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.DATE_ELEMENT:
				if(context == grammarAccess.getAbstractFieldElementRule() ||
				   context == grammarAccess.getAbstractScoutTypeRule() ||
				   context == grammarAccess.getAbstractValueFieldElementRule() ||
				   context == grammarAccess.getDateElementRule()) {
					sequence_DateElement(context, (DateElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.DOUBLE_ELEMENT:
				if(context == grammarAccess.getAbstractFieldElementRule() ||
				   context == grammarAccess.getAbstractScoutTypeRule() ||
				   context == grammarAccess.getAbstractValueFieldElementRule() ||
				   context == grammarAccess.getDoubleElementRule()) {
					sequence_DoubleElement(context, (DoubleElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.ENABLED_ATTRIBUE:
				if(context == grammarAccess.getEnabledAttribueRule()) {
					sequence_EnabledAttribue(context, (EnabledAttribue) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.FORM_ELEMENT:
				if(context == grammarAccess.getAbstractScoutTypeRule() ||
				   context == grammarAccess.getFormElementRule() ||
				   context == grammarAccess.getRootElementRule()) {
					sequence_FormElement(context, (FormElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.FORM_ELEMENT_COLUMNS_ATTRIBUTE:
				if(context == grammarAccess.getFormElementColumnsAttributeRule()) {
					sequence_FormElementColumnsAttribute(context, (FormElementColumnsAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.FORM_ELEMENT_MODAL_ATTRIBUTE:
				if(context == grammarAccess.getFormElementModalAttributeRule()) {
					sequence_FormElementModalAttribute(context, (FormElementModalAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.JAVA_ELEMENT:
				if(context == grammarAccess.getJavaElementRule()) {
					sequence_JavaElement(context, (JavaElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.LOGIC_ELEMENT:
				if(context == grammarAccess.getLogicElementRule()) {
					sequence_LogicElement(context, (LogicElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.LOGIC_EXEC_ATTRIBUTE:
				if(context == grammarAccess.getLogicExecAttributeRule()) {
					sequence_LogicExecAttribute(context, (LogicExecAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.LOGIC_OPTIONAL_PROPERTIES:
				if(context == grammarAccess.getLogicOptionalPropertiesRule()) {
					sequence_LogicOptionalProperties(context, (LogicOptionalProperties) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.LOGIC_TYPE_ATTRIBUTE:
				if(context == grammarAccess.getLogicTypeAttributeRule()) {
					sequence_LogicTypeAttribute(context, (LogicTypeAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.LONG_ELEMENT:
				if(context == grammarAccess.getAbstractFieldElementRule() ||
				   context == grammarAccess.getAbstractScoutTypeRule() ||
				   context == grammarAccess.getAbstractValueFieldElementRule() ||
				   context == grammarAccess.getLongElementRule()) {
					sequence_LongElement(context, (LongElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.LOOKUP_ELEMENT:
				if(context == grammarAccess.getAbstractScoutTypeRule() ||
				   context == grammarAccess.getLookupElementRule() ||
				   context == grammarAccess.getRootElementRule()) {
					sequence_LookupElement(context, (LookupElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.MANDATORY_ATTRIBUE:
				if(context == grammarAccess.getMandatoryAttribueRule()) {
					sequence_MandatoryAttribue(context, (MandatoryAttribue) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.MASTER_ATTRIBUTE:
				if(context == grammarAccess.getMasterAttributeRule()) {
					sequence_MasterAttribute(context, (MasterAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.MODULE_ELEMENT:
				if(context == grammarAccess.getModuleElementRule() ||
				   context == grammarAccess.getRootElementRule()) {
					sequence_ModuleElement(context, (ModuleElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.RUN_AT_ATTRIBUTE:
				if(context == grammarAccess.getRunAtAttributeRule()) {
					sequence_RunAtAttribute(context, (RunAtAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.SEQUENCE_BOX_ELEMENT:
				if(context == grammarAccess.getAbstractContainerFieldElementRule() ||
				   context == grammarAccess.getAbstractFieldElementRule() ||
				   context == grammarAccess.getAbstractScoutTypeRule() ||
				   context == grammarAccess.getSequenceBoxElementRule()) {
					sequence_SequenceBoxElement(context, (SequenceBoxElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.SMART_FIELD_ELEMENT_PROPERTIES:
				if(context == grammarAccess.getSmartFieldElementPropertiesRule()) {
					sequence_SmartFieldElementProperties(context, (SmartFieldElementProperties) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.SMARTFIELD_ELEMENT:
				if(context == grammarAccess.getAbstractFieldElementRule() ||
				   context == grammarAccess.getAbstractScoutTypeRule() ||
				   context == grammarAccess.getAbstractValueFieldElementRule() ||
				   context == grammarAccess.getSmartfieldElementRule()) {
					sequence_SmartfieldElement(context, (SmartfieldElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.SMARTFIELD_ELEMENT_CODE_ATTRIBUTE:
				if(context == grammarAccess.getSmartfieldElementCodeAttributeRule()) {
					sequence_SmartfieldElementCodeAttribute(context, (SmartfieldElementCodeAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.SMARTFIELD_ELEMENT_LOOKUP_ATTRIBUTE:
				if(context == grammarAccess.getSmartfieldElementLookupAttributeRule()) {
					sequence_SmartfieldElementLookupAttribute(context, (SmartfieldElementLookupAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.SMARTFIELD_ELEMENT_VALUE_TYPE_ATTRIBUTE:
				if(context == grammarAccess.getSmartfieldElementValueTypeAttributeRule()) {
					sequence_SmartfieldElementValueTypeAttribute(context, (SmartfieldElementValueTypeAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.STRING_ELEMENT:
				if(context == grammarAccess.getAbstractFieldElementRule() ||
				   context == grammarAccess.getAbstractScoutTypeRule() ||
				   context == grammarAccess.getAbstractValueFieldElementRule() ||
				   context == grammarAccess.getStringElementRule()) {
					sequence_StringElement(context, (StringElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.STRING_ELEMENT_MAXLEN_ATTRIBUTE:
				if(context == grammarAccess.getStringElementMaxlenAttributeRule()) {
					sequence_StringElementMaxlenAttribute(context, (StringElementMaxlenAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.STRING_ELEMENT_PROPERTIES:
				if(context == grammarAccess.getStringElementPropertiesRule()) {
					sequence_StringElementProperties(context, (StringElementProperties) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.TEMPLATE_ELEMENT:
				if(context == grammarAccess.getRootElementRule() ||
				   context == grammarAccess.getTemplateElementRule()) {
					sequence_TemplateElement(context, (TemplateElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.TEMPLATE_ELEMENT_CLASS_ATTRIBUTE:
				if(context == grammarAccess.getTemplateElementClassAttributeRule()) {
					sequence_TemplateElementClassAttribute(context, (TemplateElementClassAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.TEMPLATE_ELEMENT_REPLACES_ATTRIBUTE:
				if(context == grammarAccess.getTemplateElementReplacesAttributeRule()) {
					sequence_TemplateElementReplacesAttribute(context, (TemplateElementReplacesAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.TEXT_ATTRIBUTE:
				if(context == grammarAccess.getTextAttributeRule()) {
					sequence_TextAttribute(context, (TextAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.TRANSLATION_ATTRIBUTE:
				if(context == grammarAccess.getTranslationAttributeRule()) {
					sequence_TranslationAttribute(context, (TranslationAttribute) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.TRANSLATION_ELEMENT:
				if(context == grammarAccess.getRootElementRule() ||
				   context == grammarAccess.getTranslationElementRule()) {
					sequence_TranslationElement(context, (TranslationElement) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.VISIBLE_ATTRIBUE:
				if(context == grammarAccess.getVisibleAttribueRule()) {
					sequence_VisibleAttribue(context, (VisibleAttribue) semanticObject); 
					return; 
				}
				else break;
			case SamlPackage.ZREG_BOX_ELEMENT:
				if(context == grammarAccess.getAbstractFieldElementRule() ||
				   context == grammarAccess.getAbstractScoutTypeRule() ||
				   context == grammarAccess.getAbstractValueFieldElementRule() ||
				   context == grammarAccess.getZregBoxElementRule()) {
					sequence_ZregBoxElement(context, (ZregBoxElement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (text=TextAttribute | visible=VisibleAttribue | master=MasterAttribute | enabled=EnabledAttribue)
	 */
	protected void sequence_AbstractFieldProperties(EObject context, AbstractFieldProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     mandatory=MandatoryAttribue
	 */
	protected void sequence_AbstractValueFieldProperties(EObject context, AbstractValueFieldProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID id=CodeIdAttribute)
	 */
	protected void sequence_CodeElement(EObject context, CodeElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.ROOT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.ROOT_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.CODE_ELEMENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.CODE_ELEMENT__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCodeElementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCodeElementAccess().getIdCodeIdAttributeParserRuleCall_2_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_CodeIdAttribute(EObject context, CodeIdAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.CODE_ID_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.CODE_ID_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCodeIdAttributeAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=AbstractValueFieldProperties* children+=LogicElement*)
	 */
	protected void sequence_DateElement(EObject context, DateElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=AbstractValueFieldProperties* children+=LogicElement*)
	 */
	protected void sequence_DoubleElement(EObject context, DoubleElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BooleanType
	 */
	protected void sequence_EnabledAttribue(EObject context, EnabledAttribue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.ENABLED_ATTRIBUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.ENABLED_ATTRIBUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnabledAttribueAccess().getValueBooleanTypeEnumRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_FormElementColumnsAttribute(EObject context, FormElementColumnsAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.FORM_ELEMENT_COLUMNS_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.FORM_ELEMENT_COLUMNS_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormElementColumnsAttributeAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BooleanType
	 */
	protected void sequence_FormElementModalAttribute(EObject context, FormElementModalAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.FORM_ELEMENT_MODAL_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.FORM_ELEMENT_MODAL_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormElementModalAttributeAccess().getValueBooleanTypeEnumRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         modal=FormElementModalAttribute 
	 *         text=TextAttribute 
	 *         columns=FormElementColumnsAttribute 
	 *         (elements+=LogicElement | elements+=JavaElement | elements+=AbstractFieldElement)*
	 *     )
	 */
	protected void sequence_FormElement(EObject context, FormElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID runat=RunAtAttribute source=STRING)
	 */
	protected void sequence_JavaElement(EObject context, JavaElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.JAVA_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.JAVA_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.JAVA_ELEMENT__RUNAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.JAVA_ELEMENT__RUNAT));
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.JAVA_ELEMENT__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.JAVA_ELEMENT__SOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJavaElementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getJavaElementAccess().getRunatRunAtAttributeParserRuleCall_2_0(), semanticObject.getRunat());
		feeder.accept(grammarAccess.getJavaElementAccess().getSourceSTRINGTerminalRuleCall_4_0(), semanticObject.getSource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=LogicTypeAttribute properties+=LogicOptionalProperties* source=STRING?)
	 */
	protected void sequence_LogicElement(EObject context, LogicElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[JavaElement|ID]
	 */
	protected void sequence_LogicExecAttribute(EObject context, LogicExecAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.LOGIC_EXEC_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.LOGIC_EXEC_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicExecAttributeAccess().getValueJavaElementIDTerminalRuleCall_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (runat=RunAtAttribute | exec=LogicExecAttribute)
	 */
	protected void sequence_LogicOptionalProperties(EObject context, LogicOptionalProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=LogicTypeAttributeList
	 */
	protected void sequence_LogicTypeAttribute(EObject context, LogicTypeAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.LOGIC_TYPE_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.LOGIC_TYPE_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicTypeAttributeAccess().getValueLogicTypeAttributeListEnumRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=AbstractValueFieldProperties* children+=LogicElement*)
	 */
	protected void sequence_LongElement(EObject context, LongElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (servicelogic+=JavaElement | servicelogic+=LogicElement)+)
	 */
	protected void sequence_LookupElement(EObject context, LookupElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BooleanType
	 */
	protected void sequence_MandatoryAttribue(EObject context, MandatoryAttribue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.MANDATORY_ATTRIBUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.MANDATORY_ATTRIBUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMandatoryAttribueAccess().getValueBooleanTypeEnumRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=[AbstractFieldElement|ID]
	 */
	protected void sequence_MasterAttribute(EObject context, MasterAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.MASTER_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.MASTER_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMasterAttributeAccess().getValueAbstractFieldElementIDTerminalRuleCall_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elements+=RootElement*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_ModuleElement(EObject context, ModuleElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.ROOT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.ROOT_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModuleElementAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=JavaRunAtAttributeList
	 */
	protected void sequence_RunAtAttribute(EObject context, RunAtAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.RUN_AT_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.RUN_AT_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRunAtAttributeAccess().getValueJavaRunAtAttributeListEnumRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=AbstractFieldProperties* (children+=LogicElement | children+=AbstractFieldElement)*)
	 */
	protected void sequence_SequenceBoxElement(EObject context, SequenceBoxElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (code=SmartfieldElementCodeAttribute | value_type=SmartfieldElementValueTypeAttribute | lookup=SmartfieldElementLookupAttribute)
	 */
	protected void sequence_SmartFieldElementProperties(EObject context, SmartFieldElementProperties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[CodeElement|ID]
	 */
	protected void sequence_SmartfieldElementCodeAttribute(EObject context, SmartfieldElementCodeAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.SMARTFIELD_ELEMENT_CODE_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.SMARTFIELD_ELEMENT_CODE_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSmartfieldElementCodeAttributeAccess().getValueCodeElementIDTerminalRuleCall_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=[LookupElement|ID]
	 */
	protected void sequence_SmartfieldElementLookupAttribute(EObject context, SmartfieldElementLookupAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.SMARTFIELD_ELEMENT_LOOKUP_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.SMARTFIELD_ELEMENT_LOOKUP_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSmartfieldElementLookupAttributeAccess().getValueLookupElementIDTerminalRuleCall_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=[JvmType|QualifiedName]
	 */
	protected void sequence_SmartfieldElementValueTypeAttribute(EObject context, SmartfieldElementValueTypeAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.SMARTFIELD_ELEMENT_VALUE_TYPE_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.SMARTFIELD_ELEMENT_VALUE_TYPE_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getValueJvmTypeQualifiedNameParserRuleCall_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=SmartFieldElementProperties* logic+=LogicElement*)
	 */
	protected void sequence_SmartfieldElement(EObject context, SmartfieldElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_StringElementMaxlenAttribute(EObject context, StringElementMaxlenAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.STRING_ELEMENT_MAXLEN_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.STRING_ELEMENT_MAXLEN_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringElementMaxlenAttributeAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     maxlen=StringElementMaxlenAttribute
	 */
	protected void sequence_StringElementProperties(EObject context, StringElementProperties semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.STRING_ELEMENT_PROPERTIES__MAXLEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.STRING_ELEMENT_PROPERTIES__MAXLEN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringElementPropertiesAccess().getMaxlenStringElementMaxlenAttributeParserRuleCall_1_0(), semanticObject.getMaxlen());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=StringElementProperties* logic+=LogicElement*)
	 */
	protected void sequence_StringElement(EObject context, StringElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=QualifiedName
	 */
	protected void sequence_TemplateElementClassAttribute(EObject context, TemplateElementClassAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.TEMPLATE_ELEMENT_CLASS_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.TEMPLATE_ELEMENT_CLASS_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTemplateElementClassAttributeAccess().getValueQualifiedNameParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=[AbstractScoutType|ID]
	 */
	protected void sequence_TemplateElementReplacesAttribute(EObject context, TemplateElementReplacesAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.TEMPLATE_ELEMENT_REPLACES_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.TEMPLATE_ELEMENT_REPLACES_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTemplateElementReplacesAttributeAccess().getValueAbstractScoutTypeIDTerminalRuleCall_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID class=TemplateElementClassAttribute replaces=TemplateElementReplacesAttribute)
	 */
	protected void sequence_TemplateElement(EObject context, TemplateElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.ROOT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.ROOT_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.TEMPLATE_ELEMENT__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.TEMPLATE_ELEMENT__CLASS));
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.TEMPLATE_ELEMENT__REPLACES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.TEMPLATE_ELEMENT__REPLACES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTemplateElementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTemplateElementAccess().getClassTemplateElementClassAttributeParserRuleCall_2_0(), semanticObject.getClass_());
		feeder.accept(grammarAccess.getTemplateElementAccess().getReplacesTemplateElementReplacesAttributeParserRuleCall_3_0(), semanticObject.getReplaces());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=[TranslationElement|ID]
	 */
	protected void sequence_TextAttribute(EObject context, TextAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.TEXT_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.TEXT_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextAttributeAccess().getValueTranslationElementIDTerminalRuleCall_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lang=ID text=STRING)
	 */
	protected void sequence_TranslationAttribute(EObject context, TranslationAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.TRANSLATION_ATTRIBUTE__LANG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.TRANSLATION_ATTRIBUTE__LANG));
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.TRANSLATION_ATTRIBUTE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.TRANSLATION_ATTRIBUTE__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTranslationAttributeAccess().getLangIDTerminalRuleCall_0_0(), semanticObject.getLang());
		feeder.accept(grammarAccess.getTranslationAttributeAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName translations+=TranslationAttribute+)
	 */
	protected void sequence_TranslationElement(EObject context, TranslationElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BooleanType
	 */
	protected void sequence_VisibleAttribue(EObject context, VisibleAttribue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SamlPackage.Literals.VISIBLE_ATTRIBUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SamlPackage.Literals.VISIBLE_ATTRIBUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVisibleAttribueAccess().getValueBooleanTypeEnumRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=AbstractFieldProperties* children+=LogicElement*)
	 */
	protected void sequence_ZregBoxElement(EObject context, ZregBoxElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
