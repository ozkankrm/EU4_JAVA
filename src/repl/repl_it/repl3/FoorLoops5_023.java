package repl.repl_it.repl3;

import java.util.Scanner;

public class FoorLoops5_023 {

	public static void main(String[] args) {

		/*
		 * String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
		 */

		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    
	    String str = "aeiou";
	    for(int i=0; i<word.length(); i++){
	      for(int j=0; j<str.length(); j++) {
	      
	    	  if(word.charAt(i) == str.charAt(j) ){
	        
	          System.out.print(word.charAt(i));
	      }
	    }
	    }
	}

}
