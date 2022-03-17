package repl.repl_7_ArrayList;

import java.util.ArrayList;

public class _215_MethodsWithArrayList16_2Times {

	public static void main(String[] args) {
		/*
		 * Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of 
the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
		 */
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(7);
		
		System.out.println(twoTimes(list));
		
	}
	  public static ArrayList<Integer> twoTimes(ArrayList<Integer> n){
		 
		  ArrayList<Integer> newArray = new ArrayList<>();
		    
		    for(Integer value : n){
		      
		      newArray.add(value);
		      newArray.add(value);
		      
		    }
		    
		    return newArray;
		  
		  
		  
	/*	    for(int i=0; i<n.size(); i+=2){
		      
		      n.add(i+1, n.get(i));
		      
		    }
		    
		    return n;*/
		  
		  }

}
