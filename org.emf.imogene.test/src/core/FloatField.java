/**
 */
package core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.FloatField#getDecimalNumber <em>Decimal Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getFloatField()
 * @model
 * @generated
 */
public interface FloatField extends NumericField {
	/**
	 * Returns the value of the '<em><b>Decimal Number</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Number</em>' attribute.
	 * @see #setDecimalNumber(int)
	 * @see core.CorePackage#getFloatField_DecimalNumber()
	 * @model default="-1"
	 * @generated
	 */
	int getDecimalNumber();

	/**
	 * Sets the value of the '{@link core.FloatField#getDecimalNumber <em>Decimal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Number</em>' attribute.
	 * @see #getDecimalNumber()
	 * @generated
	 */
	void setDecimalNumber(int value);

} // FloatField
