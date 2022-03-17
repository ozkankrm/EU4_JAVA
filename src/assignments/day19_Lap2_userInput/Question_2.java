package assignments.day19_Lap2_userInput;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		/*
		 * A bag of cookies holds 40 cookies. The calorie information on the bag claims 
		 * that there are 10 serving in the bag and that a serving equals 300 calories.
		 *  write a program that lets the user enter the number of cookies he or she actually 
		 *  ate and then reports the number of total calories consumed.
		 */
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter ate cookies");
		int ateCookies = scn.nextInt();
		
//		1 cook = 0.25 serving=75 calories	

		int calories;
		calories = ateCookies*75;
		
		System.out.println("You ate " + ateCookies+ " cookies " + " it is " + calories + " calories");


	}

}
