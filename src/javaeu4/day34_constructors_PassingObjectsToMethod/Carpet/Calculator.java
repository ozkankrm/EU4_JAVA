package javaeu4.day34_constructors_PassingObjectsToMethod.Carpet;



public class Calculator {
	
	Floor floor;
	Carpet carpet;

	
	public Calculator(Floor floor, Carpet carpet) {
		
		this.floor = floor;
		this.carpet = carpet;
	}
	
	public double getTotalCost() {
		return floor.getArea()*carpet.getCost();
	}

}
