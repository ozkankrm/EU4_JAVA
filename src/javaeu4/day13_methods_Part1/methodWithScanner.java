package javaeu4.day13_methods_Part1;

import java.util.Scanner;

public class methodWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number boy");
		int boy = scan.nextInt();
		System.out.println("Enter number girl");
		int girl = scan.nextInt();
		
		vehicle(boy, girl);
	}
	public static void vehicle(int boy, int girl) {
		
		int sum = boy + girl;
		System.out.println("Total students are " + sum );
	}

}
