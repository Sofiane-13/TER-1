/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package com.aelos.xtext.architecture.scoping;

import com.aelos.xtext.architecture.architecture.ArchitecturePackage;
import com.aelos.xtext.architecture.architecture.InstanceComp;
import com.aelos.xtext.architecture.architecture.RequiredService;
import com.aelos.xtext.architecture.architecture.ServiceName;
import com.aelos.xtext.architecture.scoping.AbstractArchitectureScopeProvider;
import com.google.common.base.Objects;
import java.util.List;
import javax.script.Bindings;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class ArchitectureScopeProvider extends AbstractArchitectureScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if (((context instanceof RequiredService) && Objects.equal(reference, ArchitecturePackage.Literals.REQUIRED_SERVICE__NAME_SERV))) {
      final EObject rootElement = EcoreUtil2.getRootContainer(context);
      final List<ServiceName> candidates = EcoreUtil2.<ServiceName>getAllContentsOfType(rootElement, ServiceName.class);
      return Scopes.scopeFor(candidates);
    }
    if (((context instanceof RequiredService) && Objects.equal(reference, ArchitecturePackage.Literals.REQUIRED_SERVICE__NAME_COMP))) {
      final EObject rootElement_1 = EcoreUtil2.getRootContainer(context);
      final List<InstanceComp> candidates_1 = EcoreUtil2.<InstanceComp>getAllContentsOfType(rootElement_1, InstanceComp.class);
      return Scopes.scopeFor(candidates_1);
    }
    if (((context instanceof Bindings) && (Objects.equal(reference, ArchitecturePackage.Literals.BINDINGS__NAME_SERV2) || Objects.equal(reference, ArchitecturePackage.Literals.BINDINGS__NAME_SERV1)))) {
      final EObject rootElement_2 = EcoreUtil2.getRootContainer(context);
      final List<ServiceName> candidates_2 = EcoreUtil2.<ServiceName>getAllContentsOfType(rootElement_2, ServiceName.class);
      return Scopes.scopeFor(candidates_2);
    }
    if (((context instanceof Bindings) && (Objects.equal(reference, ArchitecturePackage.Literals.BINDINGS__NAME_COMP1) || Objects.equal(reference, ArchitecturePackage.Literals.BINDINGS__NAME_COMP2)))) {
      final EObject rootElement_3 = EcoreUtil2.getRootContainer(context);
      final List<InstanceComp> candidates_3 = EcoreUtil2.<InstanceComp>getAllContentsOfType(rootElement_3, InstanceComp.class);
      return Scopes.scopeFor(candidates_3);
    }
    return super.getScope(context, reference);
  }
}
