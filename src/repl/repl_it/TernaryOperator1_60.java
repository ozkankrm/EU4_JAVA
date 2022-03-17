package repl.repl_it;

import java.util.Scanner;

public class TernaryOperator1_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number:");
				int x = scan.nextInt();
				//WRITE YOUT CODE HERE
				int a =	(x>=5) ? x : -x; 
				
				System.out.println(a);
	}

}
