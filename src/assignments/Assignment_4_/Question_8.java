package assignments.Assignment_4_;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter quantity");	
		int quantity = scan.nextInt();
		
		int apackage = 99;
		
		double totalAmount = apackage*quantity;
		double discount = 0;
		
		System.out.println("Total amount before discount: " + totalAmount);
		
		if(quantity>=10 && quantity<=19) {
			
			discount = totalAmount*0.2;
			totalAmount -= discount;
			
		}else if(quantity>=20 && quantity<=49) {
			
			discount = totalAmount*0.3;
			totalAmount -= discount;
			
		}else if(quantity>=50 && quantity<=99) {
			
			discount = totalAmount*0.4;
			totalAmount -= discount;
		}else if(quantity>=100 ) {
			
			discount = totalAmount*0.5;
			totalAmount -= discount;
		}	
		
	
		System.out.println("Discount: " + discount );
		System.out.println("Total amount after discount: " + totalAmount);

	}

}
