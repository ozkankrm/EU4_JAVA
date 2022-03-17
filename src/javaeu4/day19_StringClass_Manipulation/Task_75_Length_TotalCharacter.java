package javaeu4.day19_StringClass_Manipulation;

import java.util.Scanner;

public class Task_75_Length_TotalCharacter {

	public static void main(String[] args) {
		
//		Write a program that ask user to enter his/her firstname and lastname. Display in the
//		console total number of characters.

		Scanner scan = new Scanner(System.in);
		
//		first way
//		System.out.println("Enter your firstname and lastname");
//		String name = scan.nextLine();
//		
//	int x  = 	name.length();// numara cinsinden oldu�u i�in int kullan�l�r.
//		
//		System.out.println(x); // bo�luk olursa toplam harf say�s�+bo�luk say�s�=length
//		
//		System.out.println(name.length());//seondy way write
		
//		second way
		System.out.println("Enter your firts name");
		String firstName = scan.next();
		
		System.out.println("Enter your last name");
		String lastName = scan.next();
		
		System.out.println("Your fistname and lastname total character : " +(firstName.length() +lastName.length()));
		
		
		
		
	}

}
