package javaeu4.day9_scannerClassIntro;

import java.util.Scanner;

public class TemperaturConerter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the temprature in F");
		
		double fahrenheit = input.nextDouble();
		
		double celsius = (5/9)*(fahrenheit-32);


		System.out.println("fahrenheint " + fahrenheit+ " is " + celsius + " in celsius");
	}

}
