package review.week11_constroctur_encapsulation_static;

public class Circle {
	
	public double radius, diameter, area, perimeter;
	public final double PI = Math.PI;
	
																																																										
	public Circle(double radius) {
		this.radius = radius;
		diameter = radius*2;
		area = calculateArea();
		perimeter =calculatePrimeter();
	}
	private double calculateArea() {
		
		return radius*radius*PI;
		
	}
	private double calculatePrimeter() {
		return diameter*PI;
	}


	public double getRadius() {
		return radius;
	}
	public double getDiameter() {
		return diameter;
	}
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public double getPI() {
		return PI;
	}
	
//	DecimalFormat df = new DecimalFormat("0.00");
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", PI=" + PI + ", diameter=" + diameter + ", area=" + area + ", perimeter="
				+ perimeter + "]";
	}

	
}
