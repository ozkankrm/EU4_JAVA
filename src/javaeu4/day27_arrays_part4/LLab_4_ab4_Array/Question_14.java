package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

import java.util.Arrays;

public class Question_14 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts 2 arrays and prints a new array containing all their
elements
int[] x = {1,2} int[] y = {3,4} = > [1,2,3,4]
int[] x = {4,4} int[] y = {2,2} = > [4,4,2,2]
int[] x = {9,2} int[] y = {3,4} = > [9,2,3,4]
		 */
		

		int[] x = {1,2,3};
		int[] y = {3,4,};
//		System.out.println(Arrays.toString(plus2Array(x, y)));
		
		int[] k = new int[x.length + y.length]; // yeni array olu�turduk ve size iki arrrayin toplam�d�r
		
		for(int i=0; i<x.length; i++) {// ilk arrayi yeni arraaya ekledik
			
			k[i] = x[i];
		}
		
		// y yi x den sonra ekleyec�iz yani --> newarray= x+y;
		// j yi x in lengthinden ba�latt�k
		// x yaz�rd�k ve y yi de x den sonraki element olarak ekleyece�iz
		
		int a = 0; // j yi s�f�r�nc� elementinden ba�latmak i�in bunu olu�turdk
		for(int j=x.length; j<k.length; j++) {// s�n�r� yeni arrayin s�n�r�n� ald�k
			
			k[j] = y[a];
			a++; // bunu art�rarak j nin di�er elementlerini ekledik
		}
		System.out.println(Arrays.toString(k));
		
		
		
		
		
	}
	
	public static int[] plus2Array(int[] array1, int[] array2) {
		
		int[] newarray = new int[array1.length + array2.length];
		
		for(int i=0; i<array1.length; i++) {
			newarray[i] = array1[i];
		}
		
		for(int i=0; i<array2.length; i++) {
			
			newarray[i+array1.length] = array2[i];
		}
		return newarray;
		
		
	}
	
	
	
	

}
