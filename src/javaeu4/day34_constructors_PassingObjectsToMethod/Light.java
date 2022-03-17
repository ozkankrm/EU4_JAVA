package javaeu4.day34_constructors_PassingObjectsToMethod;

public class Light {
	
	int noOfWatts;
	boolean indicator;
	String location;
	
	public Light() {
		this(0, false); // this() --> calling constructor
 		System.out.println("Returning from no-argument constructor no.1");
	}
	
	public Light(int Watt, boolean ind) {
		this(Watt, ind, "X");
		System.out.println("Returning from constrctor no.2");
	}

	public Light(int noOfWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("Returning from constrctor no.3");
	}
	
	

}
