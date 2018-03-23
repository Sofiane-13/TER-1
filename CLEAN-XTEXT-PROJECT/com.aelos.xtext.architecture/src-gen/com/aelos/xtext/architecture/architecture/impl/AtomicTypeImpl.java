/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.architecture.impl;

import com.aelos.xtext.architecture.architecture.ArchitecturePackage;
import com.aelos.xtext.architecture.architecture.AtomicType;
import com.aelos.xtext.architecture.architecture.Component;
import com.aelos.xtext.architecture.architecture.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.architecture.architecture.impl.AtomicTypeImpl#getAtomType <em>Atom Type</em>}</li>
 *   <li>{@link com.aelos.xtext.architecture.architecture.impl.AtomicTypeImpl#getCompType <em>Comp Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicTypeImpl extends MinimalEObjectImpl.Container implements AtomicType
{
  /**
   * The default value of the '{@link #getAtomType() <em>Atom Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomType()
   * @generated
   * @ordered
   */
  protected static final Type ATOM_TYPE_EDEFAULT = Type.INT;

  /**
   * The cached value of the '{@link #getAtomType() <em>Atom Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomType()
   * @generated
   * @ordered
   */
  protected Type atomType = ATOM_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCompType() <em>Comp Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompType()
   * @generated
   * @ordered
   */
  protected Component compType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ArchitecturePackage.Literals.ATOMIC_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getAtomType()
  {
    return atomType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtomType(Type newAtomType)
  {
    Type oldAtomType = atomType;
    atomType = newAtomType == null ? ATOM_TYPE_EDEFAULT : newAtomType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ATOMIC_TYPE__ATOM_TYPE, oldAtomType, atomType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getCompType()
  {
    if (compType != null && compType.eIsProxy())
    {
      InternalEObject oldCompType = (InternalEObject)compType;
      compType = (Component)eResolveProxy(oldCompType);
      if (compType != oldCompType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.ATOMIC_TYPE__COMP_TYPE, oldCompType, compType));
      }
    }
    return compType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetCompType()
  {
    return compType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompType(Component newCompType)
  {
    Component oldCompType = compType;
    compType = newCompType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ATOMIC_TYPE__COMP_TYPE, oldCompType, compType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ArchitecturePackage.ATOMIC_TYPE__ATOM_TYPE:
        return getAtomType();
      case ArchitecturePackage.ATOMIC_TYPE__COMP_TYPE:
        if (resolve) return getCompType();
        return basicGetCompType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArchitecturePackage.ATOMIC_TYPE__ATOM_TYPE:
        setAtomType((Type)newValue);
        return;
      case ArchitecturePackage.ATOMIC_TYPE__COMP_TYPE:
        setCompType((Component)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ArchitecturePackage.ATOMIC_TYPE__ATOM_TYPE:
        setAtomType(ATOM_TYPE_EDEFAULT);
        return;
      case ArchitecturePackage.ATOMIC_TYPE__COMP_TYPE:
        setCompType((Component)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ArchitecturePackage.ATOMIC_TYPE__ATOM_TYPE:
        return atomType != ATOM_TYPE_EDEFAULT;
      case ArchitecturePackage.ATOMIC_TYPE__COMP_TYPE:
        return compType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (atomType: ");
    result.append(atomType);
    result.append(')');
    return result.toString();
  }

} //AtomicTypeImpl
