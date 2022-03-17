package repl.repl_7_ArrayList;

import java.util.ArrayList;

public class _202_MethodsWithArrayList11_TimesTwo {

	public static void main(String[] args) {
		/*
		 * Create a method that:
is called timesTwo
returns nothing
takes in a single parameter - an ArrayList of Integers called nums

This method should take the ArrayList parameter and multiply every value by two.
		 */

		ArrayList<Integer> t = new ArrayList<>();
		
		t.add(1);
		t.add(5);
		t.add(3);
		timesTwo(t);
	}
	
	public static void timesTwo(ArrayList<Integer> nums) {
		
	for(int i=0; i<nums.size(); i++) {
			
			nums.set(i, nums.get(i)*2);
		}
	}

}
