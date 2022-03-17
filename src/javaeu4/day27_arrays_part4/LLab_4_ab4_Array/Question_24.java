package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_24 {

	public static void main(String[] args) {
		/*
		 * A value is "everywhere" in an array if for every pair of adjacent elements in the array, at
least one of the pair is that value.
Write a method that accepts an array and a number, and prints true if the given number
is everywhere in the array.
int[] x = {1, 2, 1, 3};
int a = 2;
Output: false
int[] x = {1, 2, 1, 3};
int a = 1;
Output: true
		 */
		int[] x = {1, 2, 1, 3};
		int a = 2;
		int[] y = {1, 2, 1, 3};
		
		System.out.println(everywhere(x, a));

	}

	public static boolean everywhere(int[] array, int number) {
		
		for(int i=2; i<array.length; i++) {
			
			if(array[i] == number && (array[i] == number || array[i+2] ==number )) {
				return true;
			}
		}
		
		return false;
	}
}
