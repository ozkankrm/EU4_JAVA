package javaeu4.day16_classObject;

public class Work {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.name = "Tuco";
		emp1.jobTitle = "Salesman";
		emp1.salary = 25_100;
		
		
		System.out.println("Name is " + emp1.name);
		System.out.println("Job title is "+ emp1.jobTitle);
		System.out.println("Salary is " + emp1.salary);
		
		
		emp1.introduce();
		emp1.attendMeeting();
		emp1.work();

	}

}
