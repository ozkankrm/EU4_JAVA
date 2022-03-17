package review.Mat_review.self_review_stringtask;

import java.util.Scanner;

public class String_Task3 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter full name, assuming full name is 2 word write a program o print users
		 * initials fro ex
		 * Jon Snow--> initial is JS
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String fullName = scan.nextLine();
		
		int x = fullName.indexOf(" ");
		
		String initial = "" + fullName.charAt(0) + fullName.charAt(x+1);
		
		System.out.println(initial);
		
		

	}

}
