/**
 */
package SecCon.SecCon.impl;

import SecCon.SecCon.Event;
import SecCon.SecCon.SecConPackage;
import SecCon.SecCon.State;
import SecCon.SecCon.StateOperation;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SecCon.SecCon.impl.StateImpl#getOwnedStateOperation <em>Owned State Operation</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.StateImpl#getDeferrableEvent <em>Deferrable Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StateImpl extends StateVertexImpl implements State {
	/**
	 * The cached value of the '{@link #getOwnedStateOperation() <em>Owned State Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStateOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<StateOperation> ownedStateOperation;

	/**
	 * The cached value of the '{@link #getDeferrableEvent() <em>Deferrable Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrableEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> deferrableEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecConPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateOperation> getOwnedStateOperation() {
		if (ownedStateOperation == null) {
			ownedStateOperation = new EObjectContainmentEList<StateOperation>(StateOperation.class, this, SecConPackage.STATE__OWNED_STATE_OPERATION);
		}
		return ownedStateOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getDeferrableEvent() {
		if (deferrableEvent == null) {
			deferrableEvent = new EObjectResolvingEList<Event>(Event.class, this, SecConPackage.STATE__DEFERRABLE_EVENT);
		}
		return deferrableEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecConPackage.STATE__OWNED_STATE_OPERATION:
				return ((InternalEList<?>)getOwnedStateOperation()).basicRemove(otherEnd, msgs);
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
			case SecConPackage.STATE__OWNED_STATE_OPERATION:
				return getOwnedStateOperation();
			case SecConPackage.STATE__DEFERRABLE_EVENT:
				return getDeferrableEvent();
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
			case SecConPackage.STATE__OWNED_STATE_OPERATION:
				getOwnedStateOperation().clear();
				getOwnedStateOperation().addAll((Collection<? extends StateOperation>)newValue);
				return;
			case SecConPackage.STATE__DEFERRABLE_EVENT:
				getDeferrableEvent().clear();
				getDeferrableEvent().addAll((Collection<? extends Event>)newValue);
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
			case SecConPackage.STATE__OWNED_STATE_OPERATION:
				getOwnedStateOperation().clear();
				return;
			case SecConPackage.STATE__DEFERRABLE_EVENT:
				getDeferrableEvent().clear();
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
			case SecConPackage.STATE__OWNED_STATE_OPERATION:
				return ownedStateOperation != null && !ownedStateOperation.isEmpty();
			case SecConPackage.STATE__DEFERRABLE_EVENT:
				return deferrableEvent != null && !deferrableEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
