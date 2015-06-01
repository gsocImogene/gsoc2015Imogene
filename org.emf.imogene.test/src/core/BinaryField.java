/**
 */
package core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.BinaryField#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getBinaryField()
 * @model
 * @generated
 */
public interface BinaryField extends FieldEntity {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see core.CorePackage#getBinaryField_Category()
	 * @model required="true"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link core.BinaryField#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

} // BinaryField
