package javaeu4.day14_valueReturn;

public class ValueReturn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int total = sum(20, 40);
		
		System.out.println(total); // 60
	}

	public static int sum(int num1, int num2) {
		
		int result;
		result = num1 + num2;
		
		return result;
		
	}
}
