package assignments.Assignment_4_;

import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter air, water or steel");
		String name = scan.next();
		
		System.out.println("Enter distance");
		int distance = scan.nextInt();
		
		int time = 0;
		if(name.equalsIgnoreCase("air")) {
			time = distance/1100;
		}
		else if(name.equalsIgnoreCase("water")) {
			time = distance/4900;
		}
		else if(name.equalsIgnoreCase("steel")) {
			time = distance/16400;
		}
		System.out.println("Secaond is: " + time);

	}

}
