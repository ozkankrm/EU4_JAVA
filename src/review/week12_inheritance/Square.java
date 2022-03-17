package review.week12_inheritance;

public class Square extends Shape{
	public double side;
	

    public Square(double side) {
    	super("Square");
        this.side = side;
        name = "Square";
        area = calculateArea();
        perimeter =calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
	

}
