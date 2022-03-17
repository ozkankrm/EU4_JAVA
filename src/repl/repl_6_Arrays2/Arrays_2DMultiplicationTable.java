package repl.repl_6_Arrays2;

import java.util.Arrays;

public class Arrays_2DMultiplicationTable {

	public static void main(String[] args) {
		
		   int [][] multiplicationTable = new int[10][10];
		   
		   for(int i=0; i<10; i++) {
			   
			   for(int j=0; j<10; j++) {
				      
				  multiplicationTable[i][j] = (i+1)*(j+1);
			   }
			   
		   }
		   
		   
		   
		   
    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
		 

	}

}
