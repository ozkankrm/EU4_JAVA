package review.week8_Arrays;

import java.util.*;

public class generateRandom {

	public static void main(String[] args) {
		/*
		 * - Create a method that will accept a number and returns an int array. 
		 * The size of the array will be based on the given number.
		 *  Fill each element with a random number (range: 1-100). Print the array
		 */

		
	//	System.out.println(Arrays.toString(generateRandomArray(10)));
		
	}
	
	public static int[] generateRandomArray(int size) {
		
		Random num = new Random();
		
		int[] array = new int[size];
		
		for(int i=0; i<size; i++ ) {
			array[i] = num.nextInt(100)+1;// 1-100  // +1 koyunca 1-100 // sade 100 olursa--> 0-99 olur
			
		}
		return array;
	}

}
