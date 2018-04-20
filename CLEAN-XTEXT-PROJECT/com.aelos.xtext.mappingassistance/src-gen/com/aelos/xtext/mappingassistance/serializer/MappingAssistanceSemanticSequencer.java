/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.mappingassistance.serializer;

import com.aelos.xtext.mappingassistance.mappingAssistance.AbstractModel;
import com.aelos.xtext.mappingassistance.mappingAssistance.Bindings;
import com.aelos.xtext.mappingassistance.mappingAssistance.Call;
import com.aelos.xtext.mappingassistance.mappingAssistance.Comopnent;
import com.aelos.xtext.mappingassistance.mappingAssistance.INT;
import com.aelos.xtext.mappingassistance.mappingAssistance.Import;
import com.aelos.xtext.mappingassistance.mappingAssistance.InstanceComp;
import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage;
import com.aelos.xtext.mappingassistance.mappingAssistance.Mock;
import com.aelos.xtext.mappingassistance.mappingAssistance.Model;
import com.aelos.xtext.mappingassistance.mappingAssistance.Observer;
import com.aelos.xtext.mappingassistance.mappingAssistance.Operation;
import com.aelos.xtext.mappingassistance.mappingAssistance.ReplaceConf;
import com.aelos.xtext.mappingassistance.mappingAssistance.STRING;
import com.aelos.xtext.mappingassistance.mappingAssistance.TestDriver;
import com.aelos.xtext.mappingassistance.mappingAssistance.TestOP;
import com.aelos.xtext.mappingassistance.mappingAssistance.Variable;
import com.aelos.xtext.mappingassistance.mappingAssistance.VariableRef;
import com.aelos.xtext.mappingassistance.services.MappingAssistanceGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MappingAssistanceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MappingAssistanceGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MappingAssistancePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MappingAssistancePackage.ABSTRACT_MODEL:
				sequence_AbstractModel(context, (AbstractModel) semanticObject); 
				return; 
			case MappingAssistancePackage.BINDINGS:
				sequence_Bindings(context, (Bindings) semanticObject); 
				return; 
			case MappingAssistancePackage.BOOLEAN:
				sequence_Atomic(context, (com.aelos.xtext.mappingassistance.mappingAssistance.Boolean) semanticObject); 
				return; 
			case MappingAssistancePackage.CALL:
				sequence_Call(context, (Call) semanticObject); 
				return; 
			case MappingAssistancePackage.COMOPNENT:
				sequence_Comopnent(context, (Comopnent) semanticObject); 
				return; 
			case MappingAssistancePackage.DOUBLE:
				sequence_Atomic(context, (com.aelos.xtext.mappingassistance.mappingAssistance.Double) semanticObject); 
				return; 
			case MappingAssistancePackage.INT:
				sequence_Atomic(context, (INT) semanticObject); 
				return; 
			case MappingAssistancePackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case MappingAssistancePackage.INSTANCE_COMP:
				sequence_InstanceComp(context, (InstanceComp) semanticObject); 
				return; 
			case MappingAssistancePackage.MOCK:
				sequence_Mock(context, (Mock) semanticObject); 
				return; 
			case MappingAssistancePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MappingAssistancePackage.OBSERVER:
				sequence_Observer(context, (Observer) semanticObject); 
				return; 
			case MappingAssistancePackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case MappingAssistancePackage.REPLACE_CONF:
				sequence_ReplaceConf(context, (ReplaceConf) semanticObject); 
				return; 
			case MappingAssistancePackage.STRING:
				sequence_Atomic(context, (STRING) semanticObject); 
				return; 
			case MappingAssistancePackage.TEST_DRIVER:
				sequence_TestDriver(context, (TestDriver) semanticObject); 
				return; 
			case MappingAssistancePackage.TEST_OP:
				sequence_TestOP(context, (TestOP) semanticObject); 
				return; 
			case MappingAssistancePackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case MappingAssistancePackage.VARIABLE_REF:
				sequence_Atomic(context, (VariableRef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractModel returns AbstractModel
	 *
	 * Constraint:
	 *     (
	 *         im+=Import+ 
	 *         testDr+=TestDriver 
	 *         (
	 *             obs+=Observer | 
	 *             comp+=Comopnent | 
	 *             mock+=Mock | 
	 *             conf+=ReplaceConf | 
	 *             bind+=Bindings | 
	 *             inst+=InstanceComp
	 *         )*
	 *     )
	 */
	protected void sequence_AbstractModel(ISerializationContext context, AbstractModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Atomic returns Boolean
	 *
	 * Constraint:
	 *     value=Boolean
	 */
	protected void sequence_Atomic(ISerializationContext context, com.aelos.xtext.mappingassistance.mappingAssistance.Boolean semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.BOOLEAN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.BOOLEAN__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueBooleanParserRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Atomic returns Double
	 *
	 * Constraint:
	 *     value=Double
	 */
	protected void sequence_Atomic(ISerializationContext context, com.aelos.xtext.mappingassistance.mappingAssistance.Double semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.DOUBLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.DOUBLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueDoubleParserRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Atomic returns INT
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Atomic(ISerializationContext context, INT semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.INT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.INT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Atomic returns STRING
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Atomic(ISerializationContext context, STRING semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.STRING__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Atomic returns VariableRef
	 *
	 * Constraint:
	 *     variable=[Variable|ID]
	 */
	protected void sequence_Atomic(ISerializationContext context, VariableRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.VARIABLE_REF__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.VARIABLE_REF__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_4_1_0_1(), semanticObject.eGet(MappingAssistancePackage.Literals.VARIABLE_REF__VARIABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Bindings returns Bindings
	 *
	 * Constraint:
	 *     (nameComp=[InstanceComp|ID] nameServ1+=[Operation|ID] nameComp1=[Variable|ID] nameServ2+=[Operation|ID])
	 */
	protected void sequence_Bindings(ISerializationContext context, Bindings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Call returns Call
	 *
	 * Constraint:
	 *     (receiver=[Variable|ID] member+=[Operation|ID])
	 */
	protected void sequence_Call(ISerializationContext context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comopnent returns Comopnent
	 *
	 * Constraint:
	 *     (name=ID (ops+=[Operation|ID]* ops+=[Operation|ID])* operations+=Operation*)
	 */
	protected void sequence_Comopnent(ISerializationContext context, Comopnent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InstanceComp returns InstanceComp
	 *
	 * Constraint:
	 *     (name=ID type=[Comopnent|ID])
	 */
	protected void sequence_InstanceComp(ISerializationContext context, InstanceComp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.INSTANCE_COMP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.INSTANCE_COMP__NAME));
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.INSTANCE_COMP__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.INSTANCE_COMP__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstanceCompAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInstanceCompAccess().getTypeComopnentIDTerminalRuleCall_3_0_1(), semanticObject.eGet(MappingAssistancePackage.Literals.INSTANCE_COMP__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Mock returns Mock
	 *
	 * Constraint:
	 *     (service=[Variable|ID] member+=[Operation|ID] IntentionVar+=[Variable|ID])
	 */
	protected void sequence_Mock(ISerializationContext context, Mock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     function+=AbstractModel+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Observer returns Observer
	 *
	 * Constraint:
	 *     (
	 *         service1=[Variable|ID] 
	 *         member1=[Operation|ID] 
	 *         ((instVar+=[Variable|ID] varOp+=[Variable|ID])* instVar+=[Variable|ID] varOp+=[Variable|ID])* 
	 *         service2=[Variable|ID] 
	 *         member2=[Operation|ID]
	 *     )
	 */
	protected void sequence_Observer(ISerializationContext context, Observer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (name=ID (arg+=Variable* arg+=Variable)* type=Type)
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReplaceConf returns ReplaceConf
	 *
	 * Constraint:
	 *     (service=[Variable|ID] member=[Operation|ID] ((varConf+=[Variable|ID] instVar+=[Variable|ID])* varConf+=[Variable|ID] instVar+=[Variable|ID])*)
	 */
	protected void sequence_ReplaceConf(ISerializationContext context, ReplaceConf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TestDriver returns TestDriver
	 *
	 * Constraint:
	 *     (outVar+=[Variable|ID] testOp+=TestOP)*
	 */
	protected void sequence_TestDriver(ISerializationContext context, TestDriver semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TestOP returns TestOP
	 *
	 * Constraint:
	 *     (service=[Variable|ID] name=[Operation|ID] ((varConf1+=[Variable|ID] instVar+=[Variable|ID])* varConf1+=[Variable|ID] instVar+=[Variable|ID])*)
	 */
	protected void sequence_TestOP(ISerializationContext context, TestOP semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (name=ID type=Type)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, MappingAssistancePackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingAssistancePackage.Literals.VARIABLE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
}
