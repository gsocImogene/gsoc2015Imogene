/**
 */
package core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.i-mogene.org/imogene/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "imogene";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link core.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.ProjectImpl
	 * @see core.impl.CorePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ENTITIES = 2;

	/**
	 * The feature id for the '<em><b>Entity UI Formats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ENTITY_UI_FORMATS = 3;

	/**
	 * The feature id for the '<em><b>Themas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__THEMAS = 4;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LANGUAGES = 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.CardEntityImpl <em>Card Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.CardEntityImpl
	 * @see core.impl.CorePackageImpl#getCardEntity()
	 * @generated
	 */
	int CARD_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__SHORT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__DESCRIPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Column Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__COLUMN_FIELDS = 3;

	/**
	 * The feature id for the '<em><b>Main Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__MAIN_FIELDS = 4;

	/**
	 * The feature id for the '<em><b>Secondary Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__SECONDARY_FIELDS = 5;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__ICON = 6;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__TOP_LEVEL = 7;

	/**
	 * The feature id for the '<em><b>Client Filter Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__CLIENT_FILTER_FIELDS = 8;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__GROUPS = 9;

	/**
	 * The feature id for the '<em><b>Sort Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__SORT_FIELDS = 10;

	/**
	 * The feature id for the '<em><b>Actor Filter Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__ACTOR_FILTER_FIELDS = 11;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__COLOR = 12;

	/**
	 * The feature id for the '<em><b>Client Period Filterable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__CLIENT_PERIOD_FILTERABLE = 13;

	/**
	 * The feature id for the '<em><b>Georeferenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__GEOREFERENCED = 14;

	/**
	 * The feature id for the '<em><b>Rdf Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__RDF_SUBJECT = 15;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__RDF_PREDICATE = 16;

	/**
	 * The feature id for the '<em><b>Nested Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__NESTED_FIELDS = 17;

	/**
	 * The feature id for the '<em><b>Has Dynamic Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY__HAS_DYNAMIC_FIELDS = 18;

	/**
	 * The number of structural features of the '<em>Card Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Card Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.FieldGroupImpl <em>Field Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.FieldGroupImpl
	 * @see core.impl.CorePackageImpl#getFieldGroup()
	 * @generated
	 */
	int FIELD_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GROUP__DESCRIPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GROUP__FIELDS = 1;

	/**
	 * The feature id for the '<em><b>Parent Card</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GROUP__PARENT_CARD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GROUP__NAME = 3;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GROUP__SHORT_NAME = 4;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GROUP__ICON = 5;

	/**
	 * The number of structural features of the '<em>Field Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GROUP_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Contains Only Hidden Fields</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GROUP___CONTAINS_ONLY_HIDDEN_FIELDS = 0;

	/**
	 * The number of operations of the '<em>Field Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_GROUP_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link core.impl.FieldEntityImpl <em>Field Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.FieldEntityImpl
	 * @see core.impl.CorePackageImpl#getFieldEntity()
	 * @generated
	 */
	int FIELD_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY__SHORT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY__DESCRIPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY__DEFAULT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY__REQUIRED = 4;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY__HIDDEN = 5;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY__READ_ONLY = 6;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY__PARENT_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY__CALCULATION_FUNCTION_NAME = 8;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY = 9;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY__RDF_PREDICATE = 10;

	/**
	 * The number of structural features of the '<em>Field Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY___VALIDATE = 0;

	/**
	 * The number of operations of the '<em>Field Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ENTITY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link core.impl.BooleanFieldImpl <em>Boolean Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.BooleanFieldImpl
	 * @see core.impl.CorePackageImpl#getBooleanField()
	 * @generated
	 */
	int BOOLEAN_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__NAME = FIELD_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__SHORT_NAME = FIELD_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__DESCRIPTIONS = FIELD_ENTITY__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__DEFAULT_VALUE = FIELD_ENTITY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__REQUIRED = FIELD_ENTITY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__HIDDEN = FIELD_ENTITY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__READ_ONLY = FIELD_ENTITY__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__PARENT_GROUP = FIELD_ENTITY__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__CALCULATION_FUNCTION_NAME = FIELD_ENTITY__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__FIELD_DEPENDENT_VISIBILITY = FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__RDF_PREDICATE = FIELD_ENTITY__RDF_PREDICATE;

	/**
	 * The number of structural features of the '<em>Boolean Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD_FEATURE_COUNT = FIELD_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD___VALIDATE = FIELD_ENTITY___VALIDATE;

	/**
	 * The number of operations of the '<em>Boolean Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD_OPERATION_COUNT = FIELD_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.NumericFieldImpl <em>Numeric Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.NumericFieldImpl
	 * @see core.impl.CorePackageImpl#getNumericField()
	 * @generated
	 */
	int NUMERIC_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__NAME = FIELD_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__SHORT_NAME = FIELD_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__DESCRIPTIONS = FIELD_ENTITY__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__DEFAULT_VALUE = FIELD_ENTITY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__REQUIRED = FIELD_ENTITY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__HIDDEN = FIELD_ENTITY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__READ_ONLY = FIELD_ENTITY__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__PARENT_GROUP = FIELD_ENTITY__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__CALCULATION_FUNCTION_NAME = FIELD_ENTITY__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__FIELD_DEPENDENT_VISIBILITY = FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__RDF_PREDICATE = FIELD_ENTITY__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__MIN = FIELD_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__MAX = FIELD_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__UNIT = FIELD_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Numeric Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD_FEATURE_COUNT = FIELD_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD___VALIDATE = FIELD_ENTITY___VALIDATE;

	/**
	 * The number of operations of the '<em>Numeric Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD_OPERATION_COUNT = FIELD_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.IntegerFieldImpl <em>Integer Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.IntegerFieldImpl
	 * @see core.impl.CorePackageImpl#getIntegerField()
	 * @generated
	 */
	int INTEGER_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__NAME = NUMERIC_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__SHORT_NAME = NUMERIC_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__DESCRIPTIONS = NUMERIC_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__DEFAULT_VALUE = NUMERIC_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__REQUIRED = NUMERIC_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__HIDDEN = NUMERIC_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__READ_ONLY = NUMERIC_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__PARENT_GROUP = NUMERIC_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__CALCULATION_FUNCTION_NAME = NUMERIC_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__FIELD_DEPENDENT_VISIBILITY = NUMERIC_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__RDF_PREDICATE = NUMERIC_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__MIN = NUMERIC_FIELD__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__MAX = NUMERIC_FIELD__MAX;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__UNIT = NUMERIC_FIELD__UNIT;

	/**
	 * The number of structural features of the '<em>Integer Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD_FEATURE_COUNT = NUMERIC_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD___VALIDATE = NUMERIC_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Integer Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD_OPERATION_COUNT = NUMERIC_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.FloatFieldImpl <em>Float Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.FloatFieldImpl
	 * @see core.impl.CorePackageImpl#getFloatField()
	 * @generated
	 */
	int FLOAT_FIELD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__NAME = NUMERIC_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__SHORT_NAME = NUMERIC_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__DESCRIPTIONS = NUMERIC_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__DEFAULT_VALUE = NUMERIC_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__REQUIRED = NUMERIC_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__HIDDEN = NUMERIC_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__READ_ONLY = NUMERIC_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__PARENT_GROUP = NUMERIC_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__CALCULATION_FUNCTION_NAME = NUMERIC_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__FIELD_DEPENDENT_VISIBILITY = NUMERIC_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__RDF_PREDICATE = NUMERIC_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__MIN = NUMERIC_FIELD__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__MAX = NUMERIC_FIELD__MAX;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__UNIT = NUMERIC_FIELD__UNIT;

	/**
	 * The feature id for the '<em><b>Decimal Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD__DECIMAL_NUMBER = NUMERIC_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD_FEATURE_COUNT = NUMERIC_FIELD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD___VALIDATE = NUMERIC_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Float Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FIELD_OPERATION_COUNT = NUMERIC_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.StringFieldImpl <em>String Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.StringFieldImpl
	 * @see core.impl.CorePackageImpl#getStringField()
	 * @generated
	 */
	int STRING_FIELD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__NAME = FIELD_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__SHORT_NAME = FIELD_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__DESCRIPTIONS = FIELD_ENTITY__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__DEFAULT_VALUE = FIELD_ENTITY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__REQUIRED = FIELD_ENTITY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__HIDDEN = FIELD_ENTITY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__READ_ONLY = FIELD_ENTITY__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__PARENT_GROUP = FIELD_ENTITY__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__CALCULATION_FUNCTION_NAME = FIELD_ENTITY__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__FIELD_DEPENDENT_VISIBILITY = FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__RDF_PREDICATE = FIELD_ENTITY__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__VALIDATION_RULES = FIELD_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD_FEATURE_COUNT = FIELD_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD___VALIDATE = FIELD_ENTITY___VALIDATE;

	/**
	 * The number of operations of the '<em>String Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD_OPERATION_COUNT = FIELD_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.ValidationRuleImpl
	 * @see core.impl.CorePackageImpl#getValidationRule()
	 * @generated
	 */
	int VALIDATION_RULE = 9;

	/**
	 * The feature id for the '<em><b>Validation Regular Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__VALIDATION_REGULAR_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__DESCRIPTIONS = 1;

	/**
	 * The number of structural features of the '<em>Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.TextFieldImpl
	 * @see core.impl.CorePackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__NAME = STRING_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__SHORT_NAME = STRING_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__DESCRIPTIONS = STRING_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__DEFAULT_VALUE = STRING_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__REQUIRED = STRING_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__HIDDEN = STRING_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__READ_ONLY = STRING_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__PARENT_GROUP = STRING_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__CALCULATION_FUNCTION_NAME = STRING_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__FIELD_DEPENDENT_VISIBILITY = STRING_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__RDF_PREDICATE = STRING_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__VALIDATION_RULES = STRING_FIELD__VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Translatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__TRANSLATABLE = STRING_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = STRING_FIELD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD___VALIDATE = STRING_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_OPERATION_COUNT = STRING_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.TextAreaFieldImpl <em>Text Area Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.TextAreaFieldImpl
	 * @see core.impl.CorePackageImpl#getTextAreaField()
	 * @generated
	 */
	int TEXT_AREA_FIELD = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD__NAME = TEXT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD__SHORT_NAME = TEXT_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD__DESCRIPTIONS = TEXT_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD__DEFAULT_VALUE = TEXT_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD__REQUIRED = TEXT_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD__HIDDEN = TEXT_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD__READ_ONLY = TEXT_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD__PARENT_GROUP = TEXT_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD__CALCULATION_FUNCTION_NAME = TEXT_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD__FIELD_DEPENDENT_VISIBILITY = TEXT_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD__RDF_PREDICATE = TEXT_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD__VALIDATION_RULES = TEXT_FIELD__VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Translatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD__TRANSLATABLE = TEXT_FIELD__TRANSLATABLE;

	/**
	 * The number of structural features of the '<em>Text Area Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD_FEATURE_COUNT = TEXT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD___VALIDATE = TEXT_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Text Area Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FIELD_OPERATION_COUNT = TEXT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.AddressFieldImpl <em>Address Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.AddressFieldImpl
	 * @see core.impl.CorePackageImpl#getAddressField()
	 * @generated
	 */
	int ADDRESS_FIELD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD__NAME = TEXT_AREA_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD__SHORT_NAME = TEXT_AREA_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD__DESCRIPTIONS = TEXT_AREA_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD__DEFAULT_VALUE = TEXT_AREA_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD__REQUIRED = TEXT_AREA_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD__HIDDEN = TEXT_AREA_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD__READ_ONLY = TEXT_AREA_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD__PARENT_GROUP = TEXT_AREA_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD__CALCULATION_FUNCTION_NAME = TEXT_AREA_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD__FIELD_DEPENDENT_VISIBILITY = TEXT_AREA_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD__RDF_PREDICATE = TEXT_AREA_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD__VALIDATION_RULES = TEXT_AREA_FIELD__VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Translatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD__TRANSLATABLE = TEXT_AREA_FIELD__TRANSLATABLE;

	/**
	 * The number of structural features of the '<em>Address Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD_FEATURE_COUNT = TEXT_AREA_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD___VALIDATE = TEXT_AREA_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Address Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FIELD_OPERATION_COUNT = TEXT_AREA_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.EmailFieldImpl <em>Email Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.EmailFieldImpl
	 * @see core.impl.CorePackageImpl#getEmailField()
	 * @generated
	 */
	int EMAIL_FIELD = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__NAME = TEXT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__SHORT_NAME = TEXT_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__DESCRIPTIONS = TEXT_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__DEFAULT_VALUE = TEXT_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__REQUIRED = TEXT_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__HIDDEN = TEXT_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__READ_ONLY = TEXT_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__PARENT_GROUP = TEXT_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__CALCULATION_FUNCTION_NAME = TEXT_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__FIELD_DEPENDENT_VISIBILITY = TEXT_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__RDF_PREDICATE = TEXT_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__VALIDATION_RULES = TEXT_FIELD__VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Translatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD__TRANSLATABLE = TEXT_FIELD__TRANSLATABLE;

	/**
	 * The number of structural features of the '<em>Email Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD_FEATURE_COUNT = TEXT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD___VALIDATE = TEXT_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Email Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FIELD_OPERATION_COUNT = TEXT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.GeoFieldImpl <em>Geo Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.GeoFieldImpl
	 * @see core.impl.CorePackageImpl#getGeoField()
	 * @generated
	 */
	int GEO_FIELD = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD__NAME = STRING_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD__SHORT_NAME = STRING_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD__DESCRIPTIONS = STRING_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD__DEFAULT_VALUE = STRING_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD__REQUIRED = STRING_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD__HIDDEN = STRING_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD__READ_ONLY = STRING_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD__PARENT_GROUP = STRING_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD__CALCULATION_FUNCTION_NAME = STRING_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD__FIELD_DEPENDENT_VISIBILITY = STRING_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD__RDF_PREDICATE = STRING_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD__VALIDATION_RULES = STRING_FIELD__VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD__TYPE = STRING_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geo Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD_FEATURE_COUNT = STRING_FIELD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD___VALIDATE = STRING_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Geo Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FIELD_OPERATION_COUNT = STRING_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.BarcodeFieldImpl <em>Barcode Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.BarcodeFieldImpl
	 * @see core.impl.CorePackageImpl#getBarcodeField()
	 * @generated
	 */
	int BARCODE_FIELD = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD__NAME = STRING_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD__SHORT_NAME = STRING_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD__DESCRIPTIONS = STRING_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD__DEFAULT_VALUE = STRING_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD__REQUIRED = STRING_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD__HIDDEN = STRING_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD__READ_ONLY = STRING_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD__PARENT_GROUP = STRING_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD__CALCULATION_FUNCTION_NAME = STRING_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD__FIELD_DEPENDENT_VISIBILITY = STRING_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD__RDF_PREDICATE = STRING_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD__VALIDATION_RULES = STRING_FIELD__VALIDATION_RULES;

	/**
	 * The number of structural features of the '<em>Barcode Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD_FEATURE_COUNT = STRING_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD___VALIDATE = STRING_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Barcode Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_FIELD_OPERATION_COUNT = STRING_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.PhoneFieldImpl <em>Phone Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.PhoneFieldImpl
	 * @see core.impl.CorePackageImpl#getPhoneField()
	 * @generated
	 */
	int PHONE_FIELD = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__NAME = TEXT_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__SHORT_NAME = TEXT_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__DESCRIPTIONS = TEXT_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__DEFAULT_VALUE = TEXT_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__REQUIRED = TEXT_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__HIDDEN = TEXT_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__READ_ONLY = TEXT_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__PARENT_GROUP = TEXT_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__CALCULATION_FUNCTION_NAME = TEXT_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__FIELD_DEPENDENT_VISIBILITY = TEXT_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__RDF_PREDICATE = TEXT_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__VALIDATION_RULES = TEXT_FIELD__VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Translatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__TRANSLATABLE = TEXT_FIELD__TRANSLATABLE;

	/**
	 * The feature id for the '<em><b>Phone Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD__PHONE_TYPE = TEXT_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Phone Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD_FEATURE_COUNT = TEXT_FIELD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD___VALIDATE = TEXT_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Phone Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FIELD_OPERATION_COUNT = TEXT_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.BinaryFieldImpl <em>Binary Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.BinaryFieldImpl
	 * @see core.impl.CorePackageImpl#getBinaryField()
	 * @generated
	 */
	int BINARY_FIELD = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__NAME = FIELD_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__SHORT_NAME = FIELD_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__DESCRIPTIONS = FIELD_ENTITY__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__DEFAULT_VALUE = FIELD_ENTITY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__REQUIRED = FIELD_ENTITY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__HIDDEN = FIELD_ENTITY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__READ_ONLY = FIELD_ENTITY__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__PARENT_GROUP = FIELD_ENTITY__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__CALCULATION_FUNCTION_NAME = FIELD_ENTITY__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__FIELD_DEPENDENT_VISIBILITY = FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__RDF_PREDICATE = FIELD_ENTITY__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD__CATEGORY = FIELD_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD_FEATURE_COUNT = FIELD_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD___VALIDATE = FIELD_ENTITY___VALIDATE;

	/**
	 * The number of operations of the '<em>Binary Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FIELD_OPERATION_COUNT = FIELD_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.MediaFileFieldImpl <em>Media File Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.MediaFileFieldImpl
	 * @see core.impl.CorePackageImpl#getMediaFileField()
	 * @generated
	 */
	int MEDIA_FILE_FIELD = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD__NAME = BINARY_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD__SHORT_NAME = BINARY_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD__DESCRIPTIONS = BINARY_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD__DEFAULT_VALUE = BINARY_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD__REQUIRED = BINARY_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD__HIDDEN = BINARY_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD__READ_ONLY = BINARY_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD__PARENT_GROUP = BINARY_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD__CALCULATION_FUNCTION_NAME = BINARY_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD__FIELD_DEPENDENT_VISIBILITY = BINARY_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD__RDF_PREDICATE = BINARY_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD__CATEGORY = BINARY_FIELD__CATEGORY;

	/**
	 * The number of structural features of the '<em>Media File Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD_FEATURE_COUNT = BINARY_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD___VALIDATE = BINARY_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Media File Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FILE_FIELD_OPERATION_COUNT = BINARY_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.RelationFieldEntityImpl <em>Relation Field Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.RelationFieldEntityImpl
	 * @see core.impl.CorePackageImpl#getRelationFieldEntity()
	 * @generated
	 */
	int RELATION_FIELD_ENTITY = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__NAME = FIELD_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__SHORT_NAME = FIELD_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__DESCRIPTIONS = FIELD_ENTITY__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__DEFAULT_VALUE = FIELD_ENTITY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__REQUIRED = FIELD_ENTITY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__HIDDEN = FIELD_ENTITY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__READ_ONLY = FIELD_ENTITY__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__PARENT_GROUP = FIELD_ENTITY__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__CALCULATION_FUNCTION_NAME = FIELD_ENTITY__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY = FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__RDF_PREDICATE = FIELD_ENTITY__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__ENTITY = FIELD_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__CARDINALITY = FIELD_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__TYPE = FIELD_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Common Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__COMMON_FIELDS = FIELD_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Opposite Relation Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__OPPOSITE_RELATION_FIELD = FIELD_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Relation Hierarchical Filter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__RELATION_HIERARCHICAL_FILTER = FIELD_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nested Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY__NESTED_FORM = FIELD_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Relation Field Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY_FEATURE_COUNT = FIELD_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY___VALIDATE = FIELD_ENTITY___VALIDATE;

	/**
	 * The number of operations of the '<em>Relation Field Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FIELD_ENTITY_OPERATION_COUNT = FIELD_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.MainRelationFieldEntityImpl <em>Main Relation Field Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.MainRelationFieldEntityImpl
	 * @see core.impl.CorePackageImpl#getMainRelationFieldEntity()
	 * @generated
	 */
	int MAIN_RELATION_FIELD_ENTITY = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__NAME = RELATION_FIELD_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__SHORT_NAME = RELATION_FIELD_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__DESCRIPTIONS = RELATION_FIELD_ENTITY__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__DEFAULT_VALUE = RELATION_FIELD_ENTITY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__REQUIRED = RELATION_FIELD_ENTITY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__HIDDEN = RELATION_FIELD_ENTITY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__READ_ONLY = RELATION_FIELD_ENTITY__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__PARENT_GROUP = RELATION_FIELD_ENTITY__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__CALCULATION_FUNCTION_NAME = RELATION_FIELD_ENTITY__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY = RELATION_FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__RDF_PREDICATE = RELATION_FIELD_ENTITY__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__ENTITY = RELATION_FIELD_ENTITY__ENTITY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__CARDINALITY = RELATION_FIELD_ENTITY__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__TYPE = RELATION_FIELD_ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Common Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__COMMON_FIELDS = RELATION_FIELD_ENTITY__COMMON_FIELDS;

	/**
	 * The feature id for the '<em><b>Opposite Relation Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__OPPOSITE_RELATION_FIELD = RELATION_FIELD_ENTITY__OPPOSITE_RELATION_FIELD;

	/**
	 * The feature id for the '<em><b>Relation Hierarchical Filter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__RELATION_HIERARCHICAL_FILTER = RELATION_FIELD_ENTITY__RELATION_HIERARCHICAL_FILTER;

	/**
	 * The feature id for the '<em><b>Nested Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__NESTED_FORM = RELATION_FIELD_ENTITY__NESTED_FORM;

	/**
	 * The feature id for the '<em><b>Inverse Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY__INVERSE_CARDINALITY = RELATION_FIELD_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Main Relation Field Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY_FEATURE_COUNT = RELATION_FIELD_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY___VALIDATE = RELATION_FIELD_ENTITY___VALIDATE;

	/**
	 * The number of operations of the '<em>Main Relation Field Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_RELATION_FIELD_ENTITY_OPERATION_COUNT = RELATION_FIELD_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.ReverseRelationFieldEntityImpl <em>Reverse Relation Field Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.ReverseRelationFieldEntityImpl
	 * @see core.impl.CorePackageImpl#getReverseRelationFieldEntity()
	 * @generated
	 */
	int REVERSE_RELATION_FIELD_ENTITY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__NAME = RELATION_FIELD_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__SHORT_NAME = RELATION_FIELD_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__DESCRIPTIONS = RELATION_FIELD_ENTITY__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__DEFAULT_VALUE = RELATION_FIELD_ENTITY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__REQUIRED = RELATION_FIELD_ENTITY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__HIDDEN = RELATION_FIELD_ENTITY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__READ_ONLY = RELATION_FIELD_ENTITY__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__PARENT_GROUP = RELATION_FIELD_ENTITY__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__CALCULATION_FUNCTION_NAME = RELATION_FIELD_ENTITY__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY = RELATION_FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__RDF_PREDICATE = RELATION_FIELD_ENTITY__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__ENTITY = RELATION_FIELD_ENTITY__ENTITY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__CARDINALITY = RELATION_FIELD_ENTITY__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__TYPE = RELATION_FIELD_ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Common Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__COMMON_FIELDS = RELATION_FIELD_ENTITY__COMMON_FIELDS;

	/**
	 * The feature id for the '<em><b>Opposite Relation Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__OPPOSITE_RELATION_FIELD = RELATION_FIELD_ENTITY__OPPOSITE_RELATION_FIELD;

	/**
	 * The feature id for the '<em><b>Relation Hierarchical Filter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__RELATION_HIERARCHICAL_FILTER = RELATION_FIELD_ENTITY__RELATION_HIERARCHICAL_FILTER;

	/**
	 * The feature id for the '<em><b>Nested Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY__NESTED_FORM = RELATION_FIELD_ENTITY__NESTED_FORM;

	/**
	 * The number of structural features of the '<em>Reverse Relation Field Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY_FEATURE_COUNT = RELATION_FIELD_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY___VALIDATE = RELATION_FIELD_ENTITY___VALIDATE;

	/**
	 * The number of operations of the '<em>Reverse Relation Field Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_RELATION_FIELD_ENTITY_OPERATION_COUNT = RELATION_FIELD_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.EnumFieldImpl <em>Enum Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.EnumFieldImpl
	 * @see core.impl.CorePackageImpl#getEnumField()
	 * @generated
	 */
	int ENUM_FIELD = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__NAME = FIELD_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__SHORT_NAME = FIELD_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__DESCRIPTIONS = FIELD_ENTITY__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__DEFAULT_VALUE = FIELD_ENTITY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__REQUIRED = FIELD_ENTITY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__HIDDEN = FIELD_ENTITY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__READ_ONLY = FIELD_ENTITY__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__PARENT_GROUP = FIELD_ENTITY__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__CALCULATION_FUNCTION_NAME = FIELD_ENTITY__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__FIELD_DEPENDENT_VISIBILITY = FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__RDF_PREDICATE = FIELD_ENTITY__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Enum Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__ENUM_VALUES = FIELD_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiple Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__MULTIPLE_SELECTION = FIELD_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD_FEATURE_COUNT = FIELD_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD___VALIDATE = FIELD_ENTITY___VALIDATE;

	/**
	 * The number of operations of the '<em>Enum Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD_OPERATION_COUNT = FIELD_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.EnumValueImpl
	 * @see core.impl.CorePackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__DESCRIPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.VideoFieldImpl <em>Video Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.VideoFieldImpl
	 * @see core.impl.CorePackageImpl#getVideoField()
	 * @generated
	 */
	int VIDEO_FIELD = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD__NAME = MEDIA_FILE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD__SHORT_NAME = MEDIA_FILE_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD__DESCRIPTIONS = MEDIA_FILE_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD__DEFAULT_VALUE = MEDIA_FILE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD__REQUIRED = MEDIA_FILE_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD__HIDDEN = MEDIA_FILE_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD__READ_ONLY = MEDIA_FILE_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD__PARENT_GROUP = MEDIA_FILE_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD__CALCULATION_FUNCTION_NAME = MEDIA_FILE_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD__FIELD_DEPENDENT_VISIBILITY = MEDIA_FILE_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD__RDF_PREDICATE = MEDIA_FILE_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD__CATEGORY = MEDIA_FILE_FIELD__CATEGORY;

	/**
	 * The number of structural features of the '<em>Video Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD_FEATURE_COUNT = MEDIA_FILE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD___VALIDATE = MEDIA_FILE_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Video Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FIELD_OPERATION_COUNT = MEDIA_FILE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.PhotoFieldImpl <em>Photo Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.PhotoFieldImpl
	 * @see core.impl.CorePackageImpl#getPhotoField()
	 * @generated
	 */
	int PHOTO_FIELD = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD__NAME = MEDIA_FILE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD__SHORT_NAME = MEDIA_FILE_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD__DESCRIPTIONS = MEDIA_FILE_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD__DEFAULT_VALUE = MEDIA_FILE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD__REQUIRED = MEDIA_FILE_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD__HIDDEN = MEDIA_FILE_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD__READ_ONLY = MEDIA_FILE_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD__PARENT_GROUP = MEDIA_FILE_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD__CALCULATION_FUNCTION_NAME = MEDIA_FILE_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD__FIELD_DEPENDENT_VISIBILITY = MEDIA_FILE_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD__RDF_PREDICATE = MEDIA_FILE_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD__CATEGORY = MEDIA_FILE_FIELD__CATEGORY;

	/**
	 * The number of structural features of the '<em>Photo Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD_FEATURE_COUNT = MEDIA_FILE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD___VALIDATE = MEDIA_FILE_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Photo Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FIELD_OPERATION_COUNT = MEDIA_FILE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.SoundFieldImpl <em>Sound Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.SoundFieldImpl
	 * @see core.impl.CorePackageImpl#getSoundField()
	 * @generated
	 */
	int SOUND_FIELD = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD__NAME = MEDIA_FILE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD__SHORT_NAME = MEDIA_FILE_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD__DESCRIPTIONS = MEDIA_FILE_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD__DEFAULT_VALUE = MEDIA_FILE_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD__REQUIRED = MEDIA_FILE_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD__HIDDEN = MEDIA_FILE_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD__READ_ONLY = MEDIA_FILE_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD__PARENT_GROUP = MEDIA_FILE_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD__CALCULATION_FUNCTION_NAME = MEDIA_FILE_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD__FIELD_DEPENDENT_VISIBILITY = MEDIA_FILE_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD__RDF_PREDICATE = MEDIA_FILE_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD__CATEGORY = MEDIA_FILE_FIELD__CATEGORY;

	/**
	 * The number of structural features of the '<em>Sound Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD_FEATURE_COUNT = MEDIA_FILE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD___VALIDATE = MEDIA_FILE_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Sound Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUND_FIELD_OPERATION_COUNT = MEDIA_FILE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.DatesFieldImpl <em>Dates Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.DatesFieldImpl
	 * @see core.impl.CorePackageImpl#getDatesField()
	 * @generated
	 */
	int DATES_FIELD = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD__NAME = FIELD_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD__SHORT_NAME = FIELD_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD__DESCRIPTIONS = FIELD_ENTITY__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD__DEFAULT_VALUE = FIELD_ENTITY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD__REQUIRED = FIELD_ENTITY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD__HIDDEN = FIELD_ENTITY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD__READ_ONLY = FIELD_ENTITY__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD__PARENT_GROUP = FIELD_ENTITY__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD__CALCULATION_FUNCTION_NAME = FIELD_ENTITY__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD__FIELD_DEPENDENT_VISIBILITY = FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD__RDF_PREDICATE = FIELD_ENTITY__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD__MIN = FIELD_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD__MAX = FIELD_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dates Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD_FEATURE_COUNT = FIELD_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD___VALIDATE = FIELD_ENTITY___VALIDATE;

	/**
	 * The number of operations of the '<em>Dates Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FIELD_OPERATION_COUNT = FIELD_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.DateFieldImpl <em>Date Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.DateFieldImpl
	 * @see core.impl.CorePackageImpl#getDateField()
	 * @generated
	 */
	int DATE_FIELD = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__NAME = DATES_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__SHORT_NAME = DATES_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DESCRIPTIONS = DATES_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DEFAULT_VALUE = DATES_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__REQUIRED = DATES_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__HIDDEN = DATES_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__READ_ONLY = DATES_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__PARENT_GROUP = DATES_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__CALCULATION_FUNCTION_NAME = DATES_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__FIELD_DEPENDENT_VISIBILITY = DATES_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__RDF_PREDICATE = DATES_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__MIN = DATES_FIELD__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__MAX = DATES_FIELD__MAX;

	/**
	 * The number of structural features of the '<em>Date Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD_FEATURE_COUNT = DATES_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD___VALIDATE = DATES_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Date Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD_OPERATION_COUNT = DATES_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.DateTimeFieldImpl <em>Date Time Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.DateTimeFieldImpl
	 * @see core.impl.CorePackageImpl#getDateTimeField()
	 * @generated
	 */
	int DATE_TIME_FIELD = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD__NAME = DATES_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD__SHORT_NAME = DATES_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD__DESCRIPTIONS = DATES_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD__DEFAULT_VALUE = DATES_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD__REQUIRED = DATES_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD__HIDDEN = DATES_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD__READ_ONLY = DATES_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD__PARENT_GROUP = DATES_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD__CALCULATION_FUNCTION_NAME = DATES_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD__FIELD_DEPENDENT_VISIBILITY = DATES_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD__RDF_PREDICATE = DATES_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD__MIN = DATES_FIELD__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD__MAX = DATES_FIELD__MAX;

	/**
	 * The number of structural features of the '<em>Date Time Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD_FEATURE_COUNT = DATES_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD___VALIDATE = DATES_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Date Time Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FIELD_OPERATION_COUNT = DATES_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.TimeFieldImpl <em>Time Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.TimeFieldImpl
	 * @see core.impl.CorePackageImpl#getTimeField()
	 * @generated
	 */
	int TIME_FIELD = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD__NAME = DATES_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD__SHORT_NAME = DATES_FIELD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD__DESCRIPTIONS = DATES_FIELD__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD__DEFAULT_VALUE = DATES_FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD__REQUIRED = DATES_FIELD__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD__HIDDEN = DATES_FIELD__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD__READ_ONLY = DATES_FIELD__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD__PARENT_GROUP = DATES_FIELD__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD__CALCULATION_FUNCTION_NAME = DATES_FIELD__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD__FIELD_DEPENDENT_VISIBILITY = DATES_FIELD__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD__RDF_PREDICATE = DATES_FIELD__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD__MIN = DATES_FIELD__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD__MAX = DATES_FIELD__MAX;

	/**
	 * The number of structural features of the '<em>Time Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD_FEATURE_COUNT = DATES_FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD___VALIDATE = DATES_FIELD___VALIDATE;

	/**
	 * The number of operations of the '<em>Time Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FIELD_OPERATION_COUNT = DATES_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.ActorImpl
	 * @see core.impl.CorePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = CARD_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SHORT_NAME = CARD_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTIONS = CARD_ENTITY__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Column Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__COLUMN_FIELDS = CARD_ENTITY__COLUMN_FIELDS;

	/**
	 * The feature id for the '<em><b>Main Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__MAIN_FIELDS = CARD_ENTITY__MAIN_FIELDS;

	/**
	 * The feature id for the '<em><b>Secondary Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SECONDARY_FIELDS = CARD_ENTITY__SECONDARY_FIELDS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ICON = CARD_ENTITY__ICON;

	/**
	 * The feature id for the '<em><b>Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TOP_LEVEL = CARD_ENTITY__TOP_LEVEL;

	/**
	 * The feature id for the '<em><b>Client Filter Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CLIENT_FILTER_FIELDS = CARD_ENTITY__CLIENT_FILTER_FIELDS;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__GROUPS = CARD_ENTITY__GROUPS;

	/**
	 * The feature id for the '<em><b>Sort Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SORT_FIELDS = CARD_ENTITY__SORT_FIELDS;

	/**
	 * The feature id for the '<em><b>Actor Filter Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTOR_FILTER_FIELDS = CARD_ENTITY__ACTOR_FILTER_FIELDS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__COLOR = CARD_ENTITY__COLOR;

	/**
	 * The feature id for the '<em><b>Client Period Filterable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CLIENT_PERIOD_FILTERABLE = CARD_ENTITY__CLIENT_PERIOD_FILTERABLE;

	/**
	 * The feature id for the '<em><b>Georeferenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__GEOREFERENCED = CARD_ENTITY__GEOREFERENCED;

	/**
	 * The feature id for the '<em><b>Rdf Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__RDF_SUBJECT = CARD_ENTITY__RDF_SUBJECT;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__RDF_PREDICATE = CARD_ENTITY__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Nested Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NESTED_FIELDS = CARD_ENTITY__NESTED_FIELDS;

	/**
	 * The feature id for the '<em><b>Has Dynamic Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HAS_DYNAMIC_FIELDS = CARD_ENTITY__HAS_DYNAMIC_FIELDS;

	/**
	 * The feature id for the '<em><b>Notification Infos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NOTIFICATION_INFOS = CARD_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Admin Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ADMIN_FIELDS = CARD_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__FILTERS = CARD_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = CARD_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = CARD_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.FilterFieldImpl <em>Filter Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.FilterFieldImpl
	 * @see core.impl.CorePackageImpl#getFilterField()
	 * @generated
	 */
	int FILTER_FIELD = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__NAME = RELATION_FIELD_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__SHORT_NAME = RELATION_FIELD_ENTITY__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__DESCRIPTIONS = RELATION_FIELD_ENTITY__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__DEFAULT_VALUE = RELATION_FIELD_ENTITY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__REQUIRED = RELATION_FIELD_ENTITY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__HIDDEN = RELATION_FIELD_ENTITY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__READ_ONLY = RELATION_FIELD_ENTITY__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Parent Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__PARENT_GROUP = RELATION_FIELD_ENTITY__PARENT_GROUP;

	/**
	 * The feature id for the '<em><b>Calculation Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__CALCULATION_FUNCTION_NAME = RELATION_FIELD_ENTITY__CALCULATION_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>Field Dependent Visibility</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__FIELD_DEPENDENT_VISIBILITY = RELATION_FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY;

	/**
	 * The feature id for the '<em><b>Rdf Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__RDF_PREDICATE = RELATION_FIELD_ENTITY__RDF_PREDICATE;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__ENTITY = RELATION_FIELD_ENTITY__ENTITY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__CARDINALITY = RELATION_FIELD_ENTITY__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__TYPE = RELATION_FIELD_ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Common Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__COMMON_FIELDS = RELATION_FIELD_ENTITY__COMMON_FIELDS;

	/**
	 * The feature id for the '<em><b>Opposite Relation Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__OPPOSITE_RELATION_FIELD = RELATION_FIELD_ENTITY__OPPOSITE_RELATION_FIELD;

	/**
	 * The feature id for the '<em><b>Relation Hierarchical Filter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__RELATION_HIERARCHICAL_FILTER = RELATION_FIELD_ENTITY__RELATION_HIERARCHICAL_FILTER;

	/**
	 * The feature id for the '<em><b>Nested Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__NESTED_FORM = RELATION_FIELD_ENTITY__NESTED_FORM;

	/**
	 * The feature id for the '<em><b>Parent Actor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD__PARENT_ACTOR = RELATION_FIELD_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD_FEATURE_COUNT = RELATION_FIELD_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD___VALIDATE = RELATION_FIELD_ENTITY___VALIDATE;

	/**
	 * The number of operations of the '<em>Filter Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FIELD_OPERATION_COUNT = RELATION_FIELD_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link core.impl.NotificationInfoImpl <em>Notification Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.NotificationInfoImpl
	 * @see core.impl.CorePackageImpl#getNotificationInfo()
	 * @generated
	 */
	int NOTIFICATION_INFO = 33;

	/**
	 * The feature id for the '<em><b>Data Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_INFO__DATA_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_INFO__METHOD = 1;

	/**
	 * The number of structural features of the '<em>Notification Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_INFO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Notification Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.DescriptionImpl
	 * @see core.impl.CorePackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 34;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__DISPLAY = 0;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__HELP = 1;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__LOCALE = 2;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.LanguageImpl
	 * @see core.impl.CorePackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__DATE_FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Time Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__TIME_FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Integer Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__INTEGER_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Float Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__FLOAT_FORMAT = 4;

	/**
	 * The feature id for the '<em><b>Iso Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__ISO_CODE = 5;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.FieldDependentVisibilityImpl <em>Field Dependent Visibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.FieldDependentVisibilityImpl
	 * @see core.impl.CorePackageImpl#getFieldDependentVisibility()
	 * @generated
	 */
	int FIELD_DEPENDENT_VISIBILITY = 36;

	/**
	 * The feature id for the '<em><b>Dependency Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEPENDENT_VISIBILITY__DEPENDENCY_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Dependency Field Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEPENDENT_VISIBILITY__DEPENDENCY_FIELD_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Parent Field Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEPENDENT_VISIBILITY__PARENT_FIELD_ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Field Dependent Visibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEPENDENT_VISIBILITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Field Dependent Visibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEPENDENT_VISIBILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.ActorFilterImpl <em>Actor Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.ActorFilterImpl
	 * @see core.impl.CorePackageImpl#getActorFilter()
	 * @generated
	 */
	int ACTOR_FILTER = 37;

	/**
	 * The feature id for the '<em><b>Entity Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FILTER__ENTITY_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Actor Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FILTER__ACTOR_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Sufficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FILTER__SUFFICIENT = 2;

	/**
	 * The number of structural features of the '<em>Actor Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FILTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Actor Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.ThemaImpl <em>Thema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.ThemaImpl
	 * @see core.impl.CorePackageImpl#getThema()
	 * @generated
	 */
	int THEMA = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMA__DESCRIPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMA__ENTITIES = 2;

	/**
	 * The number of structural features of the '<em>Thema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Thema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.CardEntityUIFormatImpl <em>Card Entity UI Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.CardEntityUIFormatImpl
	 * @see core.impl.CorePackageImpl#getCardEntityUIFormat()
	 * @generated
	 */
	int CARD_ENTITY_UI_FORMAT = 39;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY_UI_FORMAT__ENTITY = 0;

	/**
	 * The feature id for the '<em><b>With Tabulations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY_UI_FORMAT__WITH_TABULATIONS = 1;

	/**
	 * The number of structural features of the '<em>Card Entity UI Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY_UI_FORMAT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Card Entity UI Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_ENTITY_UI_FORMAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.GeoType <em>Geo Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.GeoType
	 * @see core.impl.CorePackageImpl#getGeoType()
	 * @generated
	 */
	int GEO_TYPE = 40;

	/**
	 * The meta object id for the '{@link core.PhoneType <em>Phone Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.PhoneType
	 * @see core.impl.CorePackageImpl#getPhoneType()
	 * @generated
	 */
	int PHONE_TYPE = 41;

	/**
	 * The meta object id for the '{@link core.RelationType <em>Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.RelationType
	 * @see core.impl.CorePackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 42;

	/**
	 * The meta object id for the '{@link core.NotificationMethod <em>Notification Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.NotificationMethod
	 * @see core.impl.CorePackageImpl#getNotificationMethod()
	 * @generated
	 */
	int NOTIFICATION_METHOD = 43;


	/**
	 * Returns the meta object for class '{@link core.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see core.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link core.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see core.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link core.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see core.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link core.Project#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see core.Project#getEntities()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link core.Project#getEntityUIFormats <em>Entity UI Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity UI Formats</em>'.
	 * @see core.Project#getEntityUIFormats()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_EntityUIFormats();

	/**
	 * Returns the meta object for the containment reference list '{@link core.Project#getThemas <em>Themas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Themas</em>'.
	 * @see core.Project#getThemas()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Themas();

	/**
	 * Returns the meta object for the containment reference list '{@link core.Project#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Languages</em>'.
	 * @see core.Project#getLanguages()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Languages();

	/**
	 * Returns the meta object for class '{@link core.CardEntity <em>Card Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Entity</em>'.
	 * @see core.CardEntity
	 * @generated
	 */
	EClass getCardEntity();

	/**
	 * Returns the meta object for the attribute '{@link core.CardEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see core.CardEntity#getName()
	 * @see #getCardEntity()
	 * @generated
	 */
	EAttribute getCardEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link core.CardEntity#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see core.CardEntity#getShortName()
	 * @see #getCardEntity()
	 * @generated
	 */
	EAttribute getCardEntity_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link core.CardEntity#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see core.CardEntity#getDescriptions()
	 * @see #getCardEntity()
	 * @generated
	 */
	EReference getCardEntity_Descriptions();

	/**
	 * Returns the meta object for the reference list '{@link core.CardEntity#getColumnFields <em>Column Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Column Fields</em>'.
	 * @see core.CardEntity#getColumnFields()
	 * @see #getCardEntity()
	 * @generated
	 */
	EReference getCardEntity_ColumnFields();

	/**
	 * Returns the meta object for the reference list '{@link core.CardEntity#getMainFields <em>Main Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Main Fields</em>'.
	 * @see core.CardEntity#getMainFields()
	 * @see #getCardEntity()
	 * @generated
	 */
	EReference getCardEntity_MainFields();

	/**
	 * Returns the meta object for the reference list '{@link core.CardEntity#getSecondaryFields <em>Secondary Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Secondary Fields</em>'.
	 * @see core.CardEntity#getSecondaryFields()
	 * @see #getCardEntity()
	 * @generated
	 */
	EReference getCardEntity_SecondaryFields();

	/**
	 * Returns the meta object for the attribute '{@link core.CardEntity#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see core.CardEntity#getIcon()
	 * @see #getCardEntity()
	 * @generated
	 */
	EAttribute getCardEntity_Icon();

	/**
	 * Returns the meta object for the attribute '{@link core.CardEntity#isTopLevel <em>Top Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Level</em>'.
	 * @see core.CardEntity#isTopLevel()
	 * @see #getCardEntity()
	 * @generated
	 */
	EAttribute getCardEntity_TopLevel();

	/**
	 * Returns the meta object for the reference list '{@link core.CardEntity#getClientFilterFields <em>Client Filter Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Client Filter Fields</em>'.
	 * @see core.CardEntity#getClientFilterFields()
	 * @see #getCardEntity()
	 * @generated
	 */
	EReference getCardEntity_ClientFilterFields();

	/**
	 * Returns the meta object for the containment reference list '{@link core.CardEntity#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see core.CardEntity#getGroups()
	 * @see #getCardEntity()
	 * @generated
	 */
	EReference getCardEntity_Groups();

	/**
	 * Returns the meta object for the reference list '{@link core.CardEntity#getSortFields <em>Sort Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sort Fields</em>'.
	 * @see core.CardEntity#getSortFields()
	 * @see #getCardEntity()
	 * @generated
	 */
	EReference getCardEntity_SortFields();

	/**
	 * Returns the meta object for the reference list '{@link core.CardEntity#getActorFilterFields <em>Actor Filter Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actor Filter Fields</em>'.
	 * @see core.CardEntity#getActorFilterFields()
	 * @see #getCardEntity()
	 * @generated
	 */
	EReference getCardEntity_ActorFilterFields();

	/**
	 * Returns the meta object for the attribute '{@link core.CardEntity#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see core.CardEntity#getColor()
	 * @see #getCardEntity()
	 * @generated
	 */
	EAttribute getCardEntity_Color();

	/**
	 * Returns the meta object for the attribute '{@link core.CardEntity#isClientPeriodFilterable <em>Client Period Filterable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Period Filterable</em>'.
	 * @see core.CardEntity#isClientPeriodFilterable()
	 * @see #getCardEntity()
	 * @generated
	 */
	EAttribute getCardEntity_ClientPeriodFilterable();

	/**
	 * Returns the meta object for the reference '{@link core.CardEntity#getGeoreferenced <em>Georeferenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Georeferenced</em>'.
	 * @see core.CardEntity#getGeoreferenced()
	 * @see #getCardEntity()
	 * @generated
	 */
	EReference getCardEntity_Georeferenced();

	/**
	 * Returns the meta object for the reference '{@link core.CardEntity#getRdfSubject <em>Rdf Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rdf Subject</em>'.
	 * @see core.CardEntity#getRdfSubject()
	 * @see #getCardEntity()
	 * @generated
	 */
	EReference getCardEntity_RdfSubject();

	/**
	 * Returns the meta object for the attribute '{@link core.CardEntity#getRdfPredicate <em>Rdf Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rdf Predicate</em>'.
	 * @see core.CardEntity#getRdfPredicate()
	 * @see #getCardEntity()
	 * @generated
	 */
	EAttribute getCardEntity_RdfPredicate();

	/**
	 * Returns the meta object for the reference list '{@link core.CardEntity#getNestedFields <em>Nested Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nested Fields</em>'.
	 * @see core.CardEntity#getNestedFields()
	 * @see #getCardEntity()
	 * @generated
	 */
	EReference getCardEntity_NestedFields();

	/**
	 * Returns the meta object for the attribute '{@link core.CardEntity#isHasDynamicFields <em>Has Dynamic Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Dynamic Fields</em>'.
	 * @see core.CardEntity#isHasDynamicFields()
	 * @see #getCardEntity()
	 * @generated
	 */
	EAttribute getCardEntity_HasDynamicFields();

	/**
	 * Returns the meta object for class '{@link core.FieldGroup <em>Field Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Group</em>'.
	 * @see core.FieldGroup
	 * @generated
	 */
	EClass getFieldGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link core.FieldGroup#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see core.FieldGroup#getDescriptions()
	 * @see #getFieldGroup()
	 * @generated
	 */
	EReference getFieldGroup_Descriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link core.FieldGroup#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see core.FieldGroup#getFields()
	 * @see #getFieldGroup()
	 * @generated
	 */
	EReference getFieldGroup_Fields();

	/**
	 * Returns the meta object for the container reference '{@link core.FieldGroup#getParentCard <em>Parent Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Card</em>'.
	 * @see core.FieldGroup#getParentCard()
	 * @see #getFieldGroup()
	 * @generated
	 */
	EReference getFieldGroup_ParentCard();

	/**
	 * Returns the meta object for the attribute '{@link core.FieldGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see core.FieldGroup#getName()
	 * @see #getFieldGroup()
	 * @generated
	 */
	EAttribute getFieldGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link core.FieldGroup#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see core.FieldGroup#getShortName()
	 * @see #getFieldGroup()
	 * @generated
	 */
	EAttribute getFieldGroup_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link core.FieldGroup#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see core.FieldGroup#getIcon()
	 * @see #getFieldGroup()
	 * @generated
	 */
	EAttribute getFieldGroup_Icon();

	/**
	 * Returns the meta object for the '{@link core.FieldGroup#containsOnlyHiddenFields() <em>Contains Only Hidden Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains Only Hidden Fields</em>' operation.
	 * @see core.FieldGroup#containsOnlyHiddenFields()
	 * @generated
	 */
	EOperation getFieldGroup__ContainsOnlyHiddenFields();

	/**
	 * Returns the meta object for class '{@link core.FieldEntity <em>Field Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Entity</em>'.
	 * @see core.FieldEntity
	 * @generated
	 */
	EClass getFieldEntity();

	/**
	 * Returns the meta object for the attribute '{@link core.FieldEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see core.FieldEntity#getName()
	 * @see #getFieldEntity()
	 * @generated
	 */
	EAttribute getFieldEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link core.FieldEntity#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see core.FieldEntity#getShortName()
	 * @see #getFieldEntity()
	 * @generated
	 */
	EAttribute getFieldEntity_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link core.FieldEntity#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see core.FieldEntity#getDescriptions()
	 * @see #getFieldEntity()
	 * @generated
	 */
	EReference getFieldEntity_Descriptions();

	/**
	 * Returns the meta object for the attribute '{@link core.FieldEntity#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see core.FieldEntity#getDefaultValue()
	 * @see #getFieldEntity()
	 * @generated
	 */
	EAttribute getFieldEntity_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link core.FieldEntity#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see core.FieldEntity#isRequired()
	 * @see #getFieldEntity()
	 * @generated
	 */
	EAttribute getFieldEntity_Required();

	/**
	 * Returns the meta object for the attribute '{@link core.FieldEntity#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see core.FieldEntity#isHidden()
	 * @see #getFieldEntity()
	 * @generated
	 */
	EAttribute getFieldEntity_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link core.FieldEntity#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see core.FieldEntity#isReadOnly()
	 * @see #getFieldEntity()
	 * @generated
	 */
	EAttribute getFieldEntity_ReadOnly();

	/**
	 * Returns the meta object for the container reference '{@link core.FieldEntity#getParentGroup <em>Parent Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Group</em>'.
	 * @see core.FieldEntity#getParentGroup()
	 * @see #getFieldEntity()
	 * @generated
	 */
	EReference getFieldEntity_ParentGroup();

	/**
	 * Returns the meta object for the attribute '{@link core.FieldEntity#getCalculationFunctionName <em>Calculation Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculation Function Name</em>'.
	 * @see core.FieldEntity#getCalculationFunctionName()
	 * @see #getFieldEntity()
	 * @generated
	 */
	EAttribute getFieldEntity_CalculationFunctionName();

	/**
	 * Returns the meta object for the containment reference list '{@link core.FieldEntity#getFieldDependentVisibility <em>Field Dependent Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Dependent Visibility</em>'.
	 * @see core.FieldEntity#getFieldDependentVisibility()
	 * @see #getFieldEntity()
	 * @generated
	 */
	EReference getFieldEntity_FieldDependentVisibility();

	/**
	 * Returns the meta object for the attribute '{@link core.FieldEntity#getRdfPredicate <em>Rdf Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rdf Predicate</em>'.
	 * @see core.FieldEntity#getRdfPredicate()
	 * @see #getFieldEntity()
	 * @generated
	 */
	EAttribute getFieldEntity_RdfPredicate();

	/**
	 * Returns the meta object for the '{@link core.FieldEntity#validate() <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see core.FieldEntity#validate()
	 * @generated
	 */
	EOperation getFieldEntity__Validate();

	/**
	 * Returns the meta object for class '{@link core.BooleanField <em>Boolean Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Field</em>'.
	 * @see core.BooleanField
	 * @generated
	 */
	EClass getBooleanField();

	/**
	 * Returns the meta object for class '{@link core.NumericField <em>Numeric Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Field</em>'.
	 * @see core.NumericField
	 * @generated
	 */
	EClass getNumericField();

	/**
	 * Returns the meta object for the attribute '{@link core.NumericField#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see core.NumericField#getMin()
	 * @see #getNumericField()
	 * @generated
	 */
	EAttribute getNumericField_Min();

	/**
	 * Returns the meta object for the attribute '{@link core.NumericField#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see core.NumericField#getMax()
	 * @see #getNumericField()
	 * @generated
	 */
	EAttribute getNumericField_Max();

	/**
	 * Returns the meta object for the attribute '{@link core.NumericField#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see core.NumericField#getUnit()
	 * @see #getNumericField()
	 * @generated
	 */
	EAttribute getNumericField_Unit();

	/**
	 * Returns the meta object for class '{@link core.IntegerField <em>Integer Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Field</em>'.
	 * @see core.IntegerField
	 * @generated
	 */
	EClass getIntegerField();

	/**
	 * Returns the meta object for class '{@link core.FloatField <em>Float Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Field</em>'.
	 * @see core.FloatField
	 * @generated
	 */
	EClass getFloatField();

	/**
	 * Returns the meta object for the attribute '{@link core.FloatField#getDecimalNumber <em>Decimal Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Number</em>'.
	 * @see core.FloatField#getDecimalNumber()
	 * @see #getFloatField()
	 * @generated
	 */
	EAttribute getFloatField_DecimalNumber();

	/**
	 * Returns the meta object for class '{@link core.StringField <em>String Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Field</em>'.
	 * @see core.StringField
	 * @generated
	 */
	EClass getStringField();

	/**
	 * Returns the meta object for the containment reference list '{@link core.StringField#getValidationRules <em>Validation Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validation Rules</em>'.
	 * @see core.StringField#getValidationRules()
	 * @see #getStringField()
	 * @generated
	 */
	EReference getStringField_ValidationRules();

	/**
	 * Returns the meta object for class '{@link core.ValidationRule <em>Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Rule</em>'.
	 * @see core.ValidationRule
	 * @generated
	 */
	EClass getValidationRule();

	/**
	 * Returns the meta object for the attribute '{@link core.ValidationRule#getValidationRegularExpression <em>Validation Regular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Regular Expression</em>'.
	 * @see core.ValidationRule#getValidationRegularExpression()
	 * @see #getValidationRule()
	 * @generated
	 */
	EAttribute getValidationRule_ValidationRegularExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link core.ValidationRule#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see core.ValidationRule#getDescriptions()
	 * @see #getValidationRule()
	 * @generated
	 */
	EReference getValidationRule_Descriptions();

	/**
	 * Returns the meta object for class '{@link core.AddressField <em>Address Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Field</em>'.
	 * @see core.AddressField
	 * @generated
	 */
	EClass getAddressField();

	/**
	 * Returns the meta object for class '{@link core.EmailField <em>Email Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Field</em>'.
	 * @see core.EmailField
	 * @generated
	 */
	EClass getEmailField();

	/**
	 * Returns the meta object for class '{@link core.GeoField <em>Geo Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Field</em>'.
	 * @see core.GeoField
	 * @generated
	 */
	EClass getGeoField();

	/**
	 * Returns the meta object for the attribute '{@link core.GeoField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see core.GeoField#getType()
	 * @see #getGeoField()
	 * @generated
	 */
	EAttribute getGeoField_Type();

	/**
	 * Returns the meta object for class '{@link core.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see core.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for the attribute '{@link core.TextField#isTranslatable <em>Translatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translatable</em>'.
	 * @see core.TextField#isTranslatable()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_Translatable();

	/**
	 * Returns the meta object for class '{@link core.TextAreaField <em>Text Area Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area Field</em>'.
	 * @see core.TextAreaField
	 * @generated
	 */
	EClass getTextAreaField();

	/**
	 * Returns the meta object for class '{@link core.BarcodeField <em>Barcode Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Barcode Field</em>'.
	 * @see core.BarcodeField
	 * @generated
	 */
	EClass getBarcodeField();

	/**
	 * Returns the meta object for class '{@link core.PhoneField <em>Phone Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone Field</em>'.
	 * @see core.PhoneField
	 * @generated
	 */
	EClass getPhoneField();

	/**
	 * Returns the meta object for the attribute '{@link core.PhoneField#getPhoneType <em>Phone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Type</em>'.
	 * @see core.PhoneField#getPhoneType()
	 * @see #getPhoneField()
	 * @generated
	 */
	EAttribute getPhoneField_PhoneType();

	/**
	 * Returns the meta object for class '{@link core.MediaFileField <em>Media File Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media File Field</em>'.
	 * @see core.MediaFileField
	 * @generated
	 */
	EClass getMediaFileField();

	/**
	 * Returns the meta object for class '{@link core.RelationFieldEntity <em>Relation Field Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Field Entity</em>'.
	 * @see core.RelationFieldEntity
	 * @generated
	 */
	EClass getRelationFieldEntity();

	/**
	 * Returns the meta object for the reference '{@link core.RelationFieldEntity#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see core.RelationFieldEntity#getEntity()
	 * @see #getRelationFieldEntity()
	 * @generated
	 */
	EReference getRelationFieldEntity_Entity();

	/**
	 * Returns the meta object for the attribute '{@link core.RelationFieldEntity#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see core.RelationFieldEntity#getCardinality()
	 * @see #getRelationFieldEntity()
	 * @generated
	 */
	EAttribute getRelationFieldEntity_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link core.RelationFieldEntity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see core.RelationFieldEntity#getType()
	 * @see #getRelationFieldEntity()
	 * @generated
	 */
	EAttribute getRelationFieldEntity_Type();

	/**
	 * Returns the meta object for the reference list '{@link core.RelationFieldEntity#getCommonFields <em>Common Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Common Fields</em>'.
	 * @see core.RelationFieldEntity#getCommonFields()
	 * @see #getRelationFieldEntity()
	 * @generated
	 */
	EReference getRelationFieldEntity_CommonFields();

	/**
	 * Returns the meta object for the reference '{@link core.RelationFieldEntity#getOppositeRelationField <em>Opposite Relation Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite Relation Field</em>'.
	 * @see core.RelationFieldEntity#getOppositeRelationField()
	 * @see #getRelationFieldEntity()
	 * @generated
	 */
	EReference getRelationFieldEntity_OppositeRelationField();

	/**
	 * Returns the meta object for the reference list '{@link core.RelationFieldEntity#getRelationHierarchicalFilter <em>Relation Hierarchical Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relation Hierarchical Filter</em>'.
	 * @see core.RelationFieldEntity#getRelationHierarchicalFilter()
	 * @see #getRelationFieldEntity()
	 * @generated
	 */
	EReference getRelationFieldEntity_RelationHierarchicalFilter();

	/**
	 * Returns the meta object for the attribute '{@link core.RelationFieldEntity#isNestedForm <em>Nested Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nested Form</em>'.
	 * @see core.RelationFieldEntity#isNestedForm()
	 * @see #getRelationFieldEntity()
	 * @generated
	 */
	EAttribute getRelationFieldEntity_NestedForm();

	/**
	 * Returns the meta object for class '{@link core.MainRelationFieldEntity <em>Main Relation Field Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Relation Field Entity</em>'.
	 * @see core.MainRelationFieldEntity
	 * @generated
	 */
	EClass getMainRelationFieldEntity();

	/**
	 * Returns the meta object for the attribute '{@link core.MainRelationFieldEntity#getInverseCardinality <em>Inverse Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse Cardinality</em>'.
	 * @see core.MainRelationFieldEntity#getInverseCardinality()
	 * @see #getMainRelationFieldEntity()
	 * @generated
	 */
	EAttribute getMainRelationFieldEntity_InverseCardinality();

	/**
	 * Returns the meta object for class '{@link core.ReverseRelationFieldEntity <em>Reverse Relation Field Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reverse Relation Field Entity</em>'.
	 * @see core.ReverseRelationFieldEntity
	 * @generated
	 */
	EClass getReverseRelationFieldEntity();

	/**
	 * Returns the meta object for class '{@link core.EnumField <em>Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Field</em>'.
	 * @see core.EnumField
	 * @generated
	 */
	EClass getEnumField();

	/**
	 * Returns the meta object for the containment reference list '{@link core.EnumField#getEnumValues <em>Enum Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Values</em>'.
	 * @see core.EnumField#getEnumValues()
	 * @see #getEnumField()
	 * @generated
	 */
	EReference getEnumField_EnumValues();

	/**
	 * Returns the meta object for the attribute '{@link core.EnumField#isMultipleSelection <em>Multiple Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Selection</em>'.
	 * @see core.EnumField#isMultipleSelection()
	 * @see #getEnumField()
	 * @generated
	 */
	EAttribute getEnumField_MultipleSelection();

	/**
	 * Returns the meta object for class '{@link core.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see core.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link core.EnumValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see core.EnumValue#getValue()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link core.EnumValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see core.EnumValue#getName()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link core.EnumValue#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see core.EnumValue#getDescriptions()
	 * @see #getEnumValue()
	 * @generated
	 */
	EReference getEnumValue_Descriptions();

	/**
	 * Returns the meta object for class '{@link core.BinaryField <em>Binary Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Field</em>'.
	 * @see core.BinaryField
	 * @generated
	 */
	EClass getBinaryField();

	/**
	 * Returns the meta object for the attribute '{@link core.BinaryField#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see core.BinaryField#getCategory()
	 * @see #getBinaryField()
	 * @generated
	 */
	EAttribute getBinaryField_Category();

	/**
	 * Returns the meta object for class '{@link core.VideoField <em>Video Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Field</em>'.
	 * @see core.VideoField
	 * @generated
	 */
	EClass getVideoField();

	/**
	 * Returns the meta object for class '{@link core.PhotoField <em>Photo Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo Field</em>'.
	 * @see core.PhotoField
	 * @generated
	 */
	EClass getPhotoField();

	/**
	 * Returns the meta object for class '{@link core.SoundField <em>Sound Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sound Field</em>'.
	 * @see core.SoundField
	 * @generated
	 */
	EClass getSoundField();

	/**
	 * Returns the meta object for class '{@link core.DatesField <em>Dates Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dates Field</em>'.
	 * @see core.DatesField
	 * @generated
	 */
	EClass getDatesField();

	/**
	 * Returns the meta object for the attribute '{@link core.DatesField#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see core.DatesField#getMin()
	 * @see #getDatesField()
	 * @generated
	 */
	EAttribute getDatesField_Min();

	/**
	 * Returns the meta object for the attribute '{@link core.DatesField#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see core.DatesField#getMax()
	 * @see #getDatesField()
	 * @generated
	 */
	EAttribute getDatesField_Max();

	/**
	 * Returns the meta object for class '{@link core.DateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Field</em>'.
	 * @see core.DateField
	 * @generated
	 */
	EClass getDateField();

	/**
	 * Returns the meta object for class '{@link core.DateTimeField <em>Date Time Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Field</em>'.
	 * @see core.DateTimeField
	 * @generated
	 */
	EClass getDateTimeField();

	/**
	 * Returns the meta object for class '{@link core.TimeField <em>Time Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Field</em>'.
	 * @see core.TimeField
	 * @generated
	 */
	EClass getTimeField();

	/**
	 * Returns the meta object for class '{@link core.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see core.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the containment reference list '{@link core.Actor#getNotificationInfos <em>Notification Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notification Infos</em>'.
	 * @see core.Actor#getNotificationInfos()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_NotificationInfos();

	/**
	 * Returns the meta object for the reference list '{@link core.Actor#getAdminFields <em>Admin Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Admin Fields</em>'.
	 * @see core.Actor#getAdminFields()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_AdminFields();

	/**
	 * Returns the meta object for the containment reference list '{@link core.Actor#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see core.Actor#getFilters()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Filters();

	/**
	 * Returns the meta object for class '{@link core.FilterField <em>Filter Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Field</em>'.
	 * @see core.FilterField
	 * @generated
	 */
	EClass getFilterField();

	/**
	 * Returns the meta object for the container reference '{@link core.FilterField#getParentActor <em>Parent Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Actor</em>'.
	 * @see core.FilterField#getParentActor()
	 * @see #getFilterField()
	 * @generated
	 */
	EReference getFilterField_ParentActor();

	/**
	 * Returns the meta object for class '{@link core.NotificationInfo <em>Notification Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Info</em>'.
	 * @see core.NotificationInfo
	 * @generated
	 */
	EClass getNotificationInfo();

	/**
	 * Returns the meta object for the reference '{@link core.NotificationInfo#getDataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Field</em>'.
	 * @see core.NotificationInfo#getDataField()
	 * @see #getNotificationInfo()
	 * @generated
	 */
	EReference getNotificationInfo_DataField();

	/**
	 * Returns the meta object for the attribute '{@link core.NotificationInfo#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see core.NotificationInfo#getMethod()
	 * @see #getNotificationInfo()
	 * @generated
	 */
	EAttribute getNotificationInfo_Method();

	/**
	 * Returns the meta object for class '{@link core.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see core.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link core.Description#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see core.Description#getDisplay()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Display();

	/**
	 * Returns the meta object for the attribute '{@link core.Description#getHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see core.Description#getHelp()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Help();

	/**
	 * Returns the meta object for the attribute '{@link core.Description#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see core.Description#getLocale()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Locale();

	/**
	 * Returns the meta object for class '{@link core.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see core.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link core.Language#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see core.Language#getName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Name();

	/**
	 * Returns the meta object for the attribute '{@link core.Language#getDateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Format</em>'.
	 * @see core.Language#getDateFormat()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_DateFormat();

	/**
	 * Returns the meta object for the attribute '{@link core.Language#getTimeFormat <em>Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Format</em>'.
	 * @see core.Language#getTimeFormat()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_TimeFormat();

	/**
	 * Returns the meta object for the attribute '{@link core.Language#getIntegerFormat <em>Integer Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer Format</em>'.
	 * @see core.Language#getIntegerFormat()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_IntegerFormat();

	/**
	 * Returns the meta object for the attribute '{@link core.Language#getFloatFormat <em>Float Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float Format</em>'.
	 * @see core.Language#getFloatFormat()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_FloatFormat();

	/**
	 * Returns the meta object for the attribute '{@link core.Language#getIsoCode <em>Iso Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iso Code</em>'.
	 * @see core.Language#getIsoCode()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_IsoCode();

	/**
	 * Returns the meta object for class '{@link core.FieldDependentVisibility <em>Field Dependent Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Dependent Visibility</em>'.
	 * @see core.FieldDependentVisibility
	 * @generated
	 */
	EClass getFieldDependentVisibility();

	/**
	 * Returns the meta object for the reference '{@link core.FieldDependentVisibility#getDependencyField <em>Dependency Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency Field</em>'.
	 * @see core.FieldDependentVisibility#getDependencyField()
	 * @see #getFieldDependentVisibility()
	 * @generated
	 */
	EReference getFieldDependentVisibility_DependencyField();

	/**
	 * Returns the meta object for the attribute '{@link core.FieldDependentVisibility#getDependencyFieldValue <em>Dependency Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependency Field Value</em>'.
	 * @see core.FieldDependentVisibility#getDependencyFieldValue()
	 * @see #getFieldDependentVisibility()
	 * @generated
	 */
	EAttribute getFieldDependentVisibility_DependencyFieldValue();

	/**
	 * Returns the meta object for the container reference '{@link core.FieldDependentVisibility#getParentFieldEntity <em>Parent Field Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Field Entity</em>'.
	 * @see core.FieldDependentVisibility#getParentFieldEntity()
	 * @see #getFieldDependentVisibility()
	 * @generated
	 */
	EReference getFieldDependentVisibility_ParentFieldEntity();

	/**
	 * Returns the meta object for class '{@link core.ActorFilter <em>Actor Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Filter</em>'.
	 * @see core.ActorFilter
	 * @generated
	 */
	EClass getActorFilter();

	/**
	 * Returns the meta object for the reference '{@link core.ActorFilter#getEntityField <em>Entity Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Field</em>'.
	 * @see core.ActorFilter#getEntityField()
	 * @see #getActorFilter()
	 * @generated
	 */
	EReference getActorFilter_EntityField();

	/**
	 * Returns the meta object for the reference '{@link core.ActorFilter#getActorField <em>Actor Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor Field</em>'.
	 * @see core.ActorFilter#getActorField()
	 * @see #getActorFilter()
	 * @generated
	 */
	EReference getActorFilter_ActorField();

	/**
	 * Returns the meta object for the attribute '{@link core.ActorFilter#isSufficient <em>Sufficient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sufficient</em>'.
	 * @see core.ActorFilter#isSufficient()
	 * @see #getActorFilter()
	 * @generated
	 */
	EAttribute getActorFilter_Sufficient();

	/**
	 * Returns the meta object for class '{@link core.Thema <em>Thema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thema</em>'.
	 * @see core.Thema
	 * @generated
	 */
	EClass getThema();

	/**
	 * Returns the meta object for the attribute '{@link core.Thema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see core.Thema#getName()
	 * @see #getThema()
	 * @generated
	 */
	EAttribute getThema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link core.Thema#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see core.Thema#getDescriptions()
	 * @see #getThema()
	 * @generated
	 */
	EReference getThema_Descriptions();

	/**
	 * Returns the meta object for the reference list '{@link core.Thema#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see core.Thema#getEntities()
	 * @see #getThema()
	 * @generated
	 */
	EReference getThema_Entities();

	/**
	 * Returns the meta object for class '{@link core.CardEntityUIFormat <em>Card Entity UI Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Entity UI Format</em>'.
	 * @see core.CardEntityUIFormat
	 * @generated
	 */
	EClass getCardEntityUIFormat();

	/**
	 * Returns the meta object for the reference '{@link core.CardEntityUIFormat#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see core.CardEntityUIFormat#getEntity()
	 * @see #getCardEntityUIFormat()
	 * @generated
	 */
	EReference getCardEntityUIFormat_Entity();

	/**
	 * Returns the meta object for the attribute '{@link core.CardEntityUIFormat#isWithTabulations <em>With Tabulations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Tabulations</em>'.
	 * @see core.CardEntityUIFormat#isWithTabulations()
	 * @see #getCardEntityUIFormat()
	 * @generated
	 */
	EAttribute getCardEntityUIFormat_WithTabulations();

	/**
	 * Returns the meta object for enum '{@link core.GeoType <em>Geo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Geo Type</em>'.
	 * @see core.GeoType
	 * @generated
	 */
	EEnum getGeoType();

	/**
	 * Returns the meta object for enum '{@link core.PhoneType <em>Phone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Phone Type</em>'.
	 * @see core.PhoneType
	 * @generated
	 */
	EEnum getPhoneType();

	/**
	 * Returns the meta object for enum '{@link core.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relation Type</em>'.
	 * @see core.RelationType
	 * @generated
	 */
	EEnum getRelationType();

	/**
	 * Returns the meta object for enum '{@link core.NotificationMethod <em>Notification Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notification Method</em>'.
	 * @see core.NotificationMethod
	 * @generated
	 */
	EEnum getNotificationMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link core.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.ProjectImpl
		 * @see core.impl.CorePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ENTITIES = eINSTANCE.getProject_Entities();

		/**
		 * The meta object literal for the '<em><b>Entity UI Formats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ENTITY_UI_FORMATS = eINSTANCE.getProject_EntityUIFormats();

		/**
		 * The meta object literal for the '<em><b>Themas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__THEMAS = eINSTANCE.getProject_Themas();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__LANGUAGES = eINSTANCE.getProject_Languages();

		/**
		 * The meta object literal for the '{@link core.impl.CardEntityImpl <em>Card Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.CardEntityImpl
		 * @see core.impl.CorePackageImpl#getCardEntity()
		 * @generated
		 */
		EClass CARD_ENTITY = eINSTANCE.getCardEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ENTITY__NAME = eINSTANCE.getCardEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ENTITY__SHORT_NAME = eINSTANCE.getCardEntity_ShortName();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ENTITY__DESCRIPTIONS = eINSTANCE.getCardEntity_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Column Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ENTITY__COLUMN_FIELDS = eINSTANCE.getCardEntity_ColumnFields();

		/**
		 * The meta object literal for the '<em><b>Main Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ENTITY__MAIN_FIELDS = eINSTANCE.getCardEntity_MainFields();

		/**
		 * The meta object literal for the '<em><b>Secondary Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ENTITY__SECONDARY_FIELDS = eINSTANCE.getCardEntity_SecondaryFields();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ENTITY__ICON = eINSTANCE.getCardEntity_Icon();

		/**
		 * The meta object literal for the '<em><b>Top Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ENTITY__TOP_LEVEL = eINSTANCE.getCardEntity_TopLevel();

		/**
		 * The meta object literal for the '<em><b>Client Filter Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ENTITY__CLIENT_FILTER_FIELDS = eINSTANCE.getCardEntity_ClientFilterFields();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ENTITY__GROUPS = eINSTANCE.getCardEntity_Groups();

		/**
		 * The meta object literal for the '<em><b>Sort Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ENTITY__SORT_FIELDS = eINSTANCE.getCardEntity_SortFields();

		/**
		 * The meta object literal for the '<em><b>Actor Filter Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ENTITY__ACTOR_FILTER_FIELDS = eINSTANCE.getCardEntity_ActorFilterFields();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ENTITY__COLOR = eINSTANCE.getCardEntity_Color();

		/**
		 * The meta object literal for the '<em><b>Client Period Filterable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ENTITY__CLIENT_PERIOD_FILTERABLE = eINSTANCE.getCardEntity_ClientPeriodFilterable();

		/**
		 * The meta object literal for the '<em><b>Georeferenced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ENTITY__GEOREFERENCED = eINSTANCE.getCardEntity_Georeferenced();

		/**
		 * The meta object literal for the '<em><b>Rdf Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ENTITY__RDF_SUBJECT = eINSTANCE.getCardEntity_RdfSubject();

		/**
		 * The meta object literal for the '<em><b>Rdf Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ENTITY__RDF_PREDICATE = eINSTANCE.getCardEntity_RdfPredicate();

		/**
		 * The meta object literal for the '<em><b>Nested Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ENTITY__NESTED_FIELDS = eINSTANCE.getCardEntity_NestedFields();

		/**
		 * The meta object literal for the '<em><b>Has Dynamic Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ENTITY__HAS_DYNAMIC_FIELDS = eINSTANCE.getCardEntity_HasDynamicFields();

		/**
		 * The meta object literal for the '{@link core.impl.FieldGroupImpl <em>Field Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.FieldGroupImpl
		 * @see core.impl.CorePackageImpl#getFieldGroup()
		 * @generated
		 */
		EClass FIELD_GROUP = eINSTANCE.getFieldGroup();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_GROUP__DESCRIPTIONS = eINSTANCE.getFieldGroup_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_GROUP__FIELDS = eINSTANCE.getFieldGroup_Fields();

		/**
		 * The meta object literal for the '<em><b>Parent Card</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_GROUP__PARENT_CARD = eINSTANCE.getFieldGroup_ParentCard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_GROUP__NAME = eINSTANCE.getFieldGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_GROUP__SHORT_NAME = eINSTANCE.getFieldGroup_ShortName();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_GROUP__ICON = eINSTANCE.getFieldGroup_Icon();

		/**
		 * The meta object literal for the '<em><b>Contains Only Hidden Fields</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FIELD_GROUP___CONTAINS_ONLY_HIDDEN_FIELDS = eINSTANCE.getFieldGroup__ContainsOnlyHiddenFields();

		/**
		 * The meta object literal for the '{@link core.impl.FieldEntityImpl <em>Field Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.FieldEntityImpl
		 * @see core.impl.CorePackageImpl#getFieldEntity()
		 * @generated
		 */
		EClass FIELD_ENTITY = eINSTANCE.getFieldEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_ENTITY__NAME = eINSTANCE.getFieldEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_ENTITY__SHORT_NAME = eINSTANCE.getFieldEntity_ShortName();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ENTITY__DESCRIPTIONS = eINSTANCE.getFieldEntity_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_ENTITY__DEFAULT_VALUE = eINSTANCE.getFieldEntity_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_ENTITY__REQUIRED = eINSTANCE.getFieldEntity_Required();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_ENTITY__HIDDEN = eINSTANCE.getFieldEntity_Hidden();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_ENTITY__READ_ONLY = eINSTANCE.getFieldEntity_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Parent Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ENTITY__PARENT_GROUP = eINSTANCE.getFieldEntity_ParentGroup();

		/**
		 * The meta object literal for the '<em><b>Calculation Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_ENTITY__CALCULATION_FUNCTION_NAME = eINSTANCE.getFieldEntity_CalculationFunctionName();

		/**
		 * The meta object literal for the '<em><b>Field Dependent Visibility</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ENTITY__FIELD_DEPENDENT_VISIBILITY = eINSTANCE.getFieldEntity_FieldDependentVisibility();

		/**
		 * The meta object literal for the '<em><b>Rdf Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_ENTITY__RDF_PREDICATE = eINSTANCE.getFieldEntity_RdfPredicate();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FIELD_ENTITY___VALIDATE = eINSTANCE.getFieldEntity__Validate();

		/**
		 * The meta object literal for the '{@link core.impl.BooleanFieldImpl <em>Boolean Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.BooleanFieldImpl
		 * @see core.impl.CorePackageImpl#getBooleanField()
		 * @generated
		 */
		EClass BOOLEAN_FIELD = eINSTANCE.getBooleanField();

		/**
		 * The meta object literal for the '{@link core.impl.NumericFieldImpl <em>Numeric Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.NumericFieldImpl
		 * @see core.impl.CorePackageImpl#getNumericField()
		 * @generated
		 */
		EClass NUMERIC_FIELD = eINSTANCE.getNumericField();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_FIELD__MIN = eINSTANCE.getNumericField_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_FIELD__MAX = eINSTANCE.getNumericField_Max();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_FIELD__UNIT = eINSTANCE.getNumericField_Unit();

		/**
		 * The meta object literal for the '{@link core.impl.IntegerFieldImpl <em>Integer Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.IntegerFieldImpl
		 * @see core.impl.CorePackageImpl#getIntegerField()
		 * @generated
		 */
		EClass INTEGER_FIELD = eINSTANCE.getIntegerField();

		/**
		 * The meta object literal for the '{@link core.impl.FloatFieldImpl <em>Float Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.FloatFieldImpl
		 * @see core.impl.CorePackageImpl#getFloatField()
		 * @generated
		 */
		EClass FLOAT_FIELD = eINSTANCE.getFloatField();

		/**
		 * The meta object literal for the '<em><b>Decimal Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_FIELD__DECIMAL_NUMBER = eINSTANCE.getFloatField_DecimalNumber();

		/**
		 * The meta object literal for the '{@link core.impl.StringFieldImpl <em>String Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.StringFieldImpl
		 * @see core.impl.CorePackageImpl#getStringField()
		 * @generated
		 */
		EClass STRING_FIELD = eINSTANCE.getStringField();

		/**
		 * The meta object literal for the '<em><b>Validation Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_FIELD__VALIDATION_RULES = eINSTANCE.getStringField_ValidationRules();

		/**
		 * The meta object literal for the '{@link core.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.ValidationRuleImpl
		 * @see core.impl.CorePackageImpl#getValidationRule()
		 * @generated
		 */
		EClass VALIDATION_RULE = eINSTANCE.getValidationRule();

		/**
		 * The meta object literal for the '<em><b>Validation Regular Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_RULE__VALIDATION_REGULAR_EXPRESSION = eINSTANCE.getValidationRule_ValidationRegularExpression();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_RULE__DESCRIPTIONS = eINSTANCE.getValidationRule_Descriptions();

		/**
		 * The meta object literal for the '{@link core.impl.AddressFieldImpl <em>Address Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.AddressFieldImpl
		 * @see core.impl.CorePackageImpl#getAddressField()
		 * @generated
		 */
		EClass ADDRESS_FIELD = eINSTANCE.getAddressField();

		/**
		 * The meta object literal for the '{@link core.impl.EmailFieldImpl <em>Email Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.EmailFieldImpl
		 * @see core.impl.CorePackageImpl#getEmailField()
		 * @generated
		 */
		EClass EMAIL_FIELD = eINSTANCE.getEmailField();

		/**
		 * The meta object literal for the '{@link core.impl.GeoFieldImpl <em>Geo Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.GeoFieldImpl
		 * @see core.impl.CorePackageImpl#getGeoField()
		 * @generated
		 */
		EClass GEO_FIELD = eINSTANCE.getGeoField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_FIELD__TYPE = eINSTANCE.getGeoField_Type();

		/**
		 * The meta object literal for the '{@link core.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.TextFieldImpl
		 * @see core.impl.CorePackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '<em><b>Translatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__TRANSLATABLE = eINSTANCE.getTextField_Translatable();

		/**
		 * The meta object literal for the '{@link core.impl.TextAreaFieldImpl <em>Text Area Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.TextAreaFieldImpl
		 * @see core.impl.CorePackageImpl#getTextAreaField()
		 * @generated
		 */
		EClass TEXT_AREA_FIELD = eINSTANCE.getTextAreaField();

		/**
		 * The meta object literal for the '{@link core.impl.BarcodeFieldImpl <em>Barcode Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.BarcodeFieldImpl
		 * @see core.impl.CorePackageImpl#getBarcodeField()
		 * @generated
		 */
		EClass BARCODE_FIELD = eINSTANCE.getBarcodeField();

		/**
		 * The meta object literal for the '{@link core.impl.PhoneFieldImpl <em>Phone Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.PhoneFieldImpl
		 * @see core.impl.CorePackageImpl#getPhoneField()
		 * @generated
		 */
		EClass PHONE_FIELD = eINSTANCE.getPhoneField();

		/**
		 * The meta object literal for the '<em><b>Phone Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE_FIELD__PHONE_TYPE = eINSTANCE.getPhoneField_PhoneType();

		/**
		 * The meta object literal for the '{@link core.impl.MediaFileFieldImpl <em>Media File Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.MediaFileFieldImpl
		 * @see core.impl.CorePackageImpl#getMediaFileField()
		 * @generated
		 */
		EClass MEDIA_FILE_FIELD = eINSTANCE.getMediaFileField();

		/**
		 * The meta object literal for the '{@link core.impl.RelationFieldEntityImpl <em>Relation Field Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.RelationFieldEntityImpl
		 * @see core.impl.CorePackageImpl#getRelationFieldEntity()
		 * @generated
		 */
		EClass RELATION_FIELD_ENTITY = eINSTANCE.getRelationFieldEntity();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_FIELD_ENTITY__ENTITY = eINSTANCE.getRelationFieldEntity_Entity();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_FIELD_ENTITY__CARDINALITY = eINSTANCE.getRelationFieldEntity_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_FIELD_ENTITY__TYPE = eINSTANCE.getRelationFieldEntity_Type();

		/**
		 * The meta object literal for the '<em><b>Common Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_FIELD_ENTITY__COMMON_FIELDS = eINSTANCE.getRelationFieldEntity_CommonFields();

		/**
		 * The meta object literal for the '<em><b>Opposite Relation Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_FIELD_ENTITY__OPPOSITE_RELATION_FIELD = eINSTANCE.getRelationFieldEntity_OppositeRelationField();

		/**
		 * The meta object literal for the '<em><b>Relation Hierarchical Filter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_FIELD_ENTITY__RELATION_HIERARCHICAL_FILTER = eINSTANCE.getRelationFieldEntity_RelationHierarchicalFilter();

		/**
		 * The meta object literal for the '<em><b>Nested Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_FIELD_ENTITY__NESTED_FORM = eINSTANCE.getRelationFieldEntity_NestedForm();

		/**
		 * The meta object literal for the '{@link core.impl.MainRelationFieldEntityImpl <em>Main Relation Field Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.MainRelationFieldEntityImpl
		 * @see core.impl.CorePackageImpl#getMainRelationFieldEntity()
		 * @generated
		 */
		EClass MAIN_RELATION_FIELD_ENTITY = eINSTANCE.getMainRelationFieldEntity();

		/**
		 * The meta object literal for the '<em><b>Inverse Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_RELATION_FIELD_ENTITY__INVERSE_CARDINALITY = eINSTANCE.getMainRelationFieldEntity_InverseCardinality();

		/**
		 * The meta object literal for the '{@link core.impl.ReverseRelationFieldEntityImpl <em>Reverse Relation Field Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.ReverseRelationFieldEntityImpl
		 * @see core.impl.CorePackageImpl#getReverseRelationFieldEntity()
		 * @generated
		 */
		EClass REVERSE_RELATION_FIELD_ENTITY = eINSTANCE.getReverseRelationFieldEntity();

		/**
		 * The meta object literal for the '{@link core.impl.EnumFieldImpl <em>Enum Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.EnumFieldImpl
		 * @see core.impl.CorePackageImpl#getEnumField()
		 * @generated
		 */
		EClass ENUM_FIELD = eINSTANCE.getEnumField();

		/**
		 * The meta object literal for the '<em><b>Enum Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_FIELD__ENUM_VALUES = eINSTANCE.getEnumField_EnumValues();

		/**
		 * The meta object literal for the '<em><b>Multiple Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_FIELD__MULTIPLE_SELECTION = eINSTANCE.getEnumField_MultipleSelection();

		/**
		 * The meta object literal for the '{@link core.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.EnumValueImpl
		 * @see core.impl.CorePackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__VALUE = eINSTANCE.getEnumValue_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__NAME = eINSTANCE.getEnumValue_Name();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_VALUE__DESCRIPTIONS = eINSTANCE.getEnumValue_Descriptions();

		/**
		 * The meta object literal for the '{@link core.impl.BinaryFieldImpl <em>Binary Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.BinaryFieldImpl
		 * @see core.impl.CorePackageImpl#getBinaryField()
		 * @generated
		 */
		EClass BINARY_FIELD = eINSTANCE.getBinaryField();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_FIELD__CATEGORY = eINSTANCE.getBinaryField_Category();

		/**
		 * The meta object literal for the '{@link core.impl.VideoFieldImpl <em>Video Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.VideoFieldImpl
		 * @see core.impl.CorePackageImpl#getVideoField()
		 * @generated
		 */
		EClass VIDEO_FIELD = eINSTANCE.getVideoField();

		/**
		 * The meta object literal for the '{@link core.impl.PhotoFieldImpl <em>Photo Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.PhotoFieldImpl
		 * @see core.impl.CorePackageImpl#getPhotoField()
		 * @generated
		 */
		EClass PHOTO_FIELD = eINSTANCE.getPhotoField();

		/**
		 * The meta object literal for the '{@link core.impl.SoundFieldImpl <em>Sound Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.SoundFieldImpl
		 * @see core.impl.CorePackageImpl#getSoundField()
		 * @generated
		 */
		EClass SOUND_FIELD = eINSTANCE.getSoundField();

		/**
		 * The meta object literal for the '{@link core.impl.DatesFieldImpl <em>Dates Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.DatesFieldImpl
		 * @see core.impl.CorePackageImpl#getDatesField()
		 * @generated
		 */
		EClass DATES_FIELD = eINSTANCE.getDatesField();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATES_FIELD__MIN = eINSTANCE.getDatesField_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATES_FIELD__MAX = eINSTANCE.getDatesField_Max();

		/**
		 * The meta object literal for the '{@link core.impl.DateFieldImpl <em>Date Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.DateFieldImpl
		 * @see core.impl.CorePackageImpl#getDateField()
		 * @generated
		 */
		EClass DATE_FIELD = eINSTANCE.getDateField();

		/**
		 * The meta object literal for the '{@link core.impl.DateTimeFieldImpl <em>Date Time Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.DateTimeFieldImpl
		 * @see core.impl.CorePackageImpl#getDateTimeField()
		 * @generated
		 */
		EClass DATE_TIME_FIELD = eINSTANCE.getDateTimeField();

		/**
		 * The meta object literal for the '{@link core.impl.TimeFieldImpl <em>Time Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.TimeFieldImpl
		 * @see core.impl.CorePackageImpl#getTimeField()
		 * @generated
		 */
		EClass TIME_FIELD = eINSTANCE.getTimeField();

		/**
		 * The meta object literal for the '{@link core.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.ActorImpl
		 * @see core.impl.CorePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Notification Infos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__NOTIFICATION_INFOS = eINSTANCE.getActor_NotificationInfos();

		/**
		 * The meta object literal for the '<em><b>Admin Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ADMIN_FIELDS = eINSTANCE.getActor_AdminFields();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__FILTERS = eINSTANCE.getActor_Filters();

		/**
		 * The meta object literal for the '{@link core.impl.FilterFieldImpl <em>Filter Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.FilterFieldImpl
		 * @see core.impl.CorePackageImpl#getFilterField()
		 * @generated
		 */
		EClass FILTER_FIELD = eINSTANCE.getFilterField();

		/**
		 * The meta object literal for the '<em><b>Parent Actor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_FIELD__PARENT_ACTOR = eINSTANCE.getFilterField_ParentActor();

		/**
		 * The meta object literal for the '{@link core.impl.NotificationInfoImpl <em>Notification Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.NotificationInfoImpl
		 * @see core.impl.CorePackageImpl#getNotificationInfo()
		 * @generated
		 */
		EClass NOTIFICATION_INFO = eINSTANCE.getNotificationInfo();

		/**
		 * The meta object literal for the '<em><b>Data Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_INFO__DATA_FIELD = eINSTANCE.getNotificationInfo_DataField();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_INFO__METHOD = eINSTANCE.getNotificationInfo_Method();

		/**
		 * The meta object literal for the '{@link core.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.DescriptionImpl
		 * @see core.impl.CorePackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__DISPLAY = eINSTANCE.getDescription_Display();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__HELP = eINSTANCE.getDescription_Help();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__LOCALE = eINSTANCE.getDescription_Locale();

		/**
		 * The meta object literal for the '{@link core.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.LanguageImpl
		 * @see core.impl.CorePackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__NAME = eINSTANCE.getLanguage_Name();

		/**
		 * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__DATE_FORMAT = eINSTANCE.getLanguage_DateFormat();

		/**
		 * The meta object literal for the '<em><b>Time Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__TIME_FORMAT = eINSTANCE.getLanguage_TimeFormat();

		/**
		 * The meta object literal for the '<em><b>Integer Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__INTEGER_FORMAT = eINSTANCE.getLanguage_IntegerFormat();

		/**
		 * The meta object literal for the '<em><b>Float Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__FLOAT_FORMAT = eINSTANCE.getLanguage_FloatFormat();

		/**
		 * The meta object literal for the '<em><b>Iso Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__ISO_CODE = eINSTANCE.getLanguage_IsoCode();

		/**
		 * The meta object literal for the '{@link core.impl.FieldDependentVisibilityImpl <em>Field Dependent Visibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.FieldDependentVisibilityImpl
		 * @see core.impl.CorePackageImpl#getFieldDependentVisibility()
		 * @generated
		 */
		EClass FIELD_DEPENDENT_VISIBILITY = eINSTANCE.getFieldDependentVisibility();

		/**
		 * The meta object literal for the '<em><b>Dependency Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DEPENDENT_VISIBILITY__DEPENDENCY_FIELD = eINSTANCE.getFieldDependentVisibility_DependencyField();

		/**
		 * The meta object literal for the '<em><b>Dependency Field Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DEPENDENT_VISIBILITY__DEPENDENCY_FIELD_VALUE = eINSTANCE.getFieldDependentVisibility_DependencyFieldValue();

		/**
		 * The meta object literal for the '<em><b>Parent Field Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DEPENDENT_VISIBILITY__PARENT_FIELD_ENTITY = eINSTANCE.getFieldDependentVisibility_ParentFieldEntity();

		/**
		 * The meta object literal for the '{@link core.impl.ActorFilterImpl <em>Actor Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.ActorFilterImpl
		 * @see core.impl.CorePackageImpl#getActorFilter()
		 * @generated
		 */
		EClass ACTOR_FILTER = eINSTANCE.getActorFilter();

		/**
		 * The meta object literal for the '<em><b>Entity Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_FILTER__ENTITY_FIELD = eINSTANCE.getActorFilter_EntityField();

		/**
		 * The meta object literal for the '<em><b>Actor Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_FILTER__ACTOR_FIELD = eINSTANCE.getActorFilter_ActorField();

		/**
		 * The meta object literal for the '<em><b>Sufficient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_FILTER__SUFFICIENT = eINSTANCE.getActorFilter_Sufficient();

		/**
		 * The meta object literal for the '{@link core.impl.ThemaImpl <em>Thema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.ThemaImpl
		 * @see core.impl.CorePackageImpl#getThema()
		 * @generated
		 */
		EClass THEMA = eINSTANCE.getThema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEMA__NAME = eINSTANCE.getThema_Name();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEMA__DESCRIPTIONS = eINSTANCE.getThema_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEMA__ENTITIES = eINSTANCE.getThema_Entities();

		/**
		 * The meta object literal for the '{@link core.impl.CardEntityUIFormatImpl <em>Card Entity UI Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.CardEntityUIFormatImpl
		 * @see core.impl.CorePackageImpl#getCardEntityUIFormat()
		 * @generated
		 */
		EClass CARD_ENTITY_UI_FORMAT = eINSTANCE.getCardEntityUIFormat();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_ENTITY_UI_FORMAT__ENTITY = eINSTANCE.getCardEntityUIFormat_Entity();

		/**
		 * The meta object literal for the '<em><b>With Tabulations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_ENTITY_UI_FORMAT__WITH_TABULATIONS = eINSTANCE.getCardEntityUIFormat_WithTabulations();

		/**
		 * The meta object literal for the '{@link core.GeoType <em>Geo Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.GeoType
		 * @see core.impl.CorePackageImpl#getGeoType()
		 * @generated
		 */
		EEnum GEO_TYPE = eINSTANCE.getGeoType();

		/**
		 * The meta object literal for the '{@link core.PhoneType <em>Phone Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.PhoneType
		 * @see core.impl.CorePackageImpl#getPhoneType()
		 * @generated
		 */
		EEnum PHONE_TYPE = eINSTANCE.getPhoneType();

		/**
		 * The meta object literal for the '{@link core.RelationType <em>Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.RelationType
		 * @see core.impl.CorePackageImpl#getRelationType()
		 * @generated
		 */
		EEnum RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '{@link core.NotificationMethod <em>Notification Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.NotificationMethod
		 * @see core.impl.CorePackageImpl#getNotificationMethod()
		 * @generated
		 */
		EEnum NOTIFICATION_METHOD = eINSTANCE.getNotificationMethod();

	}

} //CorePackage
