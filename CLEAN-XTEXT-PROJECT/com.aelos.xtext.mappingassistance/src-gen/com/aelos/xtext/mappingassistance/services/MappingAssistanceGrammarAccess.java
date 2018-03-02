/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.mappingassistance.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MappingAssistanceGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.Model");
		private final Assignment cFunctionAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFunctionAbstractModelParserRuleCall_0 = (RuleCall)cFunctionAssignment.eContents().get(0);
		
		//Model:
		//	function+=AbstractModel*;
		@Override public ParserRule getRule() { return rule; }
		
		//function+=AbstractModel*
		public Assignment getFunctionAssignment() { return cFunctionAssignment; }
		
		//AbstractModel
		public RuleCall getFunctionAbstractModelParserRuleCall_0() { return cFunctionAbstractModelParserRuleCall_0; }
	}
	public class AbstractModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.AbstractModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cImportParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cObsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cObsObserveursParserRuleCall_1_0 = (RuleCall)cObsAssignment_1.eContents().get(0);
		private final Assignment cMockAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMockMocksParserRuleCall_2_0 = (RuleCall)cMockAssignment_2.eContents().get(0);
		private final Assignment cTestedservAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTestedservTestedserviceParserRuleCall_3_0 = (RuleCall)cTestedservAssignment_3.eContents().get(0);
		private final Assignment cTestedcompAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTestedcompTestedcomposantParserRuleCall_4_0 = (RuleCall)cTestedcompAssignment_4.eContents().get(0);
		
		//AbstractModel:
		//	Import obs+=Observeurs* mock+=Mocks* testedserv+=Testedservice+ testedcomp+=Testedcomposant;
		@Override public ParserRule getRule() { return rule; }
		
		//Import obs+=Observeurs* mock+=Mocks* testedserv+=Testedservice+ testedcomp+=Testedcomposant
		public Group getGroup() { return cGroup; }
		
		//Import
		public RuleCall getImportParserRuleCall_0() { return cImportParserRuleCall_0; }
		
		//obs+=Observeurs*
		public Assignment getObsAssignment_1() { return cObsAssignment_1; }
		
		//Observeurs
		public RuleCall getObsObserveursParserRuleCall_1_0() { return cObsObserveursParserRuleCall_1_0; }
		
		//mock+=Mocks*
		public Assignment getMockAssignment_2() { return cMockAssignment_2; }
		
		//Mocks
		public RuleCall getMockMocksParserRuleCall_2_0() { return cMockMocksParserRuleCall_2_0; }
		
		//testedserv+=Testedservice+
		public Assignment getTestedservAssignment_3() { return cTestedservAssignment_3; }
		
		//Testedservice
		public RuleCall getTestedservTestedserviceParserRuleCall_3_0() { return cTestedservTestedserviceParserRuleCall_3_0; }
		
		//testedcomp+=Testedcomposant
		public Assignment getTestedcompAssignment_4() { return cTestedcompAssignment_4; }
		
		//Testedcomposant
		public RuleCall getTestedcompTestedcomposantParserRuleCall_4_0() { return cTestedcompTestedcomposantParserRuleCall_4_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.Import");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.QualifiedNameWithWildcard");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.QualifiedName");
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
	public class TestedcomposantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.Testedcomposant");
		private final Assignment cNameCompAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cNameCompInstanceCompCrossReference_0 = (CrossReference)cNameCompAssignment.eContents().get(0);
		private final RuleCall cNameCompInstanceCompIDTerminalRuleCall_0_1 = (RuleCall)cNameCompInstanceCompCrossReference_0.eContents().get(1);
		
		//Testedcomposant:
		//	nameComp+=[InstanceComp];
		@Override public ParserRule getRule() { return rule; }
		
		//nameComp+=[InstanceComp]
		public Assignment getNameCompAssignment() { return cNameCompAssignment; }
		
		//[InstanceComp]
		public CrossReference getNameCompInstanceCompCrossReference_0() { return cNameCompInstanceCompCrossReference_0; }
		
		//ID
		public RuleCall getNameCompInstanceCompIDTerminalRuleCall_0_1() { return cNameCompInstanceCompIDTerminalRuleCall_0_1; }
	}
	public class TestedserviceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.Testedservice");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameCompAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cNameCompInstanceCompCrossReference_0_0 = (CrossReference)cNameCompAssignment_0.eContents().get(0);
		private final RuleCall cNameCompInstanceCompIDTerminalRuleCall_0_0_1 = (RuleCall)cNameCompInstanceCompCrossReference_0_0.eContents().get(1);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameServ1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cNameServ1ServiceNameCrossReference_2_0 = (CrossReference)cNameServ1Assignment_2.eContents().get(0);
		private final RuleCall cNameServ1ServiceNameIDTerminalRuleCall_2_0_1 = (RuleCall)cNameServ1ServiceNameCrossReference_2_0.eContents().get(1);
		
		//Testedservice:
		//	nameComp+=[InstanceComp] '.' nameServ1+=[ServiceName];
		@Override public ParserRule getRule() { return rule; }
		
		//nameComp+=[InstanceComp] '.' nameServ1+=[ServiceName]
		public Group getGroup() { return cGroup; }
		
		//nameComp+=[InstanceComp]
		public Assignment getNameCompAssignment_0() { return cNameCompAssignment_0; }
		
		//[InstanceComp]
		public CrossReference getNameCompInstanceCompCrossReference_0_0() { return cNameCompInstanceCompCrossReference_0_0; }
		
		//ID
		public RuleCall getNameCompInstanceCompIDTerminalRuleCall_0_0_1() { return cNameCompInstanceCompIDTerminalRuleCall_0_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//nameServ1+=[ServiceName]
		public Assignment getNameServ1Assignment_2() { return cNameServ1Assignment_2; }
		
		//[ServiceName]
		public CrossReference getNameServ1ServiceNameCrossReference_2_0() { return cNameServ1ServiceNameCrossReference_2_0; }
		
		//ID
		public RuleCall getNameServ1ServiceNameIDTerminalRuleCall_2_0_1() { return cNameServ1ServiceNameIDTerminalRuleCall_2_0_1; }
	}
	public class MappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.Mapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameVarModeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cNameVarModeVariableCrossReference_1_0 = (CrossReference)cNameVarModeAssignment_1.eContents().get(0);
		private final RuleCall cNameVarModeVariableIDTerminalRuleCall_1_0_1 = (RuleCall)cNameVarModeVariableCrossReference_1_0.eContents().get(1);
		private final Keyword cRefKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cVarTestKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameVarTestAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cNameVarTestVariableCrossReference_4_0 = (CrossReference)cNameVarTestAssignment_4.eContents().get(0);
		private final RuleCall cNameVarTestVariableIDTerminalRuleCall_4_0_1 = (RuleCall)cNameVarTestVariableCrossReference_4_0.eContents().get(1);
		
		//Mapping:
		//	'varModel:' nameVarMode+=[Variable] 'ref' 'varTest:' nameVarTest+=[testIntention::Variable];
		@Override public ParserRule getRule() { return rule; }
		
		//'varModel:' nameVarMode+=[Variable] 'ref' 'varTest:' nameVarTest+=[testIntention::Variable]
		public Group getGroup() { return cGroup; }
		
		//'varModel:'
		public Keyword getVarModelKeyword_0() { return cVarModelKeyword_0; }
		
		//nameVarMode+=[Variable]
		public Assignment getNameVarModeAssignment_1() { return cNameVarModeAssignment_1; }
		
		//[Variable]
		public CrossReference getNameVarModeVariableCrossReference_1_0() { return cNameVarModeVariableCrossReference_1_0; }
		
		//ID
		public RuleCall getNameVarModeVariableIDTerminalRuleCall_1_0_1() { return cNameVarModeVariableIDTerminalRuleCall_1_0_1; }
		
		//'ref'
		public Keyword getRefKeyword_2() { return cRefKeyword_2; }
		
		//'varTest:'
		public Keyword getVarTestKeyword_3() { return cVarTestKeyword_3; }
		
		//nameVarTest+=[testIntention::Variable]
		public Assignment getNameVarTestAssignment_4() { return cNameVarTestAssignment_4; }
		
		//[testIntention::Variable]
		public CrossReference getNameVarTestVariableCrossReference_4_0() { return cNameVarTestVariableCrossReference_4_0; }
		
		//ID
		public RuleCall getNameVarTestVariableIDTerminalRuleCall_4_0_1() { return cNameVarTestVariableIDTerminalRuleCall_4_0_1; }
	}
	public class MocksElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.Mocks");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAddMockKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMocknameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cMocknameMockNameCrossReference_1_0 = (CrossReference)cMocknameAssignment_1.eContents().get(0);
		private final RuleCall cMocknameMockNameIDTerminalRuleCall_1_0_1 = (RuleCall)cMocknameMockNameCrossReference_1_0.eContents().get(1);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameCompAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cNameCompInstanceCompCrossReference_3_0 = (CrossReference)cNameCompAssignment_3.eContents().get(0);
		private final RuleCall cNameCompInstanceCompIDTerminalRuleCall_3_0_1 = (RuleCall)cNameCompInstanceCompCrossReference_3_0.eContents().get(1);
		private final Keyword cFullStopKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cNameServ1Assignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cNameServ1ServiceNameCrossReference_5_0 = (CrossReference)cNameServ1Assignment_5.eContents().get(0);
		private final RuleCall cNameServ1ServiceNameIDTerminalRuleCall_5_0_1 = (RuleCall)cNameServ1ServiceNameCrossReference_5_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Mocks:
		//	'addMock(' mockname+=[MockName] "," nameComp+=[InstanceComp] '.' nameServ1+=[ServiceName] ")";
		@Override public ParserRule getRule() { return rule; }
		
		//'addMock(' mockname+=[MockName] "," nameComp+=[InstanceComp] '.' nameServ1+=[ServiceName] ")"
		public Group getGroup() { return cGroup; }
		
		//'addMock('
		public Keyword getAddMockKeyword_0() { return cAddMockKeyword_0; }
		
		//mockname+=[MockName]
		public Assignment getMocknameAssignment_1() { return cMocknameAssignment_1; }
		
		//[MockName]
		public CrossReference getMocknameMockNameCrossReference_1_0() { return cMocknameMockNameCrossReference_1_0; }
		
		//ID
		public RuleCall getMocknameMockNameIDTerminalRuleCall_1_0_1() { return cMocknameMockNameIDTerminalRuleCall_1_0_1; }
		
		//","
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//nameComp+=[InstanceComp]
		public Assignment getNameCompAssignment_3() { return cNameCompAssignment_3; }
		
		//[InstanceComp]
		public CrossReference getNameCompInstanceCompCrossReference_3_0() { return cNameCompInstanceCompCrossReference_3_0; }
		
		//ID
		public RuleCall getNameCompInstanceCompIDTerminalRuleCall_3_0_1() { return cNameCompInstanceCompIDTerminalRuleCall_3_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_4() { return cFullStopKeyword_4; }
		
		//nameServ1+=[ServiceName]
		public Assignment getNameServ1Assignment_5() { return cNameServ1Assignment_5; }
		
		//[ServiceName]
		public CrossReference getNameServ1ServiceNameCrossReference_5_0() { return cNameServ1ServiceNameCrossReference_5_0; }
		
		//ID
		public RuleCall getNameServ1ServiceNameIDTerminalRuleCall_5_0_1() { return cNameServ1ServiceNameIDTerminalRuleCall_5_0_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
	}
	public class ObserveursElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.Observeurs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAddObserveurKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cObsnameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cObsnameObserveurNameCrossReference_1_0 = (CrossReference)cObsnameAssignment_1.eContents().get(0);
		private final RuleCall cObsnameObserveurNameIDTerminalRuleCall_1_0_1 = (RuleCall)cObsnameObserveurNameCrossReference_1_0.eContents().get(1);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameCompAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cNameCompInstanceCompCrossReference_3_0 = (CrossReference)cNameCompAssignment_3.eContents().get(0);
		private final RuleCall cNameCompInstanceCompIDTerminalRuleCall_3_0_1 = (RuleCall)cNameCompInstanceCompCrossReference_3_0.eContents().get(1);
		private final Keyword cFullStopKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cNameServ1Assignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cNameServ1ServiceNameCrossReference_5_0 = (CrossReference)cNameServ1Assignment_5.eContents().get(0);
		private final RuleCall cNameServ1ServiceNameIDTerminalRuleCall_5_0_1 = (RuleCall)cNameServ1ServiceNameCrossReference_5_0.eContents().get(1);
		private final Keyword cCommaKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cNameCompAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cNameCompInstanceCompCrossReference_7_0 = (CrossReference)cNameCompAssignment_7.eContents().get(0);
		private final RuleCall cNameCompInstanceCompIDTerminalRuleCall_7_0_1 = (RuleCall)cNameCompInstanceCompCrossReference_7_0.eContents().get(1);
		private final Keyword cFullStopKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cNameServ2Assignment_9 = (Assignment)cGroup.eContents().get(9);
		private final CrossReference cNameServ2ServiceNameCrossReference_9_0 = (CrossReference)cNameServ2Assignment_9.eContents().get(0);
		private final RuleCall cNameServ2ServiceNameIDTerminalRuleCall_9_0_1 = (RuleCall)cNameServ2ServiceNameCrossReference_9_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Observeurs:
		//	"addObserveur(" obsname+=[ObserveurName] "," nameComp+=[InstanceComp] '.' nameServ1+=[ServiceName] ","
		//	nameComp+=[InstanceComp] '.' nameServ2+=[ServiceName] ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"addObserveur(" obsname+=[ObserveurName] "," nameComp+=[InstanceComp] '.' nameServ1+=[ServiceName] ","
		//nameComp+=[InstanceComp] '.' nameServ2+=[ServiceName] ")"
		public Group getGroup() { return cGroup; }
		
		//"addObserveur("
		public Keyword getAddObserveurKeyword_0() { return cAddObserveurKeyword_0; }
		
		//obsname+=[ObserveurName]
		public Assignment getObsnameAssignment_1() { return cObsnameAssignment_1; }
		
		//[ObserveurName]
		public CrossReference getObsnameObserveurNameCrossReference_1_0() { return cObsnameObserveurNameCrossReference_1_0; }
		
		//ID
		public RuleCall getObsnameObserveurNameIDTerminalRuleCall_1_0_1() { return cObsnameObserveurNameIDTerminalRuleCall_1_0_1; }
		
		//","
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//nameComp+=[InstanceComp]
		public Assignment getNameCompAssignment_3() { return cNameCompAssignment_3; }
		
		//[InstanceComp]
		public CrossReference getNameCompInstanceCompCrossReference_3_0() { return cNameCompInstanceCompCrossReference_3_0; }
		
		//ID
		public RuleCall getNameCompInstanceCompIDTerminalRuleCall_3_0_1() { return cNameCompInstanceCompIDTerminalRuleCall_3_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_4() { return cFullStopKeyword_4; }
		
		//nameServ1+=[ServiceName]
		public Assignment getNameServ1Assignment_5() { return cNameServ1Assignment_5; }
		
		//[ServiceName]
		public CrossReference getNameServ1ServiceNameCrossReference_5_0() { return cNameServ1ServiceNameCrossReference_5_0; }
		
		//ID
		public RuleCall getNameServ1ServiceNameIDTerminalRuleCall_5_0_1() { return cNameServ1ServiceNameIDTerminalRuleCall_5_0_1; }
		
		//","
		public Keyword getCommaKeyword_6() { return cCommaKeyword_6; }
		
		//nameComp+=[InstanceComp]
		public Assignment getNameCompAssignment_7() { return cNameCompAssignment_7; }
		
		//[InstanceComp]
		public CrossReference getNameCompInstanceCompCrossReference_7_0() { return cNameCompInstanceCompCrossReference_7_0; }
		
		//ID
		public RuleCall getNameCompInstanceCompIDTerminalRuleCall_7_0_1() { return cNameCompInstanceCompIDTerminalRuleCall_7_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_8() { return cFullStopKeyword_8; }
		
		//nameServ2+=[ServiceName]
		public Assignment getNameServ2Assignment_9() { return cNameServ2Assignment_9; }
		
		//[ServiceName]
		public CrossReference getNameServ2ServiceNameCrossReference_9_0() { return cNameServ2ServiceNameCrossReference_9_0; }
		
		//ID
		public RuleCall getNameServ2ServiceNameIDTerminalRuleCall_9_0_1() { return cNameServ2ServiceNameIDTerminalRuleCall_9_0_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_10() { return cRightParenthesisKeyword_10; }
	}
	public class ServiceNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.ServiceName");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//ServiceName:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeEnumRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//Variable:
		//	name=ID ":" type=Type;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ":" type=Type
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type=Type
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//Type
		public RuleCall getTypeTypeEnumRuleCall_2_0() { return cTypeTypeEnumRuleCall_2_0; }
	}
	public class ObserveurNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.ObserveurName");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//ObserveurName:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class MockNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.MockName");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//MockName:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class InstanceCompElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.InstanceComp");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//InstanceComp:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	public class TypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "com.aelos.xtext.mappingassistance.MappingAssistance.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINTINTKeyword_0_0 = (Keyword)cINTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSTRINGEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSTRINGSTRINGKeyword_1_0 = (Keyword)cSTRINGEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBooleanEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBooleanBooleanKeyword_2_0 = (Keyword)cBooleanEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cDoubleEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cDoubleDoubleKeyword_3_0 = (Keyword)cDoubleEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Type:
		//	INT | STRING | Boolean | Double;
		public EnumRule getRule() { return rule; }
		
		//INT | STRING | Boolean | Double
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
	}
	
	private final ModelElements pModel;
	private final AbstractModelElements pAbstractModel;
	private final ImportElements pImport;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final QualifiedNameElements pQualifiedName;
	private final TestedcomposantElements pTestedcomposant;
	private final TestedserviceElements pTestedservice;
	private final MappingElements pMapping;
	private final MocksElements pMocks;
	private final ObserveursElements pObserveurs;
	private final ServiceNameElements pServiceName;
	private final VariableElements pVariable;
	private final ObserveurNameElements pObserveurName;
	private final MockNameElements pMockName;
	private final InstanceCompElements pInstanceComp;
	private final TypeElements eType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MappingAssistanceGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pAbstractModel = new AbstractModelElements();
		this.pImport = new ImportElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pTestedcomposant = new TestedcomposantElements();
		this.pTestedservice = new TestedserviceElements();
		this.pMapping = new MappingElements();
		this.pMocks = new MocksElements();
		this.pObserveurs = new ObserveursElements();
		this.pServiceName = new ServiceNameElements();
		this.pVariable = new VariableElements();
		this.pObserveurName = new ObserveurNameElements();
		this.pMockName = new MockNameElements();
		this.pInstanceComp = new InstanceCompElements();
		this.eType = new TypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.aelos.xtext.mappingassistance.MappingAssistance".equals(grammar.getName())) {
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
	//	function+=AbstractModel*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//AbstractModel:
	//	Import obs+=Observeurs* mock+=Mocks* testedserv+=Testedservice+ testedcomp+=Testedcomposant;
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
	
	//Testedcomposant:
	//	nameComp+=[InstanceComp];
	public TestedcomposantElements getTestedcomposantAccess() {
		return pTestedcomposant;
	}
	
	public ParserRule getTestedcomposantRule() {
		return getTestedcomposantAccess().getRule();
	}
	
	//Testedservice:
	//	nameComp+=[InstanceComp] '.' nameServ1+=[ServiceName];
	public TestedserviceElements getTestedserviceAccess() {
		return pTestedservice;
	}
	
	public ParserRule getTestedserviceRule() {
		return getTestedserviceAccess().getRule();
	}
	
	//Mapping:
	//	'varModel:' nameVarMode+=[Variable] 'ref' 'varTest:' nameVarTest+=[testIntention::Variable];
	public MappingElements getMappingAccess() {
		return pMapping;
	}
	
	public ParserRule getMappingRule() {
		return getMappingAccess().getRule();
	}
	
	//Mocks:
	//	'addMock(' mockname+=[MockName] "," nameComp+=[InstanceComp] '.' nameServ1+=[ServiceName] ")";
	public MocksElements getMocksAccess() {
		return pMocks;
	}
	
	public ParserRule getMocksRule() {
		return getMocksAccess().getRule();
	}
	
	//Observeurs:
	//	"addObserveur(" obsname+=[ObserveurName] "," nameComp+=[InstanceComp] '.' nameServ1+=[ServiceName] ","
	//	nameComp+=[InstanceComp] '.' nameServ2+=[ServiceName] ")";
	public ObserveursElements getObserveursAccess() {
		return pObserveurs;
	}
	
	public ParserRule getObserveursRule() {
		return getObserveursAccess().getRule();
	}
	
	//ServiceName:
	//	name=ID;
	public ServiceNameElements getServiceNameAccess() {
		return pServiceName;
	}
	
	public ParserRule getServiceNameRule() {
		return getServiceNameAccess().getRule();
	}
	
	//Variable:
	//	name=ID ":" type=Type;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//ObserveurName:
	//	name=ID;
	public ObserveurNameElements getObserveurNameAccess() {
		return pObserveurName;
	}
	
	public ParserRule getObserveurNameRule() {
		return getObserveurNameAccess().getRule();
	}
	
	//MockName:
	//	name=ID;
	public MockNameElements getMockNameAccess() {
		return pMockName;
	}
	
	public ParserRule getMockNameRule() {
		return getMockNameAccess().getRule();
	}
	
	//InstanceComp:
	//	name=ID;
	public InstanceCompElements getInstanceCompAccess() {
		return pInstanceComp;
	}
	
	public ParserRule getInstanceCompRule() {
		return getInstanceCompAccess().getRule();
	}
	
	//enum Type:
	//	INT | STRING | Boolean | Double;
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
