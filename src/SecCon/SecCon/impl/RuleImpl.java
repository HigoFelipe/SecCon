/**
 */
package SecCon.SecCon.impl;

import SecCon.SecCon.Action;
import SecCon.SecCon.Condition;
import SecCon.SecCon.Operator;
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
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SecCon.SecCon.impl.RuleImpl#getHasCondition <em>Has Condition</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.RuleImpl#getHasAction <em>Has Action</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.RuleImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.RuleImpl#isLogicValue <em>Logic Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The cached value of the '{@link #getHasCondition() <em>Has Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> hasCondition;

	/**
	 * The cached value of the '{@link #getHasAction() <em>Has Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> hasAction;

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
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final Operator OPERATOR_EDEFAULT = Operator.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isLogicValue() <em>Logic Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogicValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOGIC_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLogicValue() <em>Logic Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogicValue()
	 * @generated
	 * @ordered
	 */
	protected boolean logicValue = LOGIC_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecConPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getHasCondition() {
		if (hasCondition == null) {
			hasCondition = new EObjectContainmentEList<Condition>(Condition.class, this, SecConPackage.RULE__HAS_CONDITION);
		}
		return hasCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getHasAction() {
		if (hasAction == null) {
			hasAction = new EObjectContainmentEList<Action>(Action.class, this, SecConPackage.RULE__HAS_ACTION);
		}
		return hasAction;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operator newOperator) {
		Operator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.RULE__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLogicValue() {
		return logicValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicValue(boolean newLogicValue) {
		boolean oldLogicValue = logicValue;
		logicValue = newLogicValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.RULE__LOGIC_VALUE, oldLogicValue, logicValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecConPackage.RULE__HAS_CONDITION:
				return ((InternalEList<?>)getHasCondition()).basicRemove(otherEnd, msgs);
			case SecConPackage.RULE__HAS_ACTION:
				return ((InternalEList<?>)getHasAction()).basicRemove(otherEnd, msgs);
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
			case SecConPackage.RULE__HAS_CONDITION:
				return getHasCondition();
			case SecConPackage.RULE__HAS_ACTION:
				return getHasAction();
			case SecConPackage.RULE__NAME:
				return getName();
			case SecConPackage.RULE__OPERATOR:
				return getOperator();
			case SecConPackage.RULE__LOGIC_VALUE:
				return isLogicValue();
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
			case SecConPackage.RULE__HAS_CONDITION:
				getHasCondition().clear();
				getHasCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case SecConPackage.RULE__HAS_ACTION:
				getHasAction().clear();
				getHasAction().addAll((Collection<? extends Action>)newValue);
				return;
			case SecConPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case SecConPackage.RULE__OPERATOR:
				setOperator((Operator)newValue);
				return;
			case SecConPackage.RULE__LOGIC_VALUE:
				setLogicValue((Boolean)newValue);
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
			case SecConPackage.RULE__HAS_CONDITION:
				getHasCondition().clear();
				return;
			case SecConPackage.RULE__HAS_ACTION:
				getHasAction().clear();
				return;
			case SecConPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecConPackage.RULE__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case SecConPackage.RULE__LOGIC_VALUE:
				setLogicValue(LOGIC_VALUE_EDEFAULT);
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
			case SecConPackage.RULE__HAS_CONDITION:
				return hasCondition != null && !hasCondition.isEmpty();
			case SecConPackage.RULE__HAS_ACTION:
				return hasAction != null && !hasAction.isEmpty();
			case SecConPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecConPackage.RULE__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case SecConPackage.RULE__LOGIC_VALUE:
				return logicValue != LOGIC_VALUE_EDEFAULT;
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
		result.append(", operator: ");
		result.append(operator);
		result.append(", logicValue: ");
		result.append(logicValue);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
