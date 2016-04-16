/**
 */
package SecCon.SecCon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.ContextInformation#getName <em>Name</em>}</li>
 *   <li>{@link SecCon.SecCon.ContextInformation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getContextInformation()
 * @model
 * @generated
 */
public interface ContextInformation extends EObject {

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
	 * @see SecCon.SecCon.SecConPackage#getContextInformation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.ContextInformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link SecCon.SecCon.TypeOfContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see SecCon.SecCon.TypeOfContext
	 * @see #setType(TypeOfContext)
	 * @see SecCon.SecCon.SecConPackage#getContextInformation_Type()
	 * @model
	 * @generated
	 */
	TypeOfContext getType();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.ContextInformation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see SecCon.SecCon.TypeOfContext
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeOfContext value);
} // ContextInformation
