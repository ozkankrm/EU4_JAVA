package assignments.Assignment_4_;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your package pounds:");
		double pounds = scan.nextDouble();
		
		System.out.println("Enter mill");
		double mill = scan.nextDouble();
		
	
		double amount = 0;
		if(mill<=500) {
			
			if(pounds<=2) {
				amount = 1.10;
			}else if(pounds>2 && pounds<=6) {
				amount = 2.20;
			}else if(pounds>6 && pounds<=10) {
				amount = 3.70;
			}else if(pounds>10) {
				amount = 3.80;
			}
		}else if(mill>500) {
			if(pounds<=2) {
				amount = 1.10*2;
			}else if(pounds>2 && pounds<=6) {
				amount = 2.20*2;
			}else if(pounds>6 && pounds<=10) {
				amount = 3.70*2;
			}else if(pounds>10) {
				amount = 3.80*2;
			}
		}
		System.out.println(amount);
	}

}
