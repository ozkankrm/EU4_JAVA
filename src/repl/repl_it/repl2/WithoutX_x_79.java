package repl.repl_it.repl2;

import java.util.Scanner;

public class WithoutX_x_79 {

	public static void main(String[] args) {
		/*
		 * Given a string word, if the first or last chars are 'x' or 'X', 
		 * print the string without those 'x' or 'X' chars,  otherwise print the string unchanged. 

Example: 
input: xHiX 
output: Hi

Example:
input: apple 
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
		 */

		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    
//		    String str = "x";
		   
//		    str.equalsIgnoreCase(str);
		    
//		    String dummy = "";
	    
		    if(word.substring(0, 1).equalsIgnoreCase("x")){
		    	word = word.substring(1);
		    }
		    if(word.substring(word.length()-1).equalsIgnoreCase("x")) {
		    	word = word.substring(0, word.length()-1);
		    }
		    System.out.println(word);
 
		    
		    
		    
		    
		   
		    
		    
		
	}

}
