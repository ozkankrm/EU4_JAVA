package javaeu4.day45_exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		
		try {
			//System.out.println(4/0);//burda hata olursa catch te aritmeticExceptiona gider
			
		//	String str = null;
		//	System.out.println(str.toUpperCase());//burda hata olursa catch te NullExceptiona gideer
			
			int[] n = {10,4};
			System.out.println(n[2]);
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception happened");
		}catch(NullPointerException e) {
			System.out.println("Null pointer exception");
		}catch(RuntimeException e) {
			e.printStackTrace();
		}catch(Exception e) {// Exception yukardaki classlardan daha geneldir
			
		}


	}

}
