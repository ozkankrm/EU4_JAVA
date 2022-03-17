package repl.repl_it;

import java.util.Scanner;

public class ThreeNumbers_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s = new Scanner(System.in);
		    
		    
		    int n1 = s.nextInt();
		    int n2 = s.nextInt();
		    int n3 = s.nextInt();
		    int bigger = 0;
		    
		    if ( n1 > n2 && n1 > n3 ){
		     bigger = n1;
		      
		    }else if ( n2 > n1 && n2 > n3 ) {
		     bigger = n2;
		      
		    }else if ( n3 > n1 && n3 > n2 ) {
		      bigger = n3;

		    }
		  
		      System.out.println(bigger + " is bigger");

		  

	}

}
