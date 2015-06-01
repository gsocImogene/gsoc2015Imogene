/**
 */
package core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phone Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.PhoneField#getPhoneType <em>Phone Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getPhoneField()
 * @model
 * @generated
 */
public interface PhoneField extends TextField {
	/**
	 * Returns the value of the '<em><b>Phone Type</b></em>' attribute.
	 * The default value is <code>"PhoneNumber"</code>.
	 * The literals are from the enumeration {@link core.PhoneType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Type</em>' attribute.
	 * @see core.PhoneType
	 * @see #setPhoneType(PhoneType)
	 * @see core.CorePackage#getPhoneField_PhoneType()
	 * @model default="PhoneNumber" required="true"
	 * @generated
	 */
	PhoneType getPhoneType();

	/**
	 * Sets the value of the '{@link core.PhoneField#getPhoneType <em>Phone Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Type</em>' attribute.
	 * @see core.PhoneType
	 * @see #getPhoneType()
	 * @generated
	 */
	void setPhoneType(PhoneType value);

} // PhoneField
