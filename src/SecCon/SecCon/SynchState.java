/**
 */
package SecCon.SecCon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synch State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.SynchState#getBound <em>Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getSynchState()
 * @model
 * @generated
 */
public interface SynchState extends StateVertex {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' attribute.
	 * @see #setBound(long)
	 * @see SecCon.SecCon.SecConPackage#getSynchState_Bound()
	 * @model
	 * @generated
	 */
	long getBound();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.SynchState#getBound <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' attribute.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(long value);

} // SynchState
