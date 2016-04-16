/**
 */
package SecCon.SecCon;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.Project#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link SecCon.SecCon.Project#getOwnedUseCaseScenario <em>Owned Use Case Scenario</em>}</li>
 *   <li>{@link SecCon.SecCon.Project#getOwnedStateMachineScenario <em>Owned State Machine Scenario</em>}</li>
 *   <li>{@link SecCon.SecCon.Project#getOwnedContextScenario <em>Owned Context Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Packages</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Packages</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getProject_OwnedPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecCon.SecCon.Package> getOwnedPackages();

	/**
	 * Returns the value of the '<em><b>Owned Use Case Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.UseCaseScenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Use Case Scenario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Use Case Scenario</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getProject_OwnedUseCaseScenario()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCaseScenario> getOwnedUseCaseScenario();

	/**
	 * Returns the value of the '<em><b>Owned State Machine Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.StateMachineScenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State Machine Scenario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State Machine Scenario</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getProject_OwnedStateMachineScenario()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateMachineScenario> getOwnedStateMachineScenario();

	/**
	 * Returns the value of the '<em><b>Owned Context Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.ContextScenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Context Scenario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Context Scenario</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getProject_OwnedContextScenario()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextScenario> getOwnedContextScenario();

} // Project
