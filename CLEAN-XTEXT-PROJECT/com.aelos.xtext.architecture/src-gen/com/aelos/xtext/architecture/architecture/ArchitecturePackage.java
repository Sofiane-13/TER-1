/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.architecture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.aelos.xtext.architecture.architecture.ArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "architecture";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.aelos.com/xtext/architecture/Architecture";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "architecture";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArchitecturePackage eINSTANCE = com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl.init();

  /**
   * The meta object id for the '{@link com.aelos.xtext.architecture.architecture.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.aelos.xtext.architecture.architecture.impl.ModelImpl
   * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FUNCTION = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.aelos.xtext.architecture.architecture.impl.AbstractModelImpl <em>Abstract Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.aelos.xtext.architecture.architecture.impl.AbstractModelImpl
   * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getAbstractModel()
   * @generated
   */
  int ABSTRACT_MODEL = 1;

  /**
   * The feature id for the '<em><b>Comp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_MODEL__COMP = 0;

  /**
   * The number of structural features of the '<em>Abstract Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.aelos.xtext.architecture.architecture.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.aelos.xtext.architecture.architecture.impl.ImportImpl
   * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Comp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__COMP = ABSTRACT_MODEL__COMP;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = ABSTRACT_MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = ABSTRACT_MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.aelos.xtext.architecture.architecture.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.aelos.xtext.architecture.architecture.impl.ComponentImpl
   * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 3;

  /**
   * The feature id for the '<em><b>Inst</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__INST = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__ARG = 2;

  /**
   * The feature id for the '<em><b>Arg1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__ARG1 = 3;

  /**
   * The feature id for the '<em><b>Methode</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__METHODE = 4;

  /**
   * The feature id for the '<em><b>Req</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__REQ = 5;

  /**
   * The feature id for the '<em><b>Bind</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__BIND = 6;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.aelos.xtext.architecture.architecture.impl.InstanceCompImpl <em>Instance Comp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.aelos.xtext.architecture.architecture.impl.InstanceCompImpl
   * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getInstanceComp()
   * @generated
   */
  int INSTANCE_COMP = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_COMP__NAME = 0;

  /**
   * The number of structural features of the '<em>Instance Comp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_COMP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.aelos.xtext.architecture.architecture.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.aelos.xtext.architecture.architecture.impl.VariableImpl
   * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.aelos.xtext.architecture.architecture.impl.BindingsImpl <em>Bindings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.aelos.xtext.architecture.architecture.impl.BindingsImpl
   * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getBindings()
   * @generated
   */
  int BINDINGS = 6;

  /**
   * The feature id for the '<em><b>Name Comp</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDINGS__NAME_COMP = 0;

  /**
   * The feature id for the '<em><b>Name Serv1</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDINGS__NAME_SERV1 = 1;

  /**
   * The feature id for the '<em><b>Name Serv2</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDINGS__NAME_SERV2 = 2;

  /**
   * The number of structural features of the '<em>Bindings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDINGS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.aelos.xtext.architecture.architecture.impl.RequiredServiceImpl <em>Required Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.aelos.xtext.architecture.architecture.impl.RequiredServiceImpl
   * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getRequiredService()
   * @generated
   */
  int REQUIRED_SERVICE = 7;

  /**
   * The feature id for the '<em><b>Name Var Methode</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__NAME_VAR_METHODE = 0;

  /**
   * The feature id for the '<em><b>Name Comp</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__NAME_COMP = 1;

  /**
   * The feature id for the '<em><b>Name Serv</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE__NAME_SERV = 2;

  /**
   * The number of structural features of the '<em>Required Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_SERVICE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.aelos.xtext.architecture.architecture.impl.ServiceNameImpl <em>Service Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.aelos.xtext.architecture.architecture.impl.ServiceNameImpl
   * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getServiceName()
   * @generated
   */
  int SERVICE_NAME = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Service Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.aelos.xtext.architecture.architecture.Type <em>Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.aelos.xtext.architecture.architecture.Type
   * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getType()
   * @generated
   */
  int TYPE = 9;


  /**
   * Returns the meta object for class '{@link com.aelos.xtext.architecture.architecture.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.aelos.xtext.architecture.architecture.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.aelos.xtext.architecture.architecture.Model#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function</em>'.
   * @see com.aelos.xtext.architecture.architecture.Model#getFunction()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Function();

  /**
   * Returns the meta object for class '{@link com.aelos.xtext.architecture.architecture.AbstractModel <em>Abstract Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Model</em>'.
   * @see com.aelos.xtext.architecture.architecture.AbstractModel
   * @generated
   */
  EClass getAbstractModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.aelos.xtext.architecture.architecture.AbstractModel#getComp <em>Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comp</em>'.
   * @see com.aelos.xtext.architecture.architecture.AbstractModel#getComp()
   * @see #getAbstractModel()
   * @generated
   */
  EReference getAbstractModel_Comp();

  /**
   * Returns the meta object for class '{@link com.aelos.xtext.architecture.architecture.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.aelos.xtext.architecture.architecture.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link com.aelos.xtext.architecture.architecture.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see com.aelos.xtext.architecture.architecture.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link com.aelos.xtext.architecture.architecture.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see com.aelos.xtext.architecture.architecture.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the containment reference list '{@link com.aelos.xtext.architecture.architecture.Component#getInst <em>Inst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inst</em>'.
   * @see com.aelos.xtext.architecture.architecture.Component#getInst()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Inst();

  /**
   * Returns the meta object for the attribute '{@link com.aelos.xtext.architecture.architecture.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.aelos.xtext.architecture.architecture.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.aelos.xtext.architecture.architecture.Component#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arg</em>'.
   * @see com.aelos.xtext.architecture.architecture.Component#getArg()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link com.aelos.xtext.architecture.architecture.Component#getArg1 <em>Arg1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arg1</em>'.
   * @see com.aelos.xtext.architecture.architecture.Component#getArg1()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Arg1();

  /**
   * Returns the meta object for the containment reference list '{@link com.aelos.xtext.architecture.architecture.Component#getMethode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methode</em>'.
   * @see com.aelos.xtext.architecture.architecture.Component#getMethode()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Methode();

  /**
   * Returns the meta object for the containment reference list '{@link com.aelos.xtext.architecture.architecture.Component#getReq <em>Req</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Req</em>'.
   * @see com.aelos.xtext.architecture.architecture.Component#getReq()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Req();

  /**
   * Returns the meta object for the containment reference list '{@link com.aelos.xtext.architecture.architecture.Component#getBind <em>Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bind</em>'.
   * @see com.aelos.xtext.architecture.architecture.Component#getBind()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Bind();

  /**
   * Returns the meta object for class '{@link com.aelos.xtext.architecture.architecture.InstanceComp <em>Instance Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Comp</em>'.
   * @see com.aelos.xtext.architecture.architecture.InstanceComp
   * @generated
   */
  EClass getInstanceComp();

  /**
   * Returns the meta object for the attribute '{@link com.aelos.xtext.architecture.architecture.InstanceComp#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.aelos.xtext.architecture.architecture.InstanceComp#getName()
   * @see #getInstanceComp()
   * @generated
   */
  EAttribute getInstanceComp_Name();

  /**
   * Returns the meta object for class '{@link com.aelos.xtext.architecture.architecture.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see com.aelos.xtext.architecture.architecture.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link com.aelos.xtext.architecture.architecture.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.aelos.xtext.architecture.architecture.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link com.aelos.xtext.architecture.architecture.Variable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.aelos.xtext.architecture.architecture.Variable#getType()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Type();

  /**
   * Returns the meta object for class '{@link com.aelos.xtext.architecture.architecture.Bindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bindings</em>'.
   * @see com.aelos.xtext.architecture.architecture.Bindings
   * @generated
   */
  EClass getBindings();

  /**
   * Returns the meta object for the reference list '{@link com.aelos.xtext.architecture.architecture.Bindings#getNameComp <em>Name Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Name Comp</em>'.
   * @see com.aelos.xtext.architecture.architecture.Bindings#getNameComp()
   * @see #getBindings()
   * @generated
   */
  EReference getBindings_NameComp();

  /**
   * Returns the meta object for the reference list '{@link com.aelos.xtext.architecture.architecture.Bindings#getNameServ1 <em>Name Serv1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Name Serv1</em>'.
   * @see com.aelos.xtext.architecture.architecture.Bindings#getNameServ1()
   * @see #getBindings()
   * @generated
   */
  EReference getBindings_NameServ1();

  /**
   * Returns the meta object for the reference list '{@link com.aelos.xtext.architecture.architecture.Bindings#getNameServ2 <em>Name Serv2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Name Serv2</em>'.
   * @see com.aelos.xtext.architecture.architecture.Bindings#getNameServ2()
   * @see #getBindings()
   * @generated
   */
  EReference getBindings_NameServ2();

  /**
   * Returns the meta object for class '{@link com.aelos.xtext.architecture.architecture.RequiredService <em>Required Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Service</em>'.
   * @see com.aelos.xtext.architecture.architecture.RequiredService
   * @generated
   */
  EClass getRequiredService();

  /**
   * Returns the meta object for the containment reference list '{@link com.aelos.xtext.architecture.architecture.RequiredService#getNameVarMethode <em>Name Var Methode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name Var Methode</em>'.
   * @see com.aelos.xtext.architecture.architecture.RequiredService#getNameVarMethode()
   * @see #getRequiredService()
   * @generated
   */
  EReference getRequiredService_NameVarMethode();

  /**
   * Returns the meta object for the reference list '{@link com.aelos.xtext.architecture.architecture.RequiredService#getNameComp <em>Name Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Name Comp</em>'.
   * @see com.aelos.xtext.architecture.architecture.RequiredService#getNameComp()
   * @see #getRequiredService()
   * @generated
   */
  EReference getRequiredService_NameComp();

  /**
   * Returns the meta object for the reference list '{@link com.aelos.xtext.architecture.architecture.RequiredService#getNameServ <em>Name Serv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Name Serv</em>'.
   * @see com.aelos.xtext.architecture.architecture.RequiredService#getNameServ()
   * @see #getRequiredService()
   * @generated
   */
  EReference getRequiredService_NameServ();

  /**
   * Returns the meta object for class '{@link com.aelos.xtext.architecture.architecture.ServiceName <em>Service Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Name</em>'.
   * @see com.aelos.xtext.architecture.architecture.ServiceName
   * @generated
   */
  EClass getServiceName();

  /**
   * Returns the meta object for the attribute '{@link com.aelos.xtext.architecture.architecture.ServiceName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.aelos.xtext.architecture.architecture.ServiceName#getName()
   * @see #getServiceName()
   * @generated
   */
  EAttribute getServiceName_Name();

  /**
   * Returns the meta object for enum '{@link com.aelos.xtext.architecture.architecture.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type</em>'.
   * @see com.aelos.xtext.architecture.architecture.Type
   * @generated
   */
  EEnum getType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArchitectureFactory getArchitectureFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.aelos.xtext.architecture.architecture.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.aelos.xtext.architecture.architecture.impl.ModelImpl
     * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FUNCTION = eINSTANCE.getModel_Function();

    /**
     * The meta object literal for the '{@link com.aelos.xtext.architecture.architecture.impl.AbstractModelImpl <em>Abstract Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.aelos.xtext.architecture.architecture.impl.AbstractModelImpl
     * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getAbstractModel()
     * @generated
     */
    EClass ABSTRACT_MODEL = eINSTANCE.getAbstractModel();

    /**
     * The meta object literal for the '<em><b>Comp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_MODEL__COMP = eINSTANCE.getAbstractModel_Comp();

    /**
     * The meta object literal for the '{@link com.aelos.xtext.architecture.architecture.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.aelos.xtext.architecture.architecture.impl.ImportImpl
     * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link com.aelos.xtext.architecture.architecture.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.aelos.xtext.architecture.architecture.impl.ComponentImpl
     * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Inst</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__INST = eINSTANCE.getComponent_Inst();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__ARG = eINSTANCE.getComponent_Arg();

    /**
     * The meta object literal for the '<em><b>Arg1</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__ARG1 = eINSTANCE.getComponent_Arg1();

    /**
     * The meta object literal for the '<em><b>Methode</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__METHODE = eINSTANCE.getComponent_Methode();

    /**
     * The meta object literal for the '<em><b>Req</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__REQ = eINSTANCE.getComponent_Req();

    /**
     * The meta object literal for the '<em><b>Bind</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__BIND = eINSTANCE.getComponent_Bind();

    /**
     * The meta object literal for the '{@link com.aelos.xtext.architecture.architecture.impl.InstanceCompImpl <em>Instance Comp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.aelos.xtext.architecture.architecture.impl.InstanceCompImpl
     * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getInstanceComp()
     * @generated
     */
    EClass INSTANCE_COMP = eINSTANCE.getInstanceComp();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE_COMP__NAME = eINSTANCE.getInstanceComp_Name();

    /**
     * The meta object literal for the '{@link com.aelos.xtext.architecture.architecture.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.aelos.xtext.architecture.architecture.impl.VariableImpl
     * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

    /**
     * The meta object literal for the '{@link com.aelos.xtext.architecture.architecture.impl.BindingsImpl <em>Bindings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.aelos.xtext.architecture.architecture.impl.BindingsImpl
     * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getBindings()
     * @generated
     */
    EClass BINDINGS = eINSTANCE.getBindings();

    /**
     * The meta object literal for the '<em><b>Name Comp</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDINGS__NAME_COMP = eINSTANCE.getBindings_NameComp();

    /**
     * The meta object literal for the '<em><b>Name Serv1</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDINGS__NAME_SERV1 = eINSTANCE.getBindings_NameServ1();

    /**
     * The meta object literal for the '<em><b>Name Serv2</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDINGS__NAME_SERV2 = eINSTANCE.getBindings_NameServ2();

    /**
     * The meta object literal for the '{@link com.aelos.xtext.architecture.architecture.impl.RequiredServiceImpl <em>Required Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.aelos.xtext.architecture.architecture.impl.RequiredServiceImpl
     * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getRequiredService()
     * @generated
     */
    EClass REQUIRED_SERVICE = eINSTANCE.getRequiredService();

    /**
     * The meta object literal for the '<em><b>Name Var Methode</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_SERVICE__NAME_VAR_METHODE = eINSTANCE.getRequiredService_NameVarMethode();

    /**
     * The meta object literal for the '<em><b>Name Comp</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_SERVICE__NAME_COMP = eINSTANCE.getRequiredService_NameComp();

    /**
     * The meta object literal for the '<em><b>Name Serv</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRED_SERVICE__NAME_SERV = eINSTANCE.getRequiredService_NameServ();

    /**
     * The meta object literal for the '{@link com.aelos.xtext.architecture.architecture.impl.ServiceNameImpl <em>Service Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.aelos.xtext.architecture.architecture.impl.ServiceNameImpl
     * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getServiceName()
     * @generated
     */
    EClass SERVICE_NAME = eINSTANCE.getServiceName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_NAME__NAME = eINSTANCE.getServiceName_Name();

    /**
     * The meta object literal for the '{@link com.aelos.xtext.architecture.architecture.Type <em>Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.aelos.xtext.architecture.architecture.Type
     * @see com.aelos.xtext.architecture.architecture.impl.ArchitecturePackageImpl#getType()
     * @generated
     */
    EEnum TYPE = eINSTANCE.getType();

  }

} //ArchitecturePackage
