/**
 */
package SecCon.SecCon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.Rule#getHasCondition <em>Has Condition</em>}</li>
 *   <li>{@link SecCon.SecCon.Rule#getHasAction <em>Has Action</em>}</li>
 *   <li>{@link SecCon.SecCon.Rule#getName <em>Name</em>}</li>
 *   <li>{@link SecCon.SecCon.Rule#getOperator <em>Operator</em>}</li>
 *   <li>{@link SecCon.SecCon.Rule#isLogicValue <em>Logic Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Condition</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Condition</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getRule_HasCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getHasCondition();

	/**
	 * Returns the value of the '<em><b>Has Action</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Action</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getRule_HasAction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getHasAction();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SecCon.SecCon.SecConPackage#getRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SecCon.SecCon.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see SecCon.SecCon.Operator
	 * @see #setOperator(Operator)
	 * @see SecCon.SecCon.SecConPackage#getRule_Operator()
	 * @model
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Rule#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see SecCon.SecCon.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Logic Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Value</em>' attribute.
	 * @see #setLogicValue(boolean)
	 * @see SecCon.SecCon.SecConPackage#getRule_LogicValue()
	 * @model
	 * @generated
	 */
	boolean isLogicValue();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Rule#isLogicValue <em>Logic Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic Value</em>' attribute.
	 * @see #isLogicValue()
	 * @generated
	 */
	void setLogicValue(boolean value);

} // Rule
