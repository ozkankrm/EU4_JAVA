package javaeu4.day45_exceptions;

public class Try_Catch2 {

	public static void main(String[] args) {
		
		int[] nums = {36,6,34,12};
		
		//System.out.println(nums{0]);//compile error

		try {
			System.out.println(nums[6]);
		}catch(Exception e) {
			//System.out.println("Wrong index");
			
		//	e.printStackTrace();//java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
								//	at day45_exceptions.Try_Catch2.main(Try_Catch2.java:12)
			
		//	System.out.println(e.getMessage());//Index 6 out of bounds for length 4
		}
		
		try {
			int j=100;
			int n=j/10;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
