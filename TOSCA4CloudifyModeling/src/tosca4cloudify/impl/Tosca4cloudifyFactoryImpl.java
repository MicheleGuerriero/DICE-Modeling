/**
 */
package tosca4cloudify.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tosca4cloudify.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tosca4cloudifyFactoryImpl extends EFactoryImpl implements Tosca4cloudifyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Tosca4cloudifyFactory init() {
		try {
			Tosca4cloudifyFactory theTosca4cloudifyFactory = (Tosca4cloudifyFactory)EPackage.Registry.INSTANCE.getEFactory(Tosca4cloudifyPackage.eNS_URI);
			if (theTosca4cloudifyFactory != null) {
				return theTosca4cloudifyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Tosca4cloudifyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca4cloudifyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Tosca4cloudifyPackage.NODE_TEMPLATE: return createNode_template();
			case Tosca4cloudifyPackage.INTERFACE: return createInterface();
			case Tosca4cloudifyPackage.SOURCE_INTERFACE: return createSource_interface();
			case Tosca4cloudifyPackage.TARGET_INTERFACE: return createTarget_interface();
			case Tosca4cloudifyPackage.RELATIONSHIP: return createRelationship();
			case Tosca4cloudifyPackage.CONTAINED_IN: return createContained_in();
			case Tosca4cloudifyPackage.CONNECTED_TO: return createConnected_to();
			case Tosca4cloudifyPackage.PARAMETER: return createParameter();
			case Tosca4cloudifyPackage.PROPERTY: return createProperty();
			case Tosca4cloudifyPackage.ATTRIBUTE: return createAttribute();
			case Tosca4cloudifyPackage.INPUT: return createInput();
			case Tosca4cloudifyPackage.OUTPUT: return createOutput();
			case Tosca4cloudifyPackage.REQUIREMENT: return createRequirement();
			case Tosca4cloudifyPackage.OPERATION: return createOperation();
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE: return createService_Template();
			case Tosca4cloudifyPackage.IMPORT: return createImport();
			case Tosca4cloudifyPackage.INSTANCE: return createinstance();
			case Tosca4cloudifyPackage.PARAMETERS: return createParameters();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node_template createNode_template() {
		Node_templateImpl node_template = new Node_templateImpl();
		return node_template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source_interface createSource_interface() {
		Source_interfaceImpl source_interface = new Source_interfaceImpl();
		return source_interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target_interface createTarget_interface() {
		Target_interfaceImpl target_interface = new Target_interfaceImpl();
		return target_interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contained_in createContained_in() {
		Contained_inImpl contained_in = new Contained_inImpl();
		return contained_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connected_to createConnected_to() {
		Connected_toImpl connected_to = new Connected_toImpl();
		return connected_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service_Template createService_Template() {
		Service_TemplateImpl service_Template = new Service_TemplateImpl();
		return service_Template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public instance createinstance() {
		instanceImpl instance = new instanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters createParameters() {
		ParametersImpl parameters = new ParametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tosca4cloudifyPackage getTosca4cloudifyPackage() {
		return (Tosca4cloudifyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Tosca4cloudifyPackage getPackage() {
		return Tosca4cloudifyPackage.eINSTANCE;
	}

} //Tosca4cloudifyFactoryImpl
