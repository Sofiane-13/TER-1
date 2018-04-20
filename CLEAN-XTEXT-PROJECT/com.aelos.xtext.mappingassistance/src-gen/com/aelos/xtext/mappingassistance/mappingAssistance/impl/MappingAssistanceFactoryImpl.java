/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.mappingassistance.mappingAssistance.impl;

import com.aelos.xtext.mappingassistance.mappingAssistance.AbstractModel;
import com.aelos.xtext.mappingassistance.mappingAssistance.Atomic;
import com.aelos.xtext.mappingassistance.mappingAssistance.Bindings;
import com.aelos.xtext.mappingassistance.mappingAssistance.Call;
import com.aelos.xtext.mappingassistance.mappingAssistance.Comopnent;
import com.aelos.xtext.mappingassistance.mappingAssistance.INT;
import com.aelos.xtext.mappingassistance.mappingAssistance.Import;
import com.aelos.xtext.mappingassistance.mappingAssistance.InstanceComp;
import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistanceFactory;
import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage;
import com.aelos.xtext.mappingassistance.mappingAssistance.Mock;
import com.aelos.xtext.mappingassistance.mappingAssistance.Model;
import com.aelos.xtext.mappingassistance.mappingAssistance.Observer;
import com.aelos.xtext.mappingassistance.mappingAssistance.Operation;
import com.aelos.xtext.mappingassistance.mappingAssistance.ReplaceConf;
import com.aelos.xtext.mappingassistance.mappingAssistance.STRING;
import com.aelos.xtext.mappingassistance.mappingAssistance.TestDriver;
import com.aelos.xtext.mappingassistance.mappingAssistance.TestOP;
import com.aelos.xtext.mappingassistance.mappingAssistance.Type;
import com.aelos.xtext.mappingassistance.mappingAssistance.Variable;
import com.aelos.xtext.mappingassistance.mappingAssistance.VariableRef;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingAssistanceFactoryImpl extends EFactoryImpl implements MappingAssistanceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MappingAssistanceFactory init()
  {
    try
    {
      MappingAssistanceFactory theMappingAssistanceFactory = (MappingAssistanceFactory)EPackage.Registry.INSTANCE.getEFactory(MappingAssistancePackage.eNS_URI);
      if (theMappingAssistanceFactory != null)
      {
        return theMappingAssistanceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MappingAssistanceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingAssistanceFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MappingAssistancePackage.MODEL: return createModel();
      case MappingAssistancePackage.ABSTRACT_MODEL: return createAbstractModel();
      case MappingAssistancePackage.IMPORT: return createImport();
      case MappingAssistancePackage.TEST_DRIVER: return createTestDriver();
      case MappingAssistancePackage.OBSERVER: return createObserver();
      case MappingAssistancePackage.MOCK: return createMock();
      case MappingAssistancePackage.REPLACE_CONF: return createReplaceConf();
      case MappingAssistancePackage.ATOMIC: return createAtomic();
      case MappingAssistancePackage.COMOPNENT: return createComopnent();
      case MappingAssistancePackage.TEST_OP: return createTestOP();
      case MappingAssistancePackage.OPERATION: return createOperation();
      case MappingAssistancePackage.VARIABLE: return createVariable();
      case MappingAssistancePackage.BINDINGS: return createBindings();
      case MappingAssistancePackage.INSTANCE_COMP: return createInstanceComp();
      case MappingAssistancePackage.CALL: return createCall();
      case MappingAssistancePackage.INT: return createINT();
      case MappingAssistancePackage.STRING: return createSTRING();
      case MappingAssistancePackage.BOOLEAN: return createBoolean();
      case MappingAssistancePackage.DOUBLE: return createDouble();
      case MappingAssistancePackage.VARIABLE_REF: return createVariableRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MappingAssistancePackage.TYPE:
        return createTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MappingAssistancePackage.TYPE:
        return convertTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractModel createAbstractModel()
  {
    AbstractModelImpl abstractModel = new AbstractModelImpl();
    return abstractModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestDriver createTestDriver()
  {
    TestDriverImpl testDriver = new TestDriverImpl();
    return testDriver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observer createObserver()
  {
    ObserverImpl observer = new ObserverImpl();
    return observer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mock createMock()
  {
    MockImpl mock = new MockImpl();
    return mock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReplaceConf createReplaceConf()
  {
    ReplaceConfImpl replaceConf = new ReplaceConfImpl();
    return replaceConf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atomic createAtomic()
  {
    AtomicImpl atomic = new AtomicImpl();
    return atomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comopnent createComopnent()
  {
    ComopnentImpl comopnent = new ComopnentImpl();
    return comopnent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestOP createTestOP()
  {
    TestOPImpl testOP = new TestOPImpl();
    return testOP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bindings createBindings()
  {
    BindingsImpl bindings = new BindingsImpl();
    return bindings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceComp createInstanceComp()
  {
    InstanceCompImpl instanceComp = new InstanceCompImpl();
    return instanceComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INT createINT()
  {
    INTImpl int_ = new INTImpl();
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRING createSTRING()
  {
    STRINGImpl string = new STRINGImpl();
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.aelos.xtext.mappingassistance.mappingAssistance.Boolean createBoolean()
  {
    BooleanImpl boolean_ = new BooleanImpl();
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.aelos.xtext.mappingassistance.mappingAssistance.Double createDouble()
  {
    DoubleImpl double_ = new DoubleImpl();
    return double_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableRef createVariableRef()
  {
    VariableRefImpl variableRef = new VariableRefImpl();
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createTypeFromString(EDataType eDataType, String initialValue)
  {
    Type result = Type.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingAssistancePackage getMappingAssistancePackage()
  {
    return (MappingAssistancePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MappingAssistancePackage getPackage()
  {
    return MappingAssistancePackage.eINSTANCE;
  }

} //MappingAssistanceFactoryImpl
