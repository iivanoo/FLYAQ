/**
 */
package it.univaq.flyaq.mission.impl;

import it.univaq.flyaq.mission.Mission;
import it.univaq.flyaq.mission.MissionPackage;
import it.univaq.flyaq.mission.Swarm;
import it.univaq.flyaq.mission.Task;
import it.univaq.flyaq.mission.TaskDependency;

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
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.flyaq.mission.impl.MissionImpl#getCrs <em>Crs</em>}</li>
 *   <li>{@link it.univaq.flyaq.mission.impl.MissionImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link it.univaq.flyaq.mission.impl.MissionImpl#getTaskDependencies <em>Task Dependencies</em>}</li>
 *   <li>{@link it.univaq.flyaq.mission.impl.MissionImpl#getSwarm <em>Swarm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MissionImpl extends NamedElementImpl implements Mission {
	/**
	 * The default value of the '{@link #getCrs() <em>Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrs()
	 * @generated
	 * @ordered
	 */
	protected static final String CRS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrs() <em>Crs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrs()
	 * @generated
	 * @ordered
	 */
	protected String crs = CRS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getTaskDependencies() <em>Task Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskDependency> taskDependencies;

	/**
	 * The cached value of the '{@link #getSwarm() <em>Swarm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwarm()
	 * @generated
	 * @ordered
	 */
	protected Swarm swarm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MissionPackage.Literals.MISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCrs() {
		return crs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrs(String newCrs) {
		String oldCrs = crs;
		crs = newCrs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MissionPackage.MISSION__CRS, oldCrs, crs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, MissionPackage.MISSION__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskDependency> getTaskDependencies() {
		if (taskDependencies == null) {
			taskDependencies = new EObjectContainmentEList<TaskDependency>(TaskDependency.class, this, MissionPackage.MISSION__TASK_DEPENDENCIES);
		}
		return taskDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swarm getSwarm() {
		return swarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwarm(Swarm newSwarm, NotificationChain msgs) {
		Swarm oldSwarm = swarm;
		swarm = newSwarm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MissionPackage.MISSION__SWARM, oldSwarm, newSwarm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwarm(Swarm newSwarm) {
		if (newSwarm != swarm) {
			NotificationChain msgs = null;
			if (swarm != null)
				msgs = ((InternalEObject)swarm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MissionPackage.MISSION__SWARM, null, msgs);
			if (newSwarm != null)
				msgs = ((InternalEObject)newSwarm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MissionPackage.MISSION__SWARM, null, msgs);
			msgs = basicSetSwarm(newSwarm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MissionPackage.MISSION__SWARM, newSwarm, newSwarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MissionPackage.MISSION__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case MissionPackage.MISSION__TASK_DEPENDENCIES:
				return ((InternalEList<?>)getTaskDependencies()).basicRemove(otherEnd, msgs);
			case MissionPackage.MISSION__SWARM:
				return basicSetSwarm(null, msgs);
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
			case MissionPackage.MISSION__CRS:
				return getCrs();
			case MissionPackage.MISSION__TASKS:
				return getTasks();
			case MissionPackage.MISSION__TASK_DEPENDENCIES:
				return getTaskDependencies();
			case MissionPackage.MISSION__SWARM:
				return getSwarm();
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
			case MissionPackage.MISSION__CRS:
				setCrs((String)newValue);
				return;
			case MissionPackage.MISSION__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case MissionPackage.MISSION__TASK_DEPENDENCIES:
				getTaskDependencies().clear();
				getTaskDependencies().addAll((Collection<? extends TaskDependency>)newValue);
				return;
			case MissionPackage.MISSION__SWARM:
				setSwarm((Swarm)newValue);
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
			case MissionPackage.MISSION__CRS:
				setCrs(CRS_EDEFAULT);
				return;
			case MissionPackage.MISSION__TASKS:
				getTasks().clear();
				return;
			case MissionPackage.MISSION__TASK_DEPENDENCIES:
				getTaskDependencies().clear();
				return;
			case MissionPackage.MISSION__SWARM:
				setSwarm((Swarm)null);
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
			case MissionPackage.MISSION__CRS:
				return CRS_EDEFAULT == null ? crs != null : !CRS_EDEFAULT.equals(crs);
			case MissionPackage.MISSION__TASKS:
				return tasks != null && !tasks.isEmpty();
			case MissionPackage.MISSION__TASK_DEPENDENCIES:
				return taskDependencies != null && !taskDependencies.isEmpty();
			case MissionPackage.MISSION__SWARM:
				return swarm != null;
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
		result.append(" (crs: ");
		result.append(crs);
		result.append(')');
		return result.toString();
	}

} //MissionImpl
