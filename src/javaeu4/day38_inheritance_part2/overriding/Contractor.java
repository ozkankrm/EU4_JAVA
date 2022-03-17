package javaeu4.day38_inheritance_part2.overriding;

public class Contractor extends Employee {

	
	public void calculatePay(int hours, double rate) {
		double total = (hours*rate)+200;
		System.out.println("Contractor total pay: " + total);
		System.out.println("----------------");
		
		
		super.calculatePay(20, 20);
		
	}
	
	
	

}
