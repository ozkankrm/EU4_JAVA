package javaeu4.day33_classObjet_Constructors;

public class RectangleTest {

	public static void main(String[] args) {


		Rectangle R1 = new Rectangle( );
				
		// new call the constructor and create the object
		// initialize object variables
		
		System.out.println(R1.length); // 0.0	// who is giving me default values?	
		System.out.println(R1.width);			// constructor give default value
		
		R1.length = 5.4;
		R1.width = 3.2;
		R1.getArea();
		
		Rectangle R2 = new Rectangle(2.7, 6.5); // R1 de yerine 2 parametreli daha aktif 
		System.out.println(R2.length);
		System.out.println(R2.width);
		
//		R2.length = 2.7;
//		R2.width = 6.5;
		R2.getArea();
		
		

	}

}
