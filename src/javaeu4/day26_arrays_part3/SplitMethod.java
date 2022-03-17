package javaeu4.day26_arrays_part3;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		String str = "It will display the array of the size ";
		
		str.split(" ");
		
		String[] arr3 = str.split("display");
		System.out.println(arr3.length);
		System.out.println(Arrays.toString(arr3));
		
		String[] arr1 = str.split("the");//
		System.out.println(arr1.length);
		System.out.println(Arrays.toString(arr1));
		
		String[] arr = str.split(" ");
		System.out.println(arr.length);
		
		System.out.println(Arrays.toString(arr));

	}

}
