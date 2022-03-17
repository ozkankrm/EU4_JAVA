package review.week3_IfElse_Ternary_ScannerPractice;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String equality
		/*
		String str1 = "Adam";
		String str2 = "adam"; // harfe duyarl� e�er b�y�k veya k���k farkl�l��� olursa yanl�� olur
		
//		checking the content of str1 and str2 equals or not
//		we use equals method
		boolean isSame = str1.equals(str2);
		System.out.println(isSame);
		*/
		Scanner scan = new Scanner(System.in);
		String season = "Summer";
		System.out.println("What is the season?");
		season = scan.nextLine();
		
		switch(season) {
		
		case "Spring" :
			System.out.println("picnic");
			break;
			
		case "Summer":
			System.out.println("Swimming");
			break;
			
		case "Fall":
			System.out.println("hiking");
			break;
			
		case "Winter":
			System.out.println("Skiing");
			break;
			
		default: 
			System.out.println("INVALID SEASON!!!");
			break;
		}
	
		
		
		/*String season = "Summer";
	
		if(season.equals("Spring")) {
			System.out.println("picnic");
		}else if ( season.equals("Summer")   ) {
			System.out.println("Swimming");
		}else if(  season.equals("Fall")  ) {
			System.out.println("hiking");
		}else if (  season.equals("Winter")  ) {
			System.out.println("Skiing");
		}else {
			System.out.println("INVALID SEASON!!!");
		}
		*/
	}

}
