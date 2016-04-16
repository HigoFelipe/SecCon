/**
 */
package SecCon.SecCon;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.StateMachineScenario#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link SecCon.SecCon.StateMachineScenario#getAuthor <em>Author</em>}</li>
 *   <li>{@link SecCon.SecCon.StateMachineScenario#getVersion <em>Version</em>}</li>
 *   <li>{@link SecCon.SecCon.StateMachineScenario#getOwnedEvent <em>Owned Event</em>}</li>
 *   <li>{@link SecCon.SecCon.StateMachineScenario#getOwnedTransition <em>Owned Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getStateMachineScenario()
 * @model
 * @generated
 */
public interface StateMachineScenario extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.StateVertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getStateMachineScenario_OwnedState()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateVertex> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see SecCon.SecCon.SecConPackage#getStateMachineScenario_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.StateMachineScenario#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see SecCon.SecCon.SecConPackage#getStateMachineScenario_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.StateMachineScenario#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Owned Event</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Event</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getStateMachineScenario_OwnedEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getOwnedEvent();

	/**
	 * Returns the value of the '<em><b>Owned Transition</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transition</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getStateMachineScenario_OwnedTransition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOwnedTransition();

} // StateMachineScenario
