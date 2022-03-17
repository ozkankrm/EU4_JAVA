package javaeu4.day37_inheritance;

public class School {

	public static void main(String[] args) {


		Person person = new Person(); 
		Student student = new Student();
		
		person.name = 	"Mike";
		person.age = 35;
		person.gender = 'M';
		
		// name, age, gender come from Person class
		student.name = "Smith";
		student.age = 30;
		student.gender = 'M';
		
		student.studentID = 1000;
		
		// called method
		person.eat("Steak");
		
		// called eat method from Person class
		student.eat("Pizza");

	}

}
