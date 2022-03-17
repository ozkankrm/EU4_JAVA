package javaeu4.day33_classObjet_Constructors;

public class StudentTest {

	public static void main(String[] args) {
		/*
		 * Task
� For the following objects create Student class template.
� Write code for the Student class and another class to test it.
� This class has 6 properties: name,age,gender(M/F),year,course(JS,Java,TypeScript) and
university
Student Mike 17
M 2016 Java
Cybertek University
attendLecture
submitAssignment
attendLab
Smith 18
M 2015 JS
Cybertek University
attendLecture
submitAssignment
attendLab
Mary 19
F 2017 TS
Cybertek University
attendLecture
submitAssignment
attendLab
student1 student2 student3
		 */

		
		Student s1 = new Student("Mike", 17, 'M', 2017, "Java", "Cybertek"); 
		Student s2 = new Student("Smith", 25, 'M', 1999, "TS", "cybertek"); 
		s1.attendLecture();
		s2.attendLab();
		
	}

}
