/**
 */
package core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.EnumValue#getValue <em>Value</em>}</li>
 *   <li>{@link core.EnumValue#getName <em>Name</em>}</li>
 *   <li>{@link core.EnumValue#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getEnumValue()
 * @model
 * @generated
 */
public interface EnumValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see core.CorePackage#getEnumValue_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link core.EnumValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see core.CorePackage#getEnumValue_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link core.EnumValue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link core.Description}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see core.CorePackage#getEnumValue_Descriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Description> getDescriptions();

} // EnumValue
