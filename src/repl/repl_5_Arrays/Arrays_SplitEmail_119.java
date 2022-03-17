package repl.repl_5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_SplitEmail_119 {

	public static void main(String[] args) {
		/*
		 * Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:  
Email id: info
Email domain: cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:  
invalid email

email -> my@fancy@email.com
print:  
invalid email
		 */
		Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	 
//	    String str = "info@cybertekschool.com";
	    
	    String[] array = email.split("@");
	    
//	    System.out.println(Arrays.toString(array));
	    
//	    Arrays.toString(array).length();
	 if(array.length==2) {
		 
//		 String str = Arrays.toString(array);
		 System.out.println("Email id: " + array[0]);
		 System.out.println("Email domain: " + array[1]);	 
	 }
	 else {
		 System.out.println("invalid email");
	 }
	    
		
		
		
		
		
		
	}

}
