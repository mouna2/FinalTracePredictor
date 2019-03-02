package ALGO;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import mypackage.*;
import ALGO.*; 
class Test {

	@org.junit.jupiter.api.Test
	
	
	
	
	void test() throws SQLException, CloneNotSupportedException {
		DatabaseReading DatabaseReading= new DatabaseReading("dummy"); 
		LinkedHashMap<String, MethodTrace> methodtraces2HashMap = DatabaseReading.getMethodtracehashmap();
		HashMap<String, String> MethodHashMapCallees= new HashMap<String, String>(); 
		HashMap<String, String> MethodHashMapCallers= new HashMap<String, String>(); 

		SetExpectedValues(MethodHashMapCallees, MethodHashMapCallers); 
	

		for(MethodTrace Methodtrace: methodtraces2HashMap.values()) {
			System.out.println("===>Method "+Methodtrace.getMethod().ID);

			System.out.println("CALLERS "+Methodtrace.getMethod().getCallersShell().toString());
			System.out.println("CALLEES "+Methodtrace.getMethod().getCalleesShell().toString());

			assertEquals(Methodtrace.getMethod().getCallersShell().toString(), MethodHashMapCallers.get(Methodtrace.getMethod().ID));
			assertEquals(Methodtrace.getMethod().getCalleesShell().toString(), MethodHashMapCallees.get(Methodtrace.getMethod().ID));

			
			//SET EXPECTED VALUES 
//			System.out.println("methodHashMapCallers.put(\""+Methodtrace.getMethod().ID+"\",\""+Methodtrace.getMethod().getCallersShell().toString()+"\");");
//			System.out.println("methodHashMapCallees.put(\""+Methodtrace.getMethod().ID+"\",\""+Methodtrace.getMethod().getCalleesShell().toString()+"\");");
		}
		
	}

	private void SetExpectedValues(HashMap<String, String> methodHashMapCallees,
			HashMap<String, String> methodHashMapCallers) {
			methodHashMapCallers.put("1","[]");
			methodHashMapCallees.put("1","[2, methodname=m2]");
			methodHashMapCallers.put("2","[1, methodname=m1]");
			methodHashMapCallees.put("2","[]");
			methodHashMapCallers.put("3","[5, methodname=m5]");
			methodHashMapCallees.put("3","[]");
			methodHashMapCallers.put("4","[5, methodname=m5]");
			methodHashMapCallees.put("4","[]");
			methodHashMapCallers.put("5","[]");
			methodHashMapCallees.put("5","[3, methodname=method, 4, methodname=method]");
			methodHashMapCallers.put("6","[8, methodname=m8]");
			methodHashMapCallees.put("6","[]");
			methodHashMapCallers.put("7","[8, methodname=m8]");
			methodHashMapCallees.put("7","[]");
			methodHashMapCallers.put("8","[]");
			methodHashMapCallees.put("8","[7, methodname=method, 6, methodname=method]");
			methodHashMapCallers.put("9","[]");
			methodHashMapCallees.put("9","[11, methodname=m11]");
			methodHashMapCallers.put("10","[]");
			methodHashMapCallees.put("10","[11, methodname=m11]");
			methodHashMapCallers.put("11","[10, methodname=method, 9, methodname=method]");
			methodHashMapCallees.put("11","[]");
			methodHashMapCallers.put("12","[]");
			methodHashMapCallees.put("12","[13, methodname=method, 14, methodname=method, 15, methodname=method]");
			methodHashMapCallers.put("13","[12, methodname=m12]");
			methodHashMapCallees.put("13","[]");
			methodHashMapCallers.put("14","[12, methodname=m12]");
			methodHashMapCallees.put("14","[]");
			methodHashMapCallers.put("15","[12, methodname=m12]");
			methodHashMapCallees.put("15","[]");
			methodHashMapCallers.put("16","[19, methodname=m19]");
			methodHashMapCallees.put("16","[]");
			methodHashMapCallers.put("17","[19, methodname=m19]");
			methodHashMapCallees.put("17","[]");
			methodHashMapCallers.put("18","[]");
			methodHashMapCallees.put("18","[]");
			methodHashMapCallers.put("19","[]");
			methodHashMapCallees.put("19","[17, methodname=method, 16, methodname=method]");
			methodHashMapCallers.put("20","[]");
			methodHashMapCallees.put("20","[23, methodname=m23]");
			methodHashMapCallers.put("21","[]");
			methodHashMapCallees.put("21","[]");
			methodHashMapCallers.put("22","[]");
			methodHashMapCallees.put("22","[23, methodname=m23]");
			methodHashMapCallers.put("23","[22, methodname=method, 20, methodname=method]");
			methodHashMapCallees.put("23","[]");
			methodHashMapCallers.put("24","[]");
			methodHashMapCallees.put("24","[25, methodname=method, 26, methodname=method]");
			methodHashMapCallers.put("25","[24, methodname=m24]");
			methodHashMapCallees.put("25","[]");
			methodHashMapCallers.put("26","[24, methodname=m24]");
			methodHashMapCallees.put("26","[]");
			methodHashMapCallers.put("27","[]");
			methodHashMapCallees.put("27","[28, methodname=method]");
			methodHashMapCallers.put("28","[27, methodname=m27]");
			methodHashMapCallees.put("28","[]");
			methodHashMapCallers.put("29","[]");
			methodHashMapCallees.put("29","[]");
			methodHashMapCallers.put("30","[]");
			methodHashMapCallees.put("30","[]");
			methodHashMapCallers.put("31","[]");
			methodHashMapCallees.put("31","[32, methodname=m32]");
			methodHashMapCallers.put("32","[31, methodname=method]");
			methodHashMapCallees.put("32","[]");
			methodHashMapCallers.put("33","[]");
			methodHashMapCallees.put("33","[35, methodname=m35]");
			methodHashMapCallers.put("34","[]");
			methodHashMapCallees.put("34","[]");
			methodHashMapCallers.put("35","[33, methodname=method]");
			methodHashMapCallees.put("35","[]");
			methodHashMapCallers.put("36","[]");
			methodHashMapCallees.put("36","[37, methodname=method, 38, methodname=method, 39, methodname=method]");
			methodHashMapCallers.put("37","[36, methodname=m36]");
			methodHashMapCallees.put("37","[]");
			methodHashMapCallers.put("38","[36, methodname=m36]");
			methodHashMapCallees.put("38","[]");
			methodHashMapCallers.put("39","[36, methodname=m36]");
			methodHashMapCallees.put("39","[]");
			methodHashMapCallers.put("40","[]");
			methodHashMapCallees.put("40","[41, methodname=method]");
			methodHashMapCallers.put("41","[40, methodname=m40]");
			methodHashMapCallees.put("41","[]");
			methodHashMapCallers.put("42","[]");
			methodHashMapCallees.put("42","[]");
			methodHashMapCallers.put("43","[]");
			methodHashMapCallees.put("43","[]");
			methodHashMapCallers.put("44","[]");
			methodHashMapCallees.put("44","[]");
			methodHashMapCallers.put("45","[]");
			methodHashMapCallees.put("45","[]");
			methodHashMapCallers.put("46","[]");
			methodHashMapCallees.put("46","[47, methodname=m47]");
			methodHashMapCallers.put("47","[46, methodname=method]");
			methodHashMapCallees.put("47","[]");
			methodHashMapCallers.put("48","[]");
			methodHashMapCallees.put("48","[51, methodname=m51]");
			methodHashMapCallers.put("49","[]");
			methodHashMapCallees.put("49","[]");
			methodHashMapCallers.put("50","[]");
			methodHashMapCallees.put("50","[]");
			methodHashMapCallers.put("51","[48, methodname=method]");
			methodHashMapCallees.put("51","[]");
			methodHashMapCallers.put("52","[]");
			methodHashMapCallees.put("52","[53, methodname=method, 54, methodname=method]");
			methodHashMapCallers.put("53","[52, methodname=m52]");
			methodHashMapCallees.put("53","[]");
			methodHashMapCallers.put("54","[52, methodname=m52]");
			methodHashMapCallees.put("54","[]");
			methodHashMapCallers.put("55","[]");
			methodHashMapCallees.put("55","[56, methodname=method, 57, methodname=method]");
			methodHashMapCallers.put("56","[55, methodname=m55]");
			methodHashMapCallees.put("56","[]");
			methodHashMapCallers.put("57","[55, methodname=m55]");
			methodHashMapCallees.put("57","[]");
			methodHashMapCallers.put("58","[]");
			methodHashMapCallees.put("58","[60, methodname=m60]");
			methodHashMapCallers.put("59","[]");
			methodHashMapCallees.put("59","[60, methodname=m60]");
			methodHashMapCallers.put("60","[59, methodname=method, 58, methodname=method]");
			methodHashMapCallees.put("60","[]");
			methodHashMapCallers.put("61","[]");
			methodHashMapCallees.put("61","[62, methodname=method, 63, methodname=method, 64, methodname=method]");
			methodHashMapCallers.put("62","[61, methodname=m61]");
			methodHashMapCallees.put("62","[]");
			methodHashMapCallers.put("63","[61, methodname=m61]");
			methodHashMapCallees.put("63","[]");
			methodHashMapCallers.put("64","[61, methodname=m61]");
			methodHashMapCallees.put("64","[]");
			methodHashMapCallers.put("65","[]");
			methodHashMapCallees.put("65","[66, methodname=method, 68, methodname=method]");
			methodHashMapCallers.put("66","[65, methodname=m65]");
			methodHashMapCallees.put("66","[]");
			methodHashMapCallers.put("67","[]");
			methodHashMapCallees.put("67","[]");
			methodHashMapCallers.put("68","[65, methodname=m65]");
			methodHashMapCallees.put("68","[]");
			methodHashMapCallers.put("69","[]");
			methodHashMapCallees.put("69","[72, methodname=m72]");
			methodHashMapCallers.put("70","[]");
			methodHashMapCallees.put("70","[]");
			methodHashMapCallers.put("71","[]");
			methodHashMapCallees.put("71","[72, methodname=m72]");
			methodHashMapCallers.put("72","[71, methodname=method, 69, methodname=method]");
			methodHashMapCallees.put("72","[]");
			methodHashMapCallers.put("73","[]");
			methodHashMapCallees.put("73","[74, methodname=method, 75, methodname=method]");
			methodHashMapCallers.put("74","[73, methodname=m73]");
			methodHashMapCallees.put("74","[]");
			methodHashMapCallers.put("75","[73, methodname=m73]");
			methodHashMapCallees.put("75","[]");
			methodHashMapCallers.put("76","[]");
			methodHashMapCallees.put("76","[77, methodname=method]");
			methodHashMapCallers.put("77","[76, methodname=m76]");
			methodHashMapCallees.put("77","[]");
			methodHashMapCallers.put("78","[]");
			methodHashMapCallees.put("78","[]");
			methodHashMapCallers.put("79","[]");
			methodHashMapCallees.put("79","[]");
			methodHashMapCallers.put("80","[]");
			methodHashMapCallees.put("80","[81, methodname=m81]");
			methodHashMapCallers.put("81","[80, methodname=method]");
			methodHashMapCallees.put("81","[]");
			methodHashMapCallers.put("82","[]");
			methodHashMapCallees.put("82","[84, methodname=m84]");
			methodHashMapCallers.put("83","[]");
			methodHashMapCallees.put("83","[]");
			methodHashMapCallers.put("84","[82, methodname=method]");
			methodHashMapCallees.put("84","[]");
			methodHashMapCallers.put("85","[]");
			methodHashMapCallees.put("85","[86, methodname=method, 87, methodname=method, 88, methodname=method]");
			methodHashMapCallers.put("86","[85, methodname=m85]");
			methodHashMapCallees.put("86","[]");
			methodHashMapCallers.put("87","[85, methodname=m85]");
			methodHashMapCallees.put("87","[]");
			methodHashMapCallers.put("88","[85, methodname=m85]");
			methodHashMapCallees.put("88","[]");
			methodHashMapCallers.put("89","[]");
			methodHashMapCallees.put("89","[90, methodname=method]");
			methodHashMapCallers.put("90","[89, methodname=m89]");
			methodHashMapCallees.put("90","[]");
			methodHashMapCallers.put("91","[]");
			methodHashMapCallees.put("91","[]");
			methodHashMapCallers.put("92","[]");
			methodHashMapCallees.put("92","[]");
			methodHashMapCallers.put("93","[]");
			methodHashMapCallees.put("93","[]");
			methodHashMapCallers.put("94","[]");
			methodHashMapCallees.put("94","[96, methodname=m96]");
			methodHashMapCallers.put("95","[]");
			methodHashMapCallees.put("95","[]");
			methodHashMapCallers.put("96","[94, methodname=method]");
			methodHashMapCallees.put("96","[]");
			methodHashMapCallers.put("97","[]");
			methodHashMapCallees.put("97","[100, methodname=m100]");
			methodHashMapCallers.put("98","[]");
			methodHashMapCallees.put("98","[]");
			methodHashMapCallers.put("99","[]");
			methodHashMapCallees.put("99","[]");
			methodHashMapCallers.put("100","[97, methodname=method]");
			methodHashMapCallees.put("100","[]");}

}
