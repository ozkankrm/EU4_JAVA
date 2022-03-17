package javaeu4.day8_controlFlowSwitchCaseStatement;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		switch (a) {
			
		case 1:
			System.out.println("Hello");
			break;
			
		default:
			System.out.println("Not welcome");
			break;
		case 3:
			System.out.println("Hi");
			break;
	
		}

		String weather = "snow";
		
		switch (weather) {
		case "sunny":
			System.out.println("go to park");
			break;
		case "hot":
			System.out.println("go to sewimming");
			break;
		case "snow":
			System.out.println("wear a coat");
			break;
			
		default:
			System.out.println("stay at home");
		}
	}

}
