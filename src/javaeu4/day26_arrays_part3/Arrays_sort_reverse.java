package javaeu4.day26_arrays_part3;

import java.util.Arrays;
import java.util.Collections;

public class Arrays_sort_reverse {

	public static void main(String[] args) {

		// A sample Java program to sort an array of strings 
		// in ascending and descending orders using Arrays.sort().
		
		String arr[] = {"practice.geeksforgeeks.org", 
                "quiz.geeksforgeeks.org", 
                "code.geeksforgeeks.org"
               }; 

		// Sorts arr[] in ascending order 
		Arrays.sort(arr); 
		System.out.printf("Modified arr[] : \n%s\n\n", 
                  Arrays.toString(arr)); 

		// Sorts arr[] in descending order 
		Arrays.sort(arr, Collections.reverseOrder()); 

		System.out.printf("Modified arr[] : \n%s\n\n", 
                  Arrays.toString(arr)); 

		//output
		//Modified arr[] : [quiz.geeksforgeeks.org, practice.geeksforgeeks.org, code.geeksforgeeks.org]
	}

}
