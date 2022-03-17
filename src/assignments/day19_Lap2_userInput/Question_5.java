package assignments.day19_Lap2_userInput;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		/*
		 * Write a program that computes the tax and tip on a restaurant bill.
		 * The program should ask the user to enter the charge for the meal. 
		 * The tax should be 6.75 percent of the meal charge.
		 * The tip should be 20 percent of the total after adding tax.
		 * Display the meal charge, tax amount, tip amount, and total bill on the screen.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter price of meal:");
		
		double priceOfMeal = scan.nextDouble();
		
		double tax = (priceOfMeal*6.75)/100;
		
		double subTotal = priceOfMeal+tax;
		
		double tip = (int)subTotal*0.2;
		
		double total = priceOfMeal+tax+tip;
		
		System.out.println("Price of meal: " + priceOfMeal);
		System.out.println("Tax is: " +tax);
		System.out.println("Tips are: " + tip);
		System.out.println("Total is: "+ total);
		
		
		
		
	}

}
