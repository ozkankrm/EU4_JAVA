package repl.repl_it.repl2;

import java.util.Scanner;

public class Email2_77 {

	public static void main(String[] args) {
		/*
		 * Write a program that will print out information about user based on email. Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
		 */
		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    
//		    �nce _ @ ve . karakterlerinin indexini bul sonra onlara g�re substring yap
		    
//		    System.out.println(email.indexOf('_'));
//		    System.out.println(email.indexOf('@'));
//		    System.out.println(email.indexOf('.'));
		    
		    System.out.println("First name: " + email.toUpperCase().charAt(0) 
		    		+ email.substring(1, email.indexOf('_')));
		    
		    System.out.println("Last name: "+ email.toUpperCase().charAt(email.indexOf('_')+1) 
		    		+ email.substring(email.indexOf('_')+2, email.indexOf('@')));
		    System.out.println("Domain: "  + email.substring(email.indexOf('@')+1, email.indexOf('.')));
		    System.out.println("Top-Level Domain: " + email.substring(email.indexOf('.')+1));
		    
//		   lastName first letter for uppercase
//		    System.out.println(email.toUpperCase().charAt(email.indexOf('_')+1));
		
	}

}
