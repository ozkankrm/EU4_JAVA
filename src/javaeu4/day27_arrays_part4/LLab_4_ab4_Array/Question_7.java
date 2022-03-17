package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

import java.util.Arrays;

public class Question_7 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts 2 arrays and prints the second array containing the first
and last elements from the first array.
int[] x = {1,2,3};
int[] y = {}; = > [1,3]
int[] a = {7,4,6,2};
int[] b = {}; = > [7,2]
		 */

		int[] x = {1,2,3};
		int[] y = {}; 
		int[] a = {7,4,6,2};
		int[] b = {};
	
	System.out.println(Arrays.toString(secondArray(x, y)));
	System.out.println(Arrays.toString(secondArray(a, b)));
	
	}

	public static int[] secondArray(int[] array, int[] array2) {
		// array2 iki elementli olacakt�r ve size n� belirledik sonra atamas�n� yapt�k
		array2 = new int[2];
		
		array2[0] = array[0];
		array2[1] = array[array.length-1];
		
		return array2;
		
		
	}
	
	
	
}
