/**
 */
package SecCon.SecCon.impl;

import SecCon.SecCon.Actor;
import SecCon.SecCon.Extend;
import SecCon.SecCon.Include;
import SecCon.SecCon.SecConPackage;
import SecCon.SecCon.UseCase;
import SecCon.SecCon.UseCaseScenario;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SecCon.SecCon.impl.UseCaseScenarioImpl#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.UseCaseScenarioImpl#getOwnedExtend <em>Owned Extend</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.UseCaseScenarioImpl#getOwnedInclude <em>Owned Include</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.UseCaseScenarioImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.UseCaseScenarioImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link SecCon.SecCon.impl.UseCaseScenarioImpl#getOwnedActor <em>Owned Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseScenarioImpl extends NamedElementImpl implements UseCaseScenario {
	/**
	 * The cached value of the '{@link #getOwnedUseCase() <em>Owned Use Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> ownedUseCase;

	/**
	 * The cached value of the '{@link #getOwnedExtend() <em>Owned Extend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExtend()
	 * @generated
	 * @ordered
	 */
	protected EList<Extend> ownedExtend;
	/**
	 * The cached value of the '{@link #getOwnedInclude() <em>Owned Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> ownedInclude;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedActor() <em>Owned Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> ownedActor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecConPackage.Literals.USE_CASE_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getOwnedUseCase() {
		if (ownedUseCase == null) {
			ownedUseCase = new EObjectContainmentEList<UseCase>(UseCase.class, this, SecConPackage.USE_CASE_SCENARIO__OWNED_USE_CASE);
		}
		return ownedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extend> getOwnedExtend() {
		if (ownedExtend == null) {
			ownedExtend = new EObjectContainmentEList<Extend>(Extend.class, this, SecConPackage.USE_CASE_SCENARIO__OWNED_EXTEND);
		}
		return ownedExtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Include> getOwnedInclude() {
		if (ownedInclude == null) {
			ownedInclude = new EObjectContainmentEList<Include>(Include.class, this, SecConPackage.USE_CASE_SCENARIO__OWNED_INCLUDE);
		}
		return ownedInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.USE_CASE_SCENARIO__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecConPackage.USE_CASE_SCENARIO__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getOwnedActor() {
		if (ownedActor == null) {
			ownedActor = new EObjectContainmentEList<Actor>(Actor.class, this, SecConPackage.USE_CASE_SCENARIO__OWNED_ACTOR);
		}
		return ownedActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecConPackage.USE_CASE_SCENARIO__OWNED_USE_CASE:
				return ((InternalEList<?>)getOwnedUseCase()).basicRemove(otherEnd, msgs);
			case SecConPackage.USE_CASE_SCENARIO__OWNED_EXTEND:
				return ((InternalEList<?>)getOwnedExtend()).basicRemove(otherEnd, msgs);
			case SecConPackage.USE_CASE_SCENARIO__OWNED_INCLUDE:
				return ((InternalEList<?>)getOwnedInclude()).basicRemove(otherEnd, msgs);
			case SecConPackage.USE_CASE_SCENARIO__OWNED_ACTOR:
				return ((InternalEList<?>)getOwnedActor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecConPackage.USE_CASE_SCENARIO__OWNED_USE_CASE:
				return getOwnedUseCase();
			case SecConPackage.USE_CASE_SCENARIO__OWNED_EXTEND:
				return getOwnedExtend();
			case SecConPackage.USE_CASE_SCENARIO__OWNED_INCLUDE:
				return getOwnedInclude();
			case SecConPackage.USE_CASE_SCENARIO__AUTHOR:
				return getAuthor();
			case SecConPackage.USE_CASE_SCENARIO__VERSION:
				return getVersion();
			case SecConPackage.USE_CASE_SCENARIO__OWNED_ACTOR:
				return getOwnedActor();
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
			case SecConPackage.USE_CASE_SCENARIO__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				getOwnedUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case SecConPackage.USE_CASE_SCENARIO__OWNED_EXTEND:
				getOwnedExtend().clear();
				getOwnedExtend().addAll((Collection<? extends Extend>)newValue);
				return;
			case SecConPackage.USE_CASE_SCENARIO__OWNED_INCLUDE:
				getOwnedInclude().clear();
				getOwnedInclude().addAll((Collection<? extends Include>)newValue);
				return;
			case SecConPackage.USE_CASE_SCENARIO__AUTHOR:
				setAuthor((String)newValue);
				return;
			case SecConPackage.USE_CASE_SCENARIO__VERSION:
				setVersion((String)newValue);
				return;
			case SecConPackage.USE_CASE_SCENARIO__OWNED_ACTOR:
				getOwnedActor().clear();
				getOwnedActor().addAll((Collection<? extends Actor>)newValue);
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
			case SecConPackage.USE_CASE_SCENARIO__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				return;
			case SecConPackage.USE_CASE_SCENARIO__OWNED_EXTEND:
				getOwnedExtend().clear();
				return;
			case SecConPackage.USE_CASE_SCENARIO__OWNED_INCLUDE:
				getOwnedInclude().clear();
				return;
			case SecConPackage.USE_CASE_SCENARIO__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case SecConPackage.USE_CASE_SCENARIO__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case SecConPackage.USE_CASE_SCENARIO__OWNED_ACTOR:
				getOwnedActor().clear();
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
			case SecConPackage.USE_CASE_SCENARIO__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case SecConPackage.USE_CASE_SCENARIO__OWNED_EXTEND:
				return ownedExtend != null && !ownedExtend.isEmpty();
			case SecConPackage.USE_CASE_SCENARIO__OWNED_INCLUDE:
				return ownedInclude != null && !ownedInclude.isEmpty();
			case SecConPackage.USE_CASE_SCENARIO__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case SecConPackage.USE_CASE_SCENARIO__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case SecConPackage.USE_CASE_SCENARIO__OWNED_ACTOR:
				return ownedActor != null && !ownedActor.isEmpty();
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
		result.append(" (author: ");
		result.append(author);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //UseCaseScenarioImpl
