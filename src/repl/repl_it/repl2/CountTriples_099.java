package repl.repl_it.repl2;

import java.util.Scanner;

public class CountTriples_099 {

	public static void main(String[] args) {
		/*
		 * We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.
Example:
input: abcXXXabc
output: 1

Example:
input: xxxabyyyycd
output: 3

Example:
input: java
output: 0
		 */

		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int count = 0 ;
	    //WRITE YOUR CODE HERE
	    
	    for(int i=0; i<str.length()-2; i++){
	      
	      if(str.substring(i, i+3).equals(str.charAt(i) +""+ str.charAt(i)+""+str.charAt(i))){
	        count++;
	      }
	      
	      
	    }
	    System.out.println(count);
		
		
		
	}

}
