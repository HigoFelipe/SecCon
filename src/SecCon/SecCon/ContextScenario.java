/**
 */
package SecCon.SecCon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.ContextScenario#getContains <em>Contains</em>}</li>
 *   <li>{@link SecCon.SecCon.ContextScenario#getIsFormed <em>Is Formed</em>}</li>
 *   <li>{@link SecCon.SecCon.ContextScenario#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getContextScenario()
 * @model
 * @generated
 */
public interface ContextScenario extends EObject {
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
	 * @see SecCon.SecCon.SecConPackage#getContextScenario_Contains()
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
	 * @see SecCon.SecCon.SecConPackage#getContextScenario_IsFormed()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextInformation> getIsFormed();

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
	 * @see SecCon.SecCon.SecConPackage#getContextScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.ContextScenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ContextScenario
