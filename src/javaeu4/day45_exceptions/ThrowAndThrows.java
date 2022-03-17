package javaeu4.day45_exceptions;

public class ThrowAndThrows {

	public static void main(String[] args) {
		
		System.out.println("Hello word");

	//	throw new RuntimeException("This is some exception");
		
		String username = "";
		
		if(username.isEmpty()) {
			throw new RuntimeException("User name can not be empty");
		}else {
			System.out.println("Valid username");
		}

	}

}
