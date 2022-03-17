package review.Mat_review.self_review;

import java.util.Scanner;

public class Task_82_UserNamePassword {

	public static void main(String[] args) {
		/*
		 * Login Functionality Logic
� UserName,Password
� --- > Program will ask to enter username and password
� --- > If both username and password are blank
� "UserName and Password Fields cannot be empty"
� --- > If userName is blank and password is not blank
� "UserName cannot be empty"
� --- > If userName is not blank and password is blank
� "Password cannot be empty"
� --- > If the username or password is not valid
� "UserName or password is not valid. Please verify"
� --- > If the username and password are both valid
� "User Logged in successfully"
		 */

//		uspas("aassd", "156");
		uspas("ahmet", "1234");
		
		
	}
	public static void uspas(String userName, String passWord) {
		
		String usname = "ahmet";
		String passwr = "1234";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your user name and password");
		userName = scan.nextLine();
		passWord = scan.nextLine();
		
		if(userName.isBlank() && passWord.isBlank()) {
			System.out.println("UserName and Password Fields cannot be empty");
		}
		else if(userName.isBlank() && !passWord.isBlank()) {
			System.out.println("UserName cannot be empty");
		}
		else if(!userName.isBlank() && passWord.isBlank()) {
			System.out.println("Password cannot be empty");
		}
		else if(!userName.equals(usname) && !passWord.equals(passwr)) {
			System.out.println("UserName or password is not valid. Please verify");
		}
		else if(userName.equals(usname) && passWord.equals(passwr)) {
			System.out.println("User Logged in successfully");
		}
		
	}
	

}
