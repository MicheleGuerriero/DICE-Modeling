/**
 */
package tosca4cloudify.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tosca4cloudify.Property;
import tosca4cloudify.Tosca4cloudifyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca4cloudify.impl.PropertyImpl#getProperty_name <em>Property name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends ParameterImpl implements Property {
    /**
     * The default value of the '{@link #getProperty_name() <em>Property name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperty_name()
     * @generated
     * @ordered
     */
    protected static final String PROPERTY_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProperty_name() <em>Property name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperty_name()
     * @generated
     * @ordered
     */
    protected String property_name = PROPERTY_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Tosca4cloudifyPackage.Literals.PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProperty_name() {
        return property_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProperty_name(String newProperty_name) {
        String oldProperty_name = property_name;
        property_name = newProperty_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Tosca4cloudifyPackage.PROPERTY__PROPERTY_NAME, oldProperty_name, property_name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Tosca4cloudifyPackage.PROPERTY__PROPERTY_NAME:
                return getProperty_name();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Tosca4cloudifyPackage.PROPERTY__PROPERTY_NAME:
                setProperty_name((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Tosca4cloudifyPackage.PROPERTY__PROPERTY_NAME:
                setProperty_name(PROPERTY_NAME_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Tosca4cloudifyPackage.PROPERTY__PROPERTY_NAME:
                return PROPERTY_NAME_EDEFAULT == null ? property_name != null : !PROPERTY_NAME_EDEFAULT.equals(property_name);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (property_name: ");
        result.append(property_name);
        result.append(')');
        return result.toString();
    }

} //PropertyImpl
