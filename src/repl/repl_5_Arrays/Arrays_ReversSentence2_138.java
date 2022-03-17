package repl.repl_5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_ReversSentence2_138 {

	public static void main(String[] args) {

		/*
		 * Given a String variable sentence, write code to get each word and assign to String reversed in reverse order. 

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"

		 */
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	   
	    String[] str = sentence.split(" ");
	    
//	  System.out.println(Arrays.toString(str));
	    
	  
	    for(int i=0; i<str.length; i++) {
	    	reversed += str[str.length-1-i] + " ";
	    	
	    	
	    }
	   reversed =  reversed.trim();
	    
	    
	    
	    //End your code here. do not modify below statement
	    System.out.println(reversed);

	}

}
