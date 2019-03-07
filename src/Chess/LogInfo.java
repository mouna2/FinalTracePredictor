package Chess;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.jdt.core.search.MethodNameMatch;

import ALGO.AlgoFinal;
import ALGO.DatabaseInput;
import ALGO.MethodList;
import ALGO.PredictionValues;
import Tables.methodcalls;
import mypackage.ClassTrace2;
import mypackage.Method;
import mypackage.MethodTrace;
import mypackage.Requirement;

public class LogInfo {
	String MethodID; 
	String MethodName; 
	String RequirementID; 
	String RequirementName; 
	String ClassID; 
	String ClassName; 
	String TraceValue;
	String TraceClassOldValue; 
	String TraceClassNewValue; 
	String Prediction; 
	public String PrecisionRecall; 
	String GoldFinal; 
	String SubjectGold; 
	List<String> IterationValues= new ArrayList<String>();
	boolean SubjectDeveloperEqualityFlag; 
	String Reason; 
	
	
	List<String> ExtendedCallersText;
	
	List<String> ClassCalleesOwnerClasses;
	List<String> ClassCallersOwnerClasses;
	int ClassMethodsSize=0; 
	
	List<String> Callers; 
	List<String> CallersPredictions; 
	List<String> CallersOwners; 
	
	List<String> Callees; 
	List<String> CalleesPredictions; 
	List<String> CalleesOwners; 
	
	List<String> CallersCallers; 
	List<String> CallersCallersPredictions; 
	List<String> CallersCallersOwners; 
	
	List<String> CalleesCallees; 
	List<String> CalleesCalleesPredictions; 
	List<String> CalleesCalleesOwners; 
	
	List<String> ImplementationCallees;
	List<String> ImplementationCalleePredictions;
	List<String> ImplementationCalleesOwners;

	List<String> InterfaceCallers;
	List<String> InterfaceCallerPredictions;
	List<String> InterfaceCallersOwners;

	List<String> ChildrenCallees;
	List<String> ChildrenCalleePredictions;
	List<String> ChildrenCalleesOwners;

	List<String> SuperclassCallers;
	List<String> SuperclassCallerPredictions;
	List<String> SuperclassCallersOwners;

	
	List<String> InterfacesCallersCallers; 
	List<String> InterfacesCallersCallersPredictions; 
	List<String> InterfacesCallersCallersOwners; 
	
	List<String> ImplementationCalleesCallees; 
	List<String> ImplementationCalleesCalleesPredictions; 
	List<String> ImplementationCalleesCalleesOwners; 
	
	List<String> SuperclassesCallersCallers; 
	List<String> SuperclassesCallersCallersPredictions; 
	List<String> SuperclassesCallersCallersOwners; 
	
	List<String> ChildrenCalleesCallees; 
	List<String> ChildrenCalleesCalleesPredictions; 
	List<String> ChildrenCalleesCalleesOwners; 
	
	
	List<String> OuterCallersFinal; 
	List<String> OuterCallersPredictionsFinal; 
	List<String> OuterCallersOwnersFinal; 
	
	List<String> OuterCalleesFinal; 
	List<String> OuterCalleesPredictionsFinal; 
	List<String> OuterCalleesOwnersFinal; 
	
	public List<String> ExtendedCallersFinal; 
	public List<String> ExtendedCalleesFinal; 
	public List<String> ExtendedCallersPredictionsFinal; 
	public List<String> ExtendedCalleesPredictionsFinal; 
	
	
	
	

	public List<String> getExtendedCallersFinal() {
		return ExtendedCallersFinal;
	}
	public void setExtendedCallersFinal(List<String> extendedCallersFinal) {
		ExtendedCallersFinal = extendedCallersFinal;
	}
	public List<String> getExtendedCalleesFinal() {
		return ExtendedCalleesFinal;
	}
	public void setExtendedCalleesFinal(List<String> extendedCalleesFinal) {
		ExtendedCalleesFinal = extendedCalleesFinal;
	}
	public List<String> getExtendedCallersPredictionsFinal() {
		return ExtendedCallersPredictionsFinal;
	}
	public void setExtendedCallersPredictionsFinal(List<String> extendedCallersPredictionsFinal) {
		ExtendedCallersPredictionsFinal = extendedCallersPredictionsFinal;
	}
	public List<String> getExtendedCalleesPredictionsFinal() {
		return ExtendedCalleesPredictionsFinal;
	}
	public void setExtendedCalleesPredictionsFinal(List<String> extendedCalleesPredictionsFinal) {
		ExtendedCalleesPredictionsFinal = extendedCalleesPredictionsFinal;
	}
	public List<String> getOuterCallersFinal() {
		return OuterCallersFinal;
	}
	public void setOuterCallersFinal(List<String> outerCallersFinal) {
		OuterCallersFinal = outerCallersFinal;
	}
	public List<String> getOuterCallersPredictionsFinal() {
		return OuterCallersPredictionsFinal;
	}
	public void setOuterCallersPredictionsFinal(List<String> outerCallersPredictionsFinal) {
		OuterCallersPredictionsFinal = outerCallersPredictionsFinal;
	}
	public List<String> getOuterCallersOwnersFinal() {
		return OuterCallersOwnersFinal;
	}
	public void setOuterCallersOwnersFinal(List<String> outerCallersOwnersFinal) {
		OuterCallersOwnersFinal = outerCallersOwnersFinal;
	}
	public List<String> getOuterCalleesFinal() {
		return OuterCalleesFinal;
	}
	public void setOuterCalleesFinal(List<String> outerCalleesFinal) {
		OuterCalleesFinal = outerCalleesFinal;
	}
	public List<String> getOuterCalleesPredictionsFinal() {
		return OuterCalleesPredictionsFinal;
	}
	public void setOuterCalleesPredictionsFinal(List<String> outerCalleesPredictionsFinal) {
		OuterCalleesPredictionsFinal = outerCalleesPredictionsFinal;
	}
	public List<String> getOuterCalleesOwnersFinal() {
		return OuterCalleesOwnersFinal;
	}
	public void setOuterCalleesOwnersFinal(List<String> outerCalleesOwnersFinal) {
		OuterCalleesOwnersFinal = outerCalleesOwnersFinal;
	}
	public List<String> getCallersPredictions() {
		return CallersPredictions;
	}
	public void setCallersPredictions(List<String> callersPredictions) {
		CallersPredictions = callersPredictions;
	}
	public List<String> getCallersOwners() {
		return CallersOwners;
	}
	public void setCallersOwners(List<String> callersOwners) {
		CallersOwners = callersOwners;
	}
	public List<String> getCalleesPredictions() {
		return CalleesPredictions;
	}
	public void setCalleesPredictions(List<String> calleesPredictions) {
		CalleesPredictions = calleesPredictions;
	}
	public List<String> getCalleesOwners() {
		return CalleesOwners;
	}
	public void setCalleesOwners(List<String> calleesOwners) {
		CalleesOwners = calleesOwners;
	}
	public List<String> getCallersCallers() {
		return CallersCallers;
	}
	public void setCallersCallers(List<String> callersCallers) {
		CallersCallers = callersCallers;
	}
	public List<String> getCallersCallersPredictions() {
		return CallersCallersPredictions;
	}
	public void setCallersCallersPredictions(List<String> callersCallersPredictions) {
		CallersCallersPredictions = callersCallersPredictions;
	}
	public List<String> getCallersCallersOwners() {
		return CallersCallersOwners;
	}
	public void setCallersCallersOwners(List<String> callersCallersOwners) {
		CallersCallersOwners = callersCallersOwners;
	}
	public List<String> getCalleesCallees() {
		return CalleesCallees;
	}
	public void setCalleesCallees(List<String> calleesCallees) {
		CalleesCallees = calleesCallees;
	}
	public List<String> getCalleesCalleesPredictions() {
		return CalleesCalleesPredictions;
	}
	public void setCalleesCalleesPredictions(List<String> calleesCalleesPredictions) {
		CalleesCalleesPredictions = calleesCalleesPredictions;
	}
	public List<String> getCalleesCalleesOwners() {
		return CalleesCalleesOwners;
	}
	public void setCalleesCalleesOwners(List<String> calleesCalleesOwners) {
		CalleesCalleesOwners = calleesCalleesOwners;
	}
	public List<String> getImplementationCalleesOwners() {
		return ImplementationCalleesOwners;
	}
	public void setImplementationCalleesOwners(List<String> implementationCalleesOwners) {
		ImplementationCalleesOwners = implementationCalleesOwners;
	}
	public List<String> getInterfaceCallersOwners() {
		return InterfaceCallersOwners;
	}
	public void setInterfaceCallersOwners(List<String> interfaceCallersOwners) {
		InterfaceCallersOwners = interfaceCallersOwners;
	}
	public List<String> getChildrenCalleesOwners() {
		return ChildrenCalleesOwners;
	}
	public void setChildrenCalleesOwners(List<String> childrenCalleesOwners) {
		ChildrenCalleesOwners = childrenCalleesOwners;
	}
	public List<String> getSuperclassCallersOwners() {
		return SuperclassCallersOwners;
	}
	public void setSuperclassCallersOwners(List<String> superclassCallersOwners) {
		SuperclassCallersOwners = superclassCallersOwners;
	}
	public List<String> getInterfacesCallersCallers() {
		return InterfacesCallersCallers;
	}
	public void setInterfacesCallersCallers(List<String> interfacesCallersCallers) {
		InterfacesCallersCallers = interfacesCallersCallers;
	}
	public List<String> getInterfacesCallersCallersPredictions() {
		return InterfacesCallersCallersPredictions;
	}
	public void setInterfacesCallersCallersPredictions(List<String> interfacesCallersCallersPredictions) {
		InterfacesCallersCallersPredictions = interfacesCallersCallersPredictions;
	}
	public List<String> getInterfacesCallersCallersOwners() {
		return InterfacesCallersCallersOwners;
	}
	public void setInterfacesCallersCallersOwners(List<String> interfacesCallersCallersOwners) {
		InterfacesCallersCallersOwners = interfacesCallersCallersOwners;
	}
	public List<String> getImplementationCalleesCallees() {
		return ImplementationCalleesCallees;
	}
	public void setImplementationCalleesCallees(List<String> implementationCalleesCallees) {
		ImplementationCalleesCallees = implementationCalleesCallees;
	}
	public List<String> getImplementationCalleesCalleesPredictions() {
		return ImplementationCalleesCalleesPredictions;
	}
	public void setImplementationCalleesCalleesPredictions(List<String> implementationCalleesCalleesPredictions) {
		ImplementationCalleesCalleesPredictions = implementationCalleesCalleesPredictions;
	}
	public List<String> getImplementationCalleesCalleesOwners() {
		return ImplementationCalleesCalleesOwners;
	}
	public void setImplementationCalleesCalleesOwners(List<String> implementationCalleesCalleesOwners) {
		ImplementationCalleesCalleesOwners = implementationCalleesCalleesOwners;
	}
	public List<String> getSuperclassesCallersCallers() {
		return SuperclassesCallersCallers;
	}
	public void setSuperclassesCallersCallers(List<String> superclassesCallersCallers) {
		SuperclassesCallersCallers = superclassesCallersCallers;
	}
	public List<String> getSuperclassesCallersCallersPredictions() {
		return SuperclassesCallersCallersPredictions;
	}
	public void setSuperclassesCallersCallersPredictions(List<String> superclassesCallersCallersPredictions) {
		SuperclassesCallersCallersPredictions = superclassesCallersCallersPredictions;
	}
	public List<String> getSuperclassesCallersCallersOwners() {
		return SuperclassesCallersCallersOwners;
	}
	public void setSuperclassesCallersCallersOwners(List<String> superclassesCallersCallersOwners) {
		SuperclassesCallersCallersOwners = superclassesCallersCallersOwners;
	}
	public List<String> getChildrenCalleesCallees() {
		return ChildrenCalleesCallees;
	}
	public void setChildrenCalleesCallees(List<String> childrenCalleesCallees) {
		ChildrenCalleesCallees = childrenCalleesCallees;
	}
	public List<String> getChildrenCalleesCalleesPredictions() {
		return ChildrenCalleesCalleesPredictions;
	}
	public void setChildrenCalleesCalleesPredictions(List<String> childrenCalleesCalleesPredictions) {
		ChildrenCalleesCalleesPredictions = childrenCalleesCalleesPredictions;
	}
	public List<String> getChildrenCalleesCalleesOwners() {
		return ChildrenCalleesCalleesOwners;
	}
	public void setChildrenCalleesCalleesOwners(List<String> childrenCalleesCalleesOwners) {
		ChildrenCalleesCalleesOwners = childrenCalleesCalleesOwners;
	}
	public List<String> getImplementations() {
		return Implementations;
	}
	public void setImplementations(List<String> implementations) {
		Implementations = implementations;
	}
	public List<String> getInterfaces() {
		return Interfaces;
	}
	public void setInterfaces(List<String> interfaces) {
		Interfaces = interfaces;
	}
	public List<String> getSuperclasses() {
		return Superclasses;
	}
	public void setSuperclasses(List<String> superclasses) {
		Superclasses = superclasses;
	}
	List<String> ExtendedCallerPredictions;
	List<String> ExtendedCalleesText;
	List<String> ExtendedCalleePredictions;
	List<String> OuterCalleesPredictions;
	List<String> OuterCallersPredictions;
	
	
	List<String> OuterOwnerCalleesPredictions;
	List<String> OuterOwnerCallersPredictions;
	
	
	List<String> OuterOwnerCallees;
	List<String> OuterOwnerCallers;
	

	
	public List<String> CallersText;
	public List<String> CallerPredictionsText;
	public List<String> CalleesText;
	public List<String> CalleePredictionsText;
	
	List<String> ImplementationOwners;
	List<String> InterfaceOwners;
	List<String> SuperclassOwners;
	List<String> ChildrenOwners;
	
	List<String> ImplementationOwnersPredictions;
	List<String> InterfaceOwnersPredictions;
	List<String> SuperclassOwnersPredictions;
	List<String> ChildrenOwnersPredictions;
	
	
	List<String> Implementations;
	List<String> Interfaces;
	List<String> Superclasses;
	List<String> Children;
	
	List<String> ImplementationPredictions;
	List<String> InterfacePredictions;
	List<String> SuperclassPredictions;
	List<String> ChildrenPredictions;
	
	
	
	
	

	public List<String> getClassCalleesOwnerClasses() {
		return ClassCalleesOwnerClasses;
	}
	public void setClassCalleesOwnerClasses(List<String> classCalleesOwnerClasses) {
		ClassCalleesOwnerClasses = classCalleesOwnerClasses;
	}
	public List<String> getClassCallersOwnerClasses() {
		return ClassCallersOwnerClasses;
	}
	public void setClassCallersOwnerClasses(List<String> classCallersOwnerClasses) {
		ClassCallersOwnerClasses = classCallersOwnerClasses;
	}
	public int getClassMethodsSize() {
		return ClassMethodsSize;
	}
	public void setClassMethodsSize(int classMethodsSize) {
		ClassMethodsSize = classMethodsSize;
	}
	public List<String> getImplementation() {
		return Implementations;
	}
	public void setImplementation(List<String> implementation) {
		Implementations = implementation;
	}
	public List<String> getInterface() {
		return Interfaces;
	}
	public void setInterface(List<String> interface1) {
		Interfaces = interface1;
	}
	public List<String> getSuperclass() {
		return Superclasses;
	}
	public void setSuperclass(List<String> superclass) {
		Superclasses = superclass;
	}
	public List<String> getChildren() {
		return Children;
	}
	public void setChildren(List<String> children) {
		Children = children;
	}
	public List<String> getImplementationPredictions() {
		return ImplementationPredictions;
	}
	public void setImplementationPredictions(List<String> implementationPredictions) {
		ImplementationPredictions = implementationPredictions;
	}
	public List<String> getInterfacePredictions() {
		return InterfacePredictions;
	}
	public void setInterfacePredictions(List<String> interfacePredictions) {
		InterfacePredictions = interfacePredictions;
	}
	public List<String> getSuperclassPredictions() {
		return SuperclassPredictions;
	}
	public void setSuperclassPredictions(List<String> superclassPredictions) {
		SuperclassPredictions = superclassPredictions;
	}
	public List<String> getChildrenPredictions() {
		return ChildrenPredictions;
	}
	public void setChildrenPredictions(List<String> childrenPredictions) {
		ChildrenPredictions = childrenPredictions;
	}
	public List<String> getImplementationOwners() {
		return ImplementationOwners;
	}
	public void setImplementationOwners(List<String> implementationOwners) {
		ImplementationOwners = implementationOwners;
	}
	public List<String> getInterfaceOwners() {
		return InterfaceOwners;
	}
	public void setInterfaceOwners(List<String> interfaceOwners) {
		InterfaceOwners = interfaceOwners;
	}
	public List<String> getSuperclassOwners() {
		return SuperclassOwners;
	}
	public void setSuperclassOwners(List<String> superclassOwners) {
		SuperclassOwners = superclassOwners;
	}
	public List<String> getChildrenOwners() {
		return ChildrenOwners;
	}
	public void setChildrenOwners(List<String> childrenOwners) {
		ChildrenOwners = childrenOwners;
	}
	public List<String> getImplementationOwnersPredictions() {
		return ImplementationOwnersPredictions;
	}
	public void setImplementationOwnersPredictions(List<String> implementationOwnersPredictions) {
		ImplementationOwnersPredictions = implementationOwnersPredictions;
	}
	public List<String> getInterfaceOwnersPredictions() {
		return InterfaceOwnersPredictions;
	}
	public void setInterfaceOwnersPredictions(List<String> interfaceOwnersPredictions) {
		InterfaceOwnersPredictions = interfaceOwnersPredictions;
	}
	public List<String> getSuperclassOwnersPredictions() {
		return SuperclassOwnersPredictions;
	}
	public void setSuperclassOwnersPredictions(List<String> superclassOwnersPredictions) {
		SuperclassOwnersPredictions = superclassOwnersPredictions;
	}
	public List<String> getChildrenOwnersPredictions() {
		return ChildrenOwnersPredictions;
	}
	public void setChildrenOwnersPredictions(List<String> childrenOwnersPredictions) {
		ChildrenOwnersPredictions = childrenOwnersPredictions;
	}
	public List<String> getOuterOwnerCalleesPredictions() {
		return OuterOwnerCalleesPredictions;
	}
	public void setOuterOwnerCalleesPredictions(List<String> outerOwnerCalleesPredictions) {
		OuterOwnerCalleesPredictions = outerOwnerCalleesPredictions;
	}
	public List<String> getOuterOwnerCallersPredictions() {
		return OuterOwnerCallersPredictions;
	}
	public void setOuterOwnerCallersPredictions(List<String> outerOwnerCallersPredictions) {
		OuterOwnerCallersPredictions = outerOwnerCallersPredictions;
	}
	public List<String> getOuterOwnerCallees() {
		return OuterOwnerCallees;
	}
	public void setOuterOwnerCallees(List<String> outerOwnerCallees) {
		OuterOwnerCallees = outerOwnerCallees;
	}
	public List<String> getOuterOwnerCallers() {
		return OuterOwnerCallers;
	}
	public void setOuterOwnerCallers(List<String> outerOwnerCallers) {
		OuterOwnerCallers = outerOwnerCallers;
	}
	public List<String> getImplementationCallees() {
		return ImplementationCallees;
	}
	public void setImplementationCallees(List<String> implementationCallees) {
		ImplementationCallees = implementationCallees;
	}
	public List<String> getImplementationCalleePredictions() {
		return ImplementationCalleePredictions;
	}
	public void setImplementationCalleePredictions(List<String> implementationCalleePredictions) {
		ImplementationCalleePredictions = implementationCalleePredictions;
	}
	public List<String> getInterfaceCallers() {
		return InterfaceCallers;
	}
	public void setInterfaceCallers(List<String> interfaceCallers) {
		InterfaceCallers = interfaceCallers;
	}
	public List<String> getInterfaceCallerPredictions() {
		return InterfaceCallerPredictions;
	}
	public void setInterfaceCallerPredictions(List<String> interfaceCallerPredictions) {
		InterfaceCallerPredictions = interfaceCallerPredictions;
	}
	public List<String> getChildrenCallees() {
		return ChildrenCallees;
	}
	public void setChildrenCallees(List<String> childrenCallees) {
		ChildrenCallees = childrenCallees;
	}
	public List<String> getChildrenCalleePredictions() {
		return ChildrenCalleePredictions;
	}
	public void setChildrenCalleePredictions(List<String> childrenCalleePredictions) {
		ChildrenCalleePredictions = childrenCalleePredictions;
	}
	public List<String> getSuperclassCallers() {
		return SuperclassCallers;
	}
	public void setSuperclassCallers(List<String> superclassCallers) {
		SuperclassCallers = superclassCallers;
	}
	public List<String> getSuperclassCallerPredictions() {
		return SuperclassCallerPredictions;
	}
	public void setSuperclassCallerPredictions(List<String> superclassCallerPredictions) {
		SuperclassCallerPredictions = superclassCallerPredictions;
	}
	
	public List<String> getCallers() {
		return Callers;
	}
	public void setCallers(List<String> callers) {
		Callers = callers;
	}
	public List<String> getCallerPredictions() {
		return CallerPredictionsText;
	}
	public void setCallerPredictions(List<String> originalCallerPredictions) {
		CallerPredictionsText = originalCallerPredictions;
	}
	public List<String> getCallees() {
		return CalleesText;
	}
	
	public void setCallees(List<String> callees) {
		Callees = callees;
	}
	public void setCalleePredictions(List<String> originalCalleePredictions) {
		CalleePredictionsText = originalCalleePredictions;
	}
	public static BufferedWriter bwfile4 = null;
	public static BufferedWriter bwfile3 = null;
	public static BufferedWriter bwfile2 = null;
	public static BufferedWriter bwfileChess = null;

	
	public static BufferedWriter bwInterfacesImpChess = null;
	public static BufferedWriter bwSuperclassesChildrenChess = null;
	public static BufferedWriter bwInterfacesImpGantt = null;
	public static BufferedWriter bwSuperclassesChildrenGantt = null;
	public static BufferedWriter bwInterfacesImpiTrust = null;
	public static BufferedWriter bwSuperclassesChildreniTrust = null;	
	public static BufferedWriter bwInterfacesImpJHotDraw = null;
	public static BufferedWriter bwSuperclassesChildrenJHotDraw = null;
	
	
	
	public static BufferedWriter bwfile3Chess =null; 
	public static BufferedWriter bwfile3jHotDraw =null; 

	
	public List<String> getOuterCalleesPredictions() {
		return OuterCalleesPredictions;
	}
	public void setOuterCalleesPredictions(List<String> outerCalleesPredictions) {
		OuterCalleesPredictions = outerCalleesPredictions;
	}
	public List<String> getOuterCallersPredictions() {
		return OuterCallersPredictions;
	}
	public void setOuterCallersPredictions(List<String> outerCallersPredictions) {
		OuterCallersPredictions = outerCallersPredictions;
	}
	
	public static BufferedWriter bwchessMethodCallsWriter =null; 
	public static BufferedWriter bwGANTTMethodCallsWriter =null; 
	public static BufferedWriter bwiTrustMethodCallsWriter =null; 
	public static BufferedWriter bwJHotDrawMethodCallsWriter =null; 

	public static BufferedWriter bwfile1 = null;
	public static BufferedWriter bwTraceClass = null;
	public static BufferedWriter bwfileCumulative = null;
	public List<String> getExtendedCallers() {
		return ExtendedCallersText;
	}
	public void setExtendedCallers(List<String> callers) {
		ExtendedCallersText = callers;
	}
	public List<String> getExtendedCallerPredictions() {
		return ExtendedCallerPredictions;
	}
	public void setExtendedCallerPredictions(List<String> callerPredictions) {
		ExtendedCallerPredictions = callerPredictions;
	}
	public List<String> getExtendedCallees() {
		return ExtendedCalleesText;
	}
	public void setExtendedCallees(List<String> callees) {
		ExtendedCalleesText = callees;
	}
	public List<String> getExtendedCalleePredictions() {
		return ExtendedCalleePredictions;
	}
	public void setExtendedCalleePredictions(List<String> calleePredictions) {
		ExtendedCalleePredictions = calleePredictions;
	}
	public boolean isSubjectDeveloperEqual() {
		return SubjectDeveloperEqualityFlag;
	}
	public void setSubjectDeveloperEqualityFlag(boolean myFlag) {
		this.SubjectDeveloperEqualityFlag = myFlag;
	}
	public String getGoldFinal() {
		return GoldFinal;
	}
	public void setGoldFinal(String goldFinal) {
		GoldFinal = goldFinal;
	}
	public String getSubjectGold() {
		return SubjectGold;
	}
	public void setSubjectGold(String subjectGold) {
		SubjectGold = subjectGold;
	}
	public String getPrediction() {
		return Prediction;
	}
	public void setPrediction(String prediction) {
		Prediction = prediction;
	}
	public String getTraceClassOldValue() {
		return TraceClassOldValue;
	}
	public void setTraceClassOldValue(String traceClassOldValue) {
		TraceClassOldValue = traceClassOldValue;
	}
	public String getTraceClassNewValue() {
		return TraceClassNewValue;
	}
	public void setTraceClassNewValue(String traceClassNewValue) {
		TraceClassNewValue = traceClassNewValue;
	}
	public String getMethodID() {
		return MethodID;
	}
	public void setMethodID(String methodID) {
		MethodID = methodID;
	}
	public String getMethodName() {
		return MethodName;
	}
	public void setMethodName(String methodName) {
		MethodName = methodName;
	}
	public String getClassID() {
		return ClassID;
	}
	public void setClassID(String classID) {
		ClassID = classID;
	}
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
	public String getTraceValue() {
		return TraceValue;
	}
	public void setTraceValue(String traceValue) {
		TraceValue = traceValue;
	}
	public List<String> getIterationValues() {
		return IterationValues;
	}
	public void setIterationValues(List<String> iterationValues) {
		IterationValues = iterationValues;
	}
	
	
	
	
	public String getPrecisionRecall() {
		return PrecisionRecall;
	}
	public void setPrecisionRecall(String precisionRecall) {
		PrecisionRecall = precisionRecall;
	}
	public LogInfo() {
		super();
	}
	
	
	
	
	@Override
	public String toString() {
//		System.out.println(MethodName);
		MethodName=MethodName.replaceAll(",", "/"); 
		RequirementName=RequirementName.replaceAll(",", "/"); 
		String CallersList=toString3(Callers); 
		String CallersOwnersList=toString3(CallersOwners); 
		String CallersPredictionsList=toString3(CallersPredictions); 
		String CalleesList=toString3(Callees); 
		String CalleesOwnersList=toString3(CalleesOwners); 
		String CalleesPredictionsList=toString3(CalleesPredictions); 
		String CallersCallersList=toString3(CallersCallers); 
		String CallersCallersOwnersList=toString3(CallersCallersOwners); 
		String CallersCallersPredictionsList=toString3(CallersCallersPredictions); 
		String CalleesCalleesList=toString3(CalleesCallees); 
		String CalleesCalleesOwnersList=toString3(CalleesCalleesOwners); 
		String CalleesCalleesPredictionsList=toString3(CalleesCalleesPredictions); 
		
		String InterfaceCallerList=toString3(InterfaceCallers); 
		String InterfaceCallerOwnerList=toString3(InterfaceCallersOwners); 
		String InterfaceCallerPredictionList=toString3(InterfaceCallerPredictions); 
		
		
		String ImplementationCalleeList=toString3(ImplementationCallees); 
		String ImplementationCalleeOwnerList=toString3(ImplementationCalleesOwners); 
		String ImplementationCalleePredictionList=toString3(ImplementationCalleePredictions); 
		
		String SuperclassCallersCallersList=toString3(SuperclassesCallersCallers); 
		String SuperclassCallersCallersOwnerList=toString3(SuperclassesCallersCallersOwners); 
		String SuperclassCallersCallersPredictionList=toString3(SuperclassesCallersCallersPredictions); 
		
		String InterfaceCallersCallersList=toString3(InterfacesCallersCallers); 
		String InterfaceCallersCallersOwnerList=toString3(InterfacesCallersCallersOwners); 
		String InterfaceCallersCallersPredictionList=toString3(InterfacesCallersCallersPredictions); 
		
		String SuperclassCallerList=toString3(SuperclassCallers); 
		String SuperclassCallerOwnerList=toString3(SuperclassCallersOwners); 
		String SuperclassCallerPredictionList=toString3(SuperclassCallerPredictions); 
		
		String ChildrenCalleesList=toString3(ChildrenCallees); 
		String ChildrenCalleeOwnerList=toString3(ChildrenCalleesOwners); 
		String ChildrenCalleePredictionList=toString3(ChildrenCalleePredictions); 
		
		
		String ChildrenCalleesCalleesList=toString3(ChildrenCalleesCallees); 
		String ChildrenCalleesCalleesOwnerList=toString3(ChildrenCalleesCalleesOwners); 
		String ChildrenCalleesCalleesPredictionList=toString3(ChildrenCalleesCalleesPredictions); 
		
		String ImplementationCalleesCalleesList=toString3(ImplementationCalleesCallees); 
		String ImplementationCalleesCalleesOwnerList=toString3(ImplementationCalleesCalleesOwners); 
		String ImplementationCalleesCalleesPredictionList=toString3(ImplementationCalleesCalleesPredictions); 
		
		String OuterCallersFinalList=toString3(OuterCallersFinal); 
		String OuterCallersFinalOwnersList=toString3(OuterCallersOwnersFinal); 
		String OuterCallersFinalPredictionsList=toString3(OuterCallersPredictionsFinal); 
		
		String OuterCalleesFinalList=toString3(OuterCalleesFinal); 
		String OuterCalleesFinalOwnersList=toString3(OuterCalleesOwnersFinal); 
		String OuterCalleesFinalPredictionsList=toString3(OuterCalleesPredictionsFinal); 
		
		String ExtendedCalleesList=toString3(ExtendedCalleesFinal); 
		String ExtendedCalleesPredictionsList=toString3(ExtendedCalleesPredictionsFinal); 
		String ExtendedCallersList=toString3(ExtendedCallersFinal); 
		String ExtendedCallersPredictionsList=toString3(ExtendedCallersPredictionsFinal); 
		String reqClass= RequirementID+"-"+ClassID; 
		
		
		return MethodID+","+MethodName+","+RequirementID+","+RequirementName+","+ClassID+","+ClassName
				
				+","+TraceValue+","+DatabaseInput.OwnerTraceHashMap.get(reqClass)
		
				+","+CallersList+","+CallersPredictionsList+","+CallersOwnersList
				+","+InterfaceCallerList+","+InterfaceCallerPredictionList+","+InterfaceCallerOwnerList
				+","+SuperclassCallerList+","+SuperclassCallerPredictionList+","+SuperclassCallerOwnerList
				+","+CallersCallersList+","+CallersCallersPredictionsList+","+CallersCallersOwnersList
				+","+InterfaceCallersCallersList+","+InterfaceCallersCallersPredictionList+","+InterfaceCallersCallersOwnerList
				+","+SuperclassCallersCallersList+","+SuperclassCallersCallersPredictionList+","+SuperclassCallersCallersOwnerList
				
				+","+CalleesList+","+CalleesPredictionsList+","+CalleesOwnersList
				+","+ImplementationCalleeList+","+ImplementationCalleePredictionList+","+ImplementationCalleeOwnerList
				+","+ChildrenCalleesList+","+ChildrenCalleePredictionList+","+ChildrenCalleeOwnerList
				+","+CalleesCalleesList+","+CalleesCalleesPredictionsList+","+CalleesCalleesOwnersList
				+","+ImplementationCalleesCalleesList+","+ImplementationCalleesCalleesPredictionList+","+ImplementationCalleesCalleesOwnerList
				+","+ChildrenCalleesCalleesList+","+ChildrenCalleesCalleesPredictionList+","+ChildrenCalleesCalleesOwnerList
				//TWO FOLLOWING LINES CAN BE REMOVED 
				+","+OuterCallersFinalList+","+OuterCallersFinalPredictionsList+","+OuterCallersFinalOwnersList
				+","+OuterCalleesFinalList+","+OuterCalleesFinalPredictionsList+","+OuterCalleesFinalOwnersList
				+","+ExtendedCalleesList+","+ExtendedCalleesPredictionsList+","+ExtendedCallersList+","+ExtendedCallersPredictionsList
				+","+Prediction	
				+","+PrecisionRecall	
		+","+	toString2(IterationValues); 
//		return MethodID+","+MethodName+","+RequirementID+","+RequirementName+","+ClassID+","+ClassName+","+TraceValue+","+TraceClassOldValue+","+TraceClassNewValue+","+
//				PrecisionRecall	+","+toString2(IterationValues)+","+TraceValue+"-"+Reason+"-" +PrecisionRecall;
		
	}
	
	public String toString3(List<String> values) {
		// TODO Auto-generated method stub
		String s= ""; 
		int counter=0; 
		if(values!=null) {
			for(String value: values) {
				
				counter++; 
				if(counter==values.size()) {
					s=s+value; 
				}
				else {
					s=s+value+"/"; 
				}
				
			}
			s=s.replaceAll(",", "_"); 

			return s;
		}
		return s; 
	}
	public String getRequirementID() {
		return RequirementID;
	}
	public void setRequirementID(String requirementID) {
		RequirementID = requirementID;
	}
	public String getRequirementName() {
		return RequirementName;
	}
	public void setRequirementName(String requirementName) {
		RequirementName = requirementName;
	}
	public String toString2(List<String> IterationValues) {
		 String FinalString=""; 
		 int it=0; 
		 Reason=""; 
		for(String s: IterationValues) {
			if(it+1<IterationValues.size()) {
				FinalString=FinalString+s+","; 
				
				it++; 	
			}
			
			else if(it+1==IterationValues.size()) {
				FinalString=FinalString+s; 
				
			}
			if(!s.equals(" ")) {
				Reason=s; 
			}
		}
		return FinalString;
		
	}
	
	
	/************************************************************************************************************************************************/
	/**
	 * @param methodtraces2HashMap **********************************************************************************************************************************************/
	public static LinkedHashMap<String, LogInfo> InitializeLogInfoHashMap(LinkedHashMap<String, LogInfo> LogInfoHashMap,
			Collection<MethodTrace> methodTracesHashmapValues, HashMap<String, MethodTrace> methodtraces2HashMap) {
		// TODO Auto-generated method stub
		for(MethodTrace methodtrace: methodTracesHashmapValues) {
			String Req= methodtrace.getRequirement().ID; 
			String Method= methodtrace.getMethod().ID; 
			LogInfo loginfo= new LogInfo(); 
			String reqMethod= Req+"-"+Method; 
			if (LogInfoHashMap.get(reqMethod) != null) {
				loginfo = LogInfoHashMap.get(reqMethod);
			}

			loginfo.setRequirementID(methodtrace.getRequirement().ID);
			loginfo.setRequirementName(methodtrace.getRequirement().RequirementName);
			loginfo.setMethodID(methodtrace.getMethod().ID);
			loginfo.setMethodName(methodtrace.getMethod().methodname);
			loginfo.setClassID(methodtrace.Method.Owner.ID);
			loginfo.setClassName(methodtrace.Method.Owner.classname);
			loginfo.setTraceValue(methodtrace.getGold());
			loginfo.setGoldFinal(methodtrace.Method.Owner.DeveloperGold);
			loginfo.setSubjectGold(methodtrace.Method.Owner.SubjectGold);
			loginfo.setPrecisionRecall("E");

			
		
			LogInfoHashMap.put(Req+"-"+Method, loginfo); 
			methodtrace.setPrediction("E");

			String traceClassOldValue= methodtrace.Method.Owner.DeveloperGold; 

			
		
			loginfo.setTraceClassOldValue(traceClassOldValue);
			LogInfoHashMap.put(reqMethod, loginfo); 
		}
		return LogInfoHashMap; 
	}
	public static LinkedHashMap<String, LogInfo> InitializeLogInfoHashMapTraceClassNewValue(
			LinkedHashMap<String, LogInfo> LogInfoHashMap, Collection<MethodTrace> methodTracesHashmapValues,
			HashMap<String, MethodTrace> methodtraces2HashMap) {
		// TODO Auto-generated method stub
		for(MethodTrace methodtrace: methodTracesHashmapValues) {
			String Req= methodtrace.getRequirement().ID; 
			String Method= methodtrace.getMethod().ID; 
			
			String reqMethod= Req+"-"+Method; 
		
			
			

			
		
			
			if(LogInfoHashMap.get(reqMethod)!=null) {
				LogInfo	  LogInfo= LogInfoHashMap.get(reqMethod); 
				
				
				if(LogInfo.getTraceClassOldValue().equals("E") && !methodtrace.Method.Owner.DeveloperGold.equals("E")) {
					String traceClassNewValue= methodtrace.Method.Owner.DeveloperGold; 
					LogInfo.setTraceClassNewValue(traceClassNewValue);
					LogInfoHashMap.put(reqMethod, LogInfo); 
				}
				
				
			 }
			
		}
		return LogInfoHashMap;
	}
	public  static void CreateLogFiles(String ProgramName) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	

		if (ProgramName.equals("chess")) {
			File filelogChess = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\TableLogChess.txt");
			FileOutputStream fosfilChess = new FileOutputStream(filelogChess);
			bwfileChess = new BufferedWriter(new OutputStreamWriter(fosfilChess));
			
		
			 File file1log = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\PrecisionRecallChess.txt");
				FileOutputStream fosfila1 = new FileOutputStream(file1log);
				bwfile1 = new BufferedWriter(new OutputStreamWriter(fosfila1));
				
				File  file2log = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\PrecisionRecallChessCumulative.txt");
				FileOutputStream	 fosfila2 = new FileOutputStream(file2log);
					bwfileCumulative = new BufferedWriter(new OutputStreamWriter(fosfila2));

				
				File mytraceClass = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\TracesClassesChess.txt");
				FileOutputStream fosTraceClass = new FileOutputStream(mytraceClass);
				bwTraceClass = new BufferedWriter(new OutputStreamWriter(fosTraceClass));
				
				
				File myfile = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\ComparisonInterfacesImplementationsChess.txt");
				FileOutputStream myFileOutputStream = new FileOutputStream(myfile);
				bwInterfacesImpChess = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
				
				
				File myfile2 = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\ComparisonSuperclassesChildrenChess.txt");
				FileOutputStream myFileOutputStream2 = new FileOutputStream(myfile2);
				bwSuperclassesChildrenChess = new BufferedWriter(new OutputStreamWriter(myFileOutputStream2));
				
				
				File myfile3 = new File("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\ChessFiles\\MethodCalls.txt");
				FileOutputStream myFileOutputStream3 = new FileOutputStream(myfile3);
				 bwchessMethodCallsWriter = new BufferedWriter(new OutputStreamWriter(myFileOutputStream3));
				System.out.println("yes");
		}

		if (ProgramName.equals("gantt")) {
			File filelog2 = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\TableLogGantt.txt");
			FileOutputStream fosfila2 = new FileOutputStream(filelog2);
			bwfile2 = new BufferedWriter(new OutputStreamWriter(fosfila2));
			
		
			 File file1log = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\PrecisionRecallGantt.txt");
				FileOutputStream fosfila1 = new FileOutputStream(file1log);
				bwfile1 = new BufferedWriter(new OutputStreamWriter(fosfila1));

				
				File mytraceClass = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\TracesClassesGantt.txt");
				FileOutputStream fosTraceClass = new FileOutputStream(mytraceClass);
				bwTraceClass = new BufferedWriter(new OutputStreamWriter(fosTraceClass));
		
				File myfile = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\ComparisonInterfacesImplementationsGantt.txt");
				FileOutputStream myFileOutputStream = new FileOutputStream(myfile);
				bwInterfacesImpGantt = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
				
				
				File myfile2 = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\ComparisonSuperclassesChildrenGantt.txt");
				FileOutputStream myFileOutputStream2 = new FileOutputStream(myfile2);
				bwSuperclassesChildrenGantt = new BufferedWriter(new OutputStreamWriter(myFileOutputStream2));
		
				
				File myfile3 = new File("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\GanttFiles\\MethodCalls.txt");
				FileOutputStream myFileOutputStream3 = new FileOutputStream(myfile3);
				 bwGANTTMethodCallsWriter = new BufferedWriter(new OutputStreamWriter(myFileOutputStream3));
		}

		if (ProgramName.equals("itrust")) {
			File filelog3 = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\TableLogiTrust.txt");
			FileOutputStream fosfila5 = new FileOutputStream(filelog3);
			bwfile3 = new BufferedWriter(new OutputStreamWriter(fosfila5));
			
			
			
			
			File file1log = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\PrecisionRecalliTrust.txt");
			FileOutputStream fosfila1 = new FileOutputStream(file1log);
			bwfile1 = new BufferedWriter(new OutputStreamWriter(fosfila1));

			
			File mytraceClass = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\TracesClassesiTrust.txt");
			FileOutputStream fosTraceClass = new FileOutputStream(mytraceClass);
			bwTraceClass = new BufferedWriter(new OutputStreamWriter(fosTraceClass));
			
			File myfile = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\ComparisonInterfacesImplementationsiTrust.txt");
			FileOutputStream myFileOutputStream = new FileOutputStream(myfile);
			bwInterfacesImpiTrust = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
			
			
			File myfile2 = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\ComparisonSuperclassesChildreniTrust.txt");
			FileOutputStream myFileOutputStream2 = new FileOutputStream(myfile2);
			bwSuperclassesChildreniTrust = new BufferedWriter(new OutputStreamWriter(myFileOutputStream2));
			
			File myfile3 = new File("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\iTrustFiles\\MethodCalls.txt");
			FileOutputStream myFileOutputStream3 = new FileOutputStream(myfile3);
			 bwiTrustMethodCallsWriter = new BufferedWriter(new OutputStreamWriter(myFileOutputStream3));
		}

		if (ProgramName.equals("jhotdraw")) {
			File filelog4 = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\TableLogJHotDraw.txt");
			FileOutputStream fosfila4 = new FileOutputStream(filelog4);
			bwfile4 = new BufferedWriter(new OutputStreamWriter(fosfila4));
			
			
				
				
				File file1log = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\PrecisionRecallJHotDraw.txt");
				FileOutputStream fosfila1 = new FileOutputStream(file1log);
				bwfile1 = new BufferedWriter(new OutputStreamWriter(fosfila1));

				
				File mytraceClass = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\TracesClassesJHotDraw.txt");
				FileOutputStream fosTraceClass = new FileOutputStream(mytraceClass);
				bwTraceClass = new BufferedWriter(new OutputStreamWriter(fosTraceClass));
				
				
				File myfile = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\ComparisonInterfacesImplementationsJHotDraw.txt");
				FileOutputStream myFileOutputStream = new FileOutputStream(myfile);
				bwInterfacesImpJHotDraw = new BufferedWriter(new OutputStreamWriter(myFileOutputStream));
				
				
				File myfile2 = new File("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\ComparisonSuperclassesChildrenJHotDraw.txt");
				FileOutputStream myFileOutputStream2 = new FileOutputStream(myfile2);
				bwSuperclassesChildrenJHotDraw = new BufferedWriter(new OutputStreamWriter(myFileOutputStream2));
			
				File myfile3 = new File("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\JHotDrawFiles\\MethodCalls.txt");
				FileOutputStream myFileOutputStream3 = new FileOutputStream(myfile3);
				 bwJHotDrawMethodCallsWriter = new BufferedWriter(new OutputStreamWriter(myFileOutputStream3));
				
		}
		// bwfile2.newLine();
		

	}
	
	/************************************************************************************************************************************************/
	/************************************************************************************************************************************************/
	/**
	 * @param ownerClassPredictionValues 
	 * @param logInfoHashMap 
	 * @param string2 
	 * @param string **********************************************************************************************************************************************/

	public static void ComputePrecisionAndRecall(
			HashMap<String, MethodTrace> methodTraceHashMap,
			PredictionEvaluation Pattern, String ProgramName,  PredictionValues ownerClassPredictionValues, LinkedHashMap<String, LogInfo> logInfoHashMap) throws SQLException {
		// TODO Auto-generated method stub
	Pattern.ResetCounters(Pattern);

		for (String mykey : methodTraceHashMap.keySet()) {
			MethodTrace methodTrace = methodTraceHashMap.get(mykey);
			
			if(ProgramName.equals("gantt")|| ProgramName.equals("jhotdraw")){
				if(methodTrace.isTraceSet()) {
					String Result="E"; 
					Pattern.UpdateCounters(Result, Pattern);

				}
				if (methodTrace.getGold() != null && methodTrace.getPrediction() != null 
						&& methodTraceHashMap.get(mykey).isSubjectDeveloperEqualityFlag()
						&& !methodTrace.isTraceSet() ) {
					String Result = Pattern.ComparePredictionToGold(methodTrace.getGold().trim(),methodTrace.getPrediction().trim());
					logInfoHashMap.get(mykey).setPrecisionRecall(Result);
					Pattern.UpdateCounters(Result, Pattern);
					
					if(!Result.equals("E")) {
						methodTrace.setTraceSet(true);
					}

				}
				
				ownerClassPredictionValues.ComputePredictionValues(ownerClassPredictionValues, methodTrace.getPrediction().trim());

			}else if(ProgramName.equals("chess")|| ProgramName.equals("itrust") ) {
				if(methodTrace.isTraceSet()) {
					String Result="E"; 
					Pattern.UpdateCounters(Result, Pattern);

				}
				if (methodTrace.getGold() != null && methodTrace.getPrediction() != null 
						&& !methodTrace.isTraceSet()) {
					String Result = Pattern.ComparePredictionToGold(methodTrace.getGold().trim(),
							methodTrace.getPrediction().trim());
					logInfoHashMap.get(mykey).setPrecisionRecall(Result);
					Pattern.UpdateCounters(Result, Pattern);
					if(!Result.equals("E")) {
						methodTrace.setTraceSet(true);

					}
				


				}
				ownerClassPredictionValues.ComputePredictionValues(ownerClassPredictionValues, methodTrace.getPrediction().trim());

			}

		

			


		}
		System.out.println(Pattern.toString());

	}
	
	
	
	
	
	public static void ComputePrecisionAndRecall2(
			HashMap<String, MethodTrace> methodTraceHashMap,
			PredictionEvaluation Pattern, String ProgramName,  PredictionValues ownerClassPredictionValues, LinkedHashMap<String, LogInfo> logInfoHashMap) throws SQLException {
		// TODO Auto-generated method stub
	Pattern.ResetCounters(Pattern);

		for (String mykey : methodTraceHashMap.keySet()) {
			MethodTrace methodTrace = methodTraceHashMap.get(mykey);
			
			if(ProgramName.equals("gantt")|| ProgramName.equals("jhotdraw")){
				if (methodTrace.getGold() != null && methodTrace.getPrediction() != null 
						&& methodTraceHashMap.get(mykey).isSubjectDeveloperEqualityFlag()
						) {
					String Result = Pattern.ComparePredictionToGold(methodTrace.getGold().trim(),methodTrace.getPrediction().trim());
					logInfoHashMap.get(mykey).setPrecisionRecall(Result);
					Pattern.UpdateCounters(Result, Pattern);
					


				}
				
//				ownerClassPredictionValues.ComputePredictionValues(ownerClassPredictionValues, methodTrace.getPrediction().trim());

			}else if(ProgramName.equals("chess")|| ProgramName.equals("itrust") ) {
			
				if (methodTrace.getGold() != null && methodTrace.getPrediction() != null 
					) {
					String Result = Pattern.ComparePredictionToGold(methodTrace.getGold().trim(),
							methodTrace.getPrediction().trim());
					logInfoHashMap.get(mykey).setPrecisionRecall(Result);
					Pattern.UpdateCounters(Result, Pattern);
				
				


				}
//				ownerClassPredictionValues.ComputePredictionValues(ownerClassPredictionValues, methodTrace.getPrediction().trim());

			}

		

			


		}
		System.out.println(Pattern.toString());

	}
	public static void updateResultsLog(PredictionEvaluation TotalPattern,  PredictionValues ownerClassPredictionValues, String ProgramName, String precisionRecall, String PredictionValues, String Type) throws IOException {
		// TODO Auto-generated method stub
		
		//CODE  TO PASTE INTO EXCEL SPREADSHEET 
		if(Type.equals("INDIVIDUAL") || Type.equals("CUMULATIVE") ) {
			LogInfo.bwfile1.write(TotalPattern.TruePositive+","+TotalPattern.TrueNegative+","+TotalPattern.FalsePositive+","+TotalPattern.FalseNegative+","+TotalPattern.E);
			
			LogInfo.bwfile1.write(","+ownerClassPredictionValues.T+","+ownerClassPredictionValues.N+","+ownerClassPredictionValues.E+",");
	
//			LogInfo.bwfile1.newLine();

		
			if(Type.equals("CUMULATIVE")) {
				LogInfo.bwfile1.newLine();
			}
			
		
		}
		
		//END CODE  TO PASTE INTO EXCEL SPREADSHEET 
//		else if(Type.equals("CUMULATIVE")) {
//			LogInfo.bwfileCumulative.write(TotalPattern.TruePositive+","+TotalPattern.TrueNegative+","+TotalPattern.FalsePositive+","+TotalPattern.FalseNegative+","+TotalPattern.E);
//			
//			LogInfo.bwfileCumulative.write(","+ownerClassPredictionValues.T+","+ownerClassPredictionValues.N+","+ownerClassPredictionValues.E);
//	
//			LogInfo.bwfileCumulative.newLine();
//		}
		


		
		
		
//		LogInfo.bwfile1.write(" OUTPUT COMPLETENESS T: "+Type+"   "+(float)TotalPattern.TruePositive/(TotalPattern.TruePositive+TotalPattern.TrueNegative+TotalPattern.FalsePositive+TotalPattern.FalseNegative+TotalPattern.E)); //TP/(TP+TN+FP+FN+E)
//		LogInfo.bwfile1.newLine();
//		LogInfo.bwfile1.write(" OUTPUT COMPLETENESS N: "+Type+"   "+(float)TotalPattern.TrueNegative/(TotalPattern.TruePositive+TotalPattern.TrueNegative+TotalPattern.FalsePositive+TotalPattern.FalseNegative+TotalPattern.E)); //TN/(TP+TN+FP+FN+E)
//		LogInfo.bwfile1.newLine();
//		LogInfo.bwfile1.write(" OUTPUT COMPLETENESS E: "+Type+"   "+(float)TotalPattern.E/(TotalPattern.TruePositive+TotalPattern.TrueNegative+TotalPattern.FalsePositive+TotalPattern.FalseNegative+TotalPattern.E));//E/(TP+TN+FP+FN+E)
//		LogInfo.bwfile1.newLine();
//		if(TotalPattern.TruePositive+TotalPattern.FalsePositive!=0) {
//			LogInfo.bwfile1.write(" OUTPUT CORRECTNESS PRECISION T: "+Type+"   "+(float)TotalPattern.TruePositive/(TotalPattern.TruePositive+TotalPattern.FalsePositive)); //TP/(TP+FP)); 
//			LogInfo.bwfile1.newLine();
//		}else {
//			LogInfo.bwfile1.write(" OUTPUT CORRECTNESS PRECISION T: "+Type+"   "+0); 
//			LogInfo.bwfile1.newLine();
//		}
//		if(TotalPattern.TrueNegative+TotalPattern.FalseNegative!=0) {
//			LogInfo.bwfile1.write(" OUTPUT CORRECTNESS PRECISION N: "+Type+"   "+(float)TotalPattern.TrueNegative/(TotalPattern.TrueNegative+TotalPattern.FalseNegative)); //TN/(FN+TN)
//			LogInfo.bwfile1.newLine();
//		}else {
//			LogInfo.bwfile1.write(" OUTPUT CORRECTNESS PRECISION N: "+Type+"   "+0); 
//			LogInfo.bwfile1.newLine();
//		}
//		if(TotalPattern.TruePositive+TotalPattern.FalseNegative!=0) {
//			LogInfo.bwfile1.write(" OUTPUT CORRECTNESS RECALL T: "+Type+"   "+(float)TotalPattern.TruePositive/(TotalPattern.TruePositive+TotalPattern.FalseNegative)); //TP/(TP+FN)
//			LogInfo.bwfile1.newLine();
//		}else {
//			LogInfo.bwfile1.write(" OUTPUT CORRECTNESS RECALL T: "+Type+"   "+0); 
//			LogInfo.bwfile1.newLine();
//		}
//		if(TotalPattern.FalsePositive+TotalPattern.TrueNegative!=0) {
//			LogInfo.bwfile1.write(" OUTPUT CORRECTNESS RECALL N: "+Type+"   "+(float)TotalPattern.TrueNegative/(TotalPattern.FalsePositive+TotalPattern.TrueNegative)); //TN/(FP+TN)
//			LogInfo.bwfile1.newLine();
//		}else {
//			LogInfo.bwfile1.write(" OUTPUT CORRECTNESS RECALL N: "+Type+"   "+0); 
//			LogInfo.bwfile1.newLine();
//		}
//				
//		
//		LogInfo.bwfile1.newLine();
//
//		LogInfo.bwfile1.write("PREDICTION PERCENTAGE T: "+Type+"   "+ (float)ownerClassPredictionValues.T/(ownerClassPredictionValues.T+ownerClassPredictionValues.N+ownerClassPredictionValues.E));
//		LogInfo.bwfile1.newLine();
//		LogInfo.bwfile1.write(" PREDICTION PERCENTAGE N: "+Type+"   "+ (float)ownerClassPredictionValues.N/(ownerClassPredictionValues.T+ownerClassPredictionValues.N+ownerClassPredictionValues.E));
//		LogInfo.bwfile1.newLine();
//		LogInfo.bwfile1.write(" PREDICTION PERCENTAGE E: "+Type+"   "+ (float)ownerClassPredictionValues.E/(ownerClassPredictionValues.T+ownerClassPredictionValues.N+ownerClassPredictionValues.E));
//		LogInfo.bwfile1.newLine();
//		LogInfo.bwfile1.newLine();
		
		
		
		
		//ORIGINAL CODE FOR PRECISION RECALL 
//		LogInfo.bwfile1.write(precisionRecall+"                  "+ProgramName+"                     "+TotalPattern.toString());
//		LogInfo.bwfile1.newLine();
//		LogInfo.bwfile1.write(PredictionValues+"     "+ProgramName+"                     "+ownerClassPredictionValues.toString());
//		LogInfo.bwfile1.newLine();
//		LogInfo.bwfile1.write("-------------------------------------------------------------------");
		//END ORIGINAL CODE FOR PRECISION RECALL 
//		LogInfo.bwfile1.newLine();
	}
	public static void updateTableLog(String ProgramName, Collection<MethodTrace> MethodTracesHashmapValues, LinkedHashMap<String, LogInfo> LogInfoHashMap) throws IOException {
		// TODO Auto-generated method stub			
		 // Create a new file output stream.
       
		if (ProgramName.equals("chess")) {
			
			LogInfo.bwfileChess.write(
					"MethodID, MethodName, RequirementID, RequirementName, ClassID, ClassName, "
					+ "Gold, TraceClassValue,"
					+" Callers, CallersPredictions, CallersOwnerValues,"
					+" InterfaceCallers, InterfaceCallersPredictions, InterfaceCallersOwnerValues,"
					+" SuperclassCallers, SuperclassCallersPredictions, SuperclassCallersOwnerValues,"
					+" CallersCallers, CallersCallersPredictions, CallersCallersOwnerValues,"
					+" InterfaceCallersCallers, InterfaceCallersCallersPredictions, InterfaceCallersCallersOwnerValues,"
					+" SuperclassCallersCallers, SuperclassCallersCallersPredictions, SuperclassCallersCallersOwnerValues,"
					
					+" Callees, CalleesPredictions, CalleesOwnerValues,"
					+" ImplementationCallees, ImplementationCalleesPredictions, ImplementationCalleesOwnerValues,"
					+" ChildrenCallees, ChildrenCalleesPredictions, ChildrenCalleesOwnerValues,"
					+" CalleesCallees, CalleesCalleesPredictions, CalleesCalleesOwnerValues,"
					+" ImplementationCalleesCallees, ImplementationCalleesCalleesPredictions, ImplementationCalleesCalleesOwnerValues,"
					+" ChildrenCalleesCallees, ChildrenCalleesCalleesPredictions, ChildrenCalleesCalleesOwnerValues,"
					+" NEWOuterCallers, NEWOuterCallersPredictions, NEWOuterCallersOwners,"
					+" NEWOuterCallees, NEWOuterCalleesPredictions, NEWOuterCalleesOwners,"
					+"ExtendedCallees, ExtendedCalleesPredictions, ExtendedCallers, ExtendedCallersPredictions,"
					+ "Prediction,"
					+ "PrecisionRecall,IterationValues"
					);
			LogInfo.bwfileChess.newLine();
		}
		if (ProgramName.equals("gantt")) {
	
			LogInfo.bwfile2.write(
					"MethodID, MethodName, RequirementID, RequirementName, ClassID, ClassName, "
					+ "Gold, TraceClassValue,"
					+" Callers, CallersPredictions, CallersOwnerValues,"
					+" InterfaceCallers, InterfaceCallersPredictions, InterfaceCallersOwnerValues,"
					+" SuperclassCallers, SuperclassCallersPredictions, SuperclassCallersOwnerValues,"
					+" CallersCallers, CallersCallersPredictions, CallersCallersOwnerValues,"
					+" InterfaceCallersCallers, InterfaceCallersCallersPredictions, InterfaceCallersCallersOwnerValues,"
					+" SuperclassCallersCallers, SuperclassCallersCallersPredictions, SuperclassCallersCallersOwnerValues,"
					
					+" Callees, CalleesPredictions, CalleesOwnerValues,"
					+" ImplementationCallees, ImplementationCalleesPredictions, ImplementationCalleesOwnerValues,"
					+" ChildrenCallees, ChildrenCalleesPredictions, ChildrenCalleesOwnerValues,"
					+" CalleesCallees, CalleesCalleesPredictions, CalleesCalleesOwnerValues,"
					+" ImplementationCalleesCallees, ImplementationCalleesCalleesPredictions, ImplementationCalleesCalleesOwnerValues,"
					+" ChildrenCalleesCallees, ChildrenCalleesCalleesPredictions, ChildrenCalleesCalleesOwnerValues,"
					+" NEWOuterCallers, NEWOuterCallersPredictions, NEWOuterCallersOwners,"
					+" NEWOuterCallees, NEWOuterCalleesPredictions, NEWOuterCalleesOwners,"
					+"ExtendedCallees, ExtendedCalleesPredictions, ExtendedCallers, ExtendedCallersPredictions,"
					+ "Prediction,"
					+ "PrecisionRecall,IterationValues"
					);
			LogInfo.bwfile2.newLine();
		}
		if (ProgramName.equals("itrust")) {
			

			 // Create a new file output stream.
            PrintStream fileOut = new PrintStream("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\LatestLogFiles\\TableLogiTrust.txt");
            
            // Redirect standard out to file.
//            System.setOut(fileOut);
//			System.out.println(
//					"MethodID, MethodName, RequirementID, RequirementName, ClassID, ClassName, "
//					+ "Gold, TraceClassValue,"
//					+" Callers, CallersPredictions, CallersOwnerValues,"
//					+" InterfaceCallers, InterfaceCallersPredictions, InterfaceCallersOwnerValues,"
//					+" SuperclassCallers, SuperclassCallersPredictions, SuperclassCallersOwnerValues,"
//					+" CallersCallers, CallersCallersPredictions, CallersCallersOwnerValues,"
//					+" InterfaceCallersCallers, InterfaceCallersCallersPredictions, InterfaceCallersCallersOwnerValues,"
//					+" SuperclassCallersCallers, SuperclassCallersCallersPredictions, SuperclassCallersCallersOwnerValues,"
//					
//					+" Callees, CalleesPredictions, CalleesOwnerValues,"
//					+" ImplementationCallees, ImplementationCalleesPredictions, ImplementationCalleesOwnerValues,"
//					+" ChildrenCallees, ChildrenCalleesPredictions, ChildrenCalleesOwnerValues,"
//					+" CalleesCallees, CalleesCalleesPredictions, CalleesCalleesOwnerValues,"
//					+" ImplementationCalleesCallees, ImplementationCalleesCalleesPredictions, ImplementationCalleesCalleesOwnerValues,"
//					+" ChildrenCalleesCallees, ChildrenCalleesCalleesPredictions, ChildrenCalleesCalleesOwnerValues,"
//					+ "PrecisionRecall,IterationValues"
//					);
			LogInfo.bwfile3.write(
					"MethodID, MethodName, RequirementID, RequirementName, ClassID, ClassName, "
					+ "Gold, TraceClassValue,"
					+" Callers, CallersPredictions, CallersOwnerValues,"
					+" InterfaceCallers, InterfaceCallersPredictions, InterfaceCallersOwnerValues,"
					+" SuperclassCallers, SuperclassCallersPredictions, SuperclassCallersOwnerValues,"
					+" CallersCallers, CallersCallersPredictions, CallersCallersOwnerValues,"
					+" InterfaceCallersCallers, InterfaceCallersCallersPredictions, InterfaceCallersCallersOwnerValues,"
					+" SuperclassCallersCallers, SuperclassCallersCallersPredictions, SuperclassCallersCallersOwnerValues,"
					
					+" Callees, CalleesPredictions, CalleesOwnerValues,"
					+" ImplementationCallees, ImplementationCalleesPredictions, ImplementationCalleesOwnerValues,"
					+" ChildrenCallees, ChildrenCalleesPredictions, ChildrenCalleesOwnerValues,"
					+" CalleesCallees, CalleesCalleesPredictions, CalleesCalleesOwnerValues,"
					+" ImplementationCalleesCallees, ImplementationCalleesCalleesPredictions, ImplementationCalleesCalleesOwnerValues,"
					+" ChildrenCalleesCallees, ChildrenCalleesCalleesPredictions, ChildrenCalleesCalleesOwnerValues,"
					+" NEWOuterCallers, NEWOuterCallersPredictions, NEWOuterCallersOwners,"
					+" NEWOuterCallees, NEWOuterCalleesPredictions, NEWOuterCalleesOwners,"
					+"ExtendedCallees, ExtendedCalleesPredictions, ExtendedCallers, ExtendedCallersPredictions,"
					+ "Prediction,"
					+ "PrecisionRecall,IterationValues"
					);
			LogInfo.bwfile3.newLine();
		}
		if (ProgramName.equals("jhotdraw")) {

			LogInfo.bwfile4.write(
					"MethodID, MethodName, RequirementID, RequirementName, ClassID, ClassName, "
					+ "Gold, TraceClassValue,"
					+" Callers, CallersPredictions, CallersOwnerValues,"
					+" InterfaceCallers, InterfaceCallersPredictions, InterfaceCallersOwnerValues,"
					+" SuperclassCallers, SuperclassCallersPredictions, SuperclassCallersOwnerValues,"
					+" CallersCallers, CallersCallersPredictions, CallersCallersOwnerValues,"
					+" InterfaceCallersCallers, InterfaceCallersCallersPredictions, InterfaceCallersCallersOwnerValues,"
					+" SuperclassCallersCallers, SuperclassCallersCallersPredictions, SuperclassCallersCallersOwnerValues,"
					
					+" Callees, CalleesPredictions, CalleesOwnerValues,"
					+" ImplementationCallees, ImplementationCalleesPredictions, ImplementationCalleesOwnerValues,"
					+" ChildrenCallees, ChildrenCalleesPredictions, ChildrenCalleesOwnerValues,"
					+" CalleesCallees, CalleesCalleesPredictions, CalleesCalleesOwnerValues,"
					+" ImplementationCalleesCallees, ImplementationCalleesCalleesPredictions, ImplementationCalleesCalleesOwnerValues,"
					+" ChildrenCalleesCallees, ChildrenCalleesCalleesPredictions, ChildrenCalleesCalleesOwnerValues,"
					
					//THESE TWO LINES CAN BE REMOVED 
					+" NEWOuterCallers, NEWOuterCallersPredictions, NEWOuterCallersOwners,"
					+" NEWOuterCallees, NEWOuterCalleesPredictions, NEWOuterCalleesOwners,"
					//END OF THESE TWO LINES CAN BE REMOVED 
					+"ExtendedCallees, ExtendedCalleesPredictions, ExtendedCallers, ExtendedCallersPredictions,"
					+ "Prediction,"
					+ "PrecisionRecall,IterationValues"
					);
			LogInfo.bwfile4.newLine();
		}
		int count=0; 
		
		HashMap<String, List<String>> InterfacesImplementationsHashMap= new HashMap<String, List<String>>(); 
		HashMap<String, List<String>> SuperclassChildrenHashMap= new HashMap<String, List<String>>(); 

		for (MethodTrace methodtrace : MethodTracesHashmapValues) {
			String reqmethod = methodtrace.Requirement.ID + "-" + methodtrace.Method.ID;
			
			LogInfoHashMap.get(reqmethod);
		

			if (ProgramName.equals("gantt")) {
				LogInfo.bwfile2.write(LogInfoHashMap.get(reqmethod).toString());
				LogInfo.bwfile2.newLine();
				
			
				
			}
			if (ProgramName.equals("chess")) {
				LogInfo.bwfileChess.write(LogInfoHashMap.get(reqmethod).toString());
				LogInfo.bwfileChess.newLine();
				
				
				
				
			}
			if (ProgramName.equals("itrust")) {
//				System.out.println(LogInfoHashMap.get(reqmethod).toString());
				
				//UNCOMMENT THESE TWO LINES BELOW 
				
				LogInfo.bwfile3.write(LogInfoHashMap.get(reqmethod).toString());
				LogInfo.bwfile3.newLine();
				
//				System.out.println("=======>"+reqmethod+"------"+count+"---"+LogInfoHashMap.get(reqmethod).toString());
				count++; 
//			
			}
			if (ProgramName.equals("jhotdraw")) {
				LogInfo.bwfile4.write(LogInfoHashMap.get(reqmethod).toString());
				LogInfo.bwfile4.newLine();
				
				
				
				
				
				
			}
		}
		
		
		
		if (ProgramName.equals("chess")) {
			
			LogInfo.bwfileChess.close();
		} else if (ProgramName.equals("gantt")) {
			
			LogInfo.bwfile2.close();
			

		} else if (ProgramName.equals("itrust")) {
		
			LogInfo.bwfile3.close();
		} else if (ProgramName.equals("jhotdraw")) {
			
			LogInfo.bwfile4.close();

		}
	}
	private static void UpdateInheritanceLogFiles(HashMap<String, List<String>> interfacesImplementationsHashMap, HashMap<String, List<String>> superclassChildrenHashMap, BufferedWriter bwInterfacesImpJHotDraw2, BufferedWriter bwSuperclassesChildrenJHotDraw2) throws IOException {
		// TODO Auto-generated method stub

		for(String mykey: interfacesImplementationsHashMap.keySet()) {
			String methname = AlgoFinal.methodtraces2HashMap.get(mykey).Method.methodname.replaceAll("\\,", "/"); 
			bwInterfacesImpJHotDraw2.write("INTERFACE,"+AlgoFinal.methodtraces2HashMap.get(mykey).Method.ID
					+","+methname+","+
					AlgoFinal.methodtraces2HashMap.get(mykey).Method.Owner.ID
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).Method.Owner.classname
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).Requirement.ID
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).gold
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).prediction);

			bwInterfacesImpJHotDraw2.newLine();
			for(String entry: interfacesImplementationsHashMap.get(mykey)) {
				String methname2 = AlgoFinal.methodtraces2HashMap.get(entry).Method.methodname.replaceAll("\\,", "/"); 
				bwInterfacesImpJHotDraw2.write("IMPLEMENTATION,"+AlgoFinal.methodtraces2HashMap.get(entry).Method.ID
								+","+methname2
								+","+AlgoFinal.methodtraces2HashMap.get(entry).Method.Owner.ID
								+","+AlgoFinal.methodtraces2HashMap.get(entry).Method.Owner.classname
								+","+AlgoFinal.methodtraces2HashMap.get(entry).Requirement.ID
								+","+AlgoFinal.methodtraces2HashMap.get(entry).gold
								+","+AlgoFinal.methodtraces2HashMap.get(entry).prediction);
			
				bwInterfacesImpJHotDraw2.newLine();
			}
		}
		for(String mykey: superclassChildrenHashMap.keySet()) {
			String methname = AlgoFinal.methodtraces2HashMap.get(mykey).Method.methodname.replaceAll("\\,", "/"); 
			bwSuperclassesChildrenJHotDraw2.write("SUPERCLASS,"+AlgoFinal.methodtraces2HashMap.get(mykey).Method.ID
					+","+methname+","+
					AlgoFinal.methodtraces2HashMap.get(mykey).Method.Owner.ID+","+				
					AlgoFinal.methodtraces2HashMap.get(mykey).Method.Owner.classname
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).Requirement.ID
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).gold
					+","+AlgoFinal.methodtraces2HashMap.get(mykey).prediction);

			bwSuperclassesChildrenJHotDraw2.newLine();
			for(String entry: superclassChildrenHashMap.get(mykey)) {
				String methname2 = AlgoFinal.methodtraces2HashMap.get(entry).Method.methodname.replaceAll("\\,", "/"); 
				bwSuperclassesChildrenJHotDraw2.write("CHILDREN,"+AlgoFinal.methodtraces2HashMap.get(entry).Method.ID
								+","+methname2+","+						
								AlgoFinal.methodtraces2HashMap.get(entry).Method.Owner.ID+","+	
								AlgoFinal.methodtraces2HashMap.get(entry).Method.Owner.classname
								+","+AlgoFinal.methodtraces2HashMap.get(entry).Requirement.ID
								+","+AlgoFinal.methodtraces2HashMap.get(entry).gold
								+","+AlgoFinal.methodtraces2HashMap.get(entry).prediction);
			
				bwSuperclassesChildrenJHotDraw2.newLine();
			}
		}
	
	}
	public static void CloseFiles(String ProgramName) throws IOException {
		// TODO Auto-generated method stub
		if (ProgramName.equals("chess")) {
			LogInfo.bwfileChess.close();
		} else if (ProgramName.equals("gantt")) {
			LogInfo.bwfile2.close();
			

		} else if (ProgramName.equals("itrust")) {
			LogInfo.bwfile3.close();
		} else if (ProgramName.equals("jhotdraw")) {
			LogInfo.bwfile4.close();

		}
	}
	public static void closeLogFile() throws IOException {
		// TODO Auto-generated method stub
		LogInfo.bwfile1.newLine();
		LogInfo.bwfile1.close(); 
//		LogInfo.bwfileCumulative.close(); 
	}
	public static void updateInheritanceLogs(String ProgramName, Collection<MethodTrace> MethodTracesHashmapValues,
			LinkedHashMap<String, LogInfo> LogInfoHashMap) throws IOException {
		// TODO Auto-generated method stub			
		 // Create a new file output stream.
      
		if (ProgramName.equals("chess")) {
			LogInfo.bwInterfacesImpChess.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwInterfacesImpChess.newLine();
			LogInfo.bwSuperclassesChildrenChess.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwSuperclassesChildrenChess.newLine();
		
		}
		if (ProgramName.equals("gantt")) {
			LogInfo.bwInterfacesImpGantt.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwInterfacesImpGantt.newLine();
			LogInfo.bwSuperclassesChildrenGantt.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwSuperclassesChildrenGantt.newLine();
		
		}
		if (ProgramName.equals("itrust")) {
			
			LogInfo.bwInterfacesImpiTrust.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwInterfacesImpiTrust.newLine();
			LogInfo.bwSuperclassesChildreniTrust.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwSuperclassesChildreniTrust.newLine();

		}
		if (ProgramName.equals("jhotdraw")) {
			LogInfo.bwInterfacesImpJHotDraw.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwInterfacesImpJHotDraw.newLine();
			LogInfo.bwSuperclassesChildrenJHotDraw.write("Type,MethodID,MethodName,ClassID,ClassName,ReqID,gold,Prediction");
			LogInfo.bwSuperclassesChildrenJHotDraw.newLine();
			
		}
		int count=0; 
		
		HashMap<String, List<String>> InterfacesImplementationsHashMap= new HashMap<String, List<String>>(); 
		HashMap<String, List<String>> SuperclassChildrenHashMap= new HashMap<String, List<String>>(); 

		for (MethodTrace methodtrace : MethodTracesHashmapValues) {
			String reqmethod = methodtrace.Requirement.ID + "-" + methodtrace.Method.ID;
			
			LogInfoHashMap.get(reqmethod);
			/////////////////////////////////////////////////////////
			if(!methodtrace.Method.Implementations.isEmpty()) {
				ArrayList<String> ImpList = new ArrayList<String>(); 
				for(Method myimp: methodtrace.Method.Implementations) {
					ImpList.add(methodtrace.Requirement.ID+"-"+myimp.ID); 
				}
				InterfacesImplementationsHashMap.put(reqmethod,  ImpList); 
			}
			/////////////////////////////////////////////////////////

			if(!methodtrace.Method.Children.isEmpty()) {
				ArrayList<String> ChildrenList = new ArrayList<String>(); 
				for(Method mychild: methodtrace.Method.Children) {
					ChildrenList.add(methodtrace.Requirement.ID+"-"+mychild.ID); 
				}
				SuperclassChildrenHashMap.put(reqmethod,  ChildrenList); 
			}
			
		}
		if (ProgramName.equals("chess")) {
			
			
			UpdateInheritanceLogFiles(InterfacesImplementationsHashMap, SuperclassChildrenHashMap, bwInterfacesImpChess, bwSuperclassesChildrenChess); 

		}
		
		
		
		if (ProgramName.equals("gantt")) {
			
			
			UpdateInheritanceLogFiles(InterfacesImplementationsHashMap, SuperclassChildrenHashMap, bwInterfacesImpGantt, bwSuperclassesChildrenGantt); 

		}
		
		
		if (ProgramName.equals("itrust")) {			
			UpdateInheritanceLogFiles(InterfacesImplementationsHashMap, SuperclassChildrenHashMap, bwInterfacesImpiTrust, bwSuperclassesChildreniTrust); 
}
		
		
		if (ProgramName.equals("jhotdraw")) {
			
			UpdateInheritanceLogFiles(InterfacesImplementationsHashMap, SuperclassChildrenHashMap, bwInterfacesImpJHotDraw, bwSuperclassesChildrenJHotDraw); 
			
			
			
		}
		
		
		if (ProgramName.equals("chess")) {
			bwInterfacesImpChess.close();
			bwSuperclassesChildrenChess.close();
		} else if (ProgramName.equals("gantt")) {
			bwInterfacesImpGantt.close();
			bwSuperclassesChildrenGantt.close();
			

		} else if (ProgramName.equals("itrust")) {
			bwInterfacesImpiTrust.close();
			bwSuperclassesChildreniTrust.close();
		} else if (ProgramName.equals("jhotdraw")) {
			bwInterfacesImpJHotDraw.close();
			bwSuperclassesChildrenJHotDraw.close();
			

		}
	}
	public static void WriteMethodCalls(String programName) throws IOException, CloneNotSupportedException {
		if(programName.equals("chess")) {
			WriteMethodCallsProgram(bwchessMethodCallsWriter); 
		}
		if(programName.equals("gantt")) {
			WriteMethodCallsProgram(bwGANTTMethodCallsWriter); 
		}
		if(programName.equals("itrust")) {
			WriteMethodCallsProgram(bwiTrustMethodCallsWriter); 
		}
		if(programName.equals("jhotdraw")) {
			WriteMethodCallsProgram(bwJHotDrawMethodCallsWriter); 
		}
	}
	private static void WriteMethodCallsProgram(BufferedWriter bwchessMethodCallsWriter) throws IOException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		for( String meth:DatabaseInput.MethodHashMap.keySet()) {
			for(Method callee: DatabaseInput.MethodHashMap.get(meth).getCalleesShell()) {
				bwchessMethodCallsWriter.write(""+DatabaseInput.MethodHashMap.get(meth).getClassrep().classname+"."+DatabaseInput.MethodHashMap.get(meth).methodname+"---");
				
				bwchessMethodCallsWriter.write(callee.getClassrep().classname+"."+callee.methodname);
				bwchessMethodCallsWriter.newLine();
			}
			

		}
		bwchessMethodCallsWriter.close();
	}



}