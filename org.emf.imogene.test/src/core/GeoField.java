/**
 */
package core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.GeoField#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getGeoField()
 * @model
 * @generated
 */
public interface GeoField extends StringField {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Nothing"</code>.
	 * The literals are from the enumeration {@link core.GeoType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see core.GeoType
	 * @see #setType(GeoType)
	 * @see core.CorePackage#getGeoField_Type()
	 * @model default="Nothing" required="true"
	 * @generated
	 */
	GeoType getType();

	/**
	 * Sets the value of the '{@link core.GeoField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see core.GeoType
	 * @see #getType()
	 * @generated
	 */
	void setType(GeoType value);

} // GeoField
