package assignments.day12_Assignment_5_MixLoop;

public class Question_8 {

	public static void main(String[] args) {
	/*
	 * Write a program to calculate the sum of the numbers from 1 till upper bound.
If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.	
	 */
		
		String upper = "100";
		int sum = 0;
		int i = 1;
		while(i<100) {
			
			if(upper.equals("5") && i<=5) {
				System.out.print("+" +i);
				sum = sum+i;
				
			}if(upper.equals("11") && i<=11) {
				System.out.print("+" +i);
				sum = sum+i;
				
			}if(upper.equals("100") && i<100) {
				System.out.print("+" +i);
				sum = sum+i;
			}
			
			i++;			
		
			}
		System.out.println(" = " + sum);
		
	}

}
