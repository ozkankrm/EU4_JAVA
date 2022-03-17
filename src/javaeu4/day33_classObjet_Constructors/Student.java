package javaeu4.day33_classObjet_Constructors;

public class Student {

	//instance variable
	String name;
	int age;
	char gender;
	int year;
	String course;
	String university; //= "cyberte"; burda atama yaparsak de�i�mez ve hepsinde ayn� olur.
	
	
	public Student(String name, int age, char gender, int year, String course, String university) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		this.university = university;
	}
	
	public void attendLecture() {
		System.out.println(name + " is attending lecture");
		
	}
	public void submitAssignment() {
		System.out.println(name + " is submitting assignment");
		
	}
	
	public void attendLab() {
		System.out.println(name + " is attending lab");
		
		
	}

	
	
}
