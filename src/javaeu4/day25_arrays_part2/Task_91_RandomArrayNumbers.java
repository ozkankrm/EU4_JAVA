package javaeu4.day25_arrays_part2;

import java.util.Random;

public class Task_91_RandomArrayNumbers {

	public static void main(String[] args) {
		/*
		 * �Create an array with 10 elements
�Initialize each array element with random values between 0 and 100 but less than 100
�Print each array element
		 */

		
		Random rn = new Random();
		
		int random = rn.nextInt(100);
		
		
		int[] number = new int[10];
	
		
		for(int i=0; i<number.length; i++) {
			
			System.out.println(number[i]=rn.nextInt(100));;
		}
	
		}

}
