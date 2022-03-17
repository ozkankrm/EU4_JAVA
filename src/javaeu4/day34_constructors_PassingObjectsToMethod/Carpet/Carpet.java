package javaeu4.day34_constructors_PassingObjectsToMethod.Carpet;

public class Carpet {

	
	double cost;
	
	public Carpet(double cost) {
		
		this.cost = cost;
		
		
		if(cost<0) {
			this.cost = 0;
		}
		
	}
	public double getCost() {
		return cost;
	}
}
