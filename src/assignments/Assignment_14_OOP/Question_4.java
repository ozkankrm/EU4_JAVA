package assignments.Assignment_14_OOP;

public class Question_4 {

	public static void main(String[] args) {
		
		
		Person person1 = new Person();
		
		System.out.println(person1.getFirstName());
		System.out.println(person1.getLastName());
		System.out.println(person1.getAge());
		System.out.println(person1.toString());
		
		System.out.println("====================================");
		
		Person person = new Person("John", "Doe", 40);
		
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println(person.toString());

	}

}

class Person{
	private String firstName, lastName;
	private int age;
	
	public Person() {
		this.firstName = "undefied";
		this.lastName = "undefied";
		this.age = -1;
	}
	
	public String toString() {
		return firstName + " | " +  lastName + " | " +  age;
	}

	public String getFirstName() {
		return firstName;
	}

	
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
