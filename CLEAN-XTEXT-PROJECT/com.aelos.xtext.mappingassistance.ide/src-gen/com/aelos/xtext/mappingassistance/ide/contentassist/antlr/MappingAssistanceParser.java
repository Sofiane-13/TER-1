/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.mappingassistance.ide.contentassist.antlr;

import com.aelos.xtext.mappingassistance.ide.contentassist.antlr.internal.InternalMappingAssistanceParser;
import com.aelos.xtext.mappingassistance.services.MappingAssistanceGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MappingAssistanceParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MappingAssistanceGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MappingAssistanceGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getComponentAccess().getAlternatives_0(), "rule__Component__Alternatives_0");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getAbstractModelAccess().getGroup(), "rule__AbstractModel__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_7(), "rule__Component__Group_7__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_10(), "rule__Component__Group_10__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_10_2(), "rule__Component__Group_10_2__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_10_2_0(), "rule__Component__Group_10_2_0__0");
			builder.put(grammarAccess.getComponentAccess().getGroup_10_4(), "rule__Component__Group_10_4__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getMappingAccess().getGroup(), "rule__Mapping__Group__0");
			builder.put(grammarAccess.getBindingsAccess().getGroup(), "rule__Bindings__Group__0");
			builder.put(grammarAccess.getRequiredServiceAccess().getGroup(), "rule__RequiredService__Group__0");
			builder.put(grammarAccess.getModelAccess().getFunctionAssignment(), "rule__Model__FunctionAssignment");
			builder.put(grammarAccess.getAbstractModelAccess().getCompAssignment_1(), "rule__AbstractModel__CompAssignment_1");
			builder.put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getComponentAccess().getInstAssignment_2(), "rule__Component__InstAssignment_2");
			builder.put(grammarAccess.getComponentAccess().getNameAssignment_4(), "rule__Component__NameAssignment_4");
			builder.put(grammarAccess.getComponentAccess().getArgAssignment_7_0(), "rule__Component__ArgAssignment_7_0");
			builder.put(grammarAccess.getComponentAccess().getArg1Assignment_8(), "rule__Component__Arg1Assignment_8");
			builder.put(grammarAccess.getComponentAccess().getMethodeAssignment_10_0(), "rule__Component__MethodeAssignment_10_0");
			builder.put(grammarAccess.getComponentAccess().getArgAssignment_10_2_0_0(), "rule__Component__ArgAssignment_10_2_0_0");
			builder.put(grammarAccess.getComponentAccess().getArgAssignment_10_2_1(), "rule__Component__ArgAssignment_10_2_1");
			builder.put(grammarAccess.getComponentAccess().getArgAssignment_10_4_1(), "rule__Component__ArgAssignment_10_4_1");
			builder.put(grammarAccess.getComponentAccess().getReqAssignment_12(), "rule__Component__ReqAssignment_12");
			builder.put(grammarAccess.getComponentAccess().getMapAssignment_13(), "rule__Component__MapAssignment_13");
			builder.put(grammarAccess.getComponentAccess().getBindAssignment_14(), "rule__Component__BindAssignment_14");
			builder.put(grammarAccess.getInstanceCompAccess().getNameAssignment(), "rule__InstanceComp__NameAssignment");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
			builder.put(grammarAccess.getVariableAccess().getTypeAssignment_2(), "rule__Variable__TypeAssignment_2");
			builder.put(grammarAccess.getMappingAccess().getNameVarModeAssignment_1(), "rule__Mapping__NameVarModeAssignment_1");
			builder.put(grammarAccess.getMappingAccess().getNameVarTestAssignment_4(), "rule__Mapping__NameVarTestAssignment_4");
			builder.put(grammarAccess.getBindingsAccess().getNameCompAssignment_1(), "rule__Bindings__NameCompAssignment_1");
			builder.put(grammarAccess.getBindingsAccess().getNameServ1Assignment_3(), "rule__Bindings__NameServ1Assignment_3");
			builder.put(grammarAccess.getBindingsAccess().getNameCompAssignment_5(), "rule__Bindings__NameCompAssignment_5");
			builder.put(grammarAccess.getBindingsAccess().getNameServ2Assignment_7(), "rule__Bindings__NameServ2Assignment_7");
			builder.put(grammarAccess.getRequiredServiceAccess().getNameVarMethodeAssignment_0(), "rule__RequiredService__NameVarMethodeAssignment_0");
			builder.put(grammarAccess.getRequiredServiceAccess().getNameCompAssignment_2(), "rule__RequiredService__NameCompAssignment_2");
			builder.put(grammarAccess.getRequiredServiceAccess().getNameServAssignment_4(), "rule__RequiredService__NameServAssignment_4");
			builder.put(grammarAccess.getServiceNameAccess().getNameAssignment(), "rule__ServiceName__NameAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MappingAssistanceGrammarAccess grammarAccess;

	@Override
	protected InternalMappingAssistanceParser createParser() {
		InternalMappingAssistanceParser result = new InternalMappingAssistanceParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MappingAssistanceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MappingAssistanceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
