package javaeu4.day4_aritmeticOperators;

// This program calculates hourly wages plus overtime
public class wages {

	public static void main(String[] args) {
		
		
		double regularWages; // The calculated regular wage
		double basePay = 25; // The base pay
		double regularHourly = 40;	// The hours  worked less overtime
		double overtimeWages; // Overtime wgaes
		double overTimePay = 37.5; // overtime pay rate
		double overTimeHours = 10;
		double totalWage; // total wage
		
		regularWages = basePay*regularHourly;
		overtimeWages = overTimePay*overTimeHours;
		
		totalWage = regularWages + overtimeWages;
		
		System.out.println("Wages this week are $ " + totalWage);
		
		
		
	}

}
