/**
 */
package tosca4cloudify;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca4cloudify.Property#getProperty_name <em>Property name</em>}</li>
 * </ul>
 *
 * @see tosca4cloudify.Tosca4cloudifyPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Parameter {
    /**
     * Returns the value of the '<em><b>Property name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property name</em>' attribute.
     * @see #setProperty_name(String)
     * @see tosca4cloudify.Tosca4cloudifyPackage#getProperty_Property_name()
     * @model
     * @generated
     */
    String getProperty_name();

    /**
     * Sets the value of the '{@link tosca4cloudify.Property#getProperty_name <em>Property name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property name</em>' attribute.
     * @see #getProperty_name()
     * @generated
     */
    void setProperty_name(String value);

} // Property
