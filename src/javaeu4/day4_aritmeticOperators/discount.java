package javaeu4.day4_aritmeticOperators;

public class discount {

	public static void main(String[] args) {
		// This program calculates the sale price of an
		// item that is regularly at $59, with a %20 discount on it
		
		int regularPrice = 59;
		double discount;
		double salesPrice;
		discount = regularPrice*0.2;
		salesPrice = regularPrice - discount;
		
		System.out.println("Regular price is: $" +regularPrice);
		System.out.println("Discount Amount: $"+discount);
		System.out.println("Sale Price: $" + salesPrice);
		
		
		System.out.println(- -1-3*10/5-1);
		System.out.println(- -1);

	}

}
