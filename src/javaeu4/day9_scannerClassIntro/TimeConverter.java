package javaeu4.day9_scannerClassIntro;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task 3 :
//		create an interactive program to ask user for day
//		and generate minute that day have
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter day ");
		int day = input.nextInt();
//		1 day = 24 h, 1 h = 60 min, 1 day = 24*60 min 
		int minutes = day*24*60;
		
		System.out.println(day+ " day is : " + minutes+ " minutes");
		
	
		
//		Task 4 :
//			create an interactive program to ask user for hourly wage
//			and generate yearly salary
//		assume that he works 2080 hour for a year.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your hourly wage?");
		
		double hourlyWage = scan.nextDouble();
		 hourlyWage = 8.6;
		 System.out.println("How many hour do you work a year?");
		 int hourYear = scan.nextInt();
		  hourYear = 2080;
		double salary = hourlyWage*hourYear;
		
		System.out.println("Your salary is : " + salary);
		
		
		
		
	}

}
