/**
 */
package SecCon.SecCon;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.State#getOwnedStateOperation <em>Owned State Operation</em>}</li>
 *   <li>{@link SecCon.SecCon.State#getDeferrableEvent <em>Deferrable Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getState()
 * @model abstract="true"
 * @generated
 */
public interface State extends StateVertex {
	/**
	 * Returns the value of the '<em><b>Owned State Operation</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.StateOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State Operation</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getState_OwnedStateOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateOperation> getOwnedStateOperation();

	/**
	 * Returns the value of the '<em><b>Deferrable Event</b></em>' reference list.
	 * The list contents are of type {@link SecCon.SecCon.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferrable Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrable Event</em>' reference list.
	 * @see SecCon.SecCon.SecConPackage#getState_DeferrableEvent()
	 * @model
	 * @generated
	 */
	EList<Event> getDeferrableEvent();

} // State
