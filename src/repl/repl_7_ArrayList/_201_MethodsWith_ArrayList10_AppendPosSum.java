package repl.repl_7_ArrayList;

import java.util.ArrayList;

public class _201_MethodsWith_ArrayList10_AppendPosSum {

	public static void main(String[] args) {
		/*
		 * Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers
 
This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the 
ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
  The original ArrayList should remain unchanged.
		 */

		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(-6);
		list.add(3);
		list.add(-8);
		list.add(0);
		list.add(4);
		list.add(3);
		System.out.println(list);
		
		System.out.println(appendPosSum(list));
		
	}
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
		 	  
		ArrayList<Integer> arr = new ArrayList<>();
		
		int sum = 0;
		for( Integer each : list) {
			
			if(each>0) {
				arr.add(each);
				
				sum += each;
			}
		}
		arr.add(sum);
		
		return arr;
		}
	

}
