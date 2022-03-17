package javaeu4.day27_arrays_part4;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//toString()
		int[] nums = {43,12,4,1,3,5};
		
		System.out.println(Arrays.toString(nums));
		
		//equals()
		int[] nums1 = {4,5,6,10,100};
		int [] nums2 = {4,5,6,10,100};
		System.out.println(Arrays.equals(nums1, nums2));
		
		//sort(): sorts array in ascending order
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages = { "Zulu", "Spanish", "Italian", "english", "1Polish", "arabic"         };
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages)); // alfabetik s�raya koyar
		//e�er b�y�k ve k���k harf kar���ksa �nce b�y�k sonra k���k
		// e�er rakam varsa �nce rakam sonra harfleri s�raaya koyar
		
		//binarySearch()
		int[] numX = { 4,6,7,10,55 };
		System.out.println(Arrays.binarySearch(numX, 7));//2 // elementin indexini verir
															// 7 rakam� index 2 de
		System.out.println(Arrays.binarySearch(numX, 55));
		
		System.out.println(Arrays.binarySearch(numX, 5));// -2 // (-(insertionPoint)-1
		System.out.println(Arrays.binarySearch(numX, 15));// -5
		
		
		int[] numX2 = {40,6,101,101,77    };
		System.out.println(Arrays.binarySearch(numX2, 83));// -3
		
		
		//copyOf()
		double[] d1 = { 2.3,4.5,12,4    };
		double[] d2 = d1;
		
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0] = 100.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2[1] = 400.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		//double[] d3 = Arrays.copyOf(d2, d2.length);
		double[] d3 = Arrays.copyOf(d2, 5); // d2 nin uzunlu 4 yani 4 element d3 te 4 elemeti d2 den al�r ve 5. elemen 0.0 ol0 
		System.out.println(Arrays.toString(d3));
		
		d2[0] = 5.2;
		System.out.println(Arrays.toString(d2));// d2 de de�i�iklik olur
		System.out.println(Arrays.toString(d3));// d2 den copy yapt���m�z i�in de�i�medi
		
		
	}

}
