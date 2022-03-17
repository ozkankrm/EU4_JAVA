package javaeu4.day38_inheritance_part2.overriding;

public class CompanyTest {

	public static void main(String[] args) {
 

		Employee emp = new Employee();
		FullTimeEmployee ft =  new FullTimeEmployee();
		Contractor ct = new Contractor(); 

		emp.calculatePay(40, 40);
		ft.calculatePay(40, 40);
		ct.calculatePay(40, 40);
	}

}
