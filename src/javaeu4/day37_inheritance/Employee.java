package javaeu4.day37_inheritance;

//Persn-->parent
//Employee--> child
// Employee class�n�n �n�ne-->entends Person yazd���m�zda
// Person class�ndaki fields ve methodlar� Employee classa 
//aktarm�� oluyor
public class Employee extends Person{
	
	String jobTitle;
	
	public void work() {
		System.out.println(name + " is working as " + jobTitle);
	}

	@Override
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	
	

}
