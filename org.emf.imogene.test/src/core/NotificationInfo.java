/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Notification Information contains, for a given notification method, the reference to the field that will contain the value needed for notification (SMS number for instance, mail, ...). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link core.NotificationInfo#getDataField <em>Data Field</em>}</li>
 *   <li>{@link core.NotificationInfo#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see core.CorePackage#getNotificationInfo()
 * @model
 * @generated
 */
public interface NotificationInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Field</em>' reference.
	 * @see #setDataField(FieldEntity)
	 * @see core.CorePackage#getNotificationInfo_DataField()
	 * @model required="true"
	 *        extendedMetaData="name='dataField' namespace=''"
	 * @generated
	 */
	FieldEntity getDataField();

	/**
	 * Sets the value of the '{@link core.NotificationInfo#getDataField <em>Data Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Field</em>' reference.
	 * @see #getDataField()
	 * @generated
	 */
	void setDataField(FieldEntity value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link core.NotificationMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see core.NotificationMethod
	 * @see #setMethod(NotificationMethod)
	 * @see core.CorePackage#getNotificationInfo_Method()
	 * @model
	 * @generated
	 */
	NotificationMethod getMethod();

	/**
	 * Sets the value of the '{@link core.NotificationInfo#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see core.NotificationMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(NotificationMethod value);

} // NotificationInfo
