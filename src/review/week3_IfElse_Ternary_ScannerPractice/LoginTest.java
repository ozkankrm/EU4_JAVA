package review.week3_IfElse_Ternary_ScannerPractice;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String username = "abc";
//		String password = "secret";	
		
		// correct username password is abcd and secret
			
/*
 * 
 * 		if the username and password is abcd and secret at the same time
 * 		print LOGIN SUCCESSFUL
 * 		ELSE
 * PR�NT LOGIN NOT SUCCESSFUL
 * 
 * optionally add logic for what was not correct
 * 
 * 
 */
//		ayn� anda iki ko�ulu birlikte kontrol ediyoruv ve logic operatorlerini kullan�r�z
		
//		if (    username.equals("abcd") && password.equals("secret") ) {
			System.out.println("SUCCESSFUL!!!");
//		}else {
//			System.out.println("LOGIN NOT SUCCESSFUL!!!");
//		}
		
		String username = "abcd";
		String password = "secrett" ;
		/*
		 * 1 both username and password are correct
		 * 2. both username and password are wrong
		 * 3. username is correct but password is wrong
		 * 4. username is wrong but password is correct
		 * 
		 * nested if lullan�l�r
		 * 
		 */
//		
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
