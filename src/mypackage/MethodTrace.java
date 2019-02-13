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
	/************************************************************************************************************************************************/
	public void UpdateCallersCallees(LinkedHashMap<String, LogInfo> LogInfoHashMap)
			
			
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
		
		
		
		
		String reqMethod=this.Requirement.ID+"-"+this.Method.ID; 
		
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		//CALLERS 
		for(Method caller: this.Method.Callers) {
			Callers.add(caller.toString()); 
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
		////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////
		//CALLEES
		for(Method callee: this.Method.Callees) {
			Callees.add(callee.toString()); 
			if(callee.Owner.ID.equals(this.Method.Owner.ID)) {
				CalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+callee.ID).getPrediction().toLowerCase()); 

			}else {
				CalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+callee.ID).getPrediction()); 
			}
			if(callee.Owner.ID.equals(this.Method.Owner.ID)) {
				CalleesOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+callee.Owner.ID).DeveloperGold.toLowerCase()); 
			}else {
				CalleesOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+callee.Owner.ID).DeveloperGold); 
			}
			
		}
			////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////
		//CALLERS OF INTERFACES 
		if(!this.Method.Interfaces.isEmpty()) {
			for(Method inter: this.Method.Interfaces) {
				if(!inter.Callers.isEmpty()) {
					for(mypackage.Method interCaller: inter.Callers) {
						InterfaceCallers.add(interCaller.toString()); 
						if(interCaller.Owner.ID.equals(this.Method.Owner.ID)) {
							InterfaceCallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+interCaller.ID).getPrediction().toLowerCase()); 

						}else {
							InterfaceCallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+interCaller.ID).getPrediction()); 
						}
						if(interCaller.Owner.ID.equals(this.Method.Owner.ID)) {
							InterfaceCallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+interCaller.Owner.ID).DeveloperGold.toLowerCase()); 

						}else {
							InterfaceCallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+interCaller.Owner.ID).DeveloperGold); 
						}
					
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
								if(impCallee.Owner.ID.equals(this.Method.Owner.ID)) {
										ImplementationCalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+impCallee.ID).getPrediction().toLowerCase()); 
		
								}else {
									ImplementationCalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+impCallee.ID).getPrediction()); 
								}
								if(impCallee.Owner.ID.equals(this.Method.Owner.ID)) {
									ImplementationCalleesOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+impCallee.Owner.ID).DeveloperGold.toLowerCase()); 

								}else {
									ImplementationCalleesOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+impCallee.Owner.ID).DeveloperGold); 
								}
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
						if(superclassCaller.Owner.ID.equals(this.Method.Owner.ID)) {
							SuperclassCallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+superclassCaller.ID).getPrediction().toLowerCase()); 

						}else {
							SuperclassCallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+superclassCaller.ID).getPrediction()); 
						}
						if(superclassCaller.Owner.ID.equals(this.Method.Owner.ID)) {
							SuperclassCallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+superclassCaller.Owner.ID).DeveloperGold.toLowerCase()); 

						}else {
							SuperclassCallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+superclassCaller.Owner.ID).DeveloperGold); 
						}
					
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
						if(ChildrenCallee.Owner.ID.equals(this.Method.Owner.ID)) {
							ChildrenCalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+ChildrenCallee.ID).getPrediction().toLowerCase()); 

							}else {
								ChildrenCalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+ChildrenCallee.ID).getPrediction()); 
							}
						if(ChildrenCallee.Owner.ID.equals(this.Method.Owner.ID)) {
							ChildrenCalleesOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+ChildrenCallee.Owner.ID).DeveloperGold.toLowerCase()); 

						}else {
							ChildrenCalleesOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+ChildrenCallee.Owner.ID).DeveloperGold); 
						}
						}

				}
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//CALLERS OF CALLERS 
for(Method caller: this.Method.Callers) {
	for(mypackage.Method callerofcaller: caller.Callers) {
		CallersofCallers.add(callerofcaller.toString()); 
		
		if(callerofcaller.Owner.ID.equals(this.Method.Owner.ID)) {
			CallersofCallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+callerofcaller.ID).getPrediction().toLowerCase()); 

		}else {
			CallersofCallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+callerofcaller.ID).getPrediction()); 
		}
		
		if(callerofcaller.Owner.ID.equals(this.Method.Owner.ID)) {
			CallersofCallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+callerofcaller.Owner.ID).DeveloperGold.toLowerCase()); 
		}else {
			CallersofCallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+callerofcaller.Owner.ID).DeveloperGold); 
		}
		
		//SUPERCLASS CALLERS OF CALLERS 
		if(!callerofcaller.Superclasses.isEmpty()) {
			for(mypackage.Method callerofcallerSuperclass: callerofcaller.Superclasses) {
				SuperclassCallersofCallers.add(callerofcallerSuperclass.toString()); 
				if(callerofcallerSuperclass.Owner.ID.equals(this.Method.Owner.ID)) {
					SuperclassCallersofCallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+callerofcallerSuperclass.ID).getPrediction().toLowerCase()); 

				}else {
					SuperclassCallersofCallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+callerofcallerSuperclass.ID).getPrediction()); 

				}
				if(callerofcallerSuperclass.Owner.ID.equals(this.Method.Owner.ID)) {
					SuperclassCallersofCallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+callerofcallerSuperclass.Owner.ID).DeveloperGold.toLowerCase()); 
				}else {
					SuperclassCallersofCallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+callerofcallerSuperclass.Owner.ID).DeveloperGold); 
				}
				
			}
		}
		//INTERFACE CALLERS OF CALLERS 
		if(!callerofcaller.Interfaces.isEmpty()) {
			for(mypackage.Method callerofcallerInterface: callerofcaller.Interfaces) {
				InterfaceCallersofCallers.add(callerofcallerInterface.toString()); 
				if(callerofcallerInterface.Owner.ID.equals(this.Method.Owner.ID)) {
					InterfaceCallersofCallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+callerofcallerInterface.ID).getPrediction().toLowerCase()); 

				}else {
					InterfaceCallersofCallersPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+callerofcallerInterface.ID).getPrediction()); 

				}
				if(callerofcallerInterface.Owner.ID.equals(this.Method.Owner.ID)) {
					InterfaceCallersofCallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+callerofcallerInterface.Owner.ID).DeveloperGold.toLowerCase()); 
				}else {
					InterfaceCallersofCallersOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+callerofcallerInterface.Owner.ID).DeveloperGold); 
				}
				
			}
		}
	}
	
	
}
////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
//CALLEES OF CALLEES 
for(Method callee: this.Method.Callees) {
for(mypackage.Method calleeofcallee: callee.Callees) {
	CalleesofCallees.add(calleeofcallee.toString()); 
	if(calleeofcallee.Owner.ID.equals(this.Method.Owner.ID)) {
		CalleesofCalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+calleeofcallee.ID).getPrediction().toLowerCase()); 

	}else {
		CalleesofCalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+calleeofcallee.ID).getPrediction()); 
	}
	if(calleeofcallee.Owner.ID.equals(this.Method.Owner.ID)) {
		CalleesofCalleesOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+calleeofcallee.Owner.ID).DeveloperGold.toLowerCase()); 
	}else {
		CalleesofCalleesOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+calleeofcallee.Owner.ID).DeveloperGold); 
	}
	
	
	//CHILDREN CALLEES OF CALLEES 
	if(!calleeofcallee.Children.isEmpty()) {
		for(mypackage.Method calleeofcalleeChildren: calleeofcallee.Superclasses) {
			ChildrenCalleesofCallees.add(calleeofcalleeChildren.toString()); 
			if(calleeofcalleeChildren.Owner.ID.equals(this.Method.Owner.ID)) {
				ChildrenCalleesofCalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+calleeofcalleeChildren.ID).getPrediction().toLowerCase()); 

			}else {
				ChildrenCalleesofCalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+calleeofcalleeChildren.ID).getPrediction()); 

			}
			if(calleeofcalleeChildren.Owner.ID.equals(this.Method.Owner.ID)) {
				ChildrenCalleesofCalleesOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+calleeofcalleeChildren.Owner.ID).DeveloperGold.toLowerCase()); 
			}else {
				ChildrenCalleesofCalleesOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+calleeofcalleeChildren.Owner.ID).DeveloperGold); 
			}
			
		}
	}
	//IMPLEMENTATION CALLEES OF CALLEES 
	if(!calleeofcallee.Implementations.isEmpty()) {
		for(mypackage.Method calleeofcalleeImp: calleeofcallee.Implementations) {
			ImplementationCalleesofCallees.add(calleeofcalleeImp.toString()); 
			if(calleeofcalleeImp.Owner.ID.equals(this.Method.Owner.ID)) {
				ImplementationCalleesofCalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+calleeofcalleeImp.ID).getPrediction().toLowerCase()); 

			}else {
				ImplementationCalleesofCalleesPredictions.add(AlgoFinal.methodtraces2HashMap.get(this.Requirement.ID+"-"+calleeofcalleeImp.ID).getPrediction()); 

			}
			if(calleeofcalleeImp.Owner.ID.equals(this.Method.Owner.ID)) {
				ImplementationCalleesofCalleesOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+calleeofcalleeImp.Owner.ID).DeveloperGold.toLowerCase()); 
			}else {
				ImplementationCalleesofCalleesOwners.add(DatabaseInput.classTraceHashMap.get(this.Requirement.ID+"-"+calleeofcalleeImp.Owner.ID).DeveloperGold); 
			}
			
		}
	}
	
}


}
		
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallers(Callers);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersOwners(CallersOwners);
		LogInfoHashMap.get(this.Requirement.ID+"-"+this.Method.ID).setCallersPredictions(CallersPredictions);

		
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
	@Override
	public String toString() {
		return "MethodTrace [Method=" + Method.toString() + ", Requirement=" + Requirement + ", gold=" + gold + ", prediction="
				+ prediction + ", goldfinal=" + goldfinal + "]";
	}
	

}