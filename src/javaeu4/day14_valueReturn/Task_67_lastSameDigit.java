package javaeu4.day14_valueReturn;

public class Task_67_lastSameDigit {

	public static void main(String[] args) {
//		
//		Write a method that accepts 2 numbers and return if they have the same last digit.
//				Sample Output
//				lastDigit(7,17) - >true
//				lastDigit(6,17) - >false
//				lastDigit(3,113) - >true
		

		if(lastDigit(5, 17)) {
			System.out.println("They have the same last digit");
		}else {
			System.out.println("They do not have the same last digit");
		}
		
	}

	public static boolean lastDigit(int i, int j) {
		if((i%10) == (j%10)) {
			return true;
		}else {
		return false;
	}
	
	}
	
}
