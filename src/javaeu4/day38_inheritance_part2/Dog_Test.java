package javaeu4.day38_inheritance_part2;

public class Dog_Test {

	public static void main(String[] args) {


		Dog dog = new Dog("Yorkie", 1, 1, 8, 20, 2, 4, 1, 20, "Long Sily");

//		dog.eat();// eat() methodunu animal classtan inherit etti
		
		dog.chew();
		
		dog.move(10);
		
		System.out.println(dog.getName());
	}

}
