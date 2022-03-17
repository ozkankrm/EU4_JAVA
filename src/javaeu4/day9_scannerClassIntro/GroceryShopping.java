package javaeu4.day9_scannerClassIntro;

import java.util.Scanner;

public class GroceryShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	Task 5: Grocery Shopping
		ask user whats the price of tomato and store it
		ask user how many tomato you want to buy and store it
		
		ask user whats the price of potato and store it
		ask user how many potato you want to buy and store it
		
		ask user whats the price of banana and store it
		ask user how many banana you want to buy and store it	
	
	*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the price of tomato?");
		double price = scan.nextDouble();
		System.out.println("Tomato price is : " +price);
		
		System.out.println("How many tomato you want to buy");
		int tomato = scan.nextInt();
		System.out.println("I want to " + tomato+ " tomato buy, please");
		
		double tomatoSubTotal = price*tomato;
		System.out.println("You got " + tomato+ " tomato price is " +price+ " and total " +tomatoSubTotal);
		
		
		System.out.println("What is the price of potato?");
		float potatoPrice = scan.nextFloat();
		System.out.println("How many you want to buy?");
		int potatoCount = scan.nextInt();
		
		System.out.println("Your total potato is "+ (potatoCount*potatoPrice));


		
	
		
	}

}
