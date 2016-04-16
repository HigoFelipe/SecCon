/**
 */
package SecCon.SecCon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transistion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.Transistion#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getTransistion()
 * @model
 * @generated
 */
public interface Transistion extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(Event)
	 * @see SecCon.SecCon.SecConPackage#getTransistion_Trigger()
	 * @model
	 * @generated
	 */
	Event getTrigger();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Transistion#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Event value);

} // Transistion
