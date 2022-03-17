package assignments.Assignment_4_;

import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your package letter");
		String letter = scan.next();
		
		System.out.println("Enter your daily hour");
		int hour = scan.nextInt();
		
		//package A-->9.95 -->10*30-->300 over + hour*2
		//package B-->13.95-->20*30-->600 over + hour*1
		//pakage C-->19.95
		
		hour = hour*30;
		double bill = 0;
		if(letter.equalsIgnoreCase("A")) {
			if(hour<=300) {
				bill = 9.95;
			}else  {
				bill = 9.95 + (hour-300)*2.2;
			}
	
		}else if(letter.equalsIgnoreCase("B")) {
			if(hour<=600) {
				bill = 13.95;
			}else {
				bill = 13.95 + (hour-600)*1;
			}
		}else if(letter.equalsIgnoreCase("C")) {
			bill = 19.95;
		}
		System.out.println("Monthly bill is: " + bill);
	}

}
