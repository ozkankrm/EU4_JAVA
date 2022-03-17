package repl.repl_it.repl3;

import java.util.Scanner;

public class HasAJava_93 {

	public static void main(String[] args) {
		/*
		 * Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
		 * such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, 
		 * including 0word = . 
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false
		 */
		boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    String str = "java";
	    
	    if(word.length()<4) {
	    	exists = false;
	    	
	    }else if(word.substring(0, str.length()).equalsIgnoreCase(str) || word.substring(1, str.length()+1).equalsIgnoreCase(str) ) {
		   exists = true;
	   }
	   System.out.println(exists);
	    	
	    		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
