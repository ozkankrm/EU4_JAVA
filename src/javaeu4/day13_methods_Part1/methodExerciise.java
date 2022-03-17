package javaeu4.day13_methods_Part1;

public class methodExerciise {

	public static void main(String[] args) {


		int y = 1;
		int x = 2;
			methodName(5,10);
			methodName(x,y); // data type, variable ve value yukarda atarsak ve methodName i�ine variableName yazarsak method �al���r
 
	}

	public static void  methodName(int num1, int num2) {
		
		int result = num1 + num2;
		int result2 = num1 * num2;
		
		System.out.println(result);
		System.out.println(result2);
		
		
	}

	
}
