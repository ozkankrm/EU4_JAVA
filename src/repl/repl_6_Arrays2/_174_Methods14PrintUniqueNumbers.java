package repl.repl_6_Arrays2;

import java.util.Scanner;

public class _174_Methods14PrintUniqueNumbers {

	public static void main(String[] args) {
		/*
		 * Complete a void method printUniqueNumbers() that will print all unique numbers from an array of ints.
		 *  Every single unique int should be printed from the new line. 

Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
		 */

		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i=0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    printUniqueNumbers(nums);
		    
		  }
		  
		  public static void printUniqueNumbers(int[] nums){
		    //WRITE YOUR CODE HERE
		   
			  for(int value1 : nums) {
				  int count = 0;
				  for(int value2 : nums) {
					  
					  if(value1 == value2) {
						  count++;
					  }
				  }
				  if(count == 1) {
					  System.out.println(value1);
				  }
			  }
		    
		    
		    
		  }
		  
		
	

}
