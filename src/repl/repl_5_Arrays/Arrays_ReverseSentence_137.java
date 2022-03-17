package repl.repl_5_Arrays;

import java.util.Scanner;

public class Arrays_ReverseSentence_137 {

	public static void main(String[] args) {
		/*
		 * Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
		 */

		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    
	    String [] str = sentence.split(" ");
	    
	    for(int i=0; i<str.length; i++) {
	    	
	    	System.out.println(str[str.length-1-i]);
	    }
	    
	    
		
		
	}
	
	

}
