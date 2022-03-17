package javaeu4.day10_contrrolFlowStatementPart4_Loop;

import java.util.Scanner;

public class Task_46_MultiplyAnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program that the user to declare a positive integer. It should then print the
//		multiplication table of that number.
		
		int positiveNumber = 7;
		System.out.println("Multiplication tablo for " + positiveNumber);
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter positive number");
		 positiveNumber = scan.nextInt();
		
	
		for(int i =1; i<=10; i++){
			System.out.println((positiveNumber+"*"+i) + "=" + (i*positiveNumber));
		}
		System.out.println();

	}

}
