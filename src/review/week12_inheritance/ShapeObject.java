package review.week12_inheritance;

public class ShapeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//w=10, l=20;
		
		Rectangle rectangle = new Rectangle(10, 20);
		
		System.out.println(rectangle);
		
		//square side=5
		Square square = new Square(5);
		
		System.out.println(square);
		System.out.println(square.toString());
		
		Circle circle = new Circle(3);
		
		System.out.println(circle);

	}

}
