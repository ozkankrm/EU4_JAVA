package javaeu4.day34_constructors_PassingObjectsToMethod.Quiz;

public class Point {
	
	int k, l;

	public Point(int x, int y) {
		
		k=x; l=y;
	}
	
	public Point() {
		this(10,10);
	}
	public int getX() {
		return k;
	}
	public int getY() {
		return l;
	}
}
