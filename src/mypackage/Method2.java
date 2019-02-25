package mypackage;

import java.util.ArrayList;
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
public class Method2 {
	public String ID; 
	public boolean NewPatternFlag= false; 
	public boolean CalleeImplementationFlag= false; 
	public boolean CalleeChildFlag= false; 
	public boolean CallerInterfaceFlag= false; 
	public boolean CallerSuperclassFlag= false; 
	static MethodList OuterCallers=new MethodList();
	static MethodList OuterCallees=new MethodList();
	Method2 meth =null; 
	public  MethodList NewCallees=null; 
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
	public MethodList ExtendedCallees= null; 
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
	public Method2(String methodid, String methodname) {
		super();
		this.ID = methodid;
		this.methodname = methodname;
	}
	public Method2() {
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
//				+"[ ClassID"+Owner.ID+"  ClassName "+Owner.classname +" ]"
				;
	}

	public String toString2() {
		return "["+  ID + ": methodname=" + methodname  + ": classname=" + Owner.classname + ": classid=" + Owner.ID +"]";
	}

	public String PrintList(List<Method2> methods) {
		String s =""; 
		for(Method2 mymethod: methods) {
			s= s +mymethod.toString(); 
		}
		return s; 
	}


	public Method2(String methodid, String methodname, String fullmethodname,
			Clazz classrep, HashMap<Requirement, String> finalMethodHashMap) {
		super();
		this.ID = methodid;
		this.methodname = methodname;
		this.fullmethodname = fullmethodname;
		this.Owner = classrep;
	}



	public Method2(String methodid, String methodname, String fullmethodname,
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


	/////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	//////////////////////////////ORIGINAL VERSION ///////////////////////	
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
//		public MethodList getCallees(Requirement requirement) {
//			MethodList NewCallees= new MethodList();
//			NewCallees.addAll(Callees);
//	
//			if(!this.Implementations.isEmpty()) {
//				for(Method imp: this.Implementations) {
//	
//					NewCallees=NewCallees.AddAll(imp.Callees); 
//				
//				}
//				
//				
//			}
//			
//			if(!this.Children.isEmpty()) {
//				for(Method child: this.Children) {
//					
//					NewCallees=	NewCallees.AddAll(child.Callees); 
//
//				}
//			}
//				
//				
//				return NewCallees; 
//		}


	/////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	//			FILTER OUT INNER CALLS SILLY FILTERING 
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
//		public MethodList getCallees(Requirement requirement) {
//			MethodList NewCallees= new MethodList();
//			NewCallees.addAll(Callees);
//	
//			if(!this.Implementations.isEmpty()) {
//				for(Method imp: this.Implementations) {
//	
//					if(!imp.Callees.isEmpty()) {
//						NewCallees=NewCallees.AddAll(imp.Callees); 
//						imp.CalleeImplementationFlag=true; 
//					}
//	
//				
//				}
//				
//				
//			}
//			
//				if(!this.Children.isEmpty()) {
//					
//	
//				for(Method child: this.Children) {
//					if(!child.Callees.isEmpty()) {
//						child.CalleeChildFlag=true; 
//						NewCallees=	NewCallees.AddAll(child.Callees); 
//	
//					}
//	
//				
//				}
//			}
//				
//				MethodList OuterCallees = new MethodList();
//				for(Method Callee: NewCallees) {
//					if(AlgoFinalRefactored.methodtraces2HashMap.get(requirement.ID+"-"+Callee.ID).prediction.equals("N") || 
//							!this.Owner.ID.equals(Callee.Owner.ID) ) {
//						OuterCallees.add(Callee); 
//					}
//				}
//				return OuterCallees; 
//		}

	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	////////////////////////////// VERSION 3 SMART FILTERING///////////////////////	
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////

	public MethodList getExtendedCallees(Requirement requirement) {
		MethodList NewCallees= new MethodList();
		NewCallees.addAll(Callees);

		if(!this.Implementations.isEmpty()) {
			for(Method2 imp: this.Implementations) {

				if(!imp.Callees.isEmpty()) {
					NewCallees=NewCallees.AddAll(imp.Callees); 
				}


			}


		}

		if(!this.Children.isEmpty()) {


			for(Method2 child: this.Children) {
				if(!child.Callees.isEmpty()) {
					NewCallees=	NewCallees.AddAll(child.Callees); 

				}


			}
		}

		MethodList FinalCallees = new MethodList();

		for(Method2 Callee: NewCallees) {
			if(
//					AlgoFinal.methodtraces2HashMap.get(requirement.ID+"-"+Callee.ID).prediction.equals("T") ||
					AlgoFinal.methodtraces2HashMap.get(requirement.ID+"-"+Callee.ID).prediction.equals("N")) {
				FinalCallees.add(Callee); 
			}
			else if(AlgoFinal.methodtraces2HashMap.get(requirement.ID+"-"+Callee.ID).prediction.equals("E") ) {
				if(!Callee.Owner.ID.equals(this.Owner.ID)){
					FinalCallees.add(Callee); 
				}else {
						if(!Callee.Callees.isEmpty()) {
							FinalCallees.addAll(Callee.Callees); 
//							for(Method mycallee:Callee.Callees) {
//								if(!mycallee.Interfaces.isEmpty()) {
//									for(Method inter: mycallee.Interfaces) {
//										if(!inter.Callees.isEmpty()) {
//
//
//											FinalCallees=FinalCallees.AddAll(inter.Callees); 
//
//										}
//									}
//								}
//
//								if(!mycallee.Superclasses.isEmpty()) {
//									for(Method superclass: mycallee.Superclasses) {
//										if(!superclass.Callees.isEmpty()) {
//
//											FinalCallees=FinalCallees.AddAll(superclass.Callees); 
//
//										}
//									}
//								}
//							}
						
						}else {
							FinalCallees.add(Callee); 
						}
//					for(Method CalleeOfCallee: Callee.Callees) {
//						for(Method CalleeOfCallee: Callee.getCallees(requirement)) {
//							FinalCallees.add(CalleeOfCallee);
//						if(AlgoFinalRefactored.methodtraces2HashMap.get(requirement.ID+"-"+CalleeOfCallee.ID).prediction.equals("T") 
//								||AlgoFinalRefactored.methodtraces2HashMap.get(requirement.ID+"-"+CalleeOfCallee.ID).prediction.equals("N")) {
//							FinalCallees.add(CalleeOfCallee); 
//						}
//						else if(!CalleeOfCallee.Owner.ID.equals(Callee.Owner.ID)
//								&& AlgoFinalRefactored.methodtraces2HashMap.get(requirement.ID+"-"+CalleeOfCallee.ID).prediction.equals("E")){
//							FinalCallees.add(CalleeOfCallee); 
//						}
//						
//					}
				}
			}
		}
		
		FinalCallees=RemoveDuplicates(FinalCallees); 
		return FinalCallees; 
	}
	
	
	/////////////////////////////////////////////////////////

	/////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////

	/////////////////////////////////////////////////////////
	
	
	public MethodList getCalleesAugmentedChildrenImplementations(Requirement requirement) {
		MethodList NewCallees= new MethodList();
		NewCallees.addAll(Callees);

		if(!this.Implementations.isEmpty()) {
			for(Method2 imp: this.Implementations) {

				if(!imp.Callees.isEmpty()) {
					NewCallees=NewCallees.AddAll(imp.Callees); 
				}


			}


		}

		if(!this.Children.isEmpty()) {


			for(Method2 child: this.Children) {
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




	//	
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	//////////////////////////////ORIGINAL VERSION ///////////////////////	
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
//		public MethodList getCallers(Requirement requirement) {
//			MethodList NewCallers= new MethodList();
//			NewCallers.addAll(Callers);
//			if(!this.Interfaces.isEmpty()) {
//				for(Method inter: this.Interfaces) {
//					NewCallers=NewCallers.AddAll(inter.Callers); 
//				}
//			}
//			
//			if(!this.Superclasses.isEmpty()) {
//				for(Method superclass: this.Superclasses) {
//					NewCallers=NewCallers.AddAll(superclass.Callers); 
//				}
//			}
//			return NewCallers;
//	
//		}
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	//			FILTER OUT INNER CALLS SILLY FILTERING 
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
//		public MethodList getCallers(Requirement requirement) {
//			MethodList NewCallers= new MethodList();
//			NewCallers.addAll(Callers);
//			if(!this.Interfaces.isEmpty()) {
//				for(Method inter: this.Interfaces) {
//					if(!inter.Callers.isEmpty()) {
//						inter.CallerInterfaceFlag=true; 
//	
//	
//						NewCallers=NewCallers.AddAll(inter.Callers); 
//	
//					}
//				}
//		}
//			
//				if(!this.Superclasses.isEmpty()) {
//				for(Method superclass: this.Superclasses) {
//					if(!superclass.Callers.isEmpty()) {
//						superclass.CallerSuperclassFlag=true; 
//	
//						NewCallers=NewCallers.AddAll(superclass.Callers); 
//	
//					}
//				}
//		}
//				MethodList OuterCallers = new MethodList();
//				for(Method Caller: NewCallers) {
//					if(AlgoFinalRefactored.methodtraces2HashMap.get(requirement.ID+"-"+Caller.ID).prediction.equals("N") || 
//							!this.Owner.ID.equals(Caller.Owner.ID)) {
//						OuterCallers.add(Caller); 
//					}
//				}
//				return OuterCallers; 
//	
//		}

	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	//////////////////////////////VERSION 3 SMART FILTERING///////////////////////	
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////
	public MethodList getExtendedCallers(Requirement requirement) {
		
		MethodList NewCallers= new MethodList();
		NewCallers.addAll(Callers);
		MethodList FinalCallers = new MethodList();
		
			if(!this.Interfaces.isEmpty()) {
				for(Method2 inter: this.Interfaces) {
					if(!inter.Callers.isEmpty()) {


						NewCallers=NewCallers.AddAll(inter.Callers); 

					}
				}
			}

			if(!this.Superclasses.isEmpty()) {
				for(Method2 superclass: this.Superclasses) {
					if(!superclass.Callers.isEmpty()) {

						NewCallers=NewCallers.AddAll(superclass.Callers); 

					}
				}
			}
			
			
			for(Method2 Caller: NewCallers) {
				if(AlgoFinal.methodtraces2HashMap.get(requirement.ID+"-"+Caller.ID).prediction.equals("N")) {
					FinalCallers.add(Caller); 
				}
				else if(AlgoFinal.methodtraces2HashMap.get(requirement.ID+"-"+Caller.ID).prediction.equals("E") ) {
					if(!Caller.Owner.ID.equals(this.Owner.ID)){
						FinalCallers.add(Caller); 
					}else {
						if(!Caller.Callers.isEmpty()) {
							FinalCallers.addAll(Caller.Callers); 
							
//							//ADDED NEW CODE TO GET INTERFACES AND SUPERCLASSES OF CALLERS OF CALLERS 
//									for(Method mycaller:Caller.Callers) {
//										if(!mycaller.Interfaces.isEmpty()) {
//											for(Method inter: mycaller.Interfaces) {
//												if(!inter.Callers.isEmpty()) {
//		
//		
//													FinalCallers=FinalCallers.AddAll(inter.Callers); 
//		
//												}
//											}
//										}
//		
//										if(!mycaller.Superclasses.isEmpty()) {
//											for(Method superclass: mycaller.Superclasses) {
//												if(!superclass.Callers.isEmpty()) {
//		
//													FinalCallers=FinalCallers.AddAll(superclass.Callers); 
//		
//												}
//											}
//										}
//									}

						}else {
							FinalCallers.add(Caller); 

						}

//						for(Method CallerOfCaller: Caller.getCallers(requirement)) {
//							FinalCallers.add(CallerOfCaller);
//						for(Method CallerOfCaller: Caller.Callers) {
//							if(AlgoFinalRefactored.methodtraces2HashMap.get(requirement.ID+"-"+CallerOfCaller.ID).prediction.equals("T") 
//									||AlgoFinalRefactored.methodtraces2HashMap.get(requirement.ID+"-"+CallerOfCaller.ID).prediction.equals("N")) {
//								FinalCallers.add(CallerOfCaller); 
//							}
//							else if(!CallerOfCaller.Owner.ID.equals(Caller.Owner.ID)
//									&& AlgoFinalRefactored.methodtraces2HashMap.get(requirement.ID+"-"+CallerOfCaller.ID).prediction.equals("E")){
//								FinalCallers.add(CallerOfCaller); 
//							}
//						}
					}
				}
			}
		

		
		
		FinalCallers=RemoveDuplicates(FinalCallers); 
		
		
		return FinalCallers; 

	}
	
/*	
	public MethodList getOuterCallersFinal(Requirement requirement) {
		Excludedcallers=new MethodList(); 
		OuterCallers=new MethodList(); 

		return getRecursiveOuterCallers(requirement); 
	}
	
	public MethodList getRecursiveOuterCallers(Requirement requirement) {
		
		String ReqMethod= requirement.ID+"-"+this.ID; 
		
		System.out.println(ReqMethod);

		if(Excludedcallers.contains(this)) {
			System.out.println("yes");
//			return null; 
		}
		else {
			for(Method caller: this.Callers) {
				//OUTER CALLER
//				if(!Excludedcallers.contains(this)) {

				if(!caller.Owner.ID.equals(this.Owner.ID)) {
						Excludedcallers.add(this); 
						OuterCallers.add(caller); 

					
					
				}
				//INNER CALLER
				if(caller.Owner.ID.equals(this.Owner.ID) ) {
						Excludedcallers.add(this); 
						OuterCallers.addAll(caller.getRecursiveOuterCallers(requirement)); 

					
					
					
				}
				//CALLER OF INTERFACE 
				if(!caller.Interfaces.isEmpty()) {
					for(Method myinterface: this.Interfaces) {
						for(Method myinterfaceCaller: myinterface.Callers) {
							if(!myinterfaceCaller.Owner.ID.equals(this.Owner.ID)) {
								OuterCallers.add(myinterfaceCaller); 
//								System.out.println(myinterfaceCaller);
								Excludedcallers.add(myinterfaceCaller); 
							}
							else {
								OuterCallers.addAll(myinterfaceCaller.getRecursiveOuterCallers(requirement)); 

								Excludedcallers.add(myinterfaceCaller); 

							}

							
						}
						
					
					}

				}
				//CALLER OF SUPERCLASS 
				if(!caller.Superclasses.isEmpty()) {
					for(Method mysuperclass: this.Superclasses) {
						
						for(Method mysuperclassCaller: mysuperclass.Callers) {
							if(!mysuperclassCaller.Owner.ID.equals(this.Owner.ID)) {
								OuterCallers.add(mysuperclassCaller); 
//								System.out.println(mysuperclassCaller);
								Excludedcallers.add(mysuperclassCaller); 
							}
							else {
								OuterCallers.addAll(mysuperclassCaller.getRecursiveOuterCallers(requirement)); 

								Excludedcallers.add(mysuperclassCaller); 

							}

							
						}
						}
						

					}

//				}
			}
			
			
			//END FOR 
			
	
		}
		
		
		MethodList OuterCallers2 = RemoveDuplicates(OuterCallers); 
		return OuterCallers2; 

	}
	*/
	
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
	
	private void findOuterCallees(Clazz excludedOwner, MethodList Excludedcallees) {
		
		if(Excludedcallees.contains(this)) {
//			System.out.println("yes");
//			return null; 
		}
		else {
			Excludedcallees.add(this);
			if (this.Owner == excludedOwner)
				for(Method2 callee: this.Callees) callee.findOuterCallees(excludedOwner, Excludedcallees); 
			else
				OuterCallees.add(this);

			for(Method2 implementationMethod: this.Implementations)
				implementationMethod.findOuterCallees(excludedOwner, Excludedcallees); 
			
			for(Method2 childMethod: this.Children)
				childMethod.findOuterCallees(excludedOwner, Excludedcallees);
		}
	}
			
	private void findOuterCallers(Clazz excludedOwner, MethodList Excludedcallers) {
		
		if(Excludedcallers.contains(this)) {
//			System.out.println("yes");
//			return null; 
		}
		else {
			Excludedcallers.add(this);
			 
			if (this.Owner == excludedOwner) {
				for(Method2 interfaceMethod: this.Interfaces)
					interfaceMethod.findOuterCallers(excludedOwner, Excludedcallers); 

				for(Method2 parentMethod: this.Superclasses)
					parentMethod.findOuterCallees(excludedOwner, Excludedcallers); 

				for(Method2 caller: this.Callers) caller.findOuterCallers(excludedOwner, Excludedcallers);
			}
			else
				OuterCallers.add(this); 
		}
	}
			
			/*
			for(Method callee: this.Callees) {
				
				//OUTER Callee
//				if(!Excludedcallees.contains(this)) {
				if(!callee.Owner.ID.equals(this.Owner.ID)) {
					
						Excludedcallees.add(this); 
						OuterCallees.add(callee); 

					}
				else 			
				//INNER Callee
				//if(callee.Owner.ID.equals(this.Owner.ID) ) 
					{
						Excludedcallees.add(this); 
						OuterCallees.addAll(callee.getRecursiveOuterCallees()); 
					
					
					
				}
				//Callee OF INTERFACE 
				if(!callee.Implementations.isEmpty()) {
					for(Method myimplementation: callee.Implementations) {
						
					        OuterCalles.add mzimplmentation
							OuterCallees.addAll(myimplementation.getRecursiveOuterCallees()); 
						
						
					
					}

				}
				//Callee OF SUPERCLASS 
				if(!callee.Children.isEmpty()) {
					for(Method mychild: callee.Children) {
						for(Method myimplementationCallee: mychild.Callees) {
							OuterCallees.addAll(myimplementationCallee.getRecursiveOuterCallees()); 

						}

					}

//				}
			}
			
			
			
			
		}
		
		
//		System.out.println(OuterCallees);
		MethodList OuterCallees2=RemoveDuplicates(OuterCallees); 
		return OuterCallees2; 
*/

	
	//////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////

	public MethodList getCallersAugmentedInterfacesSuperclasses(Requirement requirement) {
		
		MethodList NewCallers= new MethodList();
		NewCallers.addAll(Callers);
		MethodList FinalCallers = new MethodList();
		
			if(!this.Interfaces.isEmpty()) {
				for(Method2 inter: this.Interfaces) {
					if(!inter.Callers.isEmpty()) {


						NewCallers=NewCallers.AddAll(inter.Callers); 

					}
				}
			}

			if(!this.Superclasses.isEmpty()) {
				for(Method2 superclass: this.Superclasses) {
					if(!superclass.Callers.isEmpty()) {

						NewCallers=NewCallers.AddAll(superclass.Callers); 

					}
				}
			}
			return NewCallers; 
	}
	
	
	
	
	
	
private MethodList RemoveDuplicates(MethodList finalCallers) {
		// TODO Auto-generated method stub
	MethodList FinalCallers2= new MethodList(); 
	
	for(Method2 finalcaller: finalCallers) {
		if(!FinalCallers2.contains(finalcaller)) {
			FinalCallers2.add(finalcaller); 
		}
	}
	return FinalCallers2; 
		
	}
///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////
//////////////////////////////VERSION 3 SMART FILTERING///////////////////////	
///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////
public MethodList getOuterCallers(Requirement requirement) {

	
MethodList FinalCallers=	getCallers(requirement); 
MethodList OuterCallers= new MethodList(); 
for(Method2 FinalCaller: FinalCallers) {
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
for(Method2 FinalCallee: FinalCallees) {
	if(!this.Owner.ID.equals(FinalCallee.Owner.ID)) {
		OuterCallees.add(FinalCallee); 
	}
}

return OuterCallees; 



}
	
	
	
	
	
	
	
	public MethodList getChildrenCallees(Requirement requirement) {
		MethodList NewCallees= new MethodList();

		if(!this.Children.isEmpty()) {


			for(Method2 child: this.Children) {
				if(!child.Callees.isEmpty()) {
					child.CalleeChildFlag=true; 
					NewCallees=	NewCallees.AddAll(child.Callees); 

				}


			}
		}

		NewCallees=RemoveDuplicates(NewCallees); 

		return NewCallees; 
	}
	
	
	
	
	
	public MethodList getImplementationCallees(Requirement requirement) {
		MethodList NewCallees= new MethodList();

		if(!this.Implementations.isEmpty()) {
			for(Method2 imp: this.Implementations) {

				if(!imp.Callees.isEmpty()) {
					NewCallees=NewCallees.AddAll(imp.Callees); 
					imp.CalleeImplementationFlag=true; 
				}


			}


		}

		NewCallees=RemoveDuplicates(NewCallees); 


		return NewCallees; 
	}
	
	
	
	public MethodList getInterfaceCallers(Requirement requirement) {
		MethodList NewCallers= new MethodList();
		if(!this.Interfaces.isEmpty()) {
			for(Method2 inter: this.Interfaces) {
				if(!inter.Callers.isEmpty()) {


					NewCallers=NewCallers.AddAll(inter.Callers); 

				}
			}
		}

		NewCallers=RemoveDuplicates(NewCallers); 

		return NewCallers; 
	}
	public MethodList getSuperclassCallers(Requirement requirement) {
		MethodList NewCallers= new MethodList();
	if(!this.Superclasses.isEmpty()) {
		for(Method2 superclass: this.Superclasses) {
			if(!superclass.Callers.isEmpty()) {

				NewCallers=NewCallers.AddAll(superclass.Callers); 

			}
		}
	}		
	NewCallers=RemoveDuplicates(NewCallers); 

	return NewCallers; 
	}
	
	
	
	public void setCallers(MethodList callers) {
		Callers = callers;
	}
	
	/////////////////////////////////////////////////////////////////////////
	public MethodList getCallees(Requirement requirement) {
		// TODO Auto-generated method stub
		if(AlgoFinal.ExtendedFlag==true) {
			return this.getExtendedCallees2(requirement); 
		}
		else if(AlgoFinal.BasicFlag==true) {
			return this.getBasicCallees(requirement); 

		}
		else if(AlgoFinal.RecursiveCallFlag==true) {
			return this.getOuterCalleesFinal(requirement); 

		}
		return null;
		
	}
/////////////////////////////////////////////////////////////////////////////////

//	private MethodList getExtendedCallees2(Requirement requirement) {
//		// TODO Auto-generated method stub
//		MethodList NewCallees= new MethodList(); 
//		return getExtendedCalleesRec( requirement, NewCallees);
//		
//	}
	
	private MethodList getExtendedCallees2(Requirement requirement) {
		if(NewCallees==null) {
			MethodList NewCallees= new MethodList();
			 MethodList NewCallees2= new MethodList(); 

			 
					NewCallees.addAll(this.Callees); 
					MethodList list=new MethodList();
					MethodList list2=new MethodList();

					for(Method2 callee: this.Callees) {
						//callee is inside the box and caller is outside the box 
						constructBox(callee, NewCallees, list); 

					}
					
					//caller is inside the box and callees are outside 
					constructBox(this, NewCallees2, list2); 
					for(Method2 newCallee: NewCallees2) {
						NewCallees.addAll(newCallee.Callees); 
					}

					System.out.println(NewCallees);
			 
		
		}
		if(NewCallees==null) {
			NewCallees= new MethodList(); 
		}
		return NewCallees; 
	}
	
	private MethodList constructBox(Method2 newcallee, MethodList NewCallees, MethodList list) {
	// TODO Auto-generated method stub
		//callee is an interface that posesses implementations
		System.out.println(newcallee);
		if(list.contains(newcallee)) {
			return NewCallees;
		}list.add(newcallee);
		if(!newcallee.Implementations.isEmpty()|| !newcallee.Interfaces.isEmpty()|| !newcallee.Superclasses.isEmpty()|| !newcallee.Children.isEmpty()) {
			for(Method2 callee2: newcallee.Implementations) {
				NewCallees.add(callee2); 
				callee2.constructBox(callee2, NewCallees, list); 
			}
			for(Method2 callee2: newcallee.Interfaces) {

				NewCallees.add(callee2); 

				callee2.constructBox(callee2, NewCallees, list); 

			}
			for(Method2 callee2: newcallee.Superclasses) {
				NewCallees.add(callee2); 

				callee2.constructBox(callee2, NewCallees, list); 

			}
			for(Method2 callee2: newcallee.Children) {
				NewCallees.add(callee2); 
				callee2.constructBox(callee2, NewCallees, list); 

			}
			}
		System.out.println(NewCallees.size());
		NewCallees=	RemoveDuplicates(NewCallees);
		return NewCallees; 
	
}
	/////////////////////////////////////////////////////////////////////////

	public MethodList getCallers(Requirement requirement) {
		// TODO Auto-generated method stub
		if(AlgoFinal.ExtendedFlag==true) {
			return this.getExtendedCallers2(requirement); 
		}
		else if(AlgoFinal.BasicFlag==true) {
			return this.getBasicCallers(requirement); 

		}
		else if(AlgoFinal.RecursiveCallFlag==true) {
			return this.getOuterCallersFinal(requirement); 

		}
		return null;
	}
/////////////////////////////////////////////////////////////////////////////////
	private MethodList getExtendedCallers2(Requirement requirement) {
		// TODO Auto-generated method stub
		MethodList NewCallers= new MethodList(); 

		NewCallers.addAll(this.Callers); 
		
		for(Method2 caller: this.Callers) {
			//caller is an implementation that possesses an interface  
			NewCallers.addAll(caller.Interfaces); 
			NewCallers.addAll(caller.Implementations); 
			//caller is a child that possesses a superclass 
			NewCallers.addAll(caller.Superclasses); 
			NewCallers.addAll(caller.Children); 

		}
		
		//current method is an implementation that possesses interfaces 
		for(Method2 interfacemethod: this.Interfaces) {
//			NewCallers.add(interfacemethod); 
			NewCallers.addAll(interfacemethod.Callers); 
		}
		//current method is a child that possesses superclasses 
		for(Method2 superclassmethod: this.Superclasses) {
//			NewCallers.add(superclassmethod); 
			NewCallers.addAll(superclassmethod.Callers); 
		}
		
		for(Method2 imp: this.Implementations) {
//			NewCallers.add(interfacemethod); 
			NewCallers.addAll(imp.Callers); 
		}

		for(Method2 child: this.Children) {
//			NewCallers.add(superclassmethod); 
			NewCallers.addAll(child.Callers); 
		}
		return NewCallers;
	}
/////////////////////////////////////////////////////////////////////////////////

	public MethodList getBasicCallers(Requirement requirement) {
		// TODO Auto-generated method stub
		return this.Callers; 
	}
	
	public MethodList getBasicCallees(Requirement requirement) {
		// TODO Auto-generated method stub
		return this.Callees; 
	}






}