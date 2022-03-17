package assignments.day19_Lap2_userInput;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		/*
		 * Write a program that will ask the user to enter the amount of a purchase. 
		 * The program should then compute the state and county tax sales tax.
		 * Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
		 * The program should display the amount of the purchase , the state sales tax, 
		 * the county sales tax, the total sales tax, and the total of the sale 
		 * (which is the sum of the amount of purchase plus the total sales tax)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the amount of purchase:");
		double purchase = scan.nextDouble();
		
		double stateSalesTax = purchase*0.04;
		double countySlaesTax = purchase*0.02;
		
		double totalTax = stateSalesTax + countySlaesTax;
		
		double totalPurchase = purchase + totalTax;
		
		System.out.println("Purchase is: " + purchase);
		System.out.println("State tax is: "+ stateSalesTax);
		System.out.println("County tax is: " + countySlaesTax);
		System.out.println("Total tax is: " + totalTax);
		System.out.println("Total purchase is: " + totalPurchase);
		
		
		
	}

}
