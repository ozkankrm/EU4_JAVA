package repl.repl_6_Arrays2;

import java.util.Scanner;

public class _159_Methods14_PrintUniqueNumbers {

	public static void main(String[] args) {
		/*
		 * Write a void method printUniqueNumbers that will print unique numbers from an array of ints.

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
			  // first way
			  for(int each : nums) {
					
					int count = 0;
					
					for(int eachValue : nums) {
					
						if(each == eachValue) {
							count++;
						}
					}
					if(count == 1) {
					System.out.println(each);
				}
				}		  
			  
			  
	
		// second way
			int count1 = 0;
			  for(int i=0; i<nums.length; i++) {
				  for(int j=0; j<nums.length; j++) {
					  
					  if(nums[i] == nums[j]) {
						  count1++;
					  }
				  }
				  if(count1 == 1) {
					  System.out.println(nums[i]);
				  }
			  }
		
		}
}
