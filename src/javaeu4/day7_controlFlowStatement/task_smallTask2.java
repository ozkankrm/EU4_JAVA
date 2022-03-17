package javaeu4.day7_controlFlowStatement;

public class task_smallTask2 {

	public static void main(String[] args) {
		/*
 * 1- Write an if-else statement that assigns 20 to variable y if the variable
      x is greater than 100. Otherwise, it should assign 0 to the variable y
 * 2- Write an if-else statement that assigns 1 to x when y is equal to 100.
      Otherwise, it should assign 0 to x.
 * 3- Write an if-else statement that assigns 0 to the variable b and assigns
      1 to the variable c if the variable a is less than 10. Otherwise, it should
      assign �99 to the variable b and assign 0 to the variable c
		 * 
		 * else {
		 *  
		 *  }
		 */

		int y = 100;
		int x = 100;
		if (x>100) {
			y=20;
	    }else {
		y=0;
		}
		System.out.println("y = " + y);

	
	if(y==100) {
		x=1;		
	}else {
		x=0;		
	}
	System.out.println("x = " + x);
	
	int c = 0;
	int d = 1;
	int f = 11;
	if (f<10) {
		System.out.println("c = " + c + " d = " + d);
	}
	else {
		System.out.println("c = -99 " +  " d = 0 ");
	}
	}
}
