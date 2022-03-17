package assignments.day14_lab1_method;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		

//		We'll say a number is special if it is a multiple of 11 or 
//		if it is one more than a multiple of 11. Write a method that accepts a number 
//		and prints true if the given number is special.
//
//		specialEleven(22) --> true
//		specialEleven(23)--> true
//		specialEleven(24) --> false
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num = scan.nextInt();
		
		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
		
		specialEleven(44);
		specialEleven(45);
		specialEleven(53);
		specialEleven(1);
		
	}

	public static void specialEleven(int num) {
		
		boolean bol = false;
		if(num%11==0 || (num-1)%11==0 || num%11==1) {
			bol = true;
			System.out.println(bol);
		}else {
			bol = false;
			System.out.println(bol);
		}
		
	}

}
