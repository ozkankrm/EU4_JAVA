package javaeu4.day45_exceptions;

public class NullPointer {
	
	static String name;

	public static void main(String[] args) {
		
		try {
		System.out.println(name.toUpperCase());

		}catch(NullPointerException e) {  //Exception e)
			System.out.println("NullPointerException happened");
			System.out.println("Here is the messge: " + e.getMessage());
			System.out.println("Here is stack trace: " );
			e.printStackTrace();
		}
	}

}
