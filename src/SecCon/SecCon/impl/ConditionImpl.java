/**
 */
package SecCon.SecCon.impl;

import SecCon.SecCon.Condition;
import SecCon.SecCon.ContextInformation;
import SecCon.SecCon.SecConPackage;

import SecCon.SecCon.TypeOfCondition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SecCon.SecCon.impl.ConditionImpl#getHasContextInformation <em>Has Context Information</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.ConditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.ConditionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.ConditionImpl#isLogicValue <em>Logic Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The cached value of the '{@link #getHasContextInformation() <em>Has Context Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasContextInformation()
	 * @generated
	 * @ordered
	 */
	protected ContextInformation hasContextInformation;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final TypeOfCondition CONDITION_EDEFAULT = TypeOfCondition.IS_OFF;
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected TypeOfCondition condition = CONDITION_EDEFAULT;
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;
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
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecConPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextInformation getHasContextInformation() {
		return hasContextInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasContextInformation(ContextInformation newHasContextInformation, NotificationChain msgs) {
		ContextInformation oldHasContextInformation = hasContextInformation;
		hasContextInformation = newHasContextInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecConPackage.CONDITION__HAS_CONTEXT_INFORMATION, oldHasContextInformation, newHasContextInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasContextInformation(ContextInformation newHasContextInformation) {
		if (newHasContextInformation != hasContextInformation) {
			NotificationChain msgs = null;
			if (hasContextInformation != null)
				msgs = ((InternalEObject)hasContextInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecConPackage.CONDITION__HAS_CONTEXT_INFORMATION, null, msgs);
			if (newHasContextInformation != null)
				msgs = ((InternalEObject)newHasContextInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecConPackage.CONDITION__HAS_CONTEXT_INFORMATION, null, msgs);
			msgs = basicSetHasContextInformation(newHasContextInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.CONDITION__HAS_CONTEXT_INFORMATION, newHasContextInformation, newHasContextInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfCondition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(TypeOfCondition newCondition) {
		TypeOfCondition oldCondition = condition;
		condition = newCondition == null ? CONDITION_EDEFAULT : newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.CONDITION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.CONDITION__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.CONDITION__LOGIC_VALUE, oldLogicValue, logicValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecConPackage.CONDITION__HAS_CONTEXT_INFORMATION:
				return basicSetHasContextInformation(null, msgs);
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
			case SecConPackage.CONDITION__HAS_CONTEXT_INFORMATION:
				return getHasContextInformation();
			case SecConPackage.CONDITION__CONDITION:
				return getCondition();
			case SecConPackage.CONDITION__VALUE:
				return getValue();
			case SecConPackage.CONDITION__LOGIC_VALUE:
				return isLogicValue();
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
			case SecConPackage.CONDITION__HAS_CONTEXT_INFORMATION:
				setHasContextInformation((ContextInformation)newValue);
				return;
			case SecConPackage.CONDITION__CONDITION:
				setCondition((TypeOfCondition)newValue);
				return;
			case SecConPackage.CONDITION__VALUE:
				setValue((String)newValue);
				return;
			case SecConPackage.CONDITION__LOGIC_VALUE:
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
			case SecConPackage.CONDITION__HAS_CONTEXT_INFORMATION:
				setHasContextInformation((ContextInformation)null);
				return;
			case SecConPackage.CONDITION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case SecConPackage.CONDITION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SecConPackage.CONDITION__LOGIC_VALUE:
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
			case SecConPackage.CONDITION__HAS_CONTEXT_INFORMATION:
				return hasContextInformation != null;
			case SecConPackage.CONDITION__CONDITION:
				return condition != CONDITION_EDEFAULT;
			case SecConPackage.CONDITION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SecConPackage.CONDITION__LOGIC_VALUE:
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(", value: ");
		result.append(value);
		result.append(", logicValue: ");
		result.append(logicValue);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
