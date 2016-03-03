/**
 */
package tosca4cloudify;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca4cloudify.Parameter#getParameter_name <em>Parameter name</em>}</li>
 *   <li>{@link tosca4cloudify.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link tosca4cloudify.Parameter#getDescription <em>Description</em>}</li>
 *   <li>{@link tosca4cloudify.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link tosca4cloudify.Parameter#getRequired <em>Required</em>}</li>
 *   <li>{@link tosca4cloudify.Parameter#getDefault <em>Default</em>}</li>
 *   <li>{@link tosca4cloudify.Parameter#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see tosca4cloudify.Tosca4cloudifyPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
    /**
     * Returns the value of the '<em><b>Parameter name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter name</em>' attribute.
     * @see #setParameter_name(String)
     * @see tosca4cloudify.Tosca4cloudifyPackage#getParameter_Parameter_name()
     * @model id="true"
     * @generated
     */
    String getParameter_name();

    /**
     * Sets the value of the '{@link tosca4cloudify.Parameter#getParameter_name <em>Parameter name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameter name</em>' attribute.
     * @see #getParameter_name()
     * @generated
     */
    void setParameter_name(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see tosca4cloudify.Tosca4cloudifyPackage#getParameter_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link tosca4cloudify.Parameter#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

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
     * @see tosca4cloudify.Tosca4cloudifyPackage#getParameter_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link tosca4cloudify.Parameter#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see tosca4cloudify.Tosca4cloudifyPackage#getParameter_Value()
     * @model
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link tosca4cloudify.Parameter#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

    /**
     * Returns the value of the '<em><b>Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Required</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Required</em>' attribute.
     * @see #setRequired(String)
     * @see tosca4cloudify.Tosca4cloudifyPackage#getParameter_Required()
     * @model
     * @generated
     */
    String getRequired();

    /**
     * Sets the value of the '{@link tosca4cloudify.Parameter#getRequired <em>Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Required</em>' attribute.
     * @see #getRequired()
     * @generated
     */
    void setRequired(String value);

    /**
     * Returns the value of the '<em><b>Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default</em>' attribute.
     * @see #setDefault(String)
     * @see tosca4cloudify.Tosca4cloudifyPackage#getParameter_Default()
     * @model
     * @generated
     */
    String getDefault();

    /**
     * Sets the value of the '{@link tosca4cloudify.Parameter#getDefault <em>Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default</em>' attribute.
     * @see #getDefault()
     * @generated
     */
    void setDefault(String value);

    /**
     * Returns the value of the '<em><b>Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Status</em>' attribute.
     * @see #setStatus(String)
     * @see tosca4cloudify.Tosca4cloudifyPackage#getParameter_Status()
     * @model
     * @generated
     */
    String getStatus();

    /**
     * Sets the value of the '{@link tosca4cloudify.Parameter#getStatus <em>Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status</em>' attribute.
     * @see #getStatus()
     * @generated
     */
    void setStatus(String value);

} // Parameter
