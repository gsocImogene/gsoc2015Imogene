/**
 */
package core.impl;

import core.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorePackage.PROJECT: return createProject();
			case CorePackage.CARD_ENTITY: return createCardEntity();
			case CorePackage.FIELD_GROUP: return createFieldGroup();
			case CorePackage.BOOLEAN_FIELD: return createBooleanField();
			case CorePackage.INTEGER_FIELD: return createIntegerField();
			case CorePackage.FLOAT_FIELD: return createFloatField();
			case CorePackage.VALIDATION_RULE: return createValidationRule();
			case CorePackage.ADDRESS_FIELD: return createAddressField();
			case CorePackage.EMAIL_FIELD: return createEmailField();
			case CorePackage.GEO_FIELD: return createGeoField();
			case CorePackage.TEXT_FIELD: return createTextField();
			case CorePackage.TEXT_AREA_FIELD: return createTextAreaField();
			case CorePackage.BARCODE_FIELD: return createBarcodeField();
			case CorePackage.PHONE_FIELD: return createPhoneField();
			case CorePackage.MAIN_RELATION_FIELD_ENTITY: return createMainRelationFieldEntity();
			case CorePackage.REVERSE_RELATION_FIELD_ENTITY: return createReverseRelationFieldEntity();
			case CorePackage.ENUM_FIELD: return createEnumField();
			case CorePackage.ENUM_VALUE: return createEnumValue();
			case CorePackage.BINARY_FIELD: return createBinaryField();
			case CorePackage.VIDEO_FIELD: return createVideoField();
			case CorePackage.PHOTO_FIELD: return createPhotoField();
			case CorePackage.SOUND_FIELD: return createSoundField();
			case CorePackage.DATE_FIELD: return createDateField();
			case CorePackage.DATE_TIME_FIELD: return createDateTimeField();
			case CorePackage.TIME_FIELD: return createTimeField();
			case CorePackage.ACTOR: return createActor();
			case CorePackage.FILTER_FIELD: return createFilterField();
			case CorePackage.NOTIFICATION_INFO: return createNotificationInfo();
			case CorePackage.DESCRIPTION: return createDescription();
			case CorePackage.LANGUAGE: return createLanguage();
			case CorePackage.FIELD_DEPENDENT_VISIBILITY: return createFieldDependentVisibility();
			case CorePackage.ACTOR_FILTER: return createActorFilter();
			case CorePackage.THEMA: return createThema();
			case CorePackage.CARD_ENTITY_UI_FORMAT: return createCardEntityUIFormat();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.GEO_TYPE:
				return createGeoTypeFromString(eDataType, initialValue);
			case CorePackage.PHONE_TYPE:
				return createPhoneTypeFromString(eDataType, initialValue);
			case CorePackage.RELATION_TYPE:
				return createRelationTypeFromString(eDataType, initialValue);
			case CorePackage.NOTIFICATION_METHOD:
				return createNotificationMethodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.GEO_TYPE:
				return convertGeoTypeToString(eDataType, instanceValue);
			case CorePackage.PHONE_TYPE:
				return convertPhoneTypeToString(eDataType, instanceValue);
			case CorePackage.RELATION_TYPE:
				return convertRelationTypeToString(eDataType, instanceValue);
			case CorePackage.NOTIFICATION_METHOD:
				return convertNotificationMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardEntity createCardEntity() {
		CardEntityImpl cardEntity = new CardEntityImpl();
		return cardEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldGroup createFieldGroup() {
		FieldGroupImpl fieldGroup = new FieldGroupImpl();
		return fieldGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanField createBooleanField() {
		BooleanFieldImpl booleanField = new BooleanFieldImpl();
		return booleanField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerField createIntegerField() {
		IntegerFieldImpl integerField = new IntegerFieldImpl();
		return integerField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatField createFloatField() {
		FloatFieldImpl floatField = new FloatFieldImpl();
		return floatField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationRule createValidationRule() {
		ValidationRuleImpl validationRule = new ValidationRuleImpl();
		return validationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressField createAddressField() {
		AddressFieldImpl addressField = new AddressFieldImpl();
		return addressField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailField createEmailField() {
		EmailFieldImpl emailField = new EmailFieldImpl();
		return emailField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoField createGeoField() {
		GeoFieldImpl geoField = new GeoFieldImpl();
		return geoField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextField createTextField() {
		TextFieldImpl textField = new TextFieldImpl();
		return textField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAreaField createTextAreaField() {
		TextAreaFieldImpl textAreaField = new TextAreaFieldImpl();
		return textAreaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarcodeField createBarcodeField() {
		BarcodeFieldImpl barcodeField = new BarcodeFieldImpl();
		return barcodeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhoneField createPhoneField() {
		PhoneFieldImpl phoneField = new PhoneFieldImpl();
		return phoneField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainRelationFieldEntity createMainRelationFieldEntity() {
		MainRelationFieldEntityImpl mainRelationFieldEntity = new MainRelationFieldEntityImpl();
		return mainRelationFieldEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReverseRelationFieldEntity createReverseRelationFieldEntity() {
		ReverseRelationFieldEntityImpl reverseRelationFieldEntity = new ReverseRelationFieldEntityImpl();
		return reverseRelationFieldEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumField createEnumField() {
		EnumFieldImpl enumField = new EnumFieldImpl();
		return enumField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue createEnumValue() {
		EnumValueImpl enumValue = new EnumValueImpl();
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryField createBinaryField() {
		BinaryFieldImpl binaryField = new BinaryFieldImpl();
		return binaryField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoField createVideoField() {
		VideoFieldImpl videoField = new VideoFieldImpl();
		return videoField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoField createPhotoField() {
		PhotoFieldImpl photoField = new PhotoFieldImpl();
		return photoField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundField createSoundField() {
		SoundFieldImpl soundField = new SoundFieldImpl();
		return soundField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateField createDateField() {
		DateFieldImpl dateField = new DateFieldImpl();
		return dateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeField createDateTimeField() {
		DateTimeFieldImpl dateTimeField = new DateTimeFieldImpl();
		return dateTimeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeField createTimeField() {
		TimeFieldImpl timeField = new TimeFieldImpl();
		return timeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterField createFilterField() {
		FilterFieldImpl filterField = new FilterFieldImpl();
		return filterField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationInfo createNotificationInfo() {
		NotificationInfoImpl notificationInfo = new NotificationInfoImpl();
		return notificationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDependentVisibility createFieldDependentVisibility() {
		FieldDependentVisibilityImpl fieldDependentVisibility = new FieldDependentVisibilityImpl();
		return fieldDependentVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorFilter createActorFilter() {
		ActorFilterImpl actorFilter = new ActorFilterImpl();
		return actorFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thema createThema() {
		ThemaImpl thema = new ThemaImpl();
		return thema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardEntityUIFormat createCardEntityUIFormat() {
		CardEntityUIFormatImpl cardEntityUIFormat = new CardEntityUIFormatImpl();
		return cardEntityUIFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoType createGeoTypeFromString(EDataType eDataType, String initialValue) {
		GeoType result = GeoType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeoTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhoneType createPhoneTypeFromString(EDataType eDataType, String initialValue) {
		PhoneType result = PhoneType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhoneTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType createRelationTypeFromString(EDataType eDataType, String initialValue) {
		RelationType result = RelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationMethod createNotificationMethodFromString(EDataType eDataType, String initialValue) {
		NotificationMethod result = NotificationMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
