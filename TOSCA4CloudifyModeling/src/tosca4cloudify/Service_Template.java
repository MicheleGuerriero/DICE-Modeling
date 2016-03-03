/**
 */
package tosca4cloudify;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca4cloudify.Service_Template#getTosca_definition_version <em>Tosca definition version</em>}</li>
 *   <li>{@link tosca4cloudify.Service_Template#getDescription <em>Description</em>}</li>
 *   <li>{@link tosca4cloudify.Service_Template#getServiceTemplate_hasImport <em>Service Template has Import</em>}</li>
 *   <li>{@link tosca4cloudify.Service_Template#getServiceTemplate_hasOutput <em>Service Template has Output</em>}</li>
 *   <li>{@link tosca4cloudify.Service_Template#getInterface_hasInput <em>Interface has Input</em>}</li>
 *   <li>{@link tosca4cloudify.Service_Template#getService_hasNodeTemplate <em>Service has Node Template</em>}</li>
 * </ul>
 *
 * @see tosca4cloudify.Tosca4cloudifyPackage#getService_Template()
 * @model
 * @generated
 */
public interface Service_Template extends EObject {
    /**
     * Returns the value of the '<em><b>Tosca definition version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tosca definition version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tosca definition version</em>' attribute.
     * @see #setTosca_definition_version(String)
     * @see tosca4cloudify.Tosca4cloudifyPackage#getService_Template_Tosca_definition_version()
     * @model
     * @generated
     */
    String getTosca_definition_version();

    /**
     * Sets the value of the '{@link tosca4cloudify.Service_Template#getTosca_definition_version <em>Tosca definition version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tosca definition version</em>' attribute.
     * @see #getTosca_definition_version()
     * @generated
     */
    void setTosca_definition_version(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see tosca4cloudify.Tosca4cloudifyPackage#getService_Template_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link tosca4cloudify.Service_Template#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Service Template has Import</b></em>' containment reference list.
     * The list contents are of type {@link tosca4cloudify.Import}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Template has Import</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Template has Import</em>' containment reference list.
     * @see tosca4cloudify.Tosca4cloudifyPackage#getService_Template_ServiceTemplate_hasImport()
     * @model containment="true"
     * @generated
     */
    EList<Import> getServiceTemplate_hasImport();

    /**
     * Returns the value of the '<em><b>Service Template has Output</b></em>' containment reference list.
     * The list contents are of type {@link tosca4cloudify.Output}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Template has Output</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Template has Output</em>' containment reference list.
     * @see tosca4cloudify.Tosca4cloudifyPackage#getService_Template_ServiceTemplate_hasOutput()
     * @model containment="true"
     * @generated
     */
    EList<Output> getServiceTemplate_hasOutput();

    /**
     * Returns the value of the '<em><b>Interface has Input</b></em>' containment reference list.
     * The list contents are of type {@link tosca4cloudify.Input}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface has Input</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interface has Input</em>' containment reference list.
     * @see tosca4cloudify.Tosca4cloudifyPackage#getService_Template_Interface_hasInput()
     * @model containment="true"
     * @generated
     */
    EList<Input> getInterface_hasInput();

    /**
     * Returns the value of the '<em><b>Service has Node Template</b></em>' containment reference list.
     * The list contents are of type {@link tosca4cloudify.Node_template}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service has Node Template</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service has Node Template</em>' containment reference list.
     * @see tosca4cloudify.Tosca4cloudifyPackage#getService_Template_Service_hasNodeTemplate()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Node_template> getService_hasNodeTemplate();

} // Service_Template
