package javaeu4.day38_inheritance_part2;

public class Student extends Person {

	@Override
	public void messaage() {

		System.out.println("This is student class");
	}
	
	public void display() {
		messaage();
		super.messaage();// super.methodname ile parentteki methoda ula�t�k
	}
	
	

}
