package review.week3_IfElse_Ternary_ScannerPractice;

import java.util.Scanner;

public class LoginTestWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String username = "abcd";
		String password = "secret" ;
		
		System.out.println("Enter your username and password separated by space");
		username = scan.next(); //iki kelimeyi ayn� sat�rda girilmesi istendi ve next biri kelime yazd�r�r ve di�eri di�erini yazd�r�r.
		password = scan.next();
		
		if (    username.equals("abcd") && password.equals("secret") ) {
			System.out.println("SUCCESSFUL!!!");
			
		}else if ( !username.equals("abcd") && !password.equals("screst")){
			System.out.println("BOTH USERNAME AND PASSWORD ARE WRONG!!");
			
		}else if (  username.equals("abcd") && !password.equals("secret") ) {
			System.out.println("USERNAME �S CORRECT BUT PASSWORD IS WRONG");
			
		}else if(  !username.equals("abcd")  && password.equals("secret")) {
			System.out.println("USERNAME IS WRONG BUT PASSWORD IS CORRECT");
		}
				
		
	}

}
