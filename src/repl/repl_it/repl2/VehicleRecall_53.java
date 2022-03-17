package repl.repl_it.repl2;

import java.util.Scanner;

public class VehicleRecall_53 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Enter vehicle's year:");
		    int a = scan.nextInt();
		    
		    if(a>=1995 && a<=1998 || a>=2001 && a<=2002 || a>=2004 && a<=2006 || a>=2015 && a<=2017){
		      
		      System.out.println("Your vehicle needs to be recalled!");
		    }else{
		      System.out.println("Your vehicle is fine, enjoy!");
		    }
	}

}
