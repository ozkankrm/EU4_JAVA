package assignments.Assignment_4_;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any second");
		int second = scan.nextInt();
		
		int minutes, hour, day;
		
		if(second>=60 && second<3600) {		
		System.out.println("Minutes is: " + second/60);
		
		}else if(second>=3600 && second<86400 ) {
			System.out.println("Hour is: " + second/3600);
			
		}else if(second>=86400) {
			System.out.println("Day is: " + second/86400);
		}
	}
}
