package javaeu4.day8_controlFlowStatement_Part2;

public class task_32_largestNumber {

	public static void main(String[] args) {
		/*
		 * Declare 3 numbers
		� Program should display which one is largest
		 */

		int a=1;
		int b =4;
		int c =6;
		
		if(a>b && a>c) {
			System.out.println("a is largest number");
		}else if(b>a && b>c) {
			System.out.println(" b is largest number");
		}else if(c>a && c>b) {
			System.out.println("c is largest number");
		}else {
			System.out.println("invalid number");
		}
	}

}
