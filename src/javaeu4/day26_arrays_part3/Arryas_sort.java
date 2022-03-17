package javaeu4.day26_arrays_part3;

import java.util.Arrays;
import java.util.Collections;

public class Arryas_sort {

	public static void main(String[] args) {

		// A sample Java program to sort a subarray 
		// in descending order using Arrays.sort().
		
        // Note that we have Integer here instead of 
        // int[] as Collections.reverseOrder doesn't 
        // work for primitive types. 
        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100}; 
  
        // Sorts arr[] in descending order 
        Arrays.sort(arr, Collections.reverseOrder()); 
  
        System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(arr)); 
        //output
        //Modified arr[] : [100, 45, 21, 13, 9, 7, 6, 2]
    } 

	}


