/**
 */
package org.plcopen.xml.tc60201.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.ConnectionPointOut;
import org.plcopen.xml.tc60201.Position;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Point Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConnectionPointOutImpl#getRelPosition <em>Rel Position</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConnectionPointOutImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConnectionPointOutImpl#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConnectionPointOutImpl#getGlobalId <em>Global Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionPointOutImpl extends MinimalEObjectImpl.Container implements ConnectionPointOut {
	/**
	 * The cached value of the '{@link #getRelPosition() <em>Rel Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelPosition()
	 * @generated
	 * @ordered
	 */
	protected Position relPosition;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddData() <em>Add Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddData()
	 * @generated
	 * @ordered
	 */
	protected AddData addData;

	/**
	 * The default value of the '{@link #getGlobalId() <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalId()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalId() <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalId()
	 * @generated
	 * @ordered
	 */
	protected String globalId = GLOBAL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getConnectionPointOut();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getRelPosition() {
		return relPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelPosition(Position newRelPosition, NotificationChain msgs) {
		Position oldRelPosition = relPosition;
		relPosition = newRelPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.CONNECTION_POINT_OUT__REL_POSITION, oldRelPosition, newRelPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelPosition(Position newRelPosition) {
		if (newRelPosition != relPosition) {
			NotificationChain msgs = null;
			if (relPosition != null)
				msgs = ((InternalEObject)relPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONNECTION_POINT_OUT__REL_POSITION, null, msgs);
			if (newRelPosition != null)
				msgs = ((InternalEObject)newRelPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONNECTION_POINT_OUT__REL_POSITION, null, msgs);
			msgs = basicSetRelPosition(newRelPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONNECTION_POINT_OUT__REL_POSITION, newRelPosition, newRelPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONNECTION_POINT_OUT__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddData getAddData() {
		return addData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddData(AddData newAddData, NotificationChain msgs) {
		AddData oldAddData = addData;
		addData = newAddData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.CONNECTION_POINT_OUT__ADD_DATA, oldAddData, newAddData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddData(AddData newAddData) {
		if (newAddData != addData) {
			NotificationChain msgs = null;
			if (addData != null)
				msgs = ((InternalEObject)addData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONNECTION_POINT_OUT__ADD_DATA, null, msgs);
			if (newAddData != null)
				msgs = ((InternalEObject)newAddData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.CONNECTION_POINT_OUT__ADD_DATA, null, msgs);
			msgs = basicSetAddData(newAddData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONNECTION_POINT_OUT__ADD_DATA, newAddData, newAddData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalId() {
		return globalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalId(String newGlobalId) {
		String oldGlobalId = globalId;
		globalId = newGlobalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONNECTION_POINT_OUT__GLOBAL_ID, oldGlobalId, globalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.CONNECTION_POINT_OUT__REL_POSITION:
				return basicSetRelPosition(null, msgs);
			case Tc60201Package.CONNECTION_POINT_OUT__ADD_DATA:
				return basicSetAddData(null, msgs);
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
			case Tc60201Package.CONNECTION_POINT_OUT__REL_POSITION:
				return getRelPosition();
			case Tc60201Package.CONNECTION_POINT_OUT__EXPRESSION:
				return getExpression();
			case Tc60201Package.CONNECTION_POINT_OUT__ADD_DATA:
				return getAddData();
			case Tc60201Package.CONNECTION_POINT_OUT__GLOBAL_ID:
				return getGlobalId();
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
			case Tc60201Package.CONNECTION_POINT_OUT__REL_POSITION:
				setRelPosition((Position)newValue);
				return;
			case Tc60201Package.CONNECTION_POINT_OUT__EXPRESSION:
				setExpression((String)newValue);
				return;
			case Tc60201Package.CONNECTION_POINT_OUT__ADD_DATA:
				setAddData((AddData)newValue);
				return;
			case Tc60201Package.CONNECTION_POINT_OUT__GLOBAL_ID:
				setGlobalId((String)newValue);
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
			case Tc60201Package.CONNECTION_POINT_OUT__REL_POSITION:
				setRelPosition((Position)null);
				return;
			case Tc60201Package.CONNECTION_POINT_OUT__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case Tc60201Package.CONNECTION_POINT_OUT__ADD_DATA:
				setAddData((AddData)null);
				return;
			case Tc60201Package.CONNECTION_POINT_OUT__GLOBAL_ID:
				setGlobalId(GLOBAL_ID_EDEFAULT);
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
			case Tc60201Package.CONNECTION_POINT_OUT__REL_POSITION:
				return relPosition != null;
			case Tc60201Package.CONNECTION_POINT_OUT__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case Tc60201Package.CONNECTION_POINT_OUT__ADD_DATA:
				return addData != null;
			case Tc60201Package.CONNECTION_POINT_OUT__GLOBAL_ID:
				return GLOBAL_ID_EDEFAULT == null ? globalId != null : !GLOBAL_ID_EDEFAULT.equals(globalId);
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(", globalId: ");
		result.append(globalId);
		result.append(')');
		return result.toString();
	}

} //ConnectionPointOutImpl
