package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

import java.util.Arrays;

public class Question_28 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts start and end numbers. Given start and end
numbers, return a new array containing the sequence of integers from start up to
but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].
fizzArray3(5, 10) -- [5, 6, 7, 8, 9]
fizzArray3(11, 18) -- [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) -- [1, 2]
		 */

		
		System.out.println(Arrays.toString(fizzArrays(5, 10)));
	}
	public static int[] fizzArrays(int arr, int arr2) {
		
		int[] newArray = new int[arr2-arr];
		int x = 0;
		for(int i=arr; i<arr2; i++) {
			
			newArray[x] =i; 
			x++;
			
		}
		return newArray;
	}

}
