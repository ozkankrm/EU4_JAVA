package javaeu4.day43_polymorphism;

import java.util.ArrayList;
import java.util.List;


public class InstanceOf {

	public static void main(String[] args) {
		
		Shape sh = new Circle();
		
		if(sh instanceof Triangle) {
			System.out.println("Triangle");
		}else if(sh instanceof Circle) {
			System.out.println("Circle");
		}else {
			System.out.println("Square");
		}
		
	//	ArrayList<Shape> shapeList = new ArrayList<>();
		
		//ArrayList implemenets interface list. Eğer sol tafafa List yazarsak polymorphism olur
		List<Shape> shapeList = new ArrayList<>();
		
		shapeList.add(new Triangle());
		shapeList.add(new Circle());
	}
}
