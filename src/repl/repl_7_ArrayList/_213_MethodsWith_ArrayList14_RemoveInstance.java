package repl.repl_7_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _213_MethodsWith_ArrayList14_RemoveInstance {

	public static void main(String[] args) {
		/*
		 * This method gets an arraylist of Integers and a number(Integer).
		 * it returns an arraylist.

It removes any instance of the number it gets from the arraylist.

for example:

romoveInst([1,1,2,3,1,4],1)
returns: [2,3,4]

romoveInst([3,4,3,3],4)
returns: [3,3,3]
		 */

		ArrayList<Integer>  arr = new ArrayList<>();
	    Integer[] nums = new Integer[]{3,4,3,3,3,4};
	    arr.addAll(Arrays.asList(nums));
	    
	    System.out.print(removeInst(arr,4));
	    
	}
	
	 public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) 
	  {
	   
			 for(int i=0; i<r.size(); i++) {
				 
				 if(r.get(i)==n) {
					 
					 r.remove(i);
					 i--;
				 }
			 }
		
			 //second way
			 
			// r.removeAll( Arrays.asList(n));
			 
			 //third way
			 //r.removeIf( each -> each==n);
			 
		   return r;  
	  }

}
