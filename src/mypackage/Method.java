package mypackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import ALGO.AlgoFinal;
import ALGO.DatabaseInput;
import ALGO.MethodList;
import ALGO.OwnerClassList;
import mypackage.*;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

import java.awt.Component;
import java.lang.invoke.MethodHandle;
public class Method {
	 boolean FirstTimeCallers=false; 
	 boolean FirstTimeCallees=false; 
	 public boolean VisitedFlag=false; 
	 MethodList VisitedCallers= new MethodList(); 
	 final MethodList VisitedCallees= new MethodList(); 
	 MethodList VisitedCalleesFinal= new MethodList(); 
	public String ID; 
	public boolean NewPatternFlag= false; 
	public boolean CalleeImplementationFlag= false; 
	public boolean CalleeChildFlag= false; 
	public boolean CallerInterfaceFlag= false; 
	public boolean CallerSuperclassFlag= false; 
	static MethodList OuterCallers=new MethodList();
	static MethodList OuterCallees=new MethodList();
	Method meth =null; 
	public  MethodList ExtendedCallees=null; 
	public  MethodList ExtendedCallers=null; 
	public  MethodList NewCallees2=new MethodList();
	public  MethodList NewCallers2=new MethodList();
	public String methodname;
	public String fullmethodname;
	public Clazz Owner= new Clazz(); 
	public MethodList Callees= new MethodList(); 
	public MethodList Callers= new MethodList(); 
	public MethodList CallersofCallers= new MethodList(); 
	public MethodList CalleesofCallees= new MethodList(); 
	public MethodList CalleesImplementations= new MethodList(); 
	public MethodList CallersInterfaces= new MethodList(); 
	public MethodList CallersofCallersInterfaces= new MethodList(); 
	public MethodList CalleesofCalleesImplementations= new MethodList(); 
	public MethodList CalleesChildren= new MethodList(); 
	public MethodList CallersSuperclasses= new MethodList(); 
	public MethodList CallersofCallersSuperclasses= new MethodList(); 
	public MethodList CalleesofCalleesChildren= new MethodList(); 
	public MethodList Interfaces= new MethodList(); 
	public MethodList Implementations= new MethodList(); 
	public MethodList Superclasses= new MethodList(); 
	public MethodList Children= new MethodList();
	//	public List<RequirementGold> requirementsGold= new ArrayList<RequirementGold>(); 
	//	public List<Requirement2> requirements= new ArrayList<Requirement2>(); 
	//	public	HashMap<Requirement2, String> FinalMethodHashMap= new HashMap<Requirement2, String>(); 


	public Clazz getOwner() {
		return Owner;
	}
	public MethodList getCallersofCallers() {
		return CallersofCallers;
	}
	public void setCallersofCallers(MethodList callersofCallers) {
		CallersofCallers = callersofCallers;
	}
	public MethodList getCalleesofCallees() {
		return CalleesofCallees;
	}
	public void setCalleesofCallees(MethodList calleesofCallees) {
		CalleesofCallees = calleesofCallees;
	}
	public MethodList getCalleesImplementations() {
		return CalleesImplementations;
	}
	public void setCalleesImplementations(MethodList calleesImplementations) {
		CalleesImplementations = calleesImplementations;
	}
	public MethodList getCallersInterfaces() {
		return CallersInterfaces;
	}
	public void setCallersInterfaces(MethodList callersInterfaces) {
		CallersInterfaces = callersInterfaces;
	}
	public MethodList getCallersofCallersInterfaces() {
		return CallersofCallersInterfaces;
	}
	public void setCallersofCallersInterfaces(MethodList callersofCallersInterfaces) {
		CallersofCallersInterfaces = callersofCallersInterfaces;
	}
	public MethodList getCalleesofCalleesImplementations() {
		return CalleesofCalleesImplementations;
	}
	public void setCalleesofCalleesImplementations(MethodList calleesofCalleesImplementations) {
		CalleesofCalleesImplementations = calleesofCalleesImplementations;
	}
	public MethodList getCalleesChildren() {
		return CalleesChildren;
	}
	public void setCalleesChildren(MethodList calleesChildren) {
		CalleesChildren = calleesChildren;
	}
	public MethodList getCallersSuperclasses() {
		return CallersSuperclasses;
	}
	public void setCallersSuperclasses(MethodList callersSuperclasses) {
		CallersSuperclasses = callersSuperclasses;
	}
	public MethodList getCallersofCallersSuperclasses() {
		return CallersofCallersSuperclasses;
	}
	public void setCallersofCallersSuperclasses(MethodList callersofCallersSuperclasses) {
		CallersofCallersSuperclasses = callersofCallersSuperclasses;
	}
	public MethodList getCalleesofCalleesChildren() {
		return CalleesofCalleesChildren;
	}
	public void setCalleesofCalleesChildren(MethodList calleesofCalleesChildren) {
		CalleesofCalleesChildren = calleesofCalleesChildren;
	}
	public MethodList getCallees() {
		return Callees;
	}
	public MethodList getCallers() {
		return Callers;
	}
	public void setOwner(Clazz owner) {
		this.Owner = owner;
	}
	public MethodList getSuperclasses() {
		return Superclasses;
	}
	public void setSuperclasses(MethodList superclasses) {
		Superclasses = superclasses;
	}
	public MethodList getChildren() {
		return Children;
	}
	public void setChildren(MethodList children) {
		Children = children;
	}
	public MethodList getInterfaces() {
		return Interfaces;
	}
	public void setInterfaces(MethodList interfaces) {
		Interfaces = interfaces;
	}
	public MethodList getImplementations() {
		return Implementations;
	}
	public void setImplementations(MethodList implementations) {
		this.Implementations = implementations;
	}
	public Method(String methodid, String methodname) {
		super();
		this.ID = methodid;
		this.methodname = methodname;
	}
	public Method() {
		// TODO Auto-generated constructor stub
	}
	public String getMethodid() {
		return ID;
	}
	public void setMethodid(String methodid) {
		this.ID = methodid;
	}
	public String getMethodname() {
		return methodname;
	}
	public void setMethodname(String methodname) {
		this.methodname = methodname;
	}

	@Override
	public String toString() {
		return  ID + ", methodname=" + methodname 
				 
				//			+	", requirementsGold="
				//				+ requirementsGold.toString() + 
//				+Owner.toString()+"]"
				+"[ ClassID="+Owner.ID+"  ClassName="+Owner.classname +" ]"
				;
	}
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	public String toString2() {
		return "["+  ID + ": methodname=" + methodname  + ": classname=" + Owner.classname + ": classid=" + Owner.ID +"]";
	}
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	public String PrintList(List<Method> methods) {
		String s =""; 
		for(Method mymethod: methods) {
			s= s +mymethod.toString(); 
		}
		return s; 
	}

	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	public Method(String methodid, String methodname, String fullmethodname,
			Clazz classrep, HashMap<Requirement, String> finalMethodHashMap) {
		super();
		this.ID = methodid;
		this.methodname = methodname;
		this.fullmethodname = fullmethodname;
		this.Owner = classrep;
	}


	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	public Method(String methodid, String methodname, String fullmethodname,
			Clazz classrep) {
		super();
		this.ID = methodid;
		this.methodname = methodname;
		this.fullmethodname = fullmethodname;
		this.Owner = classrep;
	}

	public Clazz getClassrep() {
		return Owner;
	}
	public void setClassrep(Clazz classrep) {
		this.Owner = classrep;
	}
	public String getFullmethodname() {
		return fullmethodname;
	}
	public void setFullmethodname(String fullmethodname) {
		this.fullmethodname = fullmethodname;
	}



	
	/////////////////////////////////////////////////////////

	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////

	/////////////////////////////////////////////////////////
	
	
	public MethodList getCalleesAugmentedChildrenImplementations(Requirement requirement) {
		MethodList NewCallees= new MethodList();
		NewCallees.addAll(Callees);

		if(!this.Implementations.isEmpty()) {
			for(Method imp: this.Implementations) {

				if(!imp.Callees.isEmpty()) {
					NewCallees=NewCallees.AddAll(imp.Callees); 
				}


			}


		}

		if(!this.Children.isEmpty()) {


			for(Method child: this.Children) {
				if(!child.Callees.isEmpty()) {
					NewCallees=	NewCallees.AddAll(child.Callees); 

				}


			}
		}
	return NewCallees; 
	}
	
	public void setCallees(MethodList callees) {
		Callees = callees;
	}




	
	/////////////////////////////////////////////////////////////////////////
	public MethodList getOuterCalleesFinal(Requirement requirement) {
		if (OuterCallees == null)
				findOuterCallees(this.Owner, new MethodList()); 
		
		return OuterCallees;
	}
	
	public MethodList getOuterCallersFinal(Requirement requirement) {
		if (OuterCallers == null)
				findOuterCallers(this.Owner, new MethodList()); 
		
		return OuterCallers;
	}
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	private void findOuterCallees(Clazz excludedOwner, MethodList Excludedcallees) {
		
		if(Excludedcallees.contains(this)) {
//			System.out.println("yes");
//			return null; 
		}
		else {
			Excludedcallees.add(this);
			if (this.Owner == excludedOwner)
				for(Method callee: this.Callees) callee.findOuterCallees(excludedOwner, Excludedcallees); 
			else
				OuterCallees.add(this);

			for(Method implementationMethod: this.Implementations)
				implementationMethod.findOuterCallees(excludedOwner, Excludedcallees); 
			
			for(Method childMethod: this.Children)
				childMethod.findOuterCallees(excludedOwner, Excludedcallees);
		}
	}
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////		
	private void findOuterCallers(Clazz excludedOwner, MethodList Excludedcallers) {
		
		if(Excludedcallers.contains(this)) {
//			System.out.println("yes");
//			return null; 
		}
		else {
			Excludedcallers.add(this);
			 
			if (this.Owner == excludedOwner) {
				for(Method interfaceMethod: this.Interfaces)
					interfaceMethod.findOuterCallers(excludedOwner, Excludedcallers); 

				for(Method parentMethod: this.Superclasses)
					parentMethod.findOuterCallees(excludedOwner, Excludedcallers); 

				for(Method caller: this.Callers) caller.findOuterCallers(excludedOwner, Excludedcallers);
			}
			else
				OuterCallers.add(this); 
		}
	}
			
		

	
	//////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////

	public MethodList getCallersAugmentedInterfacesSuperclasses(Requirement requirement) {
		
		MethodList NewCallers= new MethodList();
		NewCallers.addAll(Callers);
		MethodList FinalCallers = new MethodList();
		
			if(!this.Interfaces.isEmpty()) {
				for(Method inter: this.Interfaces) {
					if(!inter.Callers.isEmpty()) {


						NewCallers=NewCallers.AddAll(inter.Callers); 

					}
				}
			}

			if(!this.Superclasses.isEmpty()) {
				for(Method superclass: this.Superclasses) {
					if(!superclass.Callers.isEmpty()) {

						NewCallers=NewCallers.AddAll(superclass.Callers); 

					}
				}
			}
			return NewCallers; 
	}
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////	
private MethodList RemoveDuplicates(MethodList finalCallers) {
		// TODO Auto-generated method stub
	MethodList FinalCallers2= new MethodList(); 
	
	for(Method finalcaller: finalCallers) {
		if(!FinalCallers2.contains(finalcaller)) {
			FinalCallers2.add(finalcaller); 
		}
	}
	return FinalCallers2; 
		
	}
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
public MethodList getOuterCallers(Requirement requirement) {

	
MethodList FinalCallers=	getCallers(requirement); 
MethodList OuterCallers= new MethodList(); 
for(Method FinalCaller: FinalCallers) {
	if(!this.Owner.ID.equals(FinalCaller.Owner.ID)) {
		OuterCallers.add(FinalCaller); 
	}
}

return OuterCallers; 

}
	
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////


public MethodList getOuterCallees(Requirement requirement) {

	
MethodList FinalCallees=	getCallees(requirement); 
MethodList OuterCallees= new MethodList(); 
for(Method FinalCallee: FinalCallees) {
	if(!this.Owner.ID.equals(FinalCallee.Owner.ID)) {
		OuterCallees.add(FinalCallee); 
	}
}

return OuterCallees; 



}
	
	
	
	
	
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	
	public MethodList getChildrenCallees(Requirement requirement) {
		MethodList NewCallees= new MethodList();

		if(!this.Children.isEmpty()) {


			for(Method child: this.Children) {
				if(!child.Callees.isEmpty()) {
					child.CalleeChildFlag=true; 
					NewCallees=	NewCallees.AddAll(child.Callees); 

				}


			}
		}

		NewCallees=RemoveDuplicates(NewCallees); 

		return NewCallees; 
	}
	
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	
	public MethodList getImplementationCallees(Requirement requirement) {
		MethodList NewCallees= new MethodList();

		if(!this.Implementations.isEmpty()) {
			for(Method imp: this.Implementations) {

				if(!imp.Callees.isEmpty()) {
					NewCallees=NewCallees.AddAll(imp.Callees); 
					imp.CalleeImplementationFlag=true; 
				}


			}

			NewCallees=RemoveDuplicates(NewCallees); 

		}



		return NewCallees; 
	}
	
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	
	public MethodList getInterfaceCallers(Requirement requirement) {
		MethodList NewCallers= new MethodList();
		if(!this.Interfaces.isEmpty()) {
			for(Method inter: this.Interfaces) {
				if(!inter.Callers.isEmpty()) {


					NewCallers=NewCallers.AddAll(inter.Callers); 

				}
			}
		}

		NewCallers=RemoveDuplicates(NewCallers); 

		return NewCallers; 
	}
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	public MethodList getSuperclassCallers(Requirement requirement) {
		MethodList NewCallers= new MethodList();
	if(!this.Superclasses.isEmpty()) {
		for(Method superclass: this.Superclasses) {
			if(!superclass.Callers.isEmpty()) {

				NewCallers=NewCallers.AddAll(superclass.Callers); 

			}
		}
	}		
	NewCallers=RemoveDuplicates(NewCallers); 

	return NewCallers; 
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	public void setCallers(MethodList callers) {
		Callers = callers;
	}
	/////////////////////////////////////////////////////////////////////////

	public MethodList getCallers(Requirement requirement) {
		// TODO Auto-generated method stub
//		if(AlgoFinal.ExtendedFlag==true) {
//			return this.getExtendedCallers(requirement); 
//		}
//		else if(AlgoFinal.BasicFlag==true) {
//			return this.getBasicCallers(requirement); 
//
//		}
//		else if(AlgoFinal.RecursiveCallFlag==true) {
//			return this.getOuterCallersFinal(requirement); 
//
//		}
		return null;
	}
	/////////////////////////////////////////////////////////////////////////
	public MethodList getCallees(Requirement requirement) {
		// TODO Auto-generated method stub
//		if(AlgoFinal.ExtendedFlag==true) {
//			return this.getExtendedCallees(requirement); 
//		}
//		else if(AlgoFinal.BasicFlag==true) {
//			return this.getBasicCallees(requirement); 
//
//		}
//		else if(AlgoFinal.RecursiveCallFlag==true) {
//			return this.getOuterCalleesFinal(requirement); 
//
//		}
		return null;
		
	}
/////////////////////////////////////////////////////////////////////////////////

//	private MethodList getExtendedCallees2(Requirement requirement) {
//		// TODO Auto-generated method stub
//		MethodList NewCallees= new MethodList(); 
//		return getExtendedCalleesRec( requirement, NewCallees);
//		
//	}
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	public MethodList getExtendedCallees() throws CloneNotSupportedException {

		/********************************************************************************/
		/********************************************************************************/
		if (ExtendedCallees!=null) {return ExtendedCallees; }
		else {
			ExtendedCallees= new MethodList();
			MethodList TempCallees=new MethodList(); 
			MethodList childrenCallees= new MethodList(); 
			TempCallees.addAll(this.Callees); 
				if(AlgoFinal.InterfaceImplementationFlag==true) {
					TempCallees.addAll(getInterfaceImplementationCallees(TempCallees)); 
				}
				if(AlgoFinal.InheritanceFlag==true) {
					TempCallees.addAll(getInheritanceCallees(TempCallees, childrenCallees)); 

				}

				if (AlgoFinal.RecursiveDescent==true) {
					
					for(Method callee: TempCallees) {
						if(!callee.Owner.ID.equals(this.Owner.ID)) {
							ExtendedCallees.add(callee); 
						}else {
							ExtendedCallees.addAll(callee.getExtendedCallees()); 
						}
					}
					
				}else {
					ExtendedCallees=TempCallees; 
				}
						
		}
				
	
	return ExtendedCallees; 
			
		
			
		
		
		
	}
		/////////////////////////////////////////////////////////////////////////

	private MethodList getInterfaceImplementationCallees(MethodList ExtendedCallees) {
	
		MethodList CalleeInterfaceImplementations= new MethodList(); 
		for(Method callee: ExtendedCallees) {
			
			//case 5
				CalleeInterfaceImplementations.addAll(callee.Implementations); 
			//case 6
				CalleeInterfaceImplementations.addAll(callee.Interfaces); 

		}
		//case 7
		for(Method implementation: this.Implementations) {
			CalleeInterfaceImplementations.AddAll(implementation.Callees); 
		}
	return CalleeInterfaceImplementations;
}
	/////////////////////////////////////////////////////////////////////////

	private MethodList getInheritanceCallees(MethodList nextLevelCallees, MethodList ChildrenCallees) {
		// TODO Auto-generated method stub
		//case 12
		for(Method callee: nextLevelCallees) {
				ChildrenCallees.AddAll(callee.Children); 
				
				//Recursive Call 
				if(AlgoFinal.InheritanceRecursion==true) {
					
						getInheritanceCallees(callee.Children, ChildrenCallees); 
				}
				
		}
		return ChildrenCallees; 
	}

/////////////////////////////////////////////////////////////////////////////////
	public MethodList getExtendedCallers() {

	
		
		
		if(ExtendedCallers!=null) {
			return ExtendedCallers; 
		}
		else {
			ExtendedCallers= new MethodList(); 
			MethodList TempCallers= new MethodList(); 
			MethodList SuperclassCallers= new MethodList(); 
			TempCallers.addAll(this.Callers); 
			if(AlgoFinal.InheritanceFlag==true) {
				TempCallers.addAll(getInheritanceCallers(SuperclassCallers)); 
			}
			if(AlgoFinal.InterfaceImplementationFlag==true) {
				TempCallers.addAll(getInterfaceImplementationCallers(TempCallers)); 
					
				}
			
			if(AlgoFinal.RecursiveDescent==true) {
				for(Method caller: TempCallers) {
					if(!caller.Owner.ID.equals(this.Owner.ID)) {
						ExtendedCallers.add(caller); 
					}else {
						ExtendedCallers.addAll(caller.getExtendedCallers()); 
					}
				}
			}else {
				ExtendedCallers=TempCallers; 
			}
		}
	
		 
	

	return ExtendedCallers; 
}
	/////////////////////////////////////////////////////////////////////////

private MethodList getInterfaceImplementationCallers(MethodList ExtendedCallers) {
	// TODO Auto-generated method stub
	MethodList InterfaceImplementationCallers= new MethodList();
		//case 20
		for(Method CallerInterface: this.Interfaces) {
			InterfaceImplementationCallers.addAll(CallerInterface.Callers); 
		}
		//case 21
		for(Method CallerImplementation: this.Implementations) {
			InterfaceImplementationCallers.addAll(CallerImplementation.Callers); 
		}
		//case 22
		for(Method Caller: ExtendedCallers) {
			InterfaceImplementationCallers.addAll(Caller.Interfaces); 

		}
	
	return InterfaceImplementationCallers;
}
/////////////////////////////////////////////////////////////////////////

private MethodList getInheritanceCallers(MethodList SuperclassCallers) {
	// TODO Auto-generated method stub
	
	//case 28
			for(Method mysuperclass: this.Superclasses) {
				SuperclassCallers.addAll(mysuperclass.Callers); 
				
				//Recursive Call 
				if(AlgoFinal.InheritanceRecursion==true) {
//					System.out.println("yes");
					mysuperclass.getInheritanceCallers(SuperclassCallers); 	
					
				
				}
			}
		
	
	
	return SuperclassCallers; 
	
}
/////////////////////////////////////////////////////////////////////////////////

	public MethodList getBasicCallers(Requirement requirement) {
		// TODO Auto-generated method stub
		return this.Callers; 
	}
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	public MethodList getBasicCallees(Requirement requirement) {
		// TODO Auto-generated method stub
		return this.Callees; 
	}
	public MethodList getCalleesShell() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
//		for(String key: DatabaseInput.MethodHashMap.keySet()) {
//			DatabaseInput.MethodHashMap.get(key).VisitedFlag=false; 
//		}
		
		MethodList Callees =getExtendedCallees(); 
//		this.FirstTimeCallees=true; 
		return Callees; 
	}
	public MethodList getCallersShell() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
//		for(String key: DatabaseInput.MethodHashMap.keySet()) {
//			DatabaseInput.MethodHashMap.get(key).VisitedFlag=false; 
//		}
		
		MethodList Callers =getExtendedCallers(); 
//		this.FirstTimeCallers=true; 
		return Callers; 
	
	}





}