package javaeu4.day17_ClassObjectsPart2;

import java.util.*;

public class Task_72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program that ask user to enter 3 numbers and shows the total of numbers.
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter first number");	
	int first = scan.nextInt();
	
	System.out.println("Enter second number");	
	int second = scan.nextInt();
	
	System.out.println("Enter third number");	
	int third = scan.nextInt();
	
	int sum = first +second+third;
	System.out.println("Total of 3 numbers: " + sum);
	
	
	
	}

}
