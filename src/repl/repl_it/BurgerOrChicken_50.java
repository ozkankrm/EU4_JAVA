package repl.repl_it;

import java.util.Scanner;

public class BurgerOrChicken_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
	    
	    float price  = 10.0f;
	    System.out.println("Enter main orders:");
	    String in = s.next();
	    
	    if(in.equals("burger") || in.equals("chicken") ){
	    	
	      System.out.println("price is: " + price);
	    }if(in.equals("soda")) {
	    	price = 2;
	    	System.out.println(price);
	    }
	    	
	    
	}

}
