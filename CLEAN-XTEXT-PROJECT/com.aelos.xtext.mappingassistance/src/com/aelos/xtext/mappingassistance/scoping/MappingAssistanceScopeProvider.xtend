/*
 * generated by Xtext 2.13.0
 */
package com.aelos.xtext.mappingassistance.scoping


import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScope
import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage
import com.aelos.xtext.mappingassistance.mappingAssistance.Observer
import com.aelos.xtext.mappingassistance.mappingAssistance.Bindings
import com.aelos.xtext.mappingassistance.mappingAssistance.Mock
import com.aelos.xtext.mappingassistance.mappingAssistance.TestOP
import com.aelos.xtext.mappingassistance.mappingAssistance.ReplaceConf

//import com.aelos.xtext.mappingassistance.mappingAssistance.RequiredService
//import com.aelos.xtext.mappingassistance.mappingAssistance.ServiceName
//import com.aelos.xtext.mappingassistance.mappingAssistance.Bindings
//import com.aelos.xtext.mappingassistance.mappingAssistance.MappingAssistancePackage
//import com.aelos.xtext.mappingassistance.mappingAssistance.InstanceComp

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MappingAssistanceScopeProvider extends AbstractMappingAssistanceScopeProvider {
//	override getScope(EObject context, EReference reference) {
//    // We want to define the Scope for the Element's superElement cross-reference
//    if (context instanceof RequiredService
//            && reference == MappingAssistancePackage.Literals.REQUIRED_SERVICE__NAME_SERV) {
//        // Collect a list of candidates by going through the model
//        // EcoreUtil2 provides useful functionality to do that
//        // For example searching for all elements within the root Object's tree
//        val rootElement = EcoreUtil2.getRootContainer(context)
//        val candidates = EcoreUtil2.getAllContentsOfType(rootElement,ServiceName )
//        // Create IEObjectDescriptions and puts them into an IScope instance
//        return Scopes.scopeFor(candidates)
//    }
//    if (context instanceof RequiredService
//            && reference == MappingAssistancePackage.Literals.REQUIRED_SERVICE__NAME_COMP) {
//        // Collect a list of candidates by going through the model
//        // EcoreUtil2 provides useful functionality to do that
//        // For example searching for all elements within the root Object's tree
//        val rootElement = EcoreUtil2.getRootContainer(context)
//        val candidates = EcoreUtil2.getAllContentsOfType(rootElement,InstanceComp )
//        // Create IEObjectDescriptions and puts them into an IScope instance
//        return Scopes.scopeFor(candidates)
//    }
//    if (context instanceof Bindings
//            && reference == MappingAssistancePackage.Literals.BINDINGS__NAME_SERV2) {
//        // Collect a list of candidates by going through the model
//        // EcoreUtil2 provides useful functionality to do that
//        // For example searching for all elements within the root Object's tree
//        val rootElement = EcoreUtil2.getRootContainer(context)
//        val candidates = EcoreUtil2.getAllContentsOfType(rootElement,ServiceName )
//        // Create IEObjectDescriptions and puts them into an IScope instance
//        return Scopes.scopeFor(candidates)
//    }
//    if (context instanceof Bindings
//            && reference == MappingAssistancePackage.Literals.BINDINGS__NAME_COMP) {
//        // Collect a list of candidates by going through the model
//        // EcoreUtil2 provides useful functionality to do that
//        // For example searching for all elements within the root Object's tree
//        val rootElement = EcoreUtil2.getRootContainer(context)
//        val candidates = EcoreUtil2.getAllContentsOfType(rootElement,InstanceComp )
//        // Create IEObjectDescriptions and puts them into an IScope instance
//        return Scopes.scopeFor(candidates)
//    }
//    return super.getScope(context, reference);
//}

	override getScope(EObject context, EReference reference) {
		
	    if (context instanceof TestOP && reference == MappingAssistancePackage.Literals.TEST_OP__NAME) {
	        	
	          // Create IEObjectDescriptions and puts them into an IScope instance
	          return scope_Call_op(EcoreUtil2.getContainerOfType(context, TestOP))
	    }
	    if (context instanceof TestOP && reference == MappingAssistancePackage.Literals.TEST_OP__VAR_CONF1) {
	        	
	          // Create IEObjectDescriptions and puts them into an IScope instance
	          return scope_TestDriver_InstVar(EcoreUtil2.getContainerOfType(context, TestOP))   
	    }
	    if (context instanceof Observer && reference == MappingAssistancePackage.Literals.OBSERVER__MEMBER1) {
	        	
	          // Create IEObjectDescriptions and puts them into an IScope instance
	          return scope_Call_op1(EcoreUtil2.getContainerOfType(context, Observer))
	    }
	    if (context instanceof Observer && reference == MappingAssistancePackage.Literals.OBSERVER__VAR_OP) {
	        	
	          // Create IEObjectDescriptions and puts them into an IScope instance
	          return scope_Observer_VarOp(EcoreUtil2.getContainerOfType(context, Observer))
	    }
	    if (context instanceof Observer && reference == MappingAssistancePackage.Literals.OBSERVER__MEMBER2) {
	        	
	          // Create IEObjectDescriptions and puts them into an IScope instance
	          return scope_Call_op2(EcoreUtil2.getContainerOfType(context, Observer))      
	    }
	    if (context instanceof ReplaceConf && reference == MappingAssistancePackage.Literals.REPLACE_CONF__MEMBER) {
	        	
	          // Create IEObjectDescriptions and puts them into an IScope instance
	          return scope_Call_op_conf(EcoreUtil2.getContainerOfType(context, ReplaceConf))   
	    }
	     if (context instanceof Bindings && reference == MappingAssistancePackage.Literals.BINDINGS__NAME_SERV1) {
	        	
	          // Create IEObjectDescriptions and puts them into an IScope instance
	          return scope_Call_op_bind(EcoreUtil2.getContainerOfType(context, Bindings))   
	    }
	    if (context instanceof Bindings && reference == MappingAssistancePackage.Literals.BINDINGS__NAME_SERV2) {
	        	
	          // Create IEObjectDescriptions and puts them into an IScope instance
	          return scope_Call_op_bind2(EcoreUtil2.getContainerOfType(context, Bindings))   
	    }
	    if (context instanceof ReplaceConf && reference == MappingAssistancePackage.Literals.REPLACE_CONF__VAR_CONF) {
	        	
	          // Create IEObjectDescriptions and puts them into an IScope instance
	          return scope_Call_op_conf2(EcoreUtil2.getContainerOfType(context, ReplaceConf))   
	    }
	     if (context instanceof Mock && reference == MappingAssistancePackage.Literals.MOCK__MEMBER) {
	        	
	          // Create IEObjectDescriptions and puts them into an IScope instance
	          return scope_Call_op_mock(EcoreUtil2.getContainerOfType(context, Mock))   
	    }
	    
	    return super.getScope(context, reference);
	}

   	def  IScope scope_Call_op2(Observer selct) {
     // System.out.print("dsjkbc")
      return Scopes.scopeFor(selct.service2.type.compType.opsReq);
	}
   	def  IScope scope_Call_op1(Observer selct) {
     // System.out.print("dsjkbc")
      return Scopes.scopeFor(selct.service1.type.compType.ops);
	}
	def  IScope scope_Call_op(TestOP selct) {
     // System.out.print("dsjkbc")
      return Scopes.scopeFor(selct.service.type.compType.ops);
	}
	def  IScope scope_Call_op_conf(ReplaceConf selct) {
     // System.out.print("dsjkbc")
      return Scopes.scopeFor(selct.service.type.compType.ops);
	}
	def  IScope scope_Call_op_conf2(ReplaceConf selct) {
     // System.out.print("dsjkbc")
      return Scopes.scopeFor(selct.member.arg);
	}
	def  IScope scope_Call_op_bind(Bindings selct) {
     // System.out.print("dsjkbc")
      return Scopes.scopeFor(selct.nameComp.type.ops);
	}
	def  IScope scope_Call_op_bind2(Bindings selct) {
     // System.out.print("dsjkbc")
      return Scopes.scopeFor(selct.nameComp1.type.compType.ops);
	}
	def  IScope scope_Call_op_mock(Mock selct) {
     // System.out.print("dsjkbc")
      return Scopes.scopeFor(selct.service.type.compType.opsReq);
	}
	def  IScope scope_TestDriver_InstVar(TestOP selct) {
     System.out.println(selct.name.arg.size+" : "+selct.varConf1.size)
      return Scopes.scopeFor(selct.name.arg);
	}
	def  IScope scope_Observer_VarOp(Observer selct) {
     // System.out.print("dsjkbc")
      return Scopes.scopeFor(selct.member1.arg);
	}
}
