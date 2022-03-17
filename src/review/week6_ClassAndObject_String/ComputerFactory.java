package review.week6_ClassAndObject_String;

public class ComputerFactory {

	public static void main(String[] args) {
	
//		computer class is blueprint for computer objects
		
//		crearing object nnew keyword
		Computer c1 = new Computer();
//		assigning value for each field
		c1.brand = "Apple"; //c1.brand is same a value 
		c1.price = 1300;
		c1.screenSize = 17;
		c1.screenSize = 15; // burda c1 e reassign yapt�k ve bunu yazd�r�r
		
		Computer c2 = new Computer();
		c2.brand = "ASUS"; // c2.brand in the stack & asus in the heap
		c2.price = 345;
		c2.screenSize = 15;
//		c2 and c3 same value but different object in heap and has different reference
		Computer c3 = new Computer();
		c3.brand = "ASUS"; // c2.brand in the stack & asus in the heap
		c3.price = 345;
		c3.screenSize = 15;
		
		
		System.out.println("Computer 1 brand is " + c1.brand );
		System.out.println("Computer 1 price is " + c1.price );
		System.out.println("Computer 1 screenSize is " + c1.screenSize );
		
		System.out.println("Computer 2 brand is " + c2.brand );
		System.out.println("Computer 2 price is " + c2.price );
		System.out.println("Computer 2 screenSize is " + c2.screenSize );
		
		System.out.println("Computer 3 brand is " + c3.brand );
		System.out.println("Computer 3 price is " + c3.price );
		System.out.println("Computer 3 screenSize is " + c3.screenSize );
		
		
		
		
		
	}

}
