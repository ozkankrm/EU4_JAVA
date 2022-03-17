package javaeu4.day35_encapsulation;

public class Person_Test {

	public static void main(String[] args) {


		Person p1 = new Person();
		
//		System.out.println(p1.age);// default 0

		p1.setAge(-35);

		System.out.println(p1.getAge());
		
		System.out.println(p1.toString());

	}

}
