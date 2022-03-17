package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_16 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints the number of even numbers in the
array.
int[] x = {2,1,2,3,4} = > 3
int[] y = {2,2,0} = > 3
int[] z = {1,3,5} = > 0
		 */
		int[] x = {2,1,2,3,4};
		int[] y = {2,2,0};
		int[] z = {1,3,5}; 

		System.out.println(evenNumbers(x));
		System.out.println(evenNumbers(y));
		System.out.println(evenNumbers(z));
		
	}
	public static int evenNumbers(int[] array) {
		
		int count = 0;
		
		for(int value : array) {
			
			if(value%2 == 0) {
				count++;
			}
		}
		return count;
		
	}

}
