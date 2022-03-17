package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_18 {

	public static void main(String[] args) {
		/*
		 * Write a function that accepts an array and prints the sum of the numbers in the
array. Except the number 13 is very unlucky, so it does not count and numbers that
come immediately after a 13 also do not count
int[] x = {1,2,2,1} = > 6
int[] y = {1,1} = > 2
int[] a = {1,2,2,1,13} = > 6
int[] b = {1,2,2,1,13,3} = > 6
		 */
		
		int[] x = {1,2,2,1};
		int[] y = {1,1};
		int[] a = {1,2,2,1,13};
		int[] b = {1,2,2,1,13,3};
		

		System.out.println(unlucky13(x));
		System.out.println(unlucky13(y));
		System.out.println(unlucky13(a));
		System.out.println(unlucky13(b));
		
	}
	public static int unlucky13(int[] arr) {
		
		int count = 0;
		for(int value : arr) {
			
			if(value == 13) {
				break;
			}else {
			count += value;
			}
		}
		return count;
	}

}
