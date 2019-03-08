package challenges;

import java.util.Arrays;

class BinaryTree  
{ 
	
       
    /* Driver program to test above functions */
    public static void main(String[] args)  
    {   
    	
//       int arr[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1
    	  int arr[] = { 2, 3, 4, 10, 40 }; 

      
      int k= transitionPoint(arr, arr.length); 
//      System.out.println(k);
    }

	private static int transitionPoint(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		
		
		int k=BinarySearch(arr, 0, n, 4); 
		System.out.println(k);
				return k; 
	}

	private static int BinarySearch(int[] arr, int i, int n, int x) {
		// TODO Auto-generated method stub
		if(n>=i) {
			
		
		int mid=i+(n-i)/2; 
		if(arr[mid]==x) {
			return mid; 
		}
		 if(arr[mid]>x) {
			 return BinarySearch(arr, i, mid, x); 
		}else  {
			return BinarySearch(arr, mid, n, x); 
		}
		}
		return -1; 
	} 
} 