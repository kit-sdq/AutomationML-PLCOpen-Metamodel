/**
 */
package org.plcopen.xml.tc60201;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SFC Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getComment <em>Comment</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getError <em>Error</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getContinuation <em>Continuation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getActionBlock <em>Action Block</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getVendorElement <em>Vendor Element</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getBlock <em>Block</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getInVariable <em>In Variable</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getOutVariable <em>Out Variable</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getInOutVariable <em>In Out Variable</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getLabel <em>Label</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getJump <em>Jump</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getReturn <em>Return</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getLeftPowerRail <em>Left Power Rail</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getRightPowerRail <em>Right Power Rail</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getCoil <em>Coil</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getContact <em>Contact</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getStep <em>Step</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getMacroStep <em>Macro Step</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getJumpStep <em>Jump Step</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getSelectionDivergence <em>Selection Divergence</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getSelectionConvergence <em>Selection Convergence</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getSimultaneousDivergence <em>Simultaneous Divergence</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.SFCType1#getSimultaneousConvergence <em>Simultaneous Convergence</em>}</li>
 * </ul>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1()
 * @model extendedMetaData="name='SFC_._type' kind='elementOnly'"
 * @generated
 */
public interface SFCType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.CommentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_Comment()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CommentType> getComment();

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.ErrorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_Error()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ErrorType> getError();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_Connector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='connector' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ConnectorType> getConnector();

	/**
	 * Returns the value of the '<em><b>Continuation</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.ContinuationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Counterpart of the connector element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Continuation</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_Continuation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='continuation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ContinuationType> getContinuation();

	/**
	 * Returns the value of the '<em><b>Action Block</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.ActionBlockType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Block</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_ActionBlock()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='actionBlock' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ActionBlockType> getActionBlock();

	/**
	 * Returns the value of the '<em><b>Vendor Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.VendorElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Element</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_VendorElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='vendorElement' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<VendorElementType> getVendorElement();

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.BlockType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_Block()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='block' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BlockType> getBlock();

	/**
	 * Returns the value of the '<em><b>In Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.InVariableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expression used as producer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Variable</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_InVariable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inVariable' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<InVariableType> getInVariable();

	/**
	 * Returns the value of the '<em><b>Out Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.OutVariableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expression used as consumer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Variable</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_OutVariable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outVariable' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OutVariableType> getOutVariable();

	/**
	 * Returns the value of the '<em><b>In Out Variable</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.InOutVariableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expression used as producer and consumer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Out Variable</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_InOutVariable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inOutVariable' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<InOutVariableType> getInOutVariable();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.LabelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_Label()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='label' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LabelType> getLabel();

	/**
	 * Returns the value of the '<em><b>Jump</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.JumpType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jump</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jump</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_Jump()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jump' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JumpType> getJump();

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.ReturnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_Return()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='return' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ReturnType> getReturn();

	/**
	 * Returns the value of the '<em><b>Left Power Rail</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.LeftPowerRailType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Power Rail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Power Rail</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_LeftPowerRail()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='leftPowerRail' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LeftPowerRailType> getLeftPowerRail();

	/**
	 * Returns the value of the '<em><b>Right Power Rail</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.RightPowerRailType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Power Rail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Power Rail</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_RightPowerRail()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rightPowerRail' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RightPowerRailType> getRightPowerRail();

	/**
	 * Returns the value of the '<em><b>Coil</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.CoilType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coil</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coil</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_Coil()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coil' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CoilType> getCoil();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.ContactType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_Contact()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ContactType> getContact();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.StepType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single step in a SFC Sequence. Actions are associated with a step by using an actionBlock element with a connection to the step element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_Step()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<StepType> getStep();

	/**
	 * Returns the value of the '<em><b>Macro Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.MacroStepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Macro Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macro Step</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_MacroStep()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='macroStep' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MacroStepType> getMacroStep();

	/**
	 * Returns the value of the '<em><b>Jump Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.JumpStepType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Jump to a step, macro step or simultaneous divergence. Acts like a step. Predecessor should be a transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jump Step</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_JumpStep()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jumpStep' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JumpStepType> getJumpStep();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.TransitionType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_Transition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transition' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TransitionType1> getTransition();

	/**
	 * Returns the value of the '<em><b>Selection Divergence</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.SelectionDivergenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Divergence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Divergence</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_SelectionDivergence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='selectionDivergence' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SelectionDivergenceType> getSelectionDivergence();

	/**
	 * Returns the value of the '<em><b>Selection Convergence</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.SelectionConvergenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection Convergence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Convergence</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_SelectionConvergence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='selectionConvergence' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SelectionConvergenceType> getSelectionConvergence();

	/**
	 * Returns the value of the '<em><b>Simultaneous Divergence</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.SimultaneousDivergenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simultaneous Divergence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simultaneous Divergence</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_SimultaneousDivergence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simultaneousDivergence' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SimultaneousDivergenceType> getSimultaneousDivergence();

	/**
	 * Returns the value of the '<em><b>Simultaneous Convergence</b></em>' containment reference list.
	 * The list contents are of type {@link org.plcopen.xml.tc60201.SimultaneousConvergenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simultaneous Convergence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simultaneous Convergence</em>' containment reference list.
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getSFCType1_SimultaneousConvergence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simultaneousConvergence' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SimultaneousConvergenceType> getSimultaneousConvergence();

} // SFCType1
