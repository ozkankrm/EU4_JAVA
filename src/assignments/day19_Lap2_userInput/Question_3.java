package assignments.day19_Lap2_userInput;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		
//		Write a program that asks the user for a positive nonzero integer value. 
//		The program should use a loop to get the sum of all the integers 
//		from 1 up to the number entered. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter positive an integer");
		int number = scan.nextInt();
		
		int sum = 0;
		for(int i=1; i<=number; i++) {
			sum = sum+i;
		}
		System.out.println(sum);

	}

}
