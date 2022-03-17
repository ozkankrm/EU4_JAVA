package javaeu4.day33_classObjet_Constructors;

public class CarTest {

	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new Car();
		
		System.out.println(c1.make);
		System.out.println(c2.make);
		
		//1-new -invokes constructor
		//2- which constructor?
		//3- constructor with no parameter in Car class - default constructor
		
		Car c3 = new Car("Honda", "Civic", 2020, 500, "White");
		
		Car c4 = new Car("BMW", "320", 2017, 30000, "Red");
		
		
		

	}

}
