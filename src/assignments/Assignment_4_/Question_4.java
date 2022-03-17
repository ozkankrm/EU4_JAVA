package assignments.Assignment_4_;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("How many calls have you a monthly");

		int calls = scan.nextInt();
		
		double bill = 200;
		if(calls<=100) {
			bill = 200;
		}else if(calls>100 && calls<=150) {
			bill += (calls-100)*0.6;
		}else if(calls>150 && calls<=200) {
			bill += (calls-150)*0.6 + (50*0.6);
		}else if(calls>200) {
			bill += (calls-200)*0.6 + (50*0.4)+ (50*0.6);
		}
		
		System.out.println(bill);
	}

}
