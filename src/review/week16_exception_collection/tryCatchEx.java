package review.week16_exception_collection;

public class tryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "java";
		try {
			
		System.out.println(s.charAt(1));
	//	throw new RuntimeException();
		Thread.sleep(-10);
		
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println(s.charAt(0));
		
	}catch(InterruptedException e) {
		System.out.println("Exception");
	}finally {
		System.out.println("Finally block");
	}
		
		try {
			
		}finally {
			
		}
		
		
	}

}
