/**
 */
package SecCon.SecCon.impl;

import SecCon.SecCon.ContextScenario;
import SecCon.SecCon.Project;
import SecCon.SecCon.SecConPackage;
import SecCon.SecCon.StateMachineScenario;
import SecCon.SecCon.UseCaseScenario;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SecCon.SecCon.impl.ProjectImpl#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.ProjectImpl#getOwnedUseCaseScenario <em>Owned Use Case Scenario</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.ProjectImpl#getOwnedStateMachineScenario <em>Owned State Machine Scenario</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.ProjectImpl#getOwnedContextScenario <em>Owned Context Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends NamedElementImpl implements Project {
	/**
	 * The cached value of the '{@link #getOwnedPackages() <em>Owned Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<SecCon.SecCon.Package> ownedPackages;

	/**
	 * The cached value of the '{@link #getOwnedUseCaseScenario() <em>Owned Use Case Scenario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUseCaseScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCaseScenario> ownedUseCaseScenario;

	/**
	 * The cached value of the '{@link #getOwnedStateMachineScenario() <em>Owned State Machine Scenario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStateMachineScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachineScenario> ownedStateMachineScenario;

	/**
	 * The cached value of the '{@link #getOwnedContextScenario() <em>Owned Context Scenario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedContextScenario()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextScenario> ownedContextScenario;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecConPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecCon.SecCon.Package> getOwnedPackages() {
		if (ownedPackages == null) {
			ownedPackages = new EObjectContainmentEList<SecCon.SecCon.Package>(SecCon.SecCon.Package.class, this, SecConPackage.PROJECT__OWNED_PACKAGES);
		}
		return ownedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCaseScenario> getOwnedUseCaseScenario() {
		if (ownedUseCaseScenario == null) {
			ownedUseCaseScenario = new EObjectContainmentEList<UseCaseScenario>(UseCaseScenario.class, this, SecConPackage.PROJECT__OWNED_USE_CASE_SCENARIO);
		}
		return ownedUseCaseScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachineScenario> getOwnedStateMachineScenario() {
		if (ownedStateMachineScenario == null) {
			ownedStateMachineScenario = new EObjectContainmentEList<StateMachineScenario>(StateMachineScenario.class, this, SecConPackage.PROJECT__OWNED_STATE_MACHINE_SCENARIO);
		}
		return ownedStateMachineScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextScenario> getOwnedContextScenario() {
		if (ownedContextScenario == null) {
			ownedContextScenario = new EObjectContainmentEList<ContextScenario>(ContextScenario.class, this, SecConPackage.PROJECT__OWNED_CONTEXT_SCENARIO);
		}
		return ownedContextScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecConPackage.PROJECT__OWNED_PACKAGES:
				return ((InternalEList<?>)getOwnedPackages()).basicRemove(otherEnd, msgs);
			case SecConPackage.PROJECT__OWNED_USE_CASE_SCENARIO:
				return ((InternalEList<?>)getOwnedUseCaseScenario()).basicRemove(otherEnd, msgs);
			case SecConPackage.PROJECT__OWNED_STATE_MACHINE_SCENARIO:
				return ((InternalEList<?>)getOwnedStateMachineScenario()).basicRemove(otherEnd, msgs);
			case SecConPackage.PROJECT__OWNED_CONTEXT_SCENARIO:
				return ((InternalEList<?>)getOwnedContextScenario()).basicRemove(otherEnd, msgs);
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
			case SecConPackage.PROJECT__OWNED_PACKAGES:
				return getOwnedPackages();
			case SecConPackage.PROJECT__OWNED_USE_CASE_SCENARIO:
				return getOwnedUseCaseScenario();
			case SecConPackage.PROJECT__OWNED_STATE_MACHINE_SCENARIO:
				return getOwnedStateMachineScenario();
			case SecConPackage.PROJECT__OWNED_CONTEXT_SCENARIO:
				return getOwnedContextScenario();
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
			case SecConPackage.PROJECT__OWNED_PACKAGES:
				getOwnedPackages().clear();
				getOwnedPackages().addAll((Collection<? extends SecCon.SecCon.Package>)newValue);
				return;
			case SecConPackage.PROJECT__OWNED_USE_CASE_SCENARIO:
				getOwnedUseCaseScenario().clear();
				getOwnedUseCaseScenario().addAll((Collection<? extends UseCaseScenario>)newValue);
				return;
			case SecConPackage.PROJECT__OWNED_STATE_MACHINE_SCENARIO:
				getOwnedStateMachineScenario().clear();
				getOwnedStateMachineScenario().addAll((Collection<? extends StateMachineScenario>)newValue);
				return;
			case SecConPackage.PROJECT__OWNED_CONTEXT_SCENARIO:
				getOwnedContextScenario().clear();
				getOwnedContextScenario().addAll((Collection<? extends ContextScenario>)newValue);
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
			case SecConPackage.PROJECT__OWNED_PACKAGES:
				getOwnedPackages().clear();
				return;
			case SecConPackage.PROJECT__OWNED_USE_CASE_SCENARIO:
				getOwnedUseCaseScenario().clear();
				return;
			case SecConPackage.PROJECT__OWNED_STATE_MACHINE_SCENARIO:
				getOwnedStateMachineScenario().clear();
				return;
			case SecConPackage.PROJECT__OWNED_CONTEXT_SCENARIO:
				getOwnedContextScenario().clear();
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
			case SecConPackage.PROJECT__OWNED_PACKAGES:
				return ownedPackages != null && !ownedPackages.isEmpty();
			case SecConPackage.PROJECT__OWNED_USE_CASE_SCENARIO:
				return ownedUseCaseScenario != null && !ownedUseCaseScenario.isEmpty();
			case SecConPackage.PROJECT__OWNED_STATE_MACHINE_SCENARIO:
				return ownedStateMachineScenario != null && !ownedStateMachineScenario.isEmpty();
			case SecConPackage.PROJECT__OWNED_CONTEXT_SCENARIO:
				return ownedContextScenario != null && !ownedContextScenario.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
