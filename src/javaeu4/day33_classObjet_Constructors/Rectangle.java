package javaeu4.day33_classObjet_Constructors;

public class Rectangle {
	
	
	double length; //0.0
	double width; //0.0
	
	
	public void getArea() {
		
		System.out.println(length*width);
		
	}
	
	// this is constructor
	// name must matchs class name
	public Rectangle() {
		
		//intantiate the object variables
		
	}
	
	// created a constructor
	// accepts 2 argumants type double
	public Rectangle(double a, double b) {
	
		length = a;
		width = b;
	}
}
