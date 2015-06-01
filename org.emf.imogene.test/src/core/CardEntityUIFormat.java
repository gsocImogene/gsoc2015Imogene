/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Entity UI Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Object to define how the card entity will be displayed in the applications user interfaces
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.CardEntityUIFormat#getEntity <em>Entity</em>}</li>
 *   <li>{@link core.CardEntityUIFormat#isWithTabulations <em>With Tabulations</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getCardEntityUIFormat()
 * @model
 * @generated
 */
public interface CardEntityUIFormat extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CardEntity that is concerned by the user interface formatting
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(CardEntity)
	 * @see core.CorePackage#getCardEntityUIFormat_Entity()
	 * @model
	 * @generated
	 */
	CardEntity getEntity();

	/**
	 * Sets the value of the '{@link core.CardEntityUIFormat#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(CardEntity value);

	/**
	 * Returns the value of the '<em><b>With Tabulations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concerns the Web and Desktop applications only
	 * If true, the CardEntity field groups will be displayed as tabulations. If false, they will be displayed as sections in one page
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>With Tabulations</em>' attribute.
	 * @see #setWithTabulations(boolean)
	 * @see core.CorePackage#getCardEntityUIFormat_WithTabulations()
	 * @model required="true"
	 * @generated
	 */
	boolean isWithTabulations();

	/**
	 * Sets the value of the '{@link core.CardEntityUIFormat#isWithTabulations <em>With Tabulations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Tabulations</em>' attribute.
	 * @see #isWithTabulations()
	 * @generated
	 */
	void setWithTabulations(boolean value);

} // CardEntityUIFormat
