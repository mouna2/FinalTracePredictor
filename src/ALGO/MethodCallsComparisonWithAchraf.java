package ALGO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.compress.utils.Sets;

public class MethodCallsComparisonWithAchraf {

	
	
	public static void main (String [] args) throws IOException {
		BufferedReader reader = null;
		BufferedReader reader2 = null;
		boolean chessFlag=false; 
		boolean GanttFlag=true; 
		boolean itrustFlag=false; 
		boolean JHotDrawFlag=false; 
		Writer wr=null; 
		HashMap<String,List<String>> ExtendedHashMap = new HashMap <String, List<String>>(); 
		HashMap<String,List<String>> ExecutedHashMap = new HashMap <String, List<String>>(); 
		if(chessFlag==true) {
			 wr = new FileWriter("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\NEW_DATA\\CHESSComparisonMethodCalls.txt");

		}else if(GanttFlag==true) {
			 wr = new FileWriter("C:\\Users\\mouna\\ownCloud\\Share\\dumps\\NEW_DATA\\GANTTComparisonMethodCalls.txt");
		}

		try {
			if(chessFlag==true) {
				reader = new BufferedReader(new FileReader("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\ChessFiles\\MethodCalls.txt"));

			}else if(GanttFlag==true) {
				reader = new BufferedReader(new FileReader("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\GanttFiles\\MethodCalls.txt"));
			}
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
			
			if(chessFlag==true) {
				reader2 = new BufferedReader(new FileReader("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\ChessFiles\\MethodCallsExecutedFormatted.txt"));	

			}else if(GanttFlag==true) {
				reader2 = new BufferedReader(new FileReader("C:\\Users\\mouna\\new_workspace\\TracePredictorFinal\\src\\GanttFiles\\dataMethodCallsExecutedGanttFormattedFinal.txt"));
			}
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
			
			int counter2=0; 
			for(String key: ExtendedHashMap.keySet()) {
				for(String s: ExtendedHashMap.get(key)) {
					counter2++; 
				}
			}
			System.out.println(counter2);
			
			reader.close();
			
			int counter=0; 
			for(String key: ExecutedHashMap.keySet()) {
						List<String> ExecutedList = ExecutedHashMap.get(key); 
						List<String> ExtendedList = ExtendedHashMap.get(key); 
						if(ExtendedList!=null) {
							for(String executed: ExecutedList) {
								boolean flag=false; 
								for(String extended: ExtendedList) {
									if(executed.equals(extended)) {
										wr.write("PRESENT IN BOTH/  "+key+"/"+extended);
										wr.write("\n");
										flag=true; 
										
									}
								}
								if(flag==false ) {
									wr.write("ONLY IN EXECUTED/ "+key+"/"+executed);
									System.out.println("ONLY IN EXECUTED/ "+key+"/"+executed);
									wr.write("\n");
									
								}
								counter++; 
							}
							
							for(String extended: ExtendedList) {
								boolean flag=false; 
								if(ExecutedList!=null) {
									for(String executed: ExecutedList) {
										if(executed.equals(extended)) {
											flag=true; 
										}
									}
									if(flag==false ) {
										wr.write("ONLY IN EXTENDED/ "+key+"/"+extended);
										wr.write("\n");
									}
								}
								

							}
							wr.write("*****************************************");
							wr.write("\n"); 
							
						}else {
							for(String executed: ExecutedList) {
							wr.write("ONLY IN EXECUTED/ "+key+"/"+executed);
							System.out.println("ONLY IN EXECUTED/ "+key+"/"+executed);
							wr.write("\n");
							}
							wr.write("*****************************************");
							wr.write("\n"); 
						}
						

			
			}
			for(String key: ExtendedHashMap.keySet()) {
				List<String> ExecutedList = ExecutedHashMap.get(key); 
				List<String> ExtendedList = ExtendedHashMap.get(key); 
				if(ExecutedList==null) {
					for(String extended: ExtendedList) {
						wr.write("ONLY IN EXTENDED/ "+key+"/"+extended);
						
						wr.write("\n");
						}
						wr.write("*****************************************");
						wr.write("\n"); 
				}
			}
			System.out.println("COUNTER "+counter);
			
			
			
			wr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
}
