package repl.repl_it.repl2;

import java.util.Scanner;

public class CountHi_98 {

	public static void main(String[] args) {
		/*
		 * Print out the number of times that the string "hi" appears anywhere in the given string.
		 */

		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    
		int counter = 0;
		
		for(int i=0; i<str.length()-1; i++) {
			
			if(str.substring(i, i+2).equals("hi")) {
				
				counter++;
			}
		}
		System.out.println(counter);
		
	}

}
