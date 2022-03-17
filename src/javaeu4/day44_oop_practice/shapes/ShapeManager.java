package javaeu4.day44_oop_practice.shapes;

import java.util.List;

public class ShapeManager {

	
	public static Shape buildShape(String type) {
		
		Shape shape = null;
		switch (type.toLowerCase()) {
			case "shape":
				shape = new Shape();
				break;
			case "triangle":
				shape = new Triangle();
				break;
			case "square":
				shape = new Square();
			break;
			case "diamond":
				shape = new Diamond();
			break;
		}
		return shape;
}
	
	public static void drawSquare(Square squareObject) {
		//ystem.out.println("Drawing a square");
		squareObject.draw();
	}
	
	//accept one object
	public static void drawShape(Shape shape) {
		//System.out.println("Drawing a shape");
		shape.draw();
	}
	
	//accepting many object
	public static void drawShape(List<Shape> shapeList) {
		//printing one by one
		for(Shape each : shapeList) {
			each.draw();
		}
	}

}