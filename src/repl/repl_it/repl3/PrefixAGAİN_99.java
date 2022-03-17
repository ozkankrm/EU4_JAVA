package repl.repl_it.repl3;

import java.util.Scanner;

public class PrefixAGAİN_99 {

	public static void main(String[] args) {
		/*
		 * Given a string, consider the prefix string made of the first 
		 * n chars of the string. Does that prefix string appear somewhere
		 *  else in the string? 
Assume that the string is not empty and that n is in the range from 1 
till str.length().

Example:
input: abXYabc
input: 1
output: true
a appears twice

Example:
input: abXYabc
input: 2
output: true
ab appears twice

Example:
input: abXYabc
input: 3
output: false
abX appears once only
		 */

		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int n = scan.nextInt();
		
	    String prefix = str.substring(0, n);
	    
	    String remaining = str.substring(n);
	    System.out.println(remaining.contains(prefix));
		
		
		
		
		
		
		
	}

}
