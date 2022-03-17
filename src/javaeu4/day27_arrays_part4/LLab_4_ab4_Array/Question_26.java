package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_26 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints true if the array contains 3 even
or 3 odd values all next to each other.
int x[] = {2,1,3,5}; //true
int y[] = {2,1,2,5}; //false
int z[] = {2,4,2,5}; //true
		 */

		int x[] = {2,1,3,5}; //true
		int y[] = {2,1,2,5}; //false
		int z[] = {2,4,2,5};
		
		System.out.println(contain3Even_Odd(x));
		System.out.println(contain3Even_Odd(y));
		System.out.println(contain3Even_Odd(z));
		
	}
	public static boolean contain3Even_Odd(int[] arr) {
		
		int count2 = 0;
		int count1 = 0;
		for(int value : arr) {
			
			if(value%2==0) {
				count2++;
			}
			if(value % 2 !=0) {
				count1++;
			}
		}
		if(count1==3 || count2==3) {
			return true;
		}
		return false;
	}

}
