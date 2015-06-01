/**
 */
package core.impl;

import core.CorePackage;
import core.Description;
import core.FieldDependentVisibility;
import core.FieldEntity;
import core.FieldGroup;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link core.impl.FieldEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link core.impl.FieldEntityImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link core.impl.FieldEntityImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link core.impl.FieldEntityImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link core.impl.FieldEntityImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link core.impl.FieldEntityImpl#isHidden <em>Hidden</em>}</li>
 *   <li>{@link core.impl.FieldEntityImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link core.impl.FieldEntityImpl#getParentGroup <em>Parent Group</em>}</li>
 *   <li>{@link core.impl.FieldEntityImpl#getCalculationFunctionName <em>Calculation Function Name</em>}</li>
 *   <li>{@link core.impl.FieldEntityImpl#getFieldDependentVisibility <em>Field Dependent Visibility</em>}</li>
 *   <li>{@link core.impl.FieldEntityImpl#getRdfPredicate <em>Rdf Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FieldEntityImpl extends MinimalEObjectImpl.Container implements FieldEntity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Description> descriptions;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected boolean hidden = HIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalculationFunctionName() <em>Calculation Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationFunctionName()
	 * @generated
	 * @ordered
	 */
	protected static final String CALCULATION_FUNCTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalculationFunctionName() <em>Calculation Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationFunctionName()
	 * @generated
	 * @ordered
	 */
	protected String calculationFunctionName = CALCULATION_FUNCTION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFieldDependentVisibility() <em>Field Dependent Visibility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldDependentVisibility()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldDependentVisibility> fieldDependentVisibility;

	/**
	 * The default value of the '{@link #getRdfPredicate() <em>Rdf Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final String RDF_PREDICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRdfPredicate() <em>Rdf Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfPredicate()
	 * @generated
	 * @ordered
	 */
	protected String rdfPredicate = RDF_PREDICATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.FIELD_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FIELD_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FIELD_ENTITY__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Description> getDescriptions() {
		if (descriptions == null) {
			descriptions = new EObjectContainmentEList<Description>(Description.class, this, CorePackage.FIELD_ENTITY__DESCRIPTIONS);
		}
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FIELD_ENTITY__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FIELD_ENTITY__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden() {
		return hidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(boolean newHidden) {
		boolean oldHidden = hidden;
		hidden = newHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FIELD_ENTITY__HIDDEN, oldHidden, hidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FIELD_ENTITY__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldGroup getParentGroup() {
		if (eContainerFeatureID() != CorePackage.FIELD_ENTITY__PARENT_GROUP) return null;
		return (FieldGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentGroup(FieldGroup newParentGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentGroup, CorePackage.FIELD_ENTITY__PARENT_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentGroup(FieldGroup newParentGroup) {
		if (newParentGroup != eInternalContainer() || (eContainerFeatureID() != CorePackage.FIELD_ENTITY__PARENT_GROUP && newParentGroup != null)) {
			if (EcoreUtil.isAncestor(this, newParentGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentGroup != null)
				msgs = ((InternalEObject)newParentGroup).eInverseAdd(this, CorePackage.FIELD_GROUP__FIELDS, FieldGroup.class, msgs);
			msgs = basicSetParentGroup(newParentGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FIELD_ENTITY__PARENT_GROUP, newParentGroup, newParentGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCalculationFunctionName() {
		return calculationFunctionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationFunctionName(String newCalculationFunctionName) {
		String oldCalculationFunctionName = calculationFunctionName;
		calculationFunctionName = newCalculationFunctionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FIELD_ENTITY__CALCULATION_FUNCTION_NAME, oldCalculationFunctionName, calculationFunctionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldDependentVisibility> getFieldDependentVisibility() {
		if (fieldDependentVisibility == null) {
			fieldDependentVisibility = new EObjectContainmentWithInverseEList<FieldDependentVisibility>(FieldDependentVisibility.class, this, CorePackage.FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY, CorePackage.FIELD_DEPENDENT_VISIBILITY__PARENT_FIELD_ENTITY);
		}
		return fieldDependentVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRdfPredicate() {
		return rdfPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRdfPredicate(String newRdfPredicate) {
		String oldRdfPredicate = rdfPredicate;
		rdfPredicate = newRdfPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FIELD_ENTITY__RDF_PREDICATE, oldRdfPredicate, rdfPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void validate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FIELD_ENTITY__PARENT_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentGroup((FieldGroup)otherEnd, msgs);
			case CorePackage.FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFieldDependentVisibility()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FIELD_ENTITY__DESCRIPTIONS:
				return ((InternalEList<?>)getDescriptions()).basicRemove(otherEnd, msgs);
			case CorePackage.FIELD_ENTITY__PARENT_GROUP:
				return basicSetParentGroup(null, msgs);
			case CorePackage.FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY:
				return ((InternalEList<?>)getFieldDependentVisibility()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CorePackage.FIELD_ENTITY__PARENT_GROUP:
				return eInternalContainer().eInverseRemove(this, CorePackage.FIELD_GROUP__FIELDS, FieldGroup.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.FIELD_ENTITY__NAME:
				return getName();
			case CorePackage.FIELD_ENTITY__SHORT_NAME:
				return getShortName();
			case CorePackage.FIELD_ENTITY__DESCRIPTIONS:
				return getDescriptions();
			case CorePackage.FIELD_ENTITY__DEFAULT_VALUE:
				return getDefaultValue();
			case CorePackage.FIELD_ENTITY__REQUIRED:
				return isRequired();
			case CorePackage.FIELD_ENTITY__HIDDEN:
				return isHidden();
			case CorePackage.FIELD_ENTITY__READ_ONLY:
				return isReadOnly();
			case CorePackage.FIELD_ENTITY__PARENT_GROUP:
				return getParentGroup();
			case CorePackage.FIELD_ENTITY__CALCULATION_FUNCTION_NAME:
				return getCalculationFunctionName();
			case CorePackage.FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY:
				return getFieldDependentVisibility();
			case CorePackage.FIELD_ENTITY__RDF_PREDICATE:
				return getRdfPredicate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.FIELD_ENTITY__NAME:
				setName((String)newValue);
				return;
			case CorePackage.FIELD_ENTITY__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case CorePackage.FIELD_ENTITY__DESCRIPTIONS:
				getDescriptions().clear();
				getDescriptions().addAll((Collection<? extends Description>)newValue);
				return;
			case CorePackage.FIELD_ENTITY__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case CorePackage.FIELD_ENTITY__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CorePackage.FIELD_ENTITY__HIDDEN:
				setHidden((Boolean)newValue);
				return;
			case CorePackage.FIELD_ENTITY__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case CorePackage.FIELD_ENTITY__PARENT_GROUP:
				setParentGroup((FieldGroup)newValue);
				return;
			case CorePackage.FIELD_ENTITY__CALCULATION_FUNCTION_NAME:
				setCalculationFunctionName((String)newValue);
				return;
			case CorePackage.FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY:
				getFieldDependentVisibility().clear();
				getFieldDependentVisibility().addAll((Collection<? extends FieldDependentVisibility>)newValue);
				return;
			case CorePackage.FIELD_ENTITY__RDF_PREDICATE:
				setRdfPredicate((String)newValue);
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
			case CorePackage.FIELD_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.FIELD_ENTITY__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case CorePackage.FIELD_ENTITY__DESCRIPTIONS:
				getDescriptions().clear();
				return;
			case CorePackage.FIELD_ENTITY__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case CorePackage.FIELD_ENTITY__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case CorePackage.FIELD_ENTITY__HIDDEN:
				setHidden(HIDDEN_EDEFAULT);
				return;
			case CorePackage.FIELD_ENTITY__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case CorePackage.FIELD_ENTITY__PARENT_GROUP:
				setParentGroup((FieldGroup)null);
				return;
			case CorePackage.FIELD_ENTITY__CALCULATION_FUNCTION_NAME:
				setCalculationFunctionName(CALCULATION_FUNCTION_NAME_EDEFAULT);
				return;
			case CorePackage.FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY:
				getFieldDependentVisibility().clear();
				return;
			case CorePackage.FIELD_ENTITY__RDF_PREDICATE:
				setRdfPredicate(RDF_PREDICATE_EDEFAULT);
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
			case CorePackage.FIELD_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.FIELD_ENTITY__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case CorePackage.FIELD_ENTITY__DESCRIPTIONS:
				return descriptions != null && !descriptions.isEmpty();
			case CorePackage.FIELD_ENTITY__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case CorePackage.FIELD_ENTITY__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case CorePackage.FIELD_ENTITY__HIDDEN:
				return hidden != HIDDEN_EDEFAULT;
			case CorePackage.FIELD_ENTITY__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case CorePackage.FIELD_ENTITY__PARENT_GROUP:
				return getParentGroup() != null;
			case CorePackage.FIELD_ENTITY__CALCULATION_FUNCTION_NAME:
				return CALCULATION_FUNCTION_NAME_EDEFAULT == null ? calculationFunctionName != null : !CALCULATION_FUNCTION_NAME_EDEFAULT.equals(calculationFunctionName);
			case CorePackage.FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY:
				return fieldDependentVisibility != null && !fieldDependentVisibility.isEmpty();
			case CorePackage.FIELD_ENTITY__RDF_PREDICATE:
				return RDF_PREDICATE_EDEFAULT == null ? rdfPredicate != null : !RDF_PREDICATE_EDEFAULT.equals(rdfPredicate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.FIELD_ENTITY___VALIDATE:
				validate();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", required: ");
		result.append(required);
		result.append(", hidden: ");
		result.append(hidden);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", calculationFunctionName: ");
		result.append(calculationFunctionName);
		result.append(", rdfPredicate: ");
		result.append(rdfPredicate);
		result.append(')');
		return result.toString();
	}

} //FieldEntityImpl
