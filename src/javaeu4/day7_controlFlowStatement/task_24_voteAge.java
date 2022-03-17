package javaeu4.day7_controlFlowStatement;

public class task_24_voteAge {

	public static void main(String[] args) {
	/*Write a Java program:
	1) Declare a variable and initialize user age.
	2) Then the program will show if the user is eligible to vote. 
	A Person who is eligible to
	vote must be older than or equal to 18 years old.
	
	Input: Enter your age :18
	Output: You are eligible to vote*/
	
	int age =17;
	
	System.out.println("Enter your age : " + age);
	if(age>=18) {
	System.out.println("You are eligible to vote");
		
	}
	
	System.out.println("You don't eligible for vote");
	}

}
