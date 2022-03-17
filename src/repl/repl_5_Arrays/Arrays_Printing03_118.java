package repl.repl_5_Arrays;

import java.util.Scanner;

public class Arrays_Printing03_118 {

	public static void main(String[] args) {
		/*
		 * The code provided in your main method will take in six Strings and 
		 * save them into an array called arr.  
Print out the 3 neighboring items of the array in one line until the last line
each line should contain 3 neighboring items of array element as displayed below
user for loop

Example:
arr -> ["apple", "banana","kiwi", "grape","milk","soda"] 
 prints:  apple , banana , kiwi
          banana , kiwi , grape
          kiwi , grape , milk
          grape , milk , soda
		 */

		Scanner input = new Scanner(System.in);
		String[] arr = new String[6];
		for (int i=0;i<6;i++)
		{
			arr[i] = input.nextLine();
		}
		//leave above alone! :)   
		//assume you have String array of 6 items 
		//and print three neibouring items at a time till last item
		//write your code below
		
		
		for(int i=0; i<arr.length-2; i++) {

				System.out.println(arr[i]+ " , " + arr[i+1] + " , "+ arr[i+2]);	
			
		}
	
		
	}

}
