package repl.repl_it;

import java.util.Scanner;

public class FindCube_148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Given method called cube. Write all required code inside this method in order  to asks the user 
//		for a number and then prints the cubed value of that number:
//		hint: cube of a number n = n*n*n
	
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		
		cube(input);
	
	
	}
	
	public static void cube(int input) {
	
		int cubbe=1;
		for(int i=1; i<=3; i++) {
			
			cubbe *=input;
		}
		System.out.println(cubbe);
	}

}
