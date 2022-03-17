package review.week5_methodPractice;

public class UsingTheReturnKeyWordToControlMethodExecution {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 */
//		voter can vote if they are more than 18
//		ceate a void method to print you are eligible if age is more than 18
			// not eligible if less that or equal to 18
	
		prinVotingEligibility(18);
		prinVotingEligibility(-1);
		prinVotingEligibility(200);
	}
	
	
	//return keyword has 2 usage:
		// return a value from a non-volid method
		// exit metod when the line is reached
	
//	we can not use break keyworrd to break out of method
//	break is only for switch and loop
//	
	public static void prinVotingEligibility(int age) {
		
//		if the age less than zero or more than 100
//		print INVALID NUMBER! and exit out of the method
		
		if(age<0 || age>100) {
			System.out.println("INVALID NUMBER!!!");
			return; // EX�T FROM THE METHOD // break g�revi g�r�r
		}			// SONRAK� SATIRA GE�MEZ
		
		if(age>18) {
			System.out.println("You are eligible to vote");
		}else {
			System.out.println("You are not eligible to vote");
		}
		
		System.out.println("This is the end of message!!! ");
	}

}
