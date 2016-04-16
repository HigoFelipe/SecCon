/**
 */
package SecCon.SecCon;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.UseCase#getDescription <em>Description</em>}</li>
 *   <li>{@link SecCon.SecCon.UseCase#getActor <em>Actor</em>}</li>
 *   <li>{@link SecCon.SecCon.UseCase#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link SecCon.SecCon.UseCase#getIncludes <em>Includes</em>}</li>
 *   <li>{@link SecCon.SecCon.UseCase#getInclude <em>Include</em>}</li>
 *   <li>{@link SecCon.SecCon.UseCase#getExtend <em>Extend</em>}</li>
 *   <li>{@link SecCon.SecCon.UseCase#getExtends <em>Extends</em>}</li>
 *   <li>{@link SecCon.SecCon.UseCase#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getUseCase()
 * @model abstract="true"
 * @generated
 */
public interface UseCase extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link SecCon.SecCon.Include}.
	 * It is bidirectional and its opposite is '{@link SecCon.SecCon.Include#getAddition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see SecCon.SecCon.SecConPackage#getUseCase_Includes()
	 * @see SecCon.SecCon.Include#getAddition
	 * @model opposite="addition"
	 * @generated
	 */
	EList<Include> getIncludes();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SecCon.SecCon.Include#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' reference.
	 * @see #setInclude(Include)
	 * @see SecCon.SecCon.SecConPackage#getUseCase_Include()
	 * @see SecCon.SecCon.Include#getBase
	 * @model opposite="base"
	 * @generated
	 */
	Include getInclude();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.UseCase#getInclude <em>Include</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(Include value);

	/**
	 * Returns the value of the '<em><b>Extend</b></em>' reference list.
	 * The list contents are of type {@link SecCon.SecCon.Extend}.
	 * It is bidirectional and its opposite is '{@link SecCon.SecCon.Extend#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend</em>' reference list.
	 * @see SecCon.SecCon.SecConPackage#getUseCase_Extend()
	 * @see SecCon.SecCon.Extend#getExtension
	 * @model opposite="extension"
	 * @generated
	 */
	EList<Extend> getExtend();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link SecCon.SecCon.Extend}.
	 * It is bidirectional and its opposite is '{@link SecCon.SecCon.Extend#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see SecCon.SecCon.SecConPackage#getUseCase_Extends()
	 * @see SecCon.SecCon.Extend#getBase
	 * @model opposite="base"
	 * @generated
	 */
	EList<Extend> getExtends();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference.
	 * @see #setScenario(UseCaseScenario)
	 * @see SecCon.SecCon.SecConPackage#getUseCase_Scenario()
	 * @model
	 * @generated
	 */
	UseCaseScenario getScenario();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.UseCase#getScenario <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(UseCaseScenario value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see SecCon.SecCon.SecConPackage#getUseCase_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.UseCase#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference list.
	 * The list contents are of type {@link SecCon.SecCon.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference list.
	 * @see SecCon.SecCon.SecConPackage#getUseCase_Actor()
	 * @model
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' attribute.
	 * @see #setPreCondition(String)
	 * @see SecCon.SecCon.SecConPackage#getUseCase_PreCondition()
	 * @model
	 * @generated
	 */
	String getPreCondition();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.UseCase#getPreCondition <em>Pre Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' attribute.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(String value);

} // UseCase
