/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.mappingassistance.mappingAssistance;

import com.aelos.xtext.architecture.architecture.Operation;

import com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.Mock#getIntentionVar <em>Intention Var</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.Mock#getService <em>Service</em>}</li>
 *   <li>{@link com.aelos.xtext.mappingassistance.mappingAssistance.Mock#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage#getMock()
 * @model
 * @generated
 */
public interface Mock extends EObject
{
  /**
   * Returns the value of the '<em><b>Intention Var</b></em>' reference list.
   * The list contents are of type {@link com.aelos.xtext.testintentionsassistance.testintentionsAssistance.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intention Var</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intention Var</em>' reference list.
   * @see com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage#getMock_IntentionVar()
   * @model
   * @generated
   */
  EList<Variable> getIntentionVar();

  /**
   * Returns the value of the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' reference.
   * @see #setService(com.aelos.xtext.architecture.architecture.Variable)
   * @see com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage#getMock_Service()
   * @model
   * @generated
   */
  com.aelos.xtext.architecture.architecture.Variable getService();

  /**
   * Sets the value of the '{@link com.aelos.xtext.mappingassistance.mappingAssistance.Mock#getService <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' reference.
   * @see #getService()
   * @generated
   */
  void setService(com.aelos.xtext.architecture.architecture.Variable value);

  /**
   * Returns the value of the '<em><b>Member</b></em>' reference list.
   * The list contents are of type {@link com.aelos.xtext.architecture.architecture.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' reference list.
   * @see com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage#getMock_Member()
   * @model
   * @generated
   */
  EList<Operation> getMember();

} // Mock
