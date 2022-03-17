package review.Mat_review.self_review_stringtask;

import java.util.Scanner;

public class String_Task2 {

	public static void main(String[] args) {
		/*
		 * 
		 */

		searchKeyword("hello", "hello-Google Search");
		
	}
	public static void searchKeyword(String searchKeyword, String tabTitle) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the search key words:");
		searchKeyword = scan.nextLine();
		
		tabTitle = searchKeyword + "- Google Search";
		
		if(tabTitle.startsWith(searchKeyword) && tabTitle.endsWith("Google Search")) {
			System.out.println("TEST PASSED !!");
			
		}else {
			System.out.println("TEST FAILED");
		}
				
		
		System.out.println(tabTitle);
	}

}
