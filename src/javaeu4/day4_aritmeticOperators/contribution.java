package javaeu4.day4_aritmeticOperators;

public class contribution {

	public static void main(String[] args) {
		// This progam calculates the amount of pay thal will be contributed to a retirement
		// plan if 5%, 8% or 10% of monthly pay is withheld
		
		
		double monthlyPay = 6000;
		double contribution;
		// 5% contrubution
		contribution = monthlyPay*0.05;
		System.out.println("5 percent is $" + contribution + " + per month");
		
		
		// 8% contrubution
		contribution = monthlyPay*0.08;
		System.out.println("8 percent is $" + contribution + " + per month");
		
		// 10% contrubution
		contribution = monthlyPay*0.1;
		System.out.println("10 percent is $" + contribution + " + per month");
		
		
	}

}
