/**
 */
package core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Notification Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see core.CorePackage#getNotificationMethod()
 * @model
 * @generated
 */
public enum NotificationMethod implements Enumerator {
	/**
	 * The '<em><b>SMS Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMS_METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	SMS_METHOD(0, "SMSMethod", "SMSMethod"),

	/**
	 * The '<em><b>Mail Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAIL_METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	MAIL_METHOD(1, "MailMethod", "MailMethod"),

	/**
	 * The '<em><b>Default Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT_METHOD(2, "DefaultMethod", "DefaultMethod"),

	/**
	 * The '<em><b>Vocal Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOCAL_METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	VOCAL_METHOD(3, "VocalMethod", "VocalMethod"),

	/**
	 * The '<em><b>Web Service Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_SERVICE_METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_SERVICE_METHOD(4, "WebServiceMethod", "WebServiceMethod");

	/**
	 * The '<em><b>SMS Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMS Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMS_METHOD
	 * @model name="SMSMethod"
	 * @generated
	 * @ordered
	 */
	public static final int SMS_METHOD_VALUE = 0;

	/**
	 * The '<em><b>Mail Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mail Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAIL_METHOD
	 * @model name="MailMethod"
	 * @generated
	 * @ordered
	 */
	public static final int MAIL_METHOD_VALUE = 1;

	/**
	 * The '<em><b>Default Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_METHOD
	 * @model name="DefaultMethod"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_METHOD_VALUE = 2;

	/**
	 * The '<em><b>Vocal Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vocal Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOCAL_METHOD
	 * @model name="VocalMethod"
	 * @generated
	 * @ordered
	 */
	public static final int VOCAL_METHOD_VALUE = 3;

	/**
	 * The '<em><b>Web Service Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Web Service Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEB_SERVICE_METHOD
	 * @model name="WebServiceMethod"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_SERVICE_METHOD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Notification Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NotificationMethod[] VALUES_ARRAY =
		new NotificationMethod[] {
			SMS_METHOD,
			MAIL_METHOD,
			DEFAULT_METHOD,
			VOCAL_METHOD,
			WEB_SERVICE_METHOD,
		};

	/**
	 * A public read-only list of all the '<em><b>Notification Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NotificationMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Notification Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NotificationMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotificationMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notification Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NotificationMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotificationMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notification Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NotificationMethod get(int value) {
		switch (value) {
			case SMS_METHOD_VALUE: return SMS_METHOD;
			case MAIL_METHOD_VALUE: return MAIL_METHOD;
			case DEFAULT_METHOD_VALUE: return DEFAULT_METHOD;
			case VOCAL_METHOD_VALUE: return VOCAL_METHOD;
			case WEB_SERVICE_METHOD_VALUE: return WEB_SERVICE_METHOD;
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
	private NotificationMethod(int value, String name, String literal) {
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
	
} //NotificationMethod
