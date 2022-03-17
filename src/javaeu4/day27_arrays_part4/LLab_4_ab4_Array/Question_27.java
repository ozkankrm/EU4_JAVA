package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_27 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints true if the array contains, somewhere,
three increasing adjacent numbers like 4,5,6,... or 23,24,25.
int[] x = {1,4,5,6,2}; //true
int[] y = {1,2,3}; //true
int[] z = {1,2,4,5,8,9}; //false
		 */
		int[] x = {1,4,5,6,2}; //true
		int[] y = {1,2,3}; //true
		int[] z = {1,2,4,5,8,9}; //false
		
		System.out.println(contains3anywhere(x));
		System.out.println(contains3anywhere(y));
		System.out.println(contains3anywhere(z));

		
	}
	public static boolean contains3anywhere(int[] arr) {
		
		for(int i=0; i<arr.length-2; i++) {
			
			if(arr[i]+1 == arr[i+1] && arr[i]+2 == arr[i+2] ) {
				return true;
			}
			
		}
		return false;
	}
	

}
