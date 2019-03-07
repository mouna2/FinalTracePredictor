package mypackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import ALGO.AlgoFinal;
import ALGO.DatabaseInput;
import ALGO.MethodList;
import ALGO.OwnerClassList;
import Chess.LogInfo;
import spoon.pattern.internal.SubstitutionRequestProvider;

public final class MethodTrace {
	public static boolean modified = false;
	public Method Method= new Method();
	public Requirement Requirement=new Requirement();
	public String gold;
	public String prediction; 
	public String goldfinal;
	public String likelihood;
	public String why;
	boolean SubjectDeveloperEqualityFlag;
	

	public boolean TraceSet; 

	


	




	
	
	
	

	public boolean isSubjectDeveloperEqualityFlag() {
		return SubjectDeveloperEqualityFlag;
	}

	public String getPrediction() {
		return prediction;
	}



	public void setPrediction(String prediction) {
		this.prediction = prediction;
	}


	public void setSubjectDeveloperEqualityFlag(boolean subjectDeveloperEqualityFlag) {
		SubjectDeveloperEqualityFlag = subjectDeveloperEqualityFlag;
	}



	public boolean isTraceSet() {
		return TraceSet;
	}



	public void setTraceSet(boolean traceSet) {
		TraceSet = traceSet;
	}




	
	
	
	
	
	



	


	public MethodTrace() {
		
	}

	public Method getMethod() {
		return Method;
	}

	public void setMethod(Method method) {
		Method = method;
	}

	public Requirement getRequirement() {
		return Requirement;
	}

	public void setRequirement(Requirement requirement) {
		Requirement = requirement;
	}

	

	public String getGold() {
		return gold;
	}

	public void setGold(String gold) {
		this.gold = gold;
	}

	
	





	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////


	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	public void SetPrediction(LinkedHashMap<String, LogInfo> LogInfoHashMap, String Pred, String reason)
			
			
			{

		if(this.prediction.trim().equals("E")) {
			
		
			this.prediction=Pred; 

			modified=true; 
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).getIterationValues().add(reason);
			
		}


		
		
	

		
		
	}
	/************************************************************************************************************************************************/
	/**
	 * @throws CloneNotSupportedException **********************************************************************************************************************************************/
	public void UpdateCallersCallees(LinkedHashMap<String, LogInfo> LogInfoHashMap) throws CloneNotSupportedException
			
			
			{
		// TODO Auto-generated method stub
		List<String> Callers= new ArrayList<String>(); 
		List<String> CallersPredictions= new ArrayList<String>(); 
		List<String> CallersOwners= new ArrayList<String>(); 
		List<String> CallersofCallers= new ArrayList<String>(); 
		List<String> CallersofCallersPredictions= new ArrayList<String>(); 
		List<String> CallersofCallersOwners= new ArrayList<String>(); 
		List<String> InterfaceCallers= new ArrayList<String>(); 
		List<String> InterfaceCallersPredictions= new ArrayList<String>(); 
		List<String> InterfaceCallersOwners= new ArrayList<String>(); 
		List<String> SuperclassCallers= new ArrayList<String>(); 
		List<String> SuperclassCallersPredictions= new ArrayList<String>(); 
		List<String> SuperclassCallersOwners= new ArrayList<String>(); 
		List<String> InterfaceCallersofCallers= new ArrayList<String>(); 
		List<String> InterfaceCallersofCallersPredictions= new ArrayList<String>(); 
		List<String> InterfaceCallersofCallersOwners= new ArrayList<String>(); 
		List<String> SuperclassCallersofCallers= new ArrayList<String>(); 
		List<String> SuperclassCallersofCallersPredictions= new ArrayList<String>(); 
		List<String> SuperclassCallersofCallersOwners= new ArrayList<String>(); 
		List<String> OuterCallersFinal= new ArrayList<String>(); 
		List<String> OuterCallersFinalPredictions= new ArrayList<String>(); 
		List<String> OuterCallersFinalOwners= new ArrayList<String>(); 

		
		List<String> Callees= new ArrayList<String>(); 
		List<String> CalleesPredictions= new ArrayList<String>(); 
		List<String> CalleesOwners= new ArrayList<String>(); 		
		List<String> CalleesofCallees= new ArrayList<String>(); 
		List<String> CalleesofCalleesPredictions= new ArrayList<String>(); 
		List<String> CalleesofCalleesOwners= new ArrayList<String>(); 
		List<String> ImplementationCallees= new ArrayList<String>(); 
		List<String> ImplementationCalleesPredictions= new ArrayList<String>(); 
		List<String> ImplementationCalleesOwners= new ArrayList<String>(); 
		List<String> ChildrenCallees= new ArrayList<String>(); 
		List<String> ChildrenCalleesPredictions= new ArrayList<String>(); 
		List<String> ChildrenCalleesOwners= new ArrayList<String>(); 
		List<String> ImplementationCalleesofCallees= new ArrayList<String>(); 
		List<String> ImplementationCalleesofCalleesPredictions= new ArrayList<String>(); 
		List<String> ImplementationCalleesofCalleesOwners= new ArrayList<String>(); 
		List<String> ChildrenCalleesofCallees= new ArrayList<String>(); 
		List<String> ChildrenCalleesofCalleesPredictions= new ArrayList<String>(); 
		List<String> ChildrenCalleesofCalleesOwners= new ArrayList<String>(); 
		List<String> OuterCalleesFinal= new ArrayList<String>(); 
		List<String> OuterCalleesFinalPredictions= new ArrayList<String>(); 
		List<String> OuterCalleesFinalOwners= new ArrayList<String>(); 
		List<String> ExtendedCallees= new ArrayList<String>(); 
		List<String> ExtendedCalleesPredictions= new ArrayList<String>(); 
		List<String> ExtendedCallers= new ArrayList<String>(); 
		List<String> ExtendedCallersPredictions= new ArrayList<String>(); 
		
		String reqMethod=this.Requirement.ID+"-"+this.Method.ID; 
		
		
		
//		////////////////////////////////////////////////////////////////////////////////////////////
//		////////////////////////////////////////////////////////////////////////////////////////////
//		//CALLERS 
//		for(Method caller: this.Method.Callers) {
//			Callers.add(caller.toString()); 
//			SetPredictionsSetOwners(caller, this, CallersPredictions, CallersOwners); 
//			
//			
//		}
//		////////////////////////////////////////////////////////////////////////////////////////////
//		////////////////////////////////////////////////////////////////////////////////////////////
//		//CALLEES
//		for(Method callee: this.Method.Callees) {
//			Callees.add(callee.toString()); 
//			SetPredictionsSetOwners(callee, this, CalleesPredictions, CalleesOwners); 
//
//			
//			
//		}
//		
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLERS INTERFACES 
//			for(Method caller: this.Method.CallersInterfaces) {
//					InterfaceCallers.add(caller.toString()); 
//					SetPredictionsSetOwners(caller, this, InterfaceCallersPredictions, InterfaceCallersOwners); 
//			}
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLERS INTERFACES 
//			for(Method caller: this.Method.CallersInterfaces) {
//				SuperclassCallers.add(caller.toString()); 
//				SetPredictionsSetOwners(caller, this, SuperclassCallersPredictions, SuperclassCallersOwners); 
//			}
//		
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLEES IMPLEMENTATIONS 
//			for(Method callee: this.Method.CalleesImplementations) {
//				ImplementationCallees.add(callee.toString()); 
//				SetPredictionsSetOwners(callee, this, ImplementationCalleesPredictions, ImplementationCalleesOwners); 
//			}
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLEES CHILDREN  
//			for(Method callee: this.Method.CalleesChildren) {
//				ChildrenCallees.add(callee.toString()); 
//				SetPredictionsSetOwners(callee, this, ChildrenCalleesPredictions, ChildrenCalleesOwners); 
//			}
//		
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLEES OF CALLEES   
//			for(Method callee: this.Method.CalleesofCallees) {
//				CalleesofCallees.add(callee.toString()); 
//				SetPredictionsSetOwners(callee, this, CalleesofCalleesPredictions, CalleesofCalleesOwners); 
//			}
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLEES OF CALLEES IMPLEMENTATIONS 
//			for(Method callee: this.Method.CalleesofCalleesImplementations) {
//				ImplementationCalleesofCallees.add(callee.toString()); 
//				SetPredictionsSetOwners(callee, this, ImplementationCalleesofCalleesPredictions, ImplementationCalleesofCalleesOwners); 
//			}
//			////////////////////////////////////////////////////////////////////////////////////////////
//			////////////////////////////////////////////////////////////////////////////////////////////
//			//CALLEES OF CALLEES CHILDREN  
//			for(Method callee: this.Method.CalleesofCalleesChildren) {
//				ChildrenCalleesofCallees.add(callee.toString()); 
//				SetPredictionsSetOwners(callee, this, ChildrenCalleesofCalleesPredictions, ChildrenCalleesofCalleesOwners); 
//			}
//		////////////////////////////////////////////////////////////////////////////////////////////
//		////////////////////////////////////////////////////////////////////////////////////////////
//		//CALLERS OF CALLERS   
//		for(Method caller: this.Method.CallersofCallers) {
//			CallersofCallers.add(caller.toString()); 
//			SetPredictionsSetOwners(caller, this, CallersofCallersPredictions, CallersofCallersOwners); 
//		}
//		////////////////////////////////////////////////////////////////////////////////////////////
//		////////////////////////////////////////////////////////////////////////////////////////////
//		//CALLERS OF CALLERS SUPERCLASSES
//		for(Method callee: this.Method.CallersofCallersSuperclasses) {
//			SuperclassCallersofCallers.add(callee.toString()); 
//			SetPredictionsSetOwners(callee, this, SuperclassCallersofCallersPredictions, SuperclassCallersofCallersOwners); 
//		}
//		////////////////////////////////////////////////////////////////////////////////////////////
//		////////////////////////////////////////////////////////////////////////////////////////////
//		//CALLERS OF CALLERS INTERFACES 
//		for(Method caller: this.Method.CallersofCallersInterfaces) {
//			InterfaceCallersofCallers.add(caller.toString()); 
//			SetPredictionsSetOwners(caller, this, InterfaceCallersofCallersPredictions, InterfaceCallersofCallersOwners); 
//		}
		
		
		
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		//CALLERS 
		for(Method caller: this.Method.Callers) {
			Callers.add(caller.toString()); 
			SetPredictionsSetOwners(caller, this, CallersPredictions, CallersOwners); 
			
			
		}
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		//CALLEES
		for(Method callee: this.Method.Callees) {
			Callees.add(callee.toString()); 
			SetPredictionsSetOwners(callee, this, CalleesPredictions, CalleesOwners); 

			
			
		}
			////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////
		//CALLERS OF INTERFACES 
		if(!this.Method.Interfaces.isEmpty()) {
			for(Method inter: this.Method.Interfaces) {
				if(!inter.Callers.isEmpty()) {
					for(mypackage.Method interCaller: inter.Callers) {
						InterfaceCallers.add(interCaller.toString()); 
						SetPredictionsSetOwners(interCaller, this, InterfaceCallersPredictions, InterfaceCallersOwners); 

					
					
					}

				}
			}
		}
		
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//CALLEES OF IMPLEMENTATIONS
if(!this.Method.Implementations.isEmpty()) {
		for(Method imp: this.Method.Implementations) {
			if(!imp.Callees.isEmpty()) {
					for(mypackage.Method impCallee: imp.Callees) {
							ImplementationCallees.add(impCallee.toString()); 
							SetPredictionsSetOwners(impCallee, this, ImplementationCalleesPredictions, ImplementationCalleesOwners); 

							
							
								}
		
							}
			}
}
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		//CALLERS OF SUPERCLASSES 
		if(!this.Method.Superclasses.isEmpty()) {
			for(Method superclass: this.Method.Superclasses) {
				if(!superclass.Callers.isEmpty()) {
					for(mypackage.Method superclassCaller: superclass.Callers) {
						SuperclassCallers.add(superclassCaller.toString()); 
						
						SetPredictionsSetOwners(superclassCaller, this, SuperclassCallersPredictions, SuperclassCallersOwners); 
						
					
					}

				}
			}
		}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//CALLEES OF CHILDREN 
if(!this.Method.Children.isEmpty()) {
		for(Method children: this.Method.Children) {
				if(!children.Callees.isEmpty()) {
						for(mypackage.Method ChildrenCallee: children.Callees) {
							
								ChildrenCallees.add(ChildrenCallee.toString()); 
								SetPredictionsSetOwners(ChildrenCallee, this, ChildrenCalleesPredictions, ChildrenCalleesOwners); 

					
						}

				}
		}
	}



////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//CALLERS OF CALLERS 
for(Method caller: this.Method.getCallersAugmentedInterfacesSuperclasses(Requirement)) {
	
		for(mypackage.Method callerofcaller: caller.Callers) {
			CallersofCallers.add(callerofcaller.toString()); 
			SetPredictionsSetOwners(callerofcaller, this, CallersofCallersPredictions, CallersofCallersOwners); 

			
			
			//SUPERCLASS CALLERS OF CALLERS 
			if(!callerofcaller.Superclasses.isEmpty()) {
				for(mypackage.Method callerofcallerSuperclass: callerofcaller.Superclasses) {
					for(mypackage.Method CallerCallerSuperclass: callerofcallerSuperclass.Callers) {

					SuperclassCallersofCallers.add(CallerCallerSuperclass.toString());
					SetPredictionsSetOwners(CallerCallerSuperclass, this, SuperclassCallersofCallersPredictions, SuperclassCallersofCallersOwners); 

					}
					
				}
			}
			//INTERFACE CALLERS OF CALLERS 
			if(!callerofcaller.Interfaces.isEmpty()) {
				for(mypackage.Method callerofcallerInterface: callerofcaller.Interfaces) {
					for(mypackage.Method CallerCallerInterface: callerofcallerInterface.Callers) {
						InterfaceCallersofCallers.add(CallerCallerInterface.toString()); 
						SetPredictionsSetOwners(CallerCallerInterface, this, InterfaceCallersofCallersPredictions, InterfaceCallersofCallersOwners); 
					}
				

				
					
				}
			}
		}
	

	
	
}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//CALLEES OF CALLEES 
for(Method callee: this.Method.getCalleesAugmentedChildrenImplementations(Requirement)) {
			for(mypackage.Method calleeofcallee: callee.Callees) {
//				System.out.println(calleeofcallee.toString());
					CalleesofCallees.add(calleeofcallee.toString()); 
					SetPredictionsSetOwners(calleeofcallee, this, CalleesofCalleesPredictions, CalleesofCalleesOwners); 

					
		
		
		//CHILDREN CALLEES OF CALLEES 
		if(!calleeofcallee.Children.isEmpty()) {
			for(mypackage.Method calleeofcalleeChildren: calleeofcallee.Superclasses) {
				for(mypackage.Method calleeofcalleeChild: calleeofcalleeChildren.Callees) {
					ChildrenCalleesofCallees.add(calleeofcalleeChild.toString()); 
					SetPredictionsSetOwners(calleeofcalleeChild, this, ChildrenCalleesofCalleesPredictions, ChildrenCalleesofCalleesOwners); 
				}
				

				
			}
		}
		//IMPLEMENTATION CALLEES OF CALLEES 
		if(!calleeofcallee.Implementations.isEmpty()) {
			for(mypackage.Method calleeofcalleeImp: calleeofcallee.Implementations) {
				for(mypackage.Method calleeofcalleeImplementation: calleeofcalleeImp.Callees) {
				ImplementationCalleesofCallees.add(calleeofcalleeImplementation.toString()); 
				SetPredictionsSetOwners(calleeofcalleeImplementation, this, ImplementationCalleesofCalleesPredictions, ImplementationCalleesofCalleesOwners); 
				}
			
				
			}
		}
		
	}
		

}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//FINAL CALLERS 
for(Method caller: this.Method.getOuterCallersFinal(Requirement)) {
OuterCallersFinal.add(caller.toString()); 
SetPredictionsSetOwners(caller, this, OuterCallersFinalPredictions, OuterCallersFinalOwners); 


}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//FINAL CALLEES
for(Method callee: this.Method.getOuterCalleesFinal(Requirement)) {
OuterCalleesFinal.add(callee.toString()); 
SetPredictionsSetOwners(callee, this, OuterCalleesFinalPredictions, OuterCalleesFinalOwners); 



}	

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//FINAL CALLEES
for(Method callee: this.Method.getCallersShell()) {
	ExtendedCallees.add(callee.toString()); 
	ExtendedCalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+callee.ID).getPrediction()); 


}	

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//FINAL CALLEES
for(Method caller: this.Method.getCalleesShell()) {
ExtendedCallers.add(caller.toString()); 
ExtendedCallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+caller.ID).getPrediction()); 


}		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setPrediction(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+this.Method.ID).prediction);

			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedCallersFinal(ExtendedCallers);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedCallersPredictionsFinal(ExtendedCallersPredictions);
			
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedCalleesFinal(ExtendedCallees);
			LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setExtendedCalleesPredictionsFinal(ExtendedCalleesPredictions);


		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setOuterCallersFinal(OuterCallersFinal);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setOuterCallersPredictionsFinal(OuterCallersFinalPredictions);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setOuterCallersOwnersFinal(OuterCallersFinalOwners);
		
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setOuterCalleesFinal(OuterCalleesFinal);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setOuterCalleesPredictionsFinal(OuterCalleesFinalPredictions);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setOuterCalleesOwnersFinal(OuterCalleesFinalOwners);



		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallers(Callers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersOwners(CallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersPredictions(CallersPredictions);

		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersCallers(CallersofCallers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersCallersOwners(CallersofCallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersCallersPredictions(CallersofCallersPredictions);
		

		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersCallers(CallersofCallers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersCallersOwners(CallersofCallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersCallersPredictions(CallersofCallersPredictions);
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallees(Callees);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCalleesOwners(CalleesOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCalleesPredictions(CalleesPredictions);

		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCalleesCallees(CalleesofCallees);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCalleesCalleesOwners(CalleesofCalleesOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCalleesCalleesPredictions(CalleesofCalleesPredictions);
		
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setInterfaceCallers(InterfaceCallers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setInterfaceCallersOwners(InterfaceCallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setInterfaceCallerPredictions(InterfaceCallersPredictions);

		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenCallees(ChildrenCallees);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenCalleesOwners(ChildrenCalleesOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenCalleePredictions(ChildrenCalleesPredictions);
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationCallees(ImplementationCallees);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationCalleesOwners(ImplementationCalleesOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationCalleePredictions(ImplementationCalleesPredictions);
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setSuperclassCallers(SuperclassCallers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setSuperclassCallersOwners(SuperclassCallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setSuperclassCallerPredictions(SuperclassCallersPredictions);
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setInterfacesCallersCallers(InterfaceCallersofCallers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setInterfacesCallersCallersOwners(InterfaceCallersofCallersOwners); 
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setInterfacesCallersCallersPredictions(InterfaceCallersofCallersPredictions);

		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setSuperclassesCallersCallers(SuperclassCallersofCallers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setSuperclassesCallersCallersOwners(SuperclassCallersofCallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setSuperclassesCallersCallersPredictions(SuperclassCallersofCallersPredictions);
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenCalleesCallees(ChildrenCalleesofCallees);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenCalleesCalleesOwners(ChildrenCalleesofCalleesOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setChildrenCalleesCalleesPredictions(ChildrenCalleesofCalleesPredictions);
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationCalleesCallees(ImplementationCalleesofCallees);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationCalleesCalleesOwners(ImplementationCalleesofCalleesOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setImplementationCalleesCalleesPredictions(ImplementationCalleesofCalleesPredictions);
		
	}
	private void SetPredictionsSetOwners(mypackage.Method caller, MethodTrace methodTrace, List<String> CallersPredictions, List<String> CallersOwners) {
		// TODO Auto-generated method stub
		if(caller.Owner.ID.equals(this.Method.Owner.ID)) {
			CallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+caller.ID).getPrediction().toLowerCase()); 

		}else {
			CallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+caller.ID).getPrediction()); 
		}
		if(caller.Owner.ID.equals(this.Method.Owner.ID)) {
			CallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+caller.Owner.ID).DeveloperGold.toLowerCase()); 
		}else {
			CallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+caller.Owner.ID).DeveloperGold); 
		}
	}

	@Override
	public String toString() {
		return "MethodTrace [Method=" + Method.toString() + ", Requirement=" + Requirement + ", gold=" + gold + ", prediction="
				+ prediction + ", goldfinal=" + goldfinal + "]";
	}
	

}