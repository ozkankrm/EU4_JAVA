package repl.repl_5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_SplitSentence_135 {

	public static void main(String[] args) {
		/*
		 * Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun
		 */

		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
		
	    
	 String[] str =  sentence.split(" ");
	    
	    System.out.println(Arrays.toString(str));
	    
	    for(String value : str) {
	    	System.out.println(value);
	    }
	}
	
	
	
	

}
