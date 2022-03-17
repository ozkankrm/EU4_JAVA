package javaeu4.day37_inheritance;

public class Company {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.name = "Tom";
		emp1.age = 25;
		emp1.gender = 'F';
		emp1.jobTitle = "SDET";
		
		emp1.work();
		
		emp1.sleep(10);
		
		//emp1 can have everything from Person class plus whatever inside the Employee class
		
		
		
		
		
		
		
	}

}
