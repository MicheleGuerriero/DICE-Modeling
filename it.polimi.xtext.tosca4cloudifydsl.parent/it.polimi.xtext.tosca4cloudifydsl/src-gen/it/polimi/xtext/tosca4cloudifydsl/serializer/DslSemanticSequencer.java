/*
 * generated by Xtext 2.9.1
 */
package it.polimi.xtext.tosca4cloudifydsl.serializer;

import com.google.inject.Inject;
import it.polimi.xtext.tosca4cloudifydsl.services.DslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import tosca4cloudify.Attribute;
import tosca4cloudify.Connected_to;
import tosca4cloudify.Contained_in;
import tosca4cloudify.Import;
import tosca4cloudify.Input;
import tosca4cloudify.Interface;
import tosca4cloudify.Node_template;
import tosca4cloudify.Operation;
import tosca4cloudify.Output;
import tosca4cloudify.Property;
import tosca4cloudify.Relationship;
import tosca4cloudify.Requirement;
import tosca4cloudify.Service_Template;
import tosca4cloudify.Source_interface;
import tosca4cloudify.Target_interface;
import tosca4cloudify.Tosca4cloudifyPackage;
import tosca4cloudify.instance;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Tosca4cloudifyPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Tosca4cloudifyPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.CONNECTED_TO:
				sequence_Connected_to(context, (Connected_to) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.CONTAINED_IN:
				sequence_Contained_in(context, (Contained_in) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.INTERFACE:
				sequence_Interface_Impl(context, (Interface) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.NODE_TEMPLATE:
				sequence_Node_template(context, (Node_template) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.RELATIONSHIP:
				sequence_Relationship_Impl(context, (Relationship) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.REQUIREMENT:
				sequence_Requirement(context, (Requirement) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE:
				sequence_Service_Template(context, (Service_Template) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.SOURCE_INTERFACE:
				sequence_Source_interface(context, (Source_interface) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.TARGET_INTERFACE:
				sequence_Target_interface(context, (Target_interface) semanticObject); 
				return; 
			case Tosca4cloudifyPackage.INSTANCE:
				sequence_instance(context, (instance) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (
	 *         parameter_name=EString 
	 *         type=EString? 
	 *         description=EString? 
	 *         value=EString? 
	 *         required=EString? 
	 *         default=EString? 
	 *         status=EString?
	 *     )
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Connected_to
	 *     Connected_to returns Connected_to
	 *
	 * Constraint:
	 *     (
	 *         type=EString? 
	 *         validSource=EString? 
	 *         validTarget=EString? 
	 *         (relation_haSourceInterface+=Source_interface relation_haSourceInterface+=Source_interface*)? 
	 *         (relation_hasTargetInterface+=Target_interface relation_hasTargetInterface+=Target_interface*)?
	 *     )
	 */
	protected void sequence_Connected_to(ISerializationContext context, Connected_to semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Contained_in
	 *     Contained_in returns Contained_in
	 *
	 * Constraint:
	 *     (
	 *         type=EString? 
	 *         validSource=EString? 
	 *         validTarget=EString? 
	 *         (relation_haSourceInterface+=Source_interface relation_haSourceInterface+=Source_interface*)? 
	 *         (relation_hasTargetInterface+=Target_interface relation_hasTargetInterface+=Target_interface*)?
	 *     )
	 */
	protected void sequence_Contained_in(ISerializationContext context, Contained_in semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     file=STRING?
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     (parameter_name=EString type=STRING? description=STRING? default=STRING?)
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Interface
	 *     Interface_Impl returns Interface
	 *
	 * Constraint:
	 *     (interface_name=STRING (hasOperation+=Operation hasOperation+=Operation*)?)
	 */
	protected void sequence_Interface_Impl(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Node_template returns Node_template
	 *
	 * Constraint:
	 *     (
	 *         node_template_name=STRING 
	 *         type=STRING? 
	 *         description=STRING? 
	 *         (nodeTemplate_hasInterface+=Interface nodeTemplate_hasInterface+=Interface*)? 
	 *         (nodeTemplate_hasProperty+=Property nodeTemplate_hasProperty+=Property*)? 
	 *         (nodeTemplate_hasAttribute+=Attribute nodeTemplate_hasAttribute+=Attribute*)? 
	 *         (nodeTemplate_hasRequirement+=Requirement nodeTemplate_hasRequirement+=Requirement*)? 
	 *         (NodeTemplate_hasRelationship+=Relationship NodeTemplate_hasRelationship+=Relationship*)? 
	 *         nodeTemplate_hasInstances=instance?
	 *     )
	 */
	protected void sequence_Node_template(ISerializationContext context, Node_template semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (operation_name=STRING? script=STRING?)
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Output returns Output
	 *
	 * Constraint:
	 *     (
	 *         parameter_name=EString 
	 *         type=EString? 
	 *         description=EString? 
	 *         value=EString? 
	 *         required=EString? 
	 *         default=EString? 
	 *         status=EString?
	 *     )
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (
	 *         parameter_name=EString 
	 *         type=EString? 
	 *         description=EString? 
	 *         value=EString? 
	 *         required=EString? 
	 *         default=EString? 
	 *         status=EString? 
	 *         property_name=EString?
	 *     )
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Relationship
	 *     Relationship_Impl returns Relationship
	 *
	 * Constraint:
	 *     (
	 *         type=STRING? 
	 *         validSource=STRING? 
	 *         validTarget=STRING? 
	 *         (relation_haSourceInterface+=Source_interface relation_haSourceInterface+=Source_interface*)? 
	 *         (relation_hasTargetInterface+=Target_interface relation_hasTargetInterface+=Target_interface*)?
	 *     )
	 */
	protected void sequence_Relationship_Impl(ISerializationContext context, Relationship semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Requirement returns Requirement
	 *
	 * Constraint:
	 *     (requirement_name=EString? node=EString? capability_Type_name=EString? (occurances+=EString occurances+=EString*)?)
	 */
	protected void sequence_Requirement(ISerializationContext context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Service_Template returns Service_Template
	 *
	 * Constraint:
	 *     (
	 *         tosca_definition_version=STRING? 
	 *         description=STRING? 
	 *         (serviceTemplate_hasImport+=Import serviceTemplate_hasImport+=Import*)? 
	 *         (interface_hasInput+=Input interface_hasInput+=Input*)? 
	 *         service_hasNodeTemplate+=Node_template 
	 *         service_hasNodeTemplate+=Node_template* 
	 *         (serviceTemplate_hasOutput+=Output serviceTemplate_hasOutput+=Output*)?
	 *     )
	 */
	protected void sequence_Service_Template(ISerializationContext context, Service_Template semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Source_interface
	 *     Source_interface returns Source_interface
	 *
	 * Constraint:
	 *     (interface_name=STRING (hasOperation+=Operation hasOperation+=Operation*)?)
	 */
	protected void sequence_Source_interface(ISerializationContext context, Source_interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Target_interface
	 *     Target_interface returns Target_interface
	 *
	 * Constraint:
	 *     (interface_name=STRING (hasOperation+=Operation hasOperation+=Operation*)?)
	 */
	protected void sequence_Target_interface(ISerializationContext context, Target_interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     instance returns instance
	 *
	 * Constraint:
	 *     (
	 *         parameter_name=EString 
	 *         type=EString? 
	 *         description=EString? 
	 *         value=EString? 
	 *         required=EString? 
	 *         default=EString? 
	 *         status=EString?
	 *     )
	 */
	protected void sequence_instance(ISerializationContext context, instance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}