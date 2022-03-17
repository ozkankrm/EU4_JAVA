package repl.repl_5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_PrintShortestWort2_126 {

	public static void main(String[] args) {
		/*
		 * Write a program that will find out shortest words in the given string str. 
		 * If there are few words that are evenly short, print them all. Use split method in order 
		 * to split str string variable and create an array of strings.  
		 * Print array with Arrays.toString() method. Sort array before printing. 
Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
		 */
		
		 Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();

		    String[] array = str.split(", "); // virg�l bo�luk tan split ettik
		    
		    String shortest = array[0];
		    
		    String result = "";
		    
		    for(String each : array) {
		    	
		    	if(each.length()<shortest.length()) {
		    		shortest = each;
		    		result = each;
		    	}else if(each.length() == shortest.length()) {
		    		result = result + " " + each;
		    	}
		    		
		    }
		    String[] resultArr = result.split(" ");
		    Arrays.sort(resultArr);
		    Arrays.toString(resultArr);
		    
		    System.out.println(Arrays.toString(resultArr));
	
	}

}
