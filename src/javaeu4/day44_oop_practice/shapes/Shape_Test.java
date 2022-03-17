package javaeu4.day44_oop_practice.shapes;

public class Shape_Test {

	public static void main(String[] args) {

		//create 4 shapes, using polymorphism
		
		
		Shape diamond = new Diamond();
		Shape square = new Square();
		Shape triangle= new Triangle();
		
		Object shapeObject = new Shape();//top class is Object class
		
		square.draw();
		((Square)shapeObject).squareMethod();//casting
		
		
		
		 

	}

}
