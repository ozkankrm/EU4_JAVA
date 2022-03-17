package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

import java.util.Arrays;

public class Question_30 {

	public static void main(String[] args) {
		/*
		 * It is said that an element in array is alone if there are values before and after it, and those
values are different from it. Write a method that accepts an array and a number and
prints the given array where every instance of the given value which is alone is replaced
by whichever value to its left or right is larger.
int[] x = {1,2,3};
int n = 2;
System.out.println(Arrays.toString(notAlone(x, n))); //[1, 3, 3]
int[] y = {1, 2, 3, 2, 5, 2};
int n1 = 2;
System.out.println(Arrays.toString(notAlone(y, n1))); //[1, 3, 3, 5, 5, 2]
		 */
		
		int[] x = {1,2,3};
		int n = 2;

		int[] y = {1, 2, 3, 2, 5, 2};
		int n1 = 2;
		
		System.out.println(Arrays.toString(notAlone(y, n1)));
		System.out.println(Arrays.toString(notAlone(x, n)));
	}
	public static int[] notAlone(int[] arr, int n ) {
		
		for(int i=0; i<arr.length-2; i++) {
			
			if(arr[i+1] == n ) {
				
				if(arr[i+2]> n) {
					
					arr[i+1] = arr[i+2];
				}	
			}
		}
		return arr;
	}

}
