package javaeu4.day13_methods_Part1;

public class Task_61_calculatorAge {

	public static void main(String[] args) {
		
//		Write a method that accepts birthyear and displays the age in the console.
//		Sample output:
//		calculateAge(2000) -- > 18
		
		agecalculator(1980);
	
	}
	
	public static void agecalculator(int birthYear) {
		int currentYear = 2020;	
		
		int	 age = currentYear-birthYear;
		 
		System.out.println(age);
	}
	
	

}
