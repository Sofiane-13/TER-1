/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.architecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.architecture.architecture.RequiredService#getNameVarMethode <em>Name Var Methode</em>}</li>
 *   <li>{@link com.aelos.xtext.architecture.architecture.RequiredService#getNameComp <em>Name Comp</em>}</li>
 *   <li>{@link com.aelos.xtext.architecture.architecture.RequiredService#getNameServ <em>Name Serv</em>}</li>
 * </ul>
 *
 * @see com.aelos.xtext.architecture.architecture.ArchitecturePackage#getRequiredService()
 * @model
 * @generated
 */
public interface RequiredService extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Var Methode</b></em>' containment reference list.
   * The list contents are of type {@link com.aelos.xtext.architecture.architecture.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Var Methode</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Var Methode</em>' containment reference list.
   * @see com.aelos.xtext.architecture.architecture.ArchitecturePackage#getRequiredService_NameVarMethode()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getNameVarMethode();

  /**
   * Returns the value of the '<em><b>Name Comp</b></em>' reference list.
   * The list contents are of type {@link com.aelos.xtext.architecture.architecture.InstanceComp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Comp</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Comp</em>' reference list.
   * @see com.aelos.xtext.architecture.architecture.ArchitecturePackage#getRequiredService_NameComp()
   * @model
   * @generated
   */
  EList<InstanceComp> getNameComp();

  /**
   * Returns the value of the '<em><b>Name Serv</b></em>' reference list.
   * The list contents are of type {@link com.aelos.xtext.architecture.architecture.ServiceName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Serv</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Serv</em>' reference list.
   * @see com.aelos.xtext.architecture.architecture.ArchitecturePackage#getRequiredService_NameServ()
   * @model
   * @generated
   */
  EList<ServiceName> getNameServ();

} // RequiredService
