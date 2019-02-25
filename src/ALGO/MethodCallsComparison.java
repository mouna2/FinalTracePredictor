package ALGO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.compress.utils.Sets;

public class MethodCallsComparison {

	
	
	public static void main (String [] args) {
		BufferedReader reader;
		BufferedReader reader2;

		HashMap<String,List<String>> ExtendedHashMap = new HashMap <String, List<String>>(); 
		HashMap<String,List<String>> ExecutedHashMap = new HashMap <String, List<String>>(); 

		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\ChessFiles\\MethodCalls.txt"));
			String line = reader.readLine();
			while (line != null) {
//				System.out.println(line);
				String[] lines = line.split("---"); 
				if(ExtendedHashMap.get(lines[0])==null) {
					ArrayList<String> mylist = new ArrayList<String>(); 
					mylist.add(lines[1]); 
					ExtendedHashMap.put(lines[0], mylist); 
				}else {
					List<String> mylist = ExtendedHashMap.get(lines[0]); 
					mylist.add(lines[1]); 
					ExtendedHashMap.put(lines[0], mylist); 
				}
				// read next line
				line = reader.readLine();
			}
			
			
			reader2 = new BufferedReader(new FileReader("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\ChessFiles\\MethodCallsExecutedFormatted.txt"));	
			String line2 = reader2.readLine();
			while (line2 != null) {
//				System.out.println(line2);
				String[] lines = line2.split("---"); 
				if(ExecutedHashMap.get(lines[0])==null) {
					ArrayList<String> mylist = new ArrayList<String>(); 
					mylist.add(lines[1].trim()); 
					ExecutedHashMap.put(lines[0].trim(), mylist); 
				}else {
					List<String> mylist = ExecutedHashMap.get(lines[0].trim()); 
					mylist.add(lines[1].trim()); 
					ExecutedHashMap.put(lines[0].trim(), mylist); 
				}
				// read next line
				line2 = reader2.readLine();
			}
			
			
			
			reader.close();
			
			
			for(String key: ExecutedHashMap.keySet()) {
						List<String> ExecutedList = ExecutedHashMap.get(key); 
						List<String> ExtendedList = ExtendedHashMap.get(key); 
						if(ExtendedList!=null) {
							for(String executed: ExecutedList) {
								boolean flag=false; 
								for(String extended: ExtendedList) {
									if(executed.equals(extended)) {
										System.out.println("PRESENT IN BOTH  "+key+"---"+extended);
										flag=true; 
									}
								}
								if(flag==false ) {
									System.out.println("ONLY IN EXECUTED "+key+"---"+executed);

								}

							}
							
							
							for(String extended: ExtendedList) {
								boolean flag=false; 
								for(String executed: ExecutedList) {
									if(executed.equals(extended)) {
										flag=true; 
									}
								}
								if(flag==false ) {
									System.out.println("ONLY IN EXTENDED "+key+"---"+extended);

								}

							}
							System.out.println("-----------------------------------------------------------");
							
							
						}
						

			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
