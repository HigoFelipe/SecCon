/**
 */
package SecCon.SecCon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Of Condition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SecCon.SecCon.SecConPackage#getTypeOfCondition()
 * @model
 * @generated
 */
public enum TypeOfCondition implements Enumerator {
	/**
	 * The '<em><b>IS OFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_OFF_VALUE
	 * @generated
	 * @ordered
	 */
	IS_OFF(9, "IS_OFF", "IS_OFF"), /**
	 * The '<em><b>IS ON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ON_VALUE
	 * @generated
	 * @ordered
	 */
	IS_ON(8, "IS_ON", "IS_ON"), /**
	 * The '<em><b>IS EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	IS_EQUAL(1, "IS_EQUAL", "IS_EQUAL"),

	/**
	 * The '<em><b>WHEN HIGHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEN_HIGHER_VALUE
	 * @generated
	 * @ordered
	 */
	WHEN_HIGHER(3, "WHEN_HIGHER", "WHEN_HIGHER"),

	/**
	 * The '<em><b>WHEN LOWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEN_LOWER_VALUE
	 * @generated
	 * @ordered
	 */
	WHEN_LOWER(4, "WHEN_LOWER", "WHEN_LOWER"), /**
	 * The '<em><b>IS DIFFERENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_DIFFERENT_VALUE
	 * @generated
	 * @ordered
	 */
	IS_DIFFERENT(0, "IS_DIFFERENT", "IS_DIFFERENT"),

	/**
	 * The '<em><b>WHILE EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHILE_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	WHILE_EQUALS(5, "WHILE_EQUALS", "WHILE_EQUALS"),

	/**
	 * The '<em><b>WHILE LOWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHILE_LOWER_VALUE
	 * @generated
	 * @ordered
	 */
	WHILE_LOWER(7, "WHILE_LOWER", "WHILE_LOWER"), /**
	 * The '<em><b>WHILE HIGHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHILE_HIGHER_VALUE
	 * @generated
	 * @ordered
	 */
	WHILE_HIGHER(6, "WHILE_HIGHER", "WHILE_HIGHER"), /**
	 * The '<em><b>WHEN EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEN_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	WHEN_EQUALS(2, "WHEN_EQUALS", "WHEN_EQUALS");

	/**
	 * The '<em><b>IS OFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IS OFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_OFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS_OFF_VALUE = 9;

	/**
	 * The '<em><b>IS ON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IS ON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_ON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS_ON_VALUE = 8;

	/**
	 * The '<em><b>IS EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS_EQUAL_VALUE = 1;

	/**
	 * The '<em><b>WHEN HIGHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>When Higher</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHEN_HIGHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHEN_HIGHER_VALUE = 3;

	/**
	 * The '<em><b>WHEN LOWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>When Lower</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHEN_LOWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHEN_LOWER_VALUE = 4;

	/**
	 * The '<em><b>IS DIFFERENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Different</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_DIFFERENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS_DIFFERENT_VALUE = 0;

	/**
	 * The '<em><b>WHILE EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>While Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHILE_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHILE_EQUALS_VALUE = 5;

	/**
	 * The '<em><b>WHILE LOWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>While Lower</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHILE_LOWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHILE_LOWER_VALUE = 7;

	/**
	 * The '<em><b>WHILE HIGHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>While Higher</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHILE_HIGHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHILE_HIGHER_VALUE = 6;

	/**
	 * The '<em><b>WHEN EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>When Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHEN_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WHEN_EQUALS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Of Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeOfCondition[] VALUES_ARRAY =
		new TypeOfCondition[] {
			IS_OFF,
			IS_ON,
			IS_EQUAL,
			WHEN_HIGHER,
			WHEN_LOWER,
			IS_DIFFERENT,
			WHILE_EQUALS,
			WHILE_LOWER,
			WHILE_HIGHER,
			WHEN_EQUALS,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Of Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeOfCondition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Of Condition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeOfCondition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfCondition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Condition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeOfCondition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfCondition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Condition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeOfCondition get(int value) {
		switch (value) {
			case IS_OFF_VALUE: return IS_OFF;
			case IS_ON_VALUE: return IS_ON;
			case IS_EQUAL_VALUE: return IS_EQUAL;
			case WHEN_HIGHER_VALUE: return WHEN_HIGHER;
			case WHEN_LOWER_VALUE: return WHEN_LOWER;
			case IS_DIFFERENT_VALUE: return IS_DIFFERENT;
			case WHILE_EQUALS_VALUE: return WHILE_EQUALS;
			case WHILE_LOWER_VALUE: return WHILE_LOWER;
			case WHILE_HIGHER_VALUE: return WHILE_HIGHER;
			case WHEN_EQUALS_VALUE: return WHEN_EQUALS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeOfCondition(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeOfCondition
