package javaeu4.day38_inheritance_part2;

public class SubClass1 extends SuperClass1{
	
	
	public SubClass1() {
		this(5);
		System.out.println("This is the subclass constructor");
	}
	
	public SubClass1(int a) {
		super();
		System.out.println(a);
		
	}
}
