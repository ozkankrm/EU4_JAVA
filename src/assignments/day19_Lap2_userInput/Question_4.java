package assignments.day19_Lap2_userInput;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		
//	Write a program that asks user for the number of males and the number of females registered 
//	in a class. The program should display the percentage of males and females in the class

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of male students:");
		int numOfMale = scan.nextInt();
		
		System.out.print("Enter number of female students:");
		int numOfFemale = scan.nextInt();
		
		int sumOfTotal = numOfMale+numOfFemale;
		System.out.println(sumOfTotal);
		int percentageMale =  (int) (((double)numOfMale/(double)sumOfTotal)*100);
		System.out.println("Percentage of male students: " + percentageMale + "%");
		
		double percentageFemale = (int) (((double)numOfFemale/(double)sumOfTotal)*100);
		System.out.println("Percentage of female students: " + percentageFemale + "%");
		

	}

}
