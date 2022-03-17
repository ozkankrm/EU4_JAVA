package javaeu4.day8_controlFlowStatement_Part2;

public class task_33_logic {

	public static void main(String[] args) {
		/*
		 * Write a Java Program for the following logic:
� If marks < 60, then print �Fail�
� If marks >= 60, but less than 90, then print �Pass�
� If marks >= 90, then print �Passed with Distinction�
		 */

		int marks =11000;
		if(marks<60) {
			System.out.println("Fail");
		}else if(marks<90 && marks>=60) {
			System.out.println("Pass");
		}else if(marks>=90) {
			System.out.println("Pass with Distinction"); 
		}else {
			System.out.println("Invalid Score");
		}
	}

}
