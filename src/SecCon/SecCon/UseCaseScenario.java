/**
 */
package SecCon.SecCon;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.UseCaseScenario#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link SecCon.SecCon.UseCaseScenario#getOwnedExtend <em>Owned Extend</em>}</li>
 *   <li>{@link SecCon.SecCon.UseCaseScenario#getOwnedInclude <em>Owned Include</em>}</li>
 *   <li>{@link SecCon.SecCon.UseCaseScenario#getAuthor <em>Author</em>}</li>
 *   <li>{@link SecCon.SecCon.UseCaseScenario#getVersion <em>Version</em>}</li>
 *   <li>{@link SecCon.SecCon.UseCaseScenario#getOwnedActor <em>Owned Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getUseCaseScenario()
 * @model
 * @generated
 */
public interface UseCaseScenario extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.UseCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Use Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Use Case</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getUseCaseScenario_OwnedUseCase()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCase> getOwnedUseCase();

	/**
	 * Returns the value of the '<em><b>Owned Extend</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.Extend}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Extend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Extend</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getUseCaseScenario_OwnedExtend()
	 * @model containment="true"
	 * @generated
	 */
	EList<Extend> getOwnedExtend();

	/**
	 * Returns the value of the '<em><b>Owned Include</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.Include}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Include</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getUseCaseScenario_OwnedInclude()
	 * @model containment="true"
	 * @generated
	 */
	EList<Include> getOwnedInclude();

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
	 * @see SecCon.SecCon.SecConPackage#getUseCaseScenario_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.UseCaseScenario#getAuthor <em>Author</em>}' attribute.
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
	 * @see SecCon.SecCon.SecConPackage#getUseCaseScenario_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.UseCaseScenario#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Owned Actor</b></em>' containment reference list.
	 * The list contents are of type {@link SecCon.SecCon.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actor</em>' containment reference list.
	 * @see SecCon.SecCon.SecConPackage#getUseCaseScenario_OwnedActor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getOwnedActor();

} // UseCaseScenario
