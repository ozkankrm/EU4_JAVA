package javaeu4.day33_classObjet_Constructors;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String input;
		System.out.println("What is your starting balance?");

		input = scan.next();
		
		BankAccount account = new BankAccount(input);
		
		System.out.println("How much were you paid this month?");
		
		input = scan.next();
		
		account.deposit(input);
		
		System.out.println("Your pay has been deposited. Your current balance is: " + account.getBalance());
	}

}
