package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

import java.util.Arrays;

public class Question_13 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts 2 arrays and consider the sum of the values in each array.
Print the array which has the largest sum. In event of a tie, print "equal"
int[] x = {1,2} int[] y = {3,4} = > [3,4]
int[] x = {5,6} int[] y = {3,8} = > equal
int[] x = {1,1} int[] y = {1,0} = > [1,1]
		 */

		int[] x = {1,2}; 
		int[] y = {3,4}; 
		
		largestSum(x, y);
		
	}
	public static void largestSum(int[] array, int[] array2) {
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int value :array) {
			sum1 += value;
		}
		
		for(int value : array2) {
			sum2 += value;
		}
		
		if(sum1==sum2) {
			System.out.println("equal");
		}
		if(sum1>sum2) {
			System.out.println(Arrays.toString(array));
		}else {
			System.out.println(Arrays.toString(array2));
		}	
	}
}
