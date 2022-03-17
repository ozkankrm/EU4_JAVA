package review.week12_inheritance;

public class Shape {
	/*
	 * Shape:
	variables:
			name,area, parameter
10
		methods:
			calculateArea(), calculatePerimeter(), toString()
	 */
	
	public String name;
	public double area, perimeter;
	
	
	
	public Shape(String name) {
		super();
		this.name = name;
		this.area = area;
		this.perimeter = perimeter;
	}

	public double calculateArea() {
		return 0;
	}
	
	public double calculatePerimeter() {
		return 0;
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + ", area=" + area + ", perimeter=" + perimeter + "]";
	}
	
	

}
