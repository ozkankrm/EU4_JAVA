package assignments.Assignment_4_;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your income");
		long income = scan.nextLong();
		
		double tax = 0;
		if(income <= 150_000_000) {
			
			tax = income*0.25;
			
		}else if(income > 150_000_000 && income <= 300_000_000 ) {
			
			tax = (income-150_000_000)*0.30 +(150_000_000*0.25);
			
		}else if(income > 300_000_000 && income <= 600_000_000 ) {
			
			tax = (income-150_000_000)*0.35 +(150_000_000*0.25);
		}
		else if(income > 600_000_000 && income <= 1_200_000_000 ) {
			
			tax = (income-150_000_000)*0.40 +(150_000_000*0.25);
		}
		else if(income > 1200000000 ) {
			
			tax = income*0.50;
		}
	
		System.out.println((long)tax);
	}

}
