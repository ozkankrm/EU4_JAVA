package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_12 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts two arrays and prints how many of the arrays have 1 as their first
element
int[] x = {1,2,3}
Int[] y = {1,3}
Output = 2
int[] x = {7,2,3}
Int[] y = {1}
Output = 1
int[] x = {3,2,4}
Int[] y = {4,3,4}
Output = 0
		 */
		int[] x = {7,2,3};
		int[] y = {1,3};
		
		int[] a = {3,2,4};
		int[] b = {4,3,4};

		System.out.println(howmanyFirts1(x, y));
		System.out.println(howmanyFirts1(a, b));
	}
	public static int howmanyFirts1(int[] array, int[] array2) {
		
		int count = 0;
		
		if(array[0]==1) {
			count++;
		}
		if(array2[0]==1){
			count++;
		}
	
		return count;
	}

}
