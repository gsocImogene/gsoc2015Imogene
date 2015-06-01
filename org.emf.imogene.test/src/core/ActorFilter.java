/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.ActorFilter#getEntityField <em>Entity Field</em>}</li>
 *   <li>{@link core.ActorFilter#getActorField <em>Actor Field</em>}</li>
 *   <li>{@link core.ActorFilter#isSufficient <em>Sufficient</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getActorFilter()
 * @model
 * @generated
 */
public interface ActorFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Field</em>' reference.
	 * @see #setEntityField(RelationFieldEntity)
	 * @see core.CorePackage#getActorFilter_EntityField()
	 * @model required="true"
	 * @generated
	 */
	RelationFieldEntity getEntityField();

	/**
	 * Sets the value of the '{@link core.ActorFilter#getEntityField <em>Entity Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Field</em>' reference.
	 * @see #getEntityField()
	 * @generated
	 */
	void setEntityField(RelationFieldEntity value);

	/**
	 * Returns the value of the '<em><b>Actor Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Field</em>' reference.
	 * @see #setActorField(FilterField)
	 * @see core.CorePackage#getActorFilter_ActorField()
	 * @model required="true"
	 * @generated
	 */
	FilterField getActorField();

	/**
	 * Sets the value of the '{@link core.ActorFilter#getActorField <em>Actor Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Field</em>' reference.
	 * @see #getActorField()
	 * @generated
	 */
	void setActorField(FilterField value);

	/**
	 * Returns the value of the '<em><b>Sufficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sufficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sufficient</em>' attribute.
	 * @see #setSufficient(boolean)
	 * @see core.CorePackage#getActorFilter_Sufficient()
	 * @model
	 * @generated
	 */
	boolean isSufficient();

	/**
	 * Sets the value of the '{@link core.ActorFilter#isSufficient <em>Sufficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sufficient</em>' attribute.
	 * @see #isSufficient()
	 * @generated
	 */
	void setSufficient(boolean value);

} // ActorFilter
