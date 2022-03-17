package javaeu4.day13_methods_Part1;

public class Task_64_starPatternWithNestedLoop {

	public static void main(String[] args) {
		
//		Write a program that accepts a number and print the star patterns according to that
//		number
//		Sample Output:
//		printPattern(5);
//		*
//		**
//		***
//		****
//		*****
		
		starPattern(5);
	}

	public static void starPattern(int num) {
		for (int i = 1; i<=num; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
