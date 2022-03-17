package javaeu4.day27_arrays_part4.LLab_4_ab4_Array;

import java.util.Arrays;

public class repeat {
	public static void main(String[] args) {
		
		
		int[] x = { 1,2,5,89,5};
		firstLat(x);
		
	}
	
	public static void sum(int[] array, int[] array2) {
		
	int sum1 = 0;
	int sum2 = 0;
	
	for(int value : array) {
		
		sum1 += value;
	}
	
	for(int value : array2) {
		sum2 += value;
	}
	
	if(sum1==sum2) {
		System.out.println("equal");
	}
	if(sum1>sum2) {
		System.out.println(Arrays.toString(array));
	}
	else {
		System.out.println(Arrays.toString(array2));
	}
	
	}
	public static int first1(int[] array, int[] array2) {
		
		int count = 0;
		
		if(array[0]==1) {
			count++;
		}
		if(array2[0]==1) {
			count++;
		}
		return count;
		
	}
	
	// 2 den sonra 3 geliyorsa 3 � 0 ile de�i�tir
	public static int[] change3(int[] array) {
		
		for(int i=0; i<array.length-1; i++) {
			
			if(array[i] ==2 && array[i+1]==3) {
				
				array[i+1] = 0;
				
			}
		}
		return array;
		
	}
	
	// twice 2 or twice 3
	public static boolean twice23(int[] array) {
		
		int counter2 = 0;
		int counter3 = 0;
		
		for(int value : array) {
			
			if(value ==2) {
				counter2++;
			}
			if(value == 3) {
			counter3++;
			}
			
			if(counter2==2 || counter3==2) {
				return true;
			}
		}
		return false;
	}
	
	
	public static int[] doublelengt(int[] array, int[] array2) {
		
		 array2 = new int[2*array.length];
		
		 array2[array2.length-1] = array[array.length-1];
		
		return array2;
	}
	
	//contain 2 or 3-- true
	public static boolean contains23(int[]array) {
		
		for(int value : array) {
			
			if(value ==2 || value==3) {
				return true;
			}
		}
		return false;
	}
	
	// first and last element ile yeni array olu�tur
	public static void firstLat(int[]array) {
		
		int[] newArray = new int[2];
		
		newArray[0] = array[0];
		newArray[newArray.length-1] = array[array.length-1];
		
		System.out.println(Arrays.toString(newArray));
		
	}
	
	
	//find max elelement and assign max element to all element
	public static int[] greatest(int[] array) {
		
		int x = array[0];
		
		for(int i=0; i<array.length-1; i++) {
			
			if(array[i+1]>x) {
				x=array[i+1];
			}
		}
		for(int i=0; i<array.length; i++) {
			array[i] = x;
		}
		return array;
		
		
	}
	
	// rotated left-->her eleman� bir sola kayd�r(ilk eleman ile son eleman� yer de�i�tir
	public static int[] rotatedLeft(int[] array) {
		
		int y = array[0];
		for(int i=0; i<array.length; i++ ) {
			
			array[i] = array[i+1];
		}
		array[array.length-1] = y;
		
		return array;
		
	}
	

}
