/**
 */
package org.plcopen.xml.tc60201;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a periodic or triggered task
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.TaskType#getPouInstance <em>Pou Instance</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.TaskType#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.TaskType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.TaskType#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.TaskType#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.TaskType#getName <em>Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.TaskType#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.TaskType#getSingle <em>Single</em>}</li>
 * </ul>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getTaskType()
 * @model extendedMetaData="name='task_._type' kind='elementOnly'"
 * @generated
 */
public interface TaskType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pou Instance</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.PouInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pou Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pou Instance</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getTaskType_PouInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pouInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PouInstance> getPouInstance();

	/**
	 * Returns the value of the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Data</em>' containment reference.
	 * @see #setAddData(AddData)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getTaskType_AddData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.TaskType#getAddData <em>Add Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Data</em>' containment reference.
	 * @see #getAddData()
	 * @generated
	 */
	void setAddData(AddData value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional userspecific information to the element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(FormattedText)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getTaskType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDocumentation();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.TaskType#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(FormattedText value);

	/**
	 * Returns the value of the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Id</em>' attribute.
	 * @see #setGlobalId(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getTaskType_GlobalId()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='globalId'"
	 * @generated
	 */
	String getGlobalId();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.TaskType#getGlobalId <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Id</em>' attribute.
	 * @see #getGlobalId()
	 * @generated
	 */
	void setGlobalId(String value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vendor specific: Either a constant duration as defined in the IEC or variable name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getTaskType_Interval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='interval'"
	 * @generated
	 */
	String getInterval();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.TaskType#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getTaskType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.TaskType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(BigInteger)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getTaskType_Priority()
	 * @model dataType="org.plcopen.xml.tc60201.PriorityType" required="true"
	 *        extendedMetaData="kind='attribute' name='priority'"
	 * @generated
	 */
	BigInteger getPriority();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.TaskType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single</em>' attribute.
	 * @see #setSingle(String)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getTaskType_Single()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='single'"
	 * @generated
	 */
	String getSingle();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.TaskType#getSingle <em>Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single</em>' attribute.
	 * @see #getSingle()
	 * @generated
	 */
	void setSingle(String value);

} // TaskType
