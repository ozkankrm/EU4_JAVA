package javaeu4.day8_controlFlowSwitchCaseStatement;

public class task_38_Days {

	public static void main(String[] args) {
		/*
		 * Write a program to display days:
1-Monday
2-Tuesday
3-Wednesday
4-Thursday
5-Friday
6-Saturday
		 */

		int days =5;
		
		switch ( days) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day");
		}
	}
}
