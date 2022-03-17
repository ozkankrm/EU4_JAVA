package javaeu4.day13_methods_Part1;

public class Task_62_greatestNumber {

	public static void main(String[] args) {

//		Write a method that accepts 3 numbers and displays the greatest one in the console.
//		Sample Output:
//		calculateGreatest(5,2,3) -- >5

		calculateGreatest(5, 2, 3);
		
	}

	public static void calculateGreatest(int num1, int num2, int num3) {
		int greatest = 0;
		if(num1>num2 && num1>num3) {
			greatest = num1;
		}else if(num2>num1 && num2>num3) {
			greatest = num2;
		}else if(num3>num1 && num3>num2) {
			greatest = num3;
		}
		
		System.out.println(greatest);	
		
	}
	
}
