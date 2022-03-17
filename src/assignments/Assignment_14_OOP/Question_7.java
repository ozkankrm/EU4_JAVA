package assignments.Assignment_14_OOP;

public class Question_7 {

	public static void main(String[] args) {
		
		GasTank gasTank = new GasTank(50);
		
		gasTank.addGas(15);
		System.out.println(gasTank.amount);
		System.out.println(gasTank.isFull());
		
		gasTank.useGas(5);
		System.out.println(gasTank.amount);
		

	}

}

class GasTank{
	double amount = 0;
	double capacity;
	
	public GasTank(double capacity) {
		this.capacity = capacity;
	}
	
	public void addGas(double plus) {
		amount += plus;
		
		if(amount>capacity) {
			this.amount = capacity;
		}
	}
	public void useGas(double use) {
		amount -= use;
		
		if(amount<0) {
			this.amount = 0;
		}
	}
	public boolean isEmpty() {
		
		if(amount<0.1) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getGasLevel() {
		return amount;
	}
	
	public double fillUp() {

		double difference;
		difference = capacity - amount;
		amount = capacity;

		return difference;

	}
	
	public boolean isFull() {
		if (amount > (capacity - 0.1)) {
			return true;
		}else {
			return false;
		}
	}
	
}
