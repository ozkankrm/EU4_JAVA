package javaeu4.bootcamp.day1;

public class Primitives {

	public static void main(String[] args) {
		
		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10;
		
		
		int intNumber = b; //implicit casting done by compiler otomatikly //byte to int-->smaller to larger
		
//		byte byteNumber = i; //give error i > byte
		
		byte byteNumber1 = (byte)i; //explicit casting // larger to smaller // int to byte
		
		char ch = 100;
		
		System.out.println("ch = " + ch);
		
		boolean r1 = true;
		boolean r2 = false;
		boolean r3 = 10>9;
		
		

	}

}
