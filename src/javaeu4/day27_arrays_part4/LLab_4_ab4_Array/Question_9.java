package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

import java.util.Arrays;

public class Question_9 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints a new array with double the length
where its last element is the same as the original array,
int[] x = {4,5,6}; = > [0,0,0,0,0,6]
		 */

		int[] x = {4,5,6};
		
		System.out.println(Arrays.toString(makeLast(x)));
		
		
	}
	public static int[] makeLast(int[] array) {
		
		int[] newArray = new int[2*array.length];// yeni arrayin lengthini 2 kat�na ��kard�k
		
		newArray[newArray.length-1] =array[array.length-1];// yeni arraye �neki arrayin last elementini atad�k
		
		return newArray;
	}

}
