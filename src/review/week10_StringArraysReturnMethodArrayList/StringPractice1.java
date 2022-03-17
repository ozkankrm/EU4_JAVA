package review.week10_StringArraysReturnMethodArrayList;

import java.util.Scanner;

public class StringPractice1 {

	public static void main(String[] args) {

		/*
		 * ask user to enter first & last name
		 * format the first & last names
		 * 
		 * joHN
		 * aArOn
		 * 
		 * John Aaron
		 */

		Scanner scan = new Scanner(System.in);// Enter
		
		System.out.println("Enter your first name?");
		String firstName = scan.next();// joHN  
										// next() takes one word
					scan.nextLine();//Enter			// bunu koymazsak sonraki nextLine ULA�AMAYIZ				
		
		System.out.println("Enter your last name?");
		String lastName = scan.nextLine(); // nextLine()  takes everything
		scan.close(); // bo�luk b�rakt�r�yor
		
		firstName	= firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		lastName	= lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
		
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		
		String fullName = firstName + " " + lastName;
		System.out.println("Full Name: " +fullName);

	}

}
