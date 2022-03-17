package javaeu4.day9_scannerClassIntro;

import java.util.Scanner;

public class VariablePractice {

	public static void main(String[] args) {
		
		/*

		whole number      : byte, short, int, long
		fractional number : float, double
		logical			  : bolean ( true, false
		chracter		  char ( single character in single quote
	
		usually by default for whole numbers : just use int
		usually by default for whole numbers : just use double
	
		Is String part of primitive types ? : NOOOO!!
		String is sequence of character
		
		
	*/
//		age calculater
//		given birth year, please calculatee the age
		
		int birthYear = 2001;
		int currentYear = 2020;
		int age;
		age = currentYear-birthYear;
//	    � was born in year 2001, and � am 19 years old;
//		System.out.println("� was born in year " + 2001 + " , and � am " + (2020-2001)+ " years old");
		System.out.println("� was born in year " + birthYear + " , and � am " + age+ " years old");
		 
		// task 2: you are speeding today
		// speed limit is some number, and your current speed is this
		// generate this output of: You are driving 10 mph more than speed limit
		// speedLimit as int, currentLimit as int, overTheLimit as int
		
		int speedLimit = 100;
		int currentLimit = 130;
		int overTheLimit = currentLimit-speedLimit;
		
		System.out.println("You are driving " + overTheLimit + " more than speed limit");
		
		
	
	}

}
