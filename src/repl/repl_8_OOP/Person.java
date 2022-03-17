package repl.repl_8_OOP;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firtsName) {
		this.firstName = firtsName;
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
	
	public String toString() {
		return  firstName + " | "  + lastName  + " | " + age;
	}

	public Person() {
		this.firstName = "undefined";
		this.lastName = "undefined";
		this.age = -1;
		
	}

	public Person(String firtsName, String lastName, int age) {
	
		this.firstName = firtsName;
		this.lastName = lastName;
		this.age = age;
	}
	
}
