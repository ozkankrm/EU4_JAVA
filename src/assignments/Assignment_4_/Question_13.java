package assignments.Assignment_4_;

import java.util.Scanner;

public class Question_13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the monthly checks");
		int checks = scan.nextInt();
		
		double feesMonth = 0;
		
		//base fee 10 per month
		
		if(checks<20) {
			feesMonth = 10 + checks*0.1;
	
		}else if(checks>=20 && checks<=39) {
			feesMonth = 10 + checks*0.08;
	
		}else if(checks>=40 && checks<=59) {
			feesMonth = 10 + checks*0.06;
	
		}if(checks>=60) {
			feesMonth = 10 + checks*0.04;
	
		}
		System.out.println("Monthly checks fee is: " + feesMonth);

	}

}
