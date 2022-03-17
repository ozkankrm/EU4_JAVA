package javaeu4.day15_methodOverloading;

public class Assignment3_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1 1 2 3 5 8 13 
		
		
		
		int count = 8;
		
		int pre1=0; int pre2=1;
		System.out.println("Fibonacci series of " + count + " numbers");
		
		for(int i=1; i<count; i++) {
			
			System.out.print(pre2+ " ");
			
//			on each iteration we are assigning second number to the first number and
//			assigning the sum of last two numbers to the second number
			
			int sumOfPrevTwo = pre1+pre2;
			pre1=pre2;
			pre2=sumOfPrevTwo;
			
		}
		
	}

}
