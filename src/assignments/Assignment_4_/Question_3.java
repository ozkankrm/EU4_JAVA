package assignments.Assignment_4_;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter any a year : ");
		int leapYear = scan.nextInt();
		
		if (leapYear%100 == 0) {
			if (leapYear%400 == 0 ) {
			System.out.println(leapYear + " is leap year");
			}else {
			System.out.println(leapYear + " is not leap year");
			}
		}else if(leapYear%4 == 0) {
			System.out.println(leapYear + " is leap year");
		}else {
			System.out.println(leapYear + " is not leap year");
		}
	}

}
