package javaeu4.day34_constructors_PassingObjectsToMethod.Carpet;

public class FloorCarpetCalculator_Test {

	public static void main(String[] args) {
		
		Floor f1 = new Floor(12, 10); 
		Carpet c1 = new Carpet(8);
		
		
		Calculator cal = new Calculator(f1, c1);
		System.out.println(cal.getTotalCost());
	
		

	}

}
