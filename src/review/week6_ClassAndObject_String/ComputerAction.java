package review.week6_ClassAndObject_String;

public class ComputerAction {

	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		c1.brand = "Apple";
		c1.price = 1300;
		c1.screenSize = 17;
		
		
		Computer c2 = c1 ;// c2 ye c1 in reference atad�k ve c2 c1 in objectine ula��r
//		two same address/reference one object
		System.out.println( c2.brand);
		System.out.println( c2.price);
		System.out.println( c2.screenSize);
		
		c2.screenSize = 20;
		System.out.println(c1.screenSize);
	}

}
