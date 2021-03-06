/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ArchitectureGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Model");
		private final Assignment cPackageAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPackageDomainDeclarationParserRuleCall_0 = (RuleCall)cPackageAssignment.eContents().get(0);
		
		//Model:
		//	package+=DomainDeclaration*;
		@Override public ParserRule getRule() { return rule; }
		
		//package+=DomainDeclaration*
		public Assignment getPackageAssignment() { return cPackageAssignment; }
		
		//DomainDeclaration
		public RuleCall getPackageDomainDeclarationParserRuleCall_0() { return cPackageDomainDeclarationParserRuleCall_0; }
	}
	public class DomainDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.DomainDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDomainKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsAbstractModelParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//DomainDeclaration:
		//	'domain' name=QualifiedName '{'
		//	elements+=AbstractModel*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'domain' name=QualifiedName '{' elements+=AbstractModel* '}'
		public Group getGroup() { return cGroup; }
		
		//'domain'
		public Keyword getDomainKeyword_0() { return cDomainKeyword_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//elements+=AbstractModel*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//AbstractModel
		public RuleCall getElementsAbstractModelParserRuleCall_3_0() { return cElementsAbstractModelParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class AbstractModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.AbstractModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImpImportParserRuleCall_0_0 = (RuleCall)cImpAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cCompAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cCompComponentParserRuleCall_1_0_0 = (RuleCall)cCompAssignment_1_0.eContents().get(0);
		private final Assignment cArchAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cArchArchitectureParserRuleCall_1_1_0 = (RuleCall)cArchAssignment_1_1.eContents().get(0);
		
		//AbstractModel:
		//	imp+=Import* (comp+=Component+ | arch+=Architecture);
		@Override public ParserRule getRule() { return rule; }
		
		//imp+=Import* (comp+=Component+ | arch+=Architecture)
		public Group getGroup() { return cGroup; }
		
		//imp+=Import*
		public Assignment getImpAssignment_0() { return cImpAssignment_0; }
		
		//Import
		public RuleCall getImpImportParserRuleCall_0_0() { return cImpImportParserRuleCall_0_0; }
		
		//comp+=Component+ | arch+=Architecture
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//comp+=Component+
		public Assignment getCompAssignment_1_0() { return cCompAssignment_1_0; }
		
		//Component
		public RuleCall getCompComponentParserRuleCall_1_0_0() { return cCompComponentParserRuleCall_1_0_0; }
		
		//arch+=Architecture
		public Assignment getArchAssignment_1_1() { return cArchAssignment_1_1; }
		
		//Architecture
		public RuleCall getArchArchitectureParserRuleCall_1_1_0() { return cArchArchitectureParserRuleCall_1_1_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	'import' importedNamespace=QualifiedNameWithWildcard;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importedNamespace=QualifiedNameWithWildcard
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0; }
	}
	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '.*'?
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class ComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Component");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cProvidedServicesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cGroup_5.eContents().get(0);
		private final Assignment cOpsAssignment_5_0_0 = (Assignment)cGroup_5_0.eContents().get(0);
		private final CrossReference cOpsOperationCrossReference_5_0_0_0 = (CrossReference)cOpsAssignment_5_0_0.eContents().get(0);
		private final RuleCall cOpsOperationIDTerminalRuleCall_5_0_0_0_1 = (RuleCall)cOpsOperationCrossReference_5_0_0_0.eContents().get(1);
		private final Keyword cCommaKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Assignment cOpsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cOpsOperationCrossReference_5_1_0 = (CrossReference)cOpsAssignment_5_1.eContents().get(0);
		private final RuleCall cOpsOperationIDTerminalRuleCall_5_1_0_1 = (RuleCall)cOpsOperationCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRequeredServicesKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cLeftParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Group cGroup_9_0 = (Group)cGroup_9.eContents().get(0);
		private final Assignment cOpsReqAssignment_9_0_0 = (Assignment)cGroup_9_0.eContents().get(0);
		private final CrossReference cOpsReqOperationCrossReference_9_0_0_0 = (CrossReference)cOpsReqAssignment_9_0_0.eContents().get(0);
		private final RuleCall cOpsReqOperationIDTerminalRuleCall_9_0_0_0_1 = (RuleCall)cOpsReqOperationCrossReference_9_0_0_0.eContents().get(1);
		private final Keyword cCommaKeyword_9_0_1 = (Keyword)cGroup_9_0.eContents().get(1);
		private final Assignment cOpsReqAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final CrossReference cOpsReqOperationCrossReference_9_1_0 = (CrossReference)cOpsReqAssignment_9_1.eContents().get(0);
		private final RuleCall cOpsReqOperationIDTerminalRuleCall_9_1_0_1 = (RuleCall)cOpsReqOperationCrossReference_9_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Assignment cOperationsAssignment_11_0 = (Assignment)cGroup_11.eContents().get(0);
		private final RuleCall cOperationsOperationParserRuleCall_11_0_0 = (RuleCall)cOperationsAssignment_11_0.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//Component:
		//	"Component:" name=ID "{"
		//	"providedServices" "(" ((ops+=[Operation] ",")* ops+=[Operation])* ")"
		//	"requeredServices" "(" ((opsReq+=[Operation] ",")* opsReq+=[Operation])* ")"
		//	-> (operations+=Operation)*
		//	//(vars+=Variable)*
		//	//"requiredService" "(" ((calls+=Call ",")*(calls+=Call))* ")"
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//"Component:" name=ID "{" "providedServices" "(" ((ops+=[Operation] ",")* ops+=[Operation])* ")" "requeredServices" "("
		//((opsReq+=[Operation] ",")* opsReq+=[Operation])* ")" -> (operations+=Operation)* //(vars+=Variable)*
		////"requiredService" "(" ((calls+=Call ",")*(calls+=Call))* ")"
		//"}"
		public Group getGroup() { return cGroup; }
		
		//"Component:"
		public Keyword getComponentKeyword_0() { return cComponentKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//"providedServices"
		public Keyword getProvidedServicesKeyword_3() { return cProvidedServicesKeyword_3; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//((ops+=[Operation] ",")* ops+=[Operation])*
		public Group getGroup_5() { return cGroup_5; }
		
		//(ops+=[Operation] ",")*
		public Group getGroup_5_0() { return cGroup_5_0; }
		
		//ops+=[Operation]
		public Assignment getOpsAssignment_5_0_0() { return cOpsAssignment_5_0_0; }
		
		//[Operation]
		public CrossReference getOpsOperationCrossReference_5_0_0_0() { return cOpsOperationCrossReference_5_0_0_0; }
		
		//ID
		public RuleCall getOpsOperationIDTerminalRuleCall_5_0_0_0_1() { return cOpsOperationIDTerminalRuleCall_5_0_0_0_1; }
		
		//","
		public Keyword getCommaKeyword_5_0_1() { return cCommaKeyword_5_0_1; }
		
		//ops+=[Operation]
		public Assignment getOpsAssignment_5_1() { return cOpsAssignment_5_1; }
		
		//[Operation]
		public CrossReference getOpsOperationCrossReference_5_1_0() { return cOpsOperationCrossReference_5_1_0; }
		
		//ID
		public RuleCall getOpsOperationIDTerminalRuleCall_5_1_0_1() { return cOpsOperationIDTerminalRuleCall_5_1_0_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
		
		//"requeredServices"
		public Keyword getRequeredServicesKeyword_7() { return cRequeredServicesKeyword_7; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_8() { return cLeftParenthesisKeyword_8; }
		
		//((opsReq+=[Operation] ",")* opsReq+=[Operation])*
		public Group getGroup_9() { return cGroup_9; }
		
		//(opsReq+=[Operation] ",")*
		public Group getGroup_9_0() { return cGroup_9_0; }
		
		//opsReq+=[Operation]
		public Assignment getOpsReqAssignment_9_0_0() { return cOpsReqAssignment_9_0_0; }
		
		//[Operation]
		public CrossReference getOpsReqOperationCrossReference_9_0_0_0() { return cOpsReqOperationCrossReference_9_0_0_0; }
		
		//ID
		public RuleCall getOpsReqOperationIDTerminalRuleCall_9_0_0_0_1() { return cOpsReqOperationIDTerminalRuleCall_9_0_0_0_1; }
		
		//","
		public Keyword getCommaKeyword_9_0_1() { return cCommaKeyword_9_0_1; }
		
		//opsReq+=[Operation]
		public Assignment getOpsReqAssignment_9_1() { return cOpsReqAssignment_9_1; }
		
		//[Operation]
		public CrossReference getOpsReqOperationCrossReference_9_1_0() { return cOpsReqOperationCrossReference_9_1_0; }
		
		//ID
		public RuleCall getOpsReqOperationIDTerminalRuleCall_9_1_0_1() { return cOpsReqOperationIDTerminalRuleCall_9_1_0_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_10() { return cRightParenthesisKeyword_10; }
		
		//-> (operations+=Operation)*
		public Group getGroup_11() { return cGroup_11; }
		
		//operations+=Operation
		public Assignment getOperationsAssignment_11_0() { return cOperationsAssignment_11_0; }
		
		//Operation
		public RuleCall getOperationsOperationParserRuleCall_11_0_0() { return cOperationsOperationParserRuleCall_11_0_0; }
		
		////(vars+=Variable)*
		////"requiredService" "(" ((calls+=Call ",")*(calls+=Call))* ")"
		//"}"
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
	}
	public class ArchitectureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Architecture");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cArchitectureAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cArchitectureDefinitionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cDefKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVarsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVarsVariableParserRuleCall_2_1_0 = (RuleCall)cVarsAssignment_2_1.eContents().get(0);
		private final Assignment cBindAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBindBindingParserRuleCall_3_0 = (RuleCall)cBindAssignment_3.eContents().get(0);
		
		//Architecture:
		//	{Architecture} "ArchitectureDefinition" ("def" vars+=Variable)*
		//	bind+=Binding*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Architecture} "ArchitectureDefinition" ("def" vars+=Variable)* bind+=Binding*
		public Group getGroup() { return cGroup; }
		
		//{Architecture}
		public Action getArchitectureAction_0() { return cArchitectureAction_0; }
		
		//"ArchitectureDefinition"
		public Keyword getArchitectureDefinitionKeyword_1() { return cArchitectureDefinitionKeyword_1; }
		
		//("def" vars+=Variable)*
		public Group getGroup_2() { return cGroup_2; }
		
		//"def"
		public Keyword getDefKeyword_2_0() { return cDefKeyword_2_0; }
		
		//vars+=Variable
		public Assignment getVarsAssignment_2_1() { return cVarsAssignment_2_1; }
		
		//Variable
		public RuleCall getVarsVariableParserRuleCall_2_1_0() { return cVarsVariableParserRuleCall_2_1_0; }
		
		//bind+=Binding*
		public Assignment getBindAssignment_3() { return cBindAssignment_3; }
		
		//Binding
		public RuleCall getBindBindingParserRuleCall_3_0() { return cBindBindingParserRuleCall_3_0; }
	}
	public class BindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Binding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBindKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cProviderAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cProviderVariableCrossReference_1_0 = (CrossReference)cProviderAssignment_1.eContents().get(0);
		private final RuleCall cProviderVariableIDTerminalRuleCall_1_0_1 = (RuleCall)cProviderVariableCrossReference_1_0.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cProMemberAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cProMemberOperationCrossReference_3_0 = (CrossReference)cProMemberAssignment_3.eContents().get(0);
		private final RuleCall cProMemberOperationIDTerminalRuleCall_3_0_1 = (RuleCall)cProMemberOperationCrossReference_3_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cReceiverAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cReceiverVariableCrossReference_5_0 = (CrossReference)cReceiverAssignment_5.eContents().get(0);
		private final RuleCall cReceiverVariableIDTerminalRuleCall_5_0_1 = (RuleCall)cReceiverVariableCrossReference_5_0.eContents().get(1);
		private final Keyword cFullStopKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cRecMemberAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cRecMemberOperationCrossReference_7_0 = (CrossReference)cRecMemberAssignment_7.eContents().get(0);
		private final RuleCall cRecMemberOperationIDTerminalRuleCall_7_0_1 = (RuleCall)cRecMemberOperationCrossReference_7_0.eContents().get(1);
		
		//Binding:
		//	"bind" provider=[Variable] '.' proMember=[Operation] "-" receiver=[Variable] '.' recMember=[Operation];
		@Override public ParserRule getRule() { return rule; }
		
		//"bind" provider=[Variable] '.' proMember=[Operation] "-" receiver=[Variable] '.' recMember=[Operation]
		public Group getGroup() { return cGroup; }
		
		//"bind"
		public Keyword getBindKeyword_0() { return cBindKeyword_0; }
		
		//provider=[Variable]
		public Assignment getProviderAssignment_1() { return cProviderAssignment_1; }
		
		//[Variable]
		public CrossReference getProviderVariableCrossReference_1_0() { return cProviderVariableCrossReference_1_0; }
		
		//ID
		public RuleCall getProviderVariableIDTerminalRuleCall_1_0_1() { return cProviderVariableIDTerminalRuleCall_1_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//proMember=[Operation]
		public Assignment getProMemberAssignment_3() { return cProMemberAssignment_3; }
		
		//[Operation]
		public CrossReference getProMemberOperationCrossReference_3_0() { return cProMemberOperationCrossReference_3_0; }
		
		//ID
		public RuleCall getProMemberOperationIDTerminalRuleCall_3_0_1() { return cProMemberOperationIDTerminalRuleCall_3_0_1; }
		
		//"-"
		public Keyword getHyphenMinusKeyword_4() { return cHyphenMinusKeyword_4; }
		
		//receiver=[Variable]
		public Assignment getReceiverAssignment_5() { return cReceiverAssignment_5; }
		
		//[Variable]
		public CrossReference getReceiverVariableCrossReference_5_0() { return cReceiverVariableCrossReference_5_0; }
		
		//ID
		public RuleCall getReceiverVariableIDTerminalRuleCall_5_0_1() { return cReceiverVariableIDTerminalRuleCall_5_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_6() { return cFullStopKeyword_6; }
		
		//recMember=[Operation]
		public Assignment getRecMemberAssignment_7() { return cRecMemberAssignment_7; }
		
		//[Operation]
		public CrossReference getRecMemberOperationCrossReference_7_0() { return cRecMemberOperationCrossReference_7_0; }
		
		//ID
		public RuleCall getRecMemberOperationIDTerminalRuleCall_7_0_1() { return cRecMemberOperationIDTerminalRuleCall_7_0_1; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeAtomicTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//Variable:
		//	name=ID ":" type=AtomicType;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ":" type=AtomicType
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=AtomicType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//AtomicType
		public RuleCall getTypeAtomicTypeParserRuleCall_2_0() { return cTypeAtomicTypeParserRuleCall_2_0; }
	}
	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Operation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cGroup_3.eContents().get(0);
		private final Assignment cArgAssignment_3_0_0 = (Assignment)cGroup_3_0.eContents().get(0);
		private final RuleCall cArgVariableParserRuleCall_3_0_0_0 = (RuleCall)cArgAssignment_3_0_0.eContents().get(0);
		private final Keyword cCommaKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cArgAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cArgVariableParserRuleCall_3_1_0 = (RuleCall)cArgAssignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cTypeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTypeAtomicTypeParserRuleCall_6_0 = (RuleCall)cTypeAssignment_6.eContents().get(0);
		
		//Operation:
		//	"def" name=ID "(" ((arg+=Variable ",")* arg+=Variable)* ")" ":" type=AtomicType;
		@Override public ParserRule getRule() { return rule; }
		
		//"def" name=ID "(" ((arg+=Variable ",")* arg+=Variable)* ")" ":" type=AtomicType
		public Group getGroup() { return cGroup; }
		
		//"def"
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//((arg+=Variable ",")* arg+=Variable)*
		public Group getGroup_3() { return cGroup_3; }
		
		//(arg+=Variable ",")*
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//arg+=Variable
		public Assignment getArgAssignment_3_0_0() { return cArgAssignment_3_0_0; }
		
		//Variable
		public RuleCall getArgVariableParserRuleCall_3_0_0_0() { return cArgVariableParserRuleCall_3_0_0_0; }
		
		//","
		public Keyword getCommaKeyword_3_0_1() { return cCommaKeyword_3_0_1; }
		
		//arg+=Variable
		public Assignment getArgAssignment_3_1() { return cArgAssignment_3_1; }
		
		//Variable
		public RuleCall getArgVariableParserRuleCall_3_1_0() { return cArgVariableParserRuleCall_3_1_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//":"
		public Keyword getColonKeyword_5() { return cColonKeyword_5; }
		
		//type=AtomicType
		public Assignment getTypeAssignment_6() { return cTypeAssignment_6; }
		
		//AtomicType
		public RuleCall getTypeAtomicTypeParserRuleCall_6_0() { return cTypeAtomicTypeParserRuleCall_6_0; }
	}
	public class AtomicTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.AtomicType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cAtomTypeAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cAtomTypeTypeEnumRuleCall_0_0 = (RuleCall)cAtomTypeAssignment_0.eContents().get(0);
		private final Assignment cCompTypeAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final CrossReference cCompTypeComponentCrossReference_1_0 = (CrossReference)cCompTypeAssignment_1.eContents().get(0);
		private final RuleCall cCompTypeComponentIDTerminalRuleCall_1_0_1 = (RuleCall)cCompTypeComponentCrossReference_1_0.eContents().get(1);
		
		//AtomicType:
		//	atomType=Type | compType=[Component];
		@Override public ParserRule getRule() { return rule; }
		
		//atomType=Type | compType=[Component]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//atomType=Type
		public Assignment getAtomTypeAssignment_0() { return cAtomTypeAssignment_0; }
		
		//Type
		public RuleCall getAtomTypeTypeEnumRuleCall_0_0() { return cAtomTypeTypeEnumRuleCall_0_0; }
		
		//compType=[Component]
		public Assignment getCompTypeAssignment_1() { return cCompTypeAssignment_1; }
		
		//[Component]
		public CrossReference getCompTypeComponentCrossReference_1_0() { return cCompTypeComponentCrossReference_1_0; }
		
		//ID
		public RuleCall getCompTypeComponentIDTerminalRuleCall_1_0_1() { return cCompTypeComponentIDTerminalRuleCall_1_0_1; }
	}
	
	public class TypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.architecture.Architecture.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINTINTKeyword_0_0 = (Keyword)cINTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSTRINGEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSTRINGSTRINGKeyword_1_0 = (Keyword)cSTRINGEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBooleanEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBooleanBooleanKeyword_2_0 = (Keyword)cBooleanEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cDoubleEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cDoubleDoubleKeyword_3_0 = (Keyword)cDoubleEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cVoidEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cVoidVoidKeyword_4_0 = (Keyword)cVoidEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum Type:
		//	INT | STRING | Boolean | Double | Void;
		public EnumRule getRule() { return rule; }
		
		//INT | STRING | Boolean | Double | Void
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INT
		public EnumLiteralDeclaration getINTEnumLiteralDeclaration_0() { return cINTEnumLiteralDeclaration_0; }
		
		//"INT"
		public Keyword getINTINTKeyword_0_0() { return cINTINTKeyword_0_0; }
		
		//STRING
		public EnumLiteralDeclaration getSTRINGEnumLiteralDeclaration_1() { return cSTRINGEnumLiteralDeclaration_1; }
		
		//"STRING"
		public Keyword getSTRINGSTRINGKeyword_1_0() { return cSTRINGSTRINGKeyword_1_0; }
		
		//Boolean
		public EnumLiteralDeclaration getBooleanEnumLiteralDeclaration_2() { return cBooleanEnumLiteralDeclaration_2; }
		
		//"Boolean"
		public Keyword getBooleanBooleanKeyword_2_0() { return cBooleanBooleanKeyword_2_0; }
		
		//Double
		public EnumLiteralDeclaration getDoubleEnumLiteralDeclaration_3() { return cDoubleEnumLiteralDeclaration_3; }
		
		//"Double"
		public Keyword getDoubleDoubleKeyword_3_0() { return cDoubleDoubleKeyword_3_0; }
		
		//Void
		public EnumLiteralDeclaration getVoidEnumLiteralDeclaration_4() { return cVoidEnumLiteralDeclaration_4; }
		
		//"Void"
		public Keyword getVoidVoidKeyword_4_0() { return cVoidVoidKeyword_4_0; }
	}
	
	private final ModelElements pModel;
	private final DomainDeclarationElements pDomainDeclaration;
	private final AbstractModelElements pAbstractModel;
	private final ImportElements pImport;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final QualifiedNameElements pQualifiedName;
	private final ComponentElements pComponent;
	private final ArchitectureElements pArchitecture;
	private final BindingElements pBinding;
	private final VariableElements pVariable;
	private final OperationElements pOperation;
	private final AtomicTypeElements pAtomicType;
	private final TypeElements eType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ArchitectureGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pDomainDeclaration = new DomainDeclarationElements();
		this.pAbstractModel = new AbstractModelElements();
		this.pImport = new ImportElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pComponent = new ComponentElements();
		this.pArchitecture = new ArchitectureElements();
		this.pBinding = new BindingElements();
		this.pVariable = new VariableElements();
		this.pOperation = new OperationElements();
		this.pAtomicType = new AtomicTypeElements();
		this.eType = new TypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.aelos.xtext.architecture.Architecture".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	package+=DomainDeclaration*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//DomainDeclaration:
	//	'domain' name=QualifiedName '{'
	//	elements+=AbstractModel*
	//	'}';
	public DomainDeclarationElements getDomainDeclarationAccess() {
		return pDomainDeclaration;
	}
	
	public ParserRule getDomainDeclarationRule() {
		return getDomainDeclarationAccess().getRule();
	}
	
	//AbstractModel:
	//	imp+=Import* (comp+=Component+ | arch+=Architecture);
	public AbstractModelElements getAbstractModelAccess() {
		return pAbstractModel;
	}
	
	public ParserRule getAbstractModelRule() {
		return getAbstractModelAccess().getRule();
	}
	
	//Import:
	//	'import' importedNamespace=QualifiedNameWithWildcard;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	QualifiedName '.*'?;
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return pQualifiedNameWithWildcard;
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Component:
	//	"Component:" name=ID "{"
	//	"providedServices" "(" ((ops+=[Operation] ",")* ops+=[Operation])* ")"
	//	"requeredServices" "(" ((opsReq+=[Operation] ",")* opsReq+=[Operation])* ")"
	//	-> (operations+=Operation)*
	//	//(vars+=Variable)*
	//	//"requiredService" "(" ((calls+=Call ",")*(calls+=Call))* ")"
	//	"}";
	public ComponentElements getComponentAccess() {
		return pComponent;
	}
	
	public ParserRule getComponentRule() {
		return getComponentAccess().getRule();
	}
	
	//Architecture:
	//	{Architecture} "ArchitectureDefinition" ("def" vars+=Variable)*
	//	bind+=Binding*;
	public ArchitectureElements getArchitectureAccess() {
		return pArchitecture;
	}
	
	public ParserRule getArchitectureRule() {
		return getArchitectureAccess().getRule();
	}
	
	//Binding:
	//	"bind" provider=[Variable] '.' proMember=[Operation] "-" receiver=[Variable] '.' recMember=[Operation];
	public BindingElements getBindingAccess() {
		return pBinding;
	}
	
	public ParserRule getBindingRule() {
		return getBindingAccess().getRule();
	}
	
	//Variable:
	//	name=ID ":" type=AtomicType;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//Operation:
	//	"def" name=ID "(" ((arg+=Variable ",")* arg+=Variable)* ")" ":" type=AtomicType;
	public OperationElements getOperationAccess() {
		return pOperation;
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}
	
	//AtomicType:
	//	atomType=Type | compType=[Component];
	public AtomicTypeElements getAtomicTypeAccess() {
		return pAtomicType;
	}
	
	public ParserRule getAtomicTypeRule() {
		return getAtomicTypeAccess().getRule();
	}
	
	//enum Type:
	//	INT | STRING | Boolean | Double | Void;
	public TypeElements getTypeAccess() {
		return eType;
	}
	
	public EnumRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
