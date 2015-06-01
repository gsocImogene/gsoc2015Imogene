/**
 */
package core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.FilterField#getParentActor <em>Parent Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getFilterField()
 * @model
 * @generated
 */
public interface FilterField extends RelationFieldEntity {
	/**
	 * Returns the value of the '<em><b>Parent Actor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link core.Actor#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Actor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Actor</em>' container reference.
	 * @see #setParentActor(Actor)
	 * @see core.CorePackage#getFilterField_ParentActor()
	 * @see core.Actor#getFilters
	 * @model opposite="filters" transient="false"
	 * @generated
	 */
	Actor getParentActor();

	/**
	 * Sets the value of the '{@link core.FilterField#getParentActor <em>Parent Actor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Actor</em>' container reference.
	 * @see #getParentActor()
	 * @generated
	 */
	void setParentActor(Actor value);

} // FilterField
