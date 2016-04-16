/**
 */
package SecCon.SecCon.impl;

import SecCon.SecCon.Event;
import SecCon.SecCon.SecConPackage;
import SecCon.SecCon.StateMachineScenario;
import SecCon.SecCon.StateVertex;
import SecCon.SecCon.Transition;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SecCon.SecCon.impl.StateMachineScenarioImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.StateMachineScenarioImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.StateMachineScenarioImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.StateMachineScenarioImpl#getOwnedEvent <em>Owned Event</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.StateMachineScenarioImpl#getOwnedTransition <em>Owned Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineScenarioImpl extends NamedElementImpl implements StateMachineScenario {
	/**
	 * The cached value of the '{@link #getOwnedState() <em>Owned State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedState()
	 * @generated
	 * @ordered
	 */
	protected EList<StateVertex> ownedState;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedEvent() <em>Owned Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> ownedEvent;

	/**
	 * The cached value of the '{@link #getOwnedTransition() <em>Owned Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> ownedTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecConPackage.Literals.STATE_MACHINE_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateVertex> getOwnedState() {
		if (ownedState == null) {
			ownedState = new EObjectContainmentEList<StateVertex>(StateVertex.class, this, SecConPackage.STATE_MACHINE_SCENARIO__OWNED_STATE);
		}
		return ownedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.STATE_MACHINE_SCENARIO__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.STATE_MACHINE_SCENARIO__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getOwnedEvent() {
		if (ownedEvent == null) {
			ownedEvent = new EObjectContainmentEList<Event>(Event.class, this, SecConPackage.STATE_MACHINE_SCENARIO__OWNED_EVENT);
		}
		return ownedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOwnedTransition() {
		if (ownedTransition == null) {
			ownedTransition = new EObjectContainmentEList<Transition>(Transition.class, this, SecConPackage.STATE_MACHINE_SCENARIO__OWNED_TRANSITION);
		}
		return ownedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_STATE:
				return ((InternalEList<?>)getOwnedState()).basicRemove(otherEnd, msgs);
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_EVENT:
				return ((InternalEList<?>)getOwnedEvent()).basicRemove(otherEnd, msgs);
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_TRANSITION:
				return ((InternalEList<?>)getOwnedTransition()).basicRemove(otherEnd, msgs);
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
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_STATE:
				return getOwnedState();
			case SecConPackage.STATE_MACHINE_SCENARIO__AUTHOR:
				return getAuthor();
			case SecConPackage.STATE_MACHINE_SCENARIO__VERSION:
				return getVersion();
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_EVENT:
				return getOwnedEvent();
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_TRANSITION:
				return getOwnedTransition();
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
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection<? extends StateVertex>)newValue);
				return;
			case SecConPackage.STATE_MACHINE_SCENARIO__AUTHOR:
				setAuthor((String)newValue);
				return;
			case SecConPackage.STATE_MACHINE_SCENARIO__VERSION:
				setVersion((String)newValue);
				return;
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_EVENT:
				getOwnedEvent().clear();
				getOwnedEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_TRANSITION:
				getOwnedTransition().clear();
				getOwnedTransition().addAll((Collection<? extends Transition>)newValue);
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
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_STATE:
				getOwnedState().clear();
				return;
			case SecConPackage.STATE_MACHINE_SCENARIO__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case SecConPackage.STATE_MACHINE_SCENARIO__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_EVENT:
				getOwnedEvent().clear();
				return;
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_TRANSITION:
				getOwnedTransition().clear();
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
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_STATE:
				return ownedState != null && !ownedState.isEmpty();
			case SecConPackage.STATE_MACHINE_SCENARIO__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case SecConPackage.STATE_MACHINE_SCENARIO__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_EVENT:
				return ownedEvent != null && !ownedEvent.isEmpty();
			case SecConPackage.STATE_MACHINE_SCENARIO__OWNED_TRANSITION:
				return ownedTransition != null && !ownedTransition.isEmpty();
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
		result.append(" (author: ");
		result.append(author);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //StateMachineScenarioImpl
