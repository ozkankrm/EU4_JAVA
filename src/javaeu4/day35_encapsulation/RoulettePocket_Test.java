package javaeu4.day35_encapsulation;

import java.util.Scanner;

public class RoulettePocket_Test {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your pocket number");
		
		
		RoulettePocket p1 = new RoulettePocket(scan.nextInt());
		
//		System.out.println(p1.toString());
		
//		System.out.println(p1.getPocketColor());
		
		while(p1.getPocketColor().equalsIgnoreCase("invalid")) {
			
			System.out.println("Enter your pocket number:");
			p1.setPocketNumber(scan.nextInt());
		}
		System.out.println(p1.getPocketColor());

	}

}
