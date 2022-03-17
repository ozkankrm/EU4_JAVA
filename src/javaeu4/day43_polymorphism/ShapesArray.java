package javaeu4.day43_polymorphism;

public class ShapesArray {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3];//holding 3 objects
		
		shapes[0] = new Shape();
		
		shapes[1] = new Triangle();//polymorphism
								 //shapes Shape class tan gelir ve Shape class-->parent, Triangle class--> child, bundan dolayı 
								//polymorphism oluyor
		
		shapes[2] = new Circle();
									
		for(Shape shape : shapes){
			
			System.out.println(shape.getClass());
		//	System.out.println(shape.getClass().getName());
		//	System.out.println(shape.getClass().getSimpleName());
			
			//shape.draw();// do you know which class running form
		}
	}

}
