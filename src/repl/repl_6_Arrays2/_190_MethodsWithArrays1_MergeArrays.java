package repl.repl_6_Arrays2;

import java.util.Arrays;

public class _190_MethodsWithArrays1_MergeArrays {

	public static void main(String[] args) {
		/*
		 * mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.
		 */

		int[] a1 = {1,2,3};
		int[] b1 = {4,5,6};
		Arrays.toString(mergR(a1, b1));
		System.out.println(Arrays.toString(mergR(a1, b1)));
		
	}
	public static int[] mergR(int[] a,int[] b) {
	    
		int[] newArray = new int[a.length + b.length];
		
		for(int i=0; i<a.length; i++) {
			
			newArray[i] = a[i];
		}
		int x = 0;
		for(int j=a.length; j<newArray.length; j++) {
		
			newArray[j] = b[x];
			x++;
		}
		   
	    return newArray;
	  }//end mergR
	
	
	
	

}
