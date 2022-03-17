package javaeu4.day13_methods_Part1;

public class Task_58_greaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a method that shows the grater number from 2 numbers
		
		greaterNumber();
	}
	
	public static void greaterNumber() {
		
		int num1=1;
		int num2=2;
		int greater;
		if(num1>num2) {

			System.out.println("Num1 is greater");
		}else if(num2>num1) {
			System.out.println("Num2 is greater");

		}else {
			System.out.println("numbers are equals");
		}
		
		
	}

}
