package review.week4;

public class NestedLoop {

	public static void main(String[] args) {
		
//		count from 1 to 5
//		and repeat above action 5 times
		
//		outer loop is -->ROW
//		inner loop is -->COLUMN
		
	for(int row= 1; row <=5; row++) {
//		put some action in here so we can repeat 5 times for you
		for (int col = 1; col <= 5; col++) {
			System.out.print(col + " ");
		}
		System.out.println();
	}
	System.out.println();
/*
  1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 

 */
	
	for (int row = 1; row <=5; row++) {
		for(int column =1; column<=row; column++) {
			System.out.print(column + " ");
		}
		System.out.println();
	}
	}

}
