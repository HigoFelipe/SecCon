/**
 */
package SecCon.SecCon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.Extend#getName <em>Name</em>}</li>
 *   <li>{@link SecCon.SecCon.Extend#getCondition <em>Condition</em>}</li>
 *   <li>{@link SecCon.SecCon.Extend#getExtension <em>Extension</em>}</li>
 *   <li>{@link SecCon.SecCon.Extend#getBase <em>Base</em>}</li>
 *   <li>{@link SecCon.SecCon.Extend#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getExtend()
 * @model
 * @generated
 */
public interface Extend extends EObject {
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
	 * @see SecCon.SecCon.SecConPackage#getExtend_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Extend#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SecCon.SecCon.UseCase#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(UseCase)
	 * @see SecCon.SecCon.SecConPackage#getExtend_Base()
	 * @see SecCon.SecCon.UseCase#getExtends
	 * @model opposite="extends" required="true"
	 * @generated
	 */
	UseCase getBase();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Extend#getBase <em>Base</em>}' reference.
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
	 * @see SecCon.SecCon.SecConPackage#getExtend_Scenario()
	 * @model
	 * @generated
	 */
	UseCaseScenario getScenario();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Extend#getScenario <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(UseCaseScenario value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see SecCon.SecCon.SecConPackage#getExtend_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Extend#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SecCon.SecCon.UseCase#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' reference.
	 * @see #setExtension(UseCase)
	 * @see SecCon.SecCon.SecConPackage#getExtend_Extension()
	 * @see SecCon.SecCon.UseCase#getExtend
	 * @model opposite="extend" required="true"
	 * @generated
	 */
	UseCase getExtension();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Extend#getExtension <em>Extension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(UseCase value);

} // Extend
