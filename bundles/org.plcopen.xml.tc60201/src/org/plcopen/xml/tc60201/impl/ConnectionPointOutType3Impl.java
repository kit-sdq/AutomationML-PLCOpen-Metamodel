/**
 */
package org.plcopen.xml.tc60201.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.plcopen.xml.tc60201.ConnectionPointOutType3;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Point Out Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.ConnectionPointOutType3Impl#getFormalParameter <em>Formal Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionPointOutType3Impl extends ConnectionPointOutImpl implements ConnectionPointOutType3 {
	/**
	 * The default value of the '{@link #getFormalParameter() <em>Formal Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAL_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormalParameter() <em>Formal Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameter()
	 * @generated
	 * @ordered
	 */
	protected String formalParameter = FORMAL_PARAMETER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPointOutType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getConnectionPointOutType3();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormalParameter() {
		return formalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalParameter(String newFormalParameter) {
		String oldFormalParameter = formalParameter;
		formalParameter = newFormalParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.CONNECTION_POINT_OUT_TYPE3__FORMAL_PARAMETER, oldFormalParameter, formalParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE3__FORMAL_PARAMETER:
				return getFormalParameter();
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
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE3__FORMAL_PARAMETER:
				setFormalParameter((String)newValue);
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
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE3__FORMAL_PARAMETER:
				setFormalParameter(FORMAL_PARAMETER_EDEFAULT);
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
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE3__FORMAL_PARAMETER:
				return FORMAL_PARAMETER_EDEFAULT == null ? formalParameter != null : !FORMAL_PARAMETER_EDEFAULT.equals(formalParameter);
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
		result.append(" (formalParameter: ");
		result.append(formalParameter);
		result.append(')');
		return result.toString();
	}

} //ConnectionPointOutType3Impl
