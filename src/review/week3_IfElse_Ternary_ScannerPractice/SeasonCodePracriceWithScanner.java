package review.week3_IfElse_Ternary_ScannerPractice;

import java.util.Scanner;

public class SeasonCodePracriceWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a season code: 1, 2, 3 or 4 : ");
		int seasonCode = scan.nextInt();
//		int seasonCode = 5; // 1,2,3,4
		// 1 : Spring  : Summer 3: Fall 4: Winter
		
		switch(seasonCode) {
		case 1: 
			System.out.println("Spring");
			break;// this is or breaking out of the switch statement
		case 2:
			System.out.println("Summer");
			break;
		case 3:
			System.out.println("Fall");
			break;
		case 4:
			System.out.println("Winter");
			break;
		default:
			System.out.println("INVALID ENTRY!!!!");
			break;// this is optianol herr because this is the last line of switch anyway
		}
	}

}
