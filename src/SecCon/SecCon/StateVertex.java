/**
 */
package SecCon.SecCon;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.StateVertex#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link SecCon.SecCon.StateVertex#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getStateVertex()
 * @model abstract="true"
 * @generated
 */
public interface StateVertex extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link SecCon.SecCon.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see SecCon.SecCon.SecConPackage#getStateVertex_Outgoing()
	 * @model
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link SecCon.SecCon.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see SecCon.SecCon.SecConPackage#getStateVertex_Incoming()
	 * @model
	 * @generated
	 */
	EList<Transition> getIncoming();
} // StateVertex
