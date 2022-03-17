package review.Mat_review.self_review_stringtask;

import java.util.Scanner;

public class String_Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word wit at least 3 chars");
		
		String str = scan.nextLine();
		
		// first char
	char firstChar = str.charAt(0);
	System.out.println("first character : " + firstChar);
	
	if(str.length()%2 !=0) {
		
		//middle char if length even
		char middle = str.charAt(str.length()/2);
		System.out.println("middle character : " + middle);
	}
	if(str.length()%2==0) {
		
		// middle char if length odd
		char middle = str.charAt(str.length()/2-1);
		System.out.println("middle character : " + middle);
	}
		char last = str.charAt(str.length()-1);
		System.out.println("last character : " + last);
		
	}

}
