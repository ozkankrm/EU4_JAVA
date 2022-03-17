package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_20 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints true if the array contains a 2
next
to a 2 somewhere.
int[] x = {1,2,2} = > true
int[] y = {1, 2, 1,2} = > false
int[] a = {2,1,2} = > false
int[] b = {2,2,1,2} = > true
		 */
		
		int[] x = {1,2,2};
		int[] y = {1, 2, 1,2}; 
		int[] a = {2,1,2};
		int[] b = {2,2,1,2};
		
		System.out.println(containsnext2(x));
		System.out.println(containsnext2(y));
		System.out.println(containsnext2(a));
		System.out.println(containsnext2(b));
	}
	
	public static boolean containsnext2(int[] array) {
		
		for(int i=0; i<array.length-1; i++) {
			
			if(array[i] == 2 && array[i+1] == 2) {
				
				return true;			
			}
		}
		return false;
	}

}
