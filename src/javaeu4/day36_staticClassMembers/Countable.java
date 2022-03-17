package javaeu4.day36_staticClassMembers;

public class Countable {

	//instance variable
	static int instanceCount;

	public Countable() {
	
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
	
	
	
}
