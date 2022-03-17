package review.week6_ClassAndObject_String;

public class Computer {

	
		// attributes ...
		// instance field | variable
		double price ;
		int screenSize ;
		String brand ;
		
		 //displayInfo
		 public void displayInfo() {
			 
			 System.out.println(  "Computer-price is " + price    );
			 System.out.println(  "Computer-brand is " + brand    );
			 System.out.println(  "Computer-screenSize is " + screenSize    );
		 }

//		open
//		any method is not static -- known as instance method
//		to represent behavior of object
	 public void open() {
		 System.out.println("Computer is opening");
	 }
	 
	 //shutdown
	 
	
			

}
