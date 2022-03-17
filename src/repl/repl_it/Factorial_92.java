package repl.repl_it;

import java.util.Scanner;

public class Factorial_92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    
//	     long factorial=1l; // burda long data type kullanmak laz�m
//	    for(int i=n; i>0; i--){
//	     factorial *= i; 
//	  
//	    }
//	      System.out.println(factorial);
	      
	      
	      int fac=1;
	      
	      while(n>0) {
	    	  
	    	  fac *= n;
	    	  
	    	  n--;
	      }
	      System.out.println(fac);
	}

}
