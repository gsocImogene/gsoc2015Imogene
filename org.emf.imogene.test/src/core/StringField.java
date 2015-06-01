/**
 */
package core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.StringField#getValidationRules <em>Validation Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getStringField()
 * @model abstract="true"
 * @generated
 */
public interface StringField extends FieldEntity {
	/**
	 * Returns the value of the '<em><b>Validation Rules</b></em>' containment reference list.
	 * The list contents are of type {@link core.ValidationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If several validation rules are defined, all of them will have to be satisfied
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validation Rules</em>' containment reference list.
	 * @see core.CorePackage#getStringField_ValidationRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValidationRule> getValidationRules();

} // StringField
