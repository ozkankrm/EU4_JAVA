package assignments.day12_Assignment_5_MixLoop;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program for the following logic:
//		Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
//			if end = 10, OUTPUT = 1, 3, 5, 7, 9
//			if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
//		

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Upper bound?");
		int a = scan.nextInt();

		int i=1;
		while(i<=a)
		{
		  if(i%2!=0)
		  {
		    System.out.print(i);
		    if(i<a-1) {
		      System.out.print(",");
		    }
		  }
		  i++;

	}

	}
}