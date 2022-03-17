package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

import java.util.Arrays;

public class Question_17 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and print the difference between the largest and
smallest values in the array.
int[] x = {10,3,5,6} = > 7
int[] y = {7,2,10,9} = > 8
int[] z = {2,10,7,2} = > 8
		 */
		
		int[] x = {10,3,5,6};
		int[] y = {7,2,10,9}; 
		int[] z = {2,10,7,2}; 

		System.out.println(largestSmallest(x));
		System.out.println(largestSmallest(y));
		System.out.println(largestSmallest(z));
	}
	
	public static int largestSmallest(int[] arr) {
		
		
		// finding the biggest
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		//finding the smallest
		int min = max;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return max-min;
		
		
		//second way	
//		int largest = 0;
//		int smallest = arr[0];
//		
//		for(int value : arr) {
//			
//			if(value > largest) {
//				largest = value;
//			}
//			if(value < smallest) {
//				smallest = value;
//				
//			}	
//		}
//		
//		return largest-smallest;
	}
	
}
