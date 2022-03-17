package assignments.Assignment_4_;

import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many book did you bought?");
		
		int booksNumber = scan.nextInt();
		int point = 0;
		
		switch(booksNumber) {
		case 0:
			point = 0;
			break;
		case 1:
			point = 5;
			break;
		case 2:
			point = 15;
			break;
		case 3:
			point = 30;
			break;
		default:
			point = 60;
			break;
			
		}
		System.out.println("Your points is: " + point);
	}

}
