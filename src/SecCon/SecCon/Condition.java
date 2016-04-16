/**
 */
package SecCon.SecCon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.Condition#getHasContextInformation <em>Has Context Information</em>}</li>
 *   <li>{@link SecCon.SecCon.Condition#getCondition <em>Condition</em>}</li>
 *   <li>{@link SecCon.SecCon.Condition#getValue <em>Value</em>}</li>
 *   <li>{@link SecCon.SecCon.Condition#isLogicValue <em>Logic Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Context Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Context Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Context Information</em>' containment reference.
	 * @see #setHasContextInformation(ContextInformation)
	 * @see SecCon.SecCon.SecConPackage#getCondition_HasContextInformation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContextInformation getHasContextInformation();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Condition#getHasContextInformation <em>Has Context Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Context Information</em>' containment reference.
	 * @see #getHasContextInformation()
	 * @generated
	 */
	void setHasContextInformation(ContextInformation value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link SecCon.SecCon.TypeOfCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see SecCon.SecCon.TypeOfCondition
	 * @see #setCondition(TypeOfCondition)
	 * @see SecCon.SecCon.SecConPackage#getCondition_Condition()
	 * @model
	 * @generated
	 */
	TypeOfCondition getCondition();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Condition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see SecCon.SecCon.TypeOfCondition
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(TypeOfCondition value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see SecCon.SecCon.SecConPackage#getCondition_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Condition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
	 * @see SecCon.SecCon.SecConPackage#getCondition_LogicValue()
	 * @model
	 * @generated
	 */
	boolean isLogicValue();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Condition#isLogicValue <em>Logic Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic Value</em>' attribute.
	 * @see #isLogicValue()
	 * @generated
	 */
	void setLogicValue(boolean value);

} // Condition
