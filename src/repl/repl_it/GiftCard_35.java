package repl.repl_it;

import java.util.Scanner;

public class GiftCard_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    String item = scan.nextLine();
	    
//	      double giftCardAmount =100;
//	      double Smartphone = 300.00;
//	      double Laptop = 400.00;
//	      double Charger = 15.00;
//	      double USBcable = 10.00;
//	      double Headphones = 30.00;
//	      double Pants = 50.00;
//	      double Hat = 25.00;
//	      double Socks = 60.00;
//	      double Blanket = 60.00;
//	      double Pillow = 40.00;
	      int balance = 100;
	    if(item.equals("Smartphone") || (item.equals("Laptop"))){
	      System.out.println("Sorry, not enough funds on your gift card!");
	    }
	    else if(item.equals("Charger")){
	     System.out.println("Thank you for your purchase!");
	     balance = balance-15;
	     System.out.println("Your current balance is: "+ balance+ "$");
	    }
	    else if(item.equals("USBcable")) {
	    	System.out.println("Thank you for your purchase!");
		     balance = balance-10;
		     System.out.println("Your current balance is: "+ balance+ "$");
	    }
	    else if(item.equals("Headphones")) {
	    	System.out.println("Thank you for your purchase!");
		     balance = balance-30;
		     System.out.println("Your current balance is: "+ balance+ "$");
	    }
	    else if(item.equals("Pants")) {
	    	System.out.println("Thank you for your purchase!");
		     balance = balance-50;
		     System.out.println("Your current balance is: "+ balance+ "$");
	    }
	    else if(item.equals("Hat")) {
	    	System.out.println("Thank you for your purchase!");
		     balance = balance-25;
		     System.out.println("Your current balance is: "+ balance+ "$");
	    }
	    else if(item.equals("Socks")) {
	    	System.out.println("Thank you for your purchase!");
		     balance = balance-5;
		     System.out.println("Your current balance is: "+ balance+ "$");
	    }
	    else if(item.equals("Blanket")) {
	    	System.out.println("Thank you for your purchase!");
		     balance = balance-60;
		     System.out.println("Your current balance is: "+ balance+ "$");
	    }
	    else if(item.equals("Pillow")) {
	    	System.out.println("Thank you for your purchase!");
		     balance = balance-40;
		     System.out.println("Your current balance is: "+ balance+ "$");
	    }
	    else {
	    	System.out.println("Invalid item!");
	    }
	    
	}

}
