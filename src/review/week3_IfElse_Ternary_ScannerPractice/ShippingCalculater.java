package review.week3_IfElse_Ternary_ScannerPractice;

import java.util.Scanner;

public class ShippingCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		calculate create a program calculate shipping for amazong shopping
//		ask user if they are prime member or not / expect yes or no answer
		// if yes --> shiping is free
//		if no-->
		    // ask user what the amount for your shopping as double
		   // if the number is more than 35 --> free shipping
		   // print your total is same number as user entered
		  // if the number is less than 35--> thw add 5 dollar shipping
				// print your total is 5 dollar more than your number
		
		
		String primeMember;
		double price ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Are you aprime member? Say yes or no ");
		primeMember = scan.next();//expecting yes or no, and assuming user will only enter those 2
		
		System.out.println("What is the amount for your shopping ? ");
		price = scan.nextDouble();
		
		if( primeMember.equals("yes")) {
			System.out.println("HELLO DEAR PR�ME MEMBER!! FREE SHIPPING !! " + price);

		}else if ( primeMember.equals("no")) {
			if( price>35) {
				System.out.println("LOTS OF SHOPP�NG !! FREE SH�PP�NG!!");
			}else {
				System.out.println("Your total i s" +(price+5));
				System.out.println("Conside signing up for Prime to save shipping free!!!");
			}
		}else {
			System.out.println("SYSTEM CRASH");
		}
	}

}
