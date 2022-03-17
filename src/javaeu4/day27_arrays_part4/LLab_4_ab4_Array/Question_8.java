package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_8 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints true if it contains a 2 or a 3
int[] x = {2,5}; = > true
int[] y = {4,3}; = > true
int[] z = {4,5}; = > false
		 */

		int[] x = {2,5}; 
		int[] y = {4,3};
		int[] z = {4,5};
		
		System.out.println(contains(x));
		System.out.println(contains(y));
		System.out.println(contains(z));
		
	}
	
	public static boolean contains(int[] array ) {
	
		//first way 
		for(int value : array) {
			
			if(value==2 || value==3) {
			 return true;	
			}
		}
		return false;
		

		
		
//		second way
//		for(int i=0; i<array.length; i++) {
//			
//			if(array[i]==2 || array[i]==3) {
//				return true;
//			}
//		}
//		return false;
	}

}
