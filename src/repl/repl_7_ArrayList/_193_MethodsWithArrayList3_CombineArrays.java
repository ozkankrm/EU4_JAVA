package repl.repl_7_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _193_MethodsWithArrayList3_CombineArrays {

	public static void main(String[] args) {
		/*
		 * combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
		 */

		String[] s1 = {"1", "2", "3"};
		String[] s2 = {"4"};

		System.out.println(combineRs(s1, s2));

	}
	public static String combineRs(String[] r1,String[] r2) 
	  {
	  ArrayList<String> list = new ArrayList<>();
	  
	  for(int i=0; i<r1.length; i++) {
		  
		  list.add(r1[i]);
	  }
	 
	  for(int i=0; i<r2.length; i++) {
	  
		  list.add(r2[i]);
	  
	 }
	  
	  String str = "";
	  for(int i=0; i<list.size(); i++) {
		  str += list.get(i);
	  }
	 
	   return str;
	  
	  }
	  

}
