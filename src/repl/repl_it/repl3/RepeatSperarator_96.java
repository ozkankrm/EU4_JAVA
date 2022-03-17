package repl.repl_it.repl3;

import java.util.Scanner;

public class RepeatSperarator_96 {

	public static void main(String[] args) {
		/*
		 * Given two strings, word and a separator sep, return a big string made of count occurrences 
		 * of the word, separated by the separator string.
		 */

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    
	    String dummy = "";
	    
	   for(int i=0; i<count-1; i++) {
		dummy += word + separator;    
		   
	   }
	   dummy += word;
	   System.out.println(dummy);
	    
	  
	}


}