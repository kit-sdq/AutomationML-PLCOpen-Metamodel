/**
 */
package org.plcopen.xml.tc60201.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.plcopen.xml.tc60201.DataType;
import org.plcopen.xml.tc60201.RangeUnsigned;
import org.plcopen.xml.tc60201.SubrangeUnsignedType;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subrange Unsigned Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.SubrangeUnsignedTypeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.SubrangeUnsignedTypeImpl#getBaseType <em>Base Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubrangeUnsignedTypeImpl extends MinimalEObjectImpl.Container implements SubrangeUnsignedType {
	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected RangeUnsigned range;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected DataType baseType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubrangeUnsignedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getSubrangeUnsignedType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeUnsigned getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(RangeUnsigned newRange, NotificationChain msgs) {
		RangeUnsigned oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.SUBRANGE_UNSIGNED_TYPE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(RangeUnsigned newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.SUBRANGE_UNSIGNED_TYPE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.SUBRANGE_UNSIGNED_TYPE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.SUBRANGE_UNSIGNED_TYPE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseType(DataType newBaseType, NotificationChain msgs) {
		DataType oldBaseType = baseType;
		baseType = newBaseType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.SUBRANGE_UNSIGNED_TYPE__BASE_TYPE, oldBaseType, newBaseType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseType(DataType newBaseType) {
		if (newBaseType != baseType) {
			NotificationChain msgs = null;
			if (baseType != null)
				msgs = ((InternalEObject)baseType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.SUBRANGE_UNSIGNED_TYPE__BASE_TYPE, null, msgs);
			if (newBaseType != null)
				msgs = ((InternalEObject)newBaseType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.SUBRANGE_UNSIGNED_TYPE__BASE_TYPE, null, msgs);
			msgs = basicSetBaseType(newBaseType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.SUBRANGE_UNSIGNED_TYPE__BASE_TYPE, newBaseType, newBaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.SUBRANGE_UNSIGNED_TYPE__RANGE:
				return basicSetRange(null, msgs);
			case Tc60201Package.SUBRANGE_UNSIGNED_TYPE__BASE_TYPE:
				return basicSetBaseType(null, msgs);
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
			case Tc60201Package.SUBRANGE_UNSIGNED_TYPE__RANGE:
				return getRange();
			case Tc60201Package.SUBRANGE_UNSIGNED_TYPE__BASE_TYPE:
				return getBaseType();
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
			case Tc60201Package.SUBRANGE_UNSIGNED_TYPE__RANGE:
				setRange((RangeUnsigned)newValue);
				return;
			case Tc60201Package.SUBRANGE_UNSIGNED_TYPE__BASE_TYPE:
				setBaseType((DataType)newValue);
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
			case Tc60201Package.SUBRANGE_UNSIGNED_TYPE__RANGE:
				setRange((RangeUnsigned)null);
				return;
			case Tc60201Package.SUBRANGE_UNSIGNED_TYPE__BASE_TYPE:
				setBaseType((DataType)null);
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
			case Tc60201Package.SUBRANGE_UNSIGNED_TYPE__RANGE:
				return range != null;
			case Tc60201Package.SUBRANGE_UNSIGNED_TYPE__BASE_TYPE:
				return baseType != null;
		}
		return super.eIsSet(featureID);
	}

} //SubrangeUnsignedTypeImpl
