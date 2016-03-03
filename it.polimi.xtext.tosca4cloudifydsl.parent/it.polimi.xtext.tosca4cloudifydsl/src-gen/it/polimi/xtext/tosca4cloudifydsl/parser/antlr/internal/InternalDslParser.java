package it.polimi.xtext.tosca4cloudifydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.polimi.xtext.tosca4cloudifydsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'\"tosca_definition_version\" :'", "'\\n, \"description\" :'", "'\\n, \"imports\" :'", "'['", "','", "']'", "'\\n, \"inputs\" :'", "'}'", "'\\n, \"node_templates\" :'", "'\\n, \"outputs\" :'", "'Output'", "'type'", "'description'", "'value'", "'required'", "'default'", "'status'", "':'", "'\"type\" :'", "', \\n \"description\" :'", "', \\n \"interfaces\" :'", "', \\n \"properties\" :'", "', \\n \"attributes\" :'", "', \\n \"requirements\" :'", "', \\n \"relationships\" :'", "', \\n \"instances\" :'", "'Property'", "'property_name'", "'Attribute'", "'Requirement'", "'requirement_name'", "'node'", "'capability_Type_name'", "'occurances'", "', \\n \"source\" :'", "', \\n \"target\" :'", "', \\n \"source_interfaces\" :'", "', \\n \"target_interfaces\" :'", "'instance'", "' :'", "'  :'", "'hasOperation'", "'Contained_in'", "'validSource'", "'validTarget'", "'relation_haSourceInterface'", "'relation_hasTargetInterface'", "'Connected_to'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Service_Template";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleService_Template"
    // InternalDsl.g:64:1: entryRuleService_Template returns [EObject current=null] : iv_ruleService_Template= ruleService_Template EOF ;
    public final EObject entryRuleService_Template() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService_Template = null;


        try {
            // InternalDsl.g:64:57: (iv_ruleService_Template= ruleService_Template EOF )
            // InternalDsl.g:65:2: iv_ruleService_Template= ruleService_Template EOF
            {
             newCompositeNode(grammarAccess.getService_TemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService_Template=ruleService_Template();

            state._fsp--;

             current =iv_ruleService_Template; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService_Template"


    // $ANTLR start "ruleService_Template"
    // InternalDsl.g:71:1: ruleService_Template returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}' )? otherlv_17= '\\n, \"node_templates\" :' otherlv_18= '{' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) (otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) ) )* otherlv_22= '}' (otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleService_Template() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tosca_definition_version_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        EObject lv_serviceTemplate_hasImport_7_0 = null;

        EObject lv_serviceTemplate_hasImport_9_0 = null;

        EObject lv_interface_hasInput_13_0 = null;

        EObject lv_interface_hasInput_15_0 = null;

        EObject lv_service_hasNodeTemplate_19_0 = null;

        EObject lv_service_hasNodeTemplate_21_0 = null;

        EObject lv_serviceTemplate_hasOutput_25_0 = null;

        EObject lv_serviceTemplate_hasOutput_27_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( (otherlv_0= '{' (otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}' )? otherlv_17= '\\n, \"node_templates\" :' otherlv_18= '{' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) (otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) ) )* otherlv_22= '}' (otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalDsl.g:78:2: (otherlv_0= '{' (otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}' )? otherlv_17= '\\n, \"node_templates\" :' otherlv_18= '{' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) (otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) ) )* otherlv_22= '}' (otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalDsl.g:78:2: (otherlv_0= '{' (otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}' )? otherlv_17= '\\n, \"node_templates\" :' otherlv_18= '{' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) (otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) ) )* otherlv_22= '}' (otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalDsl.g:79:3: otherlv_0= '{' (otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}' )? otherlv_17= '\\n, \"node_templates\" :' otherlv_18= '{' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) (otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) ) )* otherlv_22= '}' (otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getService_TemplateAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalDsl.g:83:3: (otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:84:4: otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getService_TemplateAccess().getTosca_definition_versionKeyword_1_0());
                    			
                    // InternalDsl.g:88:4: ( (lv_tosca_definition_version_2_0= RULE_STRING ) )
                    // InternalDsl.g:89:5: (lv_tosca_definition_version_2_0= RULE_STRING )
                    {
                    // InternalDsl.g:89:5: (lv_tosca_definition_version_2_0= RULE_STRING )
                    // InternalDsl.g:90:6: lv_tosca_definition_version_2_0= RULE_STRING
                    {
                    lv_tosca_definition_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_tosca_definition_version_2_0, grammarAccess.getService_TemplateAccess().getTosca_definition_versionSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getService_TemplateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tosca_definition_version",
                    							lv_tosca_definition_version_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:107:3: (otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:108:4: otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getService_TemplateAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalDsl.g:112:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalDsl.g:113:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalDsl.g:113:5: (lv_description_4_0= RULE_STRING )
                    // InternalDsl.g:114:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getService_TemplateAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getService_TemplateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:131:3: (otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:132:4: otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getService_TemplateAccess().getImportsKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getService_TemplateAccess().getLeftSquareBracketKeyword_3_1());
                    			
                    // InternalDsl.g:140:4: ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) )
                    // InternalDsl.g:141:5: (lv_serviceTemplate_hasImport_7_0= ruleImport )
                    {
                    // InternalDsl.g:141:5: (lv_serviceTemplate_hasImport_7_0= ruleImport )
                    // InternalDsl.g:142:6: lv_serviceTemplate_hasImport_7_0= ruleImport
                    {

                    						newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasImportImportParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_serviceTemplate_hasImport_7_0=ruleImport();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    						}
                    						add(
                    							current,
                    							"serviceTemplate_hasImport",
                    							lv_serviceTemplate_hasImport_7_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Import");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:159:4: (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDsl.g:160:5: otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getService_TemplateAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDsl.g:164:5: ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) )
                    	    // InternalDsl.g:165:6: (lv_serviceTemplate_hasImport_9_0= ruleImport )
                    	    {
                    	    // InternalDsl.g:165:6: (lv_serviceTemplate_hasImport_9_0= ruleImport )
                    	    // InternalDsl.g:166:7: lv_serviceTemplate_hasImport_9_0= ruleImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasImportImportParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_serviceTemplate_hasImport_9_0=ruleImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"serviceTemplate_hasImport",
                    	    								lv_serviceTemplate_hasImport_9_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Import");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getService_TemplateAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:189:3: (otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:190:4: otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getService_TemplateAccess().getInputsKeyword_4_0());
                    			
                    otherlv_12=(Token)match(input,11,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getService_TemplateAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:198:4: ( (lv_interface_hasInput_13_0= ruleInput ) )
                    // InternalDsl.g:199:5: (lv_interface_hasInput_13_0= ruleInput )
                    {
                    // InternalDsl.g:199:5: (lv_interface_hasInput_13_0= ruleInput )
                    // InternalDsl.g:200:6: lv_interface_hasInput_13_0= ruleInput
                    {

                    						newCompositeNode(grammarAccess.getService_TemplateAccess().getInterface_hasInputInputParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_interface_hasInput_13_0=ruleInput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    						}
                    						add(
                    							current,
                    							"interface_hasInput",
                    							lv_interface_hasInput_13_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Input");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:217:4: (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDsl.g:218:5: otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_12); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getService_TemplateAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:222:5: ( (lv_interface_hasInput_15_0= ruleInput ) )
                    	    // InternalDsl.g:223:6: (lv_interface_hasInput_15_0= ruleInput )
                    	    {
                    	    // InternalDsl.g:223:6: (lv_interface_hasInput_15_0= ruleInput )
                    	    // InternalDsl.g:224:7: lv_interface_hasInput_15_0= ruleInput
                    	    {

                    	    							newCompositeNode(grammarAccess.getService_TemplateAccess().getInterface_hasInputInputParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_interface_hasInput_15_0=ruleInput();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"interface_hasInput",
                    	    								lv_interface_hasInput_15_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Input");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getService_TemplateAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_17, grammarAccess.getService_TemplateAccess().getNode_templatesKeyword_5());
            		
            otherlv_18=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getService_TemplateAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalDsl.g:255:3: ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) )
            // InternalDsl.g:256:4: (lv_service_hasNodeTemplate_19_0= ruleNode_template )
            {
            // InternalDsl.g:256:4: (lv_service_hasNodeTemplate_19_0= ruleNode_template )
            // InternalDsl.g:257:5: lv_service_hasNodeTemplate_19_0= ruleNode_template
            {

            					newCompositeNode(grammarAccess.getService_TemplateAccess().getService_hasNodeTemplateNode_templateParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_13);
            lv_service_hasNodeTemplate_19_0=ruleNode_template();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getService_TemplateRule());
            					}
            					add(
            						current,
            						"service_hasNodeTemplate",
            						lv_service_hasNodeTemplate_19_0,
            						"it.polimi.xtext.tosca4cloudifydsl.Dsl.Node_template");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:274:3: (otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:275:4: otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) )
            	    {
            	    otherlv_20=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_20, grammarAccess.getService_TemplateAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalDsl.g:279:4: ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) )
            	    // InternalDsl.g:280:5: (lv_service_hasNodeTemplate_21_0= ruleNode_template )
            	    {
            	    // InternalDsl.g:280:5: (lv_service_hasNodeTemplate_21_0= ruleNode_template )
            	    // InternalDsl.g:281:6: lv_service_hasNodeTemplate_21_0= ruleNode_template
            	    {

            	    						newCompositeNode(grammarAccess.getService_TemplateAccess().getService_hasNodeTemplateNode_templateParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_service_hasNodeTemplate_21_0=ruleNode_template();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getService_TemplateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"service_hasNodeTemplate",
            	    							lv_service_hasNodeTemplate_21_0,
            	    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Node_template");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_22=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_22, grammarAccess.getService_TemplateAccess().getRightCurlyBracketKeyword_9());
            		
            // InternalDsl.g:303:3: (otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:304:4: otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_23, grammarAccess.getService_TemplateAccess().getOutputsKeyword_10_0());
                    			
                    otherlv_24=(Token)match(input,11,FOLLOW_16); 

                    				newLeafNode(otherlv_24, grammarAccess.getService_TemplateAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalDsl.g:312:4: ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) )
                    // InternalDsl.g:313:5: (lv_serviceTemplate_hasOutput_25_0= ruleOutput )
                    {
                    // InternalDsl.g:313:5: (lv_serviceTemplate_hasOutput_25_0= ruleOutput )
                    // InternalDsl.g:314:6: lv_serviceTemplate_hasOutput_25_0= ruleOutput
                    {

                    						newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasOutputOutputParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_serviceTemplate_hasOutput_25_0=ruleOutput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    						}
                    						add(
                    							current,
                    							"serviceTemplate_hasOutput",
                    							lv_serviceTemplate_hasOutput_25_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Output");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:331:4: (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDsl.g:332:5: otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) )
                    	    {
                    	    otherlv_26=(Token)match(input,16,FOLLOW_16); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getService_TemplateAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalDsl.g:336:5: ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) )
                    	    // InternalDsl.g:337:6: (lv_serviceTemplate_hasOutput_27_0= ruleOutput )
                    	    {
                    	    // InternalDsl.g:337:6: (lv_serviceTemplate_hasOutput_27_0= ruleOutput )
                    	    // InternalDsl.g:338:7: lv_serviceTemplate_hasOutput_27_0= ruleOutput
                    	    {

                    	    							newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasOutputOutputParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_serviceTemplate_hasOutput_27_0=ruleOutput();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"serviceTemplate_hasOutput",
                    	    								lv_serviceTemplate_hasOutput_27_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Output");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_28, grammarAccess.getService_TemplateAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getService_TemplateAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService_Template"


    // $ANTLR start "entryRuleInterface"
    // InternalDsl.g:369:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalDsl.g:369:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalDsl.g:370:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalDsl.g:376:1: ruleInterface returns [EObject current=null] : (this_Interface_Impl_0= ruleInterface_Impl | this_Source_interface_1= ruleSource_interface | this_Target_interface_2= ruleTarget_interface ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_Impl_0 = null;

        EObject this_Source_interface_1 = null;

        EObject this_Target_interface_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:382:2: ( (this_Interface_Impl_0= ruleInterface_Impl | this_Source_interface_1= ruleSource_interface | this_Target_interface_2= ruleTarget_interface ) )
            // InternalDsl.g:383:2: (this_Interface_Impl_0= ruleInterface_Impl | this_Source_interface_1= ruleSource_interface | this_Target_interface_2= ruleTarget_interface )
            {
            // InternalDsl.g:383:2: (this_Interface_Impl_0= ruleInterface_Impl | this_Source_interface_1= ruleSource_interface | this_Target_interface_2= ruleTarget_interface )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 52:
                    {
                    alt10=3;
                    }
                    break;
                case 29:
                    {
                    alt10=1;
                    }
                    break;
                case 51:
                    {
                    alt10=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:384:3: this_Interface_Impl_0= ruleInterface_Impl
                    {

                    			newCompositeNode(grammarAccess.getInterfaceAccess().getInterface_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interface_Impl_0=ruleInterface_Impl();

                    state._fsp--;


                    			current = this_Interface_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:393:3: this_Source_interface_1= ruleSource_interface
                    {

                    			newCompositeNode(grammarAccess.getInterfaceAccess().getSource_interfaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Source_interface_1=ruleSource_interface();

                    state._fsp--;


                    			current = this_Source_interface_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:402:3: this_Target_interface_2= ruleTarget_interface
                    {

                    			newCompositeNode(grammarAccess.getInterfaceAccess().getTarget_interfaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Target_interface_2=ruleTarget_interface();

                    state._fsp--;


                    			current = this_Target_interface_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleRelationship"
    // InternalDsl.g:414:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalDsl.g:414:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalDsl.g:415:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalDsl.g:421:1: ruleRelationship returns [EObject current=null] : (this_Relationship_Impl_0= ruleRelationship_Impl | this_Contained_in_1= ruleContained_in | this_Connected_to_2= ruleConnected_to ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Relationship_Impl_0 = null;

        EObject this_Contained_in_1 = null;

        EObject this_Connected_to_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:427:2: ( (this_Relationship_Impl_0= ruleRelationship_Impl | this_Contained_in_1= ruleContained_in | this_Connected_to_2= ruleConnected_to ) )
            // InternalDsl.g:428:2: (this_Relationship_Impl_0= ruleRelationship_Impl | this_Contained_in_1= ruleContained_in | this_Connected_to_2= ruleConnected_to )
            {
            // InternalDsl.g:428:2: (this_Relationship_Impl_0= ruleRelationship_Impl | this_Contained_in_1= ruleContained_in | this_Connected_to_2= ruleConnected_to )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt11=1;
                }
                break;
            case 54:
                {
                alt11=2;
                }
                break;
            case 59:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDsl.g:429:3: this_Relationship_Impl_0= ruleRelationship_Impl
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getRelationship_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relationship_Impl_0=ruleRelationship_Impl();

                    state._fsp--;


                    			current = this_Relationship_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:438:3: this_Contained_in_1= ruleContained_in
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getContained_inParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Contained_in_1=ruleContained_in();

                    state._fsp--;


                    			current = this_Contained_in_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:447:3: this_Connected_to_2= ruleConnected_to
                    {

                    			newCompositeNode(grammarAccess.getRelationshipAccess().getConnected_toParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connected_to_2=ruleConnected_to();

                    state._fsp--;


                    			current = this_Connected_to_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:459:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:459:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:460:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:466:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:472:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:473:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:473:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:474:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:482:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleImport"
    // InternalDsl.g:493:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDsl.g:493:47: (iv_ruleImport= ruleImport EOF )
            // InternalDsl.g:494:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDsl.g:500:1: ruleImport returns [EObject current=null] : ( () ( (lv_file_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_file_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:506:2: ( ( () ( (lv_file_1_0= RULE_STRING ) )? ) )
            // InternalDsl.g:507:2: ( () ( (lv_file_1_0= RULE_STRING ) )? )
            {
            // InternalDsl.g:507:2: ( () ( (lv_file_1_0= RULE_STRING ) )? )
            // InternalDsl.g:508:3: () ( (lv_file_1_0= RULE_STRING ) )?
            {
            // InternalDsl.g:508:3: ()
            // InternalDsl.g:509:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImportAccess().getImportAction_0(),
            					current);
            			

            }

            // InternalDsl.g:515:3: ( (lv_file_1_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:516:4: (lv_file_1_0= RULE_STRING )
                    {
                    // InternalDsl.g:516:4: (lv_file_1_0= RULE_STRING )
                    // InternalDsl.g:517:5: lv_file_1_0= RULE_STRING
                    {
                    lv_file_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_file_1_0, grammarAccess.getImportAccess().getFileSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImportRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"file",
                    						lv_file_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleOutput"
    // InternalDsl.g:537:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalDsl.g:537:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalDsl.g:538:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalDsl.g:544:1: ruleOutput returns [EObject current=null] : ( () otherlv_1= 'Output' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_parameter_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;

        AntlrDatatypeRuleToken lv_required_11_0 = null;

        AntlrDatatypeRuleToken lv_default_13_0 = null;

        AntlrDatatypeRuleToken lv_status_15_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:550:2: ( ( () otherlv_1= 'Output' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}' ) )
            // InternalDsl.g:551:2: ( () otherlv_1= 'Output' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}' )
            {
            // InternalDsl.g:551:2: ( () otherlv_1= 'Output' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}' )
            // InternalDsl.g:552:3: () otherlv_1= 'Output' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}'
            {
            // InternalDsl.g:552:3: ()
            // InternalDsl.g:553:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputAccess().getOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getOutputKeyword_1());
            		
            // InternalDsl.g:563:3: ( (lv_parameter_name_2_0= ruleEString ) )
            // InternalDsl.g:564:4: (lv_parameter_name_2_0= ruleEString )
            {
            // InternalDsl.g:564:4: (lv_parameter_name_2_0= ruleEString )
            // InternalDsl.g:565:5: lv_parameter_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOutputAccess().getParameter_nameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_parameter_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputRule());
            					}
            					set(
            						current,
            						"parameter_name",
            						lv_parameter_name_2_0,
            						"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:586:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:587:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getTypeKeyword_4_0());
                    			
                    // InternalDsl.g:591:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalDsl.g:592:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalDsl.g:592:5: (lv_type_5_0= ruleEString )
                    // InternalDsl.g:593:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:611:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:612:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalDsl.g:616:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDsl.g:617:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDsl.g:617:5: (lv_description_7_0= ruleEString )
                    // InternalDsl.g:618:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:636:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:637:4: otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getOutputAccess().getValueKeyword_6_0());
                    			
                    // InternalDsl.g:641:4: ( (lv_value_9_0= ruleEString ) )
                    // InternalDsl.g:642:5: (lv_value_9_0= ruleEString )
                    {
                    // InternalDsl.g:642:5: (lv_value_9_0= ruleEString )
                    // InternalDsl.g:643:6: lv_value_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getValueEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_value_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:661:3: (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:662:4: otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getOutputAccess().getRequiredKeyword_7_0());
                    			
                    // InternalDsl.g:666:4: ( (lv_required_11_0= ruleEString ) )
                    // InternalDsl.g:667:5: (lv_required_11_0= ruleEString )
                    {
                    // InternalDsl.g:667:5: (lv_required_11_0= ruleEString )
                    // InternalDsl.g:668:6: lv_required_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getRequiredEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_required_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"required",
                    							lv_required_11_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:686:3: (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:687:4: otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getOutputAccess().getDefaultKeyword_8_0());
                    			
                    // InternalDsl.g:691:4: ( (lv_default_13_0= ruleEString ) )
                    // InternalDsl.g:692:5: (lv_default_13_0= ruleEString )
                    {
                    // InternalDsl.g:692:5: (lv_default_13_0= ruleEString )
                    // InternalDsl.g:693:6: lv_default_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getDefaultEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_default_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_13_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:711:3: (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:712:4: otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getOutputAccess().getStatusKeyword_9_0());
                    			
                    // InternalDsl.g:716:4: ( (lv_status_15_0= ruleEString ) )
                    // InternalDsl.g:717:5: (lv_status_15_0= ruleEString )
                    {
                    // InternalDsl.g:717:5: (lv_status_15_0= ruleEString )
                    // InternalDsl.g:718:6: lv_status_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getStatusEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_status_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"status",
                    							lv_status_15_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleInput"
    // InternalDsl.g:744:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalDsl.g:744:46: (iv_ruleInput= ruleInput EOF )
            // InternalDsl.g:745:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalDsl.g:751:1: ruleInput returns [EObject current=null] : ( () ( (lv_parameter_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_default_8_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parameter_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:757:2: ( ( () ( (lv_parameter_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) )
            // InternalDsl.g:758:2: ( () ( (lv_parameter_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            {
            // InternalDsl.g:758:2: ( () ( (lv_parameter_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            // InternalDsl.g:759:3: () ( (lv_parameter_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) ) )? otherlv_9= '}'
            {
            // InternalDsl.g:759:3: ()
            // InternalDsl.g:760:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            // InternalDsl.g:766:3: ( (lv_parameter_name_1_0= ruleEString ) )
            // InternalDsl.g:767:4: (lv_parameter_name_1_0= ruleEString )
            {
            // InternalDsl.g:767:4: (lv_parameter_name_1_0= ruleEString )
            // InternalDsl.g:768:5: lv_parameter_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputAccess().getParameter_nameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_parameter_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					set(
            						current,
            						"parameter_name",
            						lv_parameter_name_1_0,
            						"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:789:3: (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:790:4: otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getInputAccess().getTypeKeyword_3_0());
                    			
                    // InternalDsl.g:794:4: ( (lv_type_4_0= RULE_STRING ) )
                    // InternalDsl.g:795:5: (lv_type_4_0= RULE_STRING )
                    {
                    // InternalDsl.g:795:5: (lv_type_4_0= RULE_STRING )
                    // InternalDsl.g:796:6: lv_type_4_0= RULE_STRING
                    {
                    lv_type_4_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                    						newLeafNode(lv_type_4_0, grammarAccess.getInputAccess().getTypeSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:813:3: (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:814:4: otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getInputAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalDsl.g:818:4: ( (lv_description_6_0= RULE_STRING ) )
                    // InternalDsl.g:819:5: (lv_description_6_0= RULE_STRING )
                    {
                    // InternalDsl.g:819:5: (lv_description_6_0= RULE_STRING )
                    // InternalDsl.g:820:6: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_description_6_0, grammarAccess.getInputAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:837:3: (otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:838:4: otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getInputAccess().getDefaultKeyword_5_0());
                    			
                    // InternalDsl.g:842:4: ( (lv_default_8_0= RULE_STRING ) )
                    // InternalDsl.g:843:5: (lv_default_8_0= RULE_STRING )
                    {
                    // InternalDsl.g:843:5: (lv_default_8_0= RULE_STRING )
                    // InternalDsl.g:844:6: lv_default_8_0= RULE_STRING
                    {
                    lv_default_8_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_default_8_0, grammarAccess.getInputAccess().getDefaultSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"default",
                    							lv_default_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getInputAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleNode_template"
    // InternalDsl.g:869:1: entryRuleNode_template returns [EObject current=null] : iv_ruleNode_template= ruleNode_template EOF ;
    public final EObject entryRuleNode_template() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode_template = null;


        try {
            // InternalDsl.g:869:54: (iv_ruleNode_template= ruleNode_template EOF )
            // InternalDsl.g:870:2: iv_ruleNode_template= ruleNode_template EOF
            {
             newCompositeNode(grammarAccess.getNode_templateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode_template=ruleNode_template();

            state._fsp--;

             current =iv_ruleNode_template; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode_template"


    // $ANTLR start "ruleNode_template"
    // InternalDsl.g:876:1: ruleNode_template returns [EObject current=null] : ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' ( (lv_nodeTemplate_hasInstances_39_0= ruleinstance ) ) )? otherlv_40= '}' ) ;
    public final EObject ruleNode_template() throws RecognitionException {
        EObject current = null;

        Token lv_node_template_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        EObject lv_nodeTemplate_hasInterface_10_0 = null;

        EObject lv_nodeTemplate_hasInterface_12_0 = null;

        EObject lv_nodeTemplate_hasProperty_16_0 = null;

        EObject lv_nodeTemplate_hasProperty_18_0 = null;

        EObject lv_nodeTemplate_hasAttribute_22_0 = null;

        EObject lv_nodeTemplate_hasAttribute_24_0 = null;

        EObject lv_nodeTemplate_hasRequirement_28_0 = null;

        EObject lv_nodeTemplate_hasRequirement_30_0 = null;

        EObject lv_NodeTemplate_hasRelationship_34_0 = null;

        EObject lv_NodeTemplate_hasRelationship_36_0 = null;

        EObject lv_nodeTemplate_hasInstances_39_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:882:2: ( ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' ( (lv_nodeTemplate_hasInstances_39_0= ruleinstance ) ) )? otherlv_40= '}' ) )
            // InternalDsl.g:883:2: ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' ( (lv_nodeTemplate_hasInstances_39_0= ruleinstance ) ) )? otherlv_40= '}' )
            {
            // InternalDsl.g:883:2: ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' ( (lv_nodeTemplate_hasInstances_39_0= ruleinstance ) ) )? otherlv_40= '}' )
            // InternalDsl.g:884:3: () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' ( (lv_nodeTemplate_hasInstances_39_0= ruleinstance ) ) )? otherlv_40= '}'
            {
            // InternalDsl.g:884:3: ()
            // InternalDsl.g:885:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNode_templateAccess().getNode_templateAction_0(),
            					current);
            			

            }

            // InternalDsl.g:891:3: ( (lv_node_template_name_1_0= RULE_STRING ) )
            // InternalDsl.g:892:4: (lv_node_template_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:892:4: (lv_node_template_name_1_0= RULE_STRING )
            // InternalDsl.g:893:5: lv_node_template_name_1_0= RULE_STRING
            {
            lv_node_template_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_node_template_name_1_0, grammarAccess.getNode_templateAccess().getNode_template_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNode_templateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"node_template_name",
            						lv_node_template_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getNode_templateAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:917:3: (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:918:4: otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getNode_templateAccess().getTypeKeyword_4_0());
                    			
                    // InternalDsl.g:922:4: ( (lv_type_5_0= RULE_STRING ) )
                    // InternalDsl.g:923:5: (lv_type_5_0= RULE_STRING )
                    {
                    // InternalDsl.g:923:5: (lv_type_5_0= RULE_STRING )
                    // InternalDsl.g:924:6: lv_type_5_0= RULE_STRING
                    {
                    lv_type_5_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    						newLeafNode(lv_type_5_0, grammarAccess.getNode_templateAccess().getTypeSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNode_templateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:941:3: (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:942:4: otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getNode_templateAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalDsl.g:946:4: ( (lv_description_7_0= RULE_STRING ) )
                    // InternalDsl.g:947:5: (lv_description_7_0= RULE_STRING )
                    {
                    // InternalDsl.g:947:5: (lv_description_7_0= RULE_STRING )
                    // InternalDsl.g:948:6: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    						newLeafNode(lv_description_7_0, grammarAccess.getNode_templateAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNode_templateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:965:3: (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:966:4: otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getNode_templateAccess().getInterfacesKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:974:4: ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) )
                    // InternalDsl.g:975:5: (lv_nodeTemplate_hasInterface_10_0= ruleInterface )
                    {
                    // InternalDsl.g:975:5: (lv_nodeTemplate_hasInterface_10_0= ruleInterface )
                    // InternalDsl.g:976:6: lv_nodeTemplate_hasInterface_10_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasInterfaceInterfaceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_nodeTemplate_hasInterface_10_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    						}
                    						add(
                    							current,
                    							"nodeTemplate_hasInterface",
                    							lv_nodeTemplate_hasInterface_10_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:993:4: (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==16) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalDsl.g:994:5: otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getNode_templateAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:998:5: ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) )
                    	    // InternalDsl.g:999:6: (lv_nodeTemplate_hasInterface_12_0= ruleInterface )
                    	    {
                    	    // InternalDsl.g:999:6: (lv_nodeTemplate_hasInterface_12_0= ruleInterface )
                    	    // InternalDsl.g:1000:7: lv_nodeTemplate_hasInterface_12_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasInterfaceInterfaceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_nodeTemplate_hasInterface_12_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodeTemplate_hasInterface",
                    	    								lv_nodeTemplate_hasInterface_12_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FOLLOW_31); 

                    				newLeafNode(otherlv_13, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1023:3: (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1024:4: otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,33,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getNode_templateAccess().getPropertiesKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,11,FOLLOW_32); 

                    				newLeafNode(otherlv_15, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalDsl.g:1032:4: ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) )
                    // InternalDsl.g:1033:5: (lv_nodeTemplate_hasProperty_16_0= ruleProperty )
                    {
                    // InternalDsl.g:1033:5: (lv_nodeTemplate_hasProperty_16_0= ruleProperty )
                    // InternalDsl.g:1034:6: lv_nodeTemplate_hasProperty_16_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasPropertyPropertyParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_nodeTemplate_hasProperty_16_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    						}
                    						add(
                    							current,
                    							"nodeTemplate_hasProperty",
                    							lv_nodeTemplate_hasProperty_16_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1051:4: (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==16) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalDsl.g:1052:5: otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_32); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getNode_templateAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDsl.g:1056:5: ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) )
                    	    // InternalDsl.g:1057:6: (lv_nodeTemplate_hasProperty_18_0= ruleProperty )
                    	    {
                    	    // InternalDsl.g:1057:6: (lv_nodeTemplate_hasProperty_18_0= ruleProperty )
                    	    // InternalDsl.g:1058:7: lv_nodeTemplate_hasProperty_18_0= ruleProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasPropertyPropertyParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_nodeTemplate_hasProperty_18_0=ruleProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodeTemplate_hasProperty",
                    	    								lv_nodeTemplate_hasProperty_18_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Property");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,19,FOLLOW_33); 

                    				newLeafNode(otherlv_19, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1081:3: (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1082:4: otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,34,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getNode_templateAccess().getAttributesKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,11,FOLLOW_34); 

                    				newLeafNode(otherlv_21, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalDsl.g:1090:4: ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) )
                    // InternalDsl.g:1091:5: (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute )
                    {
                    // InternalDsl.g:1091:5: (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute )
                    // InternalDsl.g:1092:6: lv_nodeTemplate_hasAttribute_22_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasAttributeAttributeParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_nodeTemplate_hasAttribute_22_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    						}
                    						add(
                    							current,
                    							"nodeTemplate_hasAttribute",
                    							lv_nodeTemplate_hasAttribute_22_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1109:4: (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==16) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalDsl.g:1110:5: otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) )
                    	    {
                    	    otherlv_23=(Token)match(input,16,FOLLOW_34); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getNode_templateAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalDsl.g:1114:5: ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) )
                    	    // InternalDsl.g:1115:6: (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute )
                    	    {
                    	    // InternalDsl.g:1115:6: (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute )
                    	    // InternalDsl.g:1116:7: lv_nodeTemplate_hasAttribute_24_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasAttributeAttributeParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_nodeTemplate_hasAttribute_24_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodeTemplate_hasAttribute",
                    	    								lv_nodeTemplate_hasAttribute_24_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,19,FOLLOW_35); 

                    				newLeafNode(otherlv_25, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1139:3: (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1140:4: otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,35,FOLLOW_11); 

                    				newLeafNode(otherlv_26, grammarAccess.getNode_templateAccess().getRequirementsKeyword_9_0());
                    			
                    otherlv_27=(Token)match(input,11,FOLLOW_36); 

                    				newLeafNode(otherlv_27, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalDsl.g:1148:4: ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) )
                    // InternalDsl.g:1149:5: (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement )
                    {
                    // InternalDsl.g:1149:5: (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement )
                    // InternalDsl.g:1150:6: lv_nodeTemplate_hasRequirement_28_0= ruleRequirement
                    {

                    						newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRequirementRequirementParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_nodeTemplate_hasRequirement_28_0=ruleRequirement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    						}
                    						add(
                    							current,
                    							"nodeTemplate_hasRequirement",
                    							lv_nodeTemplate_hasRequirement_28_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Requirement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1167:4: (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==16) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalDsl.g:1168:5: otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) )
                    	    {
                    	    otherlv_29=(Token)match(input,16,FOLLOW_36); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getNode_templateAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalDsl.g:1172:5: ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) )
                    	    // InternalDsl.g:1173:6: (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement )
                    	    {
                    	    // InternalDsl.g:1173:6: (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement )
                    	    // InternalDsl.g:1174:7: lv_nodeTemplate_hasRequirement_30_0= ruleRequirement
                    	    {

                    	    							newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRequirementRequirementParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_nodeTemplate_hasRequirement_30_0=ruleRequirement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodeTemplate_hasRequirement",
                    	    								lv_nodeTemplate_hasRequirement_30_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Requirement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,19,FOLLOW_37); 

                    				newLeafNode(otherlv_31, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1197:3: (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:1198:4: otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']'
                    {
                    otherlv_32=(Token)match(input,36,FOLLOW_7); 

                    				newLeafNode(otherlv_32, grammarAccess.getNode_templateAccess().getRelationshipsKeyword_10_0());
                    			
                    otherlv_33=(Token)match(input,15,FOLLOW_38); 

                    				newLeafNode(otherlv_33, grammarAccess.getNode_templateAccess().getLeftSquareBracketKeyword_10_1());
                    			
                    // InternalDsl.g:1206:4: ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) )
                    // InternalDsl.g:1207:5: (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship )
                    {
                    // InternalDsl.g:1207:5: (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship )
                    // InternalDsl.g:1208:6: lv_NodeTemplate_hasRelationship_34_0= ruleRelationship
                    {

                    						newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRelationshipRelationshipParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_NodeTemplate_hasRelationship_34_0=ruleRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    						}
                    						add(
                    							current,
                    							"NodeTemplate_hasRelationship",
                    							lv_NodeTemplate_hasRelationship_34_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Relationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1225:4: (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==16) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalDsl.g:1226:5: otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) )
                    	    {
                    	    otherlv_35=(Token)match(input,16,FOLLOW_38); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getNode_templateAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalDsl.g:1230:5: ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) )
                    	    // InternalDsl.g:1231:6: (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship )
                    	    {
                    	    // InternalDsl.g:1231:6: (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship )
                    	    // InternalDsl.g:1232:7: lv_NodeTemplate_hasRelationship_36_0= ruleRelationship
                    	    {

                    	    							newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRelationshipRelationshipParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_NodeTemplate_hasRelationship_36_0=ruleRelationship();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"NodeTemplate_hasRelationship",
                    	    								lv_NodeTemplate_hasRelationship_36_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Relationship");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,17,FOLLOW_39); 

                    				newLeafNode(otherlv_37, grammarAccess.getNode_templateAccess().getRightSquareBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:1255:3: (otherlv_38= ', \\n \"instances\" :' ( (lv_nodeTemplate_hasInstances_39_0= ruleinstance ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:1256:4: otherlv_38= ', \\n \"instances\" :' ( (lv_nodeTemplate_hasInstances_39_0= ruleinstance ) )
                    {
                    otherlv_38=(Token)match(input,37,FOLLOW_40); 

                    				newLeafNode(otherlv_38, grammarAccess.getNode_templateAccess().getInstancesKeyword_11_0());
                    			
                    // InternalDsl.g:1260:4: ( (lv_nodeTemplate_hasInstances_39_0= ruleinstance ) )
                    // InternalDsl.g:1261:5: (lv_nodeTemplate_hasInstances_39_0= ruleinstance )
                    {
                    // InternalDsl.g:1261:5: (lv_nodeTemplate_hasInstances_39_0= ruleinstance )
                    // InternalDsl.g:1262:6: lv_nodeTemplate_hasInstances_39_0= ruleinstance
                    {

                    						newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasInstancesInstanceParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_nodeTemplate_hasInstances_39_0=ruleinstance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    						}
                    						set(
                    							current,
                    							"nodeTemplate_hasInstances",
                    							lv_nodeTemplate_hasInstances_39_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.instance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_40=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_40, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode_template"


    // $ANTLR start "entryRuleInterface_Impl"
    // InternalDsl.g:1288:1: entryRuleInterface_Impl returns [EObject current=null] : iv_ruleInterface_Impl= ruleInterface_Impl EOF ;
    public final EObject entryRuleInterface_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface_Impl = null;


        try {
            // InternalDsl.g:1288:55: (iv_ruleInterface_Impl= ruleInterface_Impl EOF )
            // InternalDsl.g:1289:2: iv_ruleInterface_Impl= ruleInterface_Impl EOF
            {
             newCompositeNode(grammarAccess.getInterface_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface_Impl=ruleInterface_Impl();

            state._fsp--;

             current =iv_ruleInterface_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface_Impl"


    // $ANTLR start "ruleInterface_Impl"
    // InternalDsl.g:1295:1: ruleInterface_Impl returns [EObject current=null] : ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleInterface_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_interface_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_hasOperation_4_0 = null;

        EObject lv_hasOperation_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1301:2: ( ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) )
            // InternalDsl.g:1302:2: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            {
            // InternalDsl.g:1302:2: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            // InternalDsl.g:1303:3: () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}'
            {
            // InternalDsl.g:1303:3: ()
            // InternalDsl.g:1304:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInterface_ImplAccess().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1310:3: ( (lv_interface_name_1_0= RULE_STRING ) )
            // InternalDsl.g:1311:4: (lv_interface_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:1311:4: (lv_interface_name_1_0= RULE_STRING )
            // InternalDsl.g:1312:5: lv_interface_name_1_0= RULE_STRING
            {
            lv_interface_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_interface_name_1_0, grammarAccess.getInterface_ImplAccess().getInterface_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterface_ImplRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interface_name",
            						lv_interface_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getInterface_ImplAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getInterface_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:1336:3: ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING||LA37_0==29) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:1337:4: ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )*
                    {
                    // InternalDsl.g:1337:4: ( (lv_hasOperation_4_0= ruleOperation ) )
                    // InternalDsl.g:1338:5: (lv_hasOperation_4_0= ruleOperation )
                    {
                    // InternalDsl.g:1338:5: (lv_hasOperation_4_0= ruleOperation )
                    // InternalDsl.g:1339:6: lv_hasOperation_4_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getInterface_ImplAccess().getHasOperationOperationParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_hasOperation_4_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInterface_ImplRule());
                    						}
                    						add(
                    							current,
                    							"hasOperation",
                    							lv_hasOperation_4_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1356:4: (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==16) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalDsl.g:1357:5: otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_42); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getInterface_ImplAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDsl.g:1361:5: ( (lv_hasOperation_6_0= ruleOperation ) )
                    	    // InternalDsl.g:1362:6: (lv_hasOperation_6_0= ruleOperation )
                    	    {
                    	    // InternalDsl.g:1362:6: (lv_hasOperation_6_0= ruleOperation )
                    	    // InternalDsl.g:1363:7: lv_hasOperation_6_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getInterface_ImplAccess().getHasOperationOperationParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_hasOperation_6_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInterface_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"hasOperation",
                    	    								lv_hasOperation_6_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInterface_ImplAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface_Impl"


    // $ANTLR start "entryRuleProperty"
    // InternalDsl.g:1390:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalDsl.g:1390:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalDsl.g:1391:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDsl.g:1397:1: ruleProperty returns [EObject current=null] : ( () otherlv_1= 'Property' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? (otherlv_16= 'property_name' ( (lv_property_name_17_0= ruleEString ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_parameter_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;

        AntlrDatatypeRuleToken lv_required_11_0 = null;

        AntlrDatatypeRuleToken lv_default_13_0 = null;

        AntlrDatatypeRuleToken lv_status_15_0 = null;

        AntlrDatatypeRuleToken lv_property_name_17_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1403:2: ( ( () otherlv_1= 'Property' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? (otherlv_16= 'property_name' ( (lv_property_name_17_0= ruleEString ) ) )? otherlv_18= '}' ) )
            // InternalDsl.g:1404:2: ( () otherlv_1= 'Property' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? (otherlv_16= 'property_name' ( (lv_property_name_17_0= ruleEString ) ) )? otherlv_18= '}' )
            {
            // InternalDsl.g:1404:2: ( () otherlv_1= 'Property' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? (otherlv_16= 'property_name' ( (lv_property_name_17_0= ruleEString ) ) )? otherlv_18= '}' )
            // InternalDsl.g:1405:3: () otherlv_1= 'Property' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? (otherlv_16= 'property_name' ( (lv_property_name_17_0= ruleEString ) ) )? otherlv_18= '}'
            {
            // InternalDsl.g:1405:3: ()
            // InternalDsl.g:1406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
            		
            // InternalDsl.g:1416:3: ( (lv_parameter_name_2_0= ruleEString ) )
            // InternalDsl.g:1417:4: (lv_parameter_name_2_0= ruleEString )
            {
            // InternalDsl.g:1417:4: (lv_parameter_name_2_0= ruleEString )
            // InternalDsl.g:1418:5: lv_parameter_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getParameter_nameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_parameter_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"parameter_name",
            						lv_parameter_name_2_0,
            						"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:1439:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==23) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:1440:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getTypeKeyword_4_0());
                    			
                    // InternalDsl.g:1444:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalDsl.g:1445:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalDsl.g:1445:5: (lv_type_5_0= ruleEString )
                    // InternalDsl.g:1446:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1464:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==24) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:1465:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalDsl.g:1469:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDsl.g:1470:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDsl.g:1470:5: (lv_description_7_0= ruleEString )
                    // InternalDsl.g:1471:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1489:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:1490:4: otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getValueKeyword_6_0());
                    			
                    // InternalDsl.g:1494:4: ( (lv_value_9_0= ruleEString ) )
                    // InternalDsl.g:1495:5: (lv_value_9_0= ruleEString )
                    {
                    // InternalDsl.g:1495:5: (lv_value_9_0= ruleEString )
                    // InternalDsl.g:1496:6: lv_value_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getValueEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_value_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1514:3: (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==26) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:1515:4: otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getPropertyAccess().getRequiredKeyword_7_0());
                    			
                    // InternalDsl.g:1519:4: ( (lv_required_11_0= ruleEString ) )
                    // InternalDsl.g:1520:5: (lv_required_11_0= ruleEString )
                    {
                    // InternalDsl.g:1520:5: (lv_required_11_0= ruleEString )
                    // InternalDsl.g:1521:6: lv_required_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getRequiredEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_required_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"required",
                    							lv_required_11_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1539:3: (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==27) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:1540:4: otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getPropertyAccess().getDefaultKeyword_8_0());
                    			
                    // InternalDsl.g:1544:4: ( (lv_default_13_0= ruleEString ) )
                    // InternalDsl.g:1545:5: (lv_default_13_0= ruleEString )
                    {
                    // InternalDsl.g:1545:5: (lv_default_13_0= ruleEString )
                    // InternalDsl.g:1546:6: lv_default_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getDefaultEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_default_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_13_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1564:3: (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==28) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:1565:4: otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getPropertyAccess().getStatusKeyword_9_0());
                    			
                    // InternalDsl.g:1569:4: ( (lv_status_15_0= ruleEString ) )
                    // InternalDsl.g:1570:5: (lv_status_15_0= ruleEString )
                    {
                    // InternalDsl.g:1570:5: (lv_status_15_0= ruleEString )
                    // InternalDsl.g:1571:6: lv_status_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getStatusEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_status_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"status",
                    							lv_status_15_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1589:3: (otherlv_16= 'property_name' ( (lv_property_name_17_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==39) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:1590:4: otherlv_16= 'property_name' ( (lv_property_name_17_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,39,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getPropertyAccess().getProperty_nameKeyword_10_0());
                    			
                    // InternalDsl.g:1594:4: ( (lv_property_name_17_0= ruleEString ) )
                    // InternalDsl.g:1595:5: (lv_property_name_17_0= ruleEString )
                    {
                    // InternalDsl.g:1595:5: (lv_property_name_17_0= ruleEString )
                    // InternalDsl.g:1596:6: lv_property_name_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getProperty_nameEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_property_name_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"property_name",
                    							lv_property_name_17_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAttribute"
    // InternalDsl.g:1622:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDsl.g:1622:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDsl.g:1623:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDsl.g:1629:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_parameter_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;

        AntlrDatatypeRuleToken lv_required_11_0 = null;

        AntlrDatatypeRuleToken lv_default_13_0 = null;

        AntlrDatatypeRuleToken lv_status_15_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1635:2: ( ( () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}' ) )
            // InternalDsl.g:1636:2: ( () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}' )
            {
            // InternalDsl.g:1636:2: ( () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}' )
            // InternalDsl.g:1637:3: () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}'
            {
            // InternalDsl.g:1637:3: ()
            // InternalDsl.g:1638:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
            		
            // InternalDsl.g:1648:3: ( (lv_parameter_name_2_0= ruleEString ) )
            // InternalDsl.g:1649:4: (lv_parameter_name_2_0= ruleEString )
            {
            // InternalDsl.g:1649:4: (lv_parameter_name_2_0= ruleEString )
            // InternalDsl.g:1650:5: lv_parameter_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getParameter_nameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_parameter_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"parameter_name",
            						lv_parameter_name_2_0,
            						"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:1671:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==23) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:1672:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getTypeKeyword_4_0());
                    			
                    // InternalDsl.g:1676:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalDsl.g:1677:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalDsl.g:1677:5: (lv_type_5_0= ruleEString )
                    // InternalDsl.g:1678:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1696:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:1697:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalDsl.g:1701:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDsl.g:1702:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDsl.g:1702:5: (lv_description_7_0= ruleEString )
                    // InternalDsl.g:1703:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1721:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==25) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:1722:4: otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getValueKeyword_6_0());
                    			
                    // InternalDsl.g:1726:4: ( (lv_value_9_0= ruleEString ) )
                    // InternalDsl.g:1727:5: (lv_value_9_0= ruleEString )
                    {
                    // InternalDsl.g:1727:5: (lv_value_9_0= ruleEString )
                    // InternalDsl.g:1728:6: lv_value_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getValueEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_value_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1746:3: (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==26) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:1747:4: otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getRequiredKeyword_7_0());
                    			
                    // InternalDsl.g:1751:4: ( (lv_required_11_0= ruleEString ) )
                    // InternalDsl.g:1752:5: (lv_required_11_0= ruleEString )
                    {
                    // InternalDsl.g:1752:5: (lv_required_11_0= ruleEString )
                    // InternalDsl.g:1753:6: lv_required_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getRequiredEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_required_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"required",
                    							lv_required_11_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1771:3: (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==27) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDsl.g:1772:4: otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getDefaultKeyword_8_0());
                    			
                    // InternalDsl.g:1776:4: ( (lv_default_13_0= ruleEString ) )
                    // InternalDsl.g:1777:5: (lv_default_13_0= ruleEString )
                    {
                    // InternalDsl.g:1777:5: (lv_default_13_0= ruleEString )
                    // InternalDsl.g:1778:6: lv_default_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getDefaultEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_default_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_13_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1796:3: (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==28) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDsl.g:1797:4: otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getStatusKeyword_9_0());
                    			
                    // InternalDsl.g:1801:4: ( (lv_status_15_0= ruleEString ) )
                    // InternalDsl.g:1802:5: (lv_status_15_0= ruleEString )
                    {
                    // InternalDsl.g:1802:5: (lv_status_15_0= ruleEString )
                    // InternalDsl.g:1803:6: lv_status_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getStatusEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_status_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"status",
                    							lv_status_15_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRequirement"
    // InternalDsl.g:1829:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalDsl.g:1829:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalDsl.g:1830:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalDsl.g:1836:1: ruleRequirement returns [EObject current=null] : ( () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= ruleEString ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= ruleEString ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= ruleEString ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_occurances_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_requirement_name_4_0 = null;

        AntlrDatatypeRuleToken lv_node_6_0 = null;

        AntlrDatatypeRuleToken lv_capability_Type_name_8_0 = null;

        AntlrDatatypeRuleToken lv_occurances_11_0 = null;

        AntlrDatatypeRuleToken lv_occurances_13_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1842:2: ( ( () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= ruleEString ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= ruleEString ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= ruleEString ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_occurances_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalDsl.g:1843:2: ( () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= ruleEString ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= ruleEString ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= ruleEString ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_occurances_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalDsl.g:1843:2: ( () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= ruleEString ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= ruleEString ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= ruleEString ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_occurances_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalDsl.g:1844:3: () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= ruleEString ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= ruleEString ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= ruleEString ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_occurances_13_0= ruleEString ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalDsl.g:1844:3: ()
            // InternalDsl.g:1845:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementAccess().getRequirementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getRequirementKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1859:3: (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==42) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDsl.g:1860:4: otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getRequirement_nameKeyword_3_0());
                    			
                    // InternalDsl.g:1864:4: ( (lv_requirement_name_4_0= ruleEString ) )
                    // InternalDsl.g:1865:5: (lv_requirement_name_4_0= ruleEString )
                    {
                    // InternalDsl.g:1865:5: (lv_requirement_name_4_0= ruleEString )
                    // InternalDsl.g:1866:6: lv_requirement_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getRequirement_nameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_requirement_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"requirement_name",
                    							lv_requirement_name_4_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1884:3: (otherlv_5= 'node' ( (lv_node_6_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==43) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDsl.g:1885:4: otherlv_5= 'node' ( (lv_node_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getNodeKeyword_4_0());
                    			
                    // InternalDsl.g:1889:4: ( (lv_node_6_0= ruleEString ) )
                    // InternalDsl.g:1890:5: (lv_node_6_0= ruleEString )
                    {
                    // InternalDsl.g:1890:5: (lv_node_6_0= ruleEString )
                    // InternalDsl.g:1891:6: lv_node_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getNodeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_node_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"node",
                    							lv_node_6_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1909:3: (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==44) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDsl.g:1910:4: otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,44,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getCapability_Type_nameKeyword_5_0());
                    			
                    // InternalDsl.g:1914:4: ( (lv_capability_Type_name_8_0= ruleEString ) )
                    // InternalDsl.g:1915:5: (lv_capability_Type_name_8_0= ruleEString )
                    {
                    // InternalDsl.g:1915:5: (lv_capability_Type_name_8_0= ruleEString )
                    // InternalDsl.g:1916:6: lv_capability_Type_name_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getCapability_Type_nameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_capability_Type_name_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"capability_Type_name",
                    							lv_capability_Type_name_8_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1934:3: (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_occurances_13_0= ruleEString ) ) )* otherlv_14= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==45) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDsl.g:1935:4: otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_occurances_13_0= ruleEString ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,45,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getOccurancesKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,11,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:1943:4: ( (lv_occurances_11_0= ruleEString ) )
                    // InternalDsl.g:1944:5: (lv_occurances_11_0= ruleEString )
                    {
                    // InternalDsl.g:1944:5: (lv_occurances_11_0= ruleEString )
                    // InternalDsl.g:1945:6: lv_occurances_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getOccurancesEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_occurances_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						add(
                    							current,
                    							"occurances",
                    							lv_occurances_11_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1962:4: (otherlv_12= ',' ( (lv_occurances_13_0= ruleEString ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==16) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalDsl.g:1963:5: otherlv_12= ',' ( (lv_occurances_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FOLLOW_12); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRequirementAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:1967:5: ( (lv_occurances_13_0= ruleEString ) )
                    	    // InternalDsl.g:1968:6: (lv_occurances_13_0= ruleEString )
                    	    {
                    	    // InternalDsl.g:1968:6: (lv_occurances_13_0= ruleEString )
                    	    // InternalDsl.g:1969:7: lv_occurances_13_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getOccurancesEStringParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_occurances_13_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"occurances",
                    	    								lv_occurances_13_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleRelationship_Impl"
    // InternalDsl.g:2000:1: entryRuleRelationship_Impl returns [EObject current=null] : iv_ruleRelationship_Impl= ruleRelationship_Impl EOF ;
    public final EObject entryRuleRelationship_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship_Impl = null;


        try {
            // InternalDsl.g:2000:58: (iv_ruleRelationship_Impl= ruleRelationship_Impl EOF )
            // InternalDsl.g:2001:2: iv_ruleRelationship_Impl= ruleRelationship_Impl EOF
            {
             newCompositeNode(grammarAccess.getRelationship_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship_Impl=ruleRelationship_Impl();

            state._fsp--;

             current =iv_ruleRelationship_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship_Impl"


    // $ANTLR start "ruleRelationship_Impl"
    // InternalDsl.g:2007:1: ruleRelationship_Impl returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleRelationship_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token lv_validSource_5_0=null;
        Token otherlv_6=null;
        Token lv_validTarget_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_relation_haSourceInterface_10_0 = null;

        EObject lv_relation_haSourceInterface_12_0 = null;

        EObject lv_relation_hasTargetInterface_16_0 = null;

        EObject lv_relation_hasTargetInterface_18_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2013:2: ( ( () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalDsl.g:2014:2: ( () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalDsl.g:2014:2: ( () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalDsl.g:2015:3: () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalDsl.g:2015:3: ()
            // InternalDsl.g:2016:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelationship_ImplAccess().getRelationshipAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationship_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDsl.g:2026:3: (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==30) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDsl.g:2027:4: otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelationship_ImplAccess().getTypeKeyword_2_0());
                    			
                    // InternalDsl.g:2031:4: ( (lv_type_3_0= RULE_STRING ) )
                    // InternalDsl.g:2032:5: (lv_type_3_0= RULE_STRING )
                    {
                    // InternalDsl.g:2032:5: (lv_type_3_0= RULE_STRING )
                    // InternalDsl.g:2033:6: lv_type_3_0= RULE_STRING
                    {
                    lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

                    						newLeafNode(lv_type_3_0, grammarAccess.getRelationship_ImplAccess().getTypeSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationship_ImplRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2050:3: (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==46) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDsl.g:2051:4: otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelationship_ImplAccess().getSourceKeyword_3_0());
                    			
                    // InternalDsl.g:2055:4: ( (lv_validSource_5_0= RULE_STRING ) )
                    // InternalDsl.g:2056:5: (lv_validSource_5_0= RULE_STRING )
                    {
                    // InternalDsl.g:2056:5: (lv_validSource_5_0= RULE_STRING )
                    // InternalDsl.g:2057:6: lv_validSource_5_0= RULE_STRING
                    {
                    lv_validSource_5_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

                    						newLeafNode(lv_validSource_5_0, grammarAccess.getRelationship_ImplAccess().getValidSourceSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationship_ImplRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"validSource",
                    							lv_validSource_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2074:3: (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==47) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalDsl.g:2075:4: otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationship_ImplAccess().getTargetKeyword_4_0());
                    			
                    // InternalDsl.g:2079:4: ( (lv_validTarget_7_0= RULE_STRING ) )
                    // InternalDsl.g:2080:5: (lv_validTarget_7_0= RULE_STRING )
                    {
                    // InternalDsl.g:2080:5: (lv_validTarget_7_0= RULE_STRING )
                    // InternalDsl.g:2081:6: lv_validTarget_7_0= RULE_STRING
                    {
                    lv_validTarget_7_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

                    						newLeafNode(lv_validTarget_7_0, grammarAccess.getRelationship_ImplAccess().getValidTargetSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationship_ImplRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"validTarget",
                    							lv_validTarget_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2098:3: (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==48) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDsl.g:2099:4: otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelationship_ImplAccess().getSource_interfacesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getRelationship_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDsl.g:2107:4: ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) )
                    // InternalDsl.g:2108:5: (lv_relation_haSourceInterface_10_0= ruleSource_interface )
                    {
                    // InternalDsl.g:2108:5: (lv_relation_haSourceInterface_10_0= ruleSource_interface )
                    // InternalDsl.g:2109:6: lv_relation_haSourceInterface_10_0= ruleSource_interface
                    {

                    						newCompositeNode(grammarAccess.getRelationship_ImplAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_relation_haSourceInterface_10_0=ruleSource_interface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationship_ImplRule());
                    						}
                    						add(
                    							current,
                    							"relation_haSourceInterface",
                    							lv_relation_haSourceInterface_10_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Source_interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2126:4: (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==16) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalDsl.g:2127:5: otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getRelationship_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:2131:5: ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) )
                    	    // InternalDsl.g:2132:6: (lv_relation_haSourceInterface_12_0= ruleSource_interface )
                    	    {
                    	    // InternalDsl.g:2132:6: (lv_relation_haSourceInterface_12_0= ruleSource_interface )
                    	    // InternalDsl.g:2133:7: lv_relation_haSourceInterface_12_0= ruleSource_interface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationship_ImplAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_relation_haSourceInterface_12_0=ruleSource_interface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationship_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation_haSourceInterface",
                    	    								lv_relation_haSourceInterface_12_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Source_interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FOLLOW_58); 

                    				newLeafNode(otherlv_13, grammarAccess.getRelationship_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2156:3: (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==49) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDsl.g:2157:4: otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,49,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getRelationship_ImplAccess().getTarget_interfacesKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getRelationship_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:2165:4: ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) )
                    // InternalDsl.g:2166:5: (lv_relation_hasTargetInterface_16_0= ruleTarget_interface )
                    {
                    // InternalDsl.g:2166:5: (lv_relation_hasTargetInterface_16_0= ruleTarget_interface )
                    // InternalDsl.g:2167:6: lv_relation_hasTargetInterface_16_0= ruleTarget_interface
                    {

                    						newCompositeNode(grammarAccess.getRelationship_ImplAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_relation_hasTargetInterface_16_0=ruleTarget_interface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationship_ImplRule());
                    						}
                    						add(
                    							current,
                    							"relation_hasTargetInterface",
                    							lv_relation_hasTargetInterface_16_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Target_interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2184:4: (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==16) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalDsl.g:2185:5: otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getRelationship_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:2189:5: ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) )
                    	    // InternalDsl.g:2190:6: (lv_relation_hasTargetInterface_18_0= ruleTarget_interface )
                    	    {
                    	    // InternalDsl.g:2190:6: (lv_relation_hasTargetInterface_18_0= ruleTarget_interface )
                    	    // InternalDsl.g:2191:7: lv_relation_hasTargetInterface_18_0= ruleTarget_interface
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelationship_ImplAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_relation_hasTargetInterface_18_0=ruleTarget_interface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelationship_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation_hasTargetInterface",
                    	    								lv_relation_hasTargetInterface_18_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Target_interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_19, grammarAccess.getRelationship_ImplAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getRelationship_ImplAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship_Impl"


    // $ANTLR start "entryRuleinstance"
    // InternalDsl.g:2222:1: entryRuleinstance returns [EObject current=null] : iv_ruleinstance= ruleinstance EOF ;
    public final EObject entryRuleinstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinstance = null;


        try {
            // InternalDsl.g:2222:49: (iv_ruleinstance= ruleinstance EOF )
            // InternalDsl.g:2223:2: iv_ruleinstance= ruleinstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleinstance=ruleinstance();

            state._fsp--;

             current =iv_ruleinstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinstance"


    // $ANTLR start "ruleinstance"
    // InternalDsl.g:2229:1: ruleinstance returns [EObject current=null] : ( () otherlv_1= 'instance' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleinstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_parameter_name_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;

        AntlrDatatypeRuleToken lv_required_11_0 = null;

        AntlrDatatypeRuleToken lv_default_13_0 = null;

        AntlrDatatypeRuleToken lv_status_15_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2235:2: ( ( () otherlv_1= 'instance' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}' ) )
            // InternalDsl.g:2236:2: ( () otherlv_1= 'instance' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}' )
            {
            // InternalDsl.g:2236:2: ( () otherlv_1= 'instance' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}' )
            // InternalDsl.g:2237:3: () otherlv_1= 'instance' ( (lv_parameter_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )? otherlv_16= '}'
            {
            // InternalDsl.g:2237:3: ()
            // InternalDsl.g:2238:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstanceAccess().getInstanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getInstanceAccess().getInstanceKeyword_1());
            		
            // InternalDsl.g:2248:3: ( (lv_parameter_name_2_0= ruleEString ) )
            // InternalDsl.g:2249:4: (lv_parameter_name_2_0= ruleEString )
            {
            // InternalDsl.g:2249:4: (lv_parameter_name_2_0= ruleEString )
            // InternalDsl.g:2250:5: lv_parameter_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInstanceAccess().getParameter_nameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_parameter_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstanceRule());
            					}
            					set(
            						current,
            						"parameter_name",
            						lv_parameter_name_2_0,
            						"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:2271:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==23) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalDsl.g:2272:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getInstanceAccess().getTypeKeyword_4_0());
                    			
                    // InternalDsl.g:2276:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalDsl.g:2277:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalDsl.g:2277:5: (lv_type_5_0= ruleEString )
                    // InternalDsl.g:2278:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInstanceAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2296:3: (otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==24) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDsl.g:2297:4: otherlv_6= 'description' ( (lv_description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getInstanceAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalDsl.g:2301:4: ( (lv_description_7_0= ruleEString ) )
                    // InternalDsl.g:2302:5: (lv_description_7_0= ruleEString )
                    {
                    // InternalDsl.g:2302:5: (lv_description_7_0= ruleEString )
                    // InternalDsl.g:2303:6: lv_description_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInstanceAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_description_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_7_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2321:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==25) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalDsl.g:2322:4: otherlv_8= 'value' ( (lv_value_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getInstanceAccess().getValueKeyword_6_0());
                    			
                    // InternalDsl.g:2326:4: ( (lv_value_9_0= ruleEString ) )
                    // InternalDsl.g:2327:5: (lv_value_9_0= ruleEString )
                    {
                    // InternalDsl.g:2327:5: (lv_value_9_0= ruleEString )
                    // InternalDsl.g:2328:6: lv_value_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInstanceAccess().getValueEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_value_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2346:3: (otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==26) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDsl.g:2347:4: otherlv_10= 'required' ( (lv_required_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getInstanceAccess().getRequiredKeyword_7_0());
                    			
                    // InternalDsl.g:2351:4: ( (lv_required_11_0= ruleEString ) )
                    // InternalDsl.g:2352:5: (lv_required_11_0= ruleEString )
                    {
                    // InternalDsl.g:2352:5: (lv_required_11_0= ruleEString )
                    // InternalDsl.g:2353:6: lv_required_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInstanceAccess().getRequiredEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_required_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceRule());
                    						}
                    						set(
                    							current,
                    							"required",
                    							lv_required_11_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2371:3: (otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==27) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDsl.g:2372:4: otherlv_12= 'default' ( (lv_default_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getInstanceAccess().getDefaultKeyword_8_0());
                    			
                    // InternalDsl.g:2376:4: ( (lv_default_13_0= ruleEString ) )
                    // InternalDsl.g:2377:5: (lv_default_13_0= ruleEString )
                    {
                    // InternalDsl.g:2377:5: (lv_default_13_0= ruleEString )
                    // InternalDsl.g:2378:6: lv_default_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInstanceAccess().getDefaultEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_default_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_13_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2396:3: (otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==28) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDsl.g:2397:4: otherlv_14= 'status' ( (lv_status_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getInstanceAccess().getStatusKeyword_9_0());
                    			
                    // InternalDsl.g:2401:4: ( (lv_status_15_0= ruleEString ) )
                    // InternalDsl.g:2402:5: (lv_status_15_0= ruleEString )
                    {
                    // InternalDsl.g:2402:5: (lv_status_15_0= ruleEString )
                    // InternalDsl.g:2403:6: lv_status_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInstanceAccess().getStatusEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_status_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInstanceRule());
                    						}
                    						set(
                    							current,
                    							"status",
                    							lv_status_15_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinstance"


    // $ANTLR start "entryRuleOperation"
    // InternalDsl.g:2429:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalDsl.g:2429:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalDsl.g:2430:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalDsl.g:2436:1: ruleOperation returns [EObject current=null] : ( () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_operation_name_1_0=null;
        Token otherlv_2=null;
        Token lv_script_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:2442:2: ( ( () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )? ) )
            // InternalDsl.g:2443:2: ( () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )? )
            {
            // InternalDsl.g:2443:2: ( () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )? )
            // InternalDsl.g:2444:3: () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )?
            {
            // InternalDsl.g:2444:3: ()
            // InternalDsl.g:2445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            // InternalDsl.g:2451:3: ( (lv_operation_name_1_0= RULE_STRING ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_STRING) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalDsl.g:2452:4: (lv_operation_name_1_0= RULE_STRING )
                    {
                    // InternalDsl.g:2452:4: (lv_operation_name_1_0= RULE_STRING )
                    // InternalDsl.g:2453:5: lv_operation_name_1_0= RULE_STRING
                    {
                    lv_operation_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

                    					newLeafNode(lv_operation_name_1_0, grammarAccess.getOperationAccess().getOperation_nameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"operation_name",
                    						lv_operation_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,29,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getColonKeyword_2());
            		
            // InternalDsl.g:2473:3: ( (lv_script_3_0= RULE_STRING ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_STRING) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalDsl.g:2474:4: (lv_script_3_0= RULE_STRING )
                    {
                    // InternalDsl.g:2474:4: (lv_script_3_0= RULE_STRING )
                    // InternalDsl.g:2475:5: lv_script_3_0= RULE_STRING
                    {
                    lv_script_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_script_3_0, grammarAccess.getOperationAccess().getScriptSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"script",
                    						lv_script_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSource_interface"
    // InternalDsl.g:2495:1: entryRuleSource_interface returns [EObject current=null] : iv_ruleSource_interface= ruleSource_interface EOF ;
    public final EObject entryRuleSource_interface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource_interface = null;


        try {
            // InternalDsl.g:2495:57: (iv_ruleSource_interface= ruleSource_interface EOF )
            // InternalDsl.g:2496:2: iv_ruleSource_interface= ruleSource_interface EOF
            {
             newCompositeNode(grammarAccess.getSource_interfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSource_interface=ruleSource_interface();

            state._fsp--;

             current =iv_ruleSource_interface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSource_interface"


    // $ANTLR start "ruleSource_interface"
    // InternalDsl.g:2502:1: ruleSource_interface returns [EObject current=null] : ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleSource_interface() throws RecognitionException {
        EObject current = null;

        Token lv_interface_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_hasOperation_4_0 = null;

        EObject lv_hasOperation_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2508:2: ( ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) )
            // InternalDsl.g:2509:2: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            {
            // InternalDsl.g:2509:2: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            // InternalDsl.g:2510:3: () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}'
            {
            // InternalDsl.g:2510:3: ()
            // InternalDsl.g:2511:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSource_interfaceAccess().getSource_interfaceAction_0(),
            					current);
            			

            }

            // InternalDsl.g:2517:3: ( (lv_interface_name_1_0= RULE_STRING ) )
            // InternalDsl.g:2518:4: (lv_interface_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:2518:4: (lv_interface_name_1_0= RULE_STRING )
            // InternalDsl.g:2519:5: lv_interface_name_1_0= RULE_STRING
            {
            lv_interface_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

            					newLeafNode(lv_interface_name_1_0, grammarAccess.getSource_interfaceAccess().getInterface_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSource_interfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interface_name",
            						lv_interface_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getSource_interfaceAccess().getSpaceColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getSource_interfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:2543:3: ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_STRING||LA72_0==29) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalDsl.g:2544:4: ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )*
                    {
                    // InternalDsl.g:2544:4: ( (lv_hasOperation_4_0= ruleOperation ) )
                    // InternalDsl.g:2545:5: (lv_hasOperation_4_0= ruleOperation )
                    {
                    // InternalDsl.g:2545:5: (lv_hasOperation_4_0= ruleOperation )
                    // InternalDsl.g:2546:6: lv_hasOperation_4_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getSource_interfaceAccess().getHasOperationOperationParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_hasOperation_4_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSource_interfaceRule());
                    						}
                    						add(
                    							current,
                    							"hasOperation",
                    							lv_hasOperation_4_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2563:4: (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==16) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalDsl.g:2564:5: otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_42); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSource_interfaceAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDsl.g:2568:5: ( (lv_hasOperation_6_0= ruleOperation ) )
                    	    // InternalDsl.g:2569:6: (lv_hasOperation_6_0= ruleOperation )
                    	    {
                    	    // InternalDsl.g:2569:6: (lv_hasOperation_6_0= ruleOperation )
                    	    // InternalDsl.g:2570:7: lv_hasOperation_6_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getSource_interfaceAccess().getHasOperationOperationParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_hasOperation_6_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSource_interfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"hasOperation",
                    	    								lv_hasOperation_6_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSource_interfaceAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSource_interface"


    // $ANTLR start "entryRuleTarget_interface"
    // InternalDsl.g:2597:1: entryRuleTarget_interface returns [EObject current=null] : iv_ruleTarget_interface= ruleTarget_interface EOF ;
    public final EObject entryRuleTarget_interface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget_interface = null;


        try {
            // InternalDsl.g:2597:57: (iv_ruleTarget_interface= ruleTarget_interface EOF )
            // InternalDsl.g:2598:2: iv_ruleTarget_interface= ruleTarget_interface EOF
            {
             newCompositeNode(grammarAccess.getTarget_interfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget_interface=ruleTarget_interface();

            state._fsp--;

             current =iv_ruleTarget_interface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTarget_interface"


    // $ANTLR start "ruleTarget_interface"
    // InternalDsl.g:2604:1: ruleTarget_interface returns [EObject current=null] : ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleTarget_interface() throws RecognitionException {
        EObject current = null;

        Token lv_interface_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_hasOperation_6_0 = null;

        EObject lv_hasOperation_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2610:2: ( ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalDsl.g:2611:2: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalDsl.g:2611:2: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalDsl.g:2612:3: () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalDsl.g:2612:3: ()
            // InternalDsl.g:2613:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTarget_interfaceAccess().getTarget_interfaceAction_0(),
            					current);
            			

            }

            // InternalDsl.g:2619:3: ( (lv_interface_name_1_0= RULE_STRING ) )
            // InternalDsl.g:2620:4: (lv_interface_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:2620:4: (lv_interface_name_1_0= RULE_STRING )
            // InternalDsl.g:2621:5: lv_interface_name_1_0= RULE_STRING
            {
            lv_interface_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_61); 

            					newLeafNode(lv_interface_name_1_0, grammarAccess.getTarget_interfaceAccess().getInterface_nameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTarget_interfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interface_name",
            						lv_interface_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTarget_interfaceAccess().getSpaceSpaceColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_62); 

            			newLeafNode(otherlv_3, grammarAccess.getTarget_interfaceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:2645:3: (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==53) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalDsl.g:2646:4: otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getTarget_interfaceAccess().getHasOperationKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,11,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getTarget_interfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:2654:4: ( (lv_hasOperation_6_0= ruleOperation ) )
                    // InternalDsl.g:2655:5: (lv_hasOperation_6_0= ruleOperation )
                    {
                    // InternalDsl.g:2655:5: (lv_hasOperation_6_0= ruleOperation )
                    // InternalDsl.g:2656:6: lv_hasOperation_6_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getTarget_interfaceAccess().getHasOperationOperationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_hasOperation_6_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTarget_interfaceRule());
                    						}
                    						add(
                    							current,
                    							"hasOperation",
                    							lv_hasOperation_6_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2673:4: (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==16) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // InternalDsl.g:2674:5: otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_42); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTarget_interfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:2678:5: ( (lv_hasOperation_8_0= ruleOperation ) )
                    	    // InternalDsl.g:2679:6: (lv_hasOperation_8_0= ruleOperation )
                    	    {
                    	    // InternalDsl.g:2679:6: (lv_hasOperation_8_0= ruleOperation )
                    	    // InternalDsl.g:2680:7: lv_hasOperation_8_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getTarget_interfaceAccess().getHasOperationOperationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_hasOperation_8_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTarget_interfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"hasOperation",
                    	    								lv_hasOperation_8_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getTarget_interfaceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTarget_interfaceAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTarget_interface"


    // $ANTLR start "entryRuleContained_in"
    // InternalDsl.g:2711:1: entryRuleContained_in returns [EObject current=null] : iv_ruleContained_in= ruleContained_in EOF ;
    public final EObject entryRuleContained_in() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContained_in = null;


        try {
            // InternalDsl.g:2711:53: (iv_ruleContained_in= ruleContained_in EOF )
            // InternalDsl.g:2712:2: iv_ruleContained_in= ruleContained_in EOF
            {
             newCompositeNode(grammarAccess.getContained_inRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContained_in=ruleContained_in();

            state._fsp--;

             current =iv_ruleContained_in; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContained_in"


    // $ANTLR start "ruleContained_in"
    // InternalDsl.g:2718:1: ruleContained_in returns [EObject current=null] : ( () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleContained_in() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_validSource_6_0 = null;

        AntlrDatatypeRuleToken lv_validTarget_8_0 = null;

        EObject lv_relation_haSourceInterface_11_0 = null;

        EObject lv_relation_haSourceInterface_13_0 = null;

        EObject lv_relation_hasTargetInterface_17_0 = null;

        EObject lv_relation_hasTargetInterface_19_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2724:2: ( ( () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalDsl.g:2725:2: ( () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalDsl.g:2725:2: ( () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalDsl.g:2726:3: () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalDsl.g:2726:3: ()
            // InternalDsl.g:2727:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContained_inAccess().getContained_inAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getContained_inAccess().getContained_inKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getContained_inAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2741:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==23) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalDsl.g:2742:4: otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getContained_inAccess().getTypeKeyword_3_0());
                    			
                    // InternalDsl.g:2746:4: ( (lv_type_4_0= ruleEString ) )
                    // InternalDsl.g:2747:5: (lv_type_4_0= ruleEString )
                    {
                    // InternalDsl.g:2747:5: (lv_type_4_0= ruleEString )
                    // InternalDsl.g:2748:6: lv_type_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getContained_inAccess().getTypeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_type_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContained_inRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2766:3: (otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==55) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalDsl.g:2767:4: otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getContained_inAccess().getValidSourceKeyword_4_0());
                    			
                    // InternalDsl.g:2771:4: ( (lv_validSource_6_0= ruleEString ) )
                    // InternalDsl.g:2772:5: (lv_validSource_6_0= ruleEString )
                    {
                    // InternalDsl.g:2772:5: (lv_validSource_6_0= ruleEString )
                    // InternalDsl.g:2773:6: lv_validSource_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getContained_inAccess().getValidSourceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_validSource_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContained_inRule());
                    						}
                    						set(
                    							current,
                    							"validSource",
                    							lv_validSource_6_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2791:3: (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==56) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalDsl.g:2792:4: otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,56,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getContained_inAccess().getValidTargetKeyword_5_0());
                    			
                    // InternalDsl.g:2796:4: ( (lv_validTarget_8_0= ruleEString ) )
                    // InternalDsl.g:2797:5: (lv_validTarget_8_0= ruleEString )
                    {
                    // InternalDsl.g:2797:5: (lv_validTarget_8_0= ruleEString )
                    // InternalDsl.g:2798:6: lv_validTarget_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getContained_inAccess().getValidTargetEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_validTarget_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContained_inRule());
                    						}
                    						set(
                    							current,
                    							"validTarget",
                    							lv_validTarget_8_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2816:3: (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==57) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalDsl.g:2817:4: otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,57,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getContained_inAccess().getRelation_haSourceInterfaceKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getContained_inAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:2825:4: ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) )
                    // InternalDsl.g:2826:5: (lv_relation_haSourceInterface_11_0= ruleSource_interface )
                    {
                    // InternalDsl.g:2826:5: (lv_relation_haSourceInterface_11_0= ruleSource_interface )
                    // InternalDsl.g:2827:6: lv_relation_haSourceInterface_11_0= ruleSource_interface
                    {

                    						newCompositeNode(grammarAccess.getContained_inAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_relation_haSourceInterface_11_0=ruleSource_interface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContained_inRule());
                    						}
                    						add(
                    							current,
                    							"relation_haSourceInterface",
                    							lv_relation_haSourceInterface_11_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Source_interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2844:4: (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==16) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalDsl.g:2845:5: otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getContained_inAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:2849:5: ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) )
                    	    // InternalDsl.g:2850:6: (lv_relation_haSourceInterface_13_0= ruleSource_interface )
                    	    {
                    	    // InternalDsl.g:2850:6: (lv_relation_haSourceInterface_13_0= ruleSource_interface )
                    	    // InternalDsl.g:2851:7: lv_relation_haSourceInterface_13_0= ruleSource_interface
                    	    {

                    	    							newCompositeNode(grammarAccess.getContained_inAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_relation_haSourceInterface_13_0=ruleSource_interface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContained_inRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation_haSourceInterface",
                    	    								lv_relation_haSourceInterface_13_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Source_interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_67); 

                    				newLeafNode(otherlv_14, grammarAccess.getContained_inAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2874:3: (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==58) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalDsl.g:2875:4: otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,58,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getContained_inAccess().getRelation_hasTargetInterfaceKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getContained_inAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalDsl.g:2883:4: ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) )
                    // InternalDsl.g:2884:5: (lv_relation_hasTargetInterface_17_0= ruleTarget_interface )
                    {
                    // InternalDsl.g:2884:5: (lv_relation_hasTargetInterface_17_0= ruleTarget_interface )
                    // InternalDsl.g:2885:6: lv_relation_hasTargetInterface_17_0= ruleTarget_interface
                    {

                    						newCompositeNode(grammarAccess.getContained_inAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_relation_hasTargetInterface_17_0=ruleTarget_interface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContained_inRule());
                    						}
                    						add(
                    							current,
                    							"relation_hasTargetInterface",
                    							lv_relation_hasTargetInterface_17_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Target_interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2902:4: (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==16) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalDsl.g:2903:5: otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getContained_inAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDsl.g:2907:5: ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) )
                    	    // InternalDsl.g:2908:6: (lv_relation_hasTargetInterface_19_0= ruleTarget_interface )
                    	    {
                    	    // InternalDsl.g:2908:6: (lv_relation_hasTargetInterface_19_0= ruleTarget_interface )
                    	    // InternalDsl.g:2909:7: lv_relation_hasTargetInterface_19_0= ruleTarget_interface
                    	    {

                    	    							newCompositeNode(grammarAccess.getContained_inAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_relation_hasTargetInterface_19_0=ruleTarget_interface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContained_inRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation_hasTargetInterface",
                    	    								lv_relation_hasTargetInterface_19_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Target_interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_20, grammarAccess.getContained_inAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getContained_inAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContained_in"


    // $ANTLR start "entryRuleConnected_to"
    // InternalDsl.g:2940:1: entryRuleConnected_to returns [EObject current=null] : iv_ruleConnected_to= ruleConnected_to EOF ;
    public final EObject entryRuleConnected_to() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnected_to = null;


        try {
            // InternalDsl.g:2940:53: (iv_ruleConnected_to= ruleConnected_to EOF )
            // InternalDsl.g:2941:2: iv_ruleConnected_to= ruleConnected_to EOF
            {
             newCompositeNode(grammarAccess.getConnected_toRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnected_to=ruleConnected_to();

            state._fsp--;

             current =iv_ruleConnected_to; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnected_to"


    // $ANTLR start "ruleConnected_to"
    // InternalDsl.g:2947:1: ruleConnected_to returns [EObject current=null] : ( () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleConnected_to() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_validSource_6_0 = null;

        AntlrDatatypeRuleToken lv_validTarget_8_0 = null;

        EObject lv_relation_haSourceInterface_11_0 = null;

        EObject lv_relation_haSourceInterface_13_0 = null;

        EObject lv_relation_hasTargetInterface_17_0 = null;

        EObject lv_relation_hasTargetInterface_19_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2953:2: ( ( () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalDsl.g:2954:2: ( () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalDsl.g:2954:2: ( () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalDsl.g:2955:3: () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalDsl.g:2955:3: ()
            // InternalDsl.g:2956:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnected_toAccess().getConnected_toAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getConnected_toAccess().getConnected_toKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getConnected_toAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:2970:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==23) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalDsl.g:2971:4: otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnected_toAccess().getTypeKeyword_3_0());
                    			
                    // InternalDsl.g:2975:4: ( (lv_type_4_0= ruleEString ) )
                    // InternalDsl.g:2976:5: (lv_type_4_0= ruleEString )
                    {
                    // InternalDsl.g:2976:5: (lv_type_4_0= ruleEString )
                    // InternalDsl.g:2977:6: lv_type_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConnected_toAccess().getTypeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_type_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2995:3: (otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==55) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalDsl.g:2996:4: otherlv_5= 'validSource' ( (lv_validSource_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getConnected_toAccess().getValidSourceKeyword_4_0());
                    			
                    // InternalDsl.g:3000:4: ( (lv_validSource_6_0= ruleEString ) )
                    // InternalDsl.g:3001:5: (lv_validSource_6_0= ruleEString )
                    {
                    // InternalDsl.g:3001:5: (lv_validSource_6_0= ruleEString )
                    // InternalDsl.g:3002:6: lv_validSource_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConnected_toAccess().getValidSourceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_validSource_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    						}
                    						set(
                    							current,
                    							"validSource",
                    							lv_validSource_6_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:3020:3: (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==56) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalDsl.g:3021:4: otherlv_7= 'validTarget' ( (lv_validTarget_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,56,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getConnected_toAccess().getValidTargetKeyword_5_0());
                    			
                    // InternalDsl.g:3025:4: ( (lv_validTarget_8_0= ruleEString ) )
                    // InternalDsl.g:3026:5: (lv_validTarget_8_0= ruleEString )
                    {
                    // InternalDsl.g:3026:5: (lv_validTarget_8_0= ruleEString )
                    // InternalDsl.g:3027:6: lv_validTarget_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConnected_toAccess().getValidTargetEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_validTarget_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    						}
                    						set(
                    							current,
                    							"validTarget",
                    							lv_validTarget_8_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:3045:3: (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==57) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalDsl.g:3046:4: otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,57,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getConnected_toAccess().getRelation_haSourceInterfaceKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getConnected_toAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDsl.g:3054:4: ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) )
                    // InternalDsl.g:3055:5: (lv_relation_haSourceInterface_11_0= ruleSource_interface )
                    {
                    // InternalDsl.g:3055:5: (lv_relation_haSourceInterface_11_0= ruleSource_interface )
                    // InternalDsl.g:3056:6: lv_relation_haSourceInterface_11_0= ruleSource_interface
                    {

                    						newCompositeNode(grammarAccess.getConnected_toAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_relation_haSourceInterface_11_0=ruleSource_interface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    						}
                    						add(
                    							current,
                    							"relation_haSourceInterface",
                    							lv_relation_haSourceInterface_11_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Source_interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:3073:4: (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==16) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalDsl.g:3074:5: otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getConnected_toAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDsl.g:3078:5: ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) )
                    	    // InternalDsl.g:3079:6: (lv_relation_haSourceInterface_13_0= ruleSource_interface )
                    	    {
                    	    // InternalDsl.g:3079:6: (lv_relation_haSourceInterface_13_0= ruleSource_interface )
                    	    // InternalDsl.g:3080:7: lv_relation_haSourceInterface_13_0= ruleSource_interface
                    	    {

                    	    							newCompositeNode(grammarAccess.getConnected_toAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_relation_haSourceInterface_13_0=ruleSource_interface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation_haSourceInterface",
                    	    								lv_relation_haSourceInterface_13_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Source_interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_67); 

                    				newLeafNode(otherlv_14, grammarAccess.getConnected_toAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:3103:3: (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==58) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalDsl.g:3104:4: otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,58,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getConnected_toAccess().getRelation_hasTargetInterfaceKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getConnected_toAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalDsl.g:3112:4: ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) )
                    // InternalDsl.g:3113:5: (lv_relation_hasTargetInterface_17_0= ruleTarget_interface )
                    {
                    // InternalDsl.g:3113:5: (lv_relation_hasTargetInterface_17_0= ruleTarget_interface )
                    // InternalDsl.g:3114:6: lv_relation_hasTargetInterface_17_0= ruleTarget_interface
                    {

                    						newCompositeNode(grammarAccess.getConnected_toAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_relation_hasTargetInterface_17_0=ruleTarget_interface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    						}
                    						add(
                    							current,
                    							"relation_hasTargetInterface",
                    							lv_relation_hasTargetInterface_17_0,
                    							"it.polimi.xtext.tosca4cloudifydsl.Dsl.Target_interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:3131:4: (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==16) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // InternalDsl.g:3132:5: otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getConnected_toAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalDsl.g:3136:5: ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) )
                    	    // InternalDsl.g:3137:6: (lv_relation_hasTargetInterface_19_0= ruleTarget_interface )
                    	    {
                    	    // InternalDsl.g:3137:6: (lv_relation_hasTargetInterface_19_0= ruleTarget_interface )
                    	    // InternalDsl.g:3138:7: lv_relation_hasTargetInterface_19_0= ruleTarget_interface
                    	    {

                    	    							newCompositeNode(grammarAccess.getConnected_toAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_relation_hasTargetInterface_19_0=ruleTarget_interface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"relation_hasTargetInterface",
                    	    								lv_relation_hasTargetInterface_19_0,
                    	    								"it.polimi.xtext.tosca4cloudifydsl.Dsl.Target_interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_20, grammarAccess.getConnected_toAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getConnected_toAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnected_to"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000147000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000146000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000144000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001F880000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001F080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001E080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000001C080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000009880000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000009080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003FC0080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003F80080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000003F00080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003E00080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003C00080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003800080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000003000080000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0840000000000800L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000020080010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000801F880000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000000801F080000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000801E080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000000801C080000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000008018080000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008010080000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000008000080000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00003C0000080000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000380000080000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000300000080000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000200000080000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0003C00040080000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0003C00000080000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0003800000080000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0003000000080000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0002000000080000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0020000000080000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0780000000880000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0780000000080000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0700000000080000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0600000000080000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0400000000080000L});

}