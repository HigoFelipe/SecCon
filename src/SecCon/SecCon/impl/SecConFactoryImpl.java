/**
 */
package SecCon.SecCon.impl;

import SecCon.SecCon.Action;
import SecCon.SecCon.Actor;
import SecCon.SecCon.AttackEvent;
import SecCon.SecCon.AttackUseCase;
import SecCon.SecCon.AttackedState;
import SecCon.SecCon.Attribute;
import SecCon.SecCon.Comment;
import SecCon.SecCon.Condition;
import SecCon.SecCon.ContextInformation;
import SecCon.SecCon.ContextScenario;
import SecCon.SecCon.CountermeasureEvent;
import SecCon.SecCon.CountermeasureUseCase;
import SecCon.SecCon.DetectionUseCase;
import SecCon.SecCon.Enumeration;
import SecCon.SecCon.EnumerationLiteral;
import SecCon.SecCon.Extend;
import SecCon.SecCon.FinalState;
import SecCon.SecCon.Include;
import SecCon.SecCon.InitialState;
import SecCon.SecCon.Operation;
import SecCon.SecCon.Operator;
import SecCon.SecCon.Parameter;
import SecCon.SecCon.ParameterDirectionKind;
import SecCon.SecCon.PrevenctionUseCase;
import SecCon.SecCon.PrimitiveType;
import SecCon.SecCon.Project;
import SecCon.SecCon.ProtectedState;
import SecCon.SecCon.PseudostateKind;
import SecCon.SecCon.RecoverUseCase;
import SecCon.SecCon.Rule;
import SecCon.SecCon.SecConFactory;
import SecCon.SecCon.SecConPackage;
import SecCon.SecCon.StateMachineScenario;
import SecCon.SecCon.StateOperation;
import SecCon.SecCon.ThreatEvent;
import SecCon.SecCon.ThreatUseCase;
import SecCon.SecCon.ThreatenedState;
import SecCon.SecCon.Transition;
import SecCon.SecCon.TypeOfCondition;
import SecCon.SecCon.TypeOfContext;
import SecCon.SecCon.UseCaseScenario;
import SecCon.SecCon.VulnerabilityUseCase;
import SecCon.SecCon.VulnerableState;
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
public class SecConFactoryImpl extends EFactoryImpl implements SecConFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecConFactory init() {
		try {
			SecConFactory theSecConFactory = (SecConFactory)EPackage.Registry.INSTANCE.getEFactory(SecConPackage.eNS_URI);
			if (theSecConFactory != null) {
				return theSecConFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecConFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecConFactoryImpl() {
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
			case SecConPackage.COMMENT: return createComment();
			case SecConPackage.ATTRIBUTE: return createAttribute();
			case SecConPackage.OPERATION: return createOperation();
			case SecConPackage.PARAMETER: return createParameter();
			case SecConPackage.CLASS: return createClass();
			case SecConPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case SecConPackage.ENUMERATION: return createEnumeration();
			case SecConPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case SecConPackage.PACKAGE: return createPackage();
			case SecConPackage.ACTOR: return createActor();
			case SecConPackage.THREAT_USE_CASE: return createThreatUseCase();
			case SecConPackage.ATTACK_USE_CASE: return createAttackUseCase();
			case SecConPackage.VULNERABILITY_USE_CASE: return createVulnerabilityUseCase();
			case SecConPackage.COUNTERMEASURE_USE_CASE: return createCountermeasureUseCase();
			case SecConPackage.RECOVER_USE_CASE: return createRecoverUseCase();
			case SecConPackage.PREVENCTION_USE_CASE: return createPrevenctionUseCase();
			case SecConPackage.DETECTION_USE_CASE: return createDetectionUseCase();
			case SecConPackage.INCLUDE: return createInclude();
			case SecConPackage.EXTEND: return createExtend();
			case SecConPackage.USE_CASE_SCENARIO: return createUseCaseScenario();
			case SecConPackage.STATE_MACHINE_SCENARIO: return createStateMachineScenario();
			case SecConPackage.STATE_OPERATION: return createStateOperation();
			case SecConPackage.FINAL_STATE: return createFinalState();
			case SecConPackage.THREATENED_STATE: return createThreatenedState();
			case SecConPackage.ATTACKED_STATE: return createAttackedState();
			case SecConPackage.VULNERABLE_STATE: return createVulnerableState();
			case SecConPackage.PROTECTED_STATE: return createProtectedState();
			case SecConPackage.TRANSITION: return createTransition();
			case SecConPackage.INITIAL_STATE: return createInitialState();
			case SecConPackage.COUNTERMEASURE_EVENT: return createCountermeasureEvent();
			case SecConPackage.THREAT_EVENT: return createThreatEvent();
			case SecConPackage.ATTACK_EVENT: return createAttackEvent();
			case SecConPackage.PROJECT: return createProject();
			case SecConPackage.CONTEXT_SCENARIO: return createContextScenario();
			case SecConPackage.RULE: return createRule();
			case SecConPackage.CONTEXT_INFORMATION: return createContextInformation();
			case SecConPackage.CONDITION: return createCondition();
			case SecConPackage.ACTION: return createAction();
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
			case SecConPackage.PARAMETER_DIRECTION_KIND:
				return createParameterDirectionKindFromString(eDataType, initialValue);
			case SecConPackage.PSEUDOSTATE_KIND:
				return createPseudostateKindFromString(eDataType, initialValue);
			case SecConPackage.TYPE_OF_CONTEXT:
				return createTypeOfContextFromString(eDataType, initialValue);
			case SecConPackage.OPERATOR:
				return createOperatorFromString(eDataType, initialValue);
			case SecConPackage.TYPE_OF_CONDITION:
				return createTypeOfConditionFromString(eDataType, initialValue);
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
			case SecConPackage.PARAMETER_DIRECTION_KIND:
				return convertParameterDirectionKindToString(eDataType, instanceValue);
			case SecConPackage.PSEUDOSTATE_KIND:
				return convertPseudostateKindToString(eDataType, instanceValue);
			case SecConPackage.TYPE_OF_CONTEXT:
				return convertTypeOfContextToString(eDataType, instanceValue);
			case SecConPackage.OPERATOR:
				return convertOperatorToString(eDataType, instanceValue);
			case SecConPackage.TYPE_OF_CONDITION:
				return convertTypeOfConditionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecCon.SecCon.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecCon.SecCon.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
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
	public ThreatUseCase createThreatUseCase() {
		ThreatUseCaseImpl threatUseCase = new ThreatUseCaseImpl();
		return threatUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackUseCase createAttackUseCase() {
		AttackUseCaseImpl attackUseCase = new AttackUseCaseImpl();
		return attackUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VulnerabilityUseCase createVulnerabilityUseCase() {
		VulnerabilityUseCaseImpl vulnerabilityUseCase = new VulnerabilityUseCaseImpl();
		return vulnerabilityUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountermeasureUseCase createCountermeasureUseCase() {
		CountermeasureUseCaseImpl countermeasureUseCase = new CountermeasureUseCaseImpl();
		return countermeasureUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecoverUseCase createRecoverUseCase() {
		RecoverUseCaseImpl recoverUseCase = new RecoverUseCaseImpl();
		return recoverUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrevenctionUseCase createPrevenctionUseCase() {
		PrevenctionUseCaseImpl prevenctionUseCase = new PrevenctionUseCaseImpl();
		return prevenctionUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetectionUseCase createDetectionUseCase() {
		DetectionUseCaseImpl detectionUseCase = new DetectionUseCaseImpl();
		return detectionUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend createExtend() {
		ExtendImpl extend = new ExtendImpl();
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseScenario createUseCaseScenario() {
		UseCaseScenarioImpl useCaseScenario = new UseCaseScenarioImpl();
		return useCaseScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineScenario createStateMachineScenario() {
		StateMachineScenarioImpl stateMachineScenario = new StateMachineScenarioImpl();
		return stateMachineScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateOperation createStateOperation() {
		StateOperationImpl stateOperation = new StateOperationImpl();
		return stateOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatenedState createThreatenedState() {
		ThreatenedStateImpl threatenedState = new ThreatenedStateImpl();
		return threatenedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackedState createAttackedState() {
		AttackedStateImpl attackedState = new AttackedStateImpl();
		return attackedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VulnerableState createVulnerableState() {
		VulnerableStateImpl vulnerableState = new VulnerableStateImpl();
		return vulnerableState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectedState createProtectedState() {
		ProtectedStateImpl protectedState = new ProtectedStateImpl();
		return protectedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountermeasureEvent createCountermeasureEvent() {
		CountermeasureEventImpl countermeasureEvent = new CountermeasureEventImpl();
		return countermeasureEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreatEvent createThreatEvent() {
		ThreatEventImpl threatEvent = new ThreatEventImpl();
		return threatEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackEvent createAttackEvent() {
		AttackEventImpl attackEvent = new AttackEventImpl();
		return attackEvent;
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
	public ContextScenario createContextScenario() {
		ContextScenarioImpl contextScenario = new ContextScenarioImpl();
		return contextScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextInformation createContextInformation() {
		ContextInformationImpl contextInformation = new ContextInformationImpl();
		return contextInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind createParameterDirectionKindFromString(EDataType eDataType, String initialValue) {
		ParameterDirectionKind result = ParameterDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PseudostateKind createPseudostateKindFromString(EDataType eDataType, String initialValue) {
		PseudostateKind result = PseudostateKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPseudostateKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfContext createTypeOfContextFromString(EDataType eDataType, String initialValue) {
		TypeOfContext result = TypeOfContext.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOfContextToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfCondition createTypeOfConditionFromString(EDataType eDataType, String initialValue) {
		TypeOfCondition result = TypeOfCondition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOfConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecConPackage getSecConPackage() {
		return (SecConPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecConPackage getPackage() {
		return SecConPackage.eINSTANCE;
	}

} //SecConFactoryImpl
