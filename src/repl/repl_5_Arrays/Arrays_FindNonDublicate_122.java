package repl.repl_5_Arrays;

import java.util.Scanner;

public class Arrays_FindNonDublicate_122 {

	public static void main(String[] args) {
		/*
		 * Given an array nums with 7 integers every element is repeated twice - except one.
		 *  Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2
		 */
		
		 Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    for(int num1 : nums){
		        
		        int count = 0;
		        for(int num2 : nums){
		          if(num1 == num2){
		            count++;
		          }
		        }
		        
		        if(count==1){
		          System.out.println(num1);
		        }
		      }
	}
}

	


