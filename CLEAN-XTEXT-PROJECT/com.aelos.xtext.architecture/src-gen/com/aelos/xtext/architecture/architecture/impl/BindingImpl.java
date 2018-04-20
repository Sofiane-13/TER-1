/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.architecture.impl;

import com.aelos.xtext.architecture.architecture.ArchitecturePackage;
import com.aelos.xtext.architecture.architecture.Binding;
import com.aelos.xtext.architecture.architecture.Operation;
import com.aelos.xtext.architecture.architecture.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.aelos.xtext.architecture.architecture.impl.BindingImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link com.aelos.xtext.architecture.architecture.impl.BindingImpl#getRecMember <em>Rec Member</em>}</li>
 *   <li>{@link com.aelos.xtext.architecture.architecture.impl.BindingImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link com.aelos.xtext.architecture.architecture.impl.BindingImpl#getProMember <em>Pro Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding
{
  /**
   * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiver()
   * @generated
   * @ordered
   */
  protected Variable receiver;

  /**
   * The cached value of the '{@link #getRecMember() <em>Rec Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecMember()
   * @generated
   * @ordered
   */
  protected Operation recMember;

  /**
   * The cached value of the '{@link #getProvider() <em>Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvider()
   * @generated
   * @ordered
   */
  protected Variable provider;

  /**
   * The cached value of the '{@link #getProMember() <em>Pro Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProMember()
   * @generated
   * @ordered
   */
  protected Operation proMember;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingImpl()
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
    return ArchitecturePackage.Literals.BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getReceiver()
  {
    if (receiver != null && receiver.eIsProxy())
    {
      InternalEObject oldReceiver = (InternalEObject)receiver;
      receiver = (Variable)eResolveProxy(oldReceiver);
      if (receiver != oldReceiver)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.BINDING__RECEIVER, oldReceiver, receiver));
      }
    }
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetReceiver()
  {
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiver(Variable newReceiver)
  {
    Variable oldReceiver = receiver;
    receiver = newReceiver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.BINDING__RECEIVER, oldReceiver, receiver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getRecMember()
  {
    if (recMember != null && recMember.eIsProxy())
    {
      InternalEObject oldRecMember = (InternalEObject)recMember;
      recMember = (Operation)eResolveProxy(oldRecMember);
      if (recMember != oldRecMember)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.BINDING__REC_MEMBER, oldRecMember, recMember));
      }
    }
    return recMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation basicGetRecMember()
  {
    return recMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecMember(Operation newRecMember)
  {
    Operation oldRecMember = recMember;
    recMember = newRecMember;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.BINDING__REC_MEMBER, oldRecMember, recMember));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getProvider()
  {
    if (provider != null && provider.eIsProxy())
    {
      InternalEObject oldProvider = (InternalEObject)provider;
      provider = (Variable)eResolveProxy(oldProvider);
      if (provider != oldProvider)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.BINDING__PROVIDER, oldProvider, provider));
      }
    }
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetProvider()
  {
    return provider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvider(Variable newProvider)
  {
    Variable oldProvider = provider;
    provider = newProvider;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.BINDING__PROVIDER, oldProvider, provider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getProMember()
  {
    if (proMember != null && proMember.eIsProxy())
    {
      InternalEObject oldProMember = (InternalEObject)proMember;
      proMember = (Operation)eResolveProxy(oldProMember);
      if (proMember != oldProMember)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.BINDING__PRO_MEMBER, oldProMember, proMember));
      }
    }
    return proMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation basicGetProMember()
  {
    return proMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProMember(Operation newProMember)
  {
    Operation oldProMember = proMember;
    proMember = newProMember;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.BINDING__PRO_MEMBER, oldProMember, proMember));
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
      case ArchitecturePackage.BINDING__RECEIVER:
        if (resolve) return getReceiver();
        return basicGetReceiver();
      case ArchitecturePackage.BINDING__REC_MEMBER:
        if (resolve) return getRecMember();
        return basicGetRecMember();
      case ArchitecturePackage.BINDING__PROVIDER:
        if (resolve) return getProvider();
        return basicGetProvider();
      case ArchitecturePackage.BINDING__PRO_MEMBER:
        if (resolve) return getProMember();
        return basicGetProMember();
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
      case ArchitecturePackage.BINDING__RECEIVER:
        setReceiver((Variable)newValue);
        return;
      case ArchitecturePackage.BINDING__REC_MEMBER:
        setRecMember((Operation)newValue);
        return;
      case ArchitecturePackage.BINDING__PROVIDER:
        setProvider((Variable)newValue);
        return;
      case ArchitecturePackage.BINDING__PRO_MEMBER:
        setProMember((Operation)newValue);
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
      case ArchitecturePackage.BINDING__RECEIVER:
        setReceiver((Variable)null);
        return;
      case ArchitecturePackage.BINDING__REC_MEMBER:
        setRecMember((Operation)null);
        return;
      case ArchitecturePackage.BINDING__PROVIDER:
        setProvider((Variable)null);
        return;
      case ArchitecturePackage.BINDING__PRO_MEMBER:
        setProMember((Operation)null);
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
      case ArchitecturePackage.BINDING__RECEIVER:
        return receiver != null;
      case ArchitecturePackage.BINDING__REC_MEMBER:
        return recMember != null;
      case ArchitecturePackage.BINDING__PROVIDER:
        return provider != null;
      case ArchitecturePackage.BINDING__PRO_MEMBER:
        return proMember != null;
    }
    return super.eIsSet(featureID);
  }

} //BindingImpl
