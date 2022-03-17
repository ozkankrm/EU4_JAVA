package javaeu4.day37_inheritance;

import java.util.Scanner;

public class FinalExam_Test {

	public static void main(String[] args) {


		//ask user how many question in the exam
		//ask user how many question missed
		// give user letterGrade(A, B, C..)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many question in the exam");
		int question = scan.nextInt();
		
		System.out.println("How many question in the exam");
		int missed = scan.nextInt();
		
		FinalExam fExam = new FinalExam(question, missed);
		
		System.out.println("The grade for the examis " + fExam.getGrade());
		
		
		

	}

}
