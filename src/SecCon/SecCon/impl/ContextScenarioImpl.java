/**
 */
package SecCon.SecCon.impl;

import SecCon.SecCon.ContextInformation;
import SecCon.SecCon.ContextScenario;
import SecCon.SecCon.Rule;
import SecCon.SecCon.SecConPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SecCon.SecCon.impl.ContextScenarioImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.ContextScenarioImpl#getIsFormed <em>Is Formed</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.ContextScenarioImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextScenarioImpl extends MinimalEObjectImpl.Container implements ContextScenario {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> contains;

	/**
	 * The cached value of the '{@link #getIsFormed() <em>Is Formed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFormed()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextInformation> isFormed;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecConPackage.Literals.CONTEXT_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<Rule>(Rule.class, this, SecConPackage.CONTEXT_SCENARIO__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextInformation> getIsFormed() {
		if (isFormed == null) {
			isFormed = new EObjectContainmentEList<ContextInformation>(ContextInformation.class, this, SecConPackage.CONTEXT_SCENARIO__IS_FORMED);
		}
		return isFormed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.CONTEXT_SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecConPackage.CONTEXT_SCENARIO__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case SecConPackage.CONTEXT_SCENARIO__IS_FORMED:
				return ((InternalEList<?>)getIsFormed()).basicRemove(otherEnd, msgs);
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
			case SecConPackage.CONTEXT_SCENARIO__CONTAINS:
				return getContains();
			case SecConPackage.CONTEXT_SCENARIO__IS_FORMED:
				return getIsFormed();
			case SecConPackage.CONTEXT_SCENARIO__NAME:
				return getName();
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
			case SecConPackage.CONTEXT_SCENARIO__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Rule>)newValue);
				return;
			case SecConPackage.CONTEXT_SCENARIO__IS_FORMED:
				getIsFormed().clear();
				getIsFormed().addAll((Collection<? extends ContextInformation>)newValue);
				return;
			case SecConPackage.CONTEXT_SCENARIO__NAME:
				setName((String)newValue);
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
			case SecConPackage.CONTEXT_SCENARIO__CONTAINS:
				getContains().clear();
				return;
			case SecConPackage.CONTEXT_SCENARIO__IS_FORMED:
				getIsFormed().clear();
				return;
			case SecConPackage.CONTEXT_SCENARIO__NAME:
				setName(NAME_EDEFAULT);
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
			case SecConPackage.CONTEXT_SCENARIO__CONTAINS:
				return contains != null && !contains.isEmpty();
			case SecConPackage.CONTEXT_SCENARIO__IS_FORMED:
				return isFormed != null && !isFormed.isEmpty();
			case SecConPackage.CONTEXT_SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ContextScenarioImpl
