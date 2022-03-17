package review.week8_Arrays;

import java.util.Arrays;

public class UniqueFromArryasString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {1,2,1,4,2,3,6,6,8,7,9,5,5,4,};
		
		System.out.println(Arrays.toString(uniquesValues(x)));
	}

	public static String[] uniquesValues(int[] nums) {

		String uniques = "";
		for(int eachNum : nums) {
			
			int count = 0;
			for(int eachInnerNum : nums) {
				
				if(eachNum == eachInnerNum) {
					count++;
				}
			}
			if(count ==1) {
				uniques += eachNum + " ";
			}
		}
//		System.out.println(uniques);
		return uniques.trim().split(" ");
		
}
}
