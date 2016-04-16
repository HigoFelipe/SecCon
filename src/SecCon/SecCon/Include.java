/**
 */
package SecCon.SecCon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.Include#getAddition <em>Addition</em>}</li>
 *   <li>{@link SecCon.SecCon.Include#getBase <em>Base</em>}</li>
 *   <li>{@link SecCon.SecCon.Include#getScenario <em>Scenario</em>}</li>
 *   <li>{@link SecCon.SecCon.Include#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends EObject {
	/**
	 * Returns the value of the '<em><b>Addition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SecCon.SecCon.UseCase#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addition</em>' reference.
	 * @see #setAddition(UseCase)
	 * @see SecCon.SecCon.SecConPackage#getInclude_Addition()
	 * @see SecCon.SecCon.UseCase#getIncludes
	 * @model opposite="includes" required="true"
	 * @generated
	 */
	UseCase getAddition();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Include#getAddition <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addition</em>' reference.
	 * @see #getAddition()
	 * @generated
	 */
	void setAddition(UseCase value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SecCon.SecCon.UseCase#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(UseCase)
	 * @see SecCon.SecCon.SecConPackage#getInclude_Base()
	 * @see SecCon.SecCon.UseCase#getInclude
	 * @model opposite="include" required="true"
	 * @generated
	 */
	UseCase getBase();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Include#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(UseCase value);

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
	 * @see SecCon.SecCon.SecConPackage#getInclude_Scenario()
	 * @model
	 * @generated
	 */
	UseCaseScenario getScenario();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Include#getScenario <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(UseCaseScenario value);

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
	 * @see SecCon.SecCon.SecConPackage#getInclude_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Include#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Include
