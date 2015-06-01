/**
 */
package core.impl;

import core.CorePackage;
import core.FloatField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link core.impl.FloatFieldImpl#getDecimalNumber <em>Decimal Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FloatFieldImpl extends NumericFieldImpl implements FloatField {
	/**
	 * The default value of the '{@link #getDecimalNumber() <em>Decimal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int DECIMAL_NUMBER_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getDecimalNumber() <em>Decimal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalNumber()
	 * @generated
	 * @ordered
	 */
	protected int decimalNumber = DECIMAL_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.FLOAT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDecimalNumber() {
		return decimalNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalNumber(int newDecimalNumber) {
		int oldDecimalNumber = decimalNumber;
		decimalNumber = newDecimalNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FLOAT_FIELD__DECIMAL_NUMBER, oldDecimalNumber, decimalNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.FLOAT_FIELD__DECIMAL_NUMBER:
				return getDecimalNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.FLOAT_FIELD__DECIMAL_NUMBER:
				setDecimalNumber((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.FLOAT_FIELD__DECIMAL_NUMBER:
				setDecimalNumber(DECIMAL_NUMBER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.FLOAT_FIELD__DECIMAL_NUMBER:
				return decimalNumber != DECIMAL_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (DecimalNumber: ");
		result.append(decimalNumber);
		result.append(')');
		return result.toString();
	}

} //FloatFieldImpl
