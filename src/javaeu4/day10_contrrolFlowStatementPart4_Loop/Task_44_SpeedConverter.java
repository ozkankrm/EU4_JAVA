package javaeu4.day10_contrrolFlowStatementPart4_Loop;

public class Task_44_SpeedConverter {

	public static void main(String[] args) {

		
		/*
		
		Your friend Mike Smith just inherited a European sports car from his uncle. Mike lives in
the USA, and he is afraid he will get a speeding ticket because the car�s speedometer
indicates kilometers per hour(KPH). He has asked you to write a program that displays a
table of speeds in kilometers per hour with their values converted to miles per
hour(MPH). The formula for converting KPH to MPH is:
MPH = KPH * 0.6214
The table that your program displays should show speeds from 60 kilometers per hour
thru 130 kilometers per hour, in increments of 10, along with their values converted to
miles per hour. The table should look like something like this:
		*/
		
//		constants
		final int STARTIN_KPH = 60;
		final int MAX_KPH =130;
		final int INCREMENT = 10;
		
//		variables
		int kph; // to hold the speed in kph
		double mph; //to hold the speed in mph
		
//		display the table header
		
		System.out.println("KPH\t\tMPH");
		System.out.println("*************************");
		
		for(kph=STARTIN_KPH; kph<=MAX_KPH; kph +=INCREMENT) {
//			calculate the mph
			mph = kph*0.6214;
			
//			D�SPLAY THE SPEED �N KPH AND MPH
			System.out.println(kph + "\t\t" + mph);
		}
	}
	
	

}
