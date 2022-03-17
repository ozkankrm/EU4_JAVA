package review.week4;

public class CountingDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		while loop
		
		int x = 10;
		
		while(x>=0) {
			System.out.print(x + " ");
			x--;
		}
		System.out.println();
//		do while loop
		int y=10;
		
		do	
		{
			System.out.print(y + " ");
			y--;
		}while(y>=0);
		
		System.out.println();
		
//		for loop
		
		for (int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
			
		}
	}

}
