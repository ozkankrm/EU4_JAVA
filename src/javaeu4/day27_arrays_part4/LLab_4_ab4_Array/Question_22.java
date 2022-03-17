package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

public class Question_22 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints true if the number 1's is greater
than the number 4's
int[] x = {1,4,1} = > true
int[] x = {1,4,1,4} = > false
int[] x = {1,1} = > true
		 */

		int[] x = {1,4,1};
		int[] y = {1,4,1,4};
		int[] z = {1,1};
	
	System.out.println(firstGreater4(x));
	System.out.println(firstGreater4(y));
	System.out.println(firstGreater4(z));
	
	}
	public static boolean firstGreater4(int[] array) {
		
		int count1 = 0;
		int count4 = 0;
		for(int i=0; i<array.length; i++) {
			
			if(array[i] == 1 ) {
			count1++;
			}
			if(array[i] ==4 ) {
				count4++;
			}
		
	}
		if(count1>count4) {
			return true;
		}
		return false;
	}
}
