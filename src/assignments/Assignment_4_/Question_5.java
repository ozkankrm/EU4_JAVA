package assignments.Assignment_4_;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month");
		int month = scan.nextInt();
		
		System.out.println("Enter day");
		int day = scan.nextInt();
		
		System.out.println("Enter year");
		int year = scan.nextInt();
		
		if(month*day == year) {
			System.out.println("Date is magic");
		}else {
			System.out.println("Date is not magic");
		}

	}

}
