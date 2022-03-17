package javaeu4.day24_arrays_Part1;

import java.util.Scanner;

public class Task_86_Month_Array {

	public static void main(String[] args) {
		/*
		 * Create an array that holds 12 months names
		User should be able to enter month index and output should be:
		�The month name is <MonthName>�
		 */

		Scanner scan = new Scanner(System.in);
	
		String[] myArray = new String[12]; // burdaki 12 arry in length ni g�steerir
		
		myArray[0] = "Jan";
		myArray[1] = "Feb";
		myArray[2] = "March";
		myArray[3] = "April";
		myArray[4] = "May";
		myArray[5] = "June";
		myArray[6] = "July";
		myArray[7] = "August";
		myArray[8] = "Sept";
		myArray[9] = "Octb";
		myArray[10] = "Nov";
		myArray[11] = "Dec";
		
		System.out.println("Enter your month index number:");
		int index = scan.nextInt();
		
		System.out.println("The month is " + myArray[index]);
		
		
		
	}

}
