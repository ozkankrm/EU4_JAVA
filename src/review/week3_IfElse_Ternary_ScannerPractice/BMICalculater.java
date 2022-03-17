package review.week3_IfElse_Ternary_ScannerPractice;

import java.util.Locale;
import java.util.Scanner;

public class BMICalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * The formula is BMI = kg/m2 where kg is a person's weight in kilograms and m2 is their height in metres squared.
 *  A BMI of 25.0 or more is overweight, while the healthy range is 18.5 to 24.9.
 *  A BMI of 25.0 -30 is overweight,
 *  A BMI of 18.5 - 25.0  is normal,
 *  A BMI of less than 18.5 is underweight,
 *  A BMI of more than 30 is obese
 */
		Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
		System.out.println("Please enter your height in meter");
		double height = scan.nextDouble() ; // height in cm
		
		System.out.println("Please enter your weight in kilogram");
		double weight = scan.nextDouble(); // weight in kilogram
		
		double bmi = weight/(height*height);
		
	
		
		System.out.println("YOUR BMI �S " + bmi);
		
		if ( bmi<18.5) {
			System.out.println("You are underweight");
		
		}else if( bmi>=18.5 && bmi<25.0) {
			System.out.println("You are normal");
		
		}else if ( bmi>=25.0 && bmi<30.0) {
			System.out.println("You are overweight");
		
		}else if ( bmi>=30) {
			System.out.println("You are obese");
			
		}else {
			System.out.println("You are underweight");
		}
	}

}
