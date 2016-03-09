/**
 */
package tosca4cloudify.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tosca4cloudify.Import;
import tosca4cloudify.Input;
import tosca4cloudify.Node_template;
import tosca4cloudify.Output;
import tosca4cloudify.Service_Template;
import tosca4cloudify.Tosca4cloudifyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca4cloudify.impl.Service_TemplateImpl#getTosca_definitions_version <em>Tosca definitions version</em>}</li>
 *   <li>{@link tosca4cloudify.impl.Service_TemplateImpl#getServiceTemplate_hasImport <em>Service Template has Import</em>}</li>
 *   <li>{@link tosca4cloudify.impl.Service_TemplateImpl#getServiceTemplate_hasOutput <em>Service Template has Output</em>}</li>
 *   <li>{@link tosca4cloudify.impl.Service_TemplateImpl#getInterface_hasInput <em>Interface has Input</em>}</li>
 *   <li>{@link tosca4cloudify.impl.Service_TemplateImpl#getService_hasNodeTemplate <em>Service has Node Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Service_TemplateImpl extends MinimalEObjectImpl.Container implements Service_Template {
	/**
	 * The default value of the '{@link #getTosca_definitions_version() <em>Tosca definitions version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTosca_definitions_version()
	 * @generated
	 * @ordered
	 */
	protected static final String TOSCA_DEFINITIONS_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTosca_definitions_version() <em>Tosca definitions version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTosca_definitions_version()
	 * @generated
	 * @ordered
	 */
	protected String tosca_definitions_version = TOSCA_DEFINITIONS_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceTemplate_hasImport() <em>Service Template has Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTemplate_hasImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> serviceTemplate_hasImport;

	/**
	 * The cached value of the '{@link #getServiceTemplate_hasOutput() <em>Service Template has Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTemplate_hasOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> serviceTemplate_hasOutput;

	/**
	 * The cached value of the '{@link #getInterface_hasInput() <em>Interface has Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface_hasInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> interface_hasInput;

	/**
	 * The cached value of the '{@link #getService_hasNodeTemplate() <em>Service has Node Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService_hasNodeTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<Node_template> service_hasNodeTemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Service_TemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tosca4cloudifyPackage.Literals.SERVICE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTosca_definitions_version() {
		return tosca_definitions_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTosca_definitions_version(String newTosca_definitions_version) {
		String oldTosca_definitions_version = tosca_definitions_version;
		tosca_definitions_version = newTosca_definitions_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tosca4cloudifyPackage.SERVICE_TEMPLATE__TOSCA_DEFINITIONS_VERSION, oldTosca_definitions_version, tosca_definitions_version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getServiceTemplate_hasImport() {
		if (serviceTemplate_hasImport == null) {
			serviceTemplate_hasImport = new EObjectContainmentEList<Import>(Import.class, this, Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_IMPORT);
		}
		return serviceTemplate_hasImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getServiceTemplate_hasOutput() {
		if (serviceTemplate_hasOutput == null) {
			serviceTemplate_hasOutput = new EObjectContainmentEList<Output>(Output.class, this, Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_OUTPUT);
		}
		return serviceTemplate_hasOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getInterface_hasInput() {
		if (interface_hasInput == null) {
			interface_hasInput = new EObjectContainmentEList<Input>(Input.class, this, Tosca4cloudifyPackage.SERVICE_TEMPLATE__INTERFACE_HAS_INPUT);
		}
		return interface_hasInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node_template> getService_hasNodeTemplate() {
		if (service_hasNodeTemplate == null) {
			service_hasNodeTemplate = new EObjectContainmentEList<Node_template>(Node_template.class, this, Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_HAS_NODE_TEMPLATE);
		}
		return service_hasNodeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_IMPORT:
				return ((InternalEList<?>)getServiceTemplate_hasImport()).basicRemove(otherEnd, msgs);
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_OUTPUT:
				return ((InternalEList<?>)getServiceTemplate_hasOutput()).basicRemove(otherEnd, msgs);
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__INTERFACE_HAS_INPUT:
				return ((InternalEList<?>)getInterface_hasInput()).basicRemove(otherEnd, msgs);
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_HAS_NODE_TEMPLATE:
				return ((InternalEList<?>)getService_hasNodeTemplate()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__TOSCA_DEFINITIONS_VERSION:
				return getTosca_definitions_version();
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_IMPORT:
				return getServiceTemplate_hasImport();
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_OUTPUT:
				return getServiceTemplate_hasOutput();
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__INTERFACE_HAS_INPUT:
				return getInterface_hasInput();
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_HAS_NODE_TEMPLATE:
				return getService_hasNodeTemplate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__TOSCA_DEFINITIONS_VERSION:
				setTosca_definitions_version((String)newValue);
				return;
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_IMPORT:
				getServiceTemplate_hasImport().clear();
				getServiceTemplate_hasImport().addAll((Collection<? extends Import>)newValue);
				return;
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_OUTPUT:
				getServiceTemplate_hasOutput().clear();
				getServiceTemplate_hasOutput().addAll((Collection<? extends Output>)newValue);
				return;
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__INTERFACE_HAS_INPUT:
				getInterface_hasInput().clear();
				getInterface_hasInput().addAll((Collection<? extends Input>)newValue);
				return;
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_HAS_NODE_TEMPLATE:
				getService_hasNodeTemplate().clear();
				getService_hasNodeTemplate().addAll((Collection<? extends Node_template>)newValue);
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
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__TOSCA_DEFINITIONS_VERSION:
				setTosca_definitions_version(TOSCA_DEFINITIONS_VERSION_EDEFAULT);
				return;
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_IMPORT:
				getServiceTemplate_hasImport().clear();
				return;
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_OUTPUT:
				getServiceTemplate_hasOutput().clear();
				return;
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__INTERFACE_HAS_INPUT:
				getInterface_hasInput().clear();
				return;
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_HAS_NODE_TEMPLATE:
				getService_hasNodeTemplate().clear();
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
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__TOSCA_DEFINITIONS_VERSION:
				return TOSCA_DEFINITIONS_VERSION_EDEFAULT == null ? tosca_definitions_version != null : !TOSCA_DEFINITIONS_VERSION_EDEFAULT.equals(tosca_definitions_version);
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_IMPORT:
				return serviceTemplate_hasImport != null && !serviceTemplate_hasImport.isEmpty();
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_TEMPLATE_HAS_OUTPUT:
				return serviceTemplate_hasOutput != null && !serviceTemplate_hasOutput.isEmpty();
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__INTERFACE_HAS_INPUT:
				return interface_hasInput != null && !interface_hasInput.isEmpty();
			case Tosca4cloudifyPackage.SERVICE_TEMPLATE__SERVICE_HAS_NODE_TEMPLATE:
				return service_hasNodeTemplate != null && !service_hasNodeTemplate.isEmpty();
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
		result.append(" (tosca_definitions_version: ");
		result.append(tosca_definitions_version);
		result.append(')');
		return result.toString();
	}

} //Service_TemplateImpl
