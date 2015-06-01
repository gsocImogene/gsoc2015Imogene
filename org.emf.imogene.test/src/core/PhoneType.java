/**
 */
package core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Phone Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see core.CorePackage#getPhoneType()
 * @model
 * @generated
 */
public enum PhoneType implements Enumerator {
	/**
	 * The '<em><b>Phone Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONE_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	PHONE_NUMBER(0, "PhoneNumber", "PhoneNumber"),

	/**
	 * The '<em><b>Fax Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAX_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	FAX_NUMBER(1, "FaxNumber", "FaxNumber"),

	/**
	 * The '<em><b>Mobile Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	MOBILE_NUMBER(2, "MobileNumber", "MobileNumber"),

	/**
	 * The '<em><b>Fixe Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXE_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	FIXE_NUMBER(3, "FixeNumber", "FixeNumber");

	/**
	 * The '<em><b>Phone Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Phone Number</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHONE_NUMBER
	 * @model name="PhoneNumber"
	 * @generated
	 * @ordered
	 */
	public static final int PHONE_NUMBER_VALUE = 0;

	/**
	 * The '<em><b>Fax Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fax Number</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAX_NUMBER
	 * @model name="FaxNumber"
	 * @generated
	 * @ordered
	 */
	public static final int FAX_NUMBER_VALUE = 1;

	/**
	 * The '<em><b>Mobile Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mobile Number</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOBILE_NUMBER
	 * @model name="MobileNumber"
	 * @generated
	 * @ordered
	 */
	public static final int MOBILE_NUMBER_VALUE = 2;

	/**
	 * The '<em><b>Fixe Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fixe Number</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIXE_NUMBER
	 * @model name="FixeNumber"
	 * @generated
	 * @ordered
	 */
	public static final int FIXE_NUMBER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Phone Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PhoneType[] VALUES_ARRAY =
		new PhoneType[] {
			PHONE_NUMBER,
			FAX_NUMBER,
			MOBILE_NUMBER,
			FIXE_NUMBER,
		};

	/**
	 * A public read-only list of all the '<em><b>Phone Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PhoneType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Phone Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhoneType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhoneType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Phone Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhoneType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhoneType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Phone Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhoneType get(int value) {
		switch (value) {
			case PHONE_NUMBER_VALUE: return PHONE_NUMBER;
			case FAX_NUMBER_VALUE: return FAX_NUMBER;
			case MOBILE_NUMBER_VALUE: return MOBILE_NUMBER;
			case FIXE_NUMBER_VALUE: return FIXE_NUMBER;
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
	private PhoneType(int value, String name, String literal) {
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
	
} //PhoneType
