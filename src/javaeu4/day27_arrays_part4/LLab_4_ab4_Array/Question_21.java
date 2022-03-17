package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_21 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints true if the sum of all 2's in the
array is exactly 8
int[] x = {2, 3, 2, 2, 4, 2} = > true
int[] x = {2, 3, 2, 2, 4, 2, 2} = > false
int[] x = {1, 2, 3, 4} = > false
		 */
		int[] x = {2, 3, 2, 2, 4, 2};
		int[] y = {2, 3, 2, 2, 4, 2, 2}; 
		int[] z = {1, 2, 3, 4};
		
		System.out.println(sumOf2_8(x));
		System.out.println(sumOf2_8(y));
		System.out.println(sumOf2_8(z));
		
	}
	
	public static boolean sumOf2_8(int[]array) {
		
		int sumOf2 = 0;
		for(int i=0; i<array.length; i++) {
			
			if(array[i] == 2) {
				sumOf2 += array[i];		
			}
		}
		if(sumOf2 == 8) {
			return true;
		}
		return false;
	}

}
