package review.week15_polymorphism;

public class PloyArray {
	public static void main(String[] args) {
		
		iPhone phone1 = new iPhone("11", 1999, 8.0);
		Samsung phone2 = new Samsung("note", 1500, 7.5);
		CyberPhone phone3 = new CyberPhone("Cyber", "CY", 500, 4.8);
		
		
		Phone[] phones = new Phone[3];
		
		phones[0] = phone1;
		phones[1] = phone2;
		phones[2] = phone3;
		
		for(Phone each : phones) {
			System.out.println(each.brand + " " + each.price);
		}
	}

}
