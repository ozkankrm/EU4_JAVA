package javaeu4.day20_StringManupulation_Part2;

import java.util.Scanner;

public class Task_82_UserNameAndPassword {

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
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your username");
		String userName = scan.nextLine();
		
		System.out.println("Enter your password");
		String	password = scan.nextLine();
		
		String userNameInSystem = "Mike";
		String passwordInSystem = "12345";

		if(userName.equals("") && password.equals("")) {
			System.out.println("UserName and Password Fields cannot be empty");
		
		}else if(userName.equals("") && !password.equals("")) {
			System.out.println("UserName cannot be empty");
		
		}else if(!userName.equals("") && password.equals("")) {// !userName.equals("")
			System.out.println("Password cannot be empty");
		
		}else if(!userName.equals(userNameInSystem) || !password.equals(passwordInSystem)) {
			System.out.println("UserName or password is not valid. Please verify");
		
		}else if(userName.equals(userNameInSystem) && password.equals(passwordInSystem)) {
			System.out.println("User Logged in successfully");
			
		
		
		}
	}

}
