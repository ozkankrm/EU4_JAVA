package review.week10_StringArraysReturnMethodArrayList;

import java.util.Arrays;

public class ArraysPractice2_Combine {

	public static void main(String[] args) {

		/*INTERV�EW
		 * combine two array
		 */
		
		String[] group1 = {"Nergiz", "Kevser", "Mohammed", "Hasan", "Hava"};
		String[] group2 = {"mustafa", "cansu", "darina", "emine", "joseph", "ali", "metin"};
		String[]  group3 = {"mustafa", "mehmet", "ferruh", "faruk", "melih", "sheker", "sait"};
		
		int length = group1.length + group2.length + group3.length;
		String[] cybertek = new String[length];
		
//		int biggest = (group1.length>group2.length) ? group1.length : group2.length;

		int i=0; // for the index num of the array cybertek
		
		for(String each : group1) {
			cybertek[i++] = each;
			
		}
		for(String each : group2) {
			cybertek[i++] = each;
			
		}
		for(String each : group3) {
			cybertek[i++] = each;
		}
		System.out.println(Arrays.toString(cybertek));
		
		// 2D array
		String[][] cybertek2 = {group1, group2, group3};
		System.out.println(Arrays.deepToString(cybertek2));
	}

}
