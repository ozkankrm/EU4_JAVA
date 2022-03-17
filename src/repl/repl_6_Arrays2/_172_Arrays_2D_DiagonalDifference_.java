package repl.repl_6_Arrays2;

import java.util.Scanner;

public class _172_Arrays_2D_DiagonalDifference_ {

	public static void main(String[] args) {
		/*
		 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix  is shown below:
1 2 3
4 5 6
9 8 9  

The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal =  3+5+9 = 17.
 Their absolute difference is |15-17| = 2.
		 */
		
		Scanner scan = new Scanner(System.in);
	    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
	                            };
	    int result = 0;
	    
	    int sumLeft=0;
	    int sumRigth =0;
	    
	    for(int i=0; i<matrix.length; i++) {
	    	
	    		 sumLeft += matrix[i][i];
	    		 sumRigth += matrix[i][matrix.length-1-i];
	    }
	    System.out.println(sumLeft);
	    System.out.println(sumRigth);
	    
	    result = sumLeft-sumRigth;
	    // FINAL PRINT
	    System.out.println(Math.abs(result));

	}
	
	

}
