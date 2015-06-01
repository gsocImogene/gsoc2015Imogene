/**
 */
package core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.TextField#isTranslatable <em>Translatable</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getTextField()
 * @model
 * @generated
 */
public interface TextField extends StringField {
	/**
	 * Returns the value of the '<em><b>Translatable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indique si le champs est traduisible ou non
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translatable</em>' attribute.
	 * @see #setTranslatable(boolean)
	 * @see core.CorePackage#getTextField_Translatable()
	 * @model default="false"
	 * @generated
	 */
	boolean isTranslatable();

	/**
	 * Sets the value of the '{@link core.TextField#isTranslatable <em>Translatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translatable</em>' attribute.
	 * @see #isTranslatable()
	 * @generated
	 */
	void setTranslatable(boolean value);

} // TextField
