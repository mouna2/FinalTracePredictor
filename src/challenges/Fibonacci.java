package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in); 
    	String input=sc.nextLine(); 
    	System.out.println(input);
    	
    	String[] arr = input.split(" "); 
//    	System.out.println(arr);
    	int NumberOfPeople= Integer.parseInt(arr[0]); 
    	int skipped= Integer.parseInt(arr[1]); 
    	kill(NumberOfPeople, skipped); 

    }

	private static void kill(int numberOfPeople, int skipped) {
		// TODO Auto-generated method stub
		List<Integer> mylist = new ArrayList<Integer>(); 
		List<Integer> Removed = new ArrayList<Integer>(); 
		for(int i=1; i<=numberOfPeople; i++) {
			mylist.add(i); 
		}
		int count=0; 
		for(int i: mylist) {
				
				if(count==skipped) {
					Removed.add(i); 
					count=0; 
				}else {
					count++; 
				}
				
			
		}
		
		
		for(int i: Removed) {
			mylist.remove(i-1); 
		}
		if(mylist.size()==1) {
			System.out.println(mylist.get(0));
		}
		if(mylist.size()>1) {
		kill(mylist.size(), skipped); 
		}
	}

}
