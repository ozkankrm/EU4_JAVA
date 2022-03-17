package javaeu4.day8_controlFlowSwitchCaseStatement;

public class task_36_CreateCalculator {

	public static void main(String[] args) {
		// Write a program that creates a calculator by using switch statements
		
		int a = 6;
		int b = 9;
		String operator = "*";
		int result = 0;
	
		switch ("+") {
		
		case "+":
			result = a+b;
			break;
		case "-":
			result = a-b;
			break;
		case "*":
			result = a*b;
		case "/":
			result = a/b;
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}
		System.out.println("Result is " + result);
	}
		}