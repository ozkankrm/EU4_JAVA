package javaeu4.day13_methods_Part1;

public class Task_60_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a method that accepts 3 parameters:
//			1- number
//			2- number
//			3- operator(-,+,*,/)
//			Sample output:
//			calculator(6,3, �+�) -- > 9
//			calculator(6,3, �-�) -- > 3
//			calculator(6,3, �*�) -- > 18
//			calculator(6,3, �/�) -- >
		
		acceptsParameter(6, 3, "+");
		acceptsParameter(6, 3, "-");
		acceptsParameter(6, 3, "*");
		acceptsParameter(6, 3, "/");
		
	}

	public static void acceptsParameter(int num1, int num2, String operator) {
		
		switch(operator) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case"*":
			System.out.println(num1*num2);
			break;
		case"/":
			System.out.println(num1/num2);
			break;
			
		}
		
		
	}
}
