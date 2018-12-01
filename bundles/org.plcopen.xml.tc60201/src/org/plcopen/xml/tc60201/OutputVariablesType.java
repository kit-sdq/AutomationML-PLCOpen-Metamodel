/**
 */
package org.plcopen.xml.tc60201;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Variables Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.OutputVariablesType#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getOutputVariablesType()
 * @model extendedMetaData="name='outputVariables_._type' kind='elementOnly'"
 * @generated
 */
public interface OutputVariablesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.VariableType4}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getOutputVariablesType_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VariableType4> getVariable();

} // OutputVariablesType
