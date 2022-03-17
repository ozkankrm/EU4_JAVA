package review.week12_inheritance;

public class Circle extends Shape{
	
	public double radius, diameter;
	public final static double PI;
	
	
	static {
		PI = Math.PI;
	}
	
	public Circle(double radius) {
		super("circle");
		this.radius = radius;
		diameter = 2*radius;
		area = calculateArea();
		perimeter = calculatePerimeter();
	}

	@Override
	public double calculateArea() {
		
		return radius*radius*PI;
	}

	@Override
	public double calculatePerimeter() {
		
		return diameter*radius;
	}

	
	

}
