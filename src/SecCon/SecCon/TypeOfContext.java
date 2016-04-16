/**
 */
package SecCon.SecCon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Of Context</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SecCon.SecCon.SecConPackage#getTypeOfContext()
 * @model
 * @generated
 */
public enum TypeOfContext implements Enumerator {
	/**
	 * The '<em><b>WIFI STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	WIFI_STATUS(4, "WIFI_STATUS", "WIFI_STATUS"), /**
	 * The '<em><b>BLUETOOTH STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	BLUETOOTH_STATUS(5, "BLUETOOTH_STATUS", "BLUETOOTH_STATUS"), /**
	 * The '<em><b>BATTERY LEVEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY_LEVEL(0, "BATTERY_LEVEL", "BATTERY_LEVEL"), /**
	 * The '<em><b>CPU LOAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPU_LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	CPU_LOAD(1, "CPU_LOAD", "CPU_LOAD"), /**
	 * The '<em><b>MEMORY LOAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY_LOAD(2, "MEMORY_LOAD", "MEMORY_LOAD"), /**
	 * The '<em><b>AIRPLANE MODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRPLANE_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	AIRPLANE_MODE(3, "AIRPLANE_MODE", "AIRPLANE_MODE"), /**
	 * The '<em><b>NETWORK STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_STATUS(6, "NETWORK_STATUS", "NETWORK_STATUS"), /**
	 * The '<em><b>GPS STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPS_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	GPS_STATUS(7, "GPS_STATUS", "GPS_STATUS");

	/**
	 * The '<em><b>WIFI STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIFI STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIFI_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIFI_STATUS_VALUE = 4;

	/**
	 * The '<em><b>BLUETOOTH STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLUETOOTH STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLUETOOTH_STATUS_VALUE = 5;

	/**
	 * The '<em><b>BATTERY LEVEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BATTERY LEVEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BATTERY_LEVEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY_LEVEL_VALUE = 0;

	/**
	 * The '<em><b>CPU LOAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CPU LOAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPU_LOAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CPU_LOAD_VALUE = 1;

	/**
	 * The '<em><b>MEMORY LOAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEMORY LOAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMORY_LOAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_LOAD_VALUE = 2;

	/**
	 * The '<em><b>AIRPLANE MODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AIRPLANE MODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AIRPLANE_MODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AIRPLANE_MODE_VALUE = 3;

	/**
	 * The '<em><b>NETWORK STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NETWORK STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETWORK_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_STATUS_VALUE = 6;

	/**
	 * The '<em><b>GPS STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GPS STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GPS_STATUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GPS_STATUS_VALUE = 7;

	/**
	 * An array of all the '<em><b>Type Of Context</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeOfContext[] VALUES_ARRAY =
		new TypeOfContext[] {
			WIFI_STATUS,
			BLUETOOTH_STATUS,
			BATTERY_LEVEL,
			CPU_LOAD,
			MEMORY_LOAD,
			AIRPLANE_MODE,
			NETWORK_STATUS,
			GPS_STATUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Of Context</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeOfContext> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Of Context</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeOfContext get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfContext result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Context</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeOfContext getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfContext result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Context</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeOfContext get(int value) {
		switch (value) {
			case WIFI_STATUS_VALUE: return WIFI_STATUS;
			case BLUETOOTH_STATUS_VALUE: return BLUETOOTH_STATUS;
			case BATTERY_LEVEL_VALUE: return BATTERY_LEVEL;
			case CPU_LOAD_VALUE: return CPU_LOAD;
			case MEMORY_LOAD_VALUE: return MEMORY_LOAD;
			case AIRPLANE_MODE_VALUE: return AIRPLANE_MODE;
			case NETWORK_STATUS_VALUE: return NETWORK_STATUS;
			case GPS_STATUS_VALUE: return GPS_STATUS;
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
	private TypeOfContext(int value, String name, String literal) {
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
	
} //TypeOfContext
