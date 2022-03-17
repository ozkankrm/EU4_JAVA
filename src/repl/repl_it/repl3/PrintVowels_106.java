package repl.repl_it.repl3;

import java.util.Scanner;

public class PrintVowels_106 {

	public static void main(String[] args) {
		/*
		 * Write a for loop that will loop through every letter of the input and print out just the vowels.
		 *  Sample input/outputs
In: howdyho
oo
		 */

		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		 
	    String result = "";
	    for(int i= 0; i<word.length(); i++) {
	    		
	    	char letter = word.charAt(i);
	    	
	    if(letter=='a'||letter=='e' || letter=='i' || letter=='o' || letter=='u') {
	    	
	    	System.out.print(letter);
	    	
	    }
	  
	    }
	    
	    
		
	}

}
