package repl.repl_it.repl3;

import java.util.Scanner;

public class Party_86 {

	public static void main(String[] args) {
		/*
		 * Imagine you have a party and need to form the list of the guests.
		 *  (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

		 */
		 Scanner input = new Scanner(System.in);

		    int count = 0;
		    String name = "";
		    String contune ="";
		    String list = "";
		
		    
		    do{
			  System.out.println("Please enter guest name:");
		      name = input.next(); 
		      System.out.println("Do you want to enter new guest name:");
		      
		      list += name;
		      contune = input.next();
	
		      
		      if(contune.equalsIgnoreCase("yes")) {
		    	  list += ", "; 
		      }
		      
		      count++;
		    }while(contune.equalsIgnoreCase("yes"));
		    
		    System.out.print("Guest's list: " + list );
		    
		    

	}

}
