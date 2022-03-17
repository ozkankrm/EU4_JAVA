package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_4 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints the sum of all elements in the array
Write a method that accepts an array and prints the sum of all elements in the array
int[] x = {1,2,3}; = > 6
int[] y = {5,11,2}; = > 18
int[] z = {7,0,0}; = > 7
int[] a = {3,-2,10,4}; = > 15
		 */

		int[] x = {1,2,3}; 
		int[] y = {5,11,2};
		int[] z = {7,0,0}; 
		int[] a = {3,-2,10,4}; 
		
		System.out.println(sumOfElement(x));
		System.out.println(sumOfElement(y));
		System.out.println(sumOfElement(z));
		System.out.println(sumOfElement(a));
	
	}
	public static int sumOfElement(int[] array) {
		
//		first way
		int sum1 = 0;
		for(int value : array) {
			sum1 += value;
		}
		
		return sum1;
		
//		second way
//		int sum = 0;
//		for(int i=0; i<array.length; i++) {
//			
//			sum += array[i];
//		}
//		return sum;
	}
	
}
