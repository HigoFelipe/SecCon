/**
 */
package SecCon.SecCon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SecCon.SecCon.Pseudostate#getInd <em>Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @see SecCon.SecCon.SecConPackage#getPseudostate()
 * @model
 * @generated
 */
public interface Pseudostate extends StateVertex {
	/**
	 * Returns the value of the '<em><b>Ind</b></em>' attribute.
	 * The literals are from the enumeration {@link SecCon.SecCon.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ind</em>' attribute.
	 * @see SecCon.SecCon.PseudostateKind
	 * @see #setInd(PseudostateKind)
	 * @see SecCon.SecCon.SecConPackage#getPseudostate_Ind()
	 * @model
	 * @generated
	 */
	PseudostateKind getInd();

	/**
	 * Sets the value of the '{@link SecCon.SecCon.Pseudostate#getInd <em>Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ind</em>' attribute.
	 * @see SecCon.SecCon.PseudostateKind
	 * @see #getInd()
	 * @generated
	 */
	void setInd(PseudostateKind value);

} // Pseudostate
