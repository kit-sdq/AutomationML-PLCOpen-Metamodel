/**
 */
package org.plcopen.xml.tc60201;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subrange Unsigned Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.SubrangeUnsignedType#getRange <em>Range</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SubrangeUnsignedType#getBaseType <em>Base Type</em>}</li>
 * </ul>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getSubrangeUnsignedType()
 * @model extendedMetaData="name='subrangeUnsigned_._type' kind='elementOnly'"
 * @generated
 */
public interface SubrangeUnsignedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(RangeUnsigned)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSubrangeUnsignedType_Range()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
	RangeUnsigned getRange();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.SubrangeUnsignedType#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(RangeUnsigned value);

	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' containment reference.
	 * @see #setBaseType(DataType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSubrangeUnsignedType_BaseType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='baseType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataType getBaseType();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.SubrangeUnsignedType#getBaseType <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' containment reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(DataType value);

} // SubrangeUnsignedType
