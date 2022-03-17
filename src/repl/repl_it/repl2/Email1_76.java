package repl.repl_it.repl2;

import java.util.Scanner;

public class Email1_76 {

	public static void main(String[] args) {
		/*
		 * n this task, you need to swap first name with last name in the email. 
		 * If email doesn't contains underscore - do not anything. 

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
		 */
		
		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		
		  
		    
		    String dummy = "";
		    
		 if(email.contains("_")) {
			
			System.out.println(email.indexOf('_'));
			System.out.println(email.indexOf('@'));
			
			dummy = email.substring(email.indexOf('_')+1, email.indexOf('@'));
			 
			dummy = dummy +'_' + email.substring(0, email.indexOf('_')) + 
					email.concat(email).substring(email.indexOf('@'), email.length()); 
		
			 
			 
		 }else if(!email.contains("_")) {
			 dummy = email;
		 }
		 
		 System.out.println(dummy);
		
		
		
		
		
		
		
		

	}

}
