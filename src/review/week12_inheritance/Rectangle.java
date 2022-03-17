package review.week12_inheritance;

public class Rectangle extends Shape{
	
	public double width, length;
	
	public Rectangle(double width, double length){
		super("rectangle");
        this.width = width;
        this.length = length;
        name = "Rectangle";
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

	@Override
    public double calculateArea(){
      return width * length ;
    }

    public double calculatePerimeter(){
        return 2* (width+length);
    }


	
	
}
