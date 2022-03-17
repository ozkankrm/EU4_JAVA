package javaeu4.day44_oop_practice.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeActions {

	public static void main(String[] args) {

		Square mySquare = new Square();
		
		
		
		ShapeManager.drawSquare(mySquare);//static methodu class ismi le run ettik
						//drawSquare(mySquare);	//package ismini import etmen gerekiyor	
		
		
	//	ShapeManager.buildShape("square");//className.methodName
		
	//	drawSquare( (Square) buildShape("square"));
		
		Object rand = new Random();
		System.out.println(((Random) rand).nextInt(5));//casting yaptık
		
	//	rand.nextInt(5);//bu run etmez poly de rt access karar verir. önce Object (parent classa gider orda olmadığı çalıştırmaz
						//Random(child class) burdaki methodu run etmek için casttin yaparız
	
	
		List<Shape> myList = new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Triangle());
		myList.add(new Square());
		myList.add(new Shape());
		myList.add(new Triangle());
		
		ShapeManager.drawShape(myList);
		

	}

}
