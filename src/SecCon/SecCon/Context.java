/**
 */
package SecCon.SecCon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.Context#getContains <em>Contains</em>}</li>
 *   <li>{@link SecCon.SecCon.Context#getIsFormed <em>Is Formed</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getContext_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getContains();

	/**
	 * Returns the value of the '<em><b>Is Formed</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.ContextInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Formed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Formed</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getContext_IsFormed()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextInformation> getIsFormed();

} // Context
