package javaeu4.day36_staticClassMembers;

public class Student_Test {

	public static void main(String[] args) {
		
		Student s1 = new Student("Mike", 30, 1000);
		Student s2 = new Student("ozzy", 24, 100);
		Student s3 = new Student("jamal", 20, 1100);
		
		s1.school = "EU4"; // in class
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		

	}

}
