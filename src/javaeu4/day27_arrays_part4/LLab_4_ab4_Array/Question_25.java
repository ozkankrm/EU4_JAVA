package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_25 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts two arrays of the same length. For every element in array1,
consider the corresponding element in array2 (at the same index). Return the count of
the number of times that two elements differ by 2 or less, but are not equal.
int[] x = {1,2,3};
int[] y = {2,3,10};
Output: 2
int[] x = {1,2,3};
int[] y = {2,3,5};
Output:3
		 */
		int[] x = {1,2,3};
		int[] y = {2,3,5};
		
		System.out.println(differ2(x, y));

	}
	public static int differ2(int[] arr1, int[] arr2) {
		
		int count=0;
		for(int i=0; i<arr1.length; i++) {
			
			if(arr1[i]-arr2[i] !=0) {
				
				if(arr1[i]-arr2[i]>=-2 && arr1[i]-arr2[i]<=2){
					count++;
				}
			}
		}
		return count;
	}
	
	

}
