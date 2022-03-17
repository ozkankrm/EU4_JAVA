package javaeu4.day7_controlFlowStatement;

public class task_31_triangle {

	public static void main(String[] args) {
/*
 * * A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a
program that declares three integers as angles and check whether a triangle is valid or
not.
		 */

		int a = 50;
		int b = 60;
		int c= 60;
		int sum = a+b+c;
		
		if (sum==180) {
			sum=180;
			System.out.println("sum : " + sum + " triangle is valid");
		}else {
			System.out.println("sum : " + sum + " triangle is not valid");
		}
		
	}

}
