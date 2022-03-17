package javaeu4.day21_StringManupulation_Part3;

public class String_isEmpty {

	public static void main(String[] arg) {
		
//		isEmpty method check empty or not return boolean true or false
		
		String userName = "";
		String password = "";
		
		if(userName.isEmpty()) {	
			System.out.println("username field can not be empty");
		}else {
			System.out.println("username is not empty");
		}
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password can not be empty");
		}else {
			System.out.println("username or password is not empty");
		}
		
		

	}

}
