/**
 */
package SecCon.SecCon.impl;

import SecCon.SecCon.Actor;
import SecCon.SecCon.Extend;
import SecCon.SecCon.Include;
import SecCon.SecCon.SecConPackage;
import SecCon.SecCon.UseCase;

import SecCon.SecCon.UseCaseScenario;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SecCon.SecCon.impl.UseCaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.UseCaseImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.UseCaseImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.UseCaseImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.UseCaseImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.UseCaseImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.UseCaseImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.UseCaseImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UseCaseImpl extends NamedElementImpl implements UseCase {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * The default value of the '{@link #getPreCondition() <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected String preCondition = PRE_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> includes;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected Include include;

	/**
	 * The cached value of the '{@link #getExtend() <em>Extend</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtend()
	 * @generated
	 * @ordered
	 */
	protected EList<Extend> extend;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<Extend> extends_;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected UseCaseScenario scenario;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecConPackage.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Include> getIncludes() {
		if (includes == null) {
			includes = new EObjectWithInverseResolvingEList<Include>(Include.class, this, SecConPackage.USE_CASE__INCLUDES, SecConPackage.INCLUDE__ADDITION);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include getInclude() {
		if (include != null && include.eIsProxy()) {
			InternalEObject oldInclude = (InternalEObject)include;
			include = (Include)eResolveProxy(oldInclude);
			if (include != oldInclude) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecConPackage.USE_CASE__INCLUDE, oldInclude, include));
			}
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include basicGetInclude() {
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclude(Include newInclude, NotificationChain msgs) {
		Include oldInclude = include;
		include = newInclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecConPackage.USE_CASE__INCLUDE, oldInclude, newInclude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude(Include newInclude) {
		if (newInclude != include) {
			NotificationChain msgs = null;
			if (include != null)
				msgs = ((InternalEObject)include).eInverseRemove(this, SecConPackage.INCLUDE__BASE, Include.class, msgs);
			if (newInclude != null)
				msgs = ((InternalEObject)newInclude).eInverseAdd(this, SecConPackage.INCLUDE__BASE, Include.class, msgs);
			msgs = basicSetInclude(newInclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.USE_CASE__INCLUDE, newInclude, newInclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extend> getExtend() {
		if (extend == null) {
			extend = new EObjectWithInverseResolvingEList<Extend>(Extend.class, this, SecConPackage.USE_CASE__EXTEND, SecConPackage.EXTEND__EXTENSION);
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extend> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectWithInverseResolvingEList<Extend>(Extend.class, this, SecConPackage.USE_CASE__EXTENDS, SecConPackage.EXTEND__BASE);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseScenario getScenario() {
		if (scenario != null && scenario.eIsProxy()) {
			InternalEObject oldScenario = (InternalEObject)scenario;
			scenario = (UseCaseScenario)eResolveProxy(oldScenario);
			if (scenario != oldScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecConPackage.USE_CASE__SCENARIO, oldScenario, scenario));
			}
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseScenario basicGetScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(UseCaseScenario newScenario) {
		UseCaseScenario oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.USE_CASE__SCENARIO, oldScenario, scenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.USE_CASE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectResolvingEList<Actor>(Actor.class, this, SecConPackage.USE_CASE__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreCondition() {
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(String newPreCondition) {
		String oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.USE_CASE__PRE_CONDITION, oldPreCondition, preCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecConPackage.USE_CASE__INCLUDES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludes()).basicAdd(otherEnd, msgs);
			case SecConPackage.USE_CASE__INCLUDE:
				if (include != null)
					msgs = ((InternalEObject)include).eInverseRemove(this, SecConPackage.INCLUDE__BASE, Include.class, msgs);
				return basicSetInclude((Include)otherEnd, msgs);
			case SecConPackage.USE_CASE__EXTEND:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtend()).basicAdd(otherEnd, msgs);
			case SecConPackage.USE_CASE__EXTENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtends()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecConPackage.USE_CASE__INCLUDES:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
			case SecConPackage.USE_CASE__INCLUDE:
				return basicSetInclude(null, msgs);
			case SecConPackage.USE_CASE__EXTEND:
				return ((InternalEList<?>)getExtend()).basicRemove(otherEnd, msgs);
			case SecConPackage.USE_CASE__EXTENDS:
				return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
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
			case SecConPackage.USE_CASE__DESCRIPTION:
				return getDescription();
			case SecConPackage.USE_CASE__ACTOR:
				return getActor();
			case SecConPackage.USE_CASE__PRE_CONDITION:
				return getPreCondition();
			case SecConPackage.USE_CASE__INCLUDES:
				return getIncludes();
			case SecConPackage.USE_CASE__INCLUDE:
				if (resolve) return getInclude();
				return basicGetInclude();
			case SecConPackage.USE_CASE__EXTEND:
				return getExtend();
			case SecConPackage.USE_CASE__EXTENDS:
				return getExtends();
			case SecConPackage.USE_CASE__SCENARIO:
				if (resolve) return getScenario();
				return basicGetScenario();
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
			case SecConPackage.USE_CASE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SecConPackage.USE_CASE__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends Actor>)newValue);
				return;
			case SecConPackage.USE_CASE__PRE_CONDITION:
				setPreCondition((String)newValue);
				return;
			case SecConPackage.USE_CASE__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends Include>)newValue);
				return;
			case SecConPackage.USE_CASE__INCLUDE:
				setInclude((Include)newValue);
				return;
			case SecConPackage.USE_CASE__EXTEND:
				getExtend().clear();
				getExtend().addAll((Collection<? extends Extend>)newValue);
				return;
			case SecConPackage.USE_CASE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends Extend>)newValue);
				return;
			case SecConPackage.USE_CASE__SCENARIO:
				setScenario((UseCaseScenario)newValue);
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
			case SecConPackage.USE_CASE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SecConPackage.USE_CASE__ACTOR:
				getActor().clear();
				return;
			case SecConPackage.USE_CASE__PRE_CONDITION:
				setPreCondition(PRE_CONDITION_EDEFAULT);
				return;
			case SecConPackage.USE_CASE__INCLUDES:
				getIncludes().clear();
				return;
			case SecConPackage.USE_CASE__INCLUDE:
				setInclude((Include)null);
				return;
			case SecConPackage.USE_CASE__EXTEND:
				getExtend().clear();
				return;
			case SecConPackage.USE_CASE__EXTENDS:
				getExtends().clear();
				return;
			case SecConPackage.USE_CASE__SCENARIO:
				setScenario((UseCaseScenario)null);
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
			case SecConPackage.USE_CASE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SecConPackage.USE_CASE__ACTOR:
				return actor != null && !actor.isEmpty();
			case SecConPackage.USE_CASE__PRE_CONDITION:
				return PRE_CONDITION_EDEFAULT == null ? preCondition != null : !PRE_CONDITION_EDEFAULT.equals(preCondition);
			case SecConPackage.USE_CASE__INCLUDES:
				return includes != null && !includes.isEmpty();
			case SecConPackage.USE_CASE__INCLUDE:
				return include != null;
			case SecConPackage.USE_CASE__EXTEND:
				return extend != null && !extend.isEmpty();
			case SecConPackage.USE_CASE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case SecConPackage.USE_CASE__SCENARIO:
				return scenario != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", preCondition: ");
		result.append(preCondition);
		result.append(')');
		return result.toString();
	}

} //UseCaseImpl
