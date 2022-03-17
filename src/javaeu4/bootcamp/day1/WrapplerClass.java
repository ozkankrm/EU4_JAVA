package javaeu4.bootcamp.day1;

public class WrapplerClass {
	
	byte b = 10;
	int i = b; // primite olduğu için assign edebiliriz

	

	Byte b2 = 10;
	//Integer i2 =  b2;  // you cannot assign primitives to wrap object
	Integer i3 =  (int)b2;
	
	
	double d = 1;
	Double d2 = d;
	
	double d3 = b2;
	
	
	String str1 = "123";
	int num = Integer.parseInt(str1); //parseInt ile stringi int çevirdi
	//System.out.println(num + 1);
	
	
}
