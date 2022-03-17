package javaeu4.day13_methods_Part1;

public class Task_59_hourlyPay {

	public static void main(String[] args) {
		
//		Write a method that accepts number of hours and hourly pay and show your pay for
//		those hours in the console
		
		payCalculator(5, 8.74);
		payCalculator(20, 9.74);
	}
	
	public static void payCalculator(double hours, double hourlyPay) {
		
		double pay= hours*hourlyPay;
		 
		System.out.println("Total pay is " + pay);
	}

}
