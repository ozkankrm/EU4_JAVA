package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

import java.util.Arrays;

public class Question_15 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and swap the first and last element in the
array. Print the modified array
int[] x = {1,2,3,4} = > [4,2,3,1]
int[] y = {1,2,3} = > [3,2,1]
int[] z = {8,6,7,9,5} = > [5,6,7,9,8]
		 */
		
		int[] x = {1,2,3,4};
		
		System.out.println(Arrays.toString(swapFirstLast(x)));

	}

	public static int[] swapFirstLast(int[] array) {
		
		int temp = 0;
		
			temp = array[0];
			
			array[0] = array[array.length-1];
			
			array[array.length-1] = temp;
			
			return array;
	}
}
