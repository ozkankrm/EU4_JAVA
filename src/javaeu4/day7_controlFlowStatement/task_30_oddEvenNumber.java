package javaeu4.day7_controlFlowStatement;

public class task_30_oddEvenNumber {

	public static void main(String[] args) {
		/*
		 * Write a Java program:
1) Declare and initialize a number
2) Display whether the number is an odd number or even number.
		 */
		
		int a = 11;
		
		if(a%2==0) {
			System.out.println("a= " + a + " is even number" );
			
		}
		else {
			System.out.println("a = " + a + " is odd number");
			
		}
	}

}
