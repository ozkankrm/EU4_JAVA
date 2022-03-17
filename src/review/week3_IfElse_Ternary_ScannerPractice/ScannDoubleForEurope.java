package review.week3_IfElse_Ternary_ScannerPractice;

import java.util.Locale;
import java.util.Scanner;

public class ScannDoubleForEurope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
	System.out.println("Enter double using . not comma");
	double num = scan.nextDouble();
	System.out.println("Entering double " + num);
	}
	

}
