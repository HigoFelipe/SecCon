/**
 */
package SecCon.SecCon.util;

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
import SecCon.SecCon.DataType;
import SecCon.SecCon.DetectionUseCase;
import SecCon.SecCon.Element;
import SecCon.SecCon.Enumeration;
import SecCon.SecCon.EnumerationLiteral;
import SecCon.SecCon.Event;
import SecCon.SecCon.Extend;
import SecCon.SecCon.FinalState;
import SecCon.SecCon.Include;
import SecCon.SecCon.InitialState;
import SecCon.SecCon.MultiplicityElement;
import SecCon.SecCon.NamedElement;
import SecCon.SecCon.Operation;
import SecCon.SecCon.Parameter;
import SecCon.SecCon.PrevenctionUseCase;
import SecCon.SecCon.PrimitiveType;
import SecCon.SecCon.Project;
import SecCon.SecCon.ProtectedState;
import SecCon.SecCon.RecoverUseCase;
import SecCon.SecCon.Rule;
import SecCon.SecCon.SecConPackage;
import SecCon.SecCon.State;
import SecCon.SecCon.StateMachineScenario;
import SecCon.SecCon.StateOperation;
import SecCon.SecCon.StateVertex;
import SecCon.SecCon.ThreatEvent;
import SecCon.SecCon.ThreatUseCase;
import SecCon.SecCon.ThreatenedState;
import SecCon.SecCon.Transition;
import SecCon.SecCon.Type;
import SecCon.SecCon.TypedElement;
import SecCon.SecCon.UseCase;
import SecCon.SecCon.UseCaseScenario;
import SecCon.SecCon.VulnerabilityUseCase;
import SecCon.SecCon.VulnerableState;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SecCon.SecCon.SecConPackage
 * @generated
 */
public class SecConAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecConPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecConAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SecConPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecConSwitch<Adapter> modelSwitch =
		new SecConSwitch<Adapter>() {
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseClass(SecCon.SecCon.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
				return createEnumerationLiteralAdapter();
			}
			@Override
			public Adapter casePackage(SecCon.SecCon.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseUseCase(UseCase object) {
				return createUseCaseAdapter();
			}
			@Override
			public Adapter caseThreatUseCase(ThreatUseCase object) {
				return createThreatUseCaseAdapter();
			}
			@Override
			public Adapter caseAttackUseCase(AttackUseCase object) {
				return createAttackUseCaseAdapter();
			}
			@Override
			public Adapter caseVulnerabilityUseCase(VulnerabilityUseCase object) {
				return createVulnerabilityUseCaseAdapter();
			}
			@Override
			public Adapter caseCountermeasureUseCase(CountermeasureUseCase object) {
				return createCountermeasureUseCaseAdapter();
			}
			@Override
			public Adapter caseRecoverUseCase(RecoverUseCase object) {
				return createRecoverUseCaseAdapter();
			}
			@Override
			public Adapter casePrevenctionUseCase(PrevenctionUseCase object) {
				return createPrevenctionUseCaseAdapter();
			}
			@Override
			public Adapter caseDetectionUseCase(DetectionUseCase object) {
				return createDetectionUseCaseAdapter();
			}
			@Override
			public Adapter caseInclude(Include object) {
				return createIncludeAdapter();
			}
			@Override
			public Adapter caseExtend(Extend object) {
				return createExtendAdapter();
			}
			@Override
			public Adapter caseUseCaseScenario(UseCaseScenario object) {
				return createUseCaseScenarioAdapter();
			}
			@Override
			public Adapter caseStateMachineScenario(StateMachineScenario object) {
				return createStateMachineScenarioAdapter();
			}
			@Override
			public Adapter caseStateVertex(StateVertex object) {
				return createStateVertexAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseStateOperation(StateOperation object) {
				return createStateOperationAdapter();
			}
			@Override
			public Adapter caseFinalState(FinalState object) {
				return createFinalStateAdapter();
			}
			@Override
			public Adapter caseThreatenedState(ThreatenedState object) {
				return createThreatenedStateAdapter();
			}
			@Override
			public Adapter caseAttackedState(AttackedState object) {
				return createAttackedStateAdapter();
			}
			@Override
			public Adapter caseVulnerableState(VulnerableState object) {
				return createVulnerableStateAdapter();
			}
			@Override
			public Adapter caseProtectedState(ProtectedState object) {
				return createProtectedStateAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseInitialState(InitialState object) {
				return createInitialStateAdapter();
			}
			@Override
			public Adapter caseCountermeasureEvent(CountermeasureEvent object) {
				return createCountermeasureEventAdapter();
			}
			@Override
			public Adapter caseThreatEvent(ThreatEvent object) {
				return createThreatEventAdapter();
			}
			@Override
			public Adapter caseAttackEvent(AttackEvent object) {
				return createAttackEventAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseContextScenario(ContextScenario object) {
				return createContextScenarioAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseContextInformation(ContextInformation object) {
				return createContextInformationAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.UseCase
	 * @generated
	 */
	public Adapter createUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.ThreatUseCase <em>Threat Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.ThreatUseCase
	 * @generated
	 */
	public Adapter createThreatUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.AttackUseCase <em>Attack Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.AttackUseCase
	 * @generated
	 */
	public Adapter createAttackUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.VulnerabilityUseCase <em>Vulnerability Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.VulnerabilityUseCase
	 * @generated
	 */
	public Adapter createVulnerabilityUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.CountermeasureUseCase <em>Countermeasure Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.CountermeasureUseCase
	 * @generated
	 */
	public Adapter createCountermeasureUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.RecoverUseCase <em>Recover Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.RecoverUseCase
	 * @generated
	 */
	public Adapter createRecoverUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.PrevenctionUseCase <em>Prevenction Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.PrevenctionUseCase
	 * @generated
	 */
	public Adapter createPrevenctionUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.DetectionUseCase <em>Detection Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.DetectionUseCase
	 * @generated
	 */
	public Adapter createDetectionUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Include
	 * @generated
	 */
	public Adapter createIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Extend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Extend
	 * @generated
	 */
	public Adapter createExtendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.UseCaseScenario <em>Use Case Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.UseCaseScenario
	 * @generated
	 */
	public Adapter createUseCaseScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.StateMachineScenario <em>State Machine Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.StateMachineScenario
	 * @generated
	 */
	public Adapter createStateMachineScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.StateVertex <em>State Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.StateVertex
	 * @generated
	 */
	public Adapter createStateVertexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.StateOperation <em>State Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.StateOperation
	 * @generated
	 */
	public Adapter createStateOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.ThreatenedState <em>Threatened State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.ThreatenedState
	 * @generated
	 */
	public Adapter createThreatenedStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.AttackedState <em>Attacked State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.AttackedState
	 * @generated
	 */
	public Adapter createAttackedStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.VulnerableState <em>Vulnerable State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.VulnerableState
	 * @generated
	 */
	public Adapter createVulnerableStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.ProtectedState <em>Protected State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.ProtectedState
	 * @generated
	 */
	public Adapter createProtectedStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.InitialState
	 * @generated
	 */
	public Adapter createInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.CountermeasureEvent <em>Countermeasure Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.CountermeasureEvent
	 * @generated
	 */
	public Adapter createCountermeasureEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.ThreatEvent <em>Threat Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.ThreatEvent
	 * @generated
	 */
	public Adapter createThreatEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.AttackEvent <em>Attack Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.AttackEvent
	 * @generated
	 */
	public Adapter createAttackEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.ContextScenario <em>Context Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.ContextScenario
	 * @generated
	 */
	public Adapter createContextScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.ContextInformation <em>Context Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.ContextInformation
	 * @generated
	 */
	public Adapter createContextInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecCon.SecCon.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecCon.SecCon.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SecConAdapterFactory
