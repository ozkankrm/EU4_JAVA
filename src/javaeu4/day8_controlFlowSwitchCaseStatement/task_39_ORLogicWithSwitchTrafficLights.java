package javaeu4.day8_controlFlowSwitchCaseStatement;

public class task_39_ORLogicWithSwitchTrafficLights {

	public static void main(String[] args) {
		/*
		 * Write a program to display traffic light colors using following logic:
if code (R/r)-->"Red"
if code (O/o)-->"Orange"
if code (G/g)-->"Green"
		 */

		char grade = 'B';
		// A or B or C --> pass
		// D or F --> fail
		
		switch (grade) {
		case 'A': case 'B': case 'C':	
			System.out.println("pass");
			break;
		case 'D': case 'F':
			System.out.println("fail");
			break;
		default:
			System.out.println("invalid charachter");
			break;
		}
	
	char lightsColor = 'R';
	
	switch (lightsColor) {
	case 'R':
	case 'r':
		System.out.println("Red");
		break;
	case 'O':
	case 'o':
		System.out.println("Orange");
		break;	
	case 'G':
	case 'g':
		System.out.println("Green");
		break;
	default:
		System.out.println("Invalid character");
		break;
	}
	
	}

}
