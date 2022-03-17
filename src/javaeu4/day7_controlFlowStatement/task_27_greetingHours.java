package javaeu4.day7_controlFlowStatement;

public class task_27_greetingHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a Java program to implement following logic using
 *  if statement
1. if hour is less than 12 noon, greet with Good Morning
2. if hour is greater than or equal 12 noon but less than 3 pm, 
greet with Good Afternoon
3. if hour is greater than or equal to 3 pm, 
greet with Good Evening
 */

	int hour = 10;
	
	
	if(hour<12) {
		System.out.println("Good Morning");
	}
	
	if(hour >= 12 && hour < 15) {
		System.out.println("Good Afternoon");
	}
	if(hour>=15) {
		System.out.println("Good Evening");
	}
	
	}

}
