package javaeu4.day43_polymorphism;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		s1.draw();
		
		Shape s2 = new Circle();
		s2.draw();//circle da method override olmadığı için parent teki methodu çağırır
			      // check circle class eğer override varsa run et. yoksa parenttei methodu run et		
		
		Shape s3 = new Square();
		s3.draw();
	}

}
