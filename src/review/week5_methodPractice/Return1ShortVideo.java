package review.week5_methodPractice;

import java.util.Scanner;

public class Return1ShortVideo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	
	int num = scan.nextInt();
	System.out.println("You entered " + num);
	
	int result = doubleTheNumber(num);
	System.out.println("The result is " + result);
	}
//		create a method that accept one number and return double value

	public static int doubleTheNumber(int num) {
//		int result = num*2;
//		return result;
		
		return num*2;
	}

}
