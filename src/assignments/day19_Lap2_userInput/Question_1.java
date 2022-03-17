package assignments.day19_Lap2_userInput;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
/*
	Write a program with a loop that lets the user enter a series of integer numbers. 
	After all the numbers have been entered, the program should display the largest and smallest
	numbers entered.
*/

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter your first number:");
		int num = scn.nextInt();
		
		System.out.print("Enter your next number:");
		int num2 = scn.nextInt();
		
		System.out.print("Do you want to enter number: 0-No, 1:Yes:");
		int num3 = scn.nextInt();
		
		if(num3==1) {
			System.out.print("Enter your next number:");
			int num4 = scn.nextInt();
			
			System.out.print("Do you want to enter another number: 0-No, 1:Yes:");
			int num5 = scn.nextInt();
			if(num5==1) {
				System.out.print("Enter your next number:");
				int num6 = scn.nextInt();
			}else if(num5==0) {
				return;
			}
			
			System.out.print("Do you want to enter another number: 0-No, 1:Yes:");
			int num7 = scn.nextInt();
			if(num7==1) {
				System.out.print("Enter your next number:");
				int num8 = scn.nextInt();
			}else if(num7==0) {
				return;
			}
			
			System.out.print("Do you want to enter another number: 0-No, 1:Yes:");
			int num9 = scn.nextInt();
			if(num9==1) {
				System.out.print("Enter your next number:");
				int num10 = scn.nextInt();
			}else if(num9==0) {
				return;
			}
			
			
			
		}else if(num3==0) {
			return;
		}
	}

}
