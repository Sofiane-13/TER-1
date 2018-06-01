/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.testintentionsassistance.serializer;

import com.aelos.xtext.testintentionsassistance.services.TestintentionsAssistanceGrammarAccess;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.And;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Comparison;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Data;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.DomainDeclaration;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Equality;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Function;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.INT;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Import;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Inst;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Minus;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Model;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.MulOrDiv;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Not;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Or;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.OutVariable;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Plus;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.STRING;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestIntention;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.TestintentionsAssistancePackage;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable;
import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.VariableRef;
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
public class TestintentionsAssistanceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TestintentionsAssistanceGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TestintentionsAssistancePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TestintentionsAssistancePackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.BOOLEAN:
				sequence_Atomic(context, (com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Boolean) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.COMPARISON:
				sequence_Comparison(context, (Comparison) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.DATA:
				sequence_Data(context, (Data) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.DOMAIN_DECLARATION:
				sequence_DomainDeclaration(context, (DomainDeclaration) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.DOUBLE:
				sequence_Atomic(context, (com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Double) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.EQUALITY:
				sequence_Equality(context, (Equality) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.INT:
				sequence_Atomic(context, (INT) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.INST:
				sequence_Inst(context, (Inst) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.MINUS:
				sequence_PlusOrMinus(context, (Minus) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.MUL_OR_DIV:
				sequence_MulOrDiv(context, (MulOrDiv) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.NOT:
				sequence_Primary(context, (Not) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.OUT_VARIABLE:
				sequence_OutVariable(context, (OutVariable) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.PLUS:
				sequence_PlusOrMinus(context, (Plus) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.STRING:
				sequence_Atomic(context, (STRING) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.TEST_INTENTION:
				sequence_TestIntention(context, (TestIntention) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case TestintentionsAssistancePackage.VARIABLE_REF:
				sequence_Atomic(context, (VariableRef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns And
	 *     Or returns And
	 *     Or.Or_1_0 returns And
	 *     And returns And
	 *     And.And_1_0 returns And
	 *     Equality returns And
	 *     Equality.Equality_1_0 returns And
	 *     Comparison returns And
	 *     Comparison.Comparison_1_0 returns And
	 *     PlusOrMinus returns And
	 *     PlusOrMinus.Plus_1_0_0_0 returns And
	 *     PlusOrMinus.Minus_1_0_1_0 returns And
	 *     MulOrDiv returns And
	 *     MulOrDiv.MulOrDiv_1_0 returns And
	 *     Primary returns And
	 *
	 * Constraint:
	 *     (left=And_And_1_0 right=Equality)
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.AND__LEFT));
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.AND__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Boolean
	 *     Or returns Boolean
	 *     Or.Or_1_0 returns Boolean
	 *     And returns Boolean
	 *     And.And_1_0 returns Boolean
	 *     Equality returns Boolean
	 *     Equality.Equality_1_0 returns Boolean
	 *     Comparison returns Boolean
	 *     Comparison.Comparison_1_0 returns Boolean
	 *     PlusOrMinus returns Boolean
	 *     PlusOrMinus.Plus_1_0_0_0 returns Boolean
	 *     PlusOrMinus.Minus_1_0_1_0 returns Boolean
	 *     MulOrDiv returns Boolean
	 *     MulOrDiv.MulOrDiv_1_0 returns Boolean
	 *     Primary returns Boolean
	 *     Atomic returns Boolean
	 *
	 * Constraint:
	 *     value=Boolean
	 */
	protected void sequence_Atomic(ISerializationContext context, com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Boolean semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.BOOLEAN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.BOOLEAN__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueBooleanParserRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Double
	 *     Or returns Double
	 *     Or.Or_1_0 returns Double
	 *     And returns Double
	 *     And.And_1_0 returns Double
	 *     Equality returns Double
	 *     Equality.Equality_1_0 returns Double
	 *     Comparison returns Double
	 *     Comparison.Comparison_1_0 returns Double
	 *     PlusOrMinus returns Double
	 *     PlusOrMinus.Plus_1_0_0_0 returns Double
	 *     PlusOrMinus.Minus_1_0_1_0 returns Double
	 *     MulOrDiv returns Double
	 *     MulOrDiv.MulOrDiv_1_0 returns Double
	 *     Primary returns Double
	 *     Atomic returns Double
	 *
	 * Constraint:
	 *     value=Double
	 */
	protected void sequence_Atomic(ISerializationContext context, com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Double semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.DOUBLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.DOUBLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueDoubleParserRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns INT
	 *     Or returns INT
	 *     Or.Or_1_0 returns INT
	 *     And returns INT
	 *     And.And_1_0 returns INT
	 *     Equality returns INT
	 *     Equality.Equality_1_0 returns INT
	 *     Comparison returns INT
	 *     Comparison.Comparison_1_0 returns INT
	 *     PlusOrMinus returns INT
	 *     PlusOrMinus.Plus_1_0_0_0 returns INT
	 *     PlusOrMinus.Minus_1_0_1_0 returns INT
	 *     MulOrDiv returns INT
	 *     MulOrDiv.MulOrDiv_1_0 returns INT
	 *     Primary returns INT
	 *     Atomic returns INT
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Atomic(ISerializationContext context, INT semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.INT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.INT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns STRING
	 *     Or returns STRING
	 *     Or.Or_1_0 returns STRING
	 *     And returns STRING
	 *     And.And_1_0 returns STRING
	 *     Equality returns STRING
	 *     Equality.Equality_1_0 returns STRING
	 *     Comparison returns STRING
	 *     Comparison.Comparison_1_0 returns STRING
	 *     PlusOrMinus returns STRING
	 *     PlusOrMinus.Plus_1_0_0_0 returns STRING
	 *     PlusOrMinus.Minus_1_0_1_0 returns STRING
	 *     MulOrDiv returns STRING
	 *     MulOrDiv.MulOrDiv_1_0 returns STRING
	 *     Primary returns STRING
	 *     Atomic returns STRING
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Atomic(ISerializationContext context, STRING semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.STRING__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns VariableRef
	 *     Or returns VariableRef
	 *     Or.Or_1_0 returns VariableRef
	 *     And returns VariableRef
	 *     And.And_1_0 returns VariableRef
	 *     Equality returns VariableRef
	 *     Equality.Equality_1_0 returns VariableRef
	 *     Comparison returns VariableRef
	 *     Comparison.Comparison_1_0 returns VariableRef
	 *     PlusOrMinus returns VariableRef
	 *     PlusOrMinus.Plus_1_0_0_0 returns VariableRef
	 *     PlusOrMinus.Minus_1_0_1_0 returns VariableRef
	 *     MulOrDiv returns VariableRef
	 *     MulOrDiv.MulOrDiv_1_0 returns VariableRef
	 *     Primary returns VariableRef
	 *     Atomic returns VariableRef
	 *
	 * Constraint:
	 *     variable=[Variable|ID]
	 */
	protected void sequence_Atomic(ISerializationContext context, VariableRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.VARIABLE_REF__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.VARIABLE_REF__VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_4_1_0_1(), semanticObject.eGet(TestintentionsAssistancePackage.Literals.VARIABLE_REF__VARIABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Comparison
	 *     Or returns Comparison
	 *     Or.Or_1_0 returns Comparison
	 *     And returns Comparison
	 *     And.And_1_0 returns Comparison
	 *     Equality returns Comparison
	 *     Equality.Equality_1_0 returns Comparison
	 *     Comparison returns Comparison
	 *     Comparison.Comparison_1_0 returns Comparison
	 *     PlusOrMinus returns Comparison
	 *     PlusOrMinus.Plus_1_0_0_0 returns Comparison
	 *     PlusOrMinus.Minus_1_0_1_0 returns Comparison
	 *     MulOrDiv returns Comparison
	 *     MulOrDiv.MulOrDiv_1_0 returns Comparison
	 *     Primary returns Comparison
	 *
	 * Constraint:
	 *     (left=Comparison_Comparison_1_0 (op='≥' | op='≤' | op='>' | op='<') right=PlusOrMinus)
	 */
	protected void sequence_Comparison(ISerializationContext context, Comparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns Data
	 *     Data returns Data
	 *
	 * Constraint:
	 *     (inst+=Inst+ | inst+=Inst)?
	 */
	protected void sequence_Data(ISerializationContext context, Data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainDeclaration returns DomainDeclaration
	 *     AbstractElement returns DomainDeclaration
	 *
	 * Constraint:
	 *     (name=QualifiedName elements+=AbstractElement*)
	 */
	protected void sequence_DomainDeclaration(ISerializationContext context, DomainDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Equality
	 *     Or returns Equality
	 *     Or.Or_1_0 returns Equality
	 *     And returns Equality
	 *     And.And_1_0 returns Equality
	 *     Equality returns Equality
	 *     Equality.Equality_1_0 returns Equality
	 *     Comparison returns Equality
	 *     Comparison.Comparison_1_0 returns Equality
	 *     PlusOrMinus returns Equality
	 *     PlusOrMinus.Plus_1_0_0_0 returns Equality
	 *     PlusOrMinus.Minus_1_0_1_0 returns Equality
	 *     MulOrDiv returns Equality
	 *     MulOrDiv.MulOrDiv_1_0 returns Equality
	 *     Primary returns Equality
	 *
	 * Constraint:
	 *     (left=Equality_Equality_1_0 (op='=' | op='<>') right=Comparison)
	 */
	protected void sequence_Equality(ISerializationContext context, Equality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns Function
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (out+=OutVariable out+=OutVariable* methode=ID arg+=[Variable|ID]* arg1=[Variable|ID])
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *     AbstractElement returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Inst returns Inst
	 *
	 * Constraint:
	 *     (variable+=Variable valeur+=Atomic)
	 */
	protected void sequence_Inst(ISerializationContext context, Inst semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     elements+=DomainDeclaration+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns MulOrDiv
	 *     Or returns MulOrDiv
	 *     Or.Or_1_0 returns MulOrDiv
	 *     And returns MulOrDiv
	 *     And.And_1_0 returns MulOrDiv
	 *     Equality returns MulOrDiv
	 *     Equality.Equality_1_0 returns MulOrDiv
	 *     Comparison returns MulOrDiv
	 *     Comparison.Comparison_1_0 returns MulOrDiv
	 *     PlusOrMinus returns MulOrDiv
	 *     PlusOrMinus.Plus_1_0_0_0 returns MulOrDiv
	 *     PlusOrMinus.Minus_1_0_1_0 returns MulOrDiv
	 *     MulOrDiv returns MulOrDiv
	 *     MulOrDiv.MulOrDiv_1_0 returns MulOrDiv
	 *     Primary returns MulOrDiv
	 *
	 * Constraint:
	 *     (left=MulOrDiv_MulOrDiv_1_0 (op='*' | op='/') right=Primary)
	 */
	protected void sequence_MulOrDiv(ISerializationContext context, MulOrDiv semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Or
	 *     Or returns Or
	 *     Or.Or_1_0 returns Or
	 *     And returns Or
	 *     And.And_1_0 returns Or
	 *     Equality returns Or
	 *     Equality.Equality_1_0 returns Or
	 *     Comparison returns Or
	 *     Comparison.Comparison_1_0 returns Or
	 *     PlusOrMinus returns Or
	 *     PlusOrMinus.Plus_1_0_0_0 returns Or
	 *     PlusOrMinus.Minus_1_0_1_0 returns Or
	 *     MulOrDiv returns Or
	 *     MulOrDiv.MulOrDiv_1_0 returns Or
	 *     Primary returns Or
	 *
	 * Constraint:
	 *     (left=Or_Or_1_0 right=And)
	 */
	protected void sequence_Or(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.OR__LEFT));
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.OR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OutVariable returns OutVariable
	 *
	 * Constraint:
	 *     (name=ID type=Type)
	 */
	protected void sequence_OutVariable(ISerializationContext context, OutVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.OUT_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.OUT_VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.OUT_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.OUT_VARIABLE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOutVariableAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOutVariableAccess().getTypeTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Minus
	 *     Or returns Minus
	 *     Or.Or_1_0 returns Minus
	 *     And returns Minus
	 *     And.And_1_0 returns Minus
	 *     Equality returns Minus
	 *     Equality.Equality_1_0 returns Minus
	 *     Comparison returns Minus
	 *     Comparison.Comparison_1_0 returns Minus
	 *     PlusOrMinus returns Minus
	 *     PlusOrMinus.Plus_1_0_0_0 returns Minus
	 *     PlusOrMinus.Minus_1_0_1_0 returns Minus
	 *     MulOrDiv returns Minus
	 *     MulOrDiv.MulOrDiv_1_0 returns Minus
	 *     Primary returns Minus
	 *
	 * Constraint:
	 *     (left=PlusOrMinus_Minus_1_0_1_0 right=MulOrDiv)
	 */
	protected void sequence_PlusOrMinus(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Plus
	 *     Or returns Plus
	 *     Or.Or_1_0 returns Plus
	 *     And returns Plus
	 *     And.And_1_0 returns Plus
	 *     Equality returns Plus
	 *     Equality.Equality_1_0 returns Plus
	 *     Comparison returns Plus
	 *     Comparison.Comparison_1_0 returns Plus
	 *     PlusOrMinus returns Plus
	 *     PlusOrMinus.Plus_1_0_0_0 returns Plus
	 *     PlusOrMinus.Minus_1_0_1_0 returns Plus
	 *     MulOrDiv returns Plus
	 *     MulOrDiv.MulOrDiv_1_0 returns Plus
	 *     Primary returns Plus
	 *
	 * Constraint:
	 *     (left=PlusOrMinus_Plus_1_0_0_0 right=MulOrDiv)
	 */
	protected void sequence_PlusOrMinus(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Not
	 *     Or returns Not
	 *     Or.Or_1_0 returns Not
	 *     And returns Not
	 *     And.And_1_0 returns Not
	 *     Equality returns Not
	 *     Equality.Equality_1_0 returns Not
	 *     Comparison returns Not
	 *     Comparison.Comparison_1_0 returns Not
	 *     PlusOrMinus returns Not
	 *     PlusOrMinus.Plus_1_0_0_0 returns Not
	 *     PlusOrMinus.Minus_1_0_1_0 returns Not
	 *     MulOrDiv returns Not
	 *     MulOrDiv.MulOrDiv_1_0 returns Not
	 *     Primary returns Not
	 *
	 * Constraint:
	 *     expression=Primary
	 */
	protected void sequence_Primary(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.NOT__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns TestIntention
	 *     TestIntention returns TestIntention
	 *
	 * Constraint:
	 *     (description=STRING expression+=Expression outvar=[OutVariable|ID] expression+=Expression)
	 */
	protected void sequence_TestIntention(ISerializationContext context, TestIntention semanticObject) {
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
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, TestintentionsAssistancePackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestintentionsAssistancePackage.Literals.VARIABLE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
}
