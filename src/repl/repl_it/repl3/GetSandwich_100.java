package repl.repl_it.repl3;

import java.util.Scanner;

public class GetSandwich_100 {

	public static void main(String[] args) {
		/*
		 * A sandwich is two pieces of bread with something in between.
		 *  Print the string that is between the first and last appearance of "bread" in the given string, 
		 *  or return string "nothing" if there are not two pieces of bread.

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
		 */
		
		 Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	   
//	     string contains bread
//	       make sure we have at least 2 bread
//	     then get the middle part using substring
	     
	     if(str.contains("bread")) {
	    	 int fisrtIndex = str.indexOf("bread"); 
	    	 int lastIndex = str.lastIndexOf("bread");
	    	 
	    	 if(fisrtIndex==lastIndex) {
	    		 System.out.println("nothing");
	    	 }else {
//	    		 it means we have at least 2 bread
//	    		 breadjambbread
	    		 System.out.println(str.substring(fisrtIndex+5, lastIndex));
	    	 }
	    	 
	     }else {
	    	 System.out.println("nothing"); 
	     }
	     
	     
	}

}
