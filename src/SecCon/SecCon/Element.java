/**
 */
package SecCon.SecCon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.Element#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getElement_OwnedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getOwnedElement();

} // Element
