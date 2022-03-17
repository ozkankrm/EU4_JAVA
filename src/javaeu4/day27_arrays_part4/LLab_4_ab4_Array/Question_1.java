package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_1 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and return true if 6 appears as either the first or
last element in the array. The array will be length 1 or more.
int[] x = {1,2,6}; = > true
int[] y = {6,1,2,3}; = > true
int[] z = {13,6,1,2,3}; = > false
		 */

		int[] scores = {6,2,1,3 };
		int[] z = {13,6,1,2,3};
		int[] y = {6,1,2,3};
		int[] a = {1};
		
		System.out.println(firstLast6(scores));
		System.out.println(firstLast6(y));
		System.out.println(firstLast6(z));
		System.out.println(firstLast6(a));
	}
	
	public static boolean firstLast6(int[] array) {
		
		if(array.length>=1) {
			
			if(array[0]==6 || array[array.length-1]==6) {
				return true;
			}else {
				return false;
			}
		
		}else {
			return false;
		}
		
	}

}
