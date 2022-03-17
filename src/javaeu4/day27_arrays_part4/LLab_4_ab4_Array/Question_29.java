package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

import java.util.Arrays;

public class Question_29 {

	public static void main(String[] args) {
		/*
		 * Write a function that accepts and array. For each multiple of 10 in the given array, change all
the values following it to be that multiple of 10, until encountering another multiple of 10.
int[] x = {2,10,3,4,20,5};
System.out.println(Arrays.toString(tenRun(x))); // [2, 10, 10, 10, 20, 20]
int[] y = {10,1,20,2};
System.out.println(Arrays.toString(tenRun(y))); // [10, 10, 20, 20]
		 */
		int[] x = {2,10,3,4,20,5};
		int[] y = {10,1,20,2};

		int[] z = {2,10,3,3,3,20,4,100,1,1,1}; //end

		System.out.println(Arrays.toString(tenRun(x)));
		System.out.println(Arrays.toString(tenRun(y)));
		System.out.println(Arrays.toString(tenRun(z)));

	}

	public static int[] tenRun(int[] arr) {

		for(int i=0;i<arr.length;i++) {

			if(arr[i]%10==0) {

				for(int j=i+1;j<arr.length && arr[j]%10 !=0;j++) {

					arr[j]= arr[i];

				}

			}
		}

		return arr;

	}

}
