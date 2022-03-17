package review.week8_Arrays;

import java.util.Arrays;

public class BiggestIn2DArray {

	public static void main(String[] args) {

		int[][] x = { {1,34,78,6,9}, {-1,90,2,5,6}, {50,3,2,8,}             };
		
		System.out.println(Arrays.toString(biggestValues(x)));
		
	}
	
	public static int[] biggestValues(int[][] arr) {
		
		
		int[] biggest = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			
			int max = arr[i][0];
			
			for(int each : arr[i]) {
				
				if(each > max ) {
					max = each;
				}
			}
			biggest[i] = max;
		}
		return biggest;
		
	}

}
