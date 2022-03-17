package repl.repl_it.repl3;

import java.util.Scanner;

public class ChechIfNumberIsPalindrome_161 {

	public static void main(String[] args) {
		/*
		 * Complete a method isPalindrome() that will check if number is a palindrome. 
		 * Print your result as a boolean (true or false). 
Do not convert int into a string!
Example:
input: 1001
output: true

Example:
input: 1234
output: false
		 */
		 Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    isPalindrome(num);
		
	
		
		
	}

	public static void isPalindrome(int num) {
		
//		1254 --> 4 5 2 1
//		1254 % 10 -->4 last digit
//		1254 / 10 --> 125
//		125 %10 --> 5 
//		4 * 10 + 5 -->45
//		125 / 10 --> 12
//		12 % 10 --> 2
//		45 * 10 + 2 -->452
//		12 % 10 --> 2
//		12 / 10 --> 1
//		452 * 10 + 1 -->4521
		
		
		int temp = num;
		int newNum = 0;
		
//		we will keep dividing as long as we do not get 0
		
		while(temp != 0) {
			
			newNum = newNum*10 + temp % 10;
//			System.out.println("newNum " + newNum + " temp " + temp);
			
			temp = temp /10;
		}
		System.out.println(newNum==num);
		

	}
}
