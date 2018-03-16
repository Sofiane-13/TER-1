/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
grammar InternalArchitecture;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.aelos.xtext.architecture.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.aelos.xtext.architecture.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.aelos.xtext.architecture.services.ArchitectureGrammarAccess;

}

@parser::members {

 	private ArchitectureGrammarAccess grammarAccess;

    public InternalArchitectureParser(TokenStream input, ArchitectureGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected ArchitectureGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getPackageDomainDeclarationParserRuleCall_0());
			}
			lv_package_0_0=ruleDomainDeclaration
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"package",
					lv_package_0_0,
					"com.aelos.xtext.architecture.Architecture.DomainDeclaration");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleDomainDeclaration
entryRuleDomainDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDomainDeclarationRule()); }
	iv_ruleDomainDeclaration=ruleDomainDeclaration
	{ $current=$iv_ruleDomainDeclaration.current; }
	EOF;

// Rule DomainDeclaration
ruleDomainDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='domain'
		{
			newLeafNode(otherlv_0, grammarAccess.getDomainDeclarationAccess().getDomainKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainDeclarationRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"com.aelos.xtext.architecture.Architecture.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDomainDeclarationAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDomainDeclarationAccess().getElementsAbstractModelParserRuleCall_3_0());
				}
				lv_elements_3_0=ruleAbstractModel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDomainDeclarationRule());
					}
					add(
						$current,
						"elements",
						lv_elements_3_0,
						"com.aelos.xtext.architecture.Architecture.AbstractModel");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getDomainDeclarationAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleAbstractModel
entryRuleAbstractModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractModelRule()); }
	iv_ruleAbstractModel=ruleAbstractModel
	{ $current=$iv_ruleAbstractModel.current; }
	EOF;

// Rule AbstractModel
ruleAbstractModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0());
			}
			this_Import_0=ruleImport
			{
				$current = $this_Import_0.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			('Component:')=>
			(
				{
					newCompositeNode(grammarAccess.getAbstractModelAccess().getCompComponentParserRuleCall_1_0());
				}
				lv_comp_1_0=ruleComponent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAbstractModelRule());
					}
					add(
						$current,
						"comp",
						lv_comp_1_0,
						"com.aelos.xtext.architecture.Architecture.Component");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"com.aelos.xtext.architecture.Architecture.QualifiedNameWithWildcard");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); }
	iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard
	{ $current=$iv_ruleQualifiedNameWithWildcard.current.getText(); }
	EOF;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	iv_ruleComponent=ruleComponent
	{ $current=$iv_ruleComponent.current; }
	EOF;

// Rule Component
ruleComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			('Component:')=>
			otherlv_0='Component:'
			{
				newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getInstInstanceCompParserRuleCall_1_0());
				}
				lv_inst_1_0=ruleInstanceComp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					add(
						$current,
						"inst",
						lv_inst_1_0,
						"com.aelos.xtext.architecture.Architecture.InstanceComp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getColonKeyword_2());
		}
		(
			((
				RULE_ID
			)
			)=>
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComponentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='ProvidedServices:'
		{
			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getProvidedServicesKeyword_4());
		}
		otherlv_5='conf('
		{
			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getConfKeyword_5());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_6_0_0());
					}
					lv_arg_6_0=ruleVariable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComponentRule());
						}
						add(
							$current,
							"arg",
							lv_arg_6_0,
							"com.aelos.xtext.architecture.Architecture.Variable");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCommaKeyword_6_1());
			}
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getArg1VariableParserRuleCall_7_0());
				}
				lv_arg1_8_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					add(
						$current,
						"arg1",
						lv_arg1_8_0,
						"com.aelos.xtext.architecture.Architecture.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightParenthesisKeyword_8());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getComponentAccess().getMethodeServiceNameParserRuleCall_9_0_0());
					}
					lv_methode_10_0=ruleServiceName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComponentRule());
						}
						add(
							$current,
							"methode",
							lv_methode_10_0,
							"com.aelos.xtext.architecture.Architecture.ServiceName");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_11='('
			{
				newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_9_1());
			}
			(
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_0_0_0());
							}
							lv_arg_12_0=ruleVariable
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getComponentRule());
								}
								add(
									$current,
									"arg",
									lv_arg_12_0,
									"com.aelos.xtext.architecture.Architecture.Variable");
								afterParserOrEnumRuleCall();
							}
						)
					)
					otherlv_13=','
					{
						newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getCommaKeyword_9_2_0_1());
					}
				)*
				(
					(
						{
							newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_1_0());
						}
						lv_arg_14_0=ruleVariable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComponentRule());
							}
							add(
								$current,
								"arg",
								lv_arg_14_0,
								"com.aelos.xtext.architecture.Architecture.Variable");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_15=')'
			{
				newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getRightParenthesisKeyword_9_3());
			}
			(
				otherlv_16=':'
				{
					newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getColonKeyword_9_4_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_4_1_0());
						}
						lv_arg_17_0=ruleVariable
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComponentRule());
							}
							add(
								$current,
								"arg",
								lv_arg_17_0,
								"com.aelos.xtext.architecture.Architecture.Variable");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
		)*
		(
			otherlv_18='RequiredServices:'
			{
				newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getRequiredServicesKeyword_10());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getReqRequiredServiceParserRuleCall_11_0());
				}
				lv_req_19_0=ruleRequiredService
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					add(
						$current,
						"req",
						lv_req_19_0,
						"com.aelos.xtext.architecture.Architecture.RequiredService");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getComponentAccess().getBindBindingsParserRuleCall_12_0());
				}
				lv_bind_20_0=ruleBindings
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComponentRule());
					}
					add(
						$current,
						"bind",
						lv_bind_20_0,
						"com.aelos.xtext.architecture.Architecture.Bindings");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleInstanceComp
entryRuleInstanceComp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstanceCompRule()); }
	iv_ruleInstanceComp=ruleInstanceComp
	{ $current=$iv_ruleInstanceComp.current; }
	EOF;

// Rule InstanceComp
ruleInstanceComp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getInstanceCompAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getInstanceCompRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"com.aelos.xtext.architecture.Architecture.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBindings
entryRuleBindings returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBindingsRule()); }
	iv_ruleBindings=ruleBindings
	{ $current=$iv_ruleBindings.current; }
	EOF;

// Rule Bindings
ruleBindings returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='bind('
		{
			newLeafNode(otherlv_0, grammarAccess.getBindingsAccess().getBindKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingsRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getBindingsAccess().getNameComp1InstanceCompCrossReference_1_0());
				}
			)
		)
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getBindingsAccess().getFullStopKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingsRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getBindingsAccess().getNameServ1ServiceNameCrossReference_3_0());
				}
			)
		)
		otherlv_4=','
		{
			newLeafNode(otherlv_4, grammarAccess.getBindingsAccess().getCommaKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingsRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getBindingsAccess().getNameComp2InstanceCompCrossReference_5_0());
				}
			)
		)
		otherlv_6='.'
		{
			newLeafNode(otherlv_6, grammarAccess.getBindingsAccess().getFullStopKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBindingsRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getBindingsAccess().getNameServ2ServiceNameCrossReference_7_0());
				}
			)
		)
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getBindingsAccess().getRightParenthesisKeyword_8());
		}
	)
;

// Entry rule entryRuleRequiredService
entryRuleRequiredService returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequiredServiceRule()); }
	iv_ruleRequiredService=ruleRequiredService
	{ $current=$iv_ruleRequiredService.current; }
	EOF;

// Rule RequiredService
ruleRequiredService returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRequiredServiceAccess().getNameVarMethodeVariableParserRuleCall_0_0());
				}
				lv_nameVarMethode_0_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequiredServiceRule());
					}
					add(
						$current,
						"nameVarMethode",
						lv_nameVarMethode_0_0,
						"com.aelos.xtext.architecture.Architecture.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':='
		{
			newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getColonEqualsSignKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequiredServiceRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompCrossReference_2_0());
				}
			)
		)
		otherlv_3='.'
		{
			newLeafNode(otherlv_3, grammarAccess.getRequiredServiceAccess().getFullStopKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequiredServiceRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getRequiredServiceAccess().getNameServServiceNameCrossReference_4_0());
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleServiceName
entryRuleServiceName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServiceNameRule()); }
	iv_ruleServiceName=ruleServiceName
	{ $current=$iv_ruleServiceName.current; }
	EOF;

// Rule ServiceName
ruleServiceName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getServiceNameAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getServiceNameRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Rule Type
ruleType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='INT'
			{
				$current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='STRING'
			{
				$current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Boolean'
			{
				$current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Double'
			{
				$current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
