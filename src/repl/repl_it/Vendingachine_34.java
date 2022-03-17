package repl.repl_it;

import java.util.Scanner;

public class Vendingachine_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		 int itemPrice;
	     System.out.println("Enter price in cents:" );
	     itemPrice = s.nextInt();
	    int quarters, dimes, nickels, remaind;
	    final int accepts = 100; // accepts only a single dollar bill to pay for the item.
	    remaind = accepts-itemPrice;
	    quarters = remaind/25;
	    dimes = (remaind-(quarters*25))/10;
	    nickels = (remaind-(quarters*25))/5;
	   
	    
	    if(itemPrice>100 || itemPrice<25){
	      System.out.println("Invalid price!");
	    }else if (itemPrice%5!=0){
	       System.out.println("Invalid price!");
	    }
	     System.out.println("Your.change.is."+quarters+".quarters, ."+dimes+  ".dimes, ."+"and."+nickels+".nickels.");
	  
		
	}
}
