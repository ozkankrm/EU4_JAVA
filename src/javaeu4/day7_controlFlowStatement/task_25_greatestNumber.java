package javaeu4.day7_controlFlowStatement;

public class task_25_greatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Write Java program that will accept three numbers 
	 * and return the greatest number.
		
				� Input:
				Enter first number: 4
				Enter second number: 8
				Enter third number: 1
				
				� Output:
				The greatest number is: 8 */

		
		int num1 = 4;
		int num2 = 8;
		int num3 = 10;
		
		
		if (num1>num2 && num1>num3) {
			System.out.println("Num1 is the greatest " );
			
		}
		if (num2>num1 && num2>num3) {
			System.out.println("Num2 is the greatest " );
			
		}
		if (num3>num2 && num3>num1) {
			System.out.println("Num3 is the greatest " );
			
		}
	
		
	}

}
