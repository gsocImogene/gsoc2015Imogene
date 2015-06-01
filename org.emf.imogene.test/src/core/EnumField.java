/**
 */
package core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.EnumField#getEnumValues <em>Enum Values</em>}</li>
 *   <li>{@link core.EnumField#isMultipleSelection <em>Multiple Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getEnumField()
 * @model
 * @generated
 */
public interface EnumField extends FieldEntity {
	/**
	 * Returns the value of the '<em><b>Enum Values</b></em>' containment reference list.
	 * The list contents are of type {@link core.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Values</em>' containment reference list.
	 * @see core.CorePackage#getEnumField_EnumValues()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<EnumValue> getEnumValues();

	/**
	 * Returns the value of the '<em><b>Multiple Selection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Selection</em>' attribute.
	 * @see #setMultipleSelection(boolean)
	 * @see core.CorePackage#getEnumField_MultipleSelection()
	 * @model default="false"
	 * @generated
	 */
	boolean isMultipleSelection();

	/**
	 * Sets the value of the '{@link core.EnumField#isMultipleSelection <em>Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Selection</em>' attribute.
	 * @see #isMultipleSelection()
	 * @generated
	 */
	void setMultipleSelection(boolean value);

} // EnumField
