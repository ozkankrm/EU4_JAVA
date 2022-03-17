package javaeu4.day14_valueReturn;

public class ValueReturn {

	public static void main(String[] args) {
	
//		bu y�ntemle bir value return yapabiliriz
	int x = sum(2, 3);
		
	System.out.println(sum(2,3)); // result=num1+num2; burda �al���yor
		
		
	}
	
	public static int sum(int num1, int num2) {
		
		int result; // local variable
		
		result = num1+num2;
		
		return result;
		
	}

}
