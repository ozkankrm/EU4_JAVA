package javaeu4.day6_logicalOperators;

public class task_last {

	public static void main(String[] args) {
		/*
		 * Task
1. Create a double variable with the value 20
2. Create a second variable of type double with the value 80
3. Add both numbers up and multiply by 25
4. Use the remainder operator to figure out the remainder from the sum of #3 divided
by 40
5. Print remaining total (#4) is equal to 20 or less : true/false
		
		 */

		double d1 = 20;
		double d2 = 80;
		double res = (d1+d2)*25;
		
		double remainder = res % 40; 
		
		System.out.println(" Remaining total is equal to 20 or less? " + (remainder<=20));
		
	//	byte a = 200;
		//double b = a/2.0 + a++ + --a * a*3 + 100;
		//System.out.println(b);
		
		int x = 3;
		int y = x-- + --x;
		
		
		System.out.println(y);
		
	}

}
