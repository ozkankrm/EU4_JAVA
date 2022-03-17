package repl.repl_6_Arrays2;

import java.util.Arrays;

public class _171_Arrays_2D_ChessBoard {

	public static void main(String[] args) {
		/*
		 * Given a 8x8 two-dimensional array of strings named chessboard. 
		 * Initialize values inside an array accordingly to the chess board.
		 *  So first element in the array,
		 *  chessboard[0][0] should have a value "1a", and last element in the array, chessboard[7][7]
		 *   should have a value "8h". 
		 */

		 String[][] chessBoard = new String[8][8];

		 for(int row=0; row<8; row++) {
			 for(char myChar ='a'; myChar<='h'; myChar++) {
				 
				 //'a'-->97
				 int col = myChar-97;
				 chessBoard[row][col] = row+1 + "" + myChar; 
			 }
		 }

		 
		    
		    //DO NOT CHANGE
		    System.out.println(Arrays.deepToString(chessBoard));
	}

}
