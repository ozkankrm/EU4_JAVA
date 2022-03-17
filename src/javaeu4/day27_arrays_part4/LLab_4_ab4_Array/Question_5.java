package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

import java.util.Arrays;

public class Question_5 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array and prints an array with the elements "rotated
left�
int[] x = {1,2,3}; = > [2,3,1]
int[] y = {17,12,10,8}; = > [12,10,8,17]
int[] a = {7,0,0}; = > [0,0,7]
		 */

		int[] x = {1,2,3}; 
		int[] y = {17,12,10,8}; 
		int[] a = {7,0,0}; 
		
		System.out.println(Arrays.toString(rotatedLeft(x)));
		System.out.println(Arrays.toString(rotatedLeft(y)));
		System.out.println(Arrays.toString(rotatedLeft(a)));
	}
	//her elemean� bir ad�m sola kayd�r
	
	public static int[] rotatedLeft(int[] array) {
		
		int x = array[0];// x ilek lementi atad�k
		
		for(int i=0; i<array.length-1; i++) {
			
			array[i] = array[i+1];
		}
		array[array.length-1] = x;// son elemente ilk elementi atad�k
		return array;
	}

}
