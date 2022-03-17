package repl.rep.it4;

import java.util.Scanner;

public class _158_Methods13_VerifyDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    String numStr = scan.next();
		    printDataTypes(numStr);
	}
	
	 public static void printDataTypes(String numStr){
		    long num = 0;
		    try{
		       num = Long.valueOf(numStr);
		       System.out.println(num+" can be fitted in:");
		       if(num>=-128 && num<=127){
		            System.out.println("* byte");
		        }
		        //WRITE YOUR CODE HERE
		       // finding upper and lowerbound of each type
		       //Long.MAX_VALEU // Long.MIN_VALUE
		     //Integer.MAX_VALEU // Integer.MIN_VALUE
		     //Short.MAX_VALEU // Short.MIN_VALUE
		     //Byte.MAX_VALEU // Byte.MIN_VALUE
		       
		       if(num>=Short.MIN_VALUE && num<=Short.MAX_VALUE) {
		    	   System.out.println("Short");
		       }
		       if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE) {
		    	   System.out.println("Integer");
		       }
		       if(num>=Long.MIN_VALUE && num<=Long.MAX_VALUE) {
		    	   System.out.println("Long");
		       }
		        
		        
		        //DO NOT CHANGE        
		    }catch(Exception e){
		       System.out.println(numStr+" can't be fitted anywhere.");
		    }
		  }

}
