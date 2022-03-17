package javaeu4.day9_scannerClassIntro;

import java.util.Scanner; // must between package and class 

public class ScannerWay {

	public static void main(String[] args) {
		
//		ask user for name
//		and capture the result
//		print your name is
//		ask user for birth year
//		and capture the result
//		print the age!!
//		ask user for height
//		and capture the result
//		print the height !!
		
//		create scanner object
//		Scanner is data type, scan is variable name, new Scanner(System.in) is value
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name: ");
//		String name = "Same";
		String name = scan.next();
		System.out.println("My name is " + name );
		
		System.out.println("What is your birth year: ");
		int birthYear = scan.nextInt();
		int age = 2019 -birthYear;
		System.out.println("Your age is: " + age);

		
		System.out.println("What is your height?");
		double heihgt = scan.nextDouble();
		System.out.println("Your height is: " + heihgt);
	}

}
